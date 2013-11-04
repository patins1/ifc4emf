/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Texture Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTextureVertex#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTextureVertex()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface IfcTextureVertex extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcTextureVertex_Coordinates()
	 * @model unique="false" dataType="IFC2X3.REAL" lower="2" upper="2"
	 * @generated
	 */
	EList<Double> getCoordinates();

} // IfcTextureVertex
