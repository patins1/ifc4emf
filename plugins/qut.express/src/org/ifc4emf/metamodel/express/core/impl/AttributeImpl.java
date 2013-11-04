/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.core.SingleEntityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.AttributeImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.AttributeImpl#getOfEntity <em>Of Entity</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.AttributeImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.AttributeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.AttributeImpl#getOwningEntity <em>Owning Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AttributeImpl extends TypeElementImpl implements Attribute {
	
	@Override
	public Scope getNamespace() {
		return getOfEntity().getDeclaredIn();
	}

	/**
	 * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected AttributeType attributeType;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Integer position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType getAttributeType() {
		if (attributeType != null && attributeType.eIsProxy()) {
			InternalEObject oldAttributeType = (InternalEObject)attributeType;
			attributeType = (AttributeType)eResolveProxy(oldAttributeType);
			if (attributeType != oldAttributeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
			}
		}
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType basicGetAttributeType() {
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeType(AttributeType newAttributeType, NotificationChain msgs) {
		AttributeType oldAttributeType = attributeType;
		attributeType = newAttributeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE, oldAttributeType, newAttributeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeType(AttributeType newAttributeType) {
		if (newAttributeType != attributeType) {
			NotificationChain msgs = null;
			if (attributeType != null)
				msgs = ((InternalEObject)attributeType).eInverseRemove(this, CorePackage.ATTRIBUTE_TYPE__ROLE, AttributeType.class, msgs);
			if (newAttributeType != null)
				msgs = ((InternalEObject)newAttributeType).eInverseAdd(this, CorePackage.ATTRIBUTE_TYPE__ROLE, AttributeType.class, msgs);
			msgs = basicSetAttributeType(newAttributeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE, newAttributeType, newAttributeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleEntityType getOfEntity() {
		if (eContainerFeatureID() != CorePackage.ATTRIBUTE__OF_ENTITY) return null;
		return (SingleEntityType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOfEntity(SingleEntityType newOfEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOfEntity, CorePackage.ATTRIBUTE__OF_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfEntity(SingleEntityType newOfEntity) {
		if (newOfEntity != eInternalContainer() || (eContainerFeatureID() != CorePackage.ATTRIBUTE__OF_ENTITY && newOfEntity != null)) {
			if (EcoreUtil.isAncestor(this, newOfEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOfEntity != null)
				msgs = ((InternalEObject)newOfEntity).eInverseAdd(this, CorePackage.SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE, SingleEntityType.class, msgs);
			msgs = basicSetOfEntity(newOfEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ATTRIBUTE__OF_ENTITY, newOfEntity, newOfEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ATTRIBUTE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Integer newPosition) {
		Integer oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ATTRIBUTE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EntityType> getOwningEntity() {
		// TODO: implement this method to return the 'Owning Entity' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				if (attributeType != null)
					msgs = ((InternalEObject)attributeType).eInverseRemove(this, CorePackage.ATTRIBUTE_TYPE__ROLE, AttributeType.class, msgs);
				return basicSetAttributeType((AttributeType)otherEnd, msgs);
			case CorePackage.ATTRIBUTE__OF_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOfEntity((SingleEntityType)otherEnd, msgs);
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
			case CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				return basicSetAttributeType(null, msgs);
			case CorePackage.ATTRIBUTE__OF_ENTITY:
				return basicSetOfEntity(null, msgs);
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
			case CorePackage.ATTRIBUTE__OF_ENTITY:
				return eInternalContainer().eInverseRemove(this, CorePackage.SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE, SingleEntityType.class, msgs);
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
			case CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				if (resolve) return getAttributeType();
				return basicGetAttributeType();
			case CorePackage.ATTRIBUTE__OF_ENTITY:
				return getOfEntity();
			case CorePackage.ATTRIBUTE__IS_ABSTRACT:
				return getIsAbstract();
			case CorePackage.ATTRIBUTE__POSITION:
				return getPosition();
			case CorePackage.ATTRIBUTE__OWNING_ENTITY:
				return getOwningEntity();
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
			case CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				setAttributeType((AttributeType)newValue);
				return;
			case CorePackage.ATTRIBUTE__OF_ENTITY:
				setOfEntity((SingleEntityType)newValue);
				return;
			case CorePackage.ATTRIBUTE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case CorePackage.ATTRIBUTE__POSITION:
				setPosition((Integer)newValue);
				return;
			case CorePackage.ATTRIBUTE__OWNING_ENTITY:
				getOwningEntity().clear();
				getOwningEntity().addAll((Collection<? extends EntityType>)newValue);
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
			case CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				setAttributeType((AttributeType)null);
				return;
			case CorePackage.ATTRIBUTE__OF_ENTITY:
				setOfEntity((SingleEntityType)null);
				return;
			case CorePackage.ATTRIBUTE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case CorePackage.ATTRIBUTE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case CorePackage.ATTRIBUTE__OWNING_ENTITY:
				getOwningEntity().clear();
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
			case CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				return attributeType != null;
			case CorePackage.ATTRIBUTE__OF_ENTITY:
				return getOfEntity() != null;
			case CorePackage.ATTRIBUTE__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case CorePackage.ATTRIBUTE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case CorePackage.ATTRIBUTE__OWNING_ENTITY:
				return !getOwningEntity().isEmpty();
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
