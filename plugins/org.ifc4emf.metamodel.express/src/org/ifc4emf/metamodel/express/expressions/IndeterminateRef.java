/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.ifc4emf.metamodel.express.instances.Indeterminate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indeterminate Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.IndeterminateRef#getRefersTo <em>Refers To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getIndeterminateRef()
 * @model
 * @generated
 */
public interface IndeterminateRef extends Primary {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Indeterminate)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getIndeterminateRef_RefersTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Indeterminate getRefersTo();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.IndeterminateRef#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Indeterminate value);

} // IndeterminateRef
