/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AGGREGATE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAGGREGATEType()
 * @model
 * @generated
 */
public interface AGGREGATEType extends GeneralizedType {
	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(SizeConstraint)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAGGREGATEType_UpperBound()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SizeConstraint getUpperBound();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(SizeConstraint value);

	/**
	 * Returns the value of the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Type</em>' reference.
	 * @see #setMemberType(ParameterType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAGGREGATEType_MemberType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterType getMemberType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getMemberType <em>Member Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Type</em>' reference.
	 * @see #getMemberType()
	 * @generated
	 */
	void setMemberType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getMatchingStructure <em>Matching Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(ActualStructureConstraint)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAGGREGATEType_Constraint()
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getMatchingStructure
	 * @model opposite="matchingStructure" ordered="false"
	 * @generated
	 */
	ActualStructureConstraint getConstraint();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(ActualStructureConstraint value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(SizeConstraint)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAGGREGATEType_LowerBound()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SizeConstraint getLowerBound();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(SizeConstraint value);

} // AGGREGATEType
