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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DataType;
import org.ifc4emf.metamodel.express.core.EnumerationType;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.SelectType;
import org.ifc4emf.metamodel.express.core.impl.TypeElementImpl;
import org.ifc4emf.metamodel.express.instances.ConcreteValue;
import org.ifc4emf.metamodel.express.instances.EnumerationItem;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.Population;
import org.ifc4emf.metamodel.express.instances.TypedInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.EnumerationItemImpl#getAppearsInPopulation <em>Appears In Population</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.EnumerationItemImpl#getOfType <em>Of Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.EnumerationItemImpl#getSatisfiesType <em>Satisfies Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.EnumerationItemImpl#getDeclaredIn <em>Declared In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.EnumerationItemImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationItemImpl extends TypeElementImpl implements EnumerationItem {
	/**
	 * The cached value of the '{@link #getAppearsInPopulation() <em>Appears In Population</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearsInPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<Population> appearsInPopulation;

	/**
	 * The cached value of the '{@link #getOfType() <em>Of Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> ofType;

	/**
	 * The cached value of the '{@link #getSatisfiesType() <em>Satisfies Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiesType()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectType> satisfiesType;

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
	protected EnumerationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.ENUMERATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Population> getAppearsInPopulation() {
		if (appearsInPopulation == null) {
			appearsInPopulation = new EObjectWithInverseResolvingEList.ManyInverse<Population>(Population.class, this, InstancesPackage.ENUMERATION_ITEM__APPEARS_IN_POPULATION, InstancesPackage.POPULATION__COMPOSITION_INSTANCE);
		}
		return appearsInPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getOfType() {
		if (ofType == null) {
			ofType = new EObjectWithInverseResolvingEList.ManyInverse<DataType>(DataType.class, this, InstancesPackage.ENUMERATION_ITEM__OF_TYPE, CorePackage.DATA_TYPE__INSTANCES);
		}
		return ofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectType> getSatisfiesType() {
		if (satisfiesType == null) {
			satisfiesType = new EObjectResolvingEList<SelectType>(SelectType.class, this, InstancesPackage.ENUMERATION_ITEM__SATISFIES_TYPE);
		}
		return satisfiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType getDeclaredIn() {
		if (eContainerFeatureID() != InstancesPackage.ENUMERATION_ITEM__DECLARED_IN) return null;
		return (EnumerationType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaredIn(EnumerationType newDeclaredIn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDeclaredIn, InstancesPackage.ENUMERATION_ITEM__DECLARED_IN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredIn(EnumerationType newDeclaredIn) {
		if (newDeclaredIn != eInternalContainer() || (eContainerFeatureID() != InstancesPackage.ENUMERATION_ITEM__DECLARED_IN && newDeclaredIn != null)) {
			if (EcoreUtil.isAncestor(this, newDeclaredIn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeclaredIn != null)
				msgs = ((InternalEObject)newDeclaredIn).eInverseAdd(this, CorePackage.ENUMERATION_TYPE__DECLARED_ITEMS, EnumerationType.class, msgs);
			msgs = basicSetDeclaredIn(newDeclaredIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.ENUMERATION_ITEM__DECLARED_IN, newDeclaredIn, newDeclaredIn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.ENUMERATION_ITEM__POSITION, oldPosition, position));
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
			case InstancesPackage.ENUMERATION_ITEM__APPEARS_IN_POPULATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAppearsInPopulation()).basicAdd(otherEnd, msgs);
			case InstancesPackage.ENUMERATION_ITEM__OF_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfType()).basicAdd(otherEnd, msgs);
			case InstancesPackage.ENUMERATION_ITEM__DECLARED_IN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeclaredIn((EnumerationType)otherEnd, msgs);
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
			case InstancesPackage.ENUMERATION_ITEM__APPEARS_IN_POPULATION:
				return ((InternalEList<?>)getAppearsInPopulation()).basicRemove(otherEnd, msgs);
			case InstancesPackage.ENUMERATION_ITEM__OF_TYPE:
				return ((InternalEList<?>)getOfType()).basicRemove(otherEnd, msgs);
			case InstancesPackage.ENUMERATION_ITEM__DECLARED_IN:
				return basicSetDeclaredIn(null, msgs);
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
			case InstancesPackage.ENUMERATION_ITEM__DECLARED_IN:
				return eInternalContainer().eInverseRemove(this, CorePackage.ENUMERATION_TYPE__DECLARED_ITEMS, EnumerationType.class, msgs);
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
			case InstancesPackage.ENUMERATION_ITEM__APPEARS_IN_POPULATION:
				return getAppearsInPopulation();
			case InstancesPackage.ENUMERATION_ITEM__OF_TYPE:
				return getOfType();
			case InstancesPackage.ENUMERATION_ITEM__SATISFIES_TYPE:
				return getSatisfiesType();
			case InstancesPackage.ENUMERATION_ITEM__DECLARED_IN:
				return getDeclaredIn();
			case InstancesPackage.ENUMERATION_ITEM__POSITION:
				return getPosition();
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
			case InstancesPackage.ENUMERATION_ITEM__APPEARS_IN_POPULATION:
				getAppearsInPopulation().clear();
				getAppearsInPopulation().addAll((Collection<? extends Population>)newValue);
				return;
			case InstancesPackage.ENUMERATION_ITEM__OF_TYPE:
				getOfType().clear();
				getOfType().addAll((Collection<? extends DataType>)newValue);
				return;
			case InstancesPackage.ENUMERATION_ITEM__SATISFIES_TYPE:
				getSatisfiesType().clear();
				getSatisfiesType().addAll((Collection<? extends SelectType>)newValue);
				return;
			case InstancesPackage.ENUMERATION_ITEM__DECLARED_IN:
				setDeclaredIn((EnumerationType)newValue);
				return;
			case InstancesPackage.ENUMERATION_ITEM__POSITION:
				setPosition((Integer)newValue);
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
			case InstancesPackage.ENUMERATION_ITEM__APPEARS_IN_POPULATION:
				getAppearsInPopulation().clear();
				return;
			case InstancesPackage.ENUMERATION_ITEM__OF_TYPE:
				getOfType().clear();
				return;
			case InstancesPackage.ENUMERATION_ITEM__SATISFIES_TYPE:
				getSatisfiesType().clear();
				return;
			case InstancesPackage.ENUMERATION_ITEM__DECLARED_IN:
				setDeclaredIn((EnumerationType)null);
				return;
			case InstancesPackage.ENUMERATION_ITEM__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case InstancesPackage.ENUMERATION_ITEM__APPEARS_IN_POPULATION:
				return appearsInPopulation != null && !appearsInPopulation.isEmpty();
			case InstancesPackage.ENUMERATION_ITEM__OF_TYPE:
				return ofType != null && !ofType.isEmpty();
			case InstancesPackage.ENUMERATION_ITEM__SATISFIES_TYPE:
				return satisfiesType != null && !satisfiesType.isEmpty();
			case InstancesPackage.ENUMERATION_ITEM__DECLARED_IN:
				return getDeclaredIn() != null;
			case InstancesPackage.ENUMERATION_ITEM__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
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
		if (baseClass == Instance.class) {
			switch (derivedFeatureID) {
				case InstancesPackage.ENUMERATION_ITEM__APPEARS_IN_POPULATION: return CorePackage.INSTANCE__APPEARS_IN_POPULATION;
				case InstancesPackage.ENUMERATION_ITEM__OF_TYPE: return CorePackage.INSTANCE__OF_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedInstance.class) {
			switch (derivedFeatureID) {
				case InstancesPackage.ENUMERATION_ITEM__SATISFIES_TYPE: return InstancesPackage.TYPED_INSTANCE__SATISFIES_TYPE;
				default: return -1;
			}
		}
		if (baseClass == ConcreteValue.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == Instance.class) {
			switch (baseFeatureID) {
				case CorePackage.INSTANCE__APPEARS_IN_POPULATION: return InstancesPackage.ENUMERATION_ITEM__APPEARS_IN_POPULATION;
				case CorePackage.INSTANCE__OF_TYPE: return InstancesPackage.ENUMERATION_ITEM__OF_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedInstance.class) {
			switch (baseFeatureID) {
				case InstancesPackage.TYPED_INSTANCE__SATISFIES_TYPE: return InstancesPackage.ENUMERATION_ITEM__SATISFIES_TYPE;
				default: return -1;
			}
		}
		if (baseClass == ConcreteValue.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //EnumerationItemImpl
