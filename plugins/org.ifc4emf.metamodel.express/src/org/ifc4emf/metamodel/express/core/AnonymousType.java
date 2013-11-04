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
 * A representation of the model object '<em><b>Anonymous Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.AnonymousType#getSpecializes <em>Specializes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAnonymousType()
 * @model abstract="true"
 * @generated
 */
public interface AnonymousType extends ConcreteType, InstantiableType {
	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.AnonymousType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specializes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAnonymousType_Specializes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AnonymousType> getSpecializes();

} // AnonymousType
