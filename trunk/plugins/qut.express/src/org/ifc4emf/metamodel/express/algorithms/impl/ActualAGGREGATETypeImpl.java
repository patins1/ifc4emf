/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType;
import org.ifc4emf.metamodel.express.algorithms.ActualStructure;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.core.SizeConstraint;
import org.ifc4emf.metamodel.express.core.VariableType;
import org.ifc4emf.metamodel.express.core.impl.ActualTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual AGGREGATE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualAGGREGATETypeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualAGGREGATETypeImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualAGGREGATETypeImpl#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualAGGREGATETypeImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualAGGREGATETypeImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActualAGGREGATETypeImpl extends ActualTypeImpl implements ActualAGGREGATEType {
	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected SizeConstraint upperBound;

	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected ActualStructure refersTo;

	/**
	 * The cached value of the '{@link #getMemberType() <em>Member Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberType()
	 * @generated
	 * @ordered
	 */
	protected VariableType memberType;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected SizeConstraint lowerBound;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActualAGGREGATETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmsPackage.Literals.ACTUAL_AGGREGATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(SizeConstraint newUpperBound, NotificationChain msgs) {
		SizeConstraint oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(SizeConstraint newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualStructure getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (ActualStructure)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualStructure basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(ActualStructure newRefersTo) {
		ActualStructure oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__REFERS_TO, oldRefersTo, refersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType getMemberType() {
		if (memberType != null && memberType.eIsProxy()) {
			InternalEObject oldMemberType = (InternalEObject)memberType;
			memberType = (VariableType)eResolveProxy(oldMemberType);
			if (memberType != oldMemberType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__MEMBER_TYPE, oldMemberType, memberType));
			}
		}
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType basicGetMemberType() {
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberType(VariableType newMemberType) {
		VariableType oldMemberType = memberType;
		memberType = newMemberType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__MEMBER_TYPE, oldMemberType, memberType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBound(SizeConstraint newLowerBound, NotificationChain msgs) {
		SizeConstraint oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LOWER_BOUND, oldLowerBound, newLowerBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(SizeConstraint newLowerBound) {
		if (newLowerBound != lowerBound) {
			NotificationChain msgs = null;
			if (lowerBound != null)
				msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LOWER_BOUND, null, msgs);
			if (newLowerBound != null)
				msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LOWER_BOUND, null, msgs);
			msgs = basicSetLowerBound(newLowerBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LOWER_BOUND, newLowerBound, newLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LOWER_BOUND:
				return basicSetLowerBound(null, msgs);
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
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__UPPER_BOUND:
				return getUpperBound();
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__MEMBER_TYPE:
				if (resolve) return getMemberType();
				return basicGetMemberType();
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LOWER_BOUND:
				return getLowerBound();
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LABEL:
				return getLabel();
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
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__UPPER_BOUND:
				setUpperBound((SizeConstraint)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__REFERS_TO:
				setRefersTo((ActualStructure)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__MEMBER_TYPE:
				setMemberType((VariableType)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LOWER_BOUND:
				setLowerBound((SizeConstraint)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LABEL:
				setLabel((String)newValue);
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
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__UPPER_BOUND:
				setUpperBound((SizeConstraint)null);
				return;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__REFERS_TO:
				setRefersTo((ActualStructure)null);
				return;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__MEMBER_TYPE:
				setMemberType((VariableType)null);
				return;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LOWER_BOUND:
				setLowerBound((SizeConstraint)null);
				return;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__UPPER_BOUND:
				return upperBound != null;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__REFERS_TO:
				return refersTo != null;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__MEMBER_TYPE:
				return memberType != null;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LOWER_BOUND:
				return lowerBound != null;
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ActualAGGREGATETypeImpl
