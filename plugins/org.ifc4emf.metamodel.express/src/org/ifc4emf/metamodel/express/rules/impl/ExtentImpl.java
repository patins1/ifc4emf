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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.ScopedId;
import org.ifc4emf.metamodel.express.instances.EntityInstance;
import org.ifc4emf.metamodel.express.instances.Population;
import org.ifc4emf.metamodel.express.instances.impl.SETValueImpl;
import org.ifc4emf.metamodel.express.rules.Extent;
import org.ifc4emf.metamodel.express.rules.GlobalRule;
import org.ifc4emf.metamodel.express.rules.RulesPackage;
import org.ifc4emf.metamodel.express.rules.SubtypeConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.ExtentImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.ExtentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.ExtentImpl#getWithinPopulation <em>Within Population</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.ExtentImpl#getConstraintRules <em>Constraint Rules</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.ExtentImpl#getForType <em>For Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.ExtentImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtentImpl extends SETValueImpl implements Extent {
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<SubtypeConstraint> constraints;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityInstance> content;

	/**
	 * The cached value of the '{@link #getWithinPopulation() <em>Within Population</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithinPopulation()
	 * @generated
	 * @ordered
	 */
	protected Population withinPopulation;

	/**
	 * The cached value of the '{@link #getConstraintRules() <em>Constraint Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintRules()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalRule> constraintRules;

	/**
	 * The cached value of the '{@link #getForType() <em>For Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForType()
	 * @generated
	 * @ordered
	 */
	protected EntityType forType;

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
	protected ExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.EXTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubtypeConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectWithInverseResolvingEList.ManyInverse<SubtypeConstraint>(SubtypeConstraint.class, this, RulesPackage.EXTENT__CONSTRAINTS, RulesPackage.SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityInstance> getContent() {
		if (content == null) {
			content = new EObjectResolvingEList<EntityInstance>(EntityInstance.class, this, RulesPackage.EXTENT__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Population getWithinPopulation() {
		if (withinPopulation != null && withinPopulation.eIsProxy()) {
			InternalEObject oldWithinPopulation = (InternalEObject)withinPopulation;
			withinPopulation = (Population)eResolveProxy(oldWithinPopulation);
			if (withinPopulation != oldWithinPopulation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.EXTENT__WITHIN_POPULATION, oldWithinPopulation, withinPopulation));
			}
		}
		return withinPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Population basicGetWithinPopulation() {
		return withinPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithinPopulation(Population newWithinPopulation) {
		Population oldWithinPopulation = withinPopulation;
		withinPopulation = newWithinPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.EXTENT__WITHIN_POPULATION, oldWithinPopulation, withinPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalRule> getConstraintRules() {
		if (constraintRules == null) {
			constraintRules = new EObjectWithInverseResolvingEList.ManyInverse<GlobalRule>(GlobalRule.class, this, RulesPackage.EXTENT__CONSTRAINT_RULES, RulesPackage.GLOBAL_RULE__CONSTRAINED_EXTENTS);
		}
		return constraintRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getForType() {
		if (forType != null && forType.eIsProxy()) {
			InternalEObject oldForType = (InternalEObject)forType;
			forType = (EntityType)eResolveProxy(oldForType);
			if (forType != oldForType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.EXTENT__FOR_TYPE, oldForType, forType));
			}
		}
		return forType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetForType() {
		return forType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForType(EntityType newForType, NotificationChain msgs) {
		EntityType oldForType = forType;
		forType = newForType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.EXTENT__FOR_TYPE, oldForType, newForType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForType(EntityType newForType) {
		if (newForType != forType) {
			NotificationChain msgs = null;
			if (forType != null)
				msgs = ((InternalEObject)forType).eInverseRemove(this, CorePackage.ENTITY_TYPE__EXTENSION, EntityType.class, msgs);
			if (newForType != null)
				msgs = ((InternalEObject)newForType).eInverseAdd(this, CorePackage.ENTITY_TYPE__EXTENSION, EntityType.class, msgs);
			msgs = basicSetForType(newForType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.EXTENT__FOR_TYPE, newForType, newForType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.EXTENT__ID, oldId, newId);
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
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.EXTENT__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.EXTENT__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.EXTENT__ID, newId, newId));
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
			case RulesPackage.EXTENT__CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraints()).basicAdd(otherEnd, msgs);
			case RulesPackage.EXTENT__CONSTRAINT_RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraintRules()).basicAdd(otherEnd, msgs);
			case RulesPackage.EXTENT__FOR_TYPE:
				if (forType != null)
					msgs = ((InternalEObject)forType).eInverseRemove(this, CorePackage.ENTITY_TYPE__EXTENSION, EntityType.class, msgs);
				return basicSetForType((EntityType)otherEnd, msgs);
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
			case RulesPackage.EXTENT__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case RulesPackage.EXTENT__CONSTRAINT_RULES:
				return ((InternalEList<?>)getConstraintRules()).basicRemove(otherEnd, msgs);
			case RulesPackage.EXTENT__FOR_TYPE:
				return basicSetForType(null, msgs);
			case RulesPackage.EXTENT__ID:
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
			case RulesPackage.EXTENT__CONSTRAINTS:
				return getConstraints();
			case RulesPackage.EXTENT__CONTENT:
				return getContent();
			case RulesPackage.EXTENT__WITHIN_POPULATION:
				if (resolve) return getWithinPopulation();
				return basicGetWithinPopulation();
			case RulesPackage.EXTENT__CONSTRAINT_RULES:
				return getConstraintRules();
			case RulesPackage.EXTENT__FOR_TYPE:
				if (resolve) return getForType();
				return basicGetForType();
			case RulesPackage.EXTENT__ID:
				return getId();
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
			case RulesPackage.EXTENT__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends SubtypeConstraint>)newValue);
				return;
			case RulesPackage.EXTENT__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends EntityInstance>)newValue);
				return;
			case RulesPackage.EXTENT__WITHIN_POPULATION:
				setWithinPopulation((Population)newValue);
				return;
			case RulesPackage.EXTENT__CONSTRAINT_RULES:
				getConstraintRules().clear();
				getConstraintRules().addAll((Collection<? extends GlobalRule>)newValue);
				return;
			case RulesPackage.EXTENT__FOR_TYPE:
				setForType((EntityType)newValue);
				return;
			case RulesPackage.EXTENT__ID:
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
			case RulesPackage.EXTENT__CONSTRAINTS:
				getConstraints().clear();
				return;
			case RulesPackage.EXTENT__CONTENT:
				getContent().clear();
				return;
			case RulesPackage.EXTENT__WITHIN_POPULATION:
				setWithinPopulation((Population)null);
				return;
			case RulesPackage.EXTENT__CONSTRAINT_RULES:
				getConstraintRules().clear();
				return;
			case RulesPackage.EXTENT__FOR_TYPE:
				setForType((EntityType)null);
				return;
			case RulesPackage.EXTENT__ID:
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
			case RulesPackage.EXTENT__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case RulesPackage.EXTENT__CONTENT:
				return content != null && !content.isEmpty();
			case RulesPackage.EXTENT__WITHIN_POPULATION:
				return withinPopulation != null;
			case RulesPackage.EXTENT__CONSTRAINT_RULES:
				return constraintRules != null && !constraintRules.isEmpty();
			case RulesPackage.EXTENT__FOR_TYPE:
				return forType != null;
			case RulesPackage.EXTENT__ID:
				return id != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtentImpl
