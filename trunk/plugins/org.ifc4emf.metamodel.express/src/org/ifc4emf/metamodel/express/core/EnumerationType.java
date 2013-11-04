/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.instances.EnumerationItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EnumerationType#getValues <em>Values</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EnumerationType#getDeclaredItems <em>Declared Items</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EnumerationType#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EnumerationType#getBase <em>Base</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.EnumerationType#getIsExtensible <em>Is Extensible</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends DefinedType {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.EnumerationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEnumerationType_Values()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EnumerationItem> getValues();

	/**
	 * Returns the value of the '<em><b>Declared Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.EnumerationItem}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.instances.EnumerationItem#getDeclaredIn <em>Declared In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Items</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEnumerationType_DeclaredItems()
	 * @see org.ifc4emf.metamodel.express.instances.EnumerationItem#getDeclaredIn
	 * @model opposite="declaredIn" containment="true" ordered="false"
	 * @generated
	 */
	EList<EnumerationItem> getDeclaredItems();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.EnumerationType}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EnumerationType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEnumerationType_Extension()
	 * @see org.ifc4emf.metamodel.express.core.EnumerationType#getBase
	 * @model opposite="base" ordered="false"
	 * @generated
	 */
	EList<EnumerationType> getExtension();

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EnumerationType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(EnumerationType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEnumerationType_Base()
	 * @see org.ifc4emf.metamodel.express.core.EnumerationType#getExtension
	 * @model opposite="extension" required="true" ordered="false"
	 * @generated
	 */
	EnumerationType getBase();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.EnumerationType#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(EnumerationType value);

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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getEnumerationType_IsExtensible()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsExtensible();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.EnumerationType#getIsExtensible <em>Is Extensible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Extensible</em>' attribute.
	 * @see #getIsExtensible()
	 * @generated
	 */
	void setIsExtensible(Boolean value);

} // EnumerationType
