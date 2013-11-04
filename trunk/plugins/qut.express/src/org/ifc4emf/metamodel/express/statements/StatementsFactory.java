/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage
 * @generated
 */
public interface StatementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementsFactory eINSTANCE = org.ifc4emf.metamodel.express.statements.impl.StatementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Procedure Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Call</em>'.
	 * @generated
	 */
	ProcedureCall createProcedureCall();

	/**
	 * Returns a new object of class '<em>Skip Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skip Statement</em>'.
	 * @generated
	 */
	SkipStatement createSkipStatement();

	/**
	 * Returns a new object of class '<em>Alias Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alias Statement</em>'.
	 * @generated
	 */
	AliasStatement createAliasStatement();

	/**
	 * Returns a new object of class '<em>Control Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Variable</em>'.
	 * @generated
	 */
	ControlVariable createControlVariable();

	/**
	 * Returns a new object of class '<em>Alias Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alias Variable</em>'.
	 * @generated
	 */
	AliasVariable createAliasVariable();

	/**
	 * Returns a new object of class '<em>VAR Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VAR Cell</em>'.
	 * @generated
	 */
	VARCell createVARCell();

	/**
	 * Returns a new object of class '<em>Null Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Statement</em>'.
	 * @generated
	 */
	NullStatement createNullStatement();

	/**
	 * Returns a new object of class '<em>Attribute Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Cell</em>'.
	 * @generated
	 */
	AttributeCell createAttributeCell();

	/**
	 * Returns a new object of class '<em>Statement Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Block</em>'.
	 * @generated
	 */
	StatementBlock createStatementBlock();

	/**
	 * Returns a new object of class '<em>Case Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Action</em>'.
	 * @generated
	 */
	CaseAction createCaseAction();

	/**
	 * Returns a new object of class '<em>Member Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Cell</em>'.
	 * @generated
	 */
	MemberCell createMemberCell();

	/**
	 * Returns a new object of class '<em>Repeat Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Statement</em>'.
	 * @generated
	 */
	RepeatStatement createRepeatStatement();

	/**
	 * Returns a new object of class '<em>Group Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Cell</em>'.
	 * @generated
	 */
	GroupCell createGroupCell();

	/**
	 * Returns a new object of class '<em>Variable Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Cell</em>'.
	 * @generated
	 */
	VariableCell createVariableCell();

	/**
	 * Returns a new object of class '<em>Case Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Statement</em>'.
	 * @generated
	 */
	CaseStatement createCaseStatement();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>Escape Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Escape Statement</em>'.
	 * @generated
	 */
	EscapeStatement createEscapeStatement();

	/**
	 * Returns a new object of class '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Statement</em>'.
	 * @generated
	 */
	ReturnStatement createReturnStatement();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatementsPackage getStatementsPackage();

} //StatementsFactory
