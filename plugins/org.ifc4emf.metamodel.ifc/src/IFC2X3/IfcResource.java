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
 * A representation of the model object '<em><b>Ifc Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcResource#getResourceOf <em>Resource Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcResource()
 * @model
 * @generated
 */
public interface IfcResource extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Resource Of</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelAssignsToResource}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelAssignsToResource#getRelatingResource <em>Relating Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Of</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcResource_ResourceOf()
	 * @see IFC2X3.IfcRelAssignsToResource#getRelatingResource
	 * @model opposite="RelatingResource" ordered="false"
	 * @generated
	 */
	EList<IfcRelAssignsToResource> getResourceOf();

} // IfcResource
