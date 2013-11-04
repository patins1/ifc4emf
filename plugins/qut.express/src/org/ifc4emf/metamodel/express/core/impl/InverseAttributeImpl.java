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
import org.ifc4emf.metamodel.express.core.DomainRole;
import org.ifc4emf.metamodel.express.core.InverseAttribute;
import org.ifc4emf.metamodel.express.core.InvertibleAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inverse Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InverseAttributeImpl#getModelsRole <em>Models Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InverseAttributeImpl#getExplicit <em>Explicit</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InverseAttributeImpl#getIsUnique <em>Is Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InverseAttributeImpl extends AttributeImpl implements InverseAttribute {
	/**
	 * The cached value of the '{@link #getModelsRole() <em>Models Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelsRole()
	 * @generated
	 * @ordered
	 */
	protected DomainRole modelsRole;

	/**
	 * The cached value of the '{@link #getExplicit() <em>Explicit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicit()
	 * @generated
	 * @ordered
	 */
	protected InvertibleAttribute explicit;

	/**
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InverseAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INVERSE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRole getModelsRole() {
		if (modelsRole != null && modelsRole.eIsProxy()) {
			InternalEObject oldModelsRole = (InternalEObject)modelsRole;
			modelsRole = (DomainRole)eResolveProxy(oldModelsRole);
			if (modelsRole != oldModelsRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE, oldModelsRole, modelsRole));
			}
		}
		return modelsRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRole basicGetModelsRole() {
		return modelsRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelsRole(DomainRole newModelsRole, NotificationChain msgs) {
		DomainRole oldModelsRole = modelsRole;
		modelsRole = newModelsRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE, oldModelsRole, newModelsRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelsRole(DomainRole newModelsRole) {
		if (newModelsRole != modelsRole) {
			NotificationChain msgs = null;
			if (modelsRole != null)
				msgs = ((InternalEObject)modelsRole).eInverseRemove(this, CorePackage.DOMAIN_ROLE__RANGE_VIEW, DomainRole.class, msgs);
			if (newModelsRole != null)
				msgs = ((InternalEObject)newModelsRole).eInverseAdd(this, CorePackage.DOMAIN_ROLE__RANGE_VIEW, DomainRole.class, msgs);
			msgs = basicSetModelsRole(newModelsRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE, newModelsRole, newModelsRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvertibleAttribute getExplicit() {
		if (explicit != null && explicit.eIsProxy()) {
			InternalEObject oldExplicit = (InternalEObject)explicit;
			explicit = (InvertibleAttribute)eResolveProxy(oldExplicit);
			if (explicit != oldExplicit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.INVERSE_ATTRIBUTE__EXPLICIT, oldExplicit, explicit));
			}
		}
		return explicit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvertibleAttribute basicGetExplicit() {
		return explicit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExplicit(InvertibleAttribute newExplicit, NotificationChain msgs) {
		InvertibleAttribute oldExplicit = explicit;
		explicit = newExplicit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INVERSE_ATTRIBUTE__EXPLICIT, oldExplicit, newExplicit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicit(InvertibleAttribute newExplicit) {
		if (newExplicit != explicit) {
			NotificationChain msgs = null;
			if (explicit != null)
				msgs = ((InternalEObject)explicit).eInverseRemove(this, CorePackage.INVERTIBLE_ATTRIBUTE__INVERSE, InvertibleAttribute.class, msgs);
			if (newExplicit != null)
				msgs = ((InternalEObject)newExplicit).eInverseAdd(this, CorePackage.INVERTIBLE_ATTRIBUTE__INVERSE, InvertibleAttribute.class, msgs);
			msgs = basicSetExplicit(newExplicit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INVERSE_ATTRIBUTE__EXPLICIT, newExplicit, newExplicit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(Boolean newIsUnique) {
		Boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INVERSE_ATTRIBUTE__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE:
				if (modelsRole != null)
					msgs = ((InternalEObject)modelsRole).eInverseRemove(this, CorePackage.DOMAIN_ROLE__RANGE_VIEW, DomainRole.class, msgs);
				return basicSetModelsRole((DomainRole)otherEnd, msgs);
			case CorePackage.INVERSE_ATTRIBUTE__EXPLICIT:
				if (explicit != null)
					msgs = ((InternalEObject)explicit).eInverseRemove(this, CorePackage.INVERTIBLE_ATTRIBUTE__INVERSE, InvertibleAttribute.class, msgs);
				return basicSetExplicit((InvertibleAttribute)otherEnd, msgs);
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
			case CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE:
				return basicSetModelsRole(null, msgs);
			case CorePackage.INVERSE_ATTRIBUTE__EXPLICIT:
				return basicSetExplicit(null, msgs);
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
			case CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE:
				if (resolve) return getModelsRole();
				return basicGetModelsRole();
			case CorePackage.INVERSE_ATTRIBUTE__EXPLICIT:
				if (resolve) return getExplicit();
				return basicGetExplicit();
			case CorePackage.INVERSE_ATTRIBUTE__IS_UNIQUE:
				return getIsUnique();
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
			case CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE:
				setModelsRole((DomainRole)newValue);
				return;
			case CorePackage.INVERSE_ATTRIBUTE__EXPLICIT:
				setExplicit((InvertibleAttribute)newValue);
				return;
			case CorePackage.INVERSE_ATTRIBUTE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
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
			case CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE:
				setModelsRole((DomainRole)null);
				return;
			case CorePackage.INVERSE_ATTRIBUTE__EXPLICIT:
				setExplicit((InvertibleAttribute)null);
				return;
			case CorePackage.INVERSE_ATTRIBUTE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
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
			case CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE:
				return modelsRole != null;
			case CorePackage.INVERSE_ATTRIBUTE__EXPLICIT:
				return explicit != null;
			case CorePackage.INVERSE_ATTRIBUTE__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
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
		result.append(" (isUnique: ");
		result.append(isUnique);
		result.append(')');
		return result.toString();
	}

} //InverseAttributeImpl
