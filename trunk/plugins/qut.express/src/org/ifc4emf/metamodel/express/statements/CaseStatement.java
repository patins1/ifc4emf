/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.CaseStatement#getCases <em>Cases</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.CaseStatement#getSelectionExpression <em>Selection Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getCaseStatement()
 * @model
 * @generated
 */
public interface CaseStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.statements.CaseAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getCaseStatement_Cases()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<CaseAction> getCases();

	/**
	 * Returns the value of the '<em><b>Selection Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Expression</em>' reference.
	 * @see #setSelectionExpression(Expression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getCaseStatement_SelectionExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getSelectionExpression();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.CaseStatement#getSelectionExpression <em>Selection Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Expression</em>' reference.
	 * @see #getSelectionExpression()
	 * @generated
	 */
	void setSelectionExpression(Expression value);

} // CaseStatement
