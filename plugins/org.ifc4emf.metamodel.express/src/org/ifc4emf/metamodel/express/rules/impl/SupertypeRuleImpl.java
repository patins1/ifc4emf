/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.rules.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.impl.CommonElementImpl;
import org.ifc4emf.metamodel.express.rules.RulesPackage;
import org.ifc4emf.metamodel.express.rules.SubtypeConstraint;
import org.ifc4emf.metamodel.express.rules.SupertypeRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supertype Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.SupertypeRuleImpl#getNamedSupertype <em>Named Supertype</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.SupertypeRuleImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.SupertypeRuleImpl#getAssertsAbstract <em>Asserts Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupertypeRuleImpl extends CommonElementImpl implements SupertypeRule {
	/**
	 * The cached value of the '{@link #getNamedSupertype() <em>Named Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedSupertype()
	 * @generated
	 * @ordered
	 */
	protected EntityType namedSupertype;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<SubtypeConstraint> constraints;

	/**
	 * The default value of the '{@link #getAssertsAbstract() <em>Asserts Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ASSERTS_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssertsAbstract() <em>Asserts Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean assertsAbstract = ASSERTS_ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupertypeRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.SUPERTYPE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getNamedSupertype() {
		if (namedSupertype != null && namedSupertype.eIsProxy()) {
			InternalEObject oldNamedSupertype = (InternalEObject)namedSupertype;
			namedSupertype = (EntityType)eResolveProxy(oldNamedSupertype);
			if (namedSupertype != oldNamedSupertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.SUPERTYPE_RULE__NAMED_SUPERTYPE, oldNamedSupertype, namedSupertype));
			}
		}
		return namedSupertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetNamedSupertype() {
		return namedSupertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedSupertype(EntityType newNamedSupertype) {
		EntityType oldNamedSupertype = namedSupertype;
		namedSupertype = newNamedSupertype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.SUPERTYPE_RULE__NAMED_SUPERTYPE, oldNamedSupertype, namedSupertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubtypeConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentWithInverseEList<SubtypeConstraint>(SubtypeConstraint.class, this, RulesPackage.SUPERTYPE_RULE__CONSTRAINTS, RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAssertsAbstract() {
		return assertsAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertsAbstract(Boolean newAssertsAbstract) {
		Boolean oldAssertsAbstract = assertsAbstract;
		assertsAbstract = newAssertsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.SUPERTYPE_RULE__ASSERTS_ABSTRACT, oldAssertsAbstract, assertsAbstract));
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
			case RulesPackage.SUPERTYPE_RULE__CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraints()).basicAdd(otherEnd, msgs);
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
			case RulesPackage.SUPERTYPE_RULE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case RulesPackage.SUPERTYPE_RULE__NAMED_SUPERTYPE:
				if (resolve) return getNamedSupertype();
				return basicGetNamedSupertype();
			case RulesPackage.SUPERTYPE_RULE__CONSTRAINTS:
				return getConstraints();
			case RulesPackage.SUPERTYPE_RULE__ASSERTS_ABSTRACT:
				return getAssertsAbstract();
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
			case RulesPackage.SUPERTYPE_RULE__NAMED_SUPERTYPE:
				setNamedSupertype((EntityType)newValue);
				return;
			case RulesPackage.SUPERTYPE_RULE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends SubtypeConstraint>)newValue);
				return;
			case RulesPackage.SUPERTYPE_RULE__ASSERTS_ABSTRACT:
				setAssertsAbstract((Boolean)newValue);
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
			case RulesPackage.SUPERTYPE_RULE__NAMED_SUPERTYPE:
				setNamedSupertype((EntityType)null);
				return;
			case RulesPackage.SUPERTYPE_RULE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case RulesPackage.SUPERTYPE_RULE__ASSERTS_ABSTRACT:
				setAssertsAbstract(ASSERTS_ABSTRACT_EDEFAULT);
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
			case RulesPackage.SUPERTYPE_RULE__NAMED_SUPERTYPE:
				return namedSupertype != null;
			case RulesPackage.SUPERTYPE_RULE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case RulesPackage.SUPERTYPE_RULE__ASSERTS_ABSTRACT:
				return ASSERTS_ABSTRACT_EDEFAULT == null ? assertsAbstract != null : !ASSERTS_ABSTRACT_EDEFAULT.equals(assertsAbstract);
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
		result.append(" (assertsAbstract: ");
		result.append(assertsAbstract);
		result.append(')');
		return result.toString();
	}

} //SupertypeRuleImpl
