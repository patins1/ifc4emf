/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DataType;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.Population;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InstanceImpl#getAppearsInPopulation <em>Appears In Population</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InstanceImpl#getOfType <em>Of Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InstanceImpl extends EObjectImpl implements Instance {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Population> getAppearsInPopulation() {
		if (appearsInPopulation == null) {
			appearsInPopulation = new EObjectWithInverseResolvingEList.ManyInverse<Population>(Population.class, this, CorePackage.INSTANCE__APPEARS_IN_POPULATION, InstancesPackage.POPULATION__COMPOSITION_INSTANCE);
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
			ofType = new EObjectWithInverseResolvingEList.ManyInverse<DataType>(DataType.class, this, CorePackage.INSTANCE__OF_TYPE, CorePackage.DATA_TYPE__INSTANCES);
		}
		return ofType;
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
			case CorePackage.INSTANCE__APPEARS_IN_POPULATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAppearsInPopulation()).basicAdd(otherEnd, msgs);
			case CorePackage.INSTANCE__OF_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfType()).basicAdd(otherEnd, msgs);
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
			case CorePackage.INSTANCE__APPEARS_IN_POPULATION:
				return ((InternalEList<?>)getAppearsInPopulation()).basicRemove(otherEnd, msgs);
			case CorePackage.INSTANCE__OF_TYPE:
				return ((InternalEList<?>)getOfType()).basicRemove(otherEnd, msgs);
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
			case CorePackage.INSTANCE__APPEARS_IN_POPULATION:
				return getAppearsInPopulation();
			case CorePackage.INSTANCE__OF_TYPE:
				return getOfType();
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
			case CorePackage.INSTANCE__APPEARS_IN_POPULATION:
				getAppearsInPopulation().clear();
				getAppearsInPopulation().addAll((Collection<? extends Population>)newValue);
				return;
			case CorePackage.INSTANCE__OF_TYPE:
				getOfType().clear();
				getOfType().addAll((Collection<? extends DataType>)newValue);
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
			case CorePackage.INSTANCE__APPEARS_IN_POPULATION:
				getAppearsInPopulation().clear();
				return;
			case CorePackage.INSTANCE__OF_TYPE:
				getOfType().clear();
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
			case CorePackage.INSTANCE__APPEARS_IN_POPULATION:
				return appearsInPopulation != null && !appearsInPopulation.isEmpty();
			case CorePackage.INSTANCE__OF_TYPE:
				return ofType != null && !ofType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceImpl
