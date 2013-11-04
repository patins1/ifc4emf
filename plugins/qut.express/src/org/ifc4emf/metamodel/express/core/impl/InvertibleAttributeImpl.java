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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.InverseAttribute;
import org.ifc4emf.metamodel.express.core.InvertibleAttribute;
import org.ifc4emf.metamodel.express.core.RangeRole;
import org.ifc4emf.metamodel.express.core.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invertible Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InvertibleAttributeImpl#getInverse <em>Inverse</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InvertibleAttributeImpl#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InvertibleAttributeImpl#getCreatesRelationship <em>Creates Relationship</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InvertibleAttributeImpl#getReferencingType <em>Referencing Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InvertibleAttributeImpl#getModelsRole <em>Models Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvertibleAttributeImpl extends ExplicitAttributeImpl implements InvertibleAttribute {
	/**
	 * The cached value of the '{@link #getInverse() <em>Inverse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverse()
	 * @generated
	 * @ordered
	 */
	protected EList<InverseAttribute> inverse;

	/**
	 * The cached value of the '{@link #getRangeType() <em>Range Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeType()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> rangeType;

	/**
	 * The cached value of the '{@link #getCreatesRelationship() <em>Creates Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatesRelationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship createsRelationship;

	/**
	 * The cached value of the '{@link #getReferencingType() <em>Referencing Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingType()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> referencingType;

	/**
	 * The cached value of the '{@link #getModelsRole() <em>Models Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelsRole()
	 * @generated
	 * @ordered
	 */
	protected RangeRole modelsRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvertibleAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INVERTIBLE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InverseAttribute> getInverse() {
		if (inverse == null) {
			inverse = new EObjectWithInverseResolvingEList<InverseAttribute>(InverseAttribute.class, this, CorePackage.INVERTIBLE_ATTRIBUTE__INVERSE, CorePackage.INVERSE_ATTRIBUTE__EXPLICIT);
		}
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getRangeType() {
		if (rangeType == null) {
			rangeType = new EObjectWithInverseResolvingEList.ManyInverse<EntityType>(EntityType.class, this, CorePackage.INVERTIBLE_ATTRIBUTE__RANGE_TYPE, CorePackage.ENTITY_TYPE__USED_IN);
		}
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getCreatesRelationship() {
		if (createsRelationship != null && createsRelationship.eIsProxy()) {
			InternalEObject oldCreatesRelationship = (InternalEObject)createsRelationship;
			createsRelationship = (Relationship)eResolveProxy(oldCreatesRelationship);
			if (createsRelationship != oldCreatesRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP, oldCreatesRelationship, createsRelationship));
			}
		}
		return createsRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetCreatesRelationship() {
		return createsRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatesRelationship(Relationship newCreatesRelationship, NotificationChain msgs) {
		Relationship oldCreatesRelationship = createsRelationship;
		createsRelationship = newCreatesRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP, oldCreatesRelationship, newCreatesRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatesRelationship(Relationship newCreatesRelationship) {
		if (newCreatesRelationship != createsRelationship) {
			NotificationChain msgs = null;
			if (createsRelationship != null)
				msgs = ((InternalEObject)createsRelationship).eInverseRemove(this, CorePackage.RELATIONSHIP__BASED_ON, Relationship.class, msgs);
			if (newCreatesRelationship != null)
				msgs = ((InternalEObject)newCreatesRelationship).eInverseAdd(this, CorePackage.RELATIONSHIP__BASED_ON, Relationship.class, msgs);
			msgs = basicSetCreatesRelationship(newCreatesRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP, newCreatesRelationship, newCreatesRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getReferencingType() {
		if (referencingType == null) {
			referencingType = new EObjectWithInverseResolvingEList.ManyInverse<EntityType>(EntityType.class, this, CorePackage.INVERTIBLE_ATTRIBUTE__REFERENCING_TYPE, CorePackage.ENTITY_TYPE__INVERTIBLE_ATTRIBUTES);
		}
		return referencingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeRole getModelsRole() {
		if (modelsRole != null && modelsRole.eIsProxy()) {
			InternalEObject oldModelsRole = (InternalEObject)modelsRole;
			modelsRole = (RangeRole)eResolveProxy(oldModelsRole);
			if (modelsRole != oldModelsRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE, oldModelsRole, modelsRole));
			}
		}
		return modelsRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeRole basicGetModelsRole() {
		return modelsRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelsRole(RangeRole newModelsRole, NotificationChain msgs) {
		RangeRole oldModelsRole = modelsRole;
		modelsRole = newModelsRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE, oldModelsRole, newModelsRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelsRole(RangeRole newModelsRole) {
		if (newModelsRole != modelsRole) {
			NotificationChain msgs = null;
			if (modelsRole != null)
				msgs = ((InternalEObject)modelsRole).eInverseRemove(this, CorePackage.RANGE_ROLE__DOMAIN_VIEW, RangeRole.class, msgs);
			if (newModelsRole != null)
				msgs = ((InternalEObject)newModelsRole).eInverseAdd(this, CorePackage.RANGE_ROLE__DOMAIN_VIEW, RangeRole.class, msgs);
			msgs = basicSetModelsRole(newModelsRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE, newModelsRole, newModelsRole));
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
			case CorePackage.INVERTIBLE_ATTRIBUTE__INVERSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInverse()).basicAdd(otherEnd, msgs);
			case CorePackage.INVERTIBLE_ATTRIBUTE__RANGE_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRangeType()).basicAdd(otherEnd, msgs);
			case CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP:
				if (createsRelationship != null)
					msgs = ((InternalEObject)createsRelationship).eInverseRemove(this, CorePackage.RELATIONSHIP__BASED_ON, Relationship.class, msgs);
				return basicSetCreatesRelationship((Relationship)otherEnd, msgs);
			case CorePackage.INVERTIBLE_ATTRIBUTE__REFERENCING_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencingType()).basicAdd(otherEnd, msgs);
			case CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE:
				if (modelsRole != null)
					msgs = ((InternalEObject)modelsRole).eInverseRemove(this, CorePackage.RANGE_ROLE__DOMAIN_VIEW, RangeRole.class, msgs);
				return basicSetModelsRole((RangeRole)otherEnd, msgs);
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
			case CorePackage.INVERTIBLE_ATTRIBUTE__INVERSE:
				return ((InternalEList<?>)getInverse()).basicRemove(otherEnd, msgs);
			case CorePackage.INVERTIBLE_ATTRIBUTE__RANGE_TYPE:
				return ((InternalEList<?>)getRangeType()).basicRemove(otherEnd, msgs);
			case CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP:
				return basicSetCreatesRelationship(null, msgs);
			case CorePackage.INVERTIBLE_ATTRIBUTE__REFERENCING_TYPE:
				return ((InternalEList<?>)getReferencingType()).basicRemove(otherEnd, msgs);
			case CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE:
				return basicSetModelsRole(null, msgs);
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
			case CorePackage.INVERTIBLE_ATTRIBUTE__INVERSE:
				return getInverse();
			case CorePackage.INVERTIBLE_ATTRIBUTE__RANGE_TYPE:
				return getRangeType();
			case CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP:
				if (resolve) return getCreatesRelationship();
				return basicGetCreatesRelationship();
			case CorePackage.INVERTIBLE_ATTRIBUTE__REFERENCING_TYPE:
				return getReferencingType();
			case CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE:
				if (resolve) return getModelsRole();
				return basicGetModelsRole();
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
			case CorePackage.INVERTIBLE_ATTRIBUTE__INVERSE:
				getInverse().clear();
				getInverse().addAll((Collection<? extends InverseAttribute>)newValue);
				return;
			case CorePackage.INVERTIBLE_ATTRIBUTE__RANGE_TYPE:
				getRangeType().clear();
				getRangeType().addAll((Collection<? extends EntityType>)newValue);
				return;
			case CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP:
				setCreatesRelationship((Relationship)newValue);
				return;
			case CorePackage.INVERTIBLE_ATTRIBUTE__REFERENCING_TYPE:
				getReferencingType().clear();
				getReferencingType().addAll((Collection<? extends EntityType>)newValue);
				return;
			case CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE:
				setModelsRole((RangeRole)newValue);
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
			case CorePackage.INVERTIBLE_ATTRIBUTE__INVERSE:
				getInverse().clear();
				return;
			case CorePackage.INVERTIBLE_ATTRIBUTE__RANGE_TYPE:
				getRangeType().clear();
				return;
			case CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP:
				setCreatesRelationship((Relationship)null);
				return;
			case CorePackage.INVERTIBLE_ATTRIBUTE__REFERENCING_TYPE:
				getReferencingType().clear();
				return;
			case CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE:
				setModelsRole((RangeRole)null);
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
			case CorePackage.INVERTIBLE_ATTRIBUTE__INVERSE:
				return inverse != null && !inverse.isEmpty();
			case CorePackage.INVERTIBLE_ATTRIBUTE__RANGE_TYPE:
				return rangeType != null && !rangeType.isEmpty();
			case CorePackage.INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP:
				return createsRelationship != null;
			case CorePackage.INVERTIBLE_ATTRIBUTE__REFERENCING_TYPE:
				return referencingType != null && !referencingType.isEmpty();
			case CorePackage.INVERTIBLE_ATTRIBUTE__MODELS_ROLE:
				return modelsRole != null;
		}
		return super.eIsSet(featureID);
	}

} //InvertibleAttributeImpl
