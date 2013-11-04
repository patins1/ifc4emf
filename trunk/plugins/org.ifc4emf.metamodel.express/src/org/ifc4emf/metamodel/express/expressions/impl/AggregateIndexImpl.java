/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.expressions.AggregateIndex;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.AggregateIndexImpl#getIndexValue <em>Index Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateIndexImpl extends IndexOperationImpl implements AggregateIndex {
	/**
	 * The cached value of the '{@link #getIndexValue() <em>Index Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexValue()
	 * @generated
	 * @ordered
	 */
	protected Expression indexValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.AGGREGATE_INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIndexValue() {
		return indexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexValue(Expression newIndexValue, NotificationChain msgs) {
		Expression oldIndexValue = indexValue;
		indexValue = newIndexValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.AGGREGATE_INDEX__INDEX_VALUE, oldIndexValue, newIndexValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexValue(Expression newIndexValue) {
		if (newIndexValue != indexValue) {
			NotificationChain msgs = null;
			if (indexValue != null)
				msgs = ((InternalEObject)indexValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.AGGREGATE_INDEX__INDEX_VALUE, null, msgs);
			if (newIndexValue != null)
				msgs = ((InternalEObject)newIndexValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.AGGREGATE_INDEX__INDEX_VALUE, null, msgs);
			msgs = basicSetIndexValue(newIndexValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.AGGREGATE_INDEX__INDEX_VALUE, newIndexValue, newIndexValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.AGGREGATE_INDEX__INDEX_VALUE:
				return basicSetIndexValue(null, msgs);
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
			case ExpressionsPackage.AGGREGATE_INDEX__INDEX_VALUE:
				return getIndexValue();
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
			case ExpressionsPackage.AGGREGATE_INDEX__INDEX_VALUE:
				setIndexValue((Expression)newValue);
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
			case ExpressionsPackage.AGGREGATE_INDEX__INDEX_VALUE:
				setIndexValue((Expression)null);
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
			case ExpressionsPackage.AGGREGATE_INDEX__INDEX_VALUE:
				return indexValue != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregateIndexImpl
