/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ifc4emf.metamodel.express.ExpressPackage;
import org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType;
import org.ifc4emf.metamodel.express.algorithms.ActualARRAYType;
import org.ifc4emf.metamodel.express.algorithms.ActualAggregationType;
import org.ifc4emf.metamodel.express.algorithms.ActualBAGType;
import org.ifc4emf.metamodel.express.algorithms.ActualDataType;
import org.ifc4emf.metamodel.express.algorithms.ActualGenericType;
import org.ifc4emf.metamodel.express.algorithms.ActualLISTType;
import org.ifc4emf.metamodel.express.algorithms.ActualSETType;
import org.ifc4emf.metamodel.express.algorithms.ActualStructure;
import org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint;
import org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint;
import org.ifc4emf.metamodel.express.algorithms.Algorithm;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsFactory;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.algorithms.Function;
import org.ifc4emf.metamodel.express.algorithms.FunctionResult;
import org.ifc4emf.metamodel.express.algorithms.GenericElement;
import org.ifc4emf.metamodel.express.algorithms.InParameter;
import org.ifc4emf.metamodel.express.algorithms.InVariable;
import org.ifc4emf.metamodel.express.algorithms.LocalVariable;
import org.ifc4emf.metamodel.express.algorithms.NamedVariable;
import org.ifc4emf.metamodel.express.algorithms.Parameter;
import org.ifc4emf.metamodel.express.algorithms.Procedure;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.algorithms.VARParameter;
import org.ifc4emf.metamodel.express.algorithms.VARVariable;
import org.ifc4emf.metamodel.express.algorithms.Variable;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.impl.CorePackageImpl;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl;
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
public class AlgorithmsPackageImpl extends EPackageImpl implements AlgorithmsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualTypeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualARRAYTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualSETTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualAGGREGATETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualStructureConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualAggregationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualLISTTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualBAGTypeEClass = null;

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
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlgorithmsPackageImpl() {
		super(eNS_URI, AlgorithmsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AlgorithmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlgorithmsPackage init() {
		if (isInited) return (AlgorithmsPackage)EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI);

		// Obtain or create and register package
		AlgorithmsPackageImpl theAlgorithmsPackage = (AlgorithmsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AlgorithmsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AlgorithmsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExpressPackageImpl theExpressPackage = (ExpressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressPackage.eNS_URI) instanceof ExpressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressPackage.eNS_URI) : ExpressPackage.eINSTANCE);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		MofPackageImpl theMofPackage = (MofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI) instanceof MofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI) : MofPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		InstancesPackageImpl theInstancesPackage = (InstancesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI) instanceof InstancesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI) : InstancesPackage.eINSTANCE);

		// Create package meta-data objects
		theAlgorithmsPackage.createPackageContents();
		theExpressPackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theMofPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theLangPackage.createPackageContents();
		theInstancesPackage.createPackageContents();

		// Initialize created meta-data
		theAlgorithmsPackage.initializePackageContents();
		theExpressPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theMofPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theInstancesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlgorithmsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlgorithmsPackage.eNS_URI, theAlgorithmsPackage);
		return theAlgorithmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualTypeConstraint() {
		return actualTypeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualTypeConstraint_MatchingType() {
		return (EReference)actualTypeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualTypeConstraint_RequiredType() {
		return (EReference)actualTypeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualTypeConstraint_Label() {
		return (EAttribute)actualTypeConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionResult() {
		return functionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Result() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInParameter() {
		return inParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInParameter_Variable() {
		return (EReference)inParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariable() {
		return localVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariable_InitialValue() {
		return (EReference)localVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualStructure() {
		return actualStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualGenericType() {
		return actualGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualGenericType_RefersTo() {
		return (EReference)actualGenericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualGenericType_IsEntity() {
		return (EAttribute)actualGenericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualGenericType_Label() {
		return (EAttribute)actualGenericTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_InBlock() {
		return (EReference)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_BodyStatementsSkipStatement() {
		return (EReference)statementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_BodyStatementsEscapeStatement() {
		return (EReference)statementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_ControlledBy() {
		return (EReference)statementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Implements() {
		return (EReference)statementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_Text() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedVariable() {
		return namedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedVariable_VariableType() {
		return (EReference)namedVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInVariable() {
		return inVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInVariable_Source() {
		return (EReference)inVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualARRAYType() {
		return actualARRAYTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualARRAYType_HiIndex() {
		return (EReference)actualARRAYTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualARRAYType_LoIndex() {
		return (EReference)actualARRAYTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualARRAYType_IsOptional() {
		return (EAttribute)actualARRAYTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualSETType() {
		return actualSETTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualAGGREGATEType() {
		return actualAGGREGATETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualAGGREGATEType_UpperBound() {
		return (EReference)actualAGGREGATETypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualAGGREGATEType_RefersTo() {
		return (EReference)actualAGGREGATETypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualAGGREGATEType_MemberType() {
		return (EReference)actualAGGREGATETypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualAGGREGATEType_LowerBound() {
		return (EReference)actualAGGREGATETypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualAGGREGATEType_Label() {
		return (EAttribute)actualAGGREGATETypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_StructureConstraints() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_TypeConstraints() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_FormalParameterType() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Inout() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Position() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualStructureConstraint() {
		return actualStructureConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualStructureConstraint_MatchingStructure() {
		return (EReference)actualStructureConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualStructureConstraint_RequiredStructure() {
		return (EReference)actualStructureConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualStructureConstraint_Label() {
		return (EAttribute)actualStructureConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithm() {
		return algorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithm_Body() {
		return (EReference)algorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithm_FormalParameters() {
		return (EReference)algorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualAggregationType() {
		return actualAggregationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualAggregationType_MemberType() {
		return (EReference)actualAggregationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVARVariable() {
		return varVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualLISTType() {
		return actualLISTTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericElement() {
		return genericElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericElement_Source() {
		return (EReference)genericElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericElement_Label() {
		return (EReference)genericElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVARParameter() {
		return varParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualDataType() {
		return actualDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualBAGType() {
		return actualBAGTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmsFactory getAlgorithmsFactory() {
		return (AlgorithmsFactory)getEFactoryInstance();
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
		actualTypeConstraintEClass = createEClass(ACTUAL_TYPE_CONSTRAINT);
		createEReference(actualTypeConstraintEClass, ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE);
		createEReference(actualTypeConstraintEClass, ACTUAL_TYPE_CONSTRAINT__REQUIRED_TYPE);
		createEAttribute(actualTypeConstraintEClass, ACTUAL_TYPE_CONSTRAINT__LABEL);

		functionResultEClass = createEClass(FUNCTION_RESULT);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__RESULT);

		inParameterEClass = createEClass(IN_PARAMETER);
		createEReference(inParameterEClass, IN_PARAMETER__VARIABLE);

		localVariableEClass = createEClass(LOCAL_VARIABLE);
		createEReference(localVariableEClass, LOCAL_VARIABLE__INITIAL_VALUE);

		actualStructureEClass = createEClass(ACTUAL_STRUCTURE);

		actualGenericTypeEClass = createEClass(ACTUAL_GENERIC_TYPE);
		createEReference(actualGenericTypeEClass, ACTUAL_GENERIC_TYPE__REFERS_TO);
		createEAttribute(actualGenericTypeEClass, ACTUAL_GENERIC_TYPE__IS_ENTITY);
		createEAttribute(actualGenericTypeEClass, ACTUAL_GENERIC_TYPE__LABEL);

		statementEClass = createEClass(STATEMENT);
		createEReference(statementEClass, STATEMENT__IN_BLOCK);
		createEReference(statementEClass, STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT);
		createEReference(statementEClass, STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT);
		createEReference(statementEClass, STATEMENT__CONTROLLED_BY);
		createEReference(statementEClass, STATEMENT__IMPLEMENTS);
		createEAttribute(statementEClass, STATEMENT__TEXT);

		namedVariableEClass = createEClass(NAMED_VARIABLE);
		createEReference(namedVariableEClass, NAMED_VARIABLE__VARIABLE_TYPE);

		inVariableEClass = createEClass(IN_VARIABLE);
		createEReference(inVariableEClass, IN_VARIABLE__SOURCE);

		procedureEClass = createEClass(PROCEDURE);

		actualARRAYTypeEClass = createEClass(ACTUAL_ARRAY_TYPE);
		createEReference(actualARRAYTypeEClass, ACTUAL_ARRAY_TYPE__HI_INDEX);
		createEReference(actualARRAYTypeEClass, ACTUAL_ARRAY_TYPE__LO_INDEX);
		createEAttribute(actualARRAYTypeEClass, ACTUAL_ARRAY_TYPE__IS_OPTIONAL);

		actualSETTypeEClass = createEClass(ACTUAL_SET_TYPE);

		actualAGGREGATETypeEClass = createEClass(ACTUAL_AGGREGATE_TYPE);
		createEReference(actualAGGREGATETypeEClass, ACTUAL_AGGREGATE_TYPE__UPPER_BOUND);
		createEReference(actualAGGREGATETypeEClass, ACTUAL_AGGREGATE_TYPE__REFERS_TO);
		createEReference(actualAGGREGATETypeEClass, ACTUAL_AGGREGATE_TYPE__MEMBER_TYPE);
		createEReference(actualAGGREGATETypeEClass, ACTUAL_AGGREGATE_TYPE__LOWER_BOUND);
		createEAttribute(actualAGGREGATETypeEClass, ACTUAL_AGGREGATE_TYPE__LABEL);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__STRUCTURE_CONSTRAINTS);
		createEReference(parameterEClass, PARAMETER__TYPE_CONSTRAINTS);
		createEReference(parameterEClass, PARAMETER__FORMAL_PARAMETER_TYPE);
		createEAttribute(parameterEClass, PARAMETER__INOUT);
		createEAttribute(parameterEClass, PARAMETER__POSITION);

		actualStructureConstraintEClass = createEClass(ACTUAL_STRUCTURE_CONSTRAINT);
		createEReference(actualStructureConstraintEClass, ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE);
		createEReference(actualStructureConstraintEClass, ACTUAL_STRUCTURE_CONSTRAINT__REQUIRED_STRUCTURE);
		createEAttribute(actualStructureConstraintEClass, ACTUAL_STRUCTURE_CONSTRAINT__LABEL);

		algorithmEClass = createEClass(ALGORITHM);
		createEReference(algorithmEClass, ALGORITHM__BODY);
		createEReference(algorithmEClass, ALGORITHM__FORMAL_PARAMETERS);

		actualAggregationTypeEClass = createEClass(ACTUAL_AGGREGATION_TYPE);
		createEReference(actualAggregationTypeEClass, ACTUAL_AGGREGATION_TYPE__MEMBER_TYPE);

		varVariableEClass = createEClass(VAR_VARIABLE);

		actualLISTTypeEClass = createEClass(ACTUAL_LIST_TYPE);

		variableEClass = createEClass(VARIABLE);

		genericElementEClass = createEClass(GENERIC_ELEMENT);
		createEReference(genericElementEClass, GENERIC_ELEMENT__SOURCE);
		createEReference(genericElementEClass, GENERIC_ELEMENT__LABEL);

		varParameterEClass = createEClass(VAR_PARAMETER);

		actualDataTypeEClass = createEClass(ACTUAL_DATA_TYPE);

		actualBAGTypeEClass = createEClass(ACTUAL_BAG_TYPE);
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
		MofPackage theMofPackage = (MofPackage)EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI);
		StatementsPackage theStatementsPackage = (StatementsPackage)EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionResultEClass.getESuperTypes().add(this.getVariable());
		functionEClass.getESuperTypes().add(this.getAlgorithm());
		inParameterEClass.getESuperTypes().add(this.getParameter());
		localVariableEClass.getESuperTypes().add(this.getVariable());
		actualStructureEClass.getESuperTypes().add(this.getGenericElement());
		actualStructureEClass.getESuperTypes().add(theCorePackage.getAGGREGATEType());
		actualGenericTypeEClass.getESuperTypes().add(theCorePackage.getActualType());
		namedVariableEClass.getESuperTypes().add(theCorePackage.getLocalElement());
		inVariableEClass.getESuperTypes().add(this.getVariable());
		procedureEClass.getESuperTypes().add(this.getAlgorithm());
		actualARRAYTypeEClass.getESuperTypes().add(this.getActualAggregationType());
		actualSETTypeEClass.getESuperTypes().add(this.getActualAggregationType());
		actualAGGREGATETypeEClass.getESuperTypes().add(theCorePackage.getActualType());
		parameterEClass.getESuperTypes().add(theCorePackage.getLocalElement());
		algorithmEClass.getESuperTypes().add(theCorePackage.getAlgorithmScope());
		algorithmEClass.getESuperTypes().add(theCorePackage.getCommonElement());
		actualAggregationTypeEClass.getESuperTypes().add(theCorePackage.getActualType());
		actualAggregationTypeEClass.getESuperTypes().add(theCorePackage.getAggregationType());
		actualLISTTypeEClass.getESuperTypes().add(this.getActualAggregationType());
		variableEClass.getESuperTypes().add(this.getNamedVariable());
		genericElementEClass.getESuperTypes().add(theCorePackage.getLocalElement());
		varParameterEClass.getESuperTypes().add(this.getParameter());
		varParameterEClass.getESuperTypes().add(this.getVARVariable());
		actualDataTypeEClass.getESuperTypes().add(theCorePackage.getGenericType());
		actualDataTypeEClass.getESuperTypes().add(this.getGenericElement());
		actualBAGTypeEClass.getESuperTypes().add(this.getActualAggregationType());

		// Initialize classes and features; add operations and parameters
		initEClass(actualTypeConstraintEClass, ActualTypeConstraint.class, "ActualTypeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualTypeConstraint_MatchingType(), theCorePackage.getGenericType(), theCorePackage.getGenericType_Constraint(), "matchingType", null, 1, 1, ActualTypeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActualTypeConstraint_RequiredType(), this.getActualDataType(), null, "requiredType", null, 1, 1, ActualTypeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActualTypeConstraint_Label(), theCorePackage.getIdentifier(), "label", null, 1, 1, ActualTypeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionResultEClass, FunctionResult.class, "FunctionResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Result(), this.getFunctionResult(), null, "result", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inParameterEClass, InParameter.class, "InParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInParameter_Variable(), this.getInVariable(), this.getInVariable_Source(), "variable", null, 1, 1, InParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalVariable_InitialValue(), theCorePackage.getExpression(), null, "initialValue", null, 0, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actualStructureEClass, ActualStructure.class, "ActualStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actualGenericTypeEClass, ActualGenericType.class, "ActualGenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualGenericType_RefersTo(), this.getActualDataType(), null, "refersTo", null, 1, 1, ActualGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActualGenericType_IsEntity(), theMofPackage.getBoolean(), "isEntity", null, 1, 1, ActualGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActualGenericType_Label(), theCorePackage.getIdentifier(), "label", null, 1, 1, ActualGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_InBlock(), theStatementsPackage.getStatementBlock(), theStatementsPackage.getStatementBlock_BodyStatements_Statement(), "inBlock", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStatement_BodyStatementsSkipStatement(), theStatementsPackage.getSkipStatement(), null, "bodyStatementsSkipStatement", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStatement_BodyStatementsEscapeStatement(), theStatementsPackage.getEscapeStatement(), null, "bodyStatementsEscapeStatement", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStatement_ControlledBy(), theStatementsPackage.getRepeatStatement(), theStatementsPackage.getRepeatStatement_Body(), "controlledBy", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStatement_Implements(), this.getAlgorithm(), this.getAlgorithm_Body(), "implements", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStatement_Text(), theCorePackage.getExpressText(), "text", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(namedVariableEClass, NamedVariable.class, "NamedVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedVariable_VariableType(), theCorePackage.getVariableType(), null, "variableType", null, 1, 1, NamedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inVariableEClass, InVariable.class, "InVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInVariable_Source(), this.getInParameter(), this.getInParameter_Variable(), "source", null, 1, 1, InVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actualARRAYTypeEClass, ActualARRAYType.class, "ActualARRAYType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualARRAYType_HiIndex(), theCorePackage.getArrayBound(), null, "hiIndex", null, 1, 1, ActualARRAYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActualARRAYType_LoIndex(), theCorePackage.getArrayBound(), null, "loIndex", null, 1, 1, ActualARRAYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActualARRAYType_IsOptional(), theMofPackage.getBoolean(), "isOptional", null, 1, 1, ActualARRAYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actualSETTypeEClass, ActualSETType.class, "ActualSETType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actualAGGREGATETypeEClass, ActualAGGREGATEType.class, "ActualAGGREGATEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualAGGREGATEType_UpperBound(), theCorePackage.getSizeConstraint(), null, "upperBound", null, 0, 1, ActualAGGREGATEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActualAGGREGATEType_RefersTo(), this.getActualStructure(), null, "refersTo", null, 1, 1, ActualAGGREGATEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActualAGGREGATEType_MemberType(), theCorePackage.getVariableType(), null, "memberType", null, 1, 1, ActualAGGREGATEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActualAGGREGATEType_LowerBound(), theCorePackage.getSizeConstraint(), null, "lowerBound", null, 0, 1, ActualAGGREGATEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActualAGGREGATEType_Label(), theCorePackage.getIdentifier(), "label", null, 1, 1, ActualAGGREGATEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_StructureConstraints(), this.getActualStructureConstraint(), null, "structureConstraints", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_TypeConstraints(), this.getActualTypeConstraint(), null, "typeConstraints", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_FormalParameterType(), theCorePackage.getParameterType(), null, "formalParameterType", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Inout(), theMofPackage.getBoolean(), "inout", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Position(), theMofPackage.getInteger(), "position", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actualStructureConstraintEClass, ActualStructureConstraint.class, "ActualStructureConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualStructureConstraint_MatchingStructure(), theCorePackage.getAGGREGATEType(), theCorePackage.getAGGREGATEType_Constraint(), "matchingStructure", null, 1, 1, ActualStructureConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActualStructureConstraint_RequiredStructure(), this.getActualStructure(), null, "requiredStructure", null, 1, 1, ActualStructureConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActualStructureConstraint_Label(), theCorePackage.getIdentifier(), "label", null, 1, 1, ActualStructureConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(algorithmEClass, Algorithm.class, "Algorithm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgorithm_Body(), this.getStatement(), this.getStatement_Implements(), "body", null, 0, 1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAlgorithm_FormalParameters(), this.getParameter(), null, "formalParameters", null, 0, -1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actualAggregationTypeEClass, ActualAggregationType.class, "ActualAggregationType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualAggregationType_MemberType(), theCorePackage.getActualType(), null, "memberType", null, 1, 1, ActualAggregationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(varVariableEClass, VARVariable.class, "VARVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actualLISTTypeEClass, ActualLISTType.class, "ActualLISTType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericElementEClass, GenericElement.class, "GenericElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericElement_Source(), this.getParameter(), null, "source", null, 1, 1, GenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenericElement_Label(), theCorePackage.getScopedId(), null, "label", null, 1, 1, GenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(varParameterEClass, VARParameter.class, "VARParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actualDataTypeEClass, ActualDataType.class, "ActualDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actualBAGTypeEClass, ActualBAGType.class, "ActualBAGType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //AlgorithmsPackageImpl
