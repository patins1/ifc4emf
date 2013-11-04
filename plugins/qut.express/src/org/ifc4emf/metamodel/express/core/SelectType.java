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
 * A representation of the model object '<em><b>Select Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SelectType#getAllowedTypes <em>Allowed Types</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SelectType#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SelectType#getBase <em>Base</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SelectType#getSelectList <em>Select List</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SelectType#getIsExtensible <em>Is Extensible</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SelectType#getIsEntity <em>Is Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSelectType()
 * @model
 * @generated
 */
public interface SelectType extends DefinedType {
	/**
	 * Returns the value of the '<em><b>Allowed Types</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.NamedType}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.NamedType#getInstantiates <em>Instantiates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Types</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSelectType_AllowedTypes()
	 * @see org.ifc4emf.metamodel.express.core.NamedType#getInstantiates
	 * @model opposite="instantiates" ordered="false"
	 * @generated
	 */
	EList<NamedType> getAllowedTypes();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.SelectType}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.SelectType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSelectType_Extension()
	 * @see org.ifc4emf.metamodel.express.core.SelectType#getBase
	 * @model opposite="base" ordered="false"
	 * @generated
	 */
	EList<SelectType> getExtension();

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.SelectType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(SelectType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSelectType_Base()
	 * @see org.ifc4emf.metamodel.express.core.SelectType#getExtension
	 * @model opposite="extension" required="true" ordered="false"
	 * @generated
	 */
	SelectType getBase();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.SelectType#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(SelectType value);

	/**
	 * Returns the value of the '<em><b>Select List</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.NamedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select List</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSelectType_SelectList()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamedType> getSelectList();

	/**
	 * Returns the value of the '<em><b>Is Extensible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Extensible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extensible</em>' attribute.
	 * @see #setIsExtensible(Boolean)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSelectType_IsExtensible()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsExtensible();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.SelectType#getIsExtensible <em>Is Extensible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Extensible</em>' attribute.
	 * @see #getIsExtensible()
	 * @generated
	 */
	void setIsExtensible(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Entity</em>' attribute.
	 * @see #setIsEntity(Boolean)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSelectType_IsEntity()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsEntity();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.SelectType#getIsEntity <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entity</em>' attribute.
	 * @see #getIsEntity()
	 * @generated
	 */
	void setIsEntity(Boolean value);

} // SelectType
