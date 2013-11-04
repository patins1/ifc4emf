/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.RangeRole#getDomainView <em>Domain View</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.RangeRole#getRange <em>Range</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.RangeRole#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRangeRole()
 * @model
 * @generated
 */
public interface RangeRole extends Role {
	/**
	 * Returns the value of the '<em><b>Domain View</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getModelsRole <em>Models Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain View</em>' reference.
	 * @see #setDomainView(InvertibleAttribute)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRangeRole_DomainView()
	 * @see org.ifc4emf.metamodel.express.core.InvertibleAttribute#getModelsRole
	 * @model opposite="modelsRole" required="true" ordered="false"
	 * @generated
	 */
	InvertibleAttribute getDomainView();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.RangeRole#getDomainView <em>Domain View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain View</em>' reference.
	 * @see #getDomainView()
	 * @generated
	 */
	void setDomainView(InvertibleAttribute value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EntityType#getPlaysRangeRole <em>Plays Range Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(EntityType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRangeRole_Range()
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getPlaysRangeRole
	 * @model opposite="playsRangeRole" required="true" ordered="false"
	 * @generated
	 */
	EntityType getRange();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.RangeRole#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(EntityType value);

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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRangeRole_Id()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ScopedId getId();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.RangeRole#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(ScopedId value);

} // RangeRole
