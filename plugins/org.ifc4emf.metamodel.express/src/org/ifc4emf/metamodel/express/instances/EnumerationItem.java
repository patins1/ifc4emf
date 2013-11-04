/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.ifc4emf.metamodel.express.core.EnumerationType;
import org.ifc4emf.metamodel.express.core.TypeElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.EnumerationItem#getDeclaredIn <em>Declared In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.EnumerationItem#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getEnumerationItem()
 * @model
 * @generated
 */
public interface EnumerationItem extends TypeElement, TypedInstance, ConcreteValue {
	/**
	 * Returns the value of the '<em><b>Declared In</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EnumerationType#getDeclaredItems <em>Declared Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared In</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared In</em>' container reference.
	 * @see #setDeclaredIn(EnumerationType)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getEnumerationItem_DeclaredIn()
	 * @see org.ifc4emf.metamodel.express.core.EnumerationType#getDeclaredItems
	 * @model opposite="declaredItems" required="true" transient="false" ordered="false"
	 * @generated
	 */
	EnumerationType getDeclaredIn();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.EnumerationItem#getDeclaredIn <em>Declared In</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared In</em>' container reference.
	 * @see #getDeclaredIn()
	 * @generated
	 */
	void setDeclaredIn(EnumerationType value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(Integer)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getEnumerationItem_Position()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getPosition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.EnumerationItem#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Integer value);

} // EnumerationItem
