/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.algorithms.Parameter;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.statements.ProcedureCall;
import org.ifc4emf.metamodel.express.statements.VARExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getInProcedureCall <em>In Procedure Call</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getInFunctionCall <em>In Function Call</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getActualReferent <em>Actual Referent</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getActualParameter()
 * @model
 * @generated
 */
public interface ActualParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>In Procedure Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.statements.ProcedureCall#getActualParameters <em>Actual Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Procedure Call</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Procedure Call</em>' container reference.
	 * @see #setInProcedureCall(ProcedureCall)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getActualParameter_InProcedureCall()
	 * @see org.ifc4emf.metamodel.express.statements.ProcedureCall#getActualParameters
	 * @model opposite="actualParameters" transient="false" ordered="false"
	 * @generated
	 */
	ProcedureCall getInProcedureCall();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getInProcedureCall <em>In Procedure Call</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Procedure Call</em>' container reference.
	 * @see #getInProcedureCall()
	 * @generated
	 */
	void setInProcedureCall(ProcedureCall value);

	/**
	 * Returns the value of the '<em><b>In Function Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.expressions.FunctionCall#getActualParameters <em>Actual Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Function Call</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Function Call</em>' container reference.
	 * @see #setInFunctionCall(FunctionCall)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getActualParameter_InFunctionCall()
	 * @see org.ifc4emf.metamodel.express.expressions.FunctionCall#getActualParameters
	 * @model opposite="actualParameters" transient="false" ordered="false"
	 * @generated
	 */
	FunctionCall getInFunctionCall();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getInFunctionCall <em>In Function Call</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Function Call</em>' container reference.
	 * @see #getInFunctionCall()
	 * @generated
	 */
	void setInFunctionCall(FunctionCall value);

	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' reference.
	 * @see #setFormalParameter(Parameter)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getActualParameter_FormalParameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter getFormalParameter();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getFormalParameter <em>Formal Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Parameter</em>' reference.
	 * @see #getFormalParameter()
	 * @generated
	 */
	void setFormalParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Actual Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Referent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Referent</em>' reference.
	 * @see #setActualReferent(VARExpression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getActualParameter_ActualReferent()
	 * @model ordered="false"
	 * @generated
	 */
	VARExpression getActualReferent();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getActualReferent <em>Actual Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Referent</em>' reference.
	 * @see #getActualReferent()
	 * @generated
	 */
	void setActualReferent(VARExpression value);

	/**
	 * Returns the value of the '<em><b>Actual Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Value</em>' reference.
	 * @see #setActualValue(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getActualParameter_ActualValue()
	 * @model ordered="false"
	 * @generated
	 */
	Expression getActualValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getActualValue <em>Actual Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Value</em>' reference.
	 * @see #getActualValue()
	 * @generated
	 */
	void setActualValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(Integer)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getActualParameter_Position()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getPosition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Integer value);

} // ActualParameter
