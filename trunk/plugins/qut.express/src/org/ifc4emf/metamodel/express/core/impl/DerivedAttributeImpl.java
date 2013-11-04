/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DerivedAttribute;
import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.DerivedAttributeImpl#getDerivation <em>Derivation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivedAttributeImpl extends AttributeImpl implements DerivedAttribute {
	/**
	 * The cached value of the '{@link #getDerivation() <em>Derivation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected Expression derivation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DERIVED_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDerivation() {
		if (derivation != null && derivation.eIsProxy()) {
			InternalEObject oldDerivation = (InternalEObject)derivation;
			derivation = (Expression)eResolveProxy(oldDerivation);
			if (derivation != oldDerivation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DERIVED_ATTRIBUTE__DERIVATION, oldDerivation, derivation));
			}
		}
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetDerivation() {
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivation(Expression newDerivation) {
		Expression oldDerivation = derivation;
		derivation = newDerivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DERIVED_ATTRIBUTE__DERIVATION, oldDerivation, derivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DERIVED_ATTRIBUTE__DERIVATION:
				if (resolve) return getDerivation();
				return basicGetDerivation();
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
			case CorePackage.DERIVED_ATTRIBUTE__DERIVATION:
				setDerivation((Expression)newValue);
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
			case CorePackage.DERIVED_ATTRIBUTE__DERIVATION:
				setDerivation((Expression)null);
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
			case CorePackage.DERIVED_ATTRIBUTE__DERIVATION:
				return derivation != null;
		}
		return super.eIsSet(featureID);
	}

} //DerivedAttributeImpl
