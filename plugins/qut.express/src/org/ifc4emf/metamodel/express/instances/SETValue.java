/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.core.Instance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SET Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.SETValue#getMemberValue <em>Member Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSETValue()
 * @model
 * @generated
 */
public interface SETValue extends AggregateValue {
	/**
	 * Returns the value of the '<em><b>Member Value</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Value</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getSETValue_MemberValue()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Instance> getMemberValue();

} // SETValue
