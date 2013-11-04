/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.ifc4emf.metamodel.express.core.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Leaf Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.SingleLeafInstance#getCharacterizingType <em>Characterizing Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSingleLeafInstance()
 * @model
 * @generated
 */
public interface SingleLeafInstance extends EntityInstance {
	/**
	 * Returns the value of the '<em><b>Characterizing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characterizing Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characterizing Type</em>' reference.
	 * @see #setCharacterizingType(EntityType)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSingleLeafInstance_CharacterizingType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EntityType getCharacterizingType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.SingleLeafInstance#getCharacterizingType <em>Characterizing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characterizing Type</em>' reference.
	 * @see #getCharacterizingType()
	 * @generated
	 */
	void setCharacterizingType(EntityType value);

} // SingleLeafInstance
