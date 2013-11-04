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

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface to manage the index-object mapping in a model
 */
public interface IContainmentHelper {

	/**
	 * Adds the given IFC object having the given ID to the model
	 * 
	 * @param model
	 * @param id
	 * @param ifcObject
	 * @return already existing element with the given id, or the passed element if not already existing
	 */
	EObject add(int id, EObject ifcObject);

	/**
	 * @return get a not-yet-assigned part21 ID
	 */
	int getAvailableId();

	/**
	 * @param model
	 * @param id
	 * @return the IFC object with the given id, or <code>null</code> if no such one can be found
	 */
	EObject get(int id);

	/**
	 * @param model
	 * @param ifcObject
	 * @param helper
	 * @return the id of the given IFC object
	 */
	int get(EObject ifcObject, Part21LoadHelper helper);

	/**
	 * @param model
	 * @return iterator over all indexed elements (and over tree nodes except the root)
	 */
	Iterator<EObject> getIterator();

	/**
	 * Like getIterator() but skips all elements until the given element
	 * 
	 * @param model
	 * @return iterator over all indexed elements with an index greater than that one passed
	 */
	Iterator<EObject> getIterator(EObject ifcObject);

	/**
	 * @return <code>true</code> if the original order of IFC entity instances is preserved
	 */
	boolean preserveOriginalOrder();

	/**
	 * @return <code>true</code> if the original order of IFC entity instances is preserved
	 */
	boolean preserveOriginalNumbers();

	/**
	 * @return <code>true</code> if the IFC entity instances are ordered by number
	 */
	boolean orderedByNumber();

}
