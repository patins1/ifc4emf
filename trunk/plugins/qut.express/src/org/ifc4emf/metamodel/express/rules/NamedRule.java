/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.rules;

import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.LocalElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.NamedRule#getAssertsExpression <em>Asserts Expression</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.NamedRule#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getNamedRule()
 * @model
 * @generated
 */
public interface NamedRule extends LocalElement {
	/**
	 * Returns the value of the '<em><b>Asserts Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asserts Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asserts Expression</em>' containment reference.
	 * @see #setAssertsExpression(Expression)
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getNamedRule_AssertsExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getAssertsExpression();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.rules.NamedRule#getAssertsExpression <em>Asserts Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserts Expression</em>' containment reference.
	 * @see #getAssertsExpression()
	 * @generated
	 */
	void setAssertsExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(Integer)
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getNamedRule_Position()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getPosition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.rules.NamedRule#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Integer value);

} // NamedRule
