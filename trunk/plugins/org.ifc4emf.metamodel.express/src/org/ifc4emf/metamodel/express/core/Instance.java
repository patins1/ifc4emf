/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.instances.Population;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Instance#getAppearsInPopulation <em>Appears In Population</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Instance#getOfType <em>Of Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInstance()
 * @model abstract="true"
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Appears In Population</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.Population}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.instances.Population#getCompositionInstance <em>Composition Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appears In Population</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appears In Population</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInstance_AppearsInPopulation()
	 * @see org.ifc4emf.metamodel.express.instances.Population#getCompositionInstance
	 * @model opposite="compositionInstance" ordered="false"
	 * @generated
	 */
	EList<Population> getAppearsInPopulation();

	/**
	 * Returns the value of the '<em><b>Of Type</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.DataType}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.DataType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Type</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInstance_OfType()
	 * @see org.ifc4emf.metamodel.express.core.DataType#getInstances
	 * @model opposite="instances" required="true" ordered="false"
	 * @generated
	 */
	EList<DataType> getOfType();

} // Instance
