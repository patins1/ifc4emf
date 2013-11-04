/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialized Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SpecializedType#getUnderlyingType <em>Underlying Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSpecializedType()
 * @model
 * @generated
 */
public interface SpecializedType extends DefinedType {
	/**
	 * Returns the value of the '<em><b>Underlying Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underlying Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underlying Type</em>' reference.
	 * @see #setUnderlyingType(ConcreteType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSpecializedType_UnderlyingType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConcreteType getUnderlyingType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.SpecializedType#getUnderlyingType <em>Underlying Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underlying Type</em>' reference.
	 * @see #getUnderlyingType()
	 * @generated
	 */
	void setUnderlyingType(ConcreteType value);

} // SpecializedType
