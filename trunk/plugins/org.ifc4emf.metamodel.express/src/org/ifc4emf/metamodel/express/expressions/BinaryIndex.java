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
 * A representation of the model object '<em><b>Binary Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.BinaryIndex#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.BinaryIndex#getLastBit <em>Last Bit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getBinaryIndex()
 * @model
 * @generated
 */
public interface BinaryIndex extends IndexOperation {
	/**
	 * Returns the value of the '<em><b>First Bit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Bit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Bit</em>' reference.
	 * @see #setFirstBit(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getBinaryIndex_FirstBit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getFirstBit();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.BinaryIndex#getFirstBit <em>First Bit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Bit</em>' reference.
	 * @see #getFirstBit()
	 * @generated
	 */
	void setFirstBit(Expression value);

	/**
	 * Returns the value of the '<em><b>Last Bit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Bit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Bit</em>' reference.
	 * @see #setLastBit(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getBinaryIndex_LastBit()
	 * @model ordered="false"
	 * @generated
	 */
	Expression getLastBit();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.BinaryIndex#getLastBit <em>Last Bit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Bit</em>' reference.
	 * @see #getLastBit()
	 * @generated
	 */
	void setLastBit(Expression value);

} // BinaryIndex
