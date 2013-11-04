/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.Schema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.Population#getCompositionEntityInstance <em>Composition Entity Instance</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.Population#getCompositionInstance <em>Composition Instance</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.Population#getGoverningSchema <em>Governing Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getPopulation()
 * @model
 * @generated
 */
public interface Population extends EObject {
	/**
	 * Returns the value of the '<em><b>Composition Entity Instance</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.EntityInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Entity Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Entity Instance</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getPopulation_CompositionEntityInstance()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EntityInstance> getCompositionEntityInstance();

	/**
	 * Returns the value of the '<em><b>Composition Instance</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Instance}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Instance#getAppearsInPopulation <em>Appears In Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Instance</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getPopulation_CompositionInstance()
	 * @see org.ifc4emf.metamodel.express.core.Instance#getAppearsInPopulation
	 * @model opposite="appearsInPopulation" ordered="false"
	 * @generated
	 */
	EList<Instance> getCompositionInstance();

	/**
	 * Returns the value of the '<em><b>Governing Schema</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Governing Schema</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governing Schema</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getPopulation_GoverningSchema()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Schema> getGoverningSchema();

} // Population
