/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.algorithms.NamedVariable;
import org.ifc4emf.metamodel.express.core.VariableType;
import org.ifc4emf.metamodel.express.core.impl.LocalElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.NamedVariableImpl#getVariableType <em>Variable Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamedVariableImpl extends LocalElementImpl implements NamedVariable {
	/**
	 * The cached value of the '{@link #getVariableType() <em>Variable Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableType()
	 * @generated
	 * @ordered
	 */
	protected VariableType variableType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmsPackage.Literals.NAMED_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType getVariableType() {
		if (variableType != null && variableType.eIsProxy()) {
			InternalEObject oldVariableType = (InternalEObject)variableType;
			variableType = (VariableType)eResolveProxy(oldVariableType);
			if (variableType != oldVariableType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.NAMED_VARIABLE__VARIABLE_TYPE, oldVariableType, variableType));
			}
		}
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType basicGetVariableType() {
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableType(VariableType newVariableType) {
		VariableType oldVariableType = variableType;
		variableType = newVariableType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.NAMED_VARIABLE__VARIABLE_TYPE, oldVariableType, variableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmsPackage.NAMED_VARIABLE__VARIABLE_TYPE:
				if (resolve) return getVariableType();
				return basicGetVariableType();
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
			case AlgorithmsPackage.NAMED_VARIABLE__VARIABLE_TYPE:
				setVariableType((VariableType)newValue);
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
			case AlgorithmsPackage.NAMED_VARIABLE__VARIABLE_TYPE:
				setVariableType((VariableType)null);
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
			case AlgorithmsPackage.NAMED_VARIABLE__VARIABLE_TYPE:
				return variableType != null;
		}
		return super.eIsSet(featureID);
	}

} //NamedVariableImpl
