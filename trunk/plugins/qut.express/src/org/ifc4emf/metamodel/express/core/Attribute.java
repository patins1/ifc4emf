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
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Attribute#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Attribute#getOfEntity <em>Of Entity</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Attribute#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Attribute#getPosition <em>Position</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Attribute#getOwningEntity <em>Owning Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends TypeElement {
	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.AttributeType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' reference.
	 * @see #setAttributeType(AttributeType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAttribute_AttributeType()
	 * @see org.ifc4emf.metamodel.express.core.AttributeType#getRole
	 * @model opposite="role" required="true" ordered="false"
	 * @generated
	 */
	AttributeType getAttributeType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Attribute#getAttributeType <em>Attribute Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type</em>' reference.
	 * @see #getAttributeType()
	 * @generated
	 */
	void setAttributeType(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Of Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaresAttribute <em>Declares Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Entity</em>' container reference.
	 * @see #setOfEntity(SingleEntityType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAttribute_OfEntity()
	 * @see org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaresAttribute
	 * @model opposite="declaresAttribute" required="true" transient="false" ordered="false"
	 * @generated
	 */
	SingleEntityType getOfEntity();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Attribute#getOfEntity <em>Of Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of Entity</em>' container reference.
	 * @see #getOfEntity()
	 * @generated
	 */
	void setOfEntity(SingleEntityType value);

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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAttribute_IsAbstract()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Attribute#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAttribute_Position()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getPosition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Attribute#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Integer value);

	/**
	 * Returns the value of the '<em><b>Owning Entity</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.EntityType}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EntityType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Entity</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAttribute_OwningEntity()
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getAttributes
	 * @model opposite="attributes" required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<EntityType> getOwningEntity();

} // Attribute
