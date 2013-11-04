/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.statements.StatementsFactory
 * @model kind="package"
 * @generated
 */
public interface StatementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://express.ecore#//statements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "express_statements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementsPackage eINSTANCE = org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.ProcedureCallImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getProcedureCall()
	 * @generated
	 */
	int PROCEDURE_CALL = 0;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__IN_BLOCK = AlgorithmsPackage.STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__BODY_STATEMENTS_SKIP_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__BODY_STATEMENTS_ESCAPE_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__CONTROLLED_BY = AlgorithmsPackage.STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__IMPLEMENTS = AlgorithmsPackage.STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__TEXT = AlgorithmsPackage.STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Invokes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__INVOKES = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__ACTUAL_PARAMETERS = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Procedure Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_FEATURE_COUNT = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.ControlStatementImpl <em>Control Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.ControlStatementImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getControlStatement()
	 * @generated
	 */
	int CONTROL_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__IN_BLOCK = AlgorithmsPackage.STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__CONTROLLED_BY = AlgorithmsPackage.STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__IMPLEMENTS = AlgorithmsPackage.STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__TEXT = AlgorithmsPackage.STATEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>Control Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT_FEATURE_COUNT = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.SkipStatementImpl <em>Skip Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.SkipStatementImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getSkipStatement()
	 * @generated
	 */
	int SKIP_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_STATEMENT__IN_BLOCK = CONTROL_STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT = CONTROL_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = CONTROL_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_STATEMENT__CONTROLLED_BY = CONTROL_STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_STATEMENT__IMPLEMENTS = CONTROL_STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_STATEMENT__TEXT = CONTROL_STATEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>Skip Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_STATEMENT_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.AliasStatementImpl <em>Alias Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.AliasStatementImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getAliasStatement()
	 * @generated
	 */
	int ALIAS_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__IN_BLOCK = AlgorithmsPackage.STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__CONTROLLED_BY = AlgorithmsPackage.STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__IMPLEMENTS = AlgorithmsPackage.STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__TEXT = AlgorithmsPackage.STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__NAMED_ELEMENTS = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__INCLUDES_REMARKS = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__LOCAL_ELEMENTS = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Binds To Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__BINDS_TO_REFERENCE = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__BODY = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alias Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT__ALIAS_VARIABLE = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Alias Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_STATEMENT_FEATURE_COUNT = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.ControlVariableImpl <em>Control Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.ControlVariableImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getControlVariable()
	 * @generated
	 */
	int CONTROL_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VARIABLE__NAMESPACE = AlgorithmsPackage.NAMED_VARIABLE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VARIABLE__DOCUMENTATION = AlgorithmsPackage.NAMED_VARIABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VARIABLE__ID = AlgorithmsPackage.NAMED_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VARIABLE__VARIABLE_TYPE = AlgorithmsPackage.NAMED_VARIABLE__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>Bound Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VARIABLE__BOUND_VALUE = AlgorithmsPackage.NAMED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VARIABLE__INITIAL_VALUE = AlgorithmsPackage.NAMED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VARIABLE__INCREMENT = AlgorithmsPackage.NAMED_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VARIABLE_FEATURE_COUNT = AlgorithmsPackage.NAMED_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.AliasVariableImpl <em>Alias Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.AliasVariableImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getAliasVariable()
	 * @generated
	 */
	int ALIAS_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_VARIABLE__NAMESPACE = AlgorithmsPackage.NAMED_VARIABLE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_VARIABLE__DOCUMENTATION = AlgorithmsPackage.NAMED_VARIABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_VARIABLE__ID = AlgorithmsPackage.NAMED_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_VARIABLE__VARIABLE_TYPE = AlgorithmsPackage.NAMED_VARIABLE__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_VARIABLE__REFERENT = AlgorithmsPackage.NAMED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alias Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_VARIABLE_FEATURE_COUNT = AlgorithmsPackage.NAMED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.VARExpressionImpl <em>VAR Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.VARExpressionImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getVARExpression()
	 * @generated
	 */
	int VAR_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_EXPRESSION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>VAR Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.VARCellImpl <em>VAR Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.VARCellImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getVARCell()
	 * @generated
	 */
	int VAR_CELL = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_CELL__TEXT = VAR_EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_CELL__REFERS_TO = VAR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_CELL__ID = VAR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VAR Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_CELL_FEATURE_COUNT = VAR_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.NullStatementImpl <em>Null Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.NullStatementImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getNullStatement()
	 * @generated
	 */
	int NULL_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_STATEMENT__IN_BLOCK = CONTROL_STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT = CONTROL_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = CONTROL_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_STATEMENT__CONTROLLED_BY = CONTROL_STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_STATEMENT__IMPLEMENTS = CONTROL_STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_STATEMENT__TEXT = CONTROL_STATEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>Null Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_STATEMENT_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.AttributeCellImpl <em>Attribute Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.AttributeCellImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getAttributeCell()
	 * @generated
	 */
	int ATTRIBUTE_CELL = 9;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CELL__TEXT = VAR_EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CELL__REFERS_TO = VAR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CELL__BASE_ENTITY = VAR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CELL__ID = VAR_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CELL_FEATURE_COUNT = VAR_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.StatementBlockImpl <em>Statement Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementBlockImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getStatementBlock()
	 * @generated
	 */
	int STATEMENT_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK__IN_BLOCK = AlgorithmsPackage.STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK__BODY_STATEMENTS_SKIP_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK__BODY_STATEMENTS_ESCAPE_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK__CONTROLLED_BY = AlgorithmsPackage.STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK__IMPLEMENTS = AlgorithmsPackage.STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK__TEXT = AlgorithmsPackage.STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Body Statements Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK__BODY_STATEMENTS_STATEMENT = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delimited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK__DELIMITED = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK_FEATURE_COUNT = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.CaseActionImpl <em>Case Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.CaseActionImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getCaseAction()
	 * @generated
	 */
	int CASE_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Label Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ACTION__LABEL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ACTION__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ACTION__IS_DEFAULT = 2;

	/**
	 * The number of structural features of the '<em>Case Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.MemberCellImpl <em>Member Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.MemberCellImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getMemberCell()
	 * @generated
	 */
	int MEMBER_CELL = 12;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_CELL__TEXT = VAR_EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Index Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_CELL__INDEX_VALUE = VAR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_CELL__BASE_AGGREGATE = VAR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_CELL_FEATURE_COUNT = VAR_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.RepeatStatementImpl <em>Repeat Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.RepeatStatementImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getRepeatStatement()
	 * @generated
	 */
	int REPEAT_STATEMENT = 13;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__IN_BLOCK = AlgorithmsPackage.STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__CONTROLLED_BY = AlgorithmsPackage.STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__IMPLEMENTS = AlgorithmsPackage.STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__TEXT = AlgorithmsPackage.STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__NAMED_ELEMENTS = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__INCLUDES_REMARKS = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__LOCAL_ELEMENTS = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>While Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__WHILE_EXPRESSION = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__BODY = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Control Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__CONTROL_VARIABLE = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Until Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__UNTIL_EXPRESSION = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Repeat Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT_FEATURE_COUNT = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.GroupCellImpl <em>Group Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.GroupCellImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getGroupCell()
	 * @generated
	 */
	int GROUP_CELL = 14;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CELL__TEXT = VAR_EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Base Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CELL__BASE_ENTITY = VAR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CELL__REFERS_TO = VAR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CELL__ID = VAR_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Group Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CELL_FEATURE_COUNT = VAR_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.VariableCellImpl <em>Variable Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.VariableCellImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getVariableCell()
	 * @generated
	 */
	int VARIABLE_CELL = 15;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CELL__TEXT = VAR_EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CELL__REFERS_TO = VAR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CELL__ID = VAR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CELL_FEATURE_COUNT = VAR_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.CaseStatementImpl <em>Case Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.CaseStatementImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getCaseStatement()
	 * @generated
	 */
	int CASE_STATEMENT = 16;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__IN_BLOCK = AlgorithmsPackage.STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__CONTROLLED_BY = AlgorithmsPackage.STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__IMPLEMENTS = AlgorithmsPackage.STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__TEXT = AlgorithmsPackage.STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__CASES = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__SELECTION_EXPRESSION = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT_FEATURE_COUNT = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.IfStatementImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 17;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__IN_BLOCK = AlgorithmsPackage.STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONTROLLED_BY = AlgorithmsPackage.STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__IMPLEMENTS = AlgorithmsPackage.STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__TEXT = AlgorithmsPackage.STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__IF_CONDITION = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_ACTIONS = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Then Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN_ACTIONS = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.EscapeStatementImpl <em>Escape Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.EscapeStatementImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getEscapeStatement()
	 * @generated
	 */
	int ESCAPE_STATEMENT = 18;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_STATEMENT__IN_BLOCK = CONTROL_STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT = CONTROL_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = CONTROL_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_STATEMENT__CONTROLLED_BY = CONTROL_STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_STATEMENT__IMPLEMENTS = CONTROL_STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_STATEMENT__TEXT = CONTROL_STATEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>Escape Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_STATEMENT_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.ReturnStatementImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 19;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__IN_BLOCK = CONTROL_STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT = CONTROL_STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = CONTROL_STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__CONTROLLED_BY = CONTROL_STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__IMPLEMENTS = CONTROL_STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__TEXT = CONTROL_STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__RETURN_VALUE = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.statements.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.statements.impl.AssignmentImpl
	 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 20;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__IN_BLOCK = AlgorithmsPackage.STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__BODY_STATEMENTS_SKIP_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__CONTROLLED_BY = AlgorithmsPackage.STATEMENT__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__IMPLEMENTS = AlgorithmsPackage.STATEMENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TEXT = AlgorithmsPackage.STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Assigned Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSIGNED_VALUE = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VARIABLE = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = AlgorithmsPackage.STATEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.ProcedureCall <em>Procedure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Call</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.ProcedureCall
	 * @generated
	 */
	EClass getProcedureCall();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.ProcedureCall#getInvokes <em>Invokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invokes</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.ProcedureCall#getInvokes()
	 * @see #getProcedureCall()
	 * @generated
	 */
	EReference getProcedureCall_Invokes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.statements.ProcedureCall#getActualParameters <em>Actual Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Parameters</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.ProcedureCall#getActualParameters()
	 * @see #getProcedureCall()
	 * @generated
	 */
	EReference getProcedureCall_ActualParameters();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.SkipStatement <em>Skip Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skip Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.SkipStatement
	 * @generated
	 */
	EClass getSkipStatement();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.AliasStatement <em>Alias Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.AliasStatement
	 * @generated
	 */
	EClass getAliasStatement();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.AliasStatement#getBindsToReference <em>Binds To Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binds To Reference</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.AliasStatement#getBindsToReference()
	 * @see #getAliasStatement()
	 * @generated
	 */
	EReference getAliasStatement_BindsToReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.statements.AliasStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.AliasStatement#getBody()
	 * @see #getAliasStatement()
	 * @generated
	 */
	EReference getAliasStatement_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.statements.AliasStatement#getAliasVariable <em>Alias Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.AliasStatement#getAliasVariable()
	 * @see #getAliasStatement()
	 * @generated
	 */
	EReference getAliasStatement_AliasVariable();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.ControlVariable <em>Control Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.ControlVariable
	 * @generated
	 */
	EClass getControlVariable();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.ControlVariable#getBoundValue <em>Bound Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Value</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.ControlVariable#getBoundValue()
	 * @see #getControlVariable()
	 * @generated
	 */
	EReference getControlVariable_BoundValue();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.ControlVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Value</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.ControlVariable#getInitialValue()
	 * @see #getControlVariable()
	 * @generated
	 */
	EReference getControlVariable_InitialValue();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.ControlVariable#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Increment</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.ControlVariable#getIncrement()
	 * @see #getControlVariable()
	 * @generated
	 */
	EReference getControlVariable_Increment();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.AliasVariable <em>Alias Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.AliasVariable
	 * @generated
	 */
	EClass getAliasVariable();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.AliasVariable#getReferent <em>Referent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referent</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.AliasVariable#getReferent()
	 * @see #getAliasVariable()
	 * @generated
	 */
	EReference getAliasVariable_Referent();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.ControlStatement <em>Control Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.ControlStatement
	 * @generated
	 */
	EClass getControlStatement();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.VARCell <em>VAR Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VAR Cell</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.VARCell
	 * @generated
	 */
	EClass getVARCell();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.VARCell#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.VARCell#getRefersTo()
	 * @see #getVARCell()
	 * @generated
	 */
	EReference getVARCell_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.statements.VARCell#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.VARCell#getId()
	 * @see #getVARCell()
	 * @generated
	 */
	EAttribute getVARCell_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.NullStatement <em>Null Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.NullStatement
	 * @generated
	 */
	EClass getNullStatement();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.VARExpression <em>VAR Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VAR Expression</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.VARExpression
	 * @generated
	 */
	EClass getVARExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.statements.VARExpression#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.VARExpression#getText()
	 * @see #getVARExpression()
	 * @generated
	 */
	EAttribute getVARExpression_Text();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.AttributeCell <em>Attribute Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Cell</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.AttributeCell
	 * @generated
	 */
	EClass getAttributeCell();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.AttributeCell#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.AttributeCell#getRefersTo()
	 * @see #getAttributeCell()
	 * @generated
	 */
	EReference getAttributeCell_RefersTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.statements.AttributeCell#getBaseEntity <em>Base Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Entity</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.AttributeCell#getBaseEntity()
	 * @see #getAttributeCell()
	 * @generated
	 */
	EReference getAttributeCell_BaseEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.statements.AttributeCell#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.AttributeCell#getId()
	 * @see #getAttributeCell()
	 * @generated
	 */
	EAttribute getAttributeCell_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.StatementBlock <em>Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Block</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.StatementBlock
	 * @generated
	 */
	EClass getStatementBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.statements.StatementBlock#getBodyStatements_Statement <em>Body Statements Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Statements Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.StatementBlock#getBodyStatements_Statement()
	 * @see #getStatementBlock()
	 * @generated
	 */
	EReference getStatementBlock_BodyStatements_Statement();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.statements.StatementBlock#getDelimited <em>Delimited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimited</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.StatementBlock#getDelimited()
	 * @see #getStatementBlock()
	 * @generated
	 */
	EAttribute getStatementBlock_Delimited();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.CaseAction <em>Case Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Action</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.CaseAction
	 * @generated
	 */
	EClass getCaseAction();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.statements.CaseAction#getLabelValue <em>Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Label Value</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.CaseAction#getLabelValue()
	 * @see #getCaseAction()
	 * @generated
	 */
	EReference getCaseAction_LabelValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.statements.CaseAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.CaseAction#getAction()
	 * @see #getCaseAction()
	 * @generated
	 */
	EReference getCaseAction_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.statements.CaseAction#getIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.CaseAction#getIsDefault()
	 * @see #getCaseAction()
	 * @generated
	 */
	EAttribute getCaseAction_IsDefault();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.MemberCell <em>Member Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Cell</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.MemberCell
	 * @generated
	 */
	EClass getMemberCell();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.MemberCell#getIndexValue <em>Index Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index Value</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.MemberCell#getIndexValue()
	 * @see #getMemberCell()
	 * @generated
	 */
	EReference getMemberCell_IndexValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.statements.MemberCell#getBaseAggregate <em>Base Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Aggregate</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.MemberCell#getBaseAggregate()
	 * @see #getMemberCell()
	 * @generated
	 */
	EReference getMemberCell_BaseAggregate();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.RepeatStatement <em>Repeat Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.RepeatStatement
	 * @generated
	 */
	EClass getRepeatStatement();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getWhileExpression <em>While Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>While Expression</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.RepeatStatement#getWhileExpression()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EReference getRepeatStatement_WhileExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.RepeatStatement#getBody()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EReference getRepeatStatement_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getControlVariable <em>Control Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.RepeatStatement#getControlVariable()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EReference getRepeatStatement_ControlVariable();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getUntilExpression <em>Until Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Until Expression</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.RepeatStatement#getUntilExpression()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EReference getRepeatStatement_UntilExpression();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.GroupCell <em>Group Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Cell</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.GroupCell
	 * @generated
	 */
	EClass getGroupCell();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.statements.GroupCell#getBaseEntity <em>Base Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Entity</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.GroupCell#getBaseEntity()
	 * @see #getGroupCell()
	 * @generated
	 */
	EReference getGroupCell_BaseEntity();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.GroupCell#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.GroupCell#getRefersTo()
	 * @see #getGroupCell()
	 * @generated
	 */
	EReference getGroupCell_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.statements.GroupCell#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.GroupCell#getId()
	 * @see #getGroupCell()
	 * @generated
	 */
	EAttribute getGroupCell_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.VariableCell <em>Variable Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Cell</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.VariableCell
	 * @generated
	 */
	EClass getVariableCell();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.VariableCell#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.VariableCell#getRefersTo()
	 * @see #getVariableCell()
	 * @generated
	 */
	EReference getVariableCell_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.statements.VariableCell#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.VariableCell#getId()
	 * @see #getVariableCell()
	 * @generated
	 */
	EAttribute getVariableCell_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.CaseStatement <em>Case Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.CaseStatement
	 * @generated
	 */
	EClass getCaseStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.statements.CaseStatement#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.CaseStatement#getCases()
	 * @see #getCaseStatement()
	 * @generated
	 */
	EReference getCaseStatement_Cases();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.CaseStatement#getSelectionExpression <em>Selection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection Expression</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.CaseStatement#getSelectionExpression()
	 * @see #getCaseStatement()
	 * @generated
	 */
	EReference getCaseStatement_SelectionExpression();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.statements.IfStatement#getIfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Condition</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.IfStatement#getIfCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_IfCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.statements.IfStatement#getElseActions <em>Else Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Actions</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.IfStatement#getElseActions()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseActions();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.statements.IfStatement#getThenActions <em>Then Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Actions</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.IfStatement#getThenActions()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ThenActions();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.EscapeStatement <em>Escape Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escape Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.EscapeStatement
	 * @generated
	 */
	EClass getEscapeStatement();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.ReturnStatement#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Value</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.ReturnStatement#getReturnValue()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_ReturnValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.statements.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.Assignment#getAssignedValue <em>Assigned Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Value</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.Assignment#getAssignedValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_AssignedValue();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.statements.Assignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.statements.Assignment#getVariable()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Variable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatementsFactory getStatementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.ProcedureCallImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getProcedureCall()
		 * @generated
		 */
		EClass PROCEDURE_CALL = eINSTANCE.getProcedureCall();

		/**
		 * The meta object literal for the '<em><b>Invokes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_CALL__INVOKES = eINSTANCE.getProcedureCall_Invokes();

		/**
		 * The meta object literal for the '<em><b>Actual Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_CALL__ACTUAL_PARAMETERS = eINSTANCE.getProcedureCall_ActualParameters();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.SkipStatementImpl <em>Skip Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.SkipStatementImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getSkipStatement()
		 * @generated
		 */
		EClass SKIP_STATEMENT = eINSTANCE.getSkipStatement();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.AliasStatementImpl <em>Alias Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.AliasStatementImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getAliasStatement()
		 * @generated
		 */
		EClass ALIAS_STATEMENT = eINSTANCE.getAliasStatement();

		/**
		 * The meta object literal for the '<em><b>Binds To Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS_STATEMENT__BINDS_TO_REFERENCE = eINSTANCE.getAliasStatement_BindsToReference();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS_STATEMENT__BODY = eINSTANCE.getAliasStatement_Body();

		/**
		 * The meta object literal for the '<em><b>Alias Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS_STATEMENT__ALIAS_VARIABLE = eINSTANCE.getAliasStatement_AliasVariable();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.ControlVariableImpl <em>Control Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.ControlVariableImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getControlVariable()
		 * @generated
		 */
		EClass CONTROL_VARIABLE = eINSTANCE.getControlVariable();

		/**
		 * The meta object literal for the '<em><b>Bound Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_VARIABLE__BOUND_VALUE = eINSTANCE.getControlVariable_BoundValue();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_VARIABLE__INITIAL_VALUE = eINSTANCE.getControlVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_VARIABLE__INCREMENT = eINSTANCE.getControlVariable_Increment();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.AliasVariableImpl <em>Alias Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.AliasVariableImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getAliasVariable()
		 * @generated
		 */
		EClass ALIAS_VARIABLE = eINSTANCE.getAliasVariable();

		/**
		 * The meta object literal for the '<em><b>Referent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS_VARIABLE__REFERENT = eINSTANCE.getAliasVariable_Referent();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.ControlStatementImpl <em>Control Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.ControlStatementImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getControlStatement()
		 * @generated
		 */
		EClass CONTROL_STATEMENT = eINSTANCE.getControlStatement();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.VARCellImpl <em>VAR Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.VARCellImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getVARCell()
		 * @generated
		 */
		EClass VAR_CELL = eINSTANCE.getVARCell();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_CELL__REFERS_TO = eINSTANCE.getVARCell_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_CELL__ID = eINSTANCE.getVARCell_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.NullStatementImpl <em>Null Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.NullStatementImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getNullStatement()
		 * @generated
		 */
		EClass NULL_STATEMENT = eINSTANCE.getNullStatement();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.VARExpressionImpl <em>VAR Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.VARExpressionImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getVARExpression()
		 * @generated
		 */
		EClass VAR_EXPRESSION = eINSTANCE.getVARExpression();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_EXPRESSION__TEXT = eINSTANCE.getVARExpression_Text();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.AttributeCellImpl <em>Attribute Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.AttributeCellImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getAttributeCell()
		 * @generated
		 */
		EClass ATTRIBUTE_CELL = eINSTANCE.getAttributeCell();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CELL__REFERS_TO = eINSTANCE.getAttributeCell_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Base Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CELL__BASE_ENTITY = eINSTANCE.getAttributeCell_BaseEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CELL__ID = eINSTANCE.getAttributeCell_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.StatementBlockImpl <em>Statement Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementBlockImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getStatementBlock()
		 * @generated
		 */
		EClass STATEMENT_BLOCK = eINSTANCE.getStatementBlock();

		/**
		 * The meta object literal for the '<em><b>Body Statements Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_BLOCK__BODY_STATEMENTS_STATEMENT = eINSTANCE.getStatementBlock_BodyStatements_Statement();

		/**
		 * The meta object literal for the '<em><b>Delimited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_BLOCK__DELIMITED = eINSTANCE.getStatementBlock_Delimited();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.CaseActionImpl <em>Case Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.CaseActionImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getCaseAction()
		 * @generated
		 */
		EClass CASE_ACTION = eINSTANCE.getCaseAction();

		/**
		 * The meta object literal for the '<em><b>Label Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ACTION__LABEL_VALUE = eINSTANCE.getCaseAction_LabelValue();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ACTION__ACTION = eINSTANCE.getCaseAction_Action();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE_ACTION__IS_DEFAULT = eINSTANCE.getCaseAction_IsDefault();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.MemberCellImpl <em>Member Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.MemberCellImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getMemberCell()
		 * @generated
		 */
		EClass MEMBER_CELL = eINSTANCE.getMemberCell();

		/**
		 * The meta object literal for the '<em><b>Index Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_CELL__INDEX_VALUE = eINSTANCE.getMemberCell_IndexValue();

		/**
		 * The meta object literal for the '<em><b>Base Aggregate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_CELL__BASE_AGGREGATE = eINSTANCE.getMemberCell_BaseAggregate();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.RepeatStatementImpl <em>Repeat Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.RepeatStatementImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getRepeatStatement()
		 * @generated
		 */
		EClass REPEAT_STATEMENT = eINSTANCE.getRepeatStatement();

		/**
		 * The meta object literal for the '<em><b>While Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_STATEMENT__WHILE_EXPRESSION = eINSTANCE.getRepeatStatement_WhileExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_STATEMENT__BODY = eINSTANCE.getRepeatStatement_Body();

		/**
		 * The meta object literal for the '<em><b>Control Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_STATEMENT__CONTROL_VARIABLE = eINSTANCE.getRepeatStatement_ControlVariable();

		/**
		 * The meta object literal for the '<em><b>Until Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_STATEMENT__UNTIL_EXPRESSION = eINSTANCE.getRepeatStatement_UntilExpression();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.GroupCellImpl <em>Group Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.GroupCellImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getGroupCell()
		 * @generated
		 */
		EClass GROUP_CELL = eINSTANCE.getGroupCell();

		/**
		 * The meta object literal for the '<em><b>Base Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_CELL__BASE_ENTITY = eINSTANCE.getGroupCell_BaseEntity();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_CELL__REFERS_TO = eINSTANCE.getGroupCell_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_CELL__ID = eINSTANCE.getGroupCell_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.VariableCellImpl <em>Variable Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.VariableCellImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getVariableCell()
		 * @generated
		 */
		EClass VARIABLE_CELL = eINSTANCE.getVariableCell();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CELL__REFERS_TO = eINSTANCE.getVariableCell_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_CELL__ID = eINSTANCE.getVariableCell_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.CaseStatementImpl <em>Case Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.CaseStatementImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getCaseStatement()
		 * @generated
		 */
		EClass CASE_STATEMENT = eINSTANCE.getCaseStatement();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_STATEMENT__CASES = eINSTANCE.getCaseStatement_Cases();

		/**
		 * The meta object literal for the '<em><b>Selection Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_STATEMENT__SELECTION_EXPRESSION = eINSTANCE.getCaseStatement_SelectionExpression();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.IfStatementImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>If Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__IF_CONDITION = eINSTANCE.getIfStatement_IfCondition();

		/**
		 * The meta object literal for the '<em><b>Else Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_ACTIONS = eINSTANCE.getIfStatement_ElseActions();

		/**
		 * The meta object literal for the '<em><b>Then Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__THEN_ACTIONS = eINSTANCE.getIfStatement_ThenActions();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.EscapeStatementImpl <em>Escape Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.EscapeStatementImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getEscapeStatement()
		 * @generated
		 */
		EClass ESCAPE_STATEMENT = eINSTANCE.getEscapeStatement();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.ReturnStatementImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__RETURN_VALUE = eINSTANCE.getReturnStatement_ReturnValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.statements.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.statements.impl.AssignmentImpl
		 * @see org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Assigned Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__ASSIGNED_VALUE = eINSTANCE.getAssignment_AssignedValue();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

	}

} //StatementsPackage
