/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.ifc4emf.metamodel.express.core.AnonymousType;
import org.ifc4emf.metamodel.express.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.AnonymousTypeImpl#getSpecializes <em>Specializes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AnonymousTypeImpl extends ConcreteTypeImpl implements AnonymousType {
	/**
	 * The cached value of the '{@link #getSpecializes() <em>Specializes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializes()
	 * @generated
	 * @ordered
	 */
	protected EList<AnonymousType> specializes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ANONYMOUS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnonymousType> getSpecializes() {
		if (specializes == null) {
			specializes = new EObjectResolvingEList<AnonymousType>(AnonymousType.class, this, CorePackage.ANONYMOUS_TYPE__SPECIALIZES);
		}
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ANONYMOUS_TYPE__SPECIALIZES:
				return getSpecializes();
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
			case CorePackage.ANONYMOUS_TYPE__SPECIALIZES:
				getSpecializes().clear();
				getSpecializes().addAll((Collection<? extends AnonymousType>)newValue);
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
			case CorePackage.ANONYMOUS_TYPE__SPECIALIZES:
				getSpecializes().clear();
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
			case CorePackage.ANONYMOUS_TYPE__SPECIALIZES:
				return specializes != null && !specializes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnonymousTypeImpl
