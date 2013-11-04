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
import org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.GenericType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.GenericTypeImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.GenericTypeImpl#getIsEntity <em>Is Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericTypeImpl extends GeneralizedTypeImpl implements GenericType {
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected ActualTypeConstraint constraint;

	/**
	 * The default value of the '{@link #getIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEntity()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEntity()
	 * @generated
	 * @ordered
	 */
	protected Boolean isEntity = IS_ENTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.GENERIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualTypeConstraint getConstraint() {
		if (constraint != null && constraint.eIsProxy()) {
			InternalEObject oldConstraint = (InternalEObject)constraint;
			constraint = (ActualTypeConstraint)eResolveProxy(oldConstraint);
			if (constraint != oldConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.GENERIC_TYPE__CONSTRAINT, oldConstraint, constraint));
			}
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualTypeConstraint basicGetConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(ActualTypeConstraint newConstraint, NotificationChain msgs) {
		ActualTypeConstraint oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GENERIC_TYPE__CONSTRAINT, oldConstraint, newConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(ActualTypeConstraint newConstraint) {
		if (newConstraint != constraint) {
			NotificationChain msgs = null;
			if (constraint != null)
				msgs = ((InternalEObject)constraint).eInverseRemove(this, AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE, ActualTypeConstraint.class, msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject)newConstraint).eInverseAdd(this, AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE, ActualTypeConstraint.class, msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENERIC_TYPE__CONSTRAINT, newConstraint, newConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsEntity() {
		return isEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEntity(Boolean newIsEntity) {
		Boolean oldIsEntity = isEntity;
		isEntity = newIsEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENERIC_TYPE__IS_ENTITY, oldIsEntity, isEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GENERIC_TYPE__CONSTRAINT:
				if (constraint != null)
					msgs = ((InternalEObject)constraint).eInverseRemove(this, AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE, ActualTypeConstraint.class, msgs);
				return basicSetConstraint((ActualTypeConstraint)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GENERIC_TYPE__CONSTRAINT:
				return basicSetConstraint(null, msgs);
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
			case CorePackage.GENERIC_TYPE__CONSTRAINT:
				if (resolve) return getConstraint();
				return basicGetConstraint();
			case CorePackage.GENERIC_TYPE__IS_ENTITY:
				return getIsEntity();
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
			case CorePackage.GENERIC_TYPE__CONSTRAINT:
				setConstraint((ActualTypeConstraint)newValue);
				return;
			case CorePackage.GENERIC_TYPE__IS_ENTITY:
				setIsEntity((Boolean)newValue);
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
			case CorePackage.GENERIC_TYPE__CONSTRAINT:
				setConstraint((ActualTypeConstraint)null);
				return;
			case CorePackage.GENERIC_TYPE__IS_ENTITY:
				setIsEntity(IS_ENTITY_EDEFAULT);
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
			case CorePackage.GENERIC_TYPE__CONSTRAINT:
				return constraint != null;
			case CorePackage.GENERIC_TYPE__IS_ENTITY:
				return IS_ENTITY_EDEFAULT == null ? isEntity != null : !IS_ENTITY_EDEFAULT.equals(isEntity);
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
		result.append(" (isEntity: ");
		result.append(isEntity);
		result.append(')');
		return result.toString();
	}

} //GenericTypeImpl
