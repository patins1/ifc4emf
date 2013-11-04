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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.statements.CaseAction;
import org.ifc4emf.metamodel.express.statements.CaseStatement;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.CaseStatementImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.CaseStatementImpl#getSelectionExpression <em>Selection Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseStatementImpl extends StatementImpl implements CaseStatement {
	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<CaseAction> cases;

	/**
	 * The cached value of the '{@link #getSelectionExpression() <em>Selection Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression selectionExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.CASE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaseAction> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList<CaseAction>(CaseAction.class, this, StatementsPackage.CASE_STATEMENT__CASES);
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSelectionExpression() {
		if (selectionExpression != null && selectionExpression.eIsProxy()) {
			InternalEObject oldSelectionExpression = (InternalEObject)selectionExpression;
			selectionExpression = (Expression)eResolveProxy(oldSelectionExpression);
			if (selectionExpression != oldSelectionExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.CASE_STATEMENT__SELECTION_EXPRESSION, oldSelectionExpression, selectionExpression));
			}
		}
		return selectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetSelectionExpression() {
		return selectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionExpression(Expression newSelectionExpression) {
		Expression oldSelectionExpression = selectionExpression;
		selectionExpression = newSelectionExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.CASE_STATEMENT__SELECTION_EXPRESSION, oldSelectionExpression, selectionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.CASE_STATEMENT__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.CASE_STATEMENT__CASES:
				return getCases();
			case StatementsPackage.CASE_STATEMENT__SELECTION_EXPRESSION:
				if (resolve) return getSelectionExpression();
				return basicGetSelectionExpression();
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
			case StatementsPackage.CASE_STATEMENT__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends CaseAction>)newValue);
				return;
			case StatementsPackage.CASE_STATEMENT__SELECTION_EXPRESSION:
				setSelectionExpression((Expression)newValue);
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
			case StatementsPackage.CASE_STATEMENT__CASES:
				getCases().clear();
				return;
			case StatementsPackage.CASE_STATEMENT__SELECTION_EXPRESSION:
				setSelectionExpression((Expression)null);
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
			case StatementsPackage.CASE_STATEMENT__CASES:
				return cases != null && !cases.isEmpty();
			case StatementsPackage.CASE_STATEMENT__SELECTION_EXPRESSION:
				return selectionExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //CaseStatementImpl
