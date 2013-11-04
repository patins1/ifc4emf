/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.DomainRole#getRangeView <em>Range View</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.DomainRole#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.DomainRole#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getDomainRole()
 * @model
 * @generated
 */
public interface DomainRole extends Role {
	/**
	 * Returns the value of the '<em><b>Range View</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.InverseAttribute#getModelsRole <em>Models Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range View</em>' reference.
	 * @see #setRangeView(InverseAttribute)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getDomainRole_RangeView()
	 * @see org.ifc4emf.metamodel.express.core.InverseAttribute#getModelsRole
	 * @model opposite="modelsRole" ordered="false"
	 * @generated
	 */
	InverseAttribute getRangeView();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.DomainRole#getRangeView <em>Range View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range View</em>' reference.
	 * @see #getRangeView()
	 * @generated
	 */
	void setRangeView(InverseAttribute value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EntityType#getPlaysDomainRole <em>Plays Domain Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(EntityType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getDomainRole_Domain()
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getPlaysDomainRole
	 * @model opposite="playsDomainRole" required="true" ordered="false"
	 * @generated
	 */
	EntityType getDomain();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.DomainRole#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(EntityType value);

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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getDomainRole_Id()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ScopedId getId();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.DomainRole#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(ScopedId value);

} // DomainRole
