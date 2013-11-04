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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.MemberBinding;
import org.ifc4emf.metamodel.express.expressions.RepeatCount;
import org.ifc4emf.metamodel.express.instances.ListMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.MemberBindingImpl#getRepetition <em>Repetition</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.MemberBindingImpl#getToSlot <em>To Slot</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.MemberBindingImpl#getMemberValue <em>Member Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.MemberBindingImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberBindingImpl extends EObjectImpl implements MemberBinding {
	/**
	 * The cached value of the '{@link #getRepetition() <em>Repetition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetition()
	 * @generated
	 * @ordered
	 */
	protected RepeatCount repetition;

	/**
	 * The cached value of the '{@link #getToSlot() <em>To Slot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<ListMember> toSlot;

	/**
	 * The cached value of the '{@link #getMemberValue() <em>Member Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberValue()
	 * @generated
	 * @ordered
	 */
	protected Expression memberValue;

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
	protected MemberBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.MEMBER_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatCount getRepetition() {
		return repetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepetition(RepeatCount newRepetition, NotificationChain msgs) {
		RepeatCount oldRepetition = repetition;
		repetition = newRepetition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.MEMBER_BINDING__REPETITION, oldRepetition, newRepetition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetition(RepeatCount newRepetition) {
		if (newRepetition != repetition) {
			NotificationChain msgs = null;
			if (repetition != null)
				msgs = ((InternalEObject)repetition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.MEMBER_BINDING__REPETITION, null, msgs);
			if (newRepetition != null)
				msgs = ((InternalEObject)newRepetition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.MEMBER_BINDING__REPETITION, null, msgs);
			msgs = basicSetRepetition(newRepetition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.MEMBER_BINDING__REPETITION, newRepetition, newRepetition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListMember> getToSlot() {
		if (toSlot == null) {
			toSlot = new EObjectResolvingEList<ListMember>(ListMember.class, this, ExpressionsPackage.MEMBER_BINDING__TO_SLOT);
		}
		return toSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMemberValue() {
		if (memberValue != null && memberValue.eIsProxy()) {
			InternalEObject oldMemberValue = (InternalEObject)memberValue;
			memberValue = (Expression)eResolveProxy(oldMemberValue);
			if (memberValue != oldMemberValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.MEMBER_BINDING__MEMBER_VALUE, oldMemberValue, memberValue));
			}
		}
		return memberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetMemberValue() {
		return memberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberValue(Expression newMemberValue) {
		Expression oldMemberValue = memberValue;
		memberValue = newMemberValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.MEMBER_BINDING__MEMBER_VALUE, oldMemberValue, memberValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.MEMBER_BINDING__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.MEMBER_BINDING__REPETITION:
				return basicSetRepetition(null, msgs);
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
			case ExpressionsPackage.MEMBER_BINDING__REPETITION:
				return getRepetition();
			case ExpressionsPackage.MEMBER_BINDING__TO_SLOT:
				return getToSlot();
			case ExpressionsPackage.MEMBER_BINDING__MEMBER_VALUE:
				if (resolve) return getMemberValue();
				return basicGetMemberValue();
			case ExpressionsPackage.MEMBER_BINDING__POSITION:
				return getPosition();
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
			case ExpressionsPackage.MEMBER_BINDING__REPETITION:
				setRepetition((RepeatCount)newValue);
				return;
			case ExpressionsPackage.MEMBER_BINDING__TO_SLOT:
				getToSlot().clear();
				getToSlot().addAll((Collection<? extends ListMember>)newValue);
				return;
			case ExpressionsPackage.MEMBER_BINDING__MEMBER_VALUE:
				setMemberValue((Expression)newValue);
				return;
			case ExpressionsPackage.MEMBER_BINDING__POSITION:
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
			case ExpressionsPackage.MEMBER_BINDING__REPETITION:
				setRepetition((RepeatCount)null);
				return;
			case ExpressionsPackage.MEMBER_BINDING__TO_SLOT:
				getToSlot().clear();
				return;
			case ExpressionsPackage.MEMBER_BINDING__MEMBER_VALUE:
				setMemberValue((Expression)null);
				return;
			case ExpressionsPackage.MEMBER_BINDING__POSITION:
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
			case ExpressionsPackage.MEMBER_BINDING__REPETITION:
				return repetition != null;
			case ExpressionsPackage.MEMBER_BINDING__TO_SLOT:
				return toSlot != null && !toSlot.isEmpty();
			case ExpressionsPackage.MEMBER_BINDING__MEMBER_VALUE:
				return memberValue != null;
			case ExpressionsPackage.MEMBER_BINDING__POSITION:
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

} //MemberBindingImpl
