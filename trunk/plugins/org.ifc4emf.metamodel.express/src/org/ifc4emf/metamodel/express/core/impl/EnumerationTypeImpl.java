/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.EnumerationType;
import org.ifc4emf.metamodel.express.instances.EnumerationItem;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EnumerationTypeImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EnumerationTypeImpl#getDeclaredItems <em>Declared Items</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EnumerationTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EnumerationTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EnumerationTypeImpl#getIsExtensible <em>Is Extensible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationTypeImpl extends DefinedTypeImpl implements EnumerationType {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationItem> values;

	/**
	 * The cached value of the '{@link #getDeclaredItems() <em>Declared Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredItems()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationItem> declaredItems;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationType> extension;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected EnumerationType base;

	/**
	 * The default value of the '{@link #getIsExtensible() <em>Is Extensible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExtensible()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_EXTENSIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsExtensible() <em>Is Extensible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExtensible()
	 * @generated
	 * @ordered
	 */
	protected Boolean isExtensible = IS_EXTENSIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ENUMERATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationItem> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<EnumerationItem>(EnumerationItem.class, this, CorePackage.ENUMERATION_TYPE__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationItem> getDeclaredItems() {
		if (declaredItems == null) {
			declaredItems = new EObjectContainmentWithInverseEList<EnumerationItem>(EnumerationItem.class, this, CorePackage.ENUMERATION_TYPE__DECLARED_ITEMS, InstancesPackage.ENUMERATION_ITEM__DECLARED_IN);
		}
		return declaredItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationType> getExtension() {
		if (extension == null) {
			extension = new EObjectWithInverseResolvingEList<EnumerationType>(EnumerationType.class, this, CorePackage.ENUMERATION_TYPE__EXTENSION, CorePackage.ENUMERATION_TYPE__BASE);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (EnumerationType)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ENUMERATION_TYPE__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(EnumerationType newBase, NotificationChain msgs) {
		EnumerationType oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ENUMERATION_TYPE__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(EnumerationType newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, CorePackage.ENUMERATION_TYPE__EXTENSION, EnumerationType.class, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, CorePackage.ENUMERATION_TYPE__EXTENSION, EnumerationType.class, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENUMERATION_TYPE__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsExtensible() {
		return isExtensible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExtensible(Boolean newIsExtensible) {
		Boolean oldIsExtensible = isExtensible;
		isExtensible = newIsExtensible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENUMERATION_TYPE__IS_EXTENSIBLE, oldIsExtensible, isExtensible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ENUMERATION_TYPE__DECLARED_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeclaredItems()).basicAdd(otherEnd, msgs);
			case CorePackage.ENUMERATION_TYPE__EXTENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtension()).basicAdd(otherEnd, msgs);
			case CorePackage.ENUMERATION_TYPE__BASE:
				if (base != null)
					msgs = ((InternalEObject)base).eInverseRemove(this, CorePackage.ENUMERATION_TYPE__EXTENSION, EnumerationType.class, msgs);
				return basicSetBase((EnumerationType)otherEnd, msgs);
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
			case CorePackage.ENUMERATION_TYPE__DECLARED_ITEMS:
				return ((InternalEList<?>)getDeclaredItems()).basicRemove(otherEnd, msgs);
			case CorePackage.ENUMERATION_TYPE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case CorePackage.ENUMERATION_TYPE__BASE:
				return basicSetBase(null, msgs);
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
			case CorePackage.ENUMERATION_TYPE__VALUES:
				return getValues();
			case CorePackage.ENUMERATION_TYPE__DECLARED_ITEMS:
				return getDeclaredItems();
			case CorePackage.ENUMERATION_TYPE__EXTENSION:
				return getExtension();
			case CorePackage.ENUMERATION_TYPE__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case CorePackage.ENUMERATION_TYPE__IS_EXTENSIBLE:
				return getIsExtensible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.ENUMERATION_TYPE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends EnumerationItem>)newValue);
				return;
			case CorePackage.ENUMERATION_TYPE__DECLARED_ITEMS:
				getDeclaredItems().clear();
				getDeclaredItems().addAll((Collection<? extends EnumerationItem>)newValue);
				return;
			case CorePackage.ENUMERATION_TYPE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends EnumerationType>)newValue);
				return;
			case CorePackage.ENUMERATION_TYPE__BASE:
				setBase((EnumerationType)newValue);
				return;
			case CorePackage.ENUMERATION_TYPE__IS_EXTENSIBLE:
				setIsExtensible((Boolean)newValue);
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
			case CorePackage.ENUMERATION_TYPE__VALUES:
				getValues().clear();
				return;
			case CorePackage.ENUMERATION_TYPE__DECLARED_ITEMS:
				getDeclaredItems().clear();
				return;
			case CorePackage.ENUMERATION_TYPE__EXTENSION:
				getExtension().clear();
				return;
			case CorePackage.ENUMERATION_TYPE__BASE:
				setBase((EnumerationType)null);
				return;
			case CorePackage.ENUMERATION_TYPE__IS_EXTENSIBLE:
				setIsExtensible(IS_EXTENSIBLE_EDEFAULT);
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
			case CorePackage.ENUMERATION_TYPE__VALUES:
				return values != null && !values.isEmpty();
			case CorePackage.ENUMERATION_TYPE__DECLARED_ITEMS:
				return declaredItems != null && !declaredItems.isEmpty();
			case CorePackage.ENUMERATION_TYPE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case CorePackage.ENUMERATION_TYPE__BASE:
				return base != null;
			case CorePackage.ENUMERATION_TYPE__IS_EXTENSIBLE:
				return IS_EXTENSIBLE_EDEFAULT == null ? isExtensible != null : !IS_EXTENSIBLE_EDEFAULT.equals(isExtensible);
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
		result.append(" (isExtensible: ");
		result.append(isExtensible);
		result.append(')');
		return result.toString();
	}

} //EnumerationTypeImpl
