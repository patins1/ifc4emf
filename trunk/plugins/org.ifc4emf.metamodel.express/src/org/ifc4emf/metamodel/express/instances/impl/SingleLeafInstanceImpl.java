/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.SingleLeafInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Leaf Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.SingleLeafInstanceImpl#getCharacterizingType <em>Characterizing Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleLeafInstanceImpl extends EntityInstanceImpl implements SingleLeafInstance {
	/**
	 * The cached value of the '{@link #getCharacterizingType() <em>Characterizing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterizingType()
	 * @generated
	 * @ordered
	 */
	protected EntityType characterizingType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleLeafInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.SINGLE_LEAF_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getCharacterizingType() {
		if (characterizingType != null && characterizingType.eIsProxy()) {
			InternalEObject oldCharacterizingType = (InternalEObject)characterizingType;
			characterizingType = (EntityType)eResolveProxy(oldCharacterizingType);
			if (characterizingType != oldCharacterizingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.SINGLE_LEAF_INSTANCE__CHARACTERIZING_TYPE, oldCharacterizingType, characterizingType));
			}
		}
		return characterizingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetCharacterizingType() {
		return characterizingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterizingType(EntityType newCharacterizingType) {
		EntityType oldCharacterizingType = characterizingType;
		characterizingType = newCharacterizingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.SINGLE_LEAF_INSTANCE__CHARACTERIZING_TYPE, oldCharacterizingType, characterizingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancesPackage.SINGLE_LEAF_INSTANCE__CHARACTERIZING_TYPE:
				if (resolve) return getCharacterizingType();
				return basicGetCharacterizingType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstancesPackage.SINGLE_LEAF_INSTANCE__CHARACTERIZING_TYPE:
				setCharacterizingType((EntityType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InstancesPackage.SINGLE_LEAF_INSTANCE__CHARACTERIZING_TYPE:
				setCharacterizingType((EntityType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstancesPackage.SINGLE_LEAF_INSTANCE__CHARACTERIZING_TYPE:
				return characterizingType != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleLeafInstanceImpl
