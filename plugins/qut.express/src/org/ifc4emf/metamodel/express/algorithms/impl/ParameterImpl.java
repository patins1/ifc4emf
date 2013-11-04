/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint;
import org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.algorithms.Parameter;
import org.ifc4emf.metamodel.express.core.ParameterType;
import org.ifc4emf.metamodel.express.core.impl.LocalElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ParameterImpl#getStructureConstraints <em>Structure Constraints</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ParameterImpl#getTypeConstraints <em>Type Constraints</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ParameterImpl#getFormalParameterType <em>Formal Parameter Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ParameterImpl#getInout <em>Inout</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ParameterImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ParameterImpl extends LocalElementImpl implements Parameter {
	/**
	 * The cached value of the '{@link #getStructureConstraints() <em>Structure Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ActualStructureConstraint> structureConstraints;

	/**
	 * The cached value of the '{@link #getTypeConstraints() <em>Type Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ActualTypeConstraint> typeConstraints;

	/**
	 * The cached value of the '{@link #getFormalParameterType() <em>Formal Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameterType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType formalParameterType;

	/**
	 * The default value of the '{@link #getInout() <em>Inout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInout()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInout() <em>Inout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInout()
	 * @generated
	 * @ordered
	 */
	protected Boolean inout = INOUT_EDEFAULT;

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
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmsPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualStructureConstraint> getStructureConstraints() {
		if (structureConstraints == null) {
			structureConstraints = new EObjectContainmentEList<ActualStructureConstraint>(ActualStructureConstraint.class, this, AlgorithmsPackage.PARAMETER__STRUCTURE_CONSTRAINTS);
		}
		return structureConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualTypeConstraint> getTypeConstraints() {
		if (typeConstraints == null) {
			typeConstraints = new EObjectContainmentEList<ActualTypeConstraint>(ActualTypeConstraint.class, this, AlgorithmsPackage.PARAMETER__TYPE_CONSTRAINTS);
		}
		return typeConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getFormalParameterType() {
		if (formalParameterType != null && formalParameterType.eIsProxy()) {
			InternalEObject oldFormalParameterType = (InternalEObject)formalParameterType;
			formalParameterType = (ParameterType)eResolveProxy(oldFormalParameterType);
			if (formalParameterType != oldFormalParameterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.PARAMETER__FORMAL_PARAMETER_TYPE, oldFormalParameterType, formalParameterType));
			}
		}
		return formalParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType basicGetFormalParameterType() {
		return formalParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalParameterType(ParameterType newFormalParameterType) {
		ParameterType oldFormalParameterType = formalParameterType;
		formalParameterType = newFormalParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.PARAMETER__FORMAL_PARAMETER_TYPE, oldFormalParameterType, formalParameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInout() {
		return inout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInout(Boolean newInout) {
		Boolean oldInout = inout;
		inout = newInout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.PARAMETER__INOUT, oldInout, inout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.PARAMETER__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmsPackage.PARAMETER__STRUCTURE_CONSTRAINTS:
				return ((InternalEList<?>)getStructureConstraints()).basicRemove(otherEnd, msgs);
			case AlgorithmsPackage.PARAMETER__TYPE_CONSTRAINTS:
				return ((InternalEList<?>)getTypeConstraints()).basicRemove(otherEnd, msgs);
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
			case AlgorithmsPackage.PARAMETER__STRUCTURE_CONSTRAINTS:
				return getStructureConstraints();
			case AlgorithmsPackage.PARAMETER__TYPE_CONSTRAINTS:
				return getTypeConstraints();
			case AlgorithmsPackage.PARAMETER__FORMAL_PARAMETER_TYPE:
				if (resolve) return getFormalParameterType();
				return basicGetFormalParameterType();
			case AlgorithmsPackage.PARAMETER__INOUT:
				return getInout();
			case AlgorithmsPackage.PARAMETER__POSITION:
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
			case AlgorithmsPackage.PARAMETER__STRUCTURE_CONSTRAINTS:
				getStructureConstraints().clear();
				getStructureConstraints().addAll((Collection<? extends ActualStructureConstraint>)newValue);
				return;
			case AlgorithmsPackage.PARAMETER__TYPE_CONSTRAINTS:
				getTypeConstraints().clear();
				getTypeConstraints().addAll((Collection<? extends ActualTypeConstraint>)newValue);
				return;
			case AlgorithmsPackage.PARAMETER__FORMAL_PARAMETER_TYPE:
				setFormalParameterType((ParameterType)newValue);
				return;
			case AlgorithmsPackage.PARAMETER__INOUT:
				setInout((Boolean)newValue);
				return;
			case AlgorithmsPackage.PARAMETER__POSITION:
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
			case AlgorithmsPackage.PARAMETER__STRUCTURE_CONSTRAINTS:
				getStructureConstraints().clear();
				return;
			case AlgorithmsPackage.PARAMETER__TYPE_CONSTRAINTS:
				getTypeConstraints().clear();
				return;
			case AlgorithmsPackage.PARAMETER__FORMAL_PARAMETER_TYPE:
				setFormalParameterType((ParameterType)null);
				return;
			case AlgorithmsPackage.PARAMETER__INOUT:
				setInout(INOUT_EDEFAULT);
				return;
			case AlgorithmsPackage.PARAMETER__POSITION:
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
			case AlgorithmsPackage.PARAMETER__STRUCTURE_CONSTRAINTS:
				return structureConstraints != null && !structureConstraints.isEmpty();
			case AlgorithmsPackage.PARAMETER__TYPE_CONSTRAINTS:
				return typeConstraints != null && !typeConstraints.isEmpty();
			case AlgorithmsPackage.PARAMETER__FORMAL_PARAMETER_TYPE:
				return formalParameterType != null;
			case AlgorithmsPackage.PARAMETER__INOUT:
				return INOUT_EDEFAULT == null ? inout != null : !INOUT_EDEFAULT.equals(inout);
			case AlgorithmsPackage.PARAMETER__POSITION:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (inout: ");
		result.append(inout);
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
