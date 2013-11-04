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
 * A representation of the model object '<em><b>Index Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.IndexOperation#getBaseValue <em>Base Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getIndexOperation()
 * @model abstract="true"
 * @generated
 */
public interface IndexOperation extends Expression {
	/**
	 * Returns the value of the '<em><b>Base Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Value</em>' reference.
	 * @see #setBaseValue(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getIndexOperation_BaseValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getBaseValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.IndexOperation#getBaseValue <em>Base Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Value</em>' reference.
	 * @see #getBaseValue()
	 * @generated
	 */
	void setBaseValue(Expression value);

} // IndexOperation
