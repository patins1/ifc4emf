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

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

/**
 * Implements {@link IForwardReferenceHelper} by holding maximal {@link #BOUND} elements in {@link SimpleForwardReferenceHelper}, and the rest in another {@link IForwardReferenceHelper}. Should not be used if model upload shall be resumable, since the cache is not persisted!
 */
public class ComposedForwardReferenceHelper extends SimpleForwardReferenceHelper {

	private final int BOUND = 1000;

	private final IForwardReferenceHelper evictionHelper;

	public ComposedForwardReferenceHelper(IForwardReferenceHelper evictionHelper) {
		this.evictionHelper = evictionHelper;
	}

	@Override
	public Collection<LinkageTuple> processedElement(EObject eObj, int objId) {
		Collection<LinkageTuple> result = super.processedElement(eObj, objId);
		if (result != null) {
			return result;
		}
		return evictionHelper.processedElement(eObj, objId);
	}

	@Override
	public Iterator<LinkageTuple> linkObjects() {
		return evictionHelper.linkObjects();
	}

	@Override
	public void add(EObject obj, LinkageTuple linkageTuple) {
		super.add(obj, linkageTuple);
		while (linkagePhase.size() > BOUND) {
			int id = linkagePhase.lastKey();
			Collection<LinkageTuple> toBeEvicted = linkagePhase.remove(id);
			for (LinkageTuple evictedTuple : toBeEvicted) {
				evictionHelper.add(null, evictedTuple);
			}
		}
	}
}
