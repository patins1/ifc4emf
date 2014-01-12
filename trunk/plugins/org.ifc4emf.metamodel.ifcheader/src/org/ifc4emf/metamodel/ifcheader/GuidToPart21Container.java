/**
 */
package org.ifc4emf.metamodel.ifcheader;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guid To Part21 Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.GuidToPart21Container#getGuidToPart21 <em>Guid To Part21</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getGuidToPart21Container()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface GuidToPart21Container extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Guid To Part21</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guid To Part21</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid To Part21</em>' map.
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getGuidToPart21Container_GuidToPart21()
	 * @model mapType="org.ifc4emf.metamodel.ifcheader.GuidToPart21Map<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	EMap<String, Integer> getGuidToPart21();

} // GuidToPart21Container
