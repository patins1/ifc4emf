/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.ifc4emf.metamodel.express.algorithms.ActualStructure;
import org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.core.AGGREGATEType;
import org.ifc4emf.metamodel.express.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Structure Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureConstraintImpl#getMatchingStructure <em>Matching Structure</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureConstraintImpl#getRequiredStructure <em>Required Structure</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureConstraintImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActualStructureConstraintImpl extends EObjectImpl implements ActualStructureConstraint {
	/**
	 * The cached value of the '{@link #getMatchingStructure() <em>Matching Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingStructure()
	 * @generated
	 * @ordered
	 */
	protected AGGREGATEType matchingStructure;

	/**
	 * The cached value of the '{@link #getRequiredStructure() <em>Required Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredStructure()
	 * @generated
	 * @ordered
	 */
	protected ActualStructure requiredStructure;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActualStructureConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmsPackage.Literals.ACTUAL_STRUCTURE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGGREGATEType getMatchingStructure() {
		if (matchingStructure != null && matchingStructure.eIsProxy()) {
			InternalEObject oldMatchingStructure = (InternalEObject)matchingStructure;
			matchingStructure = (AGGREGATEType)eResolveProxy(oldMatchingStructure);
			if (matchingStructure != oldMatchingStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE, oldMatchingStructure, matchingStructure));
			}
		}
		return matchingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGGREGATEType basicGetMatchingStructure() {
		return matchingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchingStructure(AGGREGATEType newMatchingStructure, NotificationChain msgs) {
		AGGREGATEType oldMatchingStructure = matchingStructure;
		matchingStructure = newMatchingStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE, oldMatchingStructure, newMatchingStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingStructure(AGGREGATEType newMatchingStructure) {
		if (newMatchingStructure != matchingStructure) {
			NotificationChain msgs = null;
			if (matchingStructure != null)
				msgs = ((InternalEObject)matchingStructure).eInverseRemove(this, CorePackage.AGGREGATE_TYPE__CONSTRAINT, AGGREGATEType.class, msgs);
			if (newMatchingStructure != null)
				msgs = ((InternalEObject)newMatchingStructure).eInverseAdd(this, CorePackage.AGGREGATE_TYPE__CONSTRAINT, AGGREGATEType.class, msgs);
			msgs = basicSetMatchingStructure(newMatchingStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE, newMatchingStructure, newMatchingStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualStructure getRequiredStructure() {
		if (requiredStructure != null && requiredStructure.eIsProxy()) {
			InternalEObject oldRequiredStructure = (InternalEObject)requiredStructure;
			requiredStructure = (ActualStructure)eResolveProxy(oldRequiredStructure);
			if (requiredStructure != oldRequiredStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__REQUIRED_STRUCTURE, oldRequiredStructure, requiredStructure));
			}
		}
		return requiredStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualStructure basicGetRequiredStructure() {
		return requiredStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredStructure(ActualStructure newRequiredStructure) {
		ActualStructure oldRequiredStructure = requiredStructure;
		requiredStructure = newRequiredStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__REQUIRED_STRUCTURE, oldRequiredStructure, requiredStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE:
				if (matchingStructure != null)
					msgs = ((InternalEObject)matchingStructure).eInverseRemove(this, CorePackage.AGGREGATE_TYPE__CONSTRAINT, AGGREGATEType.class, msgs);
				return basicSetMatchingStructure((AGGREGATEType)otherEnd, msgs);
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
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE:
				return basicSetMatchingStructure(null, msgs);
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
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE:
				if (resolve) return getMatchingStructure();
				return basicGetMatchingStructure();
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__REQUIRED_STRUCTURE:
				if (resolve) return getRequiredStructure();
				return basicGetRequiredStructure();
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__LABEL:
				return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE:
				setMatchingStructure((AGGREGATEType)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__REQUIRED_STRUCTURE:
				setRequiredStructure((ActualStructure)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__LABEL:
				setLabel((String)newValue);
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
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE:
				setMatchingStructure((AGGREGATEType)null);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__REQUIRED_STRUCTURE:
				setRequiredStructure((ActualStructure)null);
				return;
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE:
				return matchingStructure != null;
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__REQUIRED_STRUCTURE:
				return requiredStructure != null;
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ActualStructureConstraintImpl
