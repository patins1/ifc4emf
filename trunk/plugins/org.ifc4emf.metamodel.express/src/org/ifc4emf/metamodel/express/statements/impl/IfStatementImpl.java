/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.statements.IfStatement;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.IfStatementImpl#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.IfStatementImpl#getElseActions <em>Else Actions</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.IfStatementImpl#getThenActions <em>Then Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getIfCondition() <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression ifCondition;

	/**
	 * The cached value of the '{@link #getElseActions() <em>Else Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseActions()
	 * @generated
	 * @ordered
	 */
	protected Statement elseActions;

	/**
	 * The cached value of the '{@link #getThenActions() <em>Then Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenActions()
	 * @generated
	 * @ordered
	 */
	protected Statement thenActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIfCondition() {
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfCondition(Expression newIfCondition, NotificationChain msgs) {
		Expression oldIfCondition = ifCondition;
		ifCondition = newIfCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.IF_STATEMENT__IF_CONDITION, oldIfCondition, newIfCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfCondition(Expression newIfCondition) {
		if (newIfCondition != ifCondition) {
			NotificationChain msgs = null;
			if (ifCondition != null)
				msgs = ((InternalEObject)ifCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.IF_STATEMENT__IF_CONDITION, null, msgs);
			if (newIfCondition != null)
				msgs = ((InternalEObject)newIfCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.IF_STATEMENT__IF_CONDITION, null, msgs);
			msgs = basicSetIfCondition(newIfCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.IF_STATEMENT__IF_CONDITION, newIfCondition, newIfCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getElseActions() {
		return elseActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseActions(Statement newElseActions, NotificationChain msgs) {
		Statement oldElseActions = elseActions;
		elseActions = newElseActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.IF_STATEMENT__ELSE_ACTIONS, oldElseActions, newElseActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseActions(Statement newElseActions) {
		if (newElseActions != elseActions) {
			NotificationChain msgs = null;
			if (elseActions != null)
				msgs = ((InternalEObject)elseActions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.IF_STATEMENT__ELSE_ACTIONS, null, msgs);
			if (newElseActions != null)
				msgs = ((InternalEObject)newElseActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.IF_STATEMENT__ELSE_ACTIONS, null, msgs);
			msgs = basicSetElseActions(newElseActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.IF_STATEMENT__ELSE_ACTIONS, newElseActions, newElseActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getThenActions() {
		return thenActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenActions(Statement newThenActions, NotificationChain msgs) {
		Statement oldThenActions = thenActions;
		thenActions = newThenActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.IF_STATEMENT__THEN_ACTIONS, oldThenActions, newThenActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenActions(Statement newThenActions) {
		if (newThenActions != thenActions) {
			NotificationChain msgs = null;
			if (thenActions != null)
				msgs = ((InternalEObject)thenActions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.IF_STATEMENT__THEN_ACTIONS, null, msgs);
			if (newThenActions != null)
				msgs = ((InternalEObject)newThenActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.IF_STATEMENT__THEN_ACTIONS, null, msgs);
			msgs = basicSetThenActions(newThenActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.IF_STATEMENT__THEN_ACTIONS, newThenActions, newThenActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.IF_STATEMENT__IF_CONDITION:
				return basicSetIfCondition(null, msgs);
			case StatementsPackage.IF_STATEMENT__ELSE_ACTIONS:
				return basicSetElseActions(null, msgs);
			case StatementsPackage.IF_STATEMENT__THEN_ACTIONS:
				return basicSetThenActions(null, msgs);
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
			case StatementsPackage.IF_STATEMENT__IF_CONDITION:
				return getIfCondition();
			case StatementsPackage.IF_STATEMENT__ELSE_ACTIONS:
				return getElseActions();
			case StatementsPackage.IF_STATEMENT__THEN_ACTIONS:
				return getThenActions();
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
			case StatementsPackage.IF_STATEMENT__IF_CONDITION:
				setIfCondition((Expression)newValue);
				return;
			case StatementsPackage.IF_STATEMENT__ELSE_ACTIONS:
				setElseActions((Statement)newValue);
				return;
			case StatementsPackage.IF_STATEMENT__THEN_ACTIONS:
				setThenActions((Statement)newValue);
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
			case StatementsPackage.IF_STATEMENT__IF_CONDITION:
				setIfCondition((Expression)null);
				return;
			case StatementsPackage.IF_STATEMENT__ELSE_ACTIONS:
				setElseActions((Statement)null);
				return;
			case StatementsPackage.IF_STATEMENT__THEN_ACTIONS:
				setThenActions((Statement)null);
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
			case StatementsPackage.IF_STATEMENT__IF_CONDITION:
				return ifCondition != null;
			case StatementsPackage.IF_STATEMENT__ELSE_ACTIONS:
				return elseActions != null;
			case StatementsPackage.IF_STATEMENT__THEN_ACTIONS:
				return thenActions != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
