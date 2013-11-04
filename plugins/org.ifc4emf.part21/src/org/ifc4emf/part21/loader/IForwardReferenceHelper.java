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
import org.eclipse.emf.ecore.EReference;

/**
 * An interface to manage forward references while deserializing a model.
 */
public interface IForwardReferenceHelper {

	/**
	 * Called when the element with the given ID is parsed
	 * 
	 * @param objId
	 * @return instances of {@link LinkageTuple} which can be resolved now because this element is parsed; may return <code>null</code> instead of empty collection
	 */
	Collection<LinkageTuple> processedElement(EObject eObj, int objId);

	/**
	 * Called when the IFC file has finished parsing
	 * 
	 * @return an iterator over the remaining {@link LinkageTuple} which can be resolved by the caller
	 */
	Iterator<LinkageTuple> linkObjects();

	/**
	 * Adds a forward reference
	 * 
	 * @param obj
	 *            if not <code>null</code>, the source object of the forward reference
	 * @param linkageTuple
	 */
	void add(EObject obj, LinkageTuple linkageTuple);

	/**
	 * Order the references of the given object
	 * 
	 * @param eobj
	 * @param ref
	 */
	void orderReferences(EObject eobj, EReference ref);

	/**
	 * Records the order of referenced objects for the given object/reference by id
	 * 
	 * @param obj
	 * @param ref
	 * @param targets
	 */
	public void recordForOrdering(EObject obj, EReference ref, Collection<Integer> targets);

	/**
	 * @param ref
	 * @return whether the target type shall be directly created to satisfy the given forward reference
	 */
	boolean directInstantiate(EReference ref);

}
