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
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Scope#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Scope#getIncludesRemarks <em>Includes Remarks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getScope()
 * @model abstract="true"
 * @generated
 */
public interface Scope extends EObject {
	/**
	 * Returns the value of the '<em><b>Named Elements</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.NamedElement}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Elements</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getScope_NamedElements()
	 * @see org.ifc4emf.metamodel.express.core.NamedElement#getNamespace
	 * @model opposite="namespace" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getNamedElements();

	/**
	 * Returns the value of the '<em><b>Includes Remarks</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Remark}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Remark#getAppearsIn <em>Appears In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes Remarks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes Remarks</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getScope_IncludesRemarks()
	 * @see org.ifc4emf.metamodel.express.core.Remark#getAppearsIn
	 * @model opposite="appearsIn" ordered="false"
	 * @generated
	 */
	EList<Remark> getIncludesRemarks();

} // Scope
