/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.impl.ExpressionImpl;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.IndexOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.IndexOperationImpl#getBaseValue <em>Base Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IndexOperationImpl extends ExpressionImpl implements IndexOperation {
	/**
	 * The cached value of the '{@link #getBaseValue() <em>Base Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseValue()
	 * @generated
	 * @ordered
	 */
	protected Expression baseValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.INDEX_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBaseValue() {
		if (baseValue != null && baseValue.eIsProxy()) {
			InternalEObject oldBaseValue = (InternalEObject)baseValue;
			baseValue = (Expression)eResolveProxy(oldBaseValue);
			if (baseValue != oldBaseValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.INDEX_OPERATION__BASE_VALUE, oldBaseValue, baseValue));
			}
		}
		return baseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetBaseValue() {
		return baseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseValue(Expression newBaseValue) {
		Expression oldBaseValue = baseValue;
		baseValue = newBaseValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INDEX_OPERATION__BASE_VALUE, oldBaseValue, baseValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.INDEX_OPERATION__BASE_VALUE:
				if (resolve) return getBaseValue();
				return basicGetBaseValue();
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
			case ExpressionsPackage.INDEX_OPERATION__BASE_VALUE:
				setBaseValue((Expression)newValue);
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
			case ExpressionsPackage.INDEX_OPERATION__BASE_VALUE:
				setBaseValue((Expression)null);
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
			case ExpressionsPackage.INDEX_OPERATION__BASE_VALUE:
				return baseValue != null;
		}
		return super.eIsSet(featureID);
	}

} //IndexOperationImpl
