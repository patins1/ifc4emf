/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcObjectDefinition;
import IFC2X3.IfcRelAssigns;
import IFC2X3.IfcRelDecomposes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Object Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcObjectDefinitionImpl#getHasAssignments <em>Has Assignments</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcObjectDefinitionImpl#getIsDecomposedBy <em>Is Decomposed By</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcObjectDefinitionImpl#getDecomposes <em>Decomposes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcObjectDefinitionImpl extends IfcRootImpl implements IfcObjectDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcObjectDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcObjectDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssigns> getHasAssignments() {
		return (EList<IfcRelAssigns>)eGet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_HasAssignments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelDecomposes> getIsDecomposedBy() {
		return (EList<IfcRelDecomposes>)eGet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_IsDecomposedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelDecomposes getDecomposes() {
		return (IfcRelDecomposes)eGet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_Decomposes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposes(IfcRelDecomposes newDecomposes) {
		eSet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_Decomposes(), newDecomposes);
	}

} //IfcObjectDefinitionImpl
