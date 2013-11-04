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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.ifc4emf.metamodel.express.algorithms.Parameter;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.expressions.ActualParameter;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.FunctionCall;
import org.ifc4emf.metamodel.express.statements.ProcedureCall;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;
import org.ifc4emf.metamodel.express.statements.VARExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.ActualParameterImpl#getInProcedureCall <em>In Procedure Call</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.ActualParameterImpl#getInFunctionCall <em>In Function Call</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.ActualParameterImpl#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.ActualParameterImpl#getActualReferent <em>Actual Referent</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.ActualParameterImpl#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.ActualParameterImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActualParameterImpl extends EObjectImpl implements ActualParameter {
	/**
	 * The cached value of the '{@link #getFormalParameter() <em>Formal Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter formalParameter;

	/**
	 * The cached value of the '{@link #getActualReferent() <em>Actual Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualReferent()
	 * @generated
	 * @ordered
	 */
	protected VARExpression actualReferent;

	/**
	 * The cached value of the '{@link #getActualValue() <em>Actual Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
	protected Expression actualValue;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Integer position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActualParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.ACTUAL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureCall getInProcedureCall() {
		if (eContainerFeatureID() != ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL) return null;
		return (ProcedureCall)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInProcedureCall(ProcedureCall newInProcedureCall, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInProcedureCall, ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInProcedureCall(ProcedureCall newInProcedureCall) {
		if (newInProcedureCall != eInternalContainer() || (eContainerFeatureID() != ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL && newInProcedureCall != null)) {
			if (EcoreUtil.isAncestor(this, newInProcedureCall))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInProcedureCall != null)
				msgs = ((InternalEObject)newInProcedureCall).eInverseAdd(this, StatementsPackage.PROCEDURE_CALL__ACTUAL_PARAMETERS, ProcedureCall.class, msgs);
			msgs = basicSetInProcedureCall(newInProcedureCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL, newInProcedureCall, newInProcedureCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall getInFunctionCall() {
		if (eContainerFeatureID() != ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL) return null;
		return (FunctionCall)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInFunctionCall(FunctionCall newInFunctionCall, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInFunctionCall, ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInFunctionCall(FunctionCall newInFunctionCall) {
		if (newInFunctionCall != eInternalContainer() || (eContainerFeatureID() != ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL && newInFunctionCall != null)) {
			if (EcoreUtil.isAncestor(this, newInFunctionCall))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInFunctionCall != null)
				msgs = ((InternalEObject)newInFunctionCall).eInverseAdd(this, ExpressionsPackage.FUNCTION_CALL__ACTUAL_PARAMETERS, FunctionCall.class, msgs);
			msgs = basicSetInFunctionCall(newInFunctionCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL, newInFunctionCall, newInFunctionCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getFormalParameter() {
		if (formalParameter != null && formalParameter.eIsProxy()) {
			InternalEObject oldFormalParameter = (InternalEObject)formalParameter;
			formalParameter = (Parameter)eResolveProxy(oldFormalParameter);
			if (formalParameter != oldFormalParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.ACTUAL_PARAMETER__FORMAL_PARAMETER, oldFormalParameter, formalParameter));
			}
		}
		return formalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetFormalParameter() {
		return formalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalParameter(Parameter newFormalParameter) {
		Parameter oldFormalParameter = formalParameter;
		formalParameter = newFormalParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ACTUAL_PARAMETER__FORMAL_PARAMETER, oldFormalParameter, formalParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VARExpression getActualReferent() {
		if (actualReferent != null && actualReferent.eIsProxy()) {
			InternalEObject oldActualReferent = (InternalEObject)actualReferent;
			actualReferent = (VARExpression)eResolveProxy(oldActualReferent);
			if (actualReferent != oldActualReferent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_REFERENT, oldActualReferent, actualReferent));
			}
		}
		return actualReferent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VARExpression basicGetActualReferent() {
		return actualReferent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualReferent(VARExpression newActualReferent) {
		VARExpression oldActualReferent = actualReferent;
		actualReferent = newActualReferent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_REFERENT, oldActualReferent, actualReferent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getActualValue() {
		if (actualValue != null && actualValue.eIsProxy()) {
			InternalEObject oldActualValue = (InternalEObject)actualValue;
			actualValue = (Expression)eResolveProxy(oldActualValue);
			if (actualValue != oldActualValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_VALUE, oldActualValue, actualValue));
			}
		}
		return actualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetActualValue() {
		return actualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualValue(Expression newActualValue) {
		Expression oldActualValue = actualValue;
		actualValue = newActualValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_VALUE, oldActualValue, actualValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Integer newPosition) {
		Integer oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ACTUAL_PARAMETER__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInProcedureCall((ProcedureCall)otherEnd, msgs);
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInFunctionCall((FunctionCall)otherEnd, msgs);
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
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL:
				return basicSetInProcedureCall(null, msgs);
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL:
				return basicSetInFunctionCall(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL:
				return eInternalContainer().eInverseRemove(this, StatementsPackage.PROCEDURE_CALL__ACTUAL_PARAMETERS, ProcedureCall.class, msgs);
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL:
				return eInternalContainer().eInverseRemove(this, ExpressionsPackage.FUNCTION_CALL__ACTUAL_PARAMETERS, FunctionCall.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL:
				return getInProcedureCall();
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL:
				return getInFunctionCall();
			case ExpressionsPackage.ACTUAL_PARAMETER__FORMAL_PARAMETER:
				if (resolve) return getFormalParameter();
				return basicGetFormalParameter();
			case ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_REFERENT:
				if (resolve) return getActualReferent();
				return basicGetActualReferent();
			case ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_VALUE:
				if (resolve) return getActualValue();
				return basicGetActualValue();
			case ExpressionsPackage.ACTUAL_PARAMETER__POSITION:
				return getPosition();
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
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL:
				setInProcedureCall((ProcedureCall)newValue);
				return;
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL:
				setInFunctionCall((FunctionCall)newValue);
				return;
			case ExpressionsPackage.ACTUAL_PARAMETER__FORMAL_PARAMETER:
				setFormalParameter((Parameter)newValue);
				return;
			case ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_REFERENT:
				setActualReferent((VARExpression)newValue);
				return;
			case ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_VALUE:
				setActualValue((Expression)newValue);
				return;
			case ExpressionsPackage.ACTUAL_PARAMETER__POSITION:
				setPosition((Integer)newValue);
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
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL:
				setInProcedureCall((ProcedureCall)null);
				return;
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL:
				setInFunctionCall((FunctionCall)null);
				return;
			case ExpressionsPackage.ACTUAL_PARAMETER__FORMAL_PARAMETER:
				setFormalParameter((Parameter)null);
				return;
			case ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_REFERENT:
				setActualReferent((VARExpression)null);
				return;
			case ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_VALUE:
				setActualValue((Expression)null);
				return;
			case ExpressionsPackage.ACTUAL_PARAMETER__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL:
				return getInProcedureCall() != null;
			case ExpressionsPackage.ACTUAL_PARAMETER__IN_FUNCTION_CALL:
				return getInFunctionCall() != null;
			case ExpressionsPackage.ACTUAL_PARAMETER__FORMAL_PARAMETER:
				return formalParameter != null;
			case ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_REFERENT:
				return actualReferent != null;
			case ExpressionsPackage.ACTUAL_PARAMETER__ACTUAL_VALUE:
				return actualValue != null;
			case ExpressionsPackage.ACTUAL_PARAMETER__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
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
		result.append(" (position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //ActualParameterImpl
