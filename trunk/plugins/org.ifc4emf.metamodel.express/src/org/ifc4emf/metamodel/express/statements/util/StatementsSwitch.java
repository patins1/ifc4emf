/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.ifc4emf.metamodel.express.algorithms.NamedVariable;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.algorithms.VARVariable;
import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.LocalScope;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.statements.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage
 * @generated
 */
public class StatementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsSwitch() {
		if (modelPackage == null) {
			modelPackage = StatementsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StatementsPackage.PROCEDURE_CALL: {
				ProcedureCall procedureCall = (ProcedureCall)theEObject;
				T result = caseProcedureCall(procedureCall);
				if (result == null) result = caseStatement(procedureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SKIP_STATEMENT: {
				SkipStatement skipStatement = (SkipStatement)theEObject;
				T result = caseSkipStatement(skipStatement);
				if (result == null) result = caseControlStatement(skipStatement);
				if (result == null) result = caseStatement(skipStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ALIAS_STATEMENT: {
				AliasStatement aliasStatement = (AliasStatement)theEObject;
				T result = caseAliasStatement(aliasStatement);
				if (result == null) result = caseStatement(aliasStatement);
				if (result == null) result = caseLocalScope(aliasStatement);
				if (result == null) result = caseScope(aliasStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CONTROL_VARIABLE: {
				ControlVariable controlVariable = (ControlVariable)theEObject;
				T result = caseControlVariable(controlVariable);
				if (result == null) result = caseNamedVariable(controlVariable);
				if (result == null) result = caseLocalElement(controlVariable);
				if (result == null) result = caseNamedElement(controlVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ALIAS_VARIABLE: {
				AliasVariable aliasVariable = (AliasVariable)theEObject;
				T result = caseAliasVariable(aliasVariable);
				if (result == null) result = caseNamedVariable(aliasVariable);
				if (result == null) result = caseVARVariable(aliasVariable);
				if (result == null) result = caseLocalElement(aliasVariable);
				if (result == null) result = caseNamedElement(aliasVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CONTROL_STATEMENT: {
				ControlStatement controlStatement = (ControlStatement)theEObject;
				T result = caseControlStatement(controlStatement);
				if (result == null) result = caseStatement(controlStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.VAR_CELL: {
				VARCell varCell = (VARCell)theEObject;
				T result = caseVARCell(varCell);
				if (result == null) result = caseVARExpression(varCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.NULL_STATEMENT: {
				NullStatement nullStatement = (NullStatement)theEObject;
				T result = caseNullStatement(nullStatement);
				if (result == null) result = caseControlStatement(nullStatement);
				if (result == null) result = caseStatement(nullStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.VAR_EXPRESSION: {
				VARExpression varExpression = (VARExpression)theEObject;
				T result = caseVARExpression(varExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ATTRIBUTE_CELL: {
				AttributeCell attributeCell = (AttributeCell)theEObject;
				T result = caseAttributeCell(attributeCell);
				if (result == null) result = caseVARExpression(attributeCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.STATEMENT_BLOCK: {
				StatementBlock statementBlock = (StatementBlock)theEObject;
				T result = caseStatementBlock(statementBlock);
				if (result == null) result = caseStatement(statementBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CASE_ACTION: {
				CaseAction caseAction = (CaseAction)theEObject;
				T result = caseCaseAction(caseAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.MEMBER_CELL: {
				MemberCell memberCell = (MemberCell)theEObject;
				T result = caseMemberCell(memberCell);
				if (result == null) result = caseVARExpression(memberCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.REPEAT_STATEMENT: {
				RepeatStatement repeatStatement = (RepeatStatement)theEObject;
				T result = caseRepeatStatement(repeatStatement);
				if (result == null) result = caseStatement(repeatStatement);
				if (result == null) result = caseLocalScope(repeatStatement);
				if (result == null) result = caseScope(repeatStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.GROUP_CELL: {
				GroupCell groupCell = (GroupCell)theEObject;
				T result = caseGroupCell(groupCell);
				if (result == null) result = caseVARExpression(groupCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.VARIABLE_CELL: {
				VariableCell variableCell = (VariableCell)theEObject;
				T result = caseVariableCell(variableCell);
				if (result == null) result = caseVARExpression(variableCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CASE_STATEMENT: {
				CaseStatement caseStatement = (CaseStatement)theEObject;
				T result = caseCaseStatement(caseStatement);
				if (result == null) result = caseStatement(caseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseStatement(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ESCAPE_STATEMENT: {
				EscapeStatement escapeStatement = (EscapeStatement)theEObject;
				T result = caseEscapeStatement(escapeStatement);
				if (result == null) result = caseControlStatement(escapeStatement);
				if (result == null) result = caseStatement(escapeStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.RETURN_STATEMENT: {
				ReturnStatement returnStatement = (ReturnStatement)theEObject;
				T result = caseReturnStatement(returnStatement);
				if (result == null) result = caseControlStatement(returnStatement);
				if (result == null) result = caseStatement(returnStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseStatement(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureCall(ProcedureCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skip Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skip Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkipStatement(SkipStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasStatement(AliasStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlVariable(ControlVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasVariable(AliasVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlStatement(ControlStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VAR Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VAR Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVARCell(VARCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullStatement(NullStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VAR Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VAR Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVARExpression(VARExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeCell(AttributeCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementBlock(StatementBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseAction(CaseAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberCell(MemberCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatStatement(RepeatStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupCell(GroupCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableCell(VariableCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseStatement(CaseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Escape Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Escape Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEscapeStatement(EscapeStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnStatement(ReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalScope(LocalScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalElement(LocalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedVariable(NamedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VAR Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VAR Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVARVariable(VARVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StatementsSwitch
