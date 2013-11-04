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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * Implements {@link IForwardReferenceHelper} using RAM storage
 */
public class SimpleForwardReferenceHelper implements IForwardReferenceHelper {

	protected SortedMap<Integer, Collection<LinkageTuple>> linkagePhase = new TreeMap<Integer, Collection<LinkageTuple>>();

	@Override
	public Collection<LinkageTuple> processedElement(EObject eObj, int objId) {
		// if (!linkagePhase.isEmpty() && !linkagePhase.firstKey().equals(objId)) {
		// throw new RuntimeException(linkagePhase.firstKey()+"!="+objId);
		// }
		return linkagePhase.remove(objId);
	}

	@Override
	public Iterator<LinkageTuple> linkObjects() {
		for (Integer objId : linkagePhase.keySet()) {
			throw new RuntimeException("Forward reference never resolved to #" + objId);
		}
		return Collections.<LinkageTuple> emptyList().iterator();
	}

	@Override
	public void add(EObject obj, LinkageTuple linkageTuple) {
		Collection<LinkageTuple> unresolved = linkagePhase.get(linkageTuple.getId());
		if (unresolved == null) {
			unresolved = new ArrayList<LinkageTuple>(1);
			linkagePhase.put(linkageTuple.getId(), unresolved);
		}
		unresolved.add(linkageTuple);
	}

	@Override
	public void orderReferences(EObject eobj, EReference ref) {
		// not implemented
	}

	@Override
	public void recordForOrdering(EObject obj, EReference ref, Collection<Integer> targets) {
		// not implemented
	}

	@Override
	public boolean directInstantiate(EReference ref) {
		return false;
	}

}
