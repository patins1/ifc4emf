/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcQuantityArea;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcQuantityAreaImpl#getAreaValue <em>Area Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcQuantityAreaImpl extends IfcPhysicalSimpleQuantityImpl implements IfcQuantityArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcQuantityAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcQuantityArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAreaValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcQuantityArea_AreaValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaValue(Double newAreaValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcQuantityArea_AreaValue(), newAreaValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAreaValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcQuantityArea_AreaValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAreaValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcQuantityArea_AreaValue());
	}

} //IfcQuantityAreaImpl
