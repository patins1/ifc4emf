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
 * A representation of the model object '<em><b>Ifc Arbitrary Profile Def With Voids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcArbitraryProfileDefWithVoids#getInnerCurves <em>Inner Curves</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcArbitraryProfileDefWithVoids()
 * @model
 * @generated
 */
public interface IfcArbitraryProfileDefWithVoids extends IfcArbitraryClosedProfileDef {
	/**
	 * Returns the value of the '<em><b>Inner Curves</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcCurve}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Curves</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcArbitraryProfileDefWithVoids_InnerCurves()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcCurve> getInnerCurves();

} // IfcArbitraryProfileDefWithVoids
