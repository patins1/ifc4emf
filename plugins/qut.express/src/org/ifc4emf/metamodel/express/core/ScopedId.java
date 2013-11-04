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
 * A representation of the model object '<em><b>Scoped Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.ScopedId#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.ScopedId#getDefiningScope <em>Defining Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getScopedId()
 * @model
 * @generated
 */
public interface ScopedId extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Name</em>' attribute.
	 * @see #setLocalName(String)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getScopedId_LocalName()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getLocalName();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.ScopedId#getLocalName <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Name</em>' attribute.
	 * @see #getLocalName()
	 * @generated
	 */
	void setLocalName(String value);

	/**
	 * Returns the value of the '<em><b>Defining Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Scope</em>' reference.
	 * @see #setDefiningScope(Scope)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getScopedId_DefiningScope()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Scope getDefiningScope();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.ScopedId#getDefiningScope <em>Defining Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Scope</em>' reference.
	 * @see #getDefiningScope()
	 * @generated
	 */
	void setDefiningScope(Scope value);

} // ScopedId
