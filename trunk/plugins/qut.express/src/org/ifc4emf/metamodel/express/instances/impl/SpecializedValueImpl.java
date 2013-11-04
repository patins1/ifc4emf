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
import org.ifc4emf.metamodel.express.instances.ConcreteValue;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.SpecializedValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialized Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.SpecializedValueImpl#getFundamentalValue <em>Fundamental Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecializedValueImpl extends TypedInstanceImpl implements SpecializedValue {
	/**
	 * The cached value of the '{@link #getFundamentalValue() <em>Fundamental Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundamentalValue()
	 * @generated
	 * @ordered
	 */
	protected ConcreteValue fundamentalValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.SPECIALIZED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteValue getFundamentalValue() {
		if (fundamentalValue != null && fundamentalValue.eIsProxy()) {
			InternalEObject oldFundamentalValue = (InternalEObject)fundamentalValue;
			fundamentalValue = (ConcreteValue)eResolveProxy(oldFundamentalValue);
			if (fundamentalValue != oldFundamentalValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.SPECIALIZED_VALUE__FUNDAMENTAL_VALUE, oldFundamentalValue, fundamentalValue));
			}
		}
		return fundamentalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteValue basicGetFundamentalValue() {
		return fundamentalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundamentalValue(ConcreteValue newFundamentalValue) {
		ConcreteValue oldFundamentalValue = fundamentalValue;
		fundamentalValue = newFundamentalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.SPECIALIZED_VALUE__FUNDAMENTAL_VALUE, oldFundamentalValue, fundamentalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancesPackage.SPECIALIZED_VALUE__FUNDAMENTAL_VALUE:
				if (resolve) return getFundamentalValue();
				return basicGetFundamentalValue();
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
			case InstancesPackage.SPECIALIZED_VALUE__FUNDAMENTAL_VALUE:
				setFundamentalValue((ConcreteValue)newValue);
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
			case InstancesPackage.SPECIALIZED_VALUE__FUNDAMENTAL_VALUE:
				setFundamentalValue((ConcreteValue)null);
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
			case InstancesPackage.SPECIALIZED_VALUE__FUNDAMENTAL_VALUE:
				return fundamentalValue != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecializedValueImpl
