/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.VariableType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.NamedVariable#getVariableType <em>Variable Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getNamedVariable()
 * @model abstract="true"
 * @generated
 */
public interface NamedVariable extends LocalElement {
	/**
	 * Returns the value of the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Type</em>' reference.
	 * @see #setVariableType(VariableType)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getNamedVariable_VariableType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VariableType getVariableType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.NamedVariable#getVariableType <em>Variable Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Type</em>' reference.
	 * @see #getVariableType()
	 * @generated
	 */
	void setVariableType(VariableType value);

} // NamedVariable
