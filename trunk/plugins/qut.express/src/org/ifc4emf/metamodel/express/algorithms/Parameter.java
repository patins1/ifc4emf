/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.ParameterType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getStructureConstraints <em>Structure Constraints</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getTypeConstraints <em>Type Constraints</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getFormalParameterType <em>Formal Parameter Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getInout <em>Inout</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getParameter()
 * @model abstract="true"
 * @generated
 */
public interface Parameter extends LocalElement {
	/**
	 * Returns the value of the '<em><b>Structure Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Constraints</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getParameter_StructureConstraints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ActualStructureConstraint> getStructureConstraints();

	/**
	 * Returns the value of the '<em><b>Type Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Constraints</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getParameter_TypeConstraints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ActualTypeConstraint> getTypeConstraints();

	/**
	 * Returns the value of the '<em><b>Formal Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameter Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameter Type</em>' reference.
	 * @see #setFormalParameterType(ParameterType)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getParameter_FormalParameterType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterType getFormalParameterType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getFormalParameterType <em>Formal Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Parameter Type</em>' reference.
	 * @see #getFormalParameterType()
	 * @generated
	 */
	void setFormalParameterType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Inout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inout</em>' attribute.
	 * @see #setInout(Boolean)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getParameter_Inout()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getInout();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getInout <em>Inout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inout</em>' attribute.
	 * @see #getInout()
	 * @generated
	 */
	void setInout(Boolean value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(Integer)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getParameter_Position()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getPosition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Integer value);

} // Parameter
