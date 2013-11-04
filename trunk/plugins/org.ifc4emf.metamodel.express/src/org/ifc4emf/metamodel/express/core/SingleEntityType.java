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
 * A representation of the model object '<em><b>Single Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaresExplicitAttribute <em>Declares Explicit Attribute</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaresAttribute <em>Declares Attribute</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaredIn <em>Declared In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getEquivalent <em>Equivalent</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSingleEntityType()
 * @model
 * @generated
 */
public interface SingleEntityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Declares Explicit Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.ExplicitAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declares Explicit Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declares Explicit Attribute</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSingleEntityType_DeclaresExplicitAttribute()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ExplicitAttribute> getDeclaresExplicitAttribute();

	/**
	 * Returns the value of the '<em><b>Declares Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Attribute}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Attribute#getOfEntity <em>Of Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declares Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declares Attribute</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSingleEntityType_DeclaresAttribute()
	 * @see org.ifc4emf.metamodel.express.core.Attribute#getOfEntity
	 * @model opposite="ofEntity" containment="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getDeclaresAttribute();

	/**
	 * Returns the value of the '<em><b>Declared In</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EntityType#getDeclares <em>Declares</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared In</em>' container reference.
	 * @see #setDeclaredIn(EntityType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSingleEntityType_DeclaredIn()
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getDeclares
	 * @model opposite="declares" required="true" transient="false" ordered="false"
	 * @generated
	 */
	EntityType getDeclaredIn();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaredIn <em>Declared In</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared In</em>' container reference.
	 * @see #getDeclaredIn()
	 * @generated
	 */
	void setDeclaredIn(EntityType value);

	/**
	 * Returns the value of the '<em><b>Equivalent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent</em>' reference.
	 * @see #setEquivalent(PartialEntityType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSingleEntityType_Equivalent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PartialEntityType getEquivalent();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getEquivalent <em>Equivalent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalent</em>' reference.
	 * @see #getEquivalent()
	 * @generated
	 */
	void setEquivalent(PartialEntityType value);

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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSingleEntityType_Id()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ScopedId getId();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(ScopedId value);

} // SingleEntityType
