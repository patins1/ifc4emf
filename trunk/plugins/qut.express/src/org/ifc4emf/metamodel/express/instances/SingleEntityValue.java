/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.SingleEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Entity Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.SingleEntityValue#getEquivalent <em>Equivalent</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.SingleEntityValue#getOfType <em>Of Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.SingleEntityValue#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSingleEntityValue()
 * @model
 * @generated
 */
public interface SingleEntityValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Equivalent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent</em>' reference.
	 * @see #setEquivalent(PartialEntityValue)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSingleEntityValue_Equivalent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PartialEntityValue getEquivalent();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.SingleEntityValue#getEquivalent <em>Equivalent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalent</em>' reference.
	 * @see #getEquivalent()
	 * @generated
	 */
	void setEquivalent(PartialEntityValue value);

	/**
	 * Returns the value of the '<em><b>Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Type</em>' reference.
	 * @see #setOfType(SingleEntityType)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSingleEntityValue_OfType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SingleEntityType getOfType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.SingleEntityValue#getOfType <em>Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of Type</em>' reference.
	 * @see #getOfType()
	 * @generated
	 */
	void setOfType(SingleEntityType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSingleEntityValue_Properties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AttributeValue> getProperties();

} // SingleEntityValue
