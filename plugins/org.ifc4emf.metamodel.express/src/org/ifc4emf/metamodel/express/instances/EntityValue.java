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
 * A representation of the model object '<em><b>Entity Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.EntityValue#getCorrespondsTo <em>Corresponds To</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.EntityValue#getDescribes <em>Describes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getEntityValue()
 * @model
 * @generated
 */
public interface EntityValue extends PartialEntityValue {
	/**
	 * Returns the value of the '<em><b>Corresponds To</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.EntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponds To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponds To</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getEntityValue_CorrespondsTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<EntityType> getCorrespondsTo();

	/**
	 * Returns the value of the '<em><b>Describes</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.EntityInstance}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.instances.EntityInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getEntityValue_Describes()
	 * @see org.ifc4emf.metamodel.express.instances.EntityInstance#getState
	 * @model opposite="state" ordered="false"
	 * @generated
	 */
	EList<EntityInstance> getDescribes();

} // EntityValue
