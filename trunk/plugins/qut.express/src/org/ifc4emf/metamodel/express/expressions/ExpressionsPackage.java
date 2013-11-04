/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.core.CorePackage;

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
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://express.ecore#//expressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "express_expressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.SelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.SelectorImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getSelector()
	 * @generated
	 */
	int SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__EVALUATION = CorePackage.EXPRESSION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__INTERPRETATION_CONTEXT = CorePackage.EXPRESSION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__DATA_TYPE = CorePackage.EXPRESSION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__TEXT = CorePackage.EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Entity Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__ENTITY_INSTANCE = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.RepeatCountImpl <em>Repeat Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.RepeatCountImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getRepeatCount()
	 * @generated
	 */
	int REPEAT_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_COUNT__DERIVATION = 0;

	/**
	 * The number of structural features of the '<em>Repeat Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_COUNT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.PrimaryImpl <em>Primary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.PrimaryImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getPrimary()
	 * @generated
	 */
	int PRIMARY = 13;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY__EVALUATION = CorePackage.EXPRESSION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY__INTERPRETATION_CONTEXT = CorePackage.EXPRESSION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY__DATA_TYPE = CorePackage.EXPRESSION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY__TEXT = CorePackage.EXPRESSION__TEXT;

	/**
	 * The number of structural features of the '<em>Primary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.EnumItemRefImpl <em>Enum Item Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.EnumItemRefImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getEnumItemRef()
	 * @generated
	 */
	int ENUM_ITEM_REF = 2;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ITEM_REF__EVALUATION = PRIMARY__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ITEM_REF__INTERPRETATION_CONTEXT = PRIMARY__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ITEM_REF__DATA_TYPE = PRIMARY__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ITEM_REF__TEXT = PRIMARY__TEXT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ITEM_REF__REFERS_TO = PRIMARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ITEM_REF__ID = PRIMARY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Item Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ITEM_REF_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.LiteralImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__EVALUATION = PRIMARY__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__INTERPRETATION_CONTEXT = PRIMARY__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__DATA_TYPE = PRIMARY__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__TEXT = PRIMARY__TEXT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__REFERS_TO = PRIMARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.IndexOperationImpl <em>Index Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.IndexOperationImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getIndexOperation()
	 * @generated
	 */
	int INDEX_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION__EVALUATION = CorePackage.EXPRESSION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION__INTERPRETATION_CONTEXT = CorePackage.EXPRESSION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION__DATA_TYPE = CorePackage.EXPRESSION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION__TEXT = CorePackage.EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Base Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION__BASE_VALUE = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.BinaryIndexImpl <em>Binary Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.BinaryIndexImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getBinaryIndex()
	 * @generated
	 */
	int BINARY_INDEX = 4;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INDEX__EVALUATION = INDEX_OPERATION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INDEX__INTERPRETATION_CONTEXT = INDEX_OPERATION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INDEX__DATA_TYPE = INDEX_OPERATION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INDEX__TEXT = INDEX_OPERATION__TEXT;

	/**
	 * The feature id for the '<em><b>Base Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INDEX__BASE_VALUE = INDEX_OPERATION__BASE_VALUE;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INDEX__FIRST_BIT = INDEX_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Bit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INDEX__LAST_BIT = INDEX_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INDEX_FEATURE_COUNT = INDEX_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.IndeterminateRefImpl <em>Indeterminate Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.IndeterminateRefImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getIndeterminateRef()
	 * @generated
	 */
	int INDETERMINATE_REF = 5;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDETERMINATE_REF__EVALUATION = PRIMARY__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDETERMINATE_REF__INTERPRETATION_CONTEXT = PRIMARY__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDETERMINATE_REF__DATA_TYPE = PRIMARY__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDETERMINATE_REF__TEXT = PRIMARY__TEXT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDETERMINATE_REF__REFERS_TO = PRIMARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Indeterminate Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDETERMINATE_REF_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.SELFRefImpl <em>SELF Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.SELFRefImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getSELFRef()
	 * @generated
	 */
	int SELF_REF = 6;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_REF__EVALUATION = PRIMARY__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_REF__INTERPRETATION_CONTEXT = PRIMARY__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_REF__DATA_TYPE = PRIMARY__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_REF__TEXT = PRIMARY__TEXT;

	/**
	 * The number of structural features of the '<em>SELF Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_REF_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.OperationImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 24;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EVALUATION = CorePackage.EXPRESSION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INTERPRETATION_CONTEXT = CorePackage.EXPRESSION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DATA_TYPE = CorePackage.EXPRESSION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TEXT = CorePackage.EXPRESSION__TEXT;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.BinaryOperationImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__EVALUATION = OPERATION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__INTERPRETATION_CONTEXT = OPERATION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__DATA_TYPE = OPERATION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__TEXT = OPERATION__TEXT;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__LEFT_OPERAND = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__RIGHT_OPERAND = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__OPERATOR = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.AggregateInitializerImpl <em>Aggregate Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.AggregateInitializerImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getAggregateInitializer()
	 * @generated
	 */
	int AGGREGATE_INITIALIZER = 9;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INITIALIZER__EVALUATION = CorePackage.EXPRESSION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INITIALIZER__INTERPRETATION_CONTEXT = CorePackage.EXPRESSION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INITIALIZER__DATA_TYPE = CorePackage.EXPRESSION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INITIALIZER__TEXT = CorePackage.EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INITIALIZER__RESULT_VALUE = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INITIALIZER__BINDINGS = CorePackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregate Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INITIALIZER_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.StringIndexImpl <em>String Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.StringIndexImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getStringIndex()
	 * @generated
	 */
	int STRING_INDEX = 10;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX__EVALUATION = INDEX_OPERATION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX__INTERPRETATION_CONTEXT = INDEX_OPERATION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX__DATA_TYPE = INDEX_OPERATION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX__TEXT = INDEX_OPERATION__TEXT;

	/**
	 * The feature id for the '<em><b>Base Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX__BASE_VALUE = INDEX_OPERATION__BASE_VALUE;

	/**
	 * The feature id for the '<em><b>First Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX__FIRST_CODE = INDEX_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX__LAST_CODE = INDEX_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_FEATURE_COUNT = INDEX_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.PartialEntityConstructorImpl <em>Partial Entity Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.PartialEntityConstructorImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getPartialEntityConstructor()
	 * @generated
	 */
	int PARTIAL_ENTITY_CONSTRUCTOR = 11;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_CONSTRUCTOR__EVALUATION = CorePackage.EXPRESSION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_CONSTRUCTOR__INTERPRETATION_CONTEXT = CorePackage.EXPRESSION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_CONSTRUCTOR__DATA_TYPE = CorePackage.EXPRESSION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_CONSTRUCTOR__TEXT = CorePackage.EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_CONSTRUCTOR__RESULT_VALUE = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_CONSTRUCTOR__ATTRIBUTE_GROUP = CorePackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_CONSTRUCTOR__BINDINGS = CorePackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_CONSTRUCTOR__ID = CorePackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Partial Entity Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_CONSTRUCTOR_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.CoercionImpl <em>Coercion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.CoercionImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getCoercion()
	 * @generated
	 */
	int COERCION = 12;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COERCION__EVALUATION = OPERATION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COERCION__INTERPRETATION_CONTEXT = OPERATION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COERCION__DATA_TYPE = OPERATION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COERCION__TEXT = OPERATION__TEXT;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COERCION__OPERAND = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COERCION__TARGET_TYPE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coercion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COERCION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.ActualParameterImpl <em>Actual Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ActualParameterImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getActualParameter()
	 * @generated
	 */
	int ACTUAL_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>In Procedure Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__IN_PROCEDURE_CALL = 0;

	/**
	 * The feature id for the '<em><b>In Function Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__IN_FUNCTION_CALL = 1;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__FORMAL_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Actual Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__ACTUAL_REFERENT = 3;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__ACTUAL_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__POSITION = 5;

	/**
	 * The number of structural features of the '<em>Actual Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ParameterRefImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getParameterRef()
	 * @generated
	 */
	int PARAMETER_REF = 15;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__EVALUATION = PRIMARY__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__INTERPRETATION_CONTEXT = PRIMARY__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__DATA_TYPE = PRIMARY__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__TEXT = PRIMARY__TEXT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__REFERS_TO = PRIMARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__ID = PRIMARY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.AttributeRefImpl <em>Attribute Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.AttributeRefImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getAttributeRef()
	 * @generated
	 */
	int ATTRIBUTE_REF = 16;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF__EVALUATION = SELECTOR__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF__INTERPRETATION_CONTEXT = SELECTOR__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF__DATA_TYPE = SELECTOR__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF__TEXT = SELECTOR__TEXT;

	/**
	 * The feature id for the '<em><b>Entity Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF__ENTITY_INSTANCE = SELECTOR__ENTITY_INSTANCE;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF__REFERS_TO = SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF__ID = SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF_FEATURE_COUNT = SELECTOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.AggregateIndexImpl <em>Aggregate Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.AggregateIndexImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getAggregateIndex()
	 * @generated
	 */
	int AGGREGATE_INDEX = 17;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INDEX__EVALUATION = INDEX_OPERATION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INDEX__INTERPRETATION_CONTEXT = INDEX_OPERATION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INDEX__DATA_TYPE = INDEX_OPERATION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INDEX__TEXT = INDEX_OPERATION__TEXT;

	/**
	 * The feature id for the '<em><b>Base Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INDEX__BASE_VALUE = INDEX_OPERATION__BASE_VALUE;

	/**
	 * The feature id for the '<em><b>Index Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INDEX__INDEX_VALUE = INDEX_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregate Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_INDEX_FEATURE_COUNT = INDEX_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.GroupRefImpl <em>Group Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.GroupRefImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getGroupRef()
	 * @generated
	 */
	int GROUP_REF = 18;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__EVALUATION = SELECTOR__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__INTERPRETATION_CONTEXT = SELECTOR__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__DATA_TYPE = SELECTOR__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__TEXT = SELECTOR__TEXT;

	/**
	 * The feature id for the '<em><b>Entity Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__ENTITY_INSTANCE = SELECTOR__ENTITY_INSTANCE;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__REFERS_TO = SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF__ID = SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REF_FEATURE_COUNT = SELECTOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.UnaryOperationImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getUnaryOperation()
	 * @generated
	 */
	int UNARY_OPERATION = 19;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__EVALUATION = OPERATION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__INTERPRETATION_CONTEXT = OPERATION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__DATA_TYPE = OPERATION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__TEXT = OPERATION__TEXT;

	/**
	 * The feature id for the '<em><b>Unary Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__UNARY_OPERAND = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__OPERATOR = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.UsedInRefImpl <em>Used In Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.UsedInRefImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getUsedInRef()
	 * @generated
	 */
	int USED_IN_REF = 20;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_IN_REF__EVALUATION = SELECTOR__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_IN_REF__INTERPRETATION_CONTEXT = SELECTOR__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_IN_REF__DATA_TYPE = SELECTOR__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_IN_REF__TEXT = SELECTOR__TEXT;

	/**
	 * The feature id for the '<em><b>Entity Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_IN_REF__ENTITY_INSTANCE = SELECTOR__ENTITY_INSTANCE;

	/**
	 * The feature id for the '<em><b>Inverse Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_IN_REF__INVERSE_OF = SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Used In Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_IN_REF_FEATURE_COUNT = SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.ConstantRefImpl <em>Constant Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ConstantRefImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getConstantRef()
	 * @generated
	 */
	int CONSTANT_REF = 21;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REF__EVALUATION = PRIMARY__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REF__INTERPRETATION_CONTEXT = PRIMARY__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REF__DATA_TYPE = PRIMARY__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REF__TEXT = PRIMARY__TEXT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REF__REFERS_TO = PRIMARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REF__ID = PRIMARY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REF_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.QueryExpressionImpl <em>Query Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.QueryExpressionImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getQueryExpression()
	 * @generated
	 */
	int QUERY_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__NAMED_ELEMENTS = CorePackage.LOCAL_SCOPE__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__INCLUDES_REMARKS = CorePackage.LOCAL_SCOPE__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Local Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__LOCAL_ELEMENTS = CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__EVALUATION = CorePackage.LOCAL_SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__INTERPRETATION_CONTEXT = CorePackage.LOCAL_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__DATA_TYPE = CorePackage.LOCAL_SCOPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__TEXT = CorePackage.LOCAL_SCOPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Select Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__SELECT_CONDITION = CorePackage.LOCAL_SCOPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Query Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__QUERY_VARIABLE = CorePackage.LOCAL_SCOPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Aggregate Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__AGGREGATE_OPERAND = CorePackage.LOCAL_SCOPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Query Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_FEATURE_COUNT = CorePackage.LOCAL_SCOPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.QueryVariableImpl <em>Query Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.QueryVariableImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getQueryVariable()
	 * @generated
	 */
	int QUERY_VARIABLE = 23;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_VARIABLE__NAMESPACE = AlgorithmsPackage.NAMED_VARIABLE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_VARIABLE__DOCUMENTATION = AlgorithmsPackage.NAMED_VARIABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_VARIABLE__ID = AlgorithmsPackage.NAMED_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_VARIABLE__VARIABLE_TYPE = AlgorithmsPackage.NAMED_VARIABLE__VARIABLE_TYPE;

	/**
	 * The number of structural features of the '<em>Query Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_VARIABLE_FEATURE_COUNT = AlgorithmsPackage.NAMED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.AttributeBindingImpl <em>Attribute Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.AttributeBindingImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getAttributeBinding()
	 * @generated
	 */
	int ATTRIBUTE_BINDING = 25;

	/**
	 * The feature id for the '<em><b>Attribute Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BINDING__ATTRIBUTE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>To Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BINDING__TO_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BINDING__ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BINDING__POSITION = 3;

	/**
	 * The number of structural features of the '<em>Attribute Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BINDING_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.FunctionCallImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 26;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__EVALUATION = CorePackage.EXPRESSION__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__INTERPRETATION_CONTEXT = CorePackage.EXPRESSION__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__DATA_TYPE = CorePackage.EXPRESSION__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__TEXT = CorePackage.EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Actual Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ACTUAL_PARAMETERS = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invokes Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__INVOKES_FUNCTION = CorePackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Returns Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__RETURNS_RESULT = CorePackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.MemberBindingImpl <em>Member Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.MemberBindingImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getMemberBinding()
	 * @generated
	 */
	int MEMBER_BINDING = 27;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_BINDING__REPETITION = 0;

	/**
	 * The feature id for the '<em><b>To Slot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_BINDING__TO_SLOT = 1;

	/**
	 * The feature id for the '<em><b>Member Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_BINDING__MEMBER_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_BINDING__POSITION = 3;

	/**
	 * The number of structural features of the '<em>Member Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_BINDING_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.ExtentRefImpl <em>Extent Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExtentRefImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getExtentRef()
	 * @generated
	 */
	int EXTENT_REF = 28;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_REF__EVALUATION = PRIMARY__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_REF__INTERPRETATION_CONTEXT = PRIMARY__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_REF__DATA_TYPE = PRIMARY__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_REF__TEXT = PRIMARY__TEXT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_REF__REFERS_TO = PRIMARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_REF__ID = PRIMARY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extent Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_REF_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.expressions.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.expressions.impl.VariableRefImpl
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 29;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__EVALUATION = PRIMARY__EVALUATION;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__INTERPRETATION_CONTEXT = PRIMARY__INTERPRETATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__DATA_TYPE = PRIMARY__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__TEXT = PRIMARY__TEXT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__REFERS_TO = PRIMARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__ID = PRIMARY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Unary Operator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 30;

	/**
	 * The meta object id for the '<em>Binary Operator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 31;


	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.Selector
	 * @generated
	 */
	EClass getSelector();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.Selector#getEntityInstance <em>Entity Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Instance</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.Selector#getEntityInstance()
	 * @see #getSelector()
	 * @generated
	 */
	EReference getSelector_EntityInstance();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.RepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Count</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.RepeatCount
	 * @generated
	 */
	EClass getRepeatCount();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.RepeatCount#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derivation</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.RepeatCount#getDerivation()
	 * @see #getRepeatCount()
	 * @generated
	 */
	EReference getRepeatCount_Derivation();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.EnumItemRef <em>Enum Item Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Item Ref</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.EnumItemRef
	 * @generated
	 */
	EClass getEnumItemRef();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.EnumItemRef#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.EnumItemRef#getRefersTo()
	 * @see #getEnumItemRef()
	 * @generated
	 */
	EReference getEnumItemRef_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.EnumItemRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.EnumItemRef#getId()
	 * @see #getEnumItemRef()
	 * @generated
	 */
	EAttribute getEnumItemRef_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.Literal#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.Literal#getRefersTo()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_RefersTo();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.BinaryIndex <em>Binary Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Index</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.BinaryIndex
	 * @generated
	 */
	EClass getBinaryIndex();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.BinaryIndex#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Bit</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.BinaryIndex#getFirstBit()
	 * @see #getBinaryIndex()
	 * @generated
	 */
	EReference getBinaryIndex_FirstBit();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.BinaryIndex#getLastBit <em>Last Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Bit</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.BinaryIndex#getLastBit()
	 * @see #getBinaryIndex()
	 * @generated
	 */
	EReference getBinaryIndex_LastBit();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.IndeterminateRef <em>Indeterminate Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indeterminate Ref</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.IndeterminateRef
	 * @generated
	 */
	EClass getIndeterminateRef();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.IndeterminateRef#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.IndeterminateRef#getRefersTo()
	 * @see #getIndeterminateRef()
	 * @generated
	 */
	EReference getIndeterminateRef_RefersTo();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.SELFRef <em>SELF Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SELF Ref</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.SELFRef
	 * @generated
	 */
	EClass getSELFRef();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.IndexOperation <em>Index Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Operation</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.IndexOperation
	 * @generated
	 */
	EClass getIndexOperation();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.IndexOperation#getBaseValue <em>Base Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Value</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.IndexOperation#getBaseValue()
	 * @see #getIndexOperation()
	 * @generated
	 */
	EReference getIndexOperation_BaseValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.BinaryOperation#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Operand</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.BinaryOperation#getLeftOperand()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_LeftOperand();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.BinaryOperation#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Operand</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.BinaryOperation#getRightOperand()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_RightOperand();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.BinaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.BinaryOperation#getOperator()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EAttribute getBinaryOperation_Operator();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.AggregateInitializer <em>Aggregate Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Initializer</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AggregateInitializer
	 * @generated
	 */
	EClass getAggregateInitializer();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.AggregateInitializer#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Value</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AggregateInitializer#getResultValue()
	 * @see #getAggregateInitializer()
	 * @generated
	 */
	EReference getAggregateInitializer_ResultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.expressions.AggregateInitializer#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AggregateInitializer#getBindings()
	 * @see #getAggregateInitializer()
	 * @generated
	 */
	EReference getAggregateInitializer_Bindings();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.StringIndex <em>String Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Index</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.StringIndex
	 * @generated
	 */
	EClass getStringIndex();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.StringIndex#getFirstCode <em>First Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Code</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.StringIndex#getFirstCode()
	 * @see #getStringIndex()
	 * @generated
	 */
	EReference getStringIndex_FirstCode();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.StringIndex#getLastCode <em>Last Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Code</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.StringIndex#getLastCode()
	 * @see #getStringIndex()
	 * @generated
	 */
	EReference getStringIndex_LastCode();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor <em>Partial Entity Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Entity Constructor</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor
	 * @generated
	 */
	EClass getPartialEntityConstructor();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Value</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getResultValue()
	 * @see #getPartialEntityConstructor()
	 * @generated
	 */
	EReference getPartialEntityConstructor_ResultValue();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Group</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getAttributeGroup()
	 * @see #getPartialEntityConstructor()
	 * @generated
	 */
	EReference getPartialEntityConstructor_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getBindings()
	 * @see #getPartialEntityConstructor()
	 * @generated
	 */
	EReference getPartialEntityConstructor_Bindings();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getId()
	 * @see #getPartialEntityConstructor()
	 * @generated
	 */
	EAttribute getPartialEntityConstructor_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.Coercion <em>Coercion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coercion</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.Coercion
	 * @generated
	 */
	EClass getCoercion();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.Coercion#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.Coercion#getOperand()
	 * @see #getCoercion()
	 * @generated
	 */
	EReference getCoercion_Operand();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.Coercion#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.Coercion#getTargetType()
	 * @see #getCoercion()
	 * @generated
	 */
	EReference getCoercion_TargetType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.Primary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.Primary
	 * @generated
	 */
	EClass getPrimary();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter <em>Actual Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Parameter</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ActualParameter
	 * @generated
	 */
	EClass getActualParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getInProcedureCall <em>In Procedure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Procedure Call</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ActualParameter#getInProcedureCall()
	 * @see #getActualParameter()
	 * @generated
	 */
	EReference getActualParameter_InProcedureCall();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getInFunctionCall <em>In Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Function Call</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ActualParameter#getInFunctionCall()
	 * @see #getActualParameter()
	 * @generated
	 */
	EReference getActualParameter_InFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formal Parameter</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ActualParameter#getFormalParameter()
	 * @see #getActualParameter()
	 * @generated
	 */
	EReference getActualParameter_FormalParameter();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getActualReferent <em>Actual Referent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Referent</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ActualParameter#getActualReferent()
	 * @see #getActualParameter()
	 * @generated
	 */
	EReference getActualParameter_ActualReferent();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Value</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ActualParameter#getActualValue()
	 * @see #getActualParameter()
	 * @generated
	 */
	EReference getActualParameter_ActualValue();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.ActualParameter#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ActualParameter#getPosition()
	 * @see #getActualParameter()
	 * @generated
	 */
	EAttribute getActualParameter_Position();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.ParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Ref</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ParameterRef
	 * @generated
	 */
	EClass getParameterRef();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.ParameterRef#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ParameterRef#getRefersTo()
	 * @see #getParameterRef()
	 * @generated
	 */
	EReference getParameterRef_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.ParameterRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ParameterRef#getId()
	 * @see #getParameterRef()
	 * @generated
	 */
	EAttribute getParameterRef_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.AttributeRef <em>Attribute Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Ref</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AttributeRef
	 * @generated
	 */
	EClass getAttributeRef();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.AttributeRef#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AttributeRef#getRefersTo()
	 * @see #getAttributeRef()
	 * @generated
	 */
	EReference getAttributeRef_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.AttributeRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AttributeRef#getId()
	 * @see #getAttributeRef()
	 * @generated
	 */
	EAttribute getAttributeRef_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.AggregateIndex <em>Aggregate Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Index</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AggregateIndex
	 * @generated
	 */
	EClass getAggregateIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.expressions.AggregateIndex#getIndexValue <em>Index Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Value</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AggregateIndex#getIndexValue()
	 * @see #getAggregateIndex()
	 * @generated
	 */
	EReference getAggregateIndex_IndexValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.GroupRef <em>Group Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Ref</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.GroupRef
	 * @generated
	 */
	EClass getGroupRef();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.GroupRef#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.GroupRef#getRefersTo()
	 * @see #getGroupRef()
	 * @generated
	 */
	EReference getGroupRef_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.GroupRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.GroupRef#getId()
	 * @see #getGroupRef()
	 * @generated
	 */
	EAttribute getGroupRef_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.UnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operation</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.UnaryOperation
	 * @generated
	 */
	EClass getUnaryOperation();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.UnaryOperation#getUnaryOperand <em>Unary Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unary Operand</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.UnaryOperation#getUnaryOperand()
	 * @see #getUnaryOperation()
	 * @generated
	 */
	EReference getUnaryOperation_UnaryOperand();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.UnaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.UnaryOperation#getOperator()
	 * @see #getUnaryOperation()
	 * @generated
	 */
	EAttribute getUnaryOperation_Operator();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.UsedInRef <em>Used In Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used In Ref</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.UsedInRef
	 * @generated
	 */
	EClass getUsedInRef();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.UsedInRef#getInverseOf <em>Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse Of</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.UsedInRef#getInverseOf()
	 * @see #getUsedInRef()
	 * @generated
	 */
	EReference getUsedInRef_InverseOf();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.ConstantRef <em>Constant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Ref</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ConstantRef
	 * @generated
	 */
	EClass getConstantRef();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.ConstantRef#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ConstantRef#getRefersTo()
	 * @see #getConstantRef()
	 * @generated
	 */
	EReference getConstantRef_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.ConstantRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ConstantRef#getId()
	 * @see #getConstantRef()
	 * @generated
	 */
	EAttribute getConstantRef_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.QueryExpression <em>Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Expression</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.QueryExpression
	 * @generated
	 */
	EClass getQueryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.expressions.QueryExpression#getSelectCondition <em>Select Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Condition</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.QueryExpression#getSelectCondition()
	 * @see #getQueryExpression()
	 * @generated
	 */
	EReference getQueryExpression_SelectCondition();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.QueryExpression#getQueryVariable <em>Query Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.QueryExpression#getQueryVariable()
	 * @see #getQueryExpression()
	 * @generated
	 */
	EReference getQueryExpression_QueryVariable();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.QueryExpression#getAggregateOperand <em>Aggregate Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregate Operand</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.QueryExpression#getAggregateOperand()
	 * @see #getQueryExpression()
	 * @generated
	 */
	EReference getQueryExpression_AggregateOperand();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.QueryVariable <em>Query Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.QueryVariable
	 * @generated
	 */
	EClass getQueryVariable();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding <em>Attribute Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Binding</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AttributeBinding
	 * @generated
	 */
	EClass getAttributeBinding();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getAttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Value</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AttributeBinding#getAttributeValue()
	 * @see #getAttributeBinding()
	 * @generated
	 */
	EReference getAttributeBinding_AttributeValue();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getToValue <em>To Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Value</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AttributeBinding#getToValue()
	 * @see #getAttributeBinding()
	 * @generated
	 */
	EReference getAttributeBinding_ToValue();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AttributeBinding#getAttribute()
	 * @see #getAttributeBinding()
	 * @generated
	 */
	EReference getAttributeBinding_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.AttributeBinding#getPosition()
	 * @see #getAttributeBinding()
	 * @generated
	 */
	EAttribute getAttributeBinding_Position();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.expressions.FunctionCall#getActualParameters <em>Actual Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Parameters</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.FunctionCall#getActualParameters()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_ActualParameters();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.FunctionCall#getInvokesFunction <em>Invokes Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invokes Function</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.FunctionCall#getInvokesFunction()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_InvokesFunction();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.FunctionCall#getReturnsResult <em>Returns Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returns Result</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.FunctionCall#getReturnsResult()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_ReturnsResult();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.MemberBinding <em>Member Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Binding</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.MemberBinding
	 * @generated
	 */
	EClass getMemberBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.expressions.MemberBinding#getRepetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repetition</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.MemberBinding#getRepetition()
	 * @see #getMemberBinding()
	 * @generated
	 */
	EReference getMemberBinding_Repetition();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.expressions.MemberBinding#getToSlot <em>To Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Slot</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.MemberBinding#getToSlot()
	 * @see #getMemberBinding()
	 * @generated
	 */
	EReference getMemberBinding_ToSlot();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.MemberBinding#getMemberValue <em>Member Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Value</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.MemberBinding#getMemberValue()
	 * @see #getMemberBinding()
	 * @generated
	 */
	EReference getMemberBinding_MemberValue();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.MemberBinding#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.MemberBinding#getPosition()
	 * @see #getMemberBinding()
	 * @generated
	 */
	EAttribute getMemberBinding_Position();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.ExtentRef <em>Extent Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extent Ref</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ExtentRef
	 * @generated
	 */
	EClass getExtentRef();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.ExtentRef#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ExtentRef#getRefersTo()
	 * @see #getExtentRef()
	 * @generated
	 */
	EReference getExtentRef_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.ExtentRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.ExtentRef#getId()
	 * @see #getExtentRef()
	 * @generated
	 */
	EAttribute getExtentRef_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.expressions.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.expressions.VariableRef#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.VariableRef#getRefersTo()
	 * @see #getVariableRef()
	 * @generated
	 */
	EReference getVariableRef_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.expressions.VariableRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.expressions.VariableRef#getId()
	 * @see #getVariableRef()
	 * @generated
	 */
	EAttribute getVariableRef_Id();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unary Operator</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getUnaryOperator();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Binary Operator</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getBinaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

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
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.SelectorImpl <em>Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.SelectorImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getSelector()
		 * @generated
		 */
		EClass SELECTOR = eINSTANCE.getSelector();

		/**
		 * The meta object literal for the '<em><b>Entity Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTOR__ENTITY_INSTANCE = eINSTANCE.getSelector_EntityInstance();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.RepeatCountImpl <em>Repeat Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.RepeatCountImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getRepeatCount()
		 * @generated
		 */
		EClass REPEAT_COUNT = eINSTANCE.getRepeatCount();

		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_COUNT__DERIVATION = eINSTANCE.getRepeatCount_Derivation();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.EnumItemRefImpl <em>Enum Item Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.EnumItemRefImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getEnumItemRef()
		 * @generated
		 */
		EClass ENUM_ITEM_REF = eINSTANCE.getEnumItemRef();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_ITEM_REF__REFERS_TO = eINSTANCE.getEnumItemRef_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_ITEM_REF__ID = eINSTANCE.getEnumItemRef_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.LiteralImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__REFERS_TO = eINSTANCE.getLiteral_RefersTo();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.BinaryIndexImpl <em>Binary Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.BinaryIndexImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getBinaryIndex()
		 * @generated
		 */
		EClass BINARY_INDEX = eINSTANCE.getBinaryIndex();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_INDEX__FIRST_BIT = eINSTANCE.getBinaryIndex_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Last Bit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_INDEX__LAST_BIT = eINSTANCE.getBinaryIndex_LastBit();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.IndeterminateRefImpl <em>Indeterminate Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.IndeterminateRefImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getIndeterminateRef()
		 * @generated
		 */
		EClass INDETERMINATE_REF = eINSTANCE.getIndeterminateRef();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDETERMINATE_REF__REFERS_TO = eINSTANCE.getIndeterminateRef_RefersTo();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.SELFRefImpl <em>SELF Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.SELFRefImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getSELFRef()
		 * @generated
		 */
		EClass SELF_REF = eINSTANCE.getSELFRef();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.IndexOperationImpl <em>Index Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.IndexOperationImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getIndexOperation()
		 * @generated
		 */
		EClass INDEX_OPERATION = eINSTANCE.getIndexOperation();

		/**
		 * The meta object literal for the '<em><b>Base Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_OPERATION__BASE_VALUE = eINSTANCE.getIndexOperation_BaseValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.BinaryOperationImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__LEFT_OPERAND = eINSTANCE.getBinaryOperation_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__RIGHT_OPERAND = eINSTANCE.getBinaryOperation_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OPERATION__OPERATOR = eINSTANCE.getBinaryOperation_Operator();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.AggregateInitializerImpl <em>Aggregate Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.AggregateInitializerImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getAggregateInitializer()
		 * @generated
		 */
		EClass AGGREGATE_INITIALIZER = eINSTANCE.getAggregateInitializer();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_INITIALIZER__RESULT_VALUE = eINSTANCE.getAggregateInitializer_ResultValue();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_INITIALIZER__BINDINGS = eINSTANCE.getAggregateInitializer_Bindings();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.StringIndexImpl <em>String Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.StringIndexImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getStringIndex()
		 * @generated
		 */
		EClass STRING_INDEX = eINSTANCE.getStringIndex();

		/**
		 * The meta object literal for the '<em><b>First Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_INDEX__FIRST_CODE = eINSTANCE.getStringIndex_FirstCode();

		/**
		 * The meta object literal for the '<em><b>Last Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_INDEX__LAST_CODE = eINSTANCE.getStringIndex_LastCode();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.PartialEntityConstructorImpl <em>Partial Entity Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.PartialEntityConstructorImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getPartialEntityConstructor()
		 * @generated
		 */
		EClass PARTIAL_ENTITY_CONSTRUCTOR = eINSTANCE.getPartialEntityConstructor();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_ENTITY_CONSTRUCTOR__RESULT_VALUE = eINSTANCE.getPartialEntityConstructor_ResultValue();

		/**
		 * The meta object literal for the '<em><b>Attribute Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_ENTITY_CONSTRUCTOR__ATTRIBUTE_GROUP = eINSTANCE.getPartialEntityConstructor_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_ENTITY_CONSTRUCTOR__BINDINGS = eINSTANCE.getPartialEntityConstructor_Bindings();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIAL_ENTITY_CONSTRUCTOR__ID = eINSTANCE.getPartialEntityConstructor_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.CoercionImpl <em>Coercion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.CoercionImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getCoercion()
		 * @generated
		 */
		EClass COERCION = eINSTANCE.getCoercion();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COERCION__OPERAND = eINSTANCE.getCoercion_Operand();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COERCION__TARGET_TYPE = eINSTANCE.getCoercion_TargetType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.PrimaryImpl <em>Primary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.PrimaryImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getPrimary()
		 * @generated
		 */
		EClass PRIMARY = eINSTANCE.getPrimary();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.ActualParameterImpl <em>Actual Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ActualParameterImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getActualParameter()
		 * @generated
		 */
		EClass ACTUAL_PARAMETER = eINSTANCE.getActualParameter();

		/**
		 * The meta object literal for the '<em><b>In Procedure Call</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_PARAMETER__IN_PROCEDURE_CALL = eINSTANCE.getActualParameter_InProcedureCall();

		/**
		 * The meta object literal for the '<em><b>In Function Call</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_PARAMETER__IN_FUNCTION_CALL = eINSTANCE.getActualParameter_InFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Formal Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_PARAMETER__FORMAL_PARAMETER = eINSTANCE.getActualParameter_FormalParameter();

		/**
		 * The meta object literal for the '<em><b>Actual Referent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_PARAMETER__ACTUAL_REFERENT = eINSTANCE.getActualParameter_ActualReferent();

		/**
		 * The meta object literal for the '<em><b>Actual Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_PARAMETER__ACTUAL_VALUE = eINSTANCE.getActualParameter_ActualValue();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_PARAMETER__POSITION = eINSTANCE.getActualParameter_Position();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ParameterRefImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getParameterRef()
		 * @generated
		 */
		EClass PARAMETER_REF = eINSTANCE.getParameterRef();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_REF__REFERS_TO = eINSTANCE.getParameterRef_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_REF__ID = eINSTANCE.getParameterRef_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.AttributeRefImpl <em>Attribute Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.AttributeRefImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getAttributeRef()
		 * @generated
		 */
		EClass ATTRIBUTE_REF = eINSTANCE.getAttributeRef();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_REF__REFERS_TO = eINSTANCE.getAttributeRef_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_REF__ID = eINSTANCE.getAttributeRef_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.AggregateIndexImpl <em>Aggregate Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.AggregateIndexImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getAggregateIndex()
		 * @generated
		 */
		EClass AGGREGATE_INDEX = eINSTANCE.getAggregateIndex();

		/**
		 * The meta object literal for the '<em><b>Index Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_INDEX__INDEX_VALUE = eINSTANCE.getAggregateIndex_IndexValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.GroupRefImpl <em>Group Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.GroupRefImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getGroupRef()
		 * @generated
		 */
		EClass GROUP_REF = eINSTANCE.getGroupRef();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_REF__REFERS_TO = eINSTANCE.getGroupRef_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_REF__ID = eINSTANCE.getGroupRef_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.UnaryOperationImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getUnaryOperation()
		 * @generated
		 */
		EClass UNARY_OPERATION = eINSTANCE.getUnaryOperation();

		/**
		 * The meta object literal for the '<em><b>Unary Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATION__UNARY_OPERAND = eINSTANCE.getUnaryOperation_UnaryOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_OPERATION__OPERATOR = eINSTANCE.getUnaryOperation_Operator();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.UsedInRefImpl <em>Used In Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.UsedInRefImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getUsedInRef()
		 * @generated
		 */
		EClass USED_IN_REF = eINSTANCE.getUsedInRef();

		/**
		 * The meta object literal for the '<em><b>Inverse Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_IN_REF__INVERSE_OF = eINSTANCE.getUsedInRef_InverseOf();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.ConstantRefImpl <em>Constant Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ConstantRefImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getConstantRef()
		 * @generated
		 */
		EClass CONSTANT_REF = eINSTANCE.getConstantRef();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_REF__REFERS_TO = eINSTANCE.getConstantRef_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_REF__ID = eINSTANCE.getConstantRef_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.QueryExpressionImpl <em>Query Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.QueryExpressionImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getQueryExpression()
		 * @generated
		 */
		EClass QUERY_EXPRESSION = eINSTANCE.getQueryExpression();

		/**
		 * The meta object literal for the '<em><b>Select Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_EXPRESSION__SELECT_CONDITION = eINSTANCE.getQueryExpression_SelectCondition();

		/**
		 * The meta object literal for the '<em><b>Query Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_EXPRESSION__QUERY_VARIABLE = eINSTANCE.getQueryExpression_QueryVariable();

		/**
		 * The meta object literal for the '<em><b>Aggregate Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_EXPRESSION__AGGREGATE_OPERAND = eINSTANCE.getQueryExpression_AggregateOperand();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.QueryVariableImpl <em>Query Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.QueryVariableImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getQueryVariable()
		 * @generated
		 */
		EClass QUERY_VARIABLE = eINSTANCE.getQueryVariable();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.OperationImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.AttributeBindingImpl <em>Attribute Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.AttributeBindingImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getAttributeBinding()
		 * @generated
		 */
		EClass ATTRIBUTE_BINDING = eINSTANCE.getAttributeBinding();

		/**
		 * The meta object literal for the '<em><b>Attribute Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_BINDING__ATTRIBUTE_VALUE = eINSTANCE.getAttributeBinding_AttributeValue();

		/**
		 * The meta object literal for the '<em><b>To Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_BINDING__TO_VALUE = eINSTANCE.getAttributeBinding_ToValue();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_BINDING__ATTRIBUTE = eINSTANCE.getAttributeBinding_Attribute();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_BINDING__POSITION = eINSTANCE.getAttributeBinding_Position();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.FunctionCallImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Actual Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__ACTUAL_PARAMETERS = eINSTANCE.getFunctionCall_ActualParameters();

		/**
		 * The meta object literal for the '<em><b>Invokes Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__INVOKES_FUNCTION = eINSTANCE.getFunctionCall_InvokesFunction();

		/**
		 * The meta object literal for the '<em><b>Returns Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__RETURNS_RESULT = eINSTANCE.getFunctionCall_ReturnsResult();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.MemberBindingImpl <em>Member Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.MemberBindingImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getMemberBinding()
		 * @generated
		 */
		EClass MEMBER_BINDING = eINSTANCE.getMemberBinding();

		/**
		 * The meta object literal for the '<em><b>Repetition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_BINDING__REPETITION = eINSTANCE.getMemberBinding_Repetition();

		/**
		 * The meta object literal for the '<em><b>To Slot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_BINDING__TO_SLOT = eINSTANCE.getMemberBinding_ToSlot();

		/**
		 * The meta object literal for the '<em><b>Member Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_BINDING__MEMBER_VALUE = eINSTANCE.getMemberBinding_MemberValue();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_BINDING__POSITION = eINSTANCE.getMemberBinding_Position();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.ExtentRefImpl <em>Extent Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExtentRefImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getExtentRef()
		 * @generated
		 */
		EClass EXTENT_REF = eINSTANCE.getExtentRef();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT_REF__REFERS_TO = eINSTANCE.getExtentRef_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENT_REF__ID = eINSTANCE.getExtentRef_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.expressions.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.expressions.impl.VariableRefImpl
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REF__REFERS_TO = eINSTANCE.getVariableRef_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_REF__ID = eINSTANCE.getVariableRef_Id();

		/**
		 * The meta object literal for the '<em>Unary Operator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EDataType UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '<em>Binary Operator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EDataType BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

	}

} //ExpressionsPackage
