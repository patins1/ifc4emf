/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.core.BinaryType;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.LengthConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.BinaryTypeImpl#getBinaryLengthConstraint <em>Binary Length Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryTypeImpl extends SimpleTypeImpl implements BinaryType {
	/**
	 * The cached value of the '{@link #getBinaryLengthConstraint() <em>Binary Length Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryLengthConstraint()
	 * @generated
	 * @ordered
	 */
	protected LengthConstraint binaryLengthConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BINARY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthConstraint getBinaryLengthConstraint() {
		return binaryLengthConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryLengthConstraint(LengthConstraint newBinaryLengthConstraint, NotificationChain msgs) {
		LengthConstraint oldBinaryLengthConstraint = binaryLengthConstraint;
		binaryLengthConstraint = newBinaryLengthConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BINARY_TYPE__BINARY_LENGTH_CONSTRAINT, oldBinaryLengthConstraint, newBinaryLengthConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryLengthConstraint(LengthConstraint newBinaryLengthConstraint) {
		if (newBinaryLengthConstraint != binaryLengthConstraint) {
			NotificationChain msgs = null;
			if (binaryLengthConstraint != null)
				msgs = ((InternalEObject)binaryLengthConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.BINARY_TYPE__BINARY_LENGTH_CONSTRAINT, null, msgs);
			if (newBinaryLengthConstraint != null)
				msgs = ((InternalEObject)newBinaryLengthConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.BINARY_TYPE__BINARY_LENGTH_CONSTRAINT, null, msgs);
			msgs = basicSetBinaryLengthConstraint(newBinaryLengthConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BINARY_TYPE__BINARY_LENGTH_CONSTRAINT, newBinaryLengthConstraint, newBinaryLengthConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.BINARY_TYPE__BINARY_LENGTH_CONSTRAINT:
				return basicSetBinaryLengthConstraint(null, msgs);
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
			case CorePackage.BINARY_TYPE__BINARY_LENGTH_CONSTRAINT:
				return getBinaryLengthConstraint();
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
			case CorePackage.BINARY_TYPE__BINARY_LENGTH_CONSTRAINT:
				setBinaryLengthConstraint((LengthConstraint)newValue);
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
			case CorePackage.BINARY_TYPE__BINARY_LENGTH_CONSTRAINT:
				setBinaryLengthConstraint((LengthConstraint)null);
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
			case CorePackage.BINARY_TYPE__BINARY_LENGTH_CONSTRAINT:
				return binaryLengthConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryTypeImpl
