/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.DataType#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getDataType()
 * @model abstract="true"
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Instance}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Instance#getOfType <em>Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getDataType_Instances()
	 * @see org.ifc4emf.metamodel.express.core.Instance#getOfType
	 * @model opposite="ofType" ordered="false"
	 * @generated
	 */
	EList<Instance> getInstances();

} // DataType
