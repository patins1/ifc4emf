/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.Assignment#getAssignedValue <em>Assigned Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.Assignment#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Statement {
	/**
	 * Returns the value of the '<em><b>Assigned Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Value</em>' reference.
	 * @see #setAssignedValue(Expression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getAssignment_AssignedValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getAssignedValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.Assignment#getAssignedValue <em>Assigned Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Value</em>' reference.
	 * @see #getAssignedValue()
	 * @generated
	 */
	void setAssignedValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(VARExpression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getAssignment_Variable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VARExpression getVariable();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.Assignment#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VARExpression value);

} // Assignment
