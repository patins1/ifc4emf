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
package org.ifc4emf.part21.parser;

public class ObjectReference {

	private int objectKey;
	
	public ObjectReference (int key) {
		super();
		this.objectKey = key;
	}
	
	public int getKey() {
		return objectKey;
	}
	
}