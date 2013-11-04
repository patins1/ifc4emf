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

import org.ifc4emf.part21.parser.Node;

/**
 * Implementors can consume a given node directly after it is parsed, so that the node can be removed from the parsing tree.
 * 
 */
public interface ImmediateConsumer {

	/**
	 * @param node
	 * @return whether the implementor can consume the node in such a way that it can be removed when this invocation returns
	 */
	boolean consume(Node node);

}
