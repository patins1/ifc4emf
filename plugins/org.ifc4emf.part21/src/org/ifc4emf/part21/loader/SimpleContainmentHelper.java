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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.ifcheader.Model;

/**
 * Implements {@link IContainmentHelper} using RAM storage
 */
public class SimpleContainmentHelper implements IContainmentHelper {

	/**
	 * Used for parsing the IFC model
	 */
	private Map<Integer, EObject> lookupTable = new HashMap<Integer, EObject>();

	/**
	 * Used for printing the IFC model
	 */
	private Map<EObject, Integer> invLookupTable = new HashMap<EObject, Integer>();

	private final Model model;

	public SimpleContainmentHelper(Model model) {
		this.model = model;
	}

	@Override
	public EObject add(int id, EObject simpleObj) {
		if (lookupTable.get(id) != null)
			return lookupTable.get(id);
		model.getContents().add(simpleObj);
		lookupTable.put(id, simpleObj);
		return simpleObj;
	}

	@Override
	public EObject get(int id) {
		return lookupTable.get(id);
	}

	@Override
	public int get(EObject eObj, Part21LoadHelper helper) {
		if (invLookupTable.isEmpty()) {
			int idCounter = 1;
			Iterator<EObject> iter = model.eAllContents();
			while (iter.hasNext()) {
				EObject eobj = iter.next();
				EClass eCls = eobj.eClass();
				try {
					EObject expressType = helper.getExpressTypeForEClassifier(eCls);
					if ((null != expressType) && (expressType instanceof EntityType)) {
						invLookupTable.put(eobj, idCounter);
						idCounter++;
					}
				} catch (NoSuchClassException e) {
					// Do nothing
				}
			}
		}
		Integer result = invLookupTable.get(eObj);
		if (result != null)
			return result;
		int idCounter = invLookupTable.size() + 1;
		invLookupTable.put(eObj, idCounter);
		return idCounter;
	}

	@Override
	public Iterator<EObject> getIterator() {
		return model.eContents().iterator();
	}

	@Override
	public Iterator<EObject> getIterator(EObject ifcObject) {
		int i = model.eContents().indexOf(ifcObject);
		return model.eContents().subList(i, model.eContents().size()).iterator();
	}

	@Override
	public boolean preserveOriginalOrder() {
		return true;
	}

	@Override
	public boolean preserveOriginalNumbers() {
		return false;
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
