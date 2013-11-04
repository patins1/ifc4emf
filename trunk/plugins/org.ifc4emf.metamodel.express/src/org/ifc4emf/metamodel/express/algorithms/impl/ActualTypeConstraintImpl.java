/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.ifc4emf.metamodel.express.algorithms.ActualDataType;
import org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.GenericType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Type Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualTypeConstraintImpl#getMatchingType <em>Matching Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualTypeConstraintImpl#getRequiredType <em>Required Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualTypeConstraintImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActualTypeConstraintImpl extends EObjectImpl implements ActualTypeConstraint {
	/**
	 * The cached value of the '{@link #getMatchingType() <em>Matching Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingType()
	 * @generated
	 * @ordered
	 */
	protected GenericType matchingType;

	/**
	 * The cached value of the '{@link #getRequiredType() <em>Required Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredType()
	 * @generated
	 * @ordered
	 */
	protected ActualDataType requiredType;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActualTypeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmsPackage.Literals.ACTUAL_TYPE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericType getMatchingType() {
		if (matchingType != null && matchingType.eIsProxy()) {
			InternalEObject oldMatchingType = (InternalEObject)matchingType;
			matchingType = (GenericType)eResolveProxy(oldMatchingType);
			if (matchingType != oldMatchingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE, oldMatchingType, matchingType));
			}
		}
		return matchingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericType basicGetMatchingType() {
		return matchingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchingType(GenericType newMatchingType, NotificationChain msgs) {
		GenericType oldMatchingType = matchingType;
		matchingType = newMatchingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE, oldMatchingType, newMatchingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingType(GenericType newMatchingType) {
		if (newMatchingType != matchingType) {
			NotificationChain msgs = null;
			if (matchingType != null)
				msgs = ((InternalEObject)matchingType).eInverseRemove(this, CorePackage.GENERIC_TYPE__CONSTRAINT, GenericType.class, msgs);
			if (newMatchingType != null)
				msgs = ((InternalEObject)newMatchingType).eInverseAdd(this, CorePackage.GENERIC_TYPE__CONSTRAINT, GenericType.class, msgs);
			msgs = basicSetMatchingType(newMatchingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE, newMatchingType, newMatchingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualDataType getRequiredType() {
		if (requiredType != null && requiredType.eIsProxy()) {
			InternalEObject oldRequiredType = (InternalEObject)requiredType;
			requiredType = (ActualDataType)eResolveProxy(oldRequiredType);
			if (requiredType != oldRequiredType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__REQUIRED_TYPE, oldRequiredType, requiredType));
			}
		}
		return requiredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualDataType basicGetRequiredType() {
		return requiredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredType(ActualDataType newRequiredType) {
		ActualDataType oldRequiredType = requiredType;
		requiredType = newRequiredType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__REQUIRED_TYPE, oldRequiredType, requiredType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE:
				if (matchingType != null)
					msgs = ((InternalEObject)matchingType).eInverseRemove(this, CorePackage.GENERIC_TYPE__CONSTRAINT, GenericType.class, msgs);
				return basicSetMatchingType((GenericType)otherEnd, msgs);
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
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE:
				return basicSetMatchingType(null, msgs);
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
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE:
				if (resolve) return getMatchingType();
				return basicGetMatchingType();
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__REQUIRED_TYPE:
				if (resolve) return getRequiredType();
				return basicGetRequiredType();
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__LABEL:
				return getLabel();
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
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE:
				setMatchingType((GenericType)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__REQUIRED_TYPE:
				setRequiredType((ActualDataType)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__LABEL:
				setLabel((String)newValue);
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
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE:
				setMatchingType((GenericType)null);
				return;
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__REQUIRED_TYPE:
				setRequiredType((ActualDataType)null);
				return;
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE:
				return matchingType != null;
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__REQUIRED_TYPE:
				return requiredType != null;
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ActualTypeConstraintImpl
