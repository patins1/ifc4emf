/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.LocalScope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getWhileExpression <em>While Expression</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getBody <em>Body</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getControlVariable <em>Control Variable</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getUntilExpression <em>Until Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getRepeatStatement()
 * @model
 * @generated
 */
public interface RepeatStatement extends Statement, LocalScope {
	/**
	 * Returns the value of the '<em><b>While Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Expression</em>' reference.
	 * @see #setWhileExpression(Expression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getRepeatStatement_WhileExpression()
	 * @model ordered="false"
	 * @generated
	 */
	Expression getWhileExpression();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getWhileExpression <em>While Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Expression</em>' reference.
	 * @see #getWhileExpression()
	 * @generated
	 */
	void setWhileExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getControlledBy <em>Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Statement)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getRepeatStatement_Body()
	 * @see org.ifc4emf.metamodel.express.algorithms.Statement#getControlledBy
	 * @model opposite="controlledBy" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Statement getBody();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Statement value);

	/**
	 * Returns the value of the '<em><b>Control Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Variable</em>' containment reference.
	 * @see #setControlVariable(ControlVariable)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getRepeatStatement_ControlVariable()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ControlVariable getControlVariable();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getControlVariable <em>Control Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Variable</em>' containment reference.
	 * @see #getControlVariable()
	 * @generated
	 */
	void setControlVariable(ControlVariable value);

	/**
	 * Returns the value of the '<em><b>Until Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Expression</em>' reference.
	 * @see #setUntilExpression(Expression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getRepeatStatement_UntilExpression()
	 * @model ordered="false"
	 * @generated
	 */
	Expression getUntilExpression();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getUntilExpression <em>Until Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Expression</em>' reference.
	 * @see #getUntilExpression()
	 * @generated
	 */
	void setUntilExpression(Expression value);

} // RepeatStatement
