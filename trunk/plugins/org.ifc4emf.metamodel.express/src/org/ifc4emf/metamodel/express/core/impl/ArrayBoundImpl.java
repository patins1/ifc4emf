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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.ifc4emf.metamodel.express.core.ArrayBound;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Bound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.ArrayBoundImpl#getBoundExpression <em>Bound Expression</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.ArrayBoundImpl#getBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayBoundImpl extends EObjectImpl implements ArrayBound {
	/**
	 * The cached value of the '{@link #getBoundExpression() <em>Bound Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression boundExpression;

	/**
	 * The default value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected Integer bound = BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayBoundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ARRAY_BOUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBoundExpression() {
		if (boundExpression != null && boundExpression.eIsProxy()) {
			InternalEObject oldBoundExpression = (InternalEObject)boundExpression;
			boundExpression = (Expression)eResolveProxy(oldBoundExpression);
			if (boundExpression != oldBoundExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ARRAY_BOUND__BOUND_EXPRESSION, oldBoundExpression, boundExpression));
			}
		}
		return boundExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetBoundExpression() {
		return boundExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundExpression(Expression newBoundExpression) {
		Expression oldBoundExpression = boundExpression;
		boundExpression = newBoundExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ARRAY_BOUND__BOUND_EXPRESSION, oldBoundExpression, boundExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBound() {
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(Integer newBound) {
		Integer oldBound = bound;
		bound = newBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ARRAY_BOUND__BOUND, oldBound, bound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ARRAY_BOUND__BOUND_EXPRESSION:
				if (resolve) return getBoundExpression();
				return basicGetBoundExpression();
			case CorePackage.ARRAY_BOUND__BOUND:
				return getBound();
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
			case CorePackage.ARRAY_BOUND__BOUND_EXPRESSION:
				setBoundExpression((Expression)newValue);
				return;
			case CorePackage.ARRAY_BOUND__BOUND:
				setBound((Integer)newValue);
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
			case CorePackage.ARRAY_BOUND__BOUND_EXPRESSION:
				setBoundExpression((Expression)null);
				return;
			case CorePackage.ARRAY_BOUND__BOUND:
				setBound(BOUND_EDEFAULT);
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
			case CorePackage.ARRAY_BOUND__BOUND_EXPRESSION:
				return boundExpression != null;
			case CorePackage.ARRAY_BOUND__BOUND:
				return BOUND_EDEFAULT == null ? bound != null : !BOUND_EDEFAULT.equals(bound);
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
		result.append(" (bound: ");
		result.append(bound);
		result.append(')');
		return result.toString();
	}

} //ArrayBoundImpl
