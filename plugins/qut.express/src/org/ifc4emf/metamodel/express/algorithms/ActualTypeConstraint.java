/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.GenericType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Type Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getMatchingType <em>Matching Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getRequiredType <em>Required Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualTypeConstraint()
 * @model
 * @generated
 */
public interface ActualTypeConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Matching Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.GenericType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Type</em>' reference.
	 * @see #setMatchingType(GenericType)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualTypeConstraint_MatchingType()
	 * @see org.ifc4emf.metamodel.express.core.GenericType#getConstraint
	 * @model opposite="constraint" required="true" ordered="false"
	 * @generated
	 */
	GenericType getMatchingType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getMatchingType <em>Matching Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Type</em>' reference.
	 * @see #getMatchingType()
	 * @generated
	 */
	void setMatchingType(GenericType value);

	/**
	 * Returns the value of the '<em><b>Required Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Type</em>' reference.
	 * @see #setRequiredType(ActualDataType)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualTypeConstraint_RequiredType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActualDataType getRequiredType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getRequiredType <em>Required Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Type</em>' reference.
	 * @see #getRequiredType()
	 * @generated
	 */
	void setRequiredType(ActualDataType value);

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
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualTypeConstraint_Label()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // ActualTypeConstraint
