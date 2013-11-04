/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.algorithms.ActualStructure;
import org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.core.AGGREGATEType;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DomainConstraint;
import org.ifc4emf.metamodel.express.core.GeneralizedType;
import org.ifc4emf.metamodel.express.core.ParameterType;
import org.ifc4emf.metamodel.express.core.SizeConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl#getOccursIn <em>Occurs In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActualStructureImpl extends GenericElementImpl implements ActualStructure {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizedType> contains;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> role;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainConstraint> constraints;

	/**
	 * The cached value of the '{@link #getOccursIn() <em>Occurs In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccursIn()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterType> occursIn;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected SizeConstraint upperBound;

	/**
	 * The cached value of the '{@link #getMemberType() <em>Member Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType memberType;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected ActualStructureConstraint constraint;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected SizeConstraint lowerBound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActualStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmsPackage.Literals.ACTUAL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizedType> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizedType>(GeneralizedType.class, this, AlgorithmsPackage.ACTUAL_STRUCTURE__CONTAINS, CorePackage.GENERALIZED_TYPE__OCCURS_IN);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getRole() {
		if (role == null) {
			role = new EObjectWithInverseResolvingEList<Attribute>(Attribute.class, this, AlgorithmsPackage.ACTUAL_STRUCTURE__ROLE, CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectWithInverseResolvingEList<DomainConstraint>(DomainConstraint.class, this, AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINTS, CorePackage.DOMAIN_CONSTRAINT__DOMAIN);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterType> getOccursIn() {
		if (occursIn == null) {
			occursIn = new EObjectWithInverseResolvingEList.ManyInverse<ParameterType>(ParameterType.class, this, AlgorithmsPackage.ACTUAL_STRUCTURE__OCCURS_IN, CorePackage.PARAMETER_TYPE__CONTAINS);
		}
		return occursIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(SizeConstraint newUpperBound, NotificationChain msgs) {
		SizeConstraint oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_STRUCTURE__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(SizeConstraint newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_STRUCTURE__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_STRUCTURE__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_STRUCTURE__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getMemberType() {
		if (memberType != null && memberType.eIsProxy()) {
			InternalEObject oldMemberType = (InternalEObject)memberType;
			memberType = (ParameterType)eResolveProxy(oldMemberType);
			if (memberType != oldMemberType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.ACTUAL_STRUCTURE__MEMBER_TYPE, oldMemberType, memberType));
			}
		}
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType basicGetMemberType() {
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberType(ParameterType newMemberType) {
		ParameterType oldMemberType = memberType;
		memberType = newMemberType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_STRUCTURE__MEMBER_TYPE, oldMemberType, memberType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualStructureConstraint getConstraint() {
		if (constraint != null && constraint.eIsProxy()) {
			InternalEObject oldConstraint = (InternalEObject)constraint;
			constraint = (ActualStructureConstraint)eResolveProxy(oldConstraint);
			if (constraint != oldConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINT, oldConstraint, constraint));
			}
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualStructureConstraint basicGetConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(ActualStructureConstraint newConstraint, NotificationChain msgs) {
		ActualStructureConstraint oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINT, oldConstraint, newConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(ActualStructureConstraint newConstraint) {
		if (newConstraint != constraint) {
			NotificationChain msgs = null;
			if (constraint != null)
				msgs = ((InternalEObject)constraint).eInverseRemove(this, AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE, ActualStructureConstraint.class, msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject)newConstraint).eInverseAdd(this, AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE, ActualStructureConstraint.class, msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINT, newConstraint, newConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBound(SizeConstraint newLowerBound, NotificationChain msgs) {
		SizeConstraint oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_STRUCTURE__LOWER_BOUND, oldLowerBound, newLowerBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(SizeConstraint newLowerBound) {
		if (newLowerBound != lowerBound) {
			NotificationChain msgs = null;
			if (lowerBound != null)
				msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_STRUCTURE__LOWER_BOUND, null, msgs);
			if (newLowerBound != null)
				msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_STRUCTURE__LOWER_BOUND, null, msgs);
			msgs = basicSetLowerBound(newLowerBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_STRUCTURE__LOWER_BOUND, newLowerBound, newLowerBound));
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
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case AlgorithmsPackage.ACTUAL_STRUCTURE__ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRole()).basicAdd(otherEnd, msgs);
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraints()).basicAdd(otherEnd, msgs);
			case AlgorithmsPackage.ACTUAL_STRUCTURE__OCCURS_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOccursIn()).basicAdd(otherEnd, msgs);
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINT:
				if (constraint != null)
					msgs = ((InternalEObject)constraint).eInverseRemove(this, AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE, ActualStructureConstraint.class, msgs);
				return basicSetConstraint((ActualStructureConstraint)otherEnd, msgs);
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
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case AlgorithmsPackage.ACTUAL_STRUCTURE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case AlgorithmsPackage.ACTUAL_STRUCTURE__OCCURS_IN:
				return ((InternalEList<?>)getOccursIn()).basicRemove(otherEnd, msgs);
			case AlgorithmsPackage.ACTUAL_STRUCTURE__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINT:
				return basicSetConstraint(null, msgs);
			case AlgorithmsPackage.ACTUAL_STRUCTURE__LOWER_BOUND:
				return basicSetLowerBound(null, msgs);
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
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONTAINS:
				return getContains();
			case AlgorithmsPackage.ACTUAL_STRUCTURE__ROLE:
				return getRole();
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINTS:
				return getConstraints();
			case AlgorithmsPackage.ACTUAL_STRUCTURE__OCCURS_IN:
				return getOccursIn();
			case AlgorithmsPackage.ACTUAL_STRUCTURE__UPPER_BOUND:
				return getUpperBound();
			case AlgorithmsPackage.ACTUAL_STRUCTURE__MEMBER_TYPE:
				if (resolve) return getMemberType();
				return basicGetMemberType();
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINT:
				if (resolve) return getConstraint();
				return basicGetConstraint();
			case AlgorithmsPackage.ACTUAL_STRUCTURE__LOWER_BOUND:
				return getLowerBound();
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
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends GeneralizedType>)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Attribute>)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends DomainConstraint>)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__OCCURS_IN:
				getOccursIn().clear();
				getOccursIn().addAll((Collection<? extends ParameterType>)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__UPPER_BOUND:
				setUpperBound((SizeConstraint)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__MEMBER_TYPE:
				setMemberType((ParameterType)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINT:
				setConstraint((ActualStructureConstraint)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__LOWER_BOUND:
				setLowerBound((SizeConstraint)newValue);
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
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONTAINS:
				getContains().clear();
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__ROLE:
				getRole().clear();
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__OCCURS_IN:
				getOccursIn().clear();
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__UPPER_BOUND:
				setUpperBound((SizeConstraint)null);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__MEMBER_TYPE:
				setMemberType((ParameterType)null);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINT:
				setConstraint((ActualStructureConstraint)null);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__LOWER_BOUND:
				setLowerBound((SizeConstraint)null);
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
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONTAINS:
				return contains != null && !contains.isEmpty();
			case AlgorithmsPackage.ACTUAL_STRUCTURE__ROLE:
				return role != null && !role.isEmpty();
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case AlgorithmsPackage.ACTUAL_STRUCTURE__OCCURS_IN:
				return occursIn != null && !occursIn.isEmpty();
			case AlgorithmsPackage.ACTUAL_STRUCTURE__UPPER_BOUND:
				return upperBound != null;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__MEMBER_TYPE:
				return memberType != null;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINT:
				return constraint != null;
			case AlgorithmsPackage.ACTUAL_STRUCTURE__LOWER_BOUND:
				return lowerBound != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterType.class) {
			switch (derivedFeatureID) {
				case AlgorithmsPackage.ACTUAL_STRUCTURE__CONTAINS: return CorePackage.PARAMETER_TYPE__CONTAINS;
				default: return -1;
			}
		}
		if (baseClass == AttributeType.class) {
			switch (derivedFeatureID) {
				case AlgorithmsPackage.ACTUAL_STRUCTURE__ROLE: return CorePackage.ATTRIBUTE_TYPE__ROLE;
				case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINTS: return CorePackage.ATTRIBUTE_TYPE__CONSTRAINTS;
				default: return -1;
			}
		}
		if (baseClass == GeneralizedType.class) {
			switch (derivedFeatureID) {
				case AlgorithmsPackage.ACTUAL_STRUCTURE__OCCURS_IN: return CorePackage.GENERALIZED_TYPE__OCCURS_IN;
				default: return -1;
			}
		}
		if (baseClass == AGGREGATEType.class) {
			switch (derivedFeatureID) {
				case AlgorithmsPackage.ACTUAL_STRUCTURE__UPPER_BOUND: return CorePackage.AGGREGATE_TYPE__UPPER_BOUND;
				case AlgorithmsPackage.ACTUAL_STRUCTURE__MEMBER_TYPE: return CorePackage.AGGREGATE_TYPE__MEMBER_TYPE;
				case AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINT: return CorePackage.AGGREGATE_TYPE__CONSTRAINT;
				case AlgorithmsPackage.ACTUAL_STRUCTURE__LOWER_BOUND: return CorePackage.AGGREGATE_TYPE__LOWER_BOUND;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterType.class) {
			switch (baseFeatureID) {
				case CorePackage.PARAMETER_TYPE__CONTAINS: return AlgorithmsPackage.ACTUAL_STRUCTURE__CONTAINS;
				default: return -1;
			}
		}
		if (baseClass == AttributeType.class) {
			switch (baseFeatureID) {
				case CorePackage.ATTRIBUTE_TYPE__ROLE: return AlgorithmsPackage.ACTUAL_STRUCTURE__ROLE;
				case CorePackage.ATTRIBUTE_TYPE__CONSTRAINTS: return AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINTS;
				default: return -1;
			}
		}
		if (baseClass == GeneralizedType.class) {
			switch (baseFeatureID) {
				case CorePackage.GENERALIZED_TYPE__OCCURS_IN: return AlgorithmsPackage.ACTUAL_STRUCTURE__OCCURS_IN;
				default: return -1;
			}
		}
		if (baseClass == AGGREGATEType.class) {
			switch (baseFeatureID) {
				case CorePackage.AGGREGATE_TYPE__UPPER_BOUND: return AlgorithmsPackage.ACTUAL_STRUCTURE__UPPER_BOUND;
				case CorePackage.AGGREGATE_TYPE__MEMBER_TYPE: return AlgorithmsPackage.ACTUAL_STRUCTURE__MEMBER_TYPE;
				case CorePackage.AGGREGATE_TYPE__CONSTRAINT: return AlgorithmsPackage.ACTUAL_STRUCTURE__CONSTRAINT;
				case CorePackage.AGGREGATE_TYPE__LOWER_BOUND: return AlgorithmsPackage.ACTUAL_STRUCTURE__LOWER_BOUND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActualStructureImpl
