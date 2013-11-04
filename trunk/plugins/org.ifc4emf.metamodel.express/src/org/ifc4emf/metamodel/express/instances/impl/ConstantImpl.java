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
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.InstantiableType;
import org.ifc4emf.metamodel.express.core.impl.CommonElementImpl;
import org.ifc4emf.metamodel.express.instances.Constant;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.ConstantImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.ConstantImpl#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.ConstantImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantImpl extends CommonElementImpl implements Constant {
	/**
	 * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression valueExpression;

	/**
	 * The cached value of the '{@link #getActualValue() <em>Actual Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
	protected Instance actualValue;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected InstantiableType dataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValueExpression() {
		if (valueExpression != null && valueExpression.eIsProxy()) {
			InternalEObject oldValueExpression = (InternalEObject)valueExpression;
			valueExpression = (Expression)eResolveProxy(oldValueExpression);
			if (valueExpression != oldValueExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.CONSTANT__VALUE_EXPRESSION, oldValueExpression, valueExpression));
			}
		}
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetValueExpression() {
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueExpression(Expression newValueExpression) {
		Expression oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.CONSTANT__VALUE_EXPRESSION, oldValueExpression, valueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance getActualValue() {
		if (actualValue != null && actualValue.eIsProxy()) {
			InternalEObject oldActualValue = (InternalEObject)actualValue;
			actualValue = (Instance)eResolveProxy(oldActualValue);
			if (actualValue != oldActualValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.CONSTANT__ACTUAL_VALUE, oldActualValue, actualValue));
			}
		}
		return actualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance basicGetActualValue() {
		return actualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualValue(Instance newActualValue) {
		Instance oldActualValue = actualValue;
		actualValue = newActualValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.CONSTANT__ACTUAL_VALUE, oldActualValue, actualValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiableType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (InstantiableType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.CONSTANT__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiableType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(InstantiableType newDataType) {
		InstantiableType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.CONSTANT__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancesPackage.CONSTANT__VALUE_EXPRESSION:
				if (resolve) return getValueExpression();
				return basicGetValueExpression();
			case InstancesPackage.CONSTANT__ACTUAL_VALUE:
				if (resolve) return getActualValue();
				return basicGetActualValue();
			case InstancesPackage.CONSTANT__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
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
			case InstancesPackage.CONSTANT__VALUE_EXPRESSION:
				setValueExpression((Expression)newValue);
				return;
			case InstancesPackage.CONSTANT__ACTUAL_VALUE:
				setActualValue((Instance)newValue);
				return;
			case InstancesPackage.CONSTANT__DATA_TYPE:
				setDataType((InstantiableType)newValue);
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
			case InstancesPackage.CONSTANT__VALUE_EXPRESSION:
				setValueExpression((Expression)null);
				return;
			case InstancesPackage.CONSTANT__ACTUAL_VALUE:
				setActualValue((Instance)null);
				return;
			case InstancesPackage.CONSTANT__DATA_TYPE:
				setDataType((InstantiableType)null);
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
			case InstancesPackage.CONSTANT__VALUE_EXPRESSION:
				return valueExpression != null;
			case InstancesPackage.CONSTANT__ACTUAL_VALUE:
				return actualValue != null;
			case InstancesPackage.CONSTANT__DATA_TYPE:
				return dataType != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstantImpl
