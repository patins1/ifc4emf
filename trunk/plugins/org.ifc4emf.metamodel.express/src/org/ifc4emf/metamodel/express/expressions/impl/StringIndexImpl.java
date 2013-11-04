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
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.StringIndex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.StringIndexImpl#getFirstCode <em>First Code</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.StringIndexImpl#getLastCode <em>Last Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringIndexImpl extends IndexOperationImpl implements StringIndex {
	/**
	 * The cached value of the '{@link #getFirstCode() <em>First Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstCode()
	 * @generated
	 * @ordered
	 */
	protected Expression firstCode;

	/**
	 * The cached value of the '{@link #getLastCode() <em>Last Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCode()
	 * @generated
	 * @ordered
	 */
	protected Expression lastCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.STRING_INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFirstCode() {
		if (firstCode != null && firstCode.eIsProxy()) {
			InternalEObject oldFirstCode = (InternalEObject)firstCode;
			firstCode = (Expression)eResolveProxy(oldFirstCode);
			if (firstCode != oldFirstCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.STRING_INDEX__FIRST_CODE, oldFirstCode, firstCode));
			}
		}
		return firstCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetFirstCode() {
		return firstCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstCode(Expression newFirstCode) {
		Expression oldFirstCode = firstCode;
		firstCode = newFirstCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.STRING_INDEX__FIRST_CODE, oldFirstCode, firstCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLastCode() {
		if (lastCode != null && lastCode.eIsProxy()) {
			InternalEObject oldLastCode = (InternalEObject)lastCode;
			lastCode = (Expression)eResolveProxy(oldLastCode);
			if (lastCode != oldLastCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.STRING_INDEX__LAST_CODE, oldLastCode, lastCode));
			}
		}
		return lastCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetLastCode() {
		return lastCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastCode(Expression newLastCode) {
		Expression oldLastCode = lastCode;
		lastCode = newLastCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.STRING_INDEX__LAST_CODE, oldLastCode, lastCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.STRING_INDEX__FIRST_CODE:
				if (resolve) return getFirstCode();
				return basicGetFirstCode();
			case ExpressionsPackage.STRING_INDEX__LAST_CODE:
				if (resolve) return getLastCode();
				return basicGetLastCode();
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
			case ExpressionsPackage.STRING_INDEX__FIRST_CODE:
				setFirstCode((Expression)newValue);
				return;
			case ExpressionsPackage.STRING_INDEX__LAST_CODE:
				setLastCode((Expression)newValue);
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
			case ExpressionsPackage.STRING_INDEX__FIRST_CODE:
				setFirstCode((Expression)null);
				return;
			case ExpressionsPackage.STRING_INDEX__LAST_CODE:
				setLastCode((Expression)null);
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
			case ExpressionsPackage.STRING_INDEX__FIRST_CODE:
				return firstCode != null;
			case ExpressionsPackage.STRING_INDEX__LAST_CODE:
				return lastCode != null;
		}
		return super.eIsSet(featureID);
	}

} //StringIndexImpl
