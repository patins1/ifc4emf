/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.core.ArrayBound;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.GeneralARRAYType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General ARRAY Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.GeneralARRAYTypeImpl#getHiIndex <em>Hi Index</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.GeneralARRAYTypeImpl#getLoIndex <em>Lo Index</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.GeneralARRAYTypeImpl#getIsOptional <em>Is Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralARRAYTypeImpl extends GeneralAggregationTypeImpl implements GeneralARRAYType {
	/**
	 * The cached value of the '{@link #getHiIndex() <em>Hi Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiIndex()
	 * @generated
	 * @ordered
	 */
	protected ArrayBound hiIndex;

	/**
	 * The cached value of the '{@link #getLoIndex() <em>Lo Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoIndex()
	 * @generated
	 * @ordered
	 */
	protected ArrayBound loIndex;

	/**
	 * The default value of the '{@link #getIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_OPTIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOptional()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralARRAYTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.GENERAL_ARRAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayBound getHiIndex() {
		return hiIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHiIndex(ArrayBound newHiIndex, NotificationChain msgs) {
		ArrayBound oldHiIndex = hiIndex;
		hiIndex = newHiIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GENERAL_ARRAY_TYPE__HI_INDEX, oldHiIndex, newHiIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiIndex(ArrayBound newHiIndex) {
		if (newHiIndex != hiIndex) {
			NotificationChain msgs = null;
			if (hiIndex != null)
				msgs = ((InternalEObject)hiIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GENERAL_ARRAY_TYPE__HI_INDEX, null, msgs);
			if (newHiIndex != null)
				msgs = ((InternalEObject)newHiIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GENERAL_ARRAY_TYPE__HI_INDEX, null, msgs);
			msgs = basicSetHiIndex(newHiIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENERAL_ARRAY_TYPE__HI_INDEX, newHiIndex, newHiIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayBound getLoIndex() {
		return loIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoIndex(ArrayBound newLoIndex, NotificationChain msgs) {
		ArrayBound oldLoIndex = loIndex;
		loIndex = newLoIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GENERAL_ARRAY_TYPE__LO_INDEX, oldLoIndex, newLoIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoIndex(ArrayBound newLoIndex) {
		if (newLoIndex != loIndex) {
			NotificationChain msgs = null;
			if (loIndex != null)
				msgs = ((InternalEObject)loIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GENERAL_ARRAY_TYPE__LO_INDEX, null, msgs);
			if (newLoIndex != null)
				msgs = ((InternalEObject)newLoIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GENERAL_ARRAY_TYPE__LO_INDEX, null, msgs);
			msgs = basicSetLoIndex(newLoIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENERAL_ARRAY_TYPE__LO_INDEX, newLoIndex, newLoIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(Boolean newIsOptional) {
		Boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENERAL_ARRAY_TYPE__IS_OPTIONAL, oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GENERAL_ARRAY_TYPE__HI_INDEX:
				return basicSetHiIndex(null, msgs);
			case CorePackage.GENERAL_ARRAY_TYPE__LO_INDEX:
				return basicSetLoIndex(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.GENERAL_ARRAY_TYPE__HI_INDEX:
				return getHiIndex();
			case CorePackage.GENERAL_ARRAY_TYPE__LO_INDEX:
				return getLoIndex();
			case CorePackage.GENERAL_ARRAY_TYPE__IS_OPTIONAL:
				return getIsOptional();
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
			case CorePackage.GENERAL_ARRAY_TYPE__HI_INDEX:
				setHiIndex((ArrayBound)newValue);
				return;
			case CorePackage.GENERAL_ARRAY_TYPE__LO_INDEX:
				setLoIndex((ArrayBound)newValue);
				return;
			case CorePackage.GENERAL_ARRAY_TYPE__IS_OPTIONAL:
				setIsOptional((Boolean)newValue);
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
			case CorePackage.GENERAL_ARRAY_TYPE__HI_INDEX:
				setHiIndex((ArrayBound)null);
				return;
			case CorePackage.GENERAL_ARRAY_TYPE__LO_INDEX:
				setLoIndex((ArrayBound)null);
				return;
			case CorePackage.GENERAL_ARRAY_TYPE__IS_OPTIONAL:
				setIsOptional(IS_OPTIONAL_EDEFAULT);
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
			case CorePackage.GENERAL_ARRAY_TYPE__HI_INDEX:
				return hiIndex != null;
			case CorePackage.GENERAL_ARRAY_TYPE__LO_INDEX:
				return loIndex != null;
			case CorePackage.GENERAL_ARRAY_TYPE__IS_OPTIONAL:
				return IS_OPTIONAL_EDEFAULT == null ? isOptional != null : !IS_OPTIONAL_EDEFAULT.equals(isOptional);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOptional: ");
		result.append(isOptional);
		result.append(')');
		return result.toString();
	}

} //GeneralARRAYTypeImpl
