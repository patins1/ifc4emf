/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.SelectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.TypedInstance#getSatisfiesType <em>Satisfies Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getTypedInstance()
 * @model abstract="true"
 * @generated
 */
public interface TypedInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Satisfies Type</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.SelectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfies Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfies Type</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getTypedInstance_SatisfiesType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SelectType> getSatisfiesType();

} // TypedInstance
