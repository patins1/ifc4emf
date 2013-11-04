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
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.Selector#getEntityInstance <em>Entity Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getSelector()
 * @model abstract="true"
 * @generated
 */
public interface Selector extends Expression {
	/**
	 * Returns the value of the '<em><b>Entity Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Instance</em>' reference.
	 * @see #setEntityInstance(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getSelector_EntityInstance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getEntityInstance();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.Selector#getEntityInstance <em>Entity Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Instance</em>' reference.
	 * @see #getEntityInstance()
	 * @generated
	 */
	void setEntityInstance(Expression value);

} // Selector
