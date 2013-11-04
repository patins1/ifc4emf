/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.rules.Extent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getPlaysRole <em>Plays Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getRedeclarations <em>Redeclarations</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getPlaysRangeRole <em>Plays Range Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getDeclares <em>Declares</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getInvertibleAttributes <em>Invertible Attributes</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getPlaysDomainRole <em>Plays Domain Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getUniqueRules <em>Unique Rules</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getUsedIn <em>Used In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getSubtypeOf <em>Subtype Of</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EntityType#getIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType()
 * @model
 * @generated
 */
public interface EntityType extends NamedType, InstantiableType {
	/**
	 * Returns the value of the '<em><b>Plays Role</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Role}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Role#getOfEntity <em>Of Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plays Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plays Role</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_PlaysRole()
	 * @see org.ifc4emf.metamodel.express.core.Role#getOfEntity
	 * @model opposite="ofEntity" ordered="false"
	 * @generated
	 */
	EList<Role> getPlaysRole();

	/**
	 * Returns the value of the '<em><b>Redeclarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Redeclaration}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redeclarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redeclarations</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_Redeclarations()
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getScope
	 * @model opposite="scope" containment="true" ordered="false"
	 * @generated
	 */
	EList<Redeclaration> getRedeclarations();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Attribute}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Attribute#getOwningEntity <em>Owning Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_Attributes()
	 * @see org.ifc4emf.metamodel.express.core.Attribute#getOwningEntity
	 * @model opposite="owningEntity" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Plays Range Role</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.RangeRole}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.RangeRole#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plays Range Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plays Range Role</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_PlaysRangeRole()
	 * @see org.ifc4emf.metamodel.express.core.RangeRole#getRange
	 * @model opposite="range" ordered="false"
	 * @generated
	 */
	EList<RangeRole> getPlaysRangeRole();

	/**
	 * Returns the value of the '<em><b>Declares</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaredIn <em>Declared In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declares</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declares</em>' containment reference.
	 * @see #setDeclares(SingleEntityType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_Declares()
	 * @see org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaredIn
	 * @model opposite="declaredIn" containment="true" required="true" ordered="false"
	 * @generated
	 */
	SingleEntityType getDeclares();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.EntityType#getDeclares <em>Declares</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declares</em>' containment reference.
	 * @see #getDeclares()
	 * @generated
	 */
	void setDeclares(SingleEntityType value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.rules.Extent}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.rules.Extent#getForType <em>For Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_Extension()
	 * @see org.ifc4emf.metamodel.express.rules.Extent#getForType
	 * @model opposite="forType" ordered="false"
	 * @generated
	 */
	EList<Extent> getExtension();

	/**
	 * Returns the value of the '<em><b>Invertible Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.InvertibleAttribute}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getReferencingType <em>Referencing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invertible Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invertible Attributes</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_InvertibleAttributes()
	 * @see org.ifc4emf.metamodel.express.core.InvertibleAttribute#getReferencingType
	 * @model opposite="referencingType" ordered="false"
	 * @generated
	 */
	EList<InvertibleAttribute> getInvertibleAttributes();

	/**
	 * Returns the value of the '<em><b>Plays Domain Role</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.DomainRole}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.DomainRole#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plays Domain Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plays Domain Role</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_PlaysDomainRole()
	 * @see org.ifc4emf.metamodel.express.core.DomainRole#getDomain
	 * @model opposite="domain" ordered="false"
	 * @generated
	 */
	EList<DomainRole> getPlaysDomainRole();

	/**
	 * Returns the value of the '<em><b>Unique Rules</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.UniqueRule}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.UniqueRule#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Rules</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_UniqueRules()
	 * @see org.ifc4emf.metamodel.express.core.UniqueRule#getDomain
	 * @model opposite="domain" ordered="false"
	 * @generated
	 */
	EList<UniqueRule> getUniqueRules();

	/**
	 * Returns the value of the '<em><b>Used In</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.InvertibleAttribute}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getRangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used In</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_UsedIn()
	 * @see org.ifc4emf.metamodel.express.core.InvertibleAttribute#getRangeType
	 * @model opposite="rangeType" ordered="false"
	 * @generated
	 */
	EList<InvertibleAttribute> getUsedIn();

	/**
	 * Returns the value of the '<em><b>Subtype Of</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.EntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype Of</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_SubtypeOf()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EntityType> getSubtypeOf();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEntityType_IsAbstract()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.EntityType#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

} // EntityType
