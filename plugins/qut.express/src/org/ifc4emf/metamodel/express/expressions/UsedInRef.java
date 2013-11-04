/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.ifc4emf.metamodel.express.core.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Used In Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.UsedInRef#getInverseOf <em>Inverse Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getUsedInRef()
 * @model
 * @generated
 */
public interface UsedInRef extends Selector {
	/**
	 * Returns the value of the '<em><b>Inverse Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Of</em>' reference.
	 * @see #setInverseOf(Attribute)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getUsedInRef_InverseOf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getInverseOf();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.UsedInRef#getInverseOf <em>Inverse Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Of</em>' reference.
	 * @see #getInverseOf()
	 * @generated
	 */
	void setInverseOf(Attribute value);

} // UsedInRef
