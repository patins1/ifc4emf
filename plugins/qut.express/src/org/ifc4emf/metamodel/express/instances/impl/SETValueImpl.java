/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.SETValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SET Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.SETValueImpl#getMemberValue <em>Member Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SETValueImpl extends AggregateValueImpl implements SETValue {
	/**
	 * The cached value of the '{@link #getMemberValue() <em>Member Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> memberValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SETValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.SET_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getMemberValue() {
		if (memberValue == null) {
			memberValue = new EObjectResolvingEList<Instance>(Instance.class, this, InstancesPackage.SET_VALUE__MEMBER_VALUE);
		}
		return memberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancesPackage.SET_VALUE__MEMBER_VALUE:
				return getMemberValue();
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
			case InstancesPackage.SET_VALUE__MEMBER_VALUE:
				getMemberValue().clear();
				getMemberValue().addAll((Collection<? extends Instance>)newValue);
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
			case InstancesPackage.SET_VALUE__MEMBER_VALUE:
				getMemberValue().clear();
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
			case InstancesPackage.SET_VALUE__MEMBER_VALUE:
				return memberValue != null && !memberValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SETValueImpl
