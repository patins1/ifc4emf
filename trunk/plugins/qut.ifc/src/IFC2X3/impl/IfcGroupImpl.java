/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcGroup;
import IFC2X3.IfcRelAssignsToGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcGroupImpl#getIsGroupedBy <em>Is Grouped By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGroupImpl extends IfcObjectImpl implements IfcGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsToGroup getIsGroupedBy() {
		return (IfcRelAssignsToGroup)eGet(IFC2X3Package.eINSTANCE.getIfcGroup_IsGroupedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGroupedBy(IfcRelAssignsToGroup newIsGroupedBy) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGroup_IsGroupedBy(), newIsGroupedBy);
	}

} //IfcGroupImpl
