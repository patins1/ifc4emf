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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

class LinkageTuple {
	private int obj;
	private int featureId;
	private int id;

	public int getObj() {
		return obj;
	}

	public EReference getRef(EObject source) {
		return (EReference) source.eClass().getEStructuralFeature(featureId);
	}

	public int getId() {
		return id;
	}

	public LinkageTuple(EObject source, int obj, EReference ref, int id) {
		this.obj = obj;
		this.featureId = source.eClass().getFeatureID(ref);
		if (featureId < 0)
			throw new RuntimeException("Expected non-negative feature id");
		this.id = id;
	}

	public LinkageTuple(int objId, int featureId, int targetId) {
		this.obj = objId;
		this.featureId = featureId;
		this.id = targetId;
	}

	public int getFeatureId() {
		return featureId;
	}
}
