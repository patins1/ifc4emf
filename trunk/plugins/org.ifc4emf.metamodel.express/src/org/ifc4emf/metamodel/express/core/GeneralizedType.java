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
 * A representation of the model object '<em><b>Generalized Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.GeneralizedType#getOccursIn <em>Occurs In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getGeneralizedType()
 * @model abstract="true"
 * @generated
 */
public interface GeneralizedType extends ParameterType, AttributeType {
	/**
	 * Returns the value of the '<em><b>Occurs In</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.ParameterType}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.ParameterType#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurs In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurs In</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getGeneralizedType_OccursIn()
	 * @see org.ifc4emf.metamodel.express.core.ParameterType#getContains
	 * @model opposite="contains" required="true" ordered="false"
	 * @generated
	 */
	EList<ParameterType> getOccursIn();

} // GeneralizedType
