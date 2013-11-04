/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.ifc4emf.metamodel.express.algorithms.Algorithm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.ActualType#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getActualType()
 * @model abstract="true"
 * @generated
 */
public interface ActualType extends VariableType {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(Algorithm)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getActualType_Scope()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Algorithm getScope();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.ActualType#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Algorithm value);

} // ActualType
