/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InverseAttribute#getModelsRole <em>Models Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InverseAttribute#getExplicit <em>Explicit</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InverseAttribute#getIsUnique <em>Is Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInverseAttribute()
 * @model
 * @generated
 */
public interface InverseAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Models Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.DomainRole#getRangeView <em>Range View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models Role</em>' reference.
	 * @see #setModelsRole(DomainRole)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInverseAttribute_ModelsRole()
	 * @see org.ifc4emf.metamodel.express.core.DomainRole#getRangeView
	 * @model opposite="rangeView" required="true" ordered="false"
	 * @generated
	 */
	DomainRole getModelsRole();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.InverseAttribute#getModelsRole <em>Models Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Models Role</em>' reference.
	 * @see #getModelsRole()
	 * @generated
	 */
	void setModelsRole(DomainRole value);

	/**
	 * Returns the value of the '<em><b>Explicit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit</em>' reference.
	 * @see #setExplicit(InvertibleAttribute)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInverseAttribute_Explicit()
	 * @see org.ifc4emf.metamodel.express.core.InvertibleAttribute#getInverse
	 * @model opposite="inverse" required="true" ordered="false"
	 * @generated
	 */
	InvertibleAttribute getExplicit();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.InverseAttribute#getExplicit <em>Explicit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit</em>' reference.
	 * @see #getExplicit()
	 * @generated
	 */
	void setExplicit(InvertibleAttribute value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(Boolean)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInverseAttribute_IsUnique()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsUnique();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.InverseAttribute#getIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #getIsUnique()
	 * @generated
	 */
	void setIsUnique(Boolean value);

} // InverseAttribute
