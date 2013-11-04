/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invertible Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getInverse <em>Inverse</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getCreatesRelationship <em>Creates Relationship</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getReferencingType <em>Referencing Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getModelsRole <em>Models Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInvertibleAttribute()
 * @model
 * @generated
 */
public interface InvertibleAttribute extends ExplicitAttribute {
	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.InverseAttribute}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.InverseAttribute#getExplicit <em>Explicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInvertibleAttribute_Inverse()
	 * @see org.ifc4emf.metamodel.express.core.InverseAttribute#getExplicit
	 * @model opposite="explicit" ordered="false"
	 * @generated
	 */
	EList<InverseAttribute> getInverse();

	/**
	 * Returns the value of the '<em><b>Range Type</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.EntityType}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EntityType#getUsedIn <em>Used In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Type</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInvertibleAttribute_RangeType()
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getUsedIn
	 * @model opposite="usedIn" required="true" ordered="false"
	 * @generated
	 */
	EList<EntityType> getRangeType();

	/**
	 * Returns the value of the '<em><b>Creates Relationship</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Relationship#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creates Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creates Relationship</em>' reference.
	 * @see #setCreatesRelationship(Relationship)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInvertibleAttribute_CreatesRelationship()
	 * @see org.ifc4emf.metamodel.express.core.Relationship#getBasedOn
	 * @model opposite="basedOn" required="true" ordered="false"
	 * @generated
	 */
	Relationship getCreatesRelationship();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getCreatesRelationship <em>Creates Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creates Relationship</em>' reference.
	 * @see #getCreatesRelationship()
	 * @generated
	 */
	void setCreatesRelationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Referencing Type</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.EntityType}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EntityType#getInvertibleAttributes <em>Invertible Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencing Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencing Type</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInvertibleAttribute_ReferencingType()
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getInvertibleAttributes
	 * @model opposite="invertibleAttributes" required="true" ordered="false"
	 * @generated
	 */
	EList<EntityType> getReferencingType();

	/**
	 * Returns the value of the '<em><b>Models Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.RangeRole#getDomainView <em>Domain View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models Role</em>' reference.
	 * @see #setModelsRole(RangeRole)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInvertibleAttribute_ModelsRole()
	 * @see org.ifc4emf.metamodel.express.core.RangeRole#getDomainView
	 * @model opposite="domainView" required="true" ordered="false"
	 * @generated
	 */
	RangeRole getModelsRole();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getModelsRole <em>Models Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Models Role</em>' reference.
	 * @see #getModelsRole()
	 * @generated
	 */
	void setModelsRole(RangeRole value);

} // InvertibleAttribute
