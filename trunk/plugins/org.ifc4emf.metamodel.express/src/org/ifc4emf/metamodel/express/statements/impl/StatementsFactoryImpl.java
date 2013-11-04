/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ifc4emf.metamodel.express.statements.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementsFactoryImpl extends EFactoryImpl implements StatementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatementsFactory init() {
		try {
			StatementsFactory theStatementsFactory = (StatementsFactory)EPackage.Registry.INSTANCE.getEFactory(StatementsPackage.eNS_URI);
			if (theStatementsFactory != null) {
				return theStatementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatementsPackage.PROCEDURE_CALL: return createProcedureCall();
			case StatementsPackage.SKIP_STATEMENT: return createSkipStatement();
			case StatementsPackage.ALIAS_STATEMENT: return createAliasStatement();
			case StatementsPackage.CONTROL_VARIABLE: return createControlVariable();
			case StatementsPackage.ALIAS_VARIABLE: return createAliasVariable();
			case StatementsPackage.VAR_CELL: return createVARCell();
			case StatementsPackage.NULL_STATEMENT: return createNullStatement();
			case StatementsPackage.ATTRIBUTE_CELL: return createAttributeCell();
			case StatementsPackage.STATEMENT_BLOCK: return createStatementBlock();
			case StatementsPackage.CASE_ACTION: return createCaseAction();
			case StatementsPackage.MEMBER_CELL: return createMemberCell();
			case StatementsPackage.REPEAT_STATEMENT: return createRepeatStatement();
			case StatementsPackage.GROUP_CELL: return createGroupCell();
			case StatementsPackage.VARIABLE_CELL: return createVariableCell();
			case StatementsPackage.CASE_STATEMENT: return createCaseStatement();
			case StatementsPackage.IF_STATEMENT: return createIfStatement();
			case StatementsPackage.ESCAPE_STATEMENT: return createEscapeStatement();
			case StatementsPackage.RETURN_STATEMENT: return createReturnStatement();
			case StatementsPackage.ASSIGNMENT: return createAssignment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureCall createProcedureCall() {
		ProcedureCallImpl procedureCall = new ProcedureCallImpl();
		return procedureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkipStatement createSkipStatement() {
		SkipStatementImpl skipStatement = new SkipStatementImpl();
		return skipStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasStatement createAliasStatement() {
		AliasStatementImpl aliasStatement = new AliasStatementImpl();
		return aliasStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlVariable createControlVariable() {
		ControlVariableImpl controlVariable = new ControlVariableImpl();
		return controlVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasVariable createAliasVariable() {
		AliasVariableImpl aliasVariable = new AliasVariableImpl();
		return aliasVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VARCell createVARCell() {
		VARCellImpl varCell = new VARCellImpl();
		return varCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullStatement createNullStatement() {
		NullStatementImpl nullStatement = new NullStatementImpl();
		return nullStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCell createAttributeCell() {
		AttributeCellImpl attributeCell = new AttributeCellImpl();
		return attributeCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementBlock createStatementBlock() {
		StatementBlockImpl statementBlock = new StatementBlockImpl();
		return statementBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseAction createCaseAction() {
		CaseActionImpl caseAction = new CaseActionImpl();
		return caseAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberCell createMemberCell() {
		MemberCellImpl memberCell = new MemberCellImpl();
		return memberCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatStatement createRepeatStatement() {
		RepeatStatementImpl repeatStatement = new RepeatStatementImpl();
		return repeatStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupCell createGroupCell() {
		GroupCellImpl groupCell = new GroupCellImpl();
		return groupCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableCell createVariableCell() {
		VariableCellImpl variableCell = new VariableCellImpl();
		return variableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseStatement createCaseStatement() {
		CaseStatementImpl caseStatement = new CaseStatementImpl();
		return caseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscapeStatement createEscapeStatement() {
		EscapeStatementImpl escapeStatement = new EscapeStatementImpl();
		return escapeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsPackage getStatementsPackage() {
		return (StatementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatementsPackage getPackage() {
		return StatementsPackage.eINSTANCE;
	}

} //StatementsFactoryImpl
