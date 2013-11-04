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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.instances.EntityInstance;
import org.ifc4emf.metamodel.express.instances.EntityValue;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.EntityValueImpl#getCorrespondsTo <em>Corresponds To</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.impl.EntityValueImpl#getDescribes <em>Describes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityValueImpl extends PartialEntityValueImpl implements EntityValue {
	/**
	 * The cached value of the '{@link #getCorrespondsTo() <em>Corresponds To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> correspondsTo;

	/**
	 * The cached value of the '{@link #getDescribes() <em>Describes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribes()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityInstance> describes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.ENTITY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getCorrespondsTo() {
		if (correspondsTo == null) {
			correspondsTo = new EObjectResolvingEList<EntityType>(EntityType.class, this, InstancesPackage.ENTITY_VALUE__CORRESPONDS_TO);
		}
		return correspondsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityInstance> getDescribes() {
		if (describes == null) {
			describes = new EObjectWithInverseResolvingEList<EntityInstance>(EntityInstance.class, this, InstancesPackage.ENTITY_VALUE__DESCRIBES, InstancesPackage.ENTITY_INSTANCE__STATE);
		}
		return describes;
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
			case InstancesPackage.ENTITY_VALUE__DESCRIBES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDescribes()).basicAdd(otherEnd, msgs);
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
			case InstancesPackage.ENTITY_VALUE__DESCRIBES:
				return ((InternalEList<?>)getDescribes()).basicRemove(otherEnd, msgs);
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
			case InstancesPackage.ENTITY_VALUE__CORRESPONDS_TO:
				return getCorrespondsTo();
			case InstancesPackage.ENTITY_VALUE__DESCRIBES:
				return getDescribes();
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
			case InstancesPackage.ENTITY_VALUE__CORRESPONDS_TO:
				getCorrespondsTo().clear();
				getCorrespondsTo().addAll((Collection<? extends EntityType>)newValue);
				return;
			case InstancesPackage.ENTITY_VALUE__DESCRIBES:
				getDescribes().clear();
				getDescribes().addAll((Collection<? extends EntityInstance>)newValue);
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
			case InstancesPackage.ENTITY_VALUE__CORRESPONDS_TO:
				getCorrespondsTo().clear();
				return;
			case InstancesPackage.ENTITY_VALUE__DESCRIBES:
				getDescribes().clear();
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
			case InstancesPackage.ENTITY_VALUE__CORRESPONDS_TO:
				return correspondsTo != null && !correspondsTo.isEmpty();
			case InstancesPackage.ENTITY_VALUE__DESCRIBES:
				return describes != null && !describes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityValueImpl
