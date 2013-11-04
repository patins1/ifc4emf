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
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.Relationship;
import org.ifc4emf.metamodel.express.core.Role;
import org.ifc4emf.metamodel.express.core.SizeConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RoleImpl#getInRelationship <em>In Relationship</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RoleImpl#getOfEntity <em>Of Entity</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RoleImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RoleImpl#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoleImpl extends EObjectImpl implements Role {
	/**
	 * The cached value of the '{@link #getInRelationship() <em>In Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRelationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship inRelationship;

	/**
	 * The cached value of the '{@link #getOfEntity() <em>Of Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> ofEntity;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected SizeConstraint upperBound;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' reference.
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
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getInRelationship() {
		if (inRelationship != null && inRelationship.eIsProxy()) {
			InternalEObject oldInRelationship = (InternalEObject)inRelationship;
			inRelationship = (Relationship)eResolveProxy(oldInRelationship);
			if (inRelationship != oldInRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ROLE__IN_RELATIONSHIP, oldInRelationship, inRelationship));
			}
		}
		return inRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetInRelationship() {
		return inRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInRelationship(Relationship newInRelationship, NotificationChain msgs) {
		Relationship oldInRelationship = inRelationship;
		inRelationship = newInRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE__IN_RELATIONSHIP, oldInRelationship, newInRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInRelationship(Relationship newInRelationship) {
		if (newInRelationship != inRelationship) {
			NotificationChain msgs = null;
			if (inRelationship != null)
				msgs = ((InternalEObject)inRelationship).eInverseRemove(this, CorePackage.RELATIONSHIP__ROLES, Relationship.class, msgs);
			if (newInRelationship != null)
				msgs = ((InternalEObject)newInRelationship).eInverseAdd(this, CorePackage.RELATIONSHIP__ROLES, Relationship.class, msgs);
			msgs = basicSetInRelationship(newInRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE__IN_RELATIONSHIP, newInRelationship, newInRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getOfEntity() {
		if (ofEntity == null) {
			ofEntity = new EObjectWithInverseResolvingEList.ManyInverse<EntityType>(EntityType.class, this, CorePackage.ROLE__OF_ENTITY, CorePackage.ENTITY_TYPE__PLAYS_ROLE);
		}
		return ofEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint getUpperBound() {
		if (upperBound != null && upperBound.eIsProxy()) {
			InternalEObject oldUpperBound = (InternalEObject)upperBound;
			upperBound = (SizeConstraint)eResolveProxy(oldUpperBound);
			if (upperBound != oldUpperBound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ROLE__UPPER_BOUND, oldUpperBound, upperBound));
			}
		}
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint basicGetUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(SizeConstraint newUpperBound) {
		SizeConstraint oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint getLowerBound() {
		if (lowerBound != null && lowerBound.eIsProxy()) {
			InternalEObject oldLowerBound = (InternalEObject)lowerBound;
			lowerBound = (SizeConstraint)eResolveProxy(oldLowerBound);
			if (lowerBound != oldLowerBound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ROLE__LOWER_BOUND, oldLowerBound, lowerBound));
			}
		}
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint basicGetLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(SizeConstraint newLowerBound) {
		SizeConstraint oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE__LOWER_BOUND, oldLowerBound, lowerBound));
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
			case CorePackage.ROLE__IN_RELATIONSHIP:
				if (inRelationship != null)
					msgs = ((InternalEObject)inRelationship).eInverseRemove(this, CorePackage.RELATIONSHIP__ROLES, Relationship.class, msgs);
				return basicSetInRelationship((Relationship)otherEnd, msgs);
			case CorePackage.ROLE__OF_ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfEntity()).basicAdd(otherEnd, msgs);
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
			case CorePackage.ROLE__IN_RELATIONSHIP:
				return basicSetInRelationship(null, msgs);
			case CorePackage.ROLE__OF_ENTITY:
				return ((InternalEList<?>)getOfEntity()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ROLE__IN_RELATIONSHIP:
				if (resolve) return getInRelationship();
				return basicGetInRelationship();
			case CorePackage.ROLE__OF_ENTITY:
				return getOfEntity();
			case CorePackage.ROLE__UPPER_BOUND:
				if (resolve) return getUpperBound();
				return basicGetUpperBound();
			case CorePackage.ROLE__LOWER_BOUND:
				if (resolve) return getLowerBound();
				return basicGetLowerBound();
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
			case CorePackage.ROLE__IN_RELATIONSHIP:
				setInRelationship((Relationship)newValue);
				return;
			case CorePackage.ROLE__OF_ENTITY:
				getOfEntity().clear();
				getOfEntity().addAll((Collection<? extends EntityType>)newValue);
				return;
			case CorePackage.ROLE__UPPER_BOUND:
				setUpperBound((SizeConstraint)newValue);
				return;
			case CorePackage.ROLE__LOWER_BOUND:
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
			case CorePackage.ROLE__IN_RELATIONSHIP:
				setInRelationship((Relationship)null);
				return;
			case CorePackage.ROLE__OF_ENTITY:
				getOfEntity().clear();
				return;
			case CorePackage.ROLE__UPPER_BOUND:
				setUpperBound((SizeConstraint)null);
				return;
			case CorePackage.ROLE__LOWER_BOUND:
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
			case CorePackage.ROLE__IN_RELATIONSHIP:
				return inRelationship != null;
			case CorePackage.ROLE__OF_ENTITY:
				return ofEntity != null && !ofEntity.isEmpty();
			case CorePackage.ROLE__UPPER_BOUND:
				return upperBound != null;
			case CorePackage.ROLE__LOWER_BOUND:
				return lowerBound != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
