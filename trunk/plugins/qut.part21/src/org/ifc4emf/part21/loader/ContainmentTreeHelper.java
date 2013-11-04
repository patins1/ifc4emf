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

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.metamodel.modelblob.BinaryTreeRoot;
import org.ifc4emf.metamodel.modelblob.ContainmentTreeNode;
import org.ifc4emf.metamodel.modelblob.ModelblobFactory;
import org.ifc4emf.metamodel.modelblob.ModelblobPackage;

/**
 * Implements {@link IContainmentHelper} by storing the index-object-map in the model itself.
 */
public class ContainmentTreeHelper implements IContainmentHelper {

	private static final boolean USE_DEVIDE_AND_CONQUER = true;

	private static final boolean USE_BUBBLE_UP_ZERO_PATH = !USE_DEVIDE_AND_CONQUER;

	private static final int STOP_VALUE = USE_DEVIDE_AND_CONQUER ? 1 : USE_BUBBLE_UP_ZERO_PATH ? 0 : -1 /* not defined */;

	protected final BinaryTreeRoot root;

	public ContainmentTreeHelper(BinaryTreeRoot root) {
		this.root = root;
	}

	protected ContainmentTreeNode addNode(int id) {
		ContainmentTreeNode currentBranch = root;
		while (id != STOP_VALUE) {
			int branch = id % 2;
			if (branch == 1) {
				ContainmentTreeNode nextBranch = currentBranch.getBranch1();
				if (nextBranch == null) {
					nextBranch = ModelblobFactory.eINSTANCE.createContainmentTreeNode();
					currentBranch.setBranch1(nextBranch);
				}
				currentBranch = nextBranch;
			} else {
				ContainmentTreeNode nextBranch = currentBranch.getBranch0();
				if (nextBranch == null) {
					nextBranch = ModelblobFactory.eINSTANCE.createContainmentTreeNode();
					currentBranch.setBranch0(nextBranch);
				}
				currentBranch = nextBranch;
			}
			id = id / 2;
		}
		return currentBranch;
	}

	public EObject add(int id, EObject simpleObj) {
		ContainmentTreeNode node = addNode(id);
		if (node.getContent() != null)
			return node.getContent();
		node.setContent(simpleObj);
		return simpleObj;
	}

	public EObject get(int id) {
		ContainmentTreeNode currentBranch = root;
		while (id != STOP_VALUE) {
			int branch = id % 2;
			if (branch == 1) {
				ContainmentTreeNode nextBranch = currentBranch.getBranch1();
				if (nextBranch == null) {
					return null;
				}
				currentBranch = nextBranch;
			} else {
				ContainmentTreeNode nextBranch = currentBranch.getBranch0();
				if (nextBranch == null) {
					return null;
				}
				currentBranch = nextBranch;
			}
			id = id / 2;
		}
		return currentBranch.getContent();
	}

	@Override
	public int get(EObject eObj, Part21LoadHelper helper) {
		ContainmentTreeNode parent = (ContainmentTreeNode) eObj.eContainer();
		return get(parent);
	}

	public int get(ContainmentTreeNode parent) {
		int id = STOP_VALUE;
		while (!(parent instanceof Model)) {
			id *= 2;
			if (parent.eContainingFeature() == ModelblobPackage.eINSTANCE.getContainmentTreeNode_Branch1())
				id++;
			parent = (ContainmentTreeNode) parent.eContainer();
		}
		return id;
	}

	@Override
	public Iterator<EObject> getIterator() {
		return new AbstractTreeIterator<EObject>(root, false) {
			private static final long serialVersionUID = 1L;

			@Override
			public Iterator<EObject> getChildren(Object object) {
				if (object instanceof ContainmentTreeNode) {
					return ((EObject) object).eContents().iterator();
				}
				return Collections.<EObject> emptyList().iterator();
			}
		};
	}

	@Override
	public Iterator<EObject> getIterator(final EObject ele) {
		return new AbstractTreeIterator<EObject>(root, false) {
			private static final long serialVersionUID = 1L;
			boolean objectWasReached = false;

			@Override
			public Iterator<EObject> getChildren(Object object) {
				if (object instanceof ContainmentTreeNode) {
					ContainmentTreeNode containmentTreeNode = (ContainmentTreeNode) object;
					if (objectWasReached) {
						return containmentTreeNode.eContents().iterator();
					}
					if (containmentTreeNode.getContent() == ele) {
						objectWasReached = true;
						if (containmentTreeNode.getBranch1() != null)
							return Arrays.asList(ele, containmentTreeNode.getBranch1()).iterator();
						return Arrays.asList(ele).iterator();
					}
					if (EcoreUtil.isAncestor(containmentTreeNode.getBranch0(), ele)) {
						return containmentTreeNode.eContents().iterator();
					}
					if (EcoreUtil.isAncestor(containmentTreeNode.getBranch1(), ele)) {
						return Arrays.asList((EObject) containmentTreeNode.getBranch1()).iterator();
					}
					throw new RuntimeException("programming error: element must be contained in one of the branches");
				}
				return Collections.<EObject> emptyList().iterator();
			}
		};
	}

	@Override
	public boolean preserveOriginalOrder() {
		return false;
	}

	@Override
	public boolean preserveOriginalNumbers() {
		return true;
	}

	@Override
	public boolean orderedByNumber() {
		return false;
	}

	@Override
	public int getAvailableId() {
		while (true) {
			int result = new Random().nextInt();
			if (get(result) == null)
				return result;
		}
	}

}
