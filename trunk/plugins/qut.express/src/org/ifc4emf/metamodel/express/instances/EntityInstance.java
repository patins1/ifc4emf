/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.core.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.EntityInstance#getState <em>State</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.EntityInstance#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.EntityInstance#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getEntityInstance()
 * @model
 * @generated
 */
public interface EntityInstance extends TypedInstance {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.instances.EntityValue#getDescribes <em>Describes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(EntityValue)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getEntityInstance_State()
	 * @see org.ifc4emf.metamodel.express.instances.EntityValue#getDescribes
	 * @model opposite="describes" required="true" ordered="false"
	 * @generated
	 */
	EntityValue getState();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.EntityInstance#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(EntityValue value);

	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.EntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getEntityInstance_InstanceOf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<EntityType> getInstanceOf();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getEntityInstance_Id()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.instances.EntityName" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.EntityInstance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EntityInstance
