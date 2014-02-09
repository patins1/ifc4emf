/**
 * Copyright (c) 2010- 2011 QUT (Brisbane, Australia).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jim Steel - initial API and implementation
 *    Joerg Kiegeland - extension for database storage 
 */
package org.ifc4emf.part21.loader;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.ifc4emf.metamodel.modelblob.ContainmentTreeNode;
import org.ifc4emf.part21.Activator;

public class BinaryTreeBasedForwardReferenceHelper implements IForwardReferenceHelper {

	private static boolean STORE_FORWARD_REFERENCE_AT_TARGET = true;
	private final ContainmentTreeHelper containmentTreeHelper;
	private Set<EReference> directInstantiationReferences;

	private static Map<EPackage, Set<EReference>> DIRECT_INSTANTIATION_REFERENCES = new HashMap<EPackage, Set<EReference>>();

	public BinaryTreeBasedForwardReferenceHelper(ContainmentTreeHelper containmentTreeHelper, Part21LoadHelper helper) {
		this.containmentTreeHelper = containmentTreeHelper;
		EPackage pack = helper.getFactory().getEPackage();
		this.directInstantiationReferences = DIRECT_INSTANTIATION_REFERENCES.get(pack);
		if (directInstantiationReferences == null) {
			directInstantiationReferences = new HashSet<EReference>();
			int other = 0;
			Map<EClass, EClass> aSubclass = new HashMap<EClass, EClass>();
			EList<EClassifier> allClasses = pack.getEClassifiers();
			for (EClassifier cl : allClasses) {
				if (cl instanceof EClass) {
					EClass eClass = (EClass) cl;
					for (EClass superType : eClass.getESuperTypes()) {
						aSubclass.put(superType, eClass);
					}
				}
			}
			for (EClassifier cl : allClasses) {
				if (cl instanceof EClass) {
					EClass eClass = (EClass) cl;
					for (EReference ref : eClass.getEReferences()) {
						if (ref.isMany()) {
							EClassifier type = ref.getEType();
							if (aSubclass.get(type) != null) {
								other++;
								// Activator.err("Error, cannot manage forward references for "+ref.getName()+":"+type.getName()+","+aSubclass.get(type).getName());
							} else {
								directInstantiationReferences.add(ref);
								// Activator.log("Error, cannot manage forward references for "+ref.getName()+":"+type.getName());
							}
						}
					}
				}
			}
			Activator.log("Direct instantiation references: " + directInstantiationReferences.size() + " other: " + other);
		}
	}

	@Override
	public Collection<LinkageTuple> processedElement(EObject eObj, int objId) {
		if (!STORE_FORWARD_REFERENCE_AT_TARGET) {
			// resolving forward references happens at the end, so nothing to do right now
			return Collections.emptyList();
		}
		ContainmentTreeNode node = (ContainmentTreeNode) eObj.eContainer();
		Collection<LinkageTuple> result = new ArrayList<LinkageTuple>();
		decodeLinkageTuples(node, result);
		return result;
	}

	@Override
	public Iterator<LinkageTuple> linkObjects() {
		if (STORE_FORWARD_REFERENCE_AT_TARGET) {
			return Collections.<LinkageTuple> emptyList().iterator();
		}
		final TreeIterator<EObject> it = containmentTreeHelper.root.eAllContents();
		// use Queue instead of list, to preserver order of forward references in case of multivalued reference
		final Queue<LinkageTuple> tuples = new ArrayDeque<LinkageTuple>();
		decodeLinkageTuples(containmentTreeHelper.root, tuples); // model is not contained in eAllContents()
		return new Iterator<LinkageTuple>() {

			@Override
			public boolean hasNext() {
				while (tuples.isEmpty() && it.hasNext()) {
					EObject eobj = it.next();
					if (eobj instanceof ContainmentTreeNode) {
						ContainmentTreeNode containmentTreeNode = (ContainmentTreeNode) eobj;
						decodeLinkageTuples(containmentTreeNode, tuples);
					}
				}
				return !tuples.isEmpty();
			}

			@Override
			public LinkageTuple next() {
				return tuples.remove();
			}

			@Override
			public void remove() {
			}

		};

	}

	private void decodeLinkageTuples(ContainmentTreeNode node, Collection<LinkageTuple> tuples) {
		for (int i = 0; i < node.getForwardReferences().size(); i += 2) {
			int featureID = node.getForwardReferences().get(i);
			int targetId;
			int objId;
			if (STORE_FORWARD_REFERENCE_AT_TARGET) {
				objId = node.getForwardReferences().get(i + 1);
				targetId = containmentTreeHelper.get(node.getContent(), null);
			} else {
				objId = containmentTreeHelper.get(node.getContent(), null);
				targetId = node.getForwardReferences().get(i + 1);
			}
			tuples.add(new LinkageTuple(objId, featureID, targetId));
		}
		node.getForwardReferences().clear();
	}

	@Override
	public void add(EObject obj, LinkageTuple linkageTuple) {
		ContainmentTreeNode node;
		if (STORE_FORWARD_REFERENCE_AT_TARGET) {
			node = containmentTreeHelper.addNode(linkageTuple.getId());
		} else {
			if (obj != null) {
				node = (ContainmentTreeNode) obj.eContainer();
			} else {
				node = containmentTreeHelper.addNode(linkageTuple.getObj());
			}
		}
		node.getForwardReferences().add(linkageTuple.getFeatureId());
		node.getForwardReferences().add(STORE_FORWARD_REFERENCE_AT_TARGET ? linkageTuple.getObj() : linkageTuple.getId());
	}

	public void recordForOrdering(EObject obj, EReference ref, Collection<Integer> targets) {
		if (directInstantiate(ref))
			return;
		ContainmentTreeNode node = (ContainmentTreeNode) obj.eContainer();
		int featureId = obj.eClass().getFeatureID(ref);
		node.getOrderings().add(-featureId);
		node.getOrderings().addAll(targets);
	}

	@Override
	public void orderReferences(EObject eobj, EReference ref) {
		if (directInstantiate(ref))
			return;
		EList<EObject> list = (EList<EObject>) eobj.eGet(ref);
		ContainmentTreeNode node = (ContainmentTreeNode) eobj.eContainer();
		int featureId = eobj.eClass().getFeatureID(ref);
		int i = getOrderingStartFor(node, featureId);
		if (i == -1)
			return;
		int stop = getOrderingStopFor(node, i);
		if (stop - i != list.size())
			return;
		for (int k = i; k < stop; k++) {
			EObject target = containmentTreeHelper.get(node.getOrderings().get(k));
			list.move(k - i, target);
		}
		for (int k = i; k < stop; k++) {
			node.getOrderings().remove(i);
		}
	}

	private int getOrderingStartFor(ContainmentTreeNode node, int featureId) {
		for (int i = 0; i < node.getOrderings().size(); i++) {
			if (node.getOrderings().get(i) == -featureId) {
				return i + 1;
			}
		}
		return -1;
	}

	private int getOrderingStopFor(ContainmentTreeNode node, int i) {
		for (int j = i; j < node.getOrderings().size(); j++) {
			if (node.getOrderings().get(i) <= 0) {
				return i;
			}
		}
		return node.getOrderings().size();
	}

	@Override
	public boolean directInstantiate(EReference ref) {
		return directInstantiationReferences.contains(ref);
	}

}
