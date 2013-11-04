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
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.AttributeType#getRole <em>Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.AttributeType#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAttributeType()
 * @model abstract="true"
 * @generated
 */
public interface AttributeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Attribute}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Attribute#getAttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAttributeType_Role()
	 * @see org.ifc4emf.metamodel.express.core.Attribute#getAttributeType
	 * @model opposite="attributeType" ordered="false"
	 * @generated
	 */
	EList<Attribute> getRole();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.DomainConstraint}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.DomainConstraint#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAttributeType_Constraints()
	 * @see org.ifc4emf.metamodel.express.core.DomainConstraint#getDomain
	 * @model opposite="domain" ordered="false"
	 * @generated
	 */
	EList<DomainConstraint> getConstraints();

} // AttributeType
