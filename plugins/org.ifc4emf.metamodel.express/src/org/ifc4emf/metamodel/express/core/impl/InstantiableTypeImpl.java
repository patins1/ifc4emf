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
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DataType;
import org.ifc4emf.metamodel.express.core.DomainConstraint;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.InstantiableType;
import org.ifc4emf.metamodel.express.core.VariableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InstantiableTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InstantiableTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InstantiableTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InstantiableTypeImpl#getFundamentalType <em>Fundamental Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InstantiableTypeImpl extends ParameterTypeImpl implements InstantiableType {
	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instances;

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
	 * The cached value of the '{@link #getFundamentalType() <em>Fundamental Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundamentalType()
	 * @generated
	 * @ordered
	 */
	protected InstantiableType fundamentalType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INSTANTIABLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList.ManyInverse<Instance>(Instance.class, this, CorePackage.INSTANTIABLE_TYPE__INSTANCES, CorePackage.INSTANCE__OF_TYPE);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getRole() {
		if (role == null) {
			role = new EObjectWithInverseResolvingEList<Attribute>(Attribute.class, this, CorePackage.INSTANTIABLE_TYPE__ROLE, CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE);
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
			constraints = new EObjectWithInverseResolvingEList<DomainConstraint>(DomainConstraint.class, this, CorePackage.INSTANTIABLE_TYPE__CONSTRAINTS, CorePackage.DOMAIN_CONSTRAINT__DOMAIN);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiableType getFundamentalType() {
		if (fundamentalType != null && fundamentalType.eIsProxy()) {
			InternalEObject oldFundamentalType = (InternalEObject)fundamentalType;
			fundamentalType = (InstantiableType)eResolveProxy(oldFundamentalType);
			if (fundamentalType != oldFundamentalType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.INSTANTIABLE_TYPE__FUNDAMENTAL_TYPE, oldFundamentalType, fundamentalType));
			}
		}
		return fundamentalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiableType basicGetFundamentalType() {
		return fundamentalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundamentalType(InstantiableType newFundamentalType) {
		InstantiableType oldFundamentalType = fundamentalType;
		fundamentalType = newFundamentalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INSTANTIABLE_TYPE__FUNDAMENTAL_TYPE, oldFundamentalType, fundamentalType));
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
			case CorePackage.INSTANTIABLE_TYPE__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
			case CorePackage.INSTANTIABLE_TYPE__ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRole()).basicAdd(otherEnd, msgs);
			case CorePackage.INSTANTIABLE_TYPE__CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraints()).basicAdd(otherEnd, msgs);
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
			case CorePackage.INSTANTIABLE_TYPE__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case CorePackage.INSTANTIABLE_TYPE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case CorePackage.INSTANTIABLE_TYPE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case CorePackage.INSTANTIABLE_TYPE__INSTANCES:
				return getInstances();
			case CorePackage.INSTANTIABLE_TYPE__ROLE:
				return getRole();
			case CorePackage.INSTANTIABLE_TYPE__CONSTRAINTS:
				return getConstraints();
			case CorePackage.INSTANTIABLE_TYPE__FUNDAMENTAL_TYPE:
				if (resolve) return getFundamentalType();
				return basicGetFundamentalType();
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
			case CorePackage.INSTANTIABLE_TYPE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends Instance>)newValue);
				return;
			case CorePackage.INSTANTIABLE_TYPE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CorePackage.INSTANTIABLE_TYPE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends DomainConstraint>)newValue);
				return;
			case CorePackage.INSTANTIABLE_TYPE__FUNDAMENTAL_TYPE:
				setFundamentalType((InstantiableType)newValue);
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
			case CorePackage.INSTANTIABLE_TYPE__INSTANCES:
				getInstances().clear();
				return;
			case CorePackage.INSTANTIABLE_TYPE__ROLE:
				getRole().clear();
				return;
			case CorePackage.INSTANTIABLE_TYPE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case CorePackage.INSTANTIABLE_TYPE__FUNDAMENTAL_TYPE:
				setFundamentalType((InstantiableType)null);
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
			case CorePackage.INSTANTIABLE_TYPE__INSTANCES:
				return instances != null && !instances.isEmpty();
			case CorePackage.INSTANTIABLE_TYPE__ROLE:
				return role != null && !role.isEmpty();
			case CorePackage.INSTANTIABLE_TYPE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case CorePackage.INSTANTIABLE_TYPE__FUNDAMENTAL_TYPE:
				return fundamentalType != null;
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
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
				case CorePackage.INSTANTIABLE_TYPE__INSTANCES: return CorePackage.DATA_TYPE__INSTANCES;
				default: return -1;
			}
		}
		if (baseClass == AttributeType.class) {
			switch (derivedFeatureID) {
				case CorePackage.INSTANTIABLE_TYPE__ROLE: return CorePackage.ATTRIBUTE_TYPE__ROLE;
				case CorePackage.INSTANTIABLE_TYPE__CONSTRAINTS: return CorePackage.ATTRIBUTE_TYPE__CONSTRAINTS;
				default: return -1;
			}
		}
		if (baseClass == VariableType.class) {
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
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
				case CorePackage.DATA_TYPE__INSTANCES: return CorePackage.INSTANTIABLE_TYPE__INSTANCES;
				default: return -1;
			}
		}
		if (baseClass == AttributeType.class) {
			switch (baseFeatureID) {
				case CorePackage.ATTRIBUTE_TYPE__ROLE: return CorePackage.INSTANTIABLE_TYPE__ROLE;
				case CorePackage.ATTRIBUTE_TYPE__CONSTRAINTS: return CorePackage.INSTANTIABLE_TYPE__CONSTRAINTS;
				default: return -1;
			}
		}
		if (baseClass == VariableType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InstantiableTypeImpl
