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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DomainConstraint;
import org.ifc4emf.metamodel.express.core.GeneralizedType;
import org.ifc4emf.metamodel.express.core.ParameterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalized Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.GeneralizedTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.GeneralizedTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.GeneralizedTypeImpl#getOccursIn <em>Occurs In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GeneralizedTypeImpl extends ParameterTypeImpl implements GeneralizedType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.GENERALIZED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getRole() {
		if (role == null) {
			role = new EObjectWithInverseResolvingEList<Attribute>(Attribute.class, this, CorePackage.GENERALIZED_TYPE__ROLE, CorePackage.ATTRIBUTE__ATTRIBUTE_TYPE);
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
			constraints = new EObjectWithInverseResolvingEList<DomainConstraint>(DomainConstraint.class, this, CorePackage.GENERALIZED_TYPE__CONSTRAINTS, CorePackage.DOMAIN_CONSTRAINT__DOMAIN);
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
			occursIn = new EObjectWithInverseResolvingEList.ManyInverse<ParameterType>(ParameterType.class, this, CorePackage.GENERALIZED_TYPE__OCCURS_IN, CorePackage.PARAMETER_TYPE__CONTAINS);
		}
		return occursIn;
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
			case CorePackage.GENERALIZED_TYPE__ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRole()).basicAdd(otherEnd, msgs);
			case CorePackage.GENERALIZED_TYPE__CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraints()).basicAdd(otherEnd, msgs);
			case CorePackage.GENERALIZED_TYPE__OCCURS_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOccursIn()).basicAdd(otherEnd, msgs);
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
			case CorePackage.GENERALIZED_TYPE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case CorePackage.GENERALIZED_TYPE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case CorePackage.GENERALIZED_TYPE__OCCURS_IN:
				return ((InternalEList<?>)getOccursIn()).basicRemove(otherEnd, msgs);
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
			case CorePackage.GENERALIZED_TYPE__ROLE:
				return getRole();
			case CorePackage.GENERALIZED_TYPE__CONSTRAINTS:
				return getConstraints();
			case CorePackage.GENERALIZED_TYPE__OCCURS_IN:
				return getOccursIn();
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
			case CorePackage.GENERALIZED_TYPE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CorePackage.GENERALIZED_TYPE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends DomainConstraint>)newValue);
				return;
			case CorePackage.GENERALIZED_TYPE__OCCURS_IN:
				getOccursIn().clear();
				getOccursIn().addAll((Collection<? extends ParameterType>)newValue);
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
			case CorePackage.GENERALIZED_TYPE__ROLE:
				getRole().clear();
				return;
			case CorePackage.GENERALIZED_TYPE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case CorePackage.GENERALIZED_TYPE__OCCURS_IN:
				getOccursIn().clear();
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
			case CorePackage.GENERALIZED_TYPE__ROLE:
				return role != null && !role.isEmpty();
			case CorePackage.GENERALIZED_TYPE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case CorePackage.GENERALIZED_TYPE__OCCURS_IN:
				return occursIn != null && !occursIn.isEmpty();
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
		if (baseClass == AttributeType.class) {
			switch (derivedFeatureID) {
				case CorePackage.GENERALIZED_TYPE__ROLE: return CorePackage.ATTRIBUTE_TYPE__ROLE;
				case CorePackage.GENERALIZED_TYPE__CONSTRAINTS: return CorePackage.ATTRIBUTE_TYPE__CONSTRAINTS;
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
		if (baseClass == AttributeType.class) {
			switch (baseFeatureID) {
				case CorePackage.ATTRIBUTE_TYPE__ROLE: return CorePackage.GENERALIZED_TYPE__ROLE;
				case CorePackage.ATTRIBUTE_TYPE__CONSTRAINTS: return CorePackage.GENERALIZED_TYPE__CONSTRAINTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GeneralizedTypeImpl
