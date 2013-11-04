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
 * A representation of the model object '<em><b>LIST Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.LISTValue#getMemberSlot <em>Member Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getLISTValue()
 * @model
 * @generated
 */
public interface LISTValue extends Instance, AggregateValue {
	/**
	 * Returns the value of the '<em><b>Member Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.ListMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Slot</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getLISTValue_MemberSlot()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ListMember> getMemberSlot();

} // LISTValue
