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
 * A representation of the model object '<em><b>Unique Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.UniqueRule#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.UniqueRule#getKeyComponent <em>Key Component</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.UniqueRule#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getUniqueRule()
 * @model
 * @generated
 */
public interface UniqueRule extends TypeElement {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EntityType#getUniqueRules <em>Unique Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(EntityType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getUniqueRule_Domain()
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getUniqueRules
	 * @model opposite="uniqueRules" required="true" ordered="false"
	 * @generated
	 */
	EntityType getDomain();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.UniqueRule#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(EntityType value);

	/**
	 * Returns the value of the '<em><b>Key Component</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Component</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getUniqueRule_KeyComponent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getKeyComponent();

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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getUniqueRule_Position()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getPosition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.UniqueRule#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Integer value);

} // UniqueRule
