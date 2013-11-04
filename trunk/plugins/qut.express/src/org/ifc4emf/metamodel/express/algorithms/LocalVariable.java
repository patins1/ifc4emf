/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.LocalVariable#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getLocalVariable()
 * @model
 * @generated
 */
public interface LocalVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' reference.
	 * @see #setInitialValue(Expression)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getLocalVariable_InitialValue()
	 * @model ordered="false"
	 * @generated
	 */
	Expression getInitialValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.LocalVariable#getInitialValue <em>Initial Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Expression value);

} // LocalVariable
