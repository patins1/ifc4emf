/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.IfStatement#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.IfStatement#getElseActions <em>Else Actions</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.IfStatement#getThenActions <em>Then Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Condition</em>' containment reference.
	 * @see #setIfCondition(Expression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getIfStatement_IfCondition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getIfCondition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.IfStatement#getIfCondition <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition</em>' containment reference.
	 * @see #getIfCondition()
	 * @generated
	 */
	void setIfCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Else Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Actions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Actions</em>' containment reference.
	 * @see #setElseActions(Statement)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getIfStatement_ElseActions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Statement getElseActions();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.IfStatement#getElseActions <em>Else Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Actions</em>' containment reference.
	 * @see #getElseActions()
	 * @generated
	 */
	void setElseActions(Statement value);

	/**
	 * Returns the value of the '<em><b>Then Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Actions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Actions</em>' containment reference.
	 * @see #setThenActions(Statement)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getIfStatement_ThenActions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Statement getThenActions();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.IfStatement#getThenActions <em>Then Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Actions</em>' containment reference.
	 * @see #getThenActions()
	 * @generated
	 */
	void setThenActions(Statement value);

} // IfStatement
