/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.ifc4emf.metamodel.express.core.ActualType;
import org.ifc4emf.metamodel.express.core.SizeConstraint;
import org.ifc4emf.metamodel.express.core.VariableType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual AGGREGATE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualAGGREGATEType()
 * @model
 * @generated
 */
public interface ActualAGGREGATEType extends ActualType {
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
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualAGGREGATEType_UpperBound()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SizeConstraint getUpperBound();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(SizeConstraint value);

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(ActualStructure)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualAGGREGATEType_RefersTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActualStructure getRefersTo();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(ActualStructure value);

	/**
	 * Returns the value of the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Type</em>' reference.
	 * @see #setMemberType(VariableType)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualAGGREGATEType_MemberType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VariableType getMemberType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getMemberType <em>Member Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Type</em>' reference.
	 * @see #getMemberType()
	 * @generated
	 */
	void setMemberType(VariableType value);

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
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualAGGREGATEType_LowerBound()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SizeConstraint getLowerBound();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(SizeConstraint value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualAGGREGATEType_Label()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // ActualAGGREGATEType
