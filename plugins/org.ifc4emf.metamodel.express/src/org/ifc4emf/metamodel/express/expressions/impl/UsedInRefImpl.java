/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.UsedInRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Used In Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.UsedInRefImpl#getInverseOf <em>Inverse Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsedInRefImpl extends SelectorImpl implements UsedInRef {
	/**
	 * The cached value of the '{@link #getInverseOf() <em>Inverse Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseOf()
	 * @generated
	 * @ordered
	 */
	protected Attribute inverseOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsedInRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.USED_IN_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getInverseOf() {
		if (inverseOf != null && inverseOf.eIsProxy()) {
			InternalEObject oldInverseOf = (InternalEObject)inverseOf;
			inverseOf = (Attribute)eResolveProxy(oldInverseOf);
			if (inverseOf != oldInverseOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.USED_IN_REF__INVERSE_OF, oldInverseOf, inverseOf));
			}
		}
		return inverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetInverseOf() {
		return inverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseOf(Attribute newInverseOf) {
		Attribute oldInverseOf = inverseOf;
		inverseOf = newInverseOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.USED_IN_REF__INVERSE_OF, oldInverseOf, inverseOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.USED_IN_REF__INVERSE_OF:
				if (resolve) return getInverseOf();
				return basicGetInverseOf();
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
			case ExpressionsPackage.USED_IN_REF__INVERSE_OF:
				setInverseOf((Attribute)newValue);
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
			case ExpressionsPackage.USED_IN_REF__INVERSE_OF:
				setInverseOf((Attribute)null);
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
			case ExpressionsPackage.USED_IN_REF__INVERSE_OF:
				return inverseOf != null;
		}
		return super.eIsSet(featureID);
	}

} //UsedInRefImpl
