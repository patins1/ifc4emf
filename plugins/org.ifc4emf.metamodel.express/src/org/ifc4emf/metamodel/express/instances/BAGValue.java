/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BAG Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.BAGValue#getMemberSlot <em>Member Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getBAGValue()
 * @model
 * @generated
 */
public interface BAGValue extends AggregateValue {
	/**
	 * Returns the value of the '<em><b>Member Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.BagMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Slot</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getBAGValue_MemberSlot()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BagMember> getMemberSlot();

} // BAGValue
