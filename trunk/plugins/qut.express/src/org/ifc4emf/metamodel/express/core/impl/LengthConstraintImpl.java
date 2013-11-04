/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.LengthConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.LengthConstraintImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.LengthConstraintImpl#getIsFixed <em>Is Fixed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LengthConstraintImpl extends DomainConstraintImpl implements LengthConstraint {
	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Integer maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsFixed() <em>Is Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFixed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FIXED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsFixed() <em>Is Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFixed()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFixed = IS_FIXED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LengthConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.LENGTH_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(Integer newMaxLength) {
		Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LENGTH_CONSTRAINT__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFixed() {
		return isFixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFixed(Boolean newIsFixed) {
		Boolean oldIsFixed = isFixed;
		isFixed = newIsFixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LENGTH_CONSTRAINT__IS_FIXED, oldIsFixed, isFixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.LENGTH_CONSTRAINT__MAX_LENGTH:
				return getMaxLength();
			case CorePackage.LENGTH_CONSTRAINT__IS_FIXED:
				return getIsFixed();
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
			case CorePackage.LENGTH_CONSTRAINT__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case CorePackage.LENGTH_CONSTRAINT__IS_FIXED:
				setIsFixed((Boolean)newValue);
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
			case CorePackage.LENGTH_CONSTRAINT__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case CorePackage.LENGTH_CONSTRAINT__IS_FIXED:
				setIsFixed(IS_FIXED_EDEFAULT);
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
			case CorePackage.LENGTH_CONSTRAINT__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case CorePackage.LENGTH_CONSTRAINT__IS_FIXED:
				return IS_FIXED_EDEFAULT == null ? isFixed != null : !IS_FIXED_EDEFAULT.equals(isFixed);
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
		result.append(" (maxLength: ");
		result.append(maxLength);
		result.append(", isFixed: ");
		result.append(isFixed);
		result.append(')');
		return result.toString();
	}

} //LengthConstraintImpl
