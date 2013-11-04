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
 * A representation of the model object '<em><b>Partial Entity Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.PartialEntityValue#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getPartialEntityValue()
 * @model
 * @generated
 */
public interface PartialEntityValue extends Instance {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.SingleEntityValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getPartialEntityValue_Components()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<SingleEntityValue> getComponents();

} // PartialEntityValue
