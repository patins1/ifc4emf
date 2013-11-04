/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.statements.Assignment;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;
import org.ifc4emf.metamodel.express.statements.VARExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.AssignmentImpl#getAssignedValue <em>Assigned Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.AssignmentImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends StatementImpl implements Assignment {
	/**
	 * The cached value of the '{@link #getAssignedValue() <em>Assigned Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedValue()
	 * @generated
	 * @ordered
	 */
	protected Expression assignedValue;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected VARExpression variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAssignedValue() {
		if (assignedValue != null && assignedValue.eIsProxy()) {
			InternalEObject oldAssignedValue = (InternalEObject)assignedValue;
			assignedValue = (Expression)eResolveProxy(oldAssignedValue);
			if (assignedValue != oldAssignedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.ASSIGNMENT__ASSIGNED_VALUE, oldAssignedValue, assignedValue));
			}
		}
		return assignedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetAssignedValue() {
		return assignedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedValue(Expression newAssignedValue) {
		Expression oldAssignedValue = assignedValue;
		assignedValue = newAssignedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ASSIGNMENT__ASSIGNED_VALUE, oldAssignedValue, assignedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VARExpression getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (VARExpression)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.ASSIGNMENT__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VARExpression basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(VARExpression newVariable) {
		VARExpression oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ASSIGNMENT__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatementsPackage.ASSIGNMENT__ASSIGNED_VALUE:
				if (resolve) return getAssignedValue();
				return basicGetAssignedValue();
			case StatementsPackage.ASSIGNMENT__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
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
			case StatementsPackage.ASSIGNMENT__ASSIGNED_VALUE:
				setAssignedValue((Expression)newValue);
				return;
			case StatementsPackage.ASSIGNMENT__VARIABLE:
				setVariable((VARExpression)newValue);
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
			case StatementsPackage.ASSIGNMENT__ASSIGNED_VALUE:
				setAssignedValue((Expression)null);
				return;
			case StatementsPackage.ASSIGNMENT__VARIABLE:
				setVariable((VARExpression)null);
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
			case StatementsPackage.ASSIGNMENT__ASSIGNED_VALUE:
				return assignedValue != null;
			case StatementsPackage.ASSIGNMENT__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl
