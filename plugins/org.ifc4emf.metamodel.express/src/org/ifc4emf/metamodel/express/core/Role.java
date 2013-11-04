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
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Role#getInRelationship <em>In Relationship</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Role#getOfEntity <em>Of Entity</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Role#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Role#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRole()
 * @model abstract="true"
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>In Relationship</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Relationship#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Relationship</em>' reference.
	 * @see #setInRelationship(Relationship)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRole_InRelationship()
	 * @see org.ifc4emf.metamodel.express.core.Relationship#getRoles
	 * @model opposite="roles" required="true" ordered="false"
	 * @generated
	 */
	Relationship getInRelationship();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Role#getInRelationship <em>In Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Relationship</em>' reference.
	 * @see #getInRelationship()
	 * @generated
	 */
	void setInRelationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Of Entity</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.EntityType}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EntityType#getPlaysRole <em>Plays Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Entity</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRole_OfEntity()
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getPlaysRole
	 * @model opposite="playsRole" required="true" ordered="false"
	 * @generated
	 */
	EList<EntityType> getOfEntity();

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' reference.
	 * @see #setUpperBound(SizeConstraint)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRole_UpperBound()
	 * @model ordered="false"
	 * @generated
	 */
	SizeConstraint getUpperBound();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Role#getUpperBound <em>Upper Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(SizeConstraint value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' reference.
	 * @see #setLowerBound(SizeConstraint)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRole_LowerBound()
	 * @model ordered="false"
	 * @generated
	 */
	SizeConstraint getLowerBound();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Role#getLowerBound <em>Lower Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(SizeConstraint value);

} // Role
