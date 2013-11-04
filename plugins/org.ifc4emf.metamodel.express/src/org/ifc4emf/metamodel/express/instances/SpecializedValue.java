/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialized Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.SpecializedValue#getFundamentalValue <em>Fundamental Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSpecializedValue()
 * @model
 * @generated
 */
public interface SpecializedValue extends TypedInstance {
	/**
	 * Returns the value of the '<em><b>Fundamental Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fundamental Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fundamental Value</em>' reference.
	 * @see #setFundamentalValue(ConcreteValue)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSpecializedValue_FundamentalValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConcreteValue getFundamentalValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.SpecializedValue#getFundamentalValue <em>Fundamental Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fundamental Value</em>' reference.
	 * @see #getFundamentalValue()
	 * @generated
	 */
	void setFundamentalValue(ConcreteValue value);

} // SpecializedValue
