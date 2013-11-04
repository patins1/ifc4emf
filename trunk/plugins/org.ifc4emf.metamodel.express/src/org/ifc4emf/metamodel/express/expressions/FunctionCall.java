/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.algorithms.Function;
import org.ifc4emf.metamodel.express.algorithms.FunctionResult;
import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.FunctionCall#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.FunctionCall#getInvokesFunction <em>Invokes Function</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.FunctionCall#getReturnsResult <em>Returns Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Actual Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.expressions.ActualParameter}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getInFunctionCall <em>In Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Parameters</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getFunctionCall_ActualParameters()
	 * @see org.ifc4emf.metamodel.express.expressions.ActualParameter#getInFunctionCall
	 * @model opposite="inFunctionCall" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActualParameter> getActualParameters();

	/**
	 * Returns the value of the '<em><b>Invokes Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invokes Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invokes Function</em>' reference.
	 * @see #setInvokesFunction(Function)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getFunctionCall_InvokesFunction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Function getInvokesFunction();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.FunctionCall#getInvokesFunction <em>Invokes Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invokes Function</em>' reference.
	 * @see #getInvokesFunction()
	 * @generated
	 */
	void setInvokesFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Returns Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returns Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returns Result</em>' reference.
	 * @see #setReturnsResult(FunctionResult)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getFunctionCall_ReturnsResult()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FunctionResult getReturnsResult();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.FunctionCall#getReturnsResult <em>Returns Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returns Result</em>' reference.
	 * @see #getReturnsResult()
	 * @generated
	 */
	void setReturnsResult(FunctionResult value);

} // FunctionCall
