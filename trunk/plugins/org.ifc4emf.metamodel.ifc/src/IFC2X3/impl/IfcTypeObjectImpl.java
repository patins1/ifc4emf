/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPropertySetDefinition;
import IFC2X3.IfcRelDefinesByType;
import IFC2X3.IfcTypeObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTypeObjectImpl#getApplicableOccurrence <em>Applicable Occurrence</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTypeObjectImpl#getHasPropertySets <em>Has Property Sets</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTypeObjectImpl#getObjectTypeOf <em>Object Type Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTypeObjectImpl extends IfcObjectDefinitionImpl implements IfcTypeObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTypeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelDefinesByType getObjectTypeOf() {
		return (IfcRelDefinesByType)eGet(IFC2X3Package.eINSTANCE.getIfcTypeObject_ObjectTypeOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectTypeOf(IfcRelDefinesByType newObjectTypeOf) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTypeObject_ObjectTypeOf(), newObjectTypeOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPropertySetDefinition> getHasPropertySets() {
		return (EList<IfcPropertySetDefinition>)eGet(IFC2X3Package.eINSTANCE.getIfcTypeObject_HasPropertySets(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicableOccurrence() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTypeObject_ApplicableOccurrence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableOccurrence(String newApplicableOccurrence) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTypeObject_ApplicableOccurrence(), newApplicableOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableOccurrence() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTypeObject_ApplicableOccurrence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableOccurrence() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTypeObject_ApplicableOccurrence());
	}

} //IfcTypeObjectImpl
