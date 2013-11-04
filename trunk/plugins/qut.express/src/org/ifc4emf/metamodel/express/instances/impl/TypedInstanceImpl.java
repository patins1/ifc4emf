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
import org.ifc4emf.metamodel.express.core.SelectType;
import org.ifc4emf.metamodel.express.core.impl.InstanceImpl;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.TypedInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.TypedInstanceImpl#getSatisfiesType <em>Satisfies Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypedInstanceImpl extends InstanceImpl implements TypedInstance {
	/**
	 * The cached value of the '{@link #getSatisfiesType() <em>Satisfies Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiesType()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectType> satisfiesType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.TYPED_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectType> getSatisfiesType() {
		if (satisfiesType == null) {
			satisfiesType = new EObjectResolvingEList<SelectType>(SelectType.class, this, InstancesPackage.TYPED_INSTANCE__SATISFIES_TYPE);
		}
		return satisfiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancesPackage.TYPED_INSTANCE__SATISFIES_TYPE:
				return getSatisfiesType();
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
			case InstancesPackage.TYPED_INSTANCE__SATISFIES_TYPE:
				getSatisfiesType().clear();
				getSatisfiesType().addAll((Collection<? extends SelectType>)newValue);
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
			case InstancesPackage.TYPED_INSTANCE__SATISFIES_TYPE:
				getSatisfiesType().clear();
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
			case InstancesPackage.TYPED_INSTANCE__SATISFIES_TYPE:
				return satisfiesType != null && !satisfiesType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypedInstanceImpl
