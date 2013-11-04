/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Aggregation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.ConcreteAggregationType#getMemberType <em>Member Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getConcreteAggregationType()
 * @model abstract="true"
 * @generated
 */
public interface ConcreteAggregationType extends AnonymousType, AggregationType {
	/**
	 * Returns the value of the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Type</em>' reference.
	 * @see #setMemberType(InstantiableType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getConcreteAggregationType_MemberType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstantiableType getMemberType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.ConcreteAggregationType#getMemberType <em>Member Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Type</em>' reference.
	 * @see #getMemberType()
	 * @generated
	 */
	void setMemberType(InstantiableType value);

} // ConcreteAggregationType
