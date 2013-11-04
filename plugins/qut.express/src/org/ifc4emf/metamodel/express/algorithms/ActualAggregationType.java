/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.ifc4emf.metamodel.express.core.ActualType;
import org.ifc4emf.metamodel.express.core.AggregationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Aggregation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualAggregationType#getMemberType <em>Member Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualAggregationType()
 * @model abstract="true"
 * @generated
 */
public interface ActualAggregationType extends ActualType, AggregationType {
	/**
	 * Returns the value of the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Type</em>' reference.
	 * @see #setMemberType(ActualType)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualAggregationType_MemberType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActualType getMemberType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualAggregationType#getMemberType <em>Member Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Type</em>' reference.
	 * @see #getMemberType()
	 * @generated
	 */
	void setMemberType(ActualType value);

} // ActualAggregationType
