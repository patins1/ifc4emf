/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.ifc4emf.metamodel.express.algorithms.NamedVariable;
import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.ControlVariable#getBoundValue <em>Bound Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.ControlVariable#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.ControlVariable#getIncrement <em>Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getControlVariable()
 * @model
 * @generated
 */
public interface ControlVariable extends NamedVariable {
	/**
	 * Returns the value of the '<em><b>Bound Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Value</em>' reference.
	 * @see #setBoundValue(Expression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getControlVariable_BoundValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getBoundValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.ControlVariable#getBoundValue <em>Bound Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Value</em>' reference.
	 * @see #getBoundValue()
	 * @generated
	 */
	void setBoundValue(Expression value);

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
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getControlVariable_InitialValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getInitialValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.ControlVariable#getInitialValue <em>Initial Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' reference.
	 * @see #setIncrement(Expression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getControlVariable_Increment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getIncrement();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.ControlVariable#getIncrement <em>Increment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(Expression value);

} // ControlVariable
