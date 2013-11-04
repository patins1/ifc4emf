/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.VariableType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coercion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.Coercion#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.Coercion#getTargetType <em>Target Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getCoercion()
 * @model
 * @generated
 */
public interface Coercion extends Operation {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference.
	 * @see #setOperand(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getCoercion_Operand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getOperand();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.Coercion#getOperand <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' reference.
	 * @see #setTargetType(VariableType)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getCoercion_TargetType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VariableType getTargetType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.Coercion#getTargetType <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' reference.
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(VariableType value);

} // Coercion
