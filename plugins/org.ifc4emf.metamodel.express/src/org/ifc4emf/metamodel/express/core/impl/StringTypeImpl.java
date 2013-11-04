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
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.LengthConstraint;
import org.ifc4emf.metamodel.express.core.StringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.StringTypeImpl#getStringLengthConstraint <em>String Length Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringTypeImpl extends SimpleTypeImpl implements StringType {
	/**
	 * The cached value of the '{@link #getStringLengthConstraint() <em>String Length Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringLengthConstraint()
	 * @generated
	 * @ordered
	 */
	protected LengthConstraint stringLengthConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.STRING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthConstraint getStringLengthConstraint() {
		return stringLengthConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringLengthConstraint(LengthConstraint newStringLengthConstraint, NotificationChain msgs) {
		LengthConstraint oldStringLengthConstraint = stringLengthConstraint;
		stringLengthConstraint = newStringLengthConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.STRING_TYPE__STRING_LENGTH_CONSTRAINT, oldStringLengthConstraint, newStringLengthConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringLengthConstraint(LengthConstraint newStringLengthConstraint) {
		if (newStringLengthConstraint != stringLengthConstraint) {
			NotificationChain msgs = null;
			if (stringLengthConstraint != null)
				msgs = ((InternalEObject)stringLengthConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.STRING_TYPE__STRING_LENGTH_CONSTRAINT, null, msgs);
			if (newStringLengthConstraint != null)
				msgs = ((InternalEObject)newStringLengthConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.STRING_TYPE__STRING_LENGTH_CONSTRAINT, null, msgs);
			msgs = basicSetStringLengthConstraint(newStringLengthConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STRING_TYPE__STRING_LENGTH_CONSTRAINT, newStringLengthConstraint, newStringLengthConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.STRING_TYPE__STRING_LENGTH_CONSTRAINT:
				return basicSetStringLengthConstraint(null, msgs);
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
			case CorePackage.STRING_TYPE__STRING_LENGTH_CONSTRAINT:
				return getStringLengthConstraint();
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
			case CorePackage.STRING_TYPE__STRING_LENGTH_CONSTRAINT:
				setStringLengthConstraint((LengthConstraint)newValue);
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
			case CorePackage.STRING_TYPE__STRING_LENGTH_CONSTRAINT:
				setStringLengthConstraint((LengthConstraint)null);
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
			case CorePackage.STRING_TYPE__STRING_LENGTH_CONSTRAINT:
				return stringLengthConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //StringTypeImpl
