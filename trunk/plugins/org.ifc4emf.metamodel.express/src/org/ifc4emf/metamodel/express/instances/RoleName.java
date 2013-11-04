/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.ScopedId;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.RoleName#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.RoleName#getRepresents <em>Represents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getRoleName()
 * @model
 * @generated
 */
public interface RoleName extends StringValue {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Attribute)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getRoleName_RefersTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getRefersTo();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.RoleName#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Attribute value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' containment reference.
	 * @see #setRepresents(ScopedId)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getRoleName_Represents()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ScopedId getRepresents();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.RoleName#getRepresents <em>Represents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' containment reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(ScopedId value);

} // RoleName
