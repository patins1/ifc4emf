/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.algorithms.impl.NamedVariableImpl;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.statements.ControlVariable;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.ControlVariableImpl#getBoundValue <em>Bound Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.ControlVariableImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.ControlVariableImpl#getIncrement <em>Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlVariableImpl extends NamedVariableImpl implements ControlVariable {
	/**
	 * The cached value of the '{@link #getBoundValue() <em>Bound Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundValue()
	 * @generated
	 * @ordered
	 */
	protected Expression boundValue;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected Expression initialValue;

	/**
	 * The cached value of the '{@link #getIncrement() <em>Increment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected Expression increment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.CONTROL_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBoundValue() {
		if (boundValue != null && boundValue.eIsProxy()) {
			InternalEObject oldBoundValue = (InternalEObject)boundValue;
			boundValue = (Expression)eResolveProxy(oldBoundValue);
			if (boundValue != oldBoundValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.CONTROL_VARIABLE__BOUND_VALUE, oldBoundValue, boundValue));
			}
		}
		return boundValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetBoundValue() {
		return boundValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundValue(Expression newBoundValue) {
		Expression oldBoundValue = boundValue;
		boundValue = newBoundValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.CONTROL_VARIABLE__BOUND_VALUE, oldBoundValue, boundValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitialValue() {
		if (initialValue != null && initialValue.eIsProxy()) {
			InternalEObject oldInitialValue = (InternalEObject)initialValue;
			initialValue = (Expression)eResolveProxy(oldInitialValue);
			if (initialValue != oldInitialValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.CONTROL_VARIABLE__INITIAL_VALUE, oldInitialValue, initialValue));
			}
		}
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(Expression newInitialValue) {
		Expression oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.CONTROL_VARIABLE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIncrement() {
		if (increment != null && increment.eIsProxy()) {
			InternalEObject oldIncrement = (InternalEObject)increment;
			increment = (Expression)eResolveProxy(oldIncrement);
			if (increment != oldIncrement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.CONTROL_VARIABLE__INCREMENT, oldIncrement, increment));
			}
		}
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetIncrement() {
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(Expression newIncrement) {
		Expression oldIncrement = increment;
		increment = newIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.CONTROL_VARIABLE__INCREMENT, oldIncrement, increment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatementsPackage.CONTROL_VARIABLE__BOUND_VALUE:
				if (resolve) return getBoundValue();
				return basicGetBoundValue();
			case StatementsPackage.CONTROL_VARIABLE__INITIAL_VALUE:
				if (resolve) return getInitialValue();
				return basicGetInitialValue();
			case StatementsPackage.CONTROL_VARIABLE__INCREMENT:
				if (resolve) return getIncrement();
				return basicGetIncrement();
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
			case StatementsPackage.CONTROL_VARIABLE__BOUND_VALUE:
				setBoundValue((Expression)newValue);
				return;
			case StatementsPackage.CONTROL_VARIABLE__INITIAL_VALUE:
				setInitialValue((Expression)newValue);
				return;
			case StatementsPackage.CONTROL_VARIABLE__INCREMENT:
				setIncrement((Expression)newValue);
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
			case StatementsPackage.CONTROL_VARIABLE__BOUND_VALUE:
				setBoundValue((Expression)null);
				return;
			case StatementsPackage.CONTROL_VARIABLE__INITIAL_VALUE:
				setInitialValue((Expression)null);
				return;
			case StatementsPackage.CONTROL_VARIABLE__INCREMENT:
				setIncrement((Expression)null);
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
			case StatementsPackage.CONTROL_VARIABLE__BOUND_VALUE:
				return boundValue != null;
			case StatementsPackage.CONTROL_VARIABLE__INITIAL_VALUE:
				return initialValue != null;
			case StatementsPackage.CONTROL_VARIABLE__INCREMENT:
				return increment != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlVariableImpl
