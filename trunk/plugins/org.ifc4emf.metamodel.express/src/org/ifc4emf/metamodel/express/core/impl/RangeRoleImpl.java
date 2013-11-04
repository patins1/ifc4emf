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
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.InvertibleAttribute;
import org.ifc4emf.metamodel.express.core.RangeRole;
import org.ifc4emf.metamodel.express.core.ScopedId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RangeRoleImpl#getDomainView <em>Domain View</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RangeRoleImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RangeRoleImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeRoleImpl extends RoleImpl implements RangeRole {
	/**
	 * The cached value of the '{@link #getDomainView() <em>Domain View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainView()
	 * @generated
	 * @ordered
	 */
	protected InvertibleAttribute domainView;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EntityType range;

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
	protected RangeRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.RANGE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvertibleAttribute getDomainView() {
		if (domainView != null && domainView.eIsProxy()) {
			InternalEObject oldDomainView = (InternalEObject)domainView;
			domainView = (InvertibleAttribute)eResolveProxy(oldDomainView);
			if (domainView != oldDomainView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RANGE_ROLE__DOMAIN_VIEW, oldDomainView, domainView));
			}
		}
		return domainView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvertibleAttribute basicGetDomainView() {
		return domainView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainView(InvertibleAttribute newDomainView, NotificationChain msgs) {
		InvertibleAttribute oldDomainView = domainView;
		domainView = newDomainView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RANGE_ROLE__DOMAIN_VIEW, oldDomainView, newDomainView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainView(InvertibleAttribute newDomainView) {
		if (newDomainView != domainView) {
			NotificationChain msgs = null;
			if (domainView != null)
				msgs = ((InternalEObject)domainView).eInverseRemove(this, CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE, InvertibleAttribute.class, msgs);
			if (newDomainView != null)
				msgs = ((InternalEObject)newDomainView).eInverseAdd(this, CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE, InvertibleAttribute.class, msgs);
			msgs = basicSetDomainView(newDomainView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RANGE_ROLE__DOMAIN_VIEW, newDomainView, newDomainView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getRange() {
		if (range != null && range.eIsProxy()) {
			InternalEObject oldRange = (InternalEObject)range;
			range = (EntityType)eResolveProxy(oldRange);
			if (range != oldRange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RANGE_ROLE__RANGE, oldRange, range));
			}
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(EntityType newRange, NotificationChain msgs) {
		EntityType oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RANGE_ROLE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(EntityType newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, CorePackage.ENTITY_TYPE__PLAYS_RANGE_ROLE, EntityType.class, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, CorePackage.ENTITY_TYPE__PLAYS_RANGE_ROLE, EntityType.class, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RANGE_ROLE__RANGE, newRange, newRange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RANGE_ROLE__ID, oldId, newId);
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
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.RANGE_ROLE__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.RANGE_ROLE__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RANGE_ROLE__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.RANGE_ROLE__DOMAIN_VIEW:
				if (domainView != null)
					msgs = ((InternalEObject)domainView).eInverseRemove(this, CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE, InvertibleAttribute.class, msgs);
				return basicSetDomainView((InvertibleAttribute)otherEnd, msgs);
			case CorePackage.RANGE_ROLE__RANGE:
				if (range != null)
					msgs = ((InternalEObject)range).eInverseRemove(this, CorePackage.ENTITY_TYPE__PLAYS_RANGE_ROLE, EntityType.class, msgs);
				return basicSetRange((EntityType)otherEnd, msgs);
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
			case CorePackage.RANGE_ROLE__DOMAIN_VIEW:
				return basicSetDomainView(null, msgs);
			case CorePackage.RANGE_ROLE__RANGE:
				return basicSetRange(null, msgs);
			case CorePackage.RANGE_ROLE__ID:
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
			case CorePackage.RANGE_ROLE__DOMAIN_VIEW:
				if (resolve) return getDomainView();
				return basicGetDomainView();
			case CorePackage.RANGE_ROLE__RANGE:
				if (resolve) return getRange();
				return basicGetRange();
			case CorePackage.RANGE_ROLE__ID:
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
			case CorePackage.RANGE_ROLE__DOMAIN_VIEW:
				setDomainView((InvertibleAttribute)newValue);
				return;
			case CorePackage.RANGE_ROLE__RANGE:
				setRange((EntityType)newValue);
				return;
			case CorePackage.RANGE_ROLE__ID:
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
			case CorePackage.RANGE_ROLE__DOMAIN_VIEW:
				setDomainView((InvertibleAttribute)null);
				return;
			case CorePackage.RANGE_ROLE__RANGE:
				setRange((EntityType)null);
				return;
			case CorePackage.RANGE_ROLE__ID:
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
			case CorePackage.RANGE_ROLE__DOMAIN_VIEW:
				return domainView != null;
			case CorePackage.RANGE_ROLE__RANGE:
				return range != null;
			case CorePackage.RANGE_ROLE__ID:
				return id != null;
		}
		return super.eIsSet(featureID);
	}

} //RangeRoleImpl
