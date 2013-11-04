/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDirection#getDirectionRatios <em>Direction Ratios</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDirection()
 * @model
 * @generated
 */
public interface IfcDirection extends IfcVectorOrDirection, IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Direction Ratios</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Ratios</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Ratios</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcDirection_DirectionRatios()
	 * @model unique="false" dataType="IFC2X3.REAL" lower="2" upper="3"
	 * @generated
	 */
	EList<Double> getDirectionRatios();

} // IfcDirection
