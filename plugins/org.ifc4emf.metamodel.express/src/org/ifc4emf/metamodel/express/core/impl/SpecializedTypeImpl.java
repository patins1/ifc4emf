/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.core.ConcreteType;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.SpecializedType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialized Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SpecializedTypeImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecializedTypeImpl extends DefinedTypeImpl implements SpecializedType {
	/**
	 * The cached value of the '{@link #getUnderlyingType() <em>Underlying Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlyingType()
	 * @generated
	 * @ordered
	 */
	protected ConcreteType underlyingType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SPECIALIZED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteType getUnderlyingType() {
		if (underlyingType != null && underlyingType.eIsProxy()) {
			InternalEObject oldUnderlyingType = (InternalEObject)underlyingType;
			underlyingType = (ConcreteType)eResolveProxy(oldUnderlyingType);
			if (underlyingType != oldUnderlyingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.SPECIALIZED_TYPE__UNDERLYING_TYPE, oldUnderlyingType, underlyingType));
			}
		}
		return underlyingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteType basicGetUnderlyingType() {
		return underlyingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderlyingType(ConcreteType newUnderlyingType) {
		ConcreteType oldUnderlyingType = underlyingType;
		underlyingType = newUnderlyingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SPECIALIZED_TYPE__UNDERLYING_TYPE, oldUnderlyingType, underlyingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SPECIALIZED_TYPE__UNDERLYING_TYPE:
				if (resolve) return getUnderlyingType();
				return basicGetUnderlyingType();
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
			case CorePackage.SPECIALIZED_TYPE__UNDERLYING_TYPE:
				setUnderlyingType((ConcreteType)newValue);
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
			case CorePackage.SPECIALIZED_TYPE__UNDERLYING_TYPE:
				setUnderlyingType((ConcreteType)null);
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
			case CorePackage.SPECIALIZED_TYPE__UNDERLYING_TYPE:
				return underlyingType != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecializedTypeImpl
