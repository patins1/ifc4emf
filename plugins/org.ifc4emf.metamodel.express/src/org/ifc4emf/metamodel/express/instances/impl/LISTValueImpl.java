/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.impl.InstanceImpl;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.LISTValue;
import org.ifc4emf.metamodel.express.instances.ListMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LIST Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.LISTValueImpl#getMemberSlot <em>Member Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LISTValueImpl extends InstanceImpl implements LISTValue {
	/**
	 * The cached value of the '{@link #getMemberSlot() <em>Member Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<ListMember> memberSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LISTValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.LIST_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListMember> getMemberSlot() {
		if (memberSlot == null) {
			memberSlot = new EObjectContainmentEList<ListMember>(ListMember.class, this, InstancesPackage.LIST_VALUE__MEMBER_SLOT);
		}
		return memberSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.LIST_VALUE__MEMBER_SLOT:
				return ((InternalEList<?>)getMemberSlot()).basicRemove(otherEnd, msgs);
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
			case InstancesPackage.LIST_VALUE__MEMBER_SLOT:
				return getMemberSlot();
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
			case InstancesPackage.LIST_VALUE__MEMBER_SLOT:
				getMemberSlot().clear();
				getMemberSlot().addAll((Collection<? extends ListMember>)newValue);
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
			case InstancesPackage.LIST_VALUE__MEMBER_SLOT:
				getMemberSlot().clear();
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
			case InstancesPackage.LIST_VALUE__MEMBER_SLOT:
				return memberSlot != null && !memberSlot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LISTValueImpl
