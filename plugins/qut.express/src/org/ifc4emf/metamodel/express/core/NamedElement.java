/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.NamedElement#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.NamedElement#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.NamedElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Scope#getNamedElements <em>Named Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(Scope)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getNamedElement_Namespace()
	 * @see org.ifc4emf.metamodel.express.core.Scope#getNamedElements
	 * @model opposite="namedElements" required="true" ordered="false"
	 * @generated
	 */
	Scope getNamespace();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.NamedElement#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Scope value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Remark}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Remark#getDescribesElement <em>Describes Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getNamedElement_Documentation()
	 * @see org.ifc4emf.metamodel.express.core.Remark#getDescribesElement
	 * @model opposite="describesElement" ordered="false"
	 * @generated
	 */
	EList<Remark> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(ScopedId)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getNamedElement_Id()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ScopedId getId();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.NamedElement#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(ScopedId value);

} // NamedElement
