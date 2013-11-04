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
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.InverseAttribute;
import org.ifc4emf.metamodel.express.core.ScopedId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.DomainRoleImpl#getRangeView <em>Range View</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.DomainRoleImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.DomainRoleImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainRoleImpl extends RoleImpl implements DomainRole {
	/**
	 * The cached value of the '{@link #getRangeView() <em>Range View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeView()
	 * @generated
	 * @ordered
	 */
	protected InverseAttribute rangeView;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EntityType domain;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected ScopedId id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DOMAIN_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseAttribute getRangeView() {
		if (rangeView != null && rangeView.eIsProxy()) {
			InternalEObject oldRangeView = (InternalEObject)rangeView;
			rangeView = (InverseAttribute)eResolveProxy(oldRangeView);
			if (rangeView != oldRangeView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DOMAIN_ROLE__RANGE_VIEW, oldRangeView, rangeView));
			}
		}
		return rangeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseAttribute basicGetRangeView() {
		return rangeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeView(InverseAttribute newRangeView, NotificationChain msgs) {
		InverseAttribute oldRangeView = rangeView;
		rangeView = newRangeView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_ROLE__RANGE_VIEW, oldRangeView, newRangeView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeView(InverseAttribute newRangeView) {
		if (newRangeView != rangeView) {
			NotificationChain msgs = null;
			if (rangeView != null)
				msgs = ((InternalEObject)rangeView).eInverseRemove(this, CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE, InverseAttribute.class, msgs);
			if (newRangeView != null)
				msgs = ((InternalEObject)newRangeView).eInverseAdd(this, CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE, InverseAttribute.class, msgs);
			msgs = basicSetRangeView(newRangeView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_ROLE__RANGE_VIEW, newRangeView, newRangeView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (EntityType)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DOMAIN_ROLE__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(EntityType newDomain, NotificationChain msgs) {
		EntityType oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_ROLE__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(EntityType newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, CorePackage.ENTITY_TYPE__PLAYS_DOMAIN_ROLE, EntityType.class, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, CorePackage.ENTITY_TYPE__PLAYS_DOMAIN_ROLE, EntityType.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_ROLE__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedId getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(ScopedId newId, NotificationChain msgs) {
		ScopedId oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_ROLE__ID, oldId, newId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(ScopedId newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.DOMAIN_ROLE__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.DOMAIN_ROLE__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_ROLE__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DOMAIN_ROLE__RANGE_VIEW:
				if (rangeView != null)
					msgs = ((InternalEObject)rangeView).eInverseRemove(this, CorePackage.INVERSE_ATTRIBUTE__MODELS_ROLE, InverseAttribute.class, msgs);
				return basicSetRangeView((InverseAttribute)otherEnd, msgs);
			case CorePackage.DOMAIN_ROLE__DOMAIN:
				if (domain != null)
					msgs = ((InternalEObject)domain).eInverseRemove(this, CorePackage.ENTITY_TYPE__PLAYS_DOMAIN_ROLE, EntityType.class, msgs);
				return basicSetDomain((EntityType)otherEnd, msgs);
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
			case CorePackage.DOMAIN_ROLE__RANGE_VIEW:
				return basicSetRangeView(null, msgs);
			case CorePackage.DOMAIN_ROLE__DOMAIN:
				return basicSetDomain(null, msgs);
			case CorePackage.DOMAIN_ROLE__ID:
				return basicSetId(null, msgs);
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
			case CorePackage.DOMAIN_ROLE__RANGE_VIEW:
				if (resolve) return getRangeView();
				return basicGetRangeView();
			case CorePackage.DOMAIN_ROLE__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case CorePackage.DOMAIN_ROLE__ID:
				return getId();
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
			case CorePackage.DOMAIN_ROLE__RANGE_VIEW:
				setRangeView((InverseAttribute)newValue);
				return;
			case CorePackage.DOMAIN_ROLE__DOMAIN:
				setDomain((EntityType)newValue);
				return;
			case CorePackage.DOMAIN_ROLE__ID:
				setId((ScopedId)newValue);
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
			case CorePackage.DOMAIN_ROLE__RANGE_VIEW:
				setRangeView((InverseAttribute)null);
				return;
			case CorePackage.DOMAIN_ROLE__DOMAIN:
				setDomain((EntityType)null);
				return;
			case CorePackage.DOMAIN_ROLE__ID:
				setId((ScopedId)null);
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
			case CorePackage.DOMAIN_ROLE__RANGE_VIEW:
				return rangeView != null;
			case CorePackage.DOMAIN_ROLE__DOMAIN:
				return domain != null;
			case CorePackage.DOMAIN_ROLE__ID:
				return id != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainRoleImpl
