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
import org.ifc4emf.metamodel.express.core.AlgorithmScope;
import org.ifc4emf.metamodel.express.core.CommonElement;
import org.ifc4emf.metamodel.express.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.CommonElementImpl#getLocalScope <em>Local Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CommonElementImpl extends SchemaElementImpl implements CommonElement {
	/**
	 * The cached value of the '{@link #getLocalScope() <em>Local Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalScope()
	 * @generated
	 * @ordered
	 */
	protected AlgorithmScope localScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.COMMON_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmScope getLocalScope() {
		if (localScope != null && localScope.eIsProxy()) {
			InternalEObject oldLocalScope = (InternalEObject)localScope;
			localScope = (AlgorithmScope)eResolveProxy(oldLocalScope);
			if (localScope != oldLocalScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.COMMON_ELEMENT__LOCAL_SCOPE, oldLocalScope, localScope));
			}
		}
		return localScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmScope basicGetLocalScope() {
		return localScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalScope(AlgorithmScope newLocalScope, NotificationChain msgs) {
		AlgorithmScope oldLocalScope = localScope;
		localScope = newLocalScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.COMMON_ELEMENT__LOCAL_SCOPE, oldLocalScope, newLocalScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalScope(AlgorithmScope newLocalScope) {
		if (newLocalScope != localScope) {
			NotificationChain msgs = null;
			if (localScope != null)
				msgs = ((InternalEObject)localScope).eInverseRemove(this, CorePackage.ALGORITHM_SCOPE__COMMON_ELEMENTS, AlgorithmScope.class, msgs);
			if (newLocalScope != null)
				msgs = ((InternalEObject)newLocalScope).eInverseAdd(this, CorePackage.ALGORITHM_SCOPE__COMMON_ELEMENTS, AlgorithmScope.class, msgs);
			msgs = basicSetLocalScope(newLocalScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMMON_ELEMENT__LOCAL_SCOPE, newLocalScope, newLocalScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.COMMON_ELEMENT__LOCAL_SCOPE:
				if (localScope != null)
					msgs = ((InternalEObject)localScope).eInverseRemove(this, CorePackage.ALGORITHM_SCOPE__COMMON_ELEMENTS, AlgorithmScope.class, msgs);
				return basicSetLocalScope((AlgorithmScope)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.COMMON_ELEMENT__LOCAL_SCOPE:
				return basicSetLocalScope(null, msgs);
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
			case CorePackage.COMMON_ELEMENT__LOCAL_SCOPE:
				if (resolve) return getLocalScope();
				return basicGetLocalScope();
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
			case CorePackage.COMMON_ELEMENT__LOCAL_SCOPE:
				setLocalScope((AlgorithmScope)newValue);
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
			case CorePackage.COMMON_ELEMENT__LOCAL_SCOPE:
				setLocalScope((AlgorithmScope)null);
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
			case CorePackage.COMMON_ELEMENT__LOCAL_SCOPE:
				return localScope != null;
		}
		return super.eIsSet(featureID);
	}

} //CommonElementImpl
