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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DomainRole;
import org.ifc4emf.metamodel.express.core.InvertibleAttribute;
import org.ifc4emf.metamodel.express.core.RangeRole;
import org.ifc4emf.metamodel.express.core.Relationship;
import org.ifc4emf.metamodel.express.core.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RelationshipImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RelationshipImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RelationshipImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RelationshipImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends EObjectImpl implements Relationship {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected DomainRole domain;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected InvertibleAttribute basedOn;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected RangeRole range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRole getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (DomainRole)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RELATIONSHIP__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRole basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(DomainRole newDomain) {
		DomainRole oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectWithInverseResolvingEList<Role>(Role.class, this, CorePackage.RELATIONSHIP__ROLES, CorePackage.ROLE__IN_RELATIONSHIP);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvertibleAttribute getBasedOn() {
		if (basedOn != null && basedOn.eIsProxy()) {
			InternalEObject oldBasedOn = (InternalEObject)basedOn;
			basedOn = (InvertibleAttribute)eResolveProxy(oldBasedOn);
			if (basedOn != oldBasedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RELATIONSHIP__BASED_ON, oldBasedOn, basedOn));
			}
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvertibleAttribute basicGetBasedOn() {
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasedOn(InvertibleAttribute newBasedOn, NotificationChain msgs) {
		InvertibleAttribute oldBasedOn = basedOn;
		basedOn = newBasedOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP__BASED_ON, oldBasedOn, newBasedOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedOn(InvertibleAttribute newBasedOn) {
		if (newBasedOn != basedOn) {
			NotificationChain msgs = null;
			if (basedOn != null)
				msgs = ((InternalEObject)basedOn).eInverseRemove(this, CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP, InvertibleAttribute.class, msgs);
			if (newBasedOn != null)
				msgs = ((InternalEObject)newBasedOn).eInverseAdd(this, CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP, InvertibleAttribute.class, msgs);
			msgs = basicSetBasedOn(newBasedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP__BASED_ON, newBasedOn, newBasedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeRole getRange() {
		if (range != null && range.eIsProxy()) {
			InternalEObject oldRange = (InternalEObject)range;
			range = (RangeRole)eResolveProxy(oldRange);
			if (range != oldRange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RELATIONSHIP__RANGE, oldRange, range));
			}
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeRole basicGetRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(RangeRole newRange) {
		RangeRole oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP__RANGE, oldRange, range));
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
			case CorePackage.RELATIONSHIP__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case CorePackage.RELATIONSHIP__BASED_ON:
				if (basedOn != null)
					msgs = ((InternalEObject)basedOn).eInverseRemove(this, CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP, InvertibleAttribute.class, msgs);
				return basicSetBasedOn((InvertibleAttribute)otherEnd, msgs);
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
			case CorePackage.RELATIONSHIP__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case CorePackage.RELATIONSHIP__BASED_ON:
				return basicSetBasedOn(null, msgs);
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
			case CorePackage.RELATIONSHIP__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case CorePackage.RELATIONSHIP__ROLES:
				return getRoles();
			case CorePackage.RELATIONSHIP__BASED_ON:
				if (resolve) return getBasedOn();
				return basicGetBasedOn();
			case CorePackage.RELATIONSHIP__RANGE:
				if (resolve) return getRange();
				return basicGetRange();
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
			case CorePackage.RELATIONSHIP__DOMAIN:
				setDomain((DomainRole)newValue);
				return;
			case CorePackage.RELATIONSHIP__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case CorePackage.RELATIONSHIP__BASED_ON:
				setBasedOn((InvertibleAttribute)newValue);
				return;
			case CorePackage.RELATIONSHIP__RANGE:
				setRange((RangeRole)newValue);
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
			case CorePackage.RELATIONSHIP__DOMAIN:
				setDomain((DomainRole)null);
				return;
			case CorePackage.RELATIONSHIP__ROLES:
				getRoles().clear();
				return;
			case CorePackage.RELATIONSHIP__BASED_ON:
				setBasedOn((InvertibleAttribute)null);
				return;
			case CorePackage.RELATIONSHIP__RANGE:
				setRange((RangeRole)null);
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
			case CorePackage.RELATIONSHIP__DOMAIN:
				return domain != null;
			case CorePackage.RELATIONSHIP__ROLES:
				return roles != null && !roles.isEmpty();
			case CorePackage.RELATIONSHIP__BASED_ON:
				return basedOn != null;
			case CorePackage.RELATIONSHIP__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipImpl
