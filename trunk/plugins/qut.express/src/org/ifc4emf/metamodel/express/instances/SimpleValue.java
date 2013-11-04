/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.SimpleValue#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSimpleValue()
 * @model abstract="true"
 * @generated
 */
public interface SimpleValue extends ConcreteValue {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSimpleValue_Name()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.SimpleValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SimpleValue
