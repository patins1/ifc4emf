/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InstantiableType#getFundamentalType <em>Fundamental Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInstantiableType()
 * @model abstract="true"
 * @generated
 */
public interface InstantiableType extends ParameterType, VariableType {
	/**
	 * Returns the value of the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fundamental Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fundamental Type</em>' reference.
	 * @see #setFundamentalType(InstantiableType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInstantiableType_FundamentalType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstantiableType getFundamentalType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.InstantiableType#getFundamentalType <em>Fundamental Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fundamental Type</em>' reference.
	 * @see #getFundamentalType()
	 * @generated
	 */
	void setFundamentalType(InstantiableType value);

} // InstantiableType
