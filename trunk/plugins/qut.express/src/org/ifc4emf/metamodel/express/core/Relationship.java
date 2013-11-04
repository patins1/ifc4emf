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
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Relationship#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Relationship#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Relationship#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Relationship#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(DomainRole)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRelationship_Domain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DomainRole getDomain();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Relationship#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DomainRole value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Role}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Role#getInRelationship <em>In Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRelationship_Roles()
	 * @see org.ifc4emf.metamodel.express.core.Role#getInRelationship
	 * @model opposite="inRelationship" lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getCreatesRelationship <em>Creates Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' reference.
	 * @see #setBasedOn(InvertibleAttribute)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRelationship_BasedOn()
	 * @see org.ifc4emf.metamodel.express.core.InvertibleAttribute#getCreatesRelationship
	 * @model opposite="createsRelationship" required="true" ordered="false"
	 * @generated
	 */
	InvertibleAttribute getBasedOn();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Relationship#getBasedOn <em>Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On</em>' reference.
	 * @see #getBasedOn()
	 * @generated
	 */
	void setBasedOn(InvertibleAttribute value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(RangeRole)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRelationship_Range()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RangeRole getRange();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Relationship#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(RangeRole value);

} // Relationship
