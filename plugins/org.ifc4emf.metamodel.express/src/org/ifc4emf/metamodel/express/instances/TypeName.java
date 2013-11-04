/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.ifc4emf.metamodel.express.core.NamedType;
import org.ifc4emf.metamodel.express.core.ScopedId;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.TypeName#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.TypeName#getRepresents <em>Represents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getTypeName()
 * @model
 * @generated
 */
public interface TypeName extends StringValue {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(NamedType)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getTypeName_RefersTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedType getRefersTo();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.TypeName#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(NamedType value);

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
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getTypeName_Represents()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ScopedId getRepresents();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.TypeName#getRepresents <em>Represents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' containment reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(ScopedId value);

} // TypeName
