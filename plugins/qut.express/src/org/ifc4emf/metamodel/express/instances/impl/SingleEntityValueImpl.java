/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.SingleEntityType;
import org.ifc4emf.metamodel.express.instances.AttributeValue;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.PartialEntityValue;
import org.ifc4emf.metamodel.express.instances.SingleEntityValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Entity Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.SingleEntityValueImpl#getEquivalent <em>Equivalent</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.SingleEntityValueImpl#getOfType <em>Of Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.SingleEntityValueImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleEntityValueImpl extends EObjectImpl implements SingleEntityValue {
	/**
	 * The cached value of the '{@link #getEquivalent() <em>Equivalent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalent()
	 * @generated
	 * @ordered
	 */
	protected PartialEntityValue equivalent;

	/**
	 * The cached value of the '{@link #getOfType() <em>Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfType()
	 * @generated
	 * @ordered
	 */
	protected SingleEntityType ofType;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValue> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleEntityValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.SINGLE_ENTITY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialEntityValue getEquivalent() {
		if (equivalent != null && equivalent.eIsProxy()) {
			InternalEObject oldEquivalent = (InternalEObject)equivalent;
			equivalent = (PartialEntityValue)eResolveProxy(oldEquivalent);
			if (equivalent != oldEquivalent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.SINGLE_ENTITY_VALUE__EQUIVALENT, oldEquivalent, equivalent));
			}
		}
		return equivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialEntityValue basicGetEquivalent() {
		return equivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquivalent(PartialEntityValue newEquivalent) {
		PartialEntityValue oldEquivalent = equivalent;
		equivalent = newEquivalent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.SINGLE_ENTITY_VALUE__EQUIVALENT, oldEquivalent, equivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleEntityType getOfType() {
		if (ofType != null && ofType.eIsProxy()) {
			InternalEObject oldOfType = (InternalEObject)ofType;
			ofType = (SingleEntityType)eResolveProxy(oldOfType);
			if (ofType != oldOfType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.SINGLE_ENTITY_VALUE__OF_TYPE, oldOfType, ofType));
			}
		}
		return ofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleEntityType basicGetOfType() {
		return ofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfType(SingleEntityType newOfType) {
		SingleEntityType oldOfType = ofType;
		ofType = newOfType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.SINGLE_ENTITY_VALUE__OF_TYPE, oldOfType, ofType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValue> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<AttributeValue>(AttributeValue.class, this, InstancesPackage.SINGLE_ENTITY_VALUE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.SINGLE_ENTITY_VALUE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case InstancesPackage.SINGLE_ENTITY_VALUE__EQUIVALENT:
				if (resolve) return getEquivalent();
				return basicGetEquivalent();
			case InstancesPackage.SINGLE_ENTITY_VALUE__OF_TYPE:
				if (resolve) return getOfType();
				return basicGetOfType();
			case InstancesPackage.SINGLE_ENTITY_VALUE__PROPERTIES:
				return getProperties();
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
			case InstancesPackage.SINGLE_ENTITY_VALUE__EQUIVALENT:
				setEquivalent((PartialEntityValue)newValue);
				return;
			case InstancesPackage.SINGLE_ENTITY_VALUE__OF_TYPE:
				setOfType((SingleEntityType)newValue);
				return;
			case InstancesPackage.SINGLE_ENTITY_VALUE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends AttributeValue>)newValue);
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
			case InstancesPackage.SINGLE_ENTITY_VALUE__EQUIVALENT:
				setEquivalent((PartialEntityValue)null);
				return;
			case InstancesPackage.SINGLE_ENTITY_VALUE__OF_TYPE:
				setOfType((SingleEntityType)null);
				return;
			case InstancesPackage.SINGLE_ENTITY_VALUE__PROPERTIES:
				getProperties().clear();
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
			case InstancesPackage.SINGLE_ENTITY_VALUE__EQUIVALENT:
				return equivalent != null;
			case InstancesPackage.SINGLE_ENTITY_VALUE__OF_TYPE:
				return ofType != null;
			case InstancesPackage.SINGLE_ENTITY_VALUE__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SingleEntityValueImpl
