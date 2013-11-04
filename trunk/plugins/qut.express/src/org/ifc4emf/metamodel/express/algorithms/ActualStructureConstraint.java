/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.AGGREGATEType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Structure Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getMatchingStructure <em>Matching Structure</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getRequiredStructure <em>Required Structure</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualStructureConstraint()
 * @model
 * @generated
 */
public interface ActualStructureConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Matching Structure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Structure</em>' reference.
	 * @see #setMatchingStructure(AGGREGATEType)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualStructureConstraint_MatchingStructure()
	 * @see org.ifc4emf.metamodel.express.core.AGGREGATEType#getConstraint
	 * @model opposite="constraint" required="true" ordered="false"
	 * @generated
	 */
	AGGREGATEType getMatchingStructure();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getMatchingStructure <em>Matching Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Structure</em>' reference.
	 * @see #getMatchingStructure()
	 * @generated
	 */
	void setMatchingStructure(AGGREGATEType value);

	/**
	 * Returns the value of the '<em><b>Required Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Structure</em>' reference.
	 * @see #setRequiredStructure(ActualStructure)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualStructureConstraint_RequiredStructure()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActualStructure getRequiredStructure();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getRequiredStructure <em>Required Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Structure</em>' reference.
	 * @see #getRequiredStructure()
	 * @generated
	 */
	void setRequiredStructure(ActualStructure value);

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
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualStructureConstraint_Label()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // ActualStructureConstraint
