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
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.expressions.BinaryIndex;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.BinaryIndexImpl#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.BinaryIndexImpl#getLastBit <em>Last Bit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryIndexImpl extends IndexOperationImpl implements BinaryIndex {
	/**
	 * The cached value of the '{@link #getFirstBit() <em>First Bit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstBit()
	 * @generated
	 * @ordered
	 */
	protected Expression firstBit;

	/**
	 * The cached value of the '{@link #getLastBit() <em>Last Bit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastBit()
	 * @generated
	 * @ordered
	 */
	protected Expression lastBit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.BINARY_INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFirstBit() {
		if (firstBit != null && firstBit.eIsProxy()) {
			InternalEObject oldFirstBit = (InternalEObject)firstBit;
			firstBit = (Expression)eResolveProxy(oldFirstBit);
			if (firstBit != oldFirstBit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.BINARY_INDEX__FIRST_BIT, oldFirstBit, firstBit));
			}
		}
		return firstBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetFirstBit() {
		return firstBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstBit(Expression newFirstBit) {
		Expression oldFirstBit = firstBit;
		firstBit = newFirstBit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.BINARY_INDEX__FIRST_BIT, oldFirstBit, firstBit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLastBit() {
		if (lastBit != null && lastBit.eIsProxy()) {
			InternalEObject oldLastBit = (InternalEObject)lastBit;
			lastBit = (Expression)eResolveProxy(oldLastBit);
			if (lastBit != oldLastBit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.BINARY_INDEX__LAST_BIT, oldLastBit, lastBit));
			}
		}
		return lastBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetLastBit() {
		return lastBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastBit(Expression newLastBit) {
		Expression oldLastBit = lastBit;
		lastBit = newLastBit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.BINARY_INDEX__LAST_BIT, oldLastBit, lastBit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.BINARY_INDEX__FIRST_BIT:
				if (resolve) return getFirstBit();
				return basicGetFirstBit();
			case ExpressionsPackage.BINARY_INDEX__LAST_BIT:
				if (resolve) return getLastBit();
				return basicGetLastBit();
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
			case ExpressionsPackage.BINARY_INDEX__FIRST_BIT:
				setFirstBit((Expression)newValue);
				return;
			case ExpressionsPackage.BINARY_INDEX__LAST_BIT:
				setLastBit((Expression)newValue);
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
			case ExpressionsPackage.BINARY_INDEX__FIRST_BIT:
				setFirstBit((Expression)null);
				return;
			case ExpressionsPackage.BINARY_INDEX__LAST_BIT:
				setLastBit((Expression)null);
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
			case ExpressionsPackage.BINARY_INDEX__FIRST_BIT:
				return firstBit != null;
			case ExpressionsPackage.BINARY_INDEX__LAST_BIT:
				return lastBit != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryIndexImpl
