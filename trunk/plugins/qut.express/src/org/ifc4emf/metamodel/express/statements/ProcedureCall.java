/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.algorithms.Procedure;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.expressions.ActualParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.ProcedureCall#getInvokes <em>Invokes</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.ProcedureCall#getActualParameters <em>Actual Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getProcedureCall()
 * @model
 * @generated
 */
public interface ProcedureCall extends Statement {
	/**
	 * Returns the value of the '<em><b>Invokes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invokes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invokes</em>' reference.
	 * @see #setInvokes(Procedure)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getProcedureCall_Invokes()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Procedure getInvokes();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.ProcedureCall#getInvokes <em>Invokes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invokes</em>' reference.
	 * @see #getInvokes()
	 * @generated
	 */
	void setInvokes(Procedure value);

	/**
	 * Returns the value of the '<em><b>Actual Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.expressions.ActualParameter}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getInProcedureCall <em>In Procedure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Parameters</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getProcedureCall_ActualParameters()
	 * @see org.ifc4emf.metamodel.express.expressions.ActualParameter#getInProcedureCall
	 * @model opposite="inProcedureCall" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActualParameter> getActualParameters();

} // ProcedureCall
