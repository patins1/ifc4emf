/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcStructuralLoadSingleDisplacementDistortion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Displacement Distortion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleDisplacementDistortionImpl#getDistortion <em>Distortion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadSingleDisplacementDistortionImpl extends IfcStructuralLoadSingleDisplacementImpl implements IfcStructuralLoadSingleDisplacementDistortion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadSingleDisplacementDistortionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDistortion() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_Distortion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistortion(Double newDistortion) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_Distortion(), newDistortion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistortion() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_Distortion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistortion() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion_Distortion());
	}

} //IfcStructuralLoadSingleDisplacementDistortionImpl
