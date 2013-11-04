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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DomainConstraint;
import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.DomainConstraintImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.DomainConstraintImpl#getAsserts <em>Asserts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DomainConstraintImpl extends EObjectImpl implements DomainConstraint {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected AttributeType domain;

	/**
	 * The cached value of the '{@link #getAsserts() <em>Asserts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsserts()
	 * @generated
	 * @ordered
	 */
	protected Expression asserts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DOMAIN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (AttributeType)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DOMAIN_CONSTRAINT__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(AttributeType newDomain, NotificationChain msgs) {
		AttributeType oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_CONSTRAINT__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(AttributeType newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, CorePackage.ATTRIBUTE_TYPE__CONSTRAINTS, AttributeType.class, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, CorePackage.ATTRIBUTE_TYPE__CONSTRAINTS, AttributeType.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_CONSTRAINT__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAsserts() {
		return asserts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsserts(Expression newAsserts, NotificationChain msgs) {
		Expression oldAsserts = asserts;
		asserts = newAsserts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_CONSTRAINT__ASSERTS, oldAsserts, newAsserts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsserts(Expression newAsserts) {
		if (newAsserts != asserts) {
			NotificationChain msgs = null;
			if (asserts != null)
				msgs = ((InternalEObject)asserts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.DOMAIN_CONSTRAINT__ASSERTS, null, msgs);
			if (newAsserts != null)
				msgs = ((InternalEObject)newAsserts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.DOMAIN_CONSTRAINT__ASSERTS, null, msgs);
			msgs = basicSetAsserts(newAsserts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_CONSTRAINT__ASSERTS, newAsserts, newAsserts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DOMAIN_CONSTRAINT__DOMAIN:
				if (domain != null)
					msgs = ((InternalEObject)domain).eInverseRemove(this, CorePackage.ATTRIBUTE_TYPE__CONSTRAINTS, AttributeType.class, msgs);
				return basicSetDomain((AttributeType)otherEnd, msgs);
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
			case CorePackage.DOMAIN_CONSTRAINT__DOMAIN:
				return basicSetDomain(null, msgs);
			case CorePackage.DOMAIN_CONSTRAINT__ASSERTS:
				return basicSetAsserts(null, msgs);
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
			case CorePackage.DOMAIN_CONSTRAINT__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case CorePackage.DOMAIN_CONSTRAINT__ASSERTS:
				return getAsserts();
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
			case CorePackage.DOMAIN_CONSTRAINT__DOMAIN:
				setDomain((AttributeType)newValue);
				return;
			case CorePackage.DOMAIN_CONSTRAINT__ASSERTS:
				setAsserts((Expression)newValue);
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
			case CorePackage.DOMAIN_CONSTRAINT__DOMAIN:
				setDomain((AttributeType)null);
				return;
			case CorePackage.DOMAIN_CONSTRAINT__ASSERTS:
				setAsserts((Expression)null);
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
			case CorePackage.DOMAIN_CONSTRAINT__DOMAIN:
				return domain != null;
			case CorePackage.DOMAIN_CONSTRAINT__ASSERTS:
				return asserts != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainConstraintImpl
