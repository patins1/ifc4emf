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
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.statements.MemberCell;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;
import org.ifc4emf.metamodel.express.statements.VARExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.MemberCellImpl#getIndexValue <em>Index Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.MemberCellImpl#getBaseAggregate <em>Base Aggregate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberCellImpl extends VARExpressionImpl implements MemberCell {
	/**
	 * The cached value of the '{@link #getIndexValue() <em>Index Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexValue()
	 * @generated
	 * @ordered
	 */
	protected Expression indexValue;

	/**
	 * The cached value of the '{@link #getBaseAggregate() <em>Base Aggregate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAggregate()
	 * @generated
	 * @ordered
	 */
	protected VARExpression baseAggregate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.MEMBER_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIndexValue() {
		if (indexValue != null && indexValue.eIsProxy()) {
			InternalEObject oldIndexValue = (InternalEObject)indexValue;
			indexValue = (Expression)eResolveProxy(oldIndexValue);
			if (indexValue != oldIndexValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.MEMBER_CELL__INDEX_VALUE, oldIndexValue, indexValue));
			}
		}
		return indexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetIndexValue() {
		return indexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexValue(Expression newIndexValue) {
		Expression oldIndexValue = indexValue;
		indexValue = newIndexValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.MEMBER_CELL__INDEX_VALUE, oldIndexValue, indexValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VARExpression getBaseAggregate() {
		return baseAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseAggregate(VARExpression newBaseAggregate, NotificationChain msgs) {
		VARExpression oldBaseAggregate = baseAggregate;
		baseAggregate = newBaseAggregate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.MEMBER_CELL__BASE_AGGREGATE, oldBaseAggregate, newBaseAggregate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseAggregate(VARExpression newBaseAggregate) {
		if (newBaseAggregate != baseAggregate) {
			NotificationChain msgs = null;
			if (baseAggregate != null)
				msgs = ((InternalEObject)baseAggregate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.MEMBER_CELL__BASE_AGGREGATE, null, msgs);
			if (newBaseAggregate != null)
				msgs = ((InternalEObject)newBaseAggregate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.MEMBER_CELL__BASE_AGGREGATE, null, msgs);
			msgs = basicSetBaseAggregate(newBaseAggregate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.MEMBER_CELL__BASE_AGGREGATE, newBaseAggregate, newBaseAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.MEMBER_CELL__BASE_AGGREGATE:
				return basicSetBaseAggregate(null, msgs);
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
			case StatementsPackage.MEMBER_CELL__INDEX_VALUE:
				if (resolve) return getIndexValue();
				return basicGetIndexValue();
			case StatementsPackage.MEMBER_CELL__BASE_AGGREGATE:
				return getBaseAggregate();
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
			case StatementsPackage.MEMBER_CELL__INDEX_VALUE:
				setIndexValue((Expression)newValue);
				return;
			case StatementsPackage.MEMBER_CELL__BASE_AGGREGATE:
				setBaseAggregate((VARExpression)newValue);
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
			case StatementsPackage.MEMBER_CELL__INDEX_VALUE:
				setIndexValue((Expression)null);
				return;
			case StatementsPackage.MEMBER_CELL__BASE_AGGREGATE:
				setBaseAggregate((VARExpression)null);
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
			case StatementsPackage.MEMBER_CELL__INDEX_VALUE:
				return indexValue != null;
			case StatementsPackage.MEMBER_CELL__BASE_AGGREGATE:
				return baseAggregate != null;
		}
		return super.eIsSet(featureID);
	}

} //MemberCellImpl
