/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.ParameterType#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getParameterType()
 * @model abstract="true"
 * @generated
 */
public interface ParameterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.GeneralizedType}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.GeneralizedType#getOccursIn <em>Occurs In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getParameterType_Contains()
	 * @see org.ifc4emf.metamodel.express.core.GeneralizedType#getOccursIn
	 * @model opposite="occursIn" ordered="false"
	 * @generated
	 */
	EList<GeneralizedType> getContains();

} // ParameterType
