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
 * A representation of the model object '<em><b>String Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.StringIndex#getFirstCode <em>First Code</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.StringIndex#getLastCode <em>Last Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getStringIndex()
 * @model
 * @generated
 */
public interface StringIndex extends IndexOperation {
	/**
	 * Returns the value of the '<em><b>First Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Code</em>' reference.
	 * @see #setFirstCode(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getStringIndex_FirstCode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getFirstCode();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.StringIndex#getFirstCode <em>First Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Code</em>' reference.
	 * @see #getFirstCode()
	 * @generated
	 */
	void setFirstCode(Expression value);

	/**
	 * Returns the value of the '<em><b>Last Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Code</em>' reference.
	 * @see #setLastCode(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getStringIndex_LastCode()
	 * @model ordered="false"
	 * @generated
	 */
	Expression getLastCode();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.StringIndex#getLastCode <em>Last Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Code</em>' reference.
	 * @see #getLastCode()
	 * @generated
	 */
	void setLastCode(Expression value);

} // StringIndex
