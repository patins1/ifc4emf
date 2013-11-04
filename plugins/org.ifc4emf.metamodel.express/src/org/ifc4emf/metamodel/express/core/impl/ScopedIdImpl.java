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
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.core.ScopedId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scoped Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.ScopedIdImpl#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.ScopedIdImpl#getDefiningScope <em>Defining Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopedIdImpl extends EObjectImpl implements ScopedId {
	/**
	 * The default value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalName()
	 * @generated
	 * @ordered
	 */
	protected String localName = LOCAL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefiningScope() <em>Defining Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningScope()
	 * @generated
	 * @ordered
	 */
	protected Scope definingScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopedIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SCOPED_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalName() {
		return localName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalName(String newLocalName) {
		String oldLocalName = localName;
		localName = newLocalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCOPED_ID__LOCAL_NAME, oldLocalName, localName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getDefiningScope() {
		if (definingScope != null && definingScope.eIsProxy()) {
			InternalEObject oldDefiningScope = (InternalEObject)definingScope;
			definingScope = (Scope)eResolveProxy(oldDefiningScope);
			if (definingScope != oldDefiningScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.SCOPED_ID__DEFINING_SCOPE, oldDefiningScope, definingScope));
			}
		}
		return definingScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope basicGetDefiningScope() {
		return definingScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningScope(Scope newDefiningScope) {
		Scope oldDefiningScope = definingScope;
		definingScope = newDefiningScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCOPED_ID__DEFINING_SCOPE, oldDefiningScope, definingScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SCOPED_ID__LOCAL_NAME:
				return getLocalName();
			case CorePackage.SCOPED_ID__DEFINING_SCOPE:
				if (resolve) return getDefiningScope();
				return basicGetDefiningScope();
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
			case CorePackage.SCOPED_ID__LOCAL_NAME:
				setLocalName((String)newValue);
				return;
			case CorePackage.SCOPED_ID__DEFINING_SCOPE:
				setDefiningScope((Scope)newValue);
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
			case CorePackage.SCOPED_ID__LOCAL_NAME:
				setLocalName(LOCAL_NAME_EDEFAULT);
				return;
			case CorePackage.SCOPED_ID__DEFINING_SCOPE:
				setDefiningScope((Scope)null);
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
			case CorePackage.SCOPED_ID__LOCAL_NAME:
				return LOCAL_NAME_EDEFAULT == null ? localName != null : !LOCAL_NAME_EDEFAULT.equals(localName);
			case CorePackage.SCOPED_ID__DEFINING_SCOPE:
				return definingScope != null;
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
		result.append(" (localName: ");
		result.append(localName);
		result.append(')');
		return result.toString();
	}

} //ScopedIdImpl
