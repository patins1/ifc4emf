/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.LocalScope#getLocalElements <em>Local Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getLocalScope()
 * @model abstract="true"
 * @generated
 */
public interface LocalScope extends Scope {
	/**
	 * Returns the value of the '<em><b>Local Elements</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.LocalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Elements</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getLocalScope_LocalElements()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LocalElement> getLocalElements();

} // LocalScope
