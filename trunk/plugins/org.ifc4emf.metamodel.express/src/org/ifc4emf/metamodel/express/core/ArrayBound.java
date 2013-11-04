/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.ArrayBound#getBoundExpression <em>Bound Expression</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.ArrayBound#getBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getArrayBound()
 * @model
 * @generated
 */
public interface ArrayBound extends EObject {
	/**
	 * Returns the value of the '<em><b>Bound Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Expression</em>' reference.
	 * @see #setBoundExpression(Expression)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getArrayBound_BoundExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getBoundExpression();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.ArrayBound#getBoundExpression <em>Bound Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Expression</em>' reference.
	 * @see #getBoundExpression()
	 * @generated
	 */
	void setBoundExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' attribute.
	 * @see #setBound(Integer)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getArrayBound_Bound()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" ordered="false"
	 * @generated
	 */
	Integer getBound();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.ArrayBound#getBound <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' attribute.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(Integer value);

} // ArrayBound
