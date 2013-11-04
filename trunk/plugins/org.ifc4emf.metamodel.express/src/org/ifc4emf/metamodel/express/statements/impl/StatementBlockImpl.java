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
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl;
import org.ifc4emf.metamodel.express.statements.StatementBlock;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.StatementBlockImpl#getBodyStatements_Statement <em>Body Statements Statement</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.StatementBlockImpl#getDelimited <em>Delimited</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementBlockImpl extends StatementImpl implements StatementBlock {
	/**
	 * The cached value of the '{@link #getBodyStatements_Statement() <em>Body Statements Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyStatements_Statement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> bodyStatements_Statement;

	/**
	 * The default value of the '{@link #getDelimited() <em>Delimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimited()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELIMITED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelimited() <em>Delimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimited()
	 * @generated
	 * @ordered
	 */
	protected Boolean delimited = DELIMITED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.STATEMENT_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getBodyStatements_Statement() {
		if (bodyStatements_Statement == null) {
			bodyStatements_Statement = new EObjectContainmentWithInverseEList<Statement>(Statement.class, this, StatementsPackage.STATEMENT_BLOCK__BODY_STATEMENTS_STATEMENT, AlgorithmsPackage.STATEMENT__IN_BLOCK);
		}
		return bodyStatements_Statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDelimited() {
		return delimited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelimited(Boolean newDelimited) {
		Boolean oldDelimited = delimited;
		delimited = newDelimited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.STATEMENT_BLOCK__DELIMITED, oldDelimited, delimited));
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
			case StatementsPackage.STATEMENT_BLOCK__BODY_STATEMENTS_STATEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBodyStatements_Statement()).basicAdd(otherEnd, msgs);
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
			case StatementsPackage.STATEMENT_BLOCK__BODY_STATEMENTS_STATEMENT:
				return ((InternalEList<?>)getBodyStatements_Statement()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.STATEMENT_BLOCK__BODY_STATEMENTS_STATEMENT:
				return getBodyStatements_Statement();
			case StatementsPackage.STATEMENT_BLOCK__DELIMITED:
				return getDelimited();
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
			case StatementsPackage.STATEMENT_BLOCK__BODY_STATEMENTS_STATEMENT:
				getBodyStatements_Statement().clear();
				getBodyStatements_Statement().addAll((Collection<? extends Statement>)newValue);
				return;
			case StatementsPackage.STATEMENT_BLOCK__DELIMITED:
				setDelimited((Boolean)newValue);
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
			case StatementsPackage.STATEMENT_BLOCK__BODY_STATEMENTS_STATEMENT:
				getBodyStatements_Statement().clear();
				return;
			case StatementsPackage.STATEMENT_BLOCK__DELIMITED:
				setDelimited(DELIMITED_EDEFAULT);
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
			case StatementsPackage.STATEMENT_BLOCK__BODY_STATEMENTS_STATEMENT:
				return bodyStatements_Statement != null && !bodyStatements_Statement.isEmpty();
			case StatementsPackage.STATEMENT_BLOCK__DELIMITED:
				return DELIMITED_EDEFAULT == null ? delimited != null : !DELIMITED_EDEFAULT.equals(delimited);
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
		result.append(" (delimited: ");
		result.append(delimited);
		result.append(')');
		return result.toString();
	}

} //StatementBlockImpl
