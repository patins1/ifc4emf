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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.algorithms.Function;
import org.ifc4emf.metamodel.express.algorithms.FunctionResult;
import org.ifc4emf.metamodel.express.core.impl.ExpressionImpl;
import org.ifc4emf.metamodel.express.expressions.ActualParameter;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.FunctionCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.FunctionCallImpl#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.FunctionCallImpl#getInvokesFunction <em>Invokes Function</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.FunctionCallImpl#getReturnsResult <em>Returns Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionCallImpl extends ExpressionImpl implements FunctionCall {
	/**
	 * The cached value of the '{@link #getActualParameters() <em>Actual Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ActualParameter> actualParameters;

	/**
	 * The cached value of the '{@link #getInvokesFunction() <em>Invokes Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokesFunction()
	 * @generated
	 * @ordered
	 */
	protected Function invokesFunction;

	/**
	 * The cached value of the '{@link #getReturnsResult() <em>Returns Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnsResult()
	 * @generated
	 * @ordered
	 */
	protected FunctionResult returnsResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualParameter> getActualParameters() {
		if (actualParameters == null) {
			actualParameters = new EObjectContainmentWithInverseEList<ActualParameter>(ActualParameter.class, this, ExpressionsPackage.FUNCTION_CALL__ACTUAL_PARAMETERS, ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL);
		}
		return actualParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getInvokesFunction() {
		if (invokesFunction != null && invokesFunction.eIsProxy()) {
			InternalEObject oldInvokesFunction = (InternalEObject)invokesFunction;
			invokesFunction = (Function)eResolveProxy(oldInvokesFunction);
			if (invokesFunction != oldInvokesFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.FUNCTION_CALL__INVOKES_FUNCTION, oldInvokesFunction, invokesFunction));
			}
		}
		return invokesFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetInvokesFunction() {
		return invokesFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokesFunction(Function newInvokesFunction) {
		Function oldInvokesFunction = invokesFunction;
		invokesFunction = newInvokesFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.FUNCTION_CALL__INVOKES_FUNCTION, oldInvokesFunction, invokesFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionResult getReturnsResult() {
		if (returnsResult != null && returnsResult.eIsProxy()) {
			InternalEObject oldReturnsResult = (InternalEObject)returnsResult;
			returnsResult = (FunctionResult)eResolveProxy(oldReturnsResult);
			if (returnsResult != oldReturnsResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.FUNCTION_CALL__RETURNS_RESULT, oldReturnsResult, returnsResult));
			}
		}
		return returnsResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionResult basicGetReturnsResult() {
		return returnsResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnsResult(FunctionResult newReturnsResult) {
		FunctionResult oldReturnsResult = returnsResult;
		returnsResult = newReturnsResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.FUNCTION_CALL__RETURNS_RESULT, oldReturnsResult, returnsResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.FUNCTION_CALL__ACTUAL_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActualParameters()).basicAdd(otherEnd, msgs);
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
			case ExpressionsPackage.FUNCTION_CALL__ACTUAL_PARAMETERS:
				return ((InternalEList<?>)getActualParameters()).basicRemove(otherEnd, msgs);
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
			case ExpressionsPackage.FUNCTION_CALL__ACTUAL_PARAMETERS:
				return getActualParameters();
			case ExpressionsPackage.FUNCTION_CALL__INVOKES_FUNCTION:
				if (resolve) return getInvokesFunction();
				return basicGetInvokesFunction();
			case ExpressionsPackage.FUNCTION_CALL__RETURNS_RESULT:
				if (resolve) return getReturnsResult();
				return basicGetReturnsResult();
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
			case ExpressionsPackage.FUNCTION_CALL__ACTUAL_PARAMETERS:
				getActualParameters().clear();
				getActualParameters().addAll((Collection<? extends ActualParameter>)newValue);
				return;
			case ExpressionsPackage.FUNCTION_CALL__INVOKES_FUNCTION:
				setInvokesFunction((Function)newValue);
				return;
			case ExpressionsPackage.FUNCTION_CALL__RETURNS_RESULT:
				setReturnsResult((FunctionResult)newValue);
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
			case ExpressionsPackage.FUNCTION_CALL__ACTUAL_PARAMETERS:
				getActualParameters().clear();
				return;
			case ExpressionsPackage.FUNCTION_CALL__INVOKES_FUNCTION:
				setInvokesFunction((Function)null);
				return;
			case ExpressionsPackage.FUNCTION_CALL__RETURNS_RESULT:
				setReturnsResult((FunctionResult)null);
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
			case ExpressionsPackage.FUNCTION_CALL__ACTUAL_PARAMETERS:
				return actualParameters != null && !actualParameters.isEmpty();
			case ExpressionsPackage.FUNCTION_CALL__INVOKES_FUNCTION:
				return invokesFunction != null;
			case ExpressionsPackage.FUNCTION_CALL__RETURNS_RESULT:
				return returnsResult != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionCallImpl
