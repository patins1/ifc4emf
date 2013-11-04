/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.Schema;
import org.ifc4emf.metamodel.express.instances.EntityInstance;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.Population;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.PopulationImpl#getCompositionEntityInstance <em>Composition Entity Instance</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.PopulationImpl#getCompositionInstance <em>Composition Instance</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.PopulationImpl#getGoverningSchema <em>Governing Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PopulationImpl extends EObjectImpl implements Population {
	/**
	 * The cached value of the '{@link #getCompositionEntityInstance() <em>Composition Entity Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionEntityInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityInstance> compositionEntityInstance;

	/**
	 * The cached value of the '{@link #getCompositionInstance() <em>Composition Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> compositionInstance;

	/**
	 * The cached value of the '{@link #getGoverningSchema() <em>Governing Schema</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoverningSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> governingSchema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.POPULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityInstance> getCompositionEntityInstance() {
		if (compositionEntityInstance == null) {
			compositionEntityInstance = new EObjectResolvingEList<EntityInstance>(EntityInstance.class, this, InstancesPackage.POPULATION__COMPOSITION_ENTITY_INSTANCE);
		}
		return compositionEntityInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getCompositionInstance() {
		if (compositionInstance == null) {
			compositionInstance = new EObjectWithInverseResolvingEList.ManyInverse<Instance>(Instance.class, this, InstancesPackage.POPULATION__COMPOSITION_INSTANCE, CorePackage.INSTANCE__APPEARS_IN_POPULATION);
		}
		return compositionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getGoverningSchema() {
		if (governingSchema == null) {
			governingSchema = new EObjectResolvingEList<Schema>(Schema.class, this, InstancesPackage.POPULATION__GOVERNING_SCHEMA);
		}
		return governingSchema;
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
			case InstancesPackage.POPULATION__COMPOSITION_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompositionInstance()).basicAdd(otherEnd, msgs);
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
			case InstancesPackage.POPULATION__COMPOSITION_INSTANCE:
				return ((InternalEList<?>)getCompositionInstance()).basicRemove(otherEnd, msgs);
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
			case InstancesPackage.POPULATION__COMPOSITION_ENTITY_INSTANCE:
				return getCompositionEntityInstance();
			case InstancesPackage.POPULATION__COMPOSITION_INSTANCE:
				return getCompositionInstance();
			case InstancesPackage.POPULATION__GOVERNING_SCHEMA:
				return getGoverningSchema();
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
			case InstancesPackage.POPULATION__COMPOSITION_ENTITY_INSTANCE:
				getCompositionEntityInstance().clear();
				getCompositionEntityInstance().addAll((Collection<? extends EntityInstance>)newValue);
				return;
			case InstancesPackage.POPULATION__COMPOSITION_INSTANCE:
				getCompositionInstance().clear();
				getCompositionInstance().addAll((Collection<? extends Instance>)newValue);
				return;
			case InstancesPackage.POPULATION__GOVERNING_SCHEMA:
				getGoverningSchema().clear();
				getGoverningSchema().addAll((Collection<? extends Schema>)newValue);
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
			case InstancesPackage.POPULATION__COMPOSITION_ENTITY_INSTANCE:
				getCompositionEntityInstance().clear();
				return;
			case InstancesPackage.POPULATION__COMPOSITION_INSTANCE:
				getCompositionInstance().clear();
				return;
			case InstancesPackage.POPULATION__GOVERNING_SCHEMA:
				getGoverningSchema().clear();
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
			case InstancesPackage.POPULATION__COMPOSITION_ENTITY_INSTANCE:
				return compositionEntityInstance != null && !compositionEntityInstance.isEmpty();
			case InstancesPackage.POPULATION__COMPOSITION_INSTANCE:
				return compositionInstance != null && !compositionInstance.isEmpty();
			case InstancesPackage.POPULATION__GOVERNING_SCHEMA:
				return governingSchema != null && !governingSchema.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PopulationImpl
