/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ifc4emf.metamodel.express.ExpressPackage;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.impl.CorePackageImpl;
import org.ifc4emf.metamodel.express.expressions.ActualParameter;
import org.ifc4emf.metamodel.express.expressions.AggregateIndex;
import org.ifc4emf.metamodel.express.expressions.AggregateInitializer;
import org.ifc4emf.metamodel.express.expressions.AttributeBinding;
import org.ifc4emf.metamodel.express.expressions.AttributeRef;
import org.ifc4emf.metamodel.express.expressions.BinaryIndex;
import org.ifc4emf.metamodel.express.expressions.BinaryOperation;
import org.ifc4emf.metamodel.express.expressions.Coercion;
import org.ifc4emf.metamodel.express.expressions.ConstantRef;
import org.ifc4emf.metamodel.express.expressions.EnumItemRef;
import org.ifc4emf.metamodel.express.expressions.ExpressionsFactory;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.ExtentRef;
import org.ifc4emf.metamodel.express.expressions.FunctionCall;
import org.ifc4emf.metamodel.express.expressions.GroupRef;
import org.ifc4emf.metamodel.express.expressions.IndeterminateRef;
import org.ifc4emf.metamodel.express.expressions.IndexOperation;
import org.ifc4emf.metamodel.express.expressions.Literal;
import org.ifc4emf.metamodel.express.expressions.MemberBinding;
import org.ifc4emf.metamodel.express.expressions.Operation;
import org.ifc4emf.metamodel.express.expressions.ParameterRef;
import org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor;
import org.ifc4emf.metamodel.express.expressions.Primary;
import org.ifc4emf.metamodel.express.expressions.QueryExpression;
import org.ifc4emf.metamodel.express.expressions.QueryVariable;
import org.ifc4emf.metamodel.express.expressions.RepeatCount;
import org.ifc4emf.metamodel.express.expressions.SELFRef;
import org.ifc4emf.metamodel.express.expressions.Selector;
import org.ifc4emf.metamodel.express.expressions.StringIndex;
import org.ifc4emf.metamodel.express.expressions.UnaryOperation;
import org.ifc4emf.metamodel.express.expressions.UsedInRef;
import org.ifc4emf.metamodel.express.expressions.VariableRef;
import org.ifc4emf.metamodel.express.impl.ExpressPackageImpl;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl;
import org.ifc4emf.metamodel.express.java.lang.LangPackage;
import org.ifc4emf.metamodel.express.java.lang.impl.LangPackageImpl;
import org.ifc4emf.metamodel.express.mof.MofPackage;
import org.ifc4emf.metamodel.express.mof.impl.MofPackageImpl;
import org.ifc4emf.metamodel.express.rules.RulesPackage;
import org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;
import org.ifc4emf.metamodel.express.statements.impl.StatementsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumItemRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indeterminateRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialEntityConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coercionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usedInRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extentRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unaryOperatorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType binaryOperatorEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionsPackageImpl() {
		super(eNS_URI, ExpressionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionsPackage init() {
		if (isInited) return (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExpressPackageImpl theExpressPackage = (ExpressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressPackage.eNS_URI) instanceof ExpressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressPackage.eNS_URI) : ExpressPackage.eINSTANCE);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		MofPackageImpl theMofPackage = (MofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI) instanceof MofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI) : MofPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		AlgorithmsPackageImpl theAlgorithmsPackage = (AlgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI) instanceof AlgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI) : AlgorithmsPackage.eINSTANCE);
		InstancesPackageImpl theInstancesPackage = (InstancesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI) instanceof InstancesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI) : InstancesPackage.eINSTANCE);

		// Create package meta-data objects
		theExpressionsPackage.createPackageContents();
		theExpressPackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theMofPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theLangPackage.createPackageContents();
		theAlgorithmsPackage.createPackageContents();
		theInstancesPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionsPackage.initializePackageContents();
		theExpressPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theMofPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theAlgorithmsPackage.initializePackageContents();
		theInstancesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
		return theExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelector() {
		return selectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelector_EntityInstance() {
		return (EReference)selectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatCount() {
		return repeatCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatCount_Derivation() {
		return (EReference)repeatCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumItemRef() {
		return enumItemRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumItemRef_RefersTo() {
		return (EReference)enumItemRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumItemRef_Id() {
		return (EAttribute)enumItemRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteral_RefersTo() {
		return (EReference)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryIndex() {
		return binaryIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryIndex_FirstBit() {
		return (EReference)binaryIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryIndex_LastBit() {
		return (EReference)binaryIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndeterminateRef() {
		return indeterminateRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndeterminateRef_RefersTo() {
		return (EReference)indeterminateRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSELFRef() {
		return selfRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexOperation() {
		return indexOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexOperation_BaseValue() {
		return (EReference)indexOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperation() {
		return binaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperation_LeftOperand() {
		return (EReference)binaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperation_RightOperand() {
		return (EReference)binaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryOperation_Operator() {
		return (EAttribute)binaryOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateInitializer() {
		return aggregateInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateInitializer_ResultValue() {
		return (EReference)aggregateInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateInitializer_Bindings() {
		return (EReference)aggregateInitializerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringIndex() {
		return stringIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringIndex_FirstCode() {
		return (EReference)stringIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringIndex_LastCode() {
		return (EReference)stringIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialEntityConstructor() {
		return partialEntityConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialEntityConstructor_ResultValue() {
		return (EReference)partialEntityConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialEntityConstructor_AttributeGroup() {
		return (EReference)partialEntityConstructorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialEntityConstructor_Bindings() {
		return (EReference)partialEntityConstructorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartialEntityConstructor_Id() {
		return (EAttribute)partialEntityConstructorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoercion() {
		return coercionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoercion_Operand() {
		return (EReference)coercionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoercion_TargetType() {
		return (EReference)coercionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimary() {
		return primaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualParameter() {
		return actualParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualParameter_InProcedureCall() {
		return (EReference)actualParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualParameter_InFunctionCall() {
		return (EReference)actualParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualParameter_FormalParameter() {
		return (EReference)actualParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualParameter_ActualReferent() {
		return (EReference)actualParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualParameter_ActualValue() {
		return (EReference)actualParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualParameter_Position() {
		return (EAttribute)actualParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterRef() {
		return parameterRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterRef_RefersTo() {
		return (EReference)parameterRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterRef_Id() {
		return (EAttribute)parameterRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeRef() {
		return attributeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeRef_RefersTo() {
		return (EReference)attributeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeRef_Id() {
		return (EAttribute)attributeRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateIndex() {
		return aggregateIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateIndex_IndexValue() {
		return (EReference)aggregateIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupRef() {
		return groupRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupRef_RefersTo() {
		return (EReference)groupRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupRef_Id() {
		return (EAttribute)groupRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOperation() {
		return unaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryOperation_UnaryOperand() {
		return (EReference)unaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryOperation_Operator() {
		return (EAttribute)unaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsedInRef() {
		return usedInRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsedInRef_InverseOf() {
		return (EReference)usedInRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantRef() {
		return constantRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantRef_RefersTo() {
		return (EReference)constantRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantRef_Id() {
		return (EAttribute)constantRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryExpression() {
		return queryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryExpression_SelectCondition() {
		return (EReference)queryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryExpression_QueryVariable() {
		return (EReference)queryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryExpression_AggregateOperand() {
		return (EReference)queryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryVariable() {
		return queryVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeBinding() {
		return attributeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeBinding_AttributeValue() {
		return (EReference)attributeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeBinding_ToValue() {
		return (EReference)attributeBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeBinding_Attribute() {
		return (EReference)attributeBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeBinding_Position() {
		return (EAttribute)attributeBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionCall() {
		return functionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionCall_ActualParameters() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionCall_InvokesFunction() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionCall_ReturnsResult() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberBinding() {
		return memberBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberBinding_Repetition() {
		return (EReference)memberBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberBinding_ToSlot() {
		return (EReference)memberBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberBinding_MemberValue() {
		return (EReference)memberBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberBinding_Position() {
		return (EAttribute)memberBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtentRef() {
		return extentRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtentRef_RefersTo() {
		return (EReference)extentRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtentRef_Id() {
		return (EAttribute)extentRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRef() {
		return variableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableRef_RefersTo() {
		return (EReference)variableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableRef_Id() {
		return (EAttribute)variableRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnaryOperator() {
		return unaryOperatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBinaryOperator() {
		return binaryOperatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactory getExpressionsFactory() {
		return (ExpressionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		selectorEClass = createEClass(SELECTOR);
		createEReference(selectorEClass, SELECTOR__ENTITY_INSTANCE);

		repeatCountEClass = createEClass(REPEAT_COUNT);
		createEReference(repeatCountEClass, REPEAT_COUNT__DERIVATION);

		enumItemRefEClass = createEClass(ENUM_ITEM_REF);
		createEReference(enumItemRefEClass, ENUM_ITEM_REF__REFERS_TO);
		createEAttribute(enumItemRefEClass, ENUM_ITEM_REF__ID);

		literalEClass = createEClass(LITERAL);
		createEReference(literalEClass, LITERAL__REFERS_TO);

		binaryIndexEClass = createEClass(BINARY_INDEX);
		createEReference(binaryIndexEClass, BINARY_INDEX__FIRST_BIT);
		createEReference(binaryIndexEClass, BINARY_INDEX__LAST_BIT);

		indeterminateRefEClass = createEClass(INDETERMINATE_REF);
		createEReference(indeterminateRefEClass, INDETERMINATE_REF__REFERS_TO);

		selfRefEClass = createEClass(SELF_REF);

		indexOperationEClass = createEClass(INDEX_OPERATION);
		createEReference(indexOperationEClass, INDEX_OPERATION__BASE_VALUE);

		binaryOperationEClass = createEClass(BINARY_OPERATION);
		createEReference(binaryOperationEClass, BINARY_OPERATION__LEFT_OPERAND);
		createEReference(binaryOperationEClass, BINARY_OPERATION__RIGHT_OPERAND);
		createEAttribute(binaryOperationEClass, BINARY_OPERATION__OPERATOR);

		aggregateInitializerEClass = createEClass(AGGREGATE_INITIALIZER);
		createEReference(aggregateInitializerEClass, AGGREGATE_INITIALIZER__RESULT_VALUE);
		createEReference(aggregateInitializerEClass, AGGREGATE_INITIALIZER__BINDINGS);

		stringIndexEClass = createEClass(STRING_INDEX);
		createEReference(stringIndexEClass, STRING_INDEX__FIRST_CODE);
		createEReference(stringIndexEClass, STRING_INDEX__LAST_CODE);

		partialEntityConstructorEClass = createEClass(PARTIAL_ENTITY_CONSTRUCTOR);
		createEReference(partialEntityConstructorEClass, PARTIAL_ENTITY_CONSTRUCTOR__RESULT_VALUE);
		createEReference(partialEntityConstructorEClass, PARTIAL_ENTITY_CONSTRUCTOR__ATTRIBUTE_GROUP);
		createEReference(partialEntityConstructorEClass, PARTIAL_ENTITY_CONSTRUCTOR__BINDINGS);
		createEAttribute(partialEntityConstructorEClass, PARTIAL_ENTITY_CONSTRUCTOR__ID);

		coercionEClass = createEClass(COERCION);
		createEReference(coercionEClass, COERCION__OPERAND);
		createEReference(coercionEClass, COERCION__TARGET_TYPE);

		primaryEClass = createEClass(PRIMARY);

		actualParameterEClass = createEClass(ACTUAL_PARAMETER);
		createEReference(actualParameterEClass, ACTUAL_PARAMETER__IN_PROCEDURE_CALL);
		createEReference(actualParameterEClass, ACTUAL_PARAMETER__IN_FUNCTION_CALL);
		createEReference(actualParameterEClass, ACTUAL_PARAMETER__FORMAL_PARAMETER);
		createEReference(actualParameterEClass, ACTUAL_PARAMETER__ACTUAL_REFERENT);
		createEReference(actualParameterEClass, ACTUAL_PARAMETER__ACTUAL_VALUE);
		createEAttribute(actualParameterEClass, ACTUAL_PARAMETER__POSITION);

		parameterRefEClass = createEClass(PARAMETER_REF);
		createEReference(parameterRefEClass, PARAMETER_REF__REFERS_TO);
		createEAttribute(parameterRefEClass, PARAMETER_REF__ID);

		attributeRefEClass = createEClass(ATTRIBUTE_REF);
		createEReference(attributeRefEClass, ATTRIBUTE_REF__REFERS_TO);
		createEAttribute(attributeRefEClass, ATTRIBUTE_REF__ID);

		aggregateIndexEClass = createEClass(AGGREGATE_INDEX);
		createEReference(aggregateIndexEClass, AGGREGATE_INDEX__INDEX_VALUE);

		groupRefEClass = createEClass(GROUP_REF);
		createEReference(groupRefEClass, GROUP_REF__REFERS_TO);
		createEAttribute(groupRefEClass, GROUP_REF__ID);

		unaryOperationEClass = createEClass(UNARY_OPERATION);
		createEReference(unaryOperationEClass, UNARY_OPERATION__UNARY_OPERAND);
		createEAttribute(unaryOperationEClass, UNARY_OPERATION__OPERATOR);

		usedInRefEClass = createEClass(USED_IN_REF);
		createEReference(usedInRefEClass, USED_IN_REF__INVERSE_OF);

		constantRefEClass = createEClass(CONSTANT_REF);
		createEReference(constantRefEClass, CONSTANT_REF__REFERS_TO);
		createEAttribute(constantRefEClass, CONSTANT_REF__ID);

		queryExpressionEClass = createEClass(QUERY_EXPRESSION);
		createEReference(queryExpressionEClass, QUERY_EXPRESSION__SELECT_CONDITION);
		createEReference(queryExpressionEClass, QUERY_EXPRESSION__QUERY_VARIABLE);
		createEReference(queryExpressionEClass, QUERY_EXPRESSION__AGGREGATE_OPERAND);

		queryVariableEClass = createEClass(QUERY_VARIABLE);

		operationEClass = createEClass(OPERATION);

		attributeBindingEClass = createEClass(ATTRIBUTE_BINDING);
		createEReference(attributeBindingEClass, ATTRIBUTE_BINDING__ATTRIBUTE_VALUE);
		createEReference(attributeBindingEClass, ATTRIBUTE_BINDING__TO_VALUE);
		createEReference(attributeBindingEClass, ATTRIBUTE_BINDING__ATTRIBUTE);
		createEAttribute(attributeBindingEClass, ATTRIBUTE_BINDING__POSITION);

		functionCallEClass = createEClass(FUNCTION_CALL);
		createEReference(functionCallEClass, FUNCTION_CALL__ACTUAL_PARAMETERS);
		createEReference(functionCallEClass, FUNCTION_CALL__INVOKES_FUNCTION);
		createEReference(functionCallEClass, FUNCTION_CALL__RETURNS_RESULT);

		memberBindingEClass = createEClass(MEMBER_BINDING);
		createEReference(memberBindingEClass, MEMBER_BINDING__REPETITION);
		createEReference(memberBindingEClass, MEMBER_BINDING__TO_SLOT);
		createEReference(memberBindingEClass, MEMBER_BINDING__MEMBER_VALUE);
		createEAttribute(memberBindingEClass, MEMBER_BINDING__POSITION);

		extentRefEClass = createEClass(EXTENT_REF);
		createEReference(extentRefEClass, EXTENT_REF__REFERS_TO);
		createEAttribute(extentRefEClass, EXTENT_REF__ID);

		variableRefEClass = createEClass(VARIABLE_REF);
		createEReference(variableRefEClass, VARIABLE_REF__REFERS_TO);
		createEAttribute(variableRefEClass, VARIABLE_REF__ID);

		// Create data types
		unaryOperatorEDataType = createEDataType(UNARY_OPERATOR);
		binaryOperatorEDataType = createEDataType(BINARY_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		InstancesPackage theInstancesPackage = (InstancesPackage)EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI);
		StatementsPackage theStatementsPackage = (StatementsPackage)EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
		AlgorithmsPackage theAlgorithmsPackage = (AlgorithmsPackage)EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI);
		MofPackage theMofPackage = (MofPackage)EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		selectorEClass.getESuperTypes().add(theCorePackage.getExpression());
		enumItemRefEClass.getESuperTypes().add(this.getPrimary());
		literalEClass.getESuperTypes().add(this.getPrimary());
		binaryIndexEClass.getESuperTypes().add(this.getIndexOperation());
		indeterminateRefEClass.getESuperTypes().add(this.getPrimary());
		selfRefEClass.getESuperTypes().add(this.getPrimary());
		indexOperationEClass.getESuperTypes().add(theCorePackage.getExpression());
		binaryOperationEClass.getESuperTypes().add(this.getOperation());
		aggregateInitializerEClass.getESuperTypes().add(theCorePackage.getExpression());
		stringIndexEClass.getESuperTypes().add(this.getIndexOperation());
		partialEntityConstructorEClass.getESuperTypes().add(theCorePackage.getExpression());
		coercionEClass.getESuperTypes().add(this.getOperation());
		primaryEClass.getESuperTypes().add(theCorePackage.getExpression());
		parameterRefEClass.getESuperTypes().add(this.getPrimary());
		attributeRefEClass.getESuperTypes().add(this.getSelector());
		aggregateIndexEClass.getESuperTypes().add(this.getIndexOperation());
		groupRefEClass.getESuperTypes().add(this.getSelector());
		unaryOperationEClass.getESuperTypes().add(this.getOperation());
		usedInRefEClass.getESuperTypes().add(this.getSelector());
		constantRefEClass.getESuperTypes().add(this.getPrimary());
		queryExpressionEClass.getESuperTypes().add(theCorePackage.getLocalScope());
		queryExpressionEClass.getESuperTypes().add(theCorePackage.getExpression());
		queryVariableEClass.getESuperTypes().add(theAlgorithmsPackage.getNamedVariable());
		operationEClass.getESuperTypes().add(theCorePackage.getExpression());
		functionCallEClass.getESuperTypes().add(theCorePackage.getExpression());
		extentRefEClass.getESuperTypes().add(this.getPrimary());
		variableRefEClass.getESuperTypes().add(this.getPrimary());

		// Initialize classes and features; add operations and parameters
		initEClass(selectorEClass, Selector.class, "Selector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelector_EntityInstance(), theCorePackage.getExpression(), null, "entityInstance", null, 1, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(repeatCountEClass, RepeatCount.class, "RepeatCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatCount_Derivation(), theCorePackage.getExpression(), null, "derivation", null, 0, 1, RepeatCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumItemRefEClass, EnumItemRef.class, "EnumItemRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumItemRef_RefersTo(), theInstancesPackage.getEnumerationItem(), null, "refersTo", null, 1, 1, EnumItemRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEnumItemRef_Id(), theCorePackage.getIdentifier(), "id", null, 1, 1, EnumItemRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteral_RefersTo(), theInstancesPackage.getSimpleValue(), null, "refersTo", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(binaryIndexEClass, BinaryIndex.class, "BinaryIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryIndex_FirstBit(), theCorePackage.getExpression(), null, "firstBit", null, 1, 1, BinaryIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBinaryIndex_LastBit(), theCorePackage.getExpression(), null, "lastBit", null, 0, 1, BinaryIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(indeterminateRefEClass, IndeterminateRef.class, "IndeterminateRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndeterminateRef_RefersTo(), theInstancesPackage.getIndeterminate(), null, "refersTo", null, 1, 1, IndeterminateRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(selfRefEClass, SELFRef.class, "SELFRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexOperationEClass, IndexOperation.class, "IndexOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndexOperation_BaseValue(), theCorePackage.getExpression(), null, "baseValue", null, 1, 1, IndexOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(binaryOperationEClass, BinaryOperation.class, "BinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperation_LeftOperand(), theCorePackage.getExpression(), null, "leftOperand", null, 1, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBinaryOperation_RightOperand(), theCorePackage.getExpression(), null, "rightOperand", null, 1, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBinaryOperation_Operator(), this.getBinaryOperator(), "operator", null, 1, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aggregateInitializerEClass, AggregateInitializer.class, "AggregateInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregateInitializer_ResultValue(), theInstancesPackage.getGenericAggregate(), null, "resultValue", null, 0, 1, AggregateInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAggregateInitializer_Bindings(), this.getMemberBinding(), null, "bindings", null, 0, -1, AggregateInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringIndexEClass, StringIndex.class, "StringIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringIndex_FirstCode(), theCorePackage.getExpression(), null, "firstCode", null, 1, 1, StringIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStringIndex_LastCode(), theCorePackage.getExpression(), null, "lastCode", null, 0, 1, StringIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(partialEntityConstructorEClass, PartialEntityConstructor.class, "PartialEntityConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialEntityConstructor_ResultValue(), theInstancesPackage.getPartialEntityValue(), null, "resultValue", null, 0, 1, PartialEntityConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPartialEntityConstructor_AttributeGroup(), theCorePackage.getSingleEntityType(), null, "attributeGroup", null, 1, 1, PartialEntityConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPartialEntityConstructor_Bindings(), this.getAttributeBinding(), null, "bindings", null, 0, -1, PartialEntityConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPartialEntityConstructor_Id(), theCorePackage.getIdentifier(), "id", null, 1, 1, PartialEntityConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(coercionEClass, Coercion.class, "Coercion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoercion_Operand(), theCorePackage.getExpression(), null, "operand", null, 1, 1, Coercion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoercion_TargetType(), theCorePackage.getVariableType(), null, "targetType", null, 1, 1, Coercion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primaryEClass, Primary.class, "Primary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actualParameterEClass, ActualParameter.class, "ActualParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualParameter_InProcedureCall(), theStatementsPackage.getProcedureCall(), theStatementsPackage.getProcedureCall_ActualParameters(), "inProcedureCall", null, 0, 1, ActualParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActualParameter_InFunctionCall(), this.getFunctionCall(), this.getFunctionCall_ActualParameters(), "inFunctionCall", null, 0, 1, ActualParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActualParameter_FormalParameter(), theAlgorithmsPackage.getParameter(), null, "formalParameter", null, 1, 1, ActualParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActualParameter_ActualReferent(), theStatementsPackage.getVARExpression(), null, "actualReferent", null, 0, 1, ActualParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActualParameter_ActualValue(), theCorePackage.getExpression(), null, "actualValue", null, 0, 1, ActualParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActualParameter_Position(), theMofPackage.getInteger(), "position", null, 1, 1, ActualParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterRefEClass, ParameterRef.class, "ParameterRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterRef_RefersTo(), theAlgorithmsPackage.getParameter(), null, "refersTo", null, 1, 1, ParameterRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameterRef_Id(), theCorePackage.getIdentifier(), "id", null, 1, 1, ParameterRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeRefEClass, AttributeRef.class, "AttributeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeRef_RefersTo(), theCorePackage.getAttribute(), null, "refersTo", null, 1, 1, AttributeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttributeRef_Id(), theCorePackage.getIdentifier(), "id", null, 1, 1, AttributeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aggregateIndexEClass, AggregateIndex.class, "AggregateIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregateIndex_IndexValue(), theCorePackage.getExpression(), null, "indexValue", null, 1, 1, AggregateIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(groupRefEClass, GroupRef.class, "GroupRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupRef_RefersTo(), theCorePackage.getSingleEntityType(), null, "refersTo", null, 1, 1, GroupRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGroupRef_Id(), theCorePackage.getIdentifier(), "id", null, 1, 1, GroupRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unaryOperationEClass, UnaryOperation.class, "UnaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryOperation_UnaryOperand(), theCorePackage.getExpression(), null, "unaryOperand", null, 1, 1, UnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnaryOperation_Operator(), this.getUnaryOperator(), "operator", null, 1, 1, UnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(usedInRefEClass, UsedInRef.class, "UsedInRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsedInRef_InverseOf(), theCorePackage.getAttribute(), null, "inverseOf", null, 1, 1, UsedInRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(constantRefEClass, ConstantRef.class, "ConstantRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantRef_RefersTo(), theInstancesPackage.getConstant(), null, "refersTo", null, 1, 1, ConstantRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConstantRef_Id(), theCorePackage.getIdentifier(), "id", null, 1, 1, ConstantRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(queryExpressionEClass, QueryExpression.class, "QueryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryExpression_SelectCondition(), theCorePackage.getExpression(), null, "selectCondition", null, 1, 1, QueryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQueryExpression_QueryVariable(), this.getQueryVariable(), null, "queryVariable", null, 1, 1, QueryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQueryExpression_AggregateOperand(), theCorePackage.getExpression(), null, "aggregateOperand", null, 1, 1, QueryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(queryVariableEClass, QueryVariable.class, "QueryVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeBindingEClass, AttributeBinding.class, "AttributeBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeBinding_AttributeValue(), theCorePackage.getExpression(), null, "attributeValue", null, 1, 1, AttributeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeBinding_ToValue(), theInstancesPackage.getAttributeValue(), null, "toValue", null, 0, 1, AttributeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeBinding_Attribute(), theCorePackage.getExplicitAttribute(), null, "attribute", null, 1, 1, AttributeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttributeBinding_Position(), theMofPackage.getInteger(), "position", null, 1, 1, AttributeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionCall_ActualParameters(), this.getActualParameter(), this.getActualParameter_InFunctionCall(), "actualParameters", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFunctionCall_InvokesFunction(), theAlgorithmsPackage.getFunction(), null, "invokesFunction", null, 1, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFunctionCall_ReturnsResult(), theAlgorithmsPackage.getFunctionResult(), null, "returnsResult", null, 1, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(memberBindingEClass, MemberBinding.class, "MemberBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberBinding_Repetition(), this.getRepeatCount(), null, "repetition", null, 0, 1, MemberBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemberBinding_ToSlot(), theInstancesPackage.getListMember(), null, "toSlot", null, 0, -1, MemberBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemberBinding_MemberValue(), theCorePackage.getExpression(), null, "memberValue", null, 1, 1, MemberBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMemberBinding_Position(), theMofPackage.getInteger(), "position", null, 1, 1, MemberBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(extentRefEClass, ExtentRef.class, "ExtentRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtentRef_RefersTo(), theCorePackage.getNamedType(), null, "refersTo", null, 1, 1, ExtentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExtentRef_Id(), theCorePackage.getIdentifier(), "id", null, 1, 1, ExtentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variableRefEClass, VariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableRef_RefersTo(), theAlgorithmsPackage.getNamedVariable(), null, "refersTo", null, 1, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVariableRef_Id(), theCorePackage.getIdentifier(), "id", null, 1, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize data types
		initEDataType(unaryOperatorEDataType, String.class, "UnaryOperator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(binaryOperatorEDataType, String.class, "BinaryOperator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //ExpressionsPackageImpl
