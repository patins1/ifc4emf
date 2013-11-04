/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.instances.GenericAggregate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.AggregateInitializer#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.AggregateInitializer#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getAggregateInitializer()
 * @model
 * @generated
 */
public interface AggregateInitializer extends Expression {
	/**
	 * Returns the value of the '<em><b>Result Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Value</em>' reference.
	 * @see #setResultValue(GenericAggregate)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getAggregateInitializer_ResultValue()
	 * @model ordered="false"
	 * @generated
	 */
	GenericAggregate getResultValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.AggregateInitializer#getResultValue <em>Result Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Value</em>' reference.
	 * @see #getResultValue()
	 * @generated
	 */
	void setResultValue(GenericAggregate value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.expressions.MemberBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getAggregateInitializer_Bindings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MemberBinding> getBindings();

} // AggregateInitializer
