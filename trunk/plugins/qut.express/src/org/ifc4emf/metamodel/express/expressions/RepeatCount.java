/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.RepeatCount#getDerivation <em>Derivation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getRepeatCount()
 * @model
 * @generated
 */
public interface RepeatCount extends EObject {
	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation</em>' reference.
	 * @see #setDerivation(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getRepeatCount_Derivation()
	 * @model ordered="false"
	 * @generated
	 */
	Expression getDerivation();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.RepeatCount#getDerivation <em>Derivation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation</em>' reference.
	 * @see #getDerivation()
	 * @generated
	 */
	void setDerivation(Expression value);

} // RepeatCount
