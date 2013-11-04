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
 * A representation of the model object '<em><b>ARRAY Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.ARRAYValue#getMemberSlot <em>Member Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getARRAYValue()
 * @model
 * @generated
 */
public interface ARRAYValue extends AggregateValue {
	/**
	 * Returns the value of the '<em><b>Member Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.ArrayMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Slot</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getARRAYValue_MemberSlot()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ArrayMember> getMemberSlot();

} // ARRAYValue
