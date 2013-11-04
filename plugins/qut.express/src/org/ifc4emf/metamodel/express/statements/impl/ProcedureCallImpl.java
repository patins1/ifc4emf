/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.algorithms.Procedure;
import org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl;
import org.ifc4emf.metamodel.express.expressions.ActualParameter;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.statements.ProcedureCall;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.ProcedureCallImpl#getInvokes <em>Invokes</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.ProcedureCallImpl#getActualParameters <em>Actual Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureCallImpl extends StatementImpl implements ProcedureCall {
	/**
	 * The cached value of the '{@link #getInvokes() <em>Invokes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokes()
	 * @generated
	 * @ordered
	 */
	protected Procedure invokes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.PROCEDURE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure getInvokes() {
		if (invokes != null && invokes.eIsProxy()) {
			InternalEObject oldInvokes = (InternalEObject)invokes;
			invokes = (Procedure)eResolveProxy(oldInvokes);
			if (invokes != oldInvokes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.PROCEDURE_CALL__INVOKES, oldInvokes, invokes));
			}
		}
		return invokes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure basicGetInvokes() {
		return invokes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokes(Procedure newInvokes) {
		Procedure oldInvokes = invokes;
		invokes = newInvokes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PROCEDURE_CALL__INVOKES, oldInvokes, invokes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualParameter> getActualParameters() {
		if (actualParameters == null) {
			actualParameters = new EObjectContainmentWithInverseEList<ActualParameter>(ActualParameter.class, this, StatementsPackage.PROCEDURE_CALL__ACTUAL_PARAMETERS, ExpressionsPackage.ACTUAL_PARAMETER__IN_PROCEDURE_CALL);
		}
		return actualParameters;
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
			case StatementsPackage.PROCEDURE_CALL__ACTUAL_PARAMETERS:
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
			case StatementsPackage.PROCEDURE_CALL__ACTUAL_PARAMETERS:
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
			case StatementsPackage.PROCEDURE_CALL__INVOKES:
				if (resolve) return getInvokes();
				return basicGetInvokes();
			case StatementsPackage.PROCEDURE_CALL__ACTUAL_PARAMETERS:
				return getActualParameters();
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
			case StatementsPackage.PROCEDURE_CALL__INVOKES:
				setInvokes((Procedure)newValue);
				return;
			case StatementsPackage.PROCEDURE_CALL__ACTUAL_PARAMETERS:
				getActualParameters().clear();
				getActualParameters().addAll((Collection<? extends ActualParameter>)newValue);
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
			case StatementsPackage.PROCEDURE_CALL__INVOKES:
				setInvokes((Procedure)null);
				return;
			case StatementsPackage.PROCEDURE_CALL__ACTUAL_PARAMETERS:
				getActualParameters().clear();
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
			case StatementsPackage.PROCEDURE_CALL__INVOKES:
				return invokes != null;
			case StatementsPackage.PROCEDURE_CALL__ACTUAL_PARAMETERS:
				return actualParameters != null && !actualParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcedureCallImpl
