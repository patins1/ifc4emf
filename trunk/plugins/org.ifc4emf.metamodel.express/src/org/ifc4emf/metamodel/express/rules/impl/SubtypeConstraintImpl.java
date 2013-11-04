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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.rules.Extent;
import org.ifc4emf.metamodel.express.rules.RulesPackage;
import org.ifc4emf.metamodel.express.rules.SubtypeConstraint;
import org.ifc4emf.metamodel.express.rules.SupertypeRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtype Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.SubtypeConstraintImpl#getConstrainedSubtypes <em>Constrained Subtypes</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.SubtypeConstraintImpl#getEquivalentRule <em>Equivalent Rule</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.SubtypeConstraintImpl#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubtypeConstraintImpl extends EObjectImpl implements SubtypeConstraint {
	/**
	 * The cached value of the '{@link #getConstrainedSubtypes() <em>Constrained Subtypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedSubtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Extent> constrainedSubtypes;

	/**
	 * The cached value of the '{@link #getEquivalentRule() <em>Equivalent Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentRule()
	 * @generated
	 * @ordered
	 */
	protected Expression equivalentRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtypeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.SUBTYPE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extent> getConstrainedSubtypes() {
		if (constrainedSubtypes == null) {
			constrainedSubtypes = new EObjectWithInverseResolvingEList.ManyInverse<Extent>(Extent.class, this, RulesPackage.SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES, RulesPackage.EXTENT__CONSTRAINTS);
		}
		return constrainedSubtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getEquivalentRule() {
		return equivalentRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquivalentRule(Expression newEquivalentRule, NotificationChain msgs) {
		Expression oldEquivalentRule = equivalentRule;
		equivalentRule = newEquivalentRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.SUBTYPE_CONSTRAINT__EQUIVALENT_RULE, oldEquivalentRule, newEquivalentRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquivalentRule(Expression newEquivalentRule) {
		if (newEquivalentRule != equivalentRule) {
			NotificationChain msgs = null;
			if (equivalentRule != null)
				msgs = ((InternalEObject)equivalentRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.SUBTYPE_CONSTRAINT__EQUIVALENT_RULE, null, msgs);
			if (newEquivalentRule != null)
				msgs = ((InternalEObject)newEquivalentRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.SUBTYPE_CONSTRAINT__EQUIVALENT_RULE, null, msgs);
			msgs = basicSetEquivalentRule(newEquivalentRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.SUBTYPE_CONSTRAINT__EQUIVALENT_RULE, newEquivalentRule, newEquivalentRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupertypeRule getCollection() {
		if (eContainerFeatureID() != RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION) return null;
		return (SupertypeRule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(SupertypeRule newCollection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCollection, RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(SupertypeRule newCollection) {
		if (newCollection != eInternalContainer() || (eContainerFeatureID() != RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION && newCollection != null)) {
			if (EcoreUtil.isAncestor(this, newCollection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, RulesPackage.SUPERTYPE_RULE__CONSTRAINTS, SupertypeRule.class, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION, newCollection, newCollection));
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
			case RulesPackage.SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstrainedSubtypes()).basicAdd(otherEnd, msgs);
			case RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCollection((SupertypeRule)otherEnd, msgs);
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
			case RulesPackage.SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES:
				return ((InternalEList<?>)getConstrainedSubtypes()).basicRemove(otherEnd, msgs);
			case RulesPackage.SUBTYPE_CONSTRAINT__EQUIVALENT_RULE:
				return basicSetEquivalentRule(null, msgs);
			case RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION:
				return basicSetCollection(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION:
				return eInternalContainer().eInverseRemove(this, RulesPackage.SUPERTYPE_RULE__CONSTRAINTS, SupertypeRule.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RulesPackage.SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES:
				return getConstrainedSubtypes();
			case RulesPackage.SUBTYPE_CONSTRAINT__EQUIVALENT_RULE:
				return getEquivalentRule();
			case RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION:
				return getCollection();
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
			case RulesPackage.SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES:
				getConstrainedSubtypes().clear();
				getConstrainedSubtypes().addAll((Collection<? extends Extent>)newValue);
				return;
			case RulesPackage.SUBTYPE_CONSTRAINT__EQUIVALENT_RULE:
				setEquivalentRule((Expression)newValue);
				return;
			case RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION:
				setCollection((SupertypeRule)newValue);
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
			case RulesPackage.SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES:
				getConstrainedSubtypes().clear();
				return;
			case RulesPackage.SUBTYPE_CONSTRAINT__EQUIVALENT_RULE:
				setEquivalentRule((Expression)null);
				return;
			case RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION:
				setCollection((SupertypeRule)null);
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
			case RulesPackage.SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES:
				return constrainedSubtypes != null && !constrainedSubtypes.isEmpty();
			case RulesPackage.SUBTYPE_CONSTRAINT__EQUIVALENT_RULE:
				return equivalentRule != null;
			case RulesPackage.SUBTYPE_CONSTRAINT__COLLECTION:
				return getCollection() != null;
		}
		return super.eIsSet(featureID);
	}

} //SubtypeConstraintImpl
