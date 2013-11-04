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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.NamedType;
import org.ifc4emf.metamodel.express.core.SelectType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SelectTypeImpl#getAllowedTypes <em>Allowed Types</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SelectTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SelectTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SelectTypeImpl#getSelectList <em>Select List</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SelectTypeImpl#getIsExtensible <em>Is Extensible</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SelectTypeImpl#getIsEntity <em>Is Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectTypeImpl extends DefinedTypeImpl implements SelectType {
	/**
	 * The cached value of the '{@link #getAllowedTypes() <em>Allowed Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedType> allowedTypes;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectType> extension;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected SelectType base;

	/**
	 * The cached value of the '{@link #getSelectList() <em>Select List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectList()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedType> selectList;

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
	 * The default value of the '{@link #getIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEntity()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEntity()
	 * @generated
	 * @ordered
	 */
	protected Boolean isEntity = IS_ENTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SELECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedType> getAllowedTypes() {
		if (allowedTypes == null) {
			allowedTypes = new EObjectWithInverseResolvingEList.ManyInverse<NamedType>(NamedType.class, this, CorePackage.SELECT_TYPE__ALLOWED_TYPES, CorePackage.NAMED_TYPE__INSTANTIATES);
		}
		return allowedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectType> getExtension() {
		if (extension == null) {
			extension = new EObjectWithInverseResolvingEList<SelectType>(SelectType.class, this, CorePackage.SELECT_TYPE__EXTENSION, CorePackage.SELECT_TYPE__BASE);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectType getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (SelectType)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.SELECT_TYPE__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectType basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(SelectType newBase, NotificationChain msgs) {
		SelectType oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SELECT_TYPE__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(SelectType newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, CorePackage.SELECT_TYPE__EXTENSION, SelectType.class, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, CorePackage.SELECT_TYPE__EXTENSION, SelectType.class, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SELECT_TYPE__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedType> getSelectList() {
		if (selectList == null) {
			selectList = new EObjectResolvingEList<NamedType>(NamedType.class, this, CorePackage.SELECT_TYPE__SELECT_LIST);
		}
		return selectList;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SELECT_TYPE__IS_EXTENSIBLE, oldIsExtensible, isExtensible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsEntity() {
		return isEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEntity(Boolean newIsEntity) {
		Boolean oldIsEntity = isEntity;
		isEntity = newIsEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SELECT_TYPE__IS_ENTITY, oldIsEntity, isEntity));
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
			case CorePackage.SELECT_TYPE__ALLOWED_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllowedTypes()).basicAdd(otherEnd, msgs);
			case CorePackage.SELECT_TYPE__EXTENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtension()).basicAdd(otherEnd, msgs);
			case CorePackage.SELECT_TYPE__BASE:
				if (base != null)
					msgs = ((InternalEObject)base).eInverseRemove(this, CorePackage.SELECT_TYPE__EXTENSION, SelectType.class, msgs);
				return basicSetBase((SelectType)otherEnd, msgs);
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
			case CorePackage.SELECT_TYPE__ALLOWED_TYPES:
				return ((InternalEList<?>)getAllowedTypes()).basicRemove(otherEnd, msgs);
			case CorePackage.SELECT_TYPE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case CorePackage.SELECT_TYPE__BASE:
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
			case CorePackage.SELECT_TYPE__ALLOWED_TYPES:
				return getAllowedTypes();
			case CorePackage.SELECT_TYPE__EXTENSION:
				return getExtension();
			case CorePackage.SELECT_TYPE__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case CorePackage.SELECT_TYPE__SELECT_LIST:
				return getSelectList();
			case CorePackage.SELECT_TYPE__IS_EXTENSIBLE:
				return getIsExtensible();
			case CorePackage.SELECT_TYPE__IS_ENTITY:
				return getIsEntity();
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
			case CorePackage.SELECT_TYPE__ALLOWED_TYPES:
				getAllowedTypes().clear();
				getAllowedTypes().addAll((Collection<? extends NamedType>)newValue);
				return;
			case CorePackage.SELECT_TYPE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends SelectType>)newValue);
				return;
			case CorePackage.SELECT_TYPE__BASE:
				setBase((SelectType)newValue);
				return;
			case CorePackage.SELECT_TYPE__SELECT_LIST:
				getSelectList().clear();
				getSelectList().addAll((Collection<? extends NamedType>)newValue);
				return;
			case CorePackage.SELECT_TYPE__IS_EXTENSIBLE:
				setIsExtensible((Boolean)newValue);
				return;
			case CorePackage.SELECT_TYPE__IS_ENTITY:
				setIsEntity((Boolean)newValue);
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
			case CorePackage.SELECT_TYPE__ALLOWED_TYPES:
				getAllowedTypes().clear();
				return;
			case CorePackage.SELECT_TYPE__EXTENSION:
				getExtension().clear();
				return;
			case CorePackage.SELECT_TYPE__BASE:
				setBase((SelectType)null);
				return;
			case CorePackage.SELECT_TYPE__SELECT_LIST:
				getSelectList().clear();
				return;
			case CorePackage.SELECT_TYPE__IS_EXTENSIBLE:
				setIsExtensible(IS_EXTENSIBLE_EDEFAULT);
				return;
			case CorePackage.SELECT_TYPE__IS_ENTITY:
				setIsEntity(IS_ENTITY_EDEFAULT);
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
			case CorePackage.SELECT_TYPE__ALLOWED_TYPES:
				return allowedTypes != null && !allowedTypes.isEmpty();
			case CorePackage.SELECT_TYPE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case CorePackage.SELECT_TYPE__BASE:
				return base != null;
			case CorePackage.SELECT_TYPE__SELECT_LIST:
				return selectList != null && !selectList.isEmpty();
			case CorePackage.SELECT_TYPE__IS_EXTENSIBLE:
				return IS_EXTENSIBLE_EDEFAULT == null ? isExtensible != null : !IS_EXTENSIBLE_EDEFAULT.equals(isExtensible);
			case CorePackage.SELECT_TYPE__IS_ENTITY:
				return IS_ENTITY_EDEFAULT == null ? isEntity != null : !IS_ENTITY_EDEFAULT.equals(isEntity);
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
		result.append(", isEntity: ");
		result.append(isEntity);
		result.append(')');
		return result.toString();
	}

} //SelectTypeImpl
