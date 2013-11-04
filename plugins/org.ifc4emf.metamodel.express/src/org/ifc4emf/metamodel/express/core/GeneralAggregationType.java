/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Aggregation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.GeneralAggregationType#getMemberType <em>Member Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getGeneralAggregationType()
 * @model abstract="true"
 * @generated
 */
public interface GeneralAggregationType extends GeneralizedType, AggregationType {
	/**
	 * Returns the value of the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Type</em>' reference.
	 * @see #setMemberType(GeneralizedType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getGeneralAggregationType_MemberType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GeneralizedType getMemberType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.GeneralAggregationType#getMemberType <em>Member Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Type</em>' reference.
	 * @see #getMemberType()
	 * @generated
	 */
	void setMemberType(GeneralizedType value);

} // GeneralAggregationType
