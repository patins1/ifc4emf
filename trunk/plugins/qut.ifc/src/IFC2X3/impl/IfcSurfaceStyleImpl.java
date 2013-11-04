/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcSurfaceSide;
import IFC2X3.IfcSurfaceStyle;
import IFC2X3.IfcSurfaceStyleElementSelect;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleImpl#getSide <em>Side</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceStyleImpl extends IfcPresentationStyleImpl implements IfcSurfaceStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSurfaceStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcSurfaceStyleElementSelect> getStyles() {
		return (EList<IfcSurfaceStyleElementSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyle_Styles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceSide getSide() {
		return (IfcSurfaceSide)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyle_Side(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSide(IfcSurfaceSide newSide) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyle_Side(), newSide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSide() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSurfaceStyle_Side());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSide() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyle_Side());
	}

} //IfcSurfaceStyleImpl
