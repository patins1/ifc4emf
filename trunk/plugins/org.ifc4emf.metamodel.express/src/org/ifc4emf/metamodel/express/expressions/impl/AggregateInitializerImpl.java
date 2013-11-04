/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.impl.ExpressionImpl;
import org.ifc4emf.metamodel.express.expressions.AggregateInitializer;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.MemberBinding;
import org.ifc4emf.metamodel.express.instances.GenericAggregate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.AggregateInitializerImpl#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.AggregateInitializerImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateInitializerImpl extends ExpressionImpl implements AggregateInitializer {
	/**
	 * The cached value of the '{@link #getResultValue() <em>Result Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected GenericAggregate resultValue;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberBinding> bindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.AGGREGATE_INITIALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAggregate getResultValue() {
		if (resultValue != null && resultValue.eIsProxy()) {
			InternalEObject oldResultValue = (InternalEObject)resultValue;
			resultValue = (GenericAggregate)eResolveProxy(oldResultValue);
			if (resultValue != oldResultValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.AGGREGATE_INITIALIZER__RESULT_VALUE, oldResultValue, resultValue));
			}
		}
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAggregate basicGetResultValue() {
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultValue(GenericAggregate newResultValue) {
		GenericAggregate oldResultValue = resultValue;
		resultValue = newResultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.AGGREGATE_INITIALIZER__RESULT_VALUE, oldResultValue, resultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<MemberBinding>(MemberBinding.class, this, ExpressionsPackage.AGGREGATE_INITIALIZER__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.AGGREGATE_INITIALIZER__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case ExpressionsPackage.AGGREGATE_INITIALIZER__RESULT_VALUE:
				if (resolve) return getResultValue();
				return basicGetResultValue();
			case ExpressionsPackage.AGGREGATE_INITIALIZER__BINDINGS:
				return getBindings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.AGGREGATE_INITIALIZER__RESULT_VALUE:
				setResultValue((GenericAggregate)newValue);
				return;
			case ExpressionsPackage.AGGREGATE_INITIALIZER__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends MemberBinding>)newValue);
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
			case ExpressionsPackage.AGGREGATE_INITIALIZER__RESULT_VALUE:
				setResultValue((GenericAggregate)null);
				return;
			case ExpressionsPackage.AGGREGATE_INITIALIZER__BINDINGS:
				getBindings().clear();
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
			case ExpressionsPackage.AGGREGATE_INITIALIZER__RESULT_VALUE:
				return resultValue != null;
			case ExpressionsPackage.AGGREGATE_INITIALIZER__BINDINGS:
				return bindings != null && !bindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AggregateInitializerImpl
