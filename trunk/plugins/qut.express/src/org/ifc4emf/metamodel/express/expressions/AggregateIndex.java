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
 * A representation of the model object '<em><b>Aggregate Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.AggregateIndex#getIndexValue <em>Index Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getAggregateIndex()
 * @model
 * @generated
 */
public interface AggregateIndex extends IndexOperation {
	/**
	 * Returns the value of the '<em><b>Index Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Value</em>' containment reference.
	 * @see #setIndexValue(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getAggregateIndex_IndexValue()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getIndexValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.AggregateIndex#getIndexValue <em>Index Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Value</em>' containment reference.
	 * @see #getIndexValue()
	 * @generated
	 */
	void setIndexValue(Expression value);

} // AggregateIndex
