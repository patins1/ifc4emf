/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.UnaryOperation#getUnaryOperand <em>Unary Operand</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.UnaryOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getUnaryOperation()
 * @model
 * @generated
 */
public interface UnaryOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Unary Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unary Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Operand</em>' reference.
	 * @see #setUnaryOperand(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getUnaryOperation_UnaryOperand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getUnaryOperand();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.UnaryOperation#getUnaryOperand <em>Unary Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Operand</em>' reference.
	 * @see #getUnaryOperand()
	 * @generated
	 */
	void setUnaryOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getUnaryOperation_Operator()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.expressions.UnaryOperator" required="true" ordered="false"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.UnaryOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

} // UnaryOperation
