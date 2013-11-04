/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcEnergyProperties;
import IFC2X3.IfcEnergySequenceEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Energy Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcEnergyPropertiesImpl#getEnergySequence <em>Energy Sequence</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcEnergyPropertiesImpl#getUserDefinedEnergySequence <em>User Defined Energy Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEnergyPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcEnergyProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEnergyPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcEnergyProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedEnergySequence() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcEnergyProperties_UserDefinedEnergySequence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedEnergySequence(String newUserDefinedEnergySequence) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEnergyProperties_UserDefinedEnergySequence(), newUserDefinedEnergySequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedEnergySequence() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcEnergyProperties_UserDefinedEnergySequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedEnergySequence() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcEnergyProperties_UserDefinedEnergySequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnergySequenceEnum getEnergySequence() {
		return (IfcEnergySequenceEnum)eGet(IFC2X3Package.eINSTANCE.getIfcEnergyProperties_EnergySequence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergySequence(IfcEnergySequenceEnum newEnergySequence) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEnergyProperties_EnergySequence(), newEnergySequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnergySequence() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcEnergyProperties_EnergySequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnergySequence() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcEnergyProperties_EnergySequence());
	}

} //IfcEnergyPropertiesImpl
