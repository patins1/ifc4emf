/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.LocalScope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.QueryExpression#getSelectCondition <em>Select Condition</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.QueryExpression#getQueryVariable <em>Query Variable</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.QueryExpression#getAggregateOperand <em>Aggregate Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getQueryExpression()
 * @model
 * @generated
 */
public interface QueryExpression extends LocalScope, Expression {
	/**
	 * Returns the value of the '<em><b>Select Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Condition</em>' containment reference.
	 * @see #setSelectCondition(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getQueryExpression_SelectCondition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getSelectCondition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.QueryExpression#getSelectCondition <em>Select Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Condition</em>' containment reference.
	 * @see #getSelectCondition()
	 * @generated
	 */
	void setSelectCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Query Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Variable</em>' reference.
	 * @see #setQueryVariable(QueryVariable)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getQueryExpression_QueryVariable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	QueryVariable getQueryVariable();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.QueryExpression#getQueryVariable <em>Query Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Variable</em>' reference.
	 * @see #getQueryVariable()
	 * @generated
	 */
	void setQueryVariable(QueryVariable value);

	/**
	 * Returns the value of the '<em><b>Aggregate Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Operand</em>' reference.
	 * @see #setAggregateOperand(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getQueryExpression_AggregateOperand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getAggregateOperand();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.QueryExpression#getAggregateOperand <em>Aggregate Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Operand</em>' reference.
	 * @see #getAggregateOperand()
	 * @generated
	 */
	void setAggregateOperand(Expression value);

} // QueryExpression
