/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.ExplicitAttribute;
import org.ifc4emf.metamodel.express.core.Instance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.AttributeValue#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.AttributeValue#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getAttributeValue()
 * @model
 * @generated
 */
public interface AttributeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Actual Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Value</em>' reference.
	 * @see #setActualValue(Instance)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getAttributeValue_ActualValue()
	 * @model ordered="false"
	 * @generated
	 */
	Instance getActualValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.AttributeValue#getActualValue <em>Actual Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Value</em>' reference.
	 * @see #getActualValue()
	 * @generated
	 */
	void setActualValue(Instance value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(ExplicitAttribute)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getAttributeValue_Attribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExplicitAttribute getAttribute();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.AttributeValue#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(ExplicitAttribute value);

} // AttributeValue
