/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ifc4emf.metamodel.express.ExpressPackage;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl;
import org.ifc4emf.metamodel.express.core.AGGREGATEType;
import org.ifc4emf.metamodel.express.core.ARRAYType;
import org.ifc4emf.metamodel.express.core.ActualType;
import org.ifc4emf.metamodel.express.core.AggregationType;
import org.ifc4emf.metamodel.express.core.AlgorithmScope;
import org.ifc4emf.metamodel.express.core.AnonymousType;
import org.ifc4emf.metamodel.express.core.ArrayBound;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.BAGType;
import org.ifc4emf.metamodel.express.core.BinaryType;
import org.ifc4emf.metamodel.express.core.CommonElement;
import org.ifc4emf.metamodel.express.core.ConcreteAggregationType;
import org.ifc4emf.metamodel.express.core.ConcreteType;
import org.ifc4emf.metamodel.express.core.CoreFactory;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DataType;
import org.ifc4emf.metamodel.express.core.DefinedType;
import org.ifc4emf.metamodel.express.core.DerivedAttribute;
import org.ifc4emf.metamodel.express.core.DomainConstraint;
import org.ifc4emf.metamodel.express.core.DomainRole;
import org.ifc4emf.metamodel.express.core.DomainRule;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.EnumerationType;
import org.ifc4emf.metamodel.express.core.ExplicitAttribute;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.GeneralARRAYType;
import org.ifc4emf.metamodel.express.core.GeneralAggregationType;
import org.ifc4emf.metamodel.express.core.GeneralBAGType;
import org.ifc4emf.metamodel.express.core.GeneralLISTType;
import org.ifc4emf.metamodel.express.core.GeneralSETType;
import org.ifc4emf.metamodel.express.core.GeneralizedType;
import org.ifc4emf.metamodel.express.core.GenericType;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.InstantiableType;
import org.ifc4emf.metamodel.express.core.InterfacedElement;
import org.ifc4emf.metamodel.express.core.InverseAttribute;
import org.ifc4emf.metamodel.express.core.InvertibleAttribute;
import org.ifc4emf.metamodel.express.core.LISTType;
import org.ifc4emf.metamodel.express.core.LengthConstraint;
import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.LocalScope;
import org.ifc4emf.metamodel.express.core.LogicType;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.NamedType;
import org.ifc4emf.metamodel.express.core.NumericType;
import org.ifc4emf.metamodel.express.core.ParameterType;
import org.ifc4emf.metamodel.express.core.PartialEntityType;
import org.ifc4emf.metamodel.express.core.RangeRole;
import org.ifc4emf.metamodel.express.core.RealType;
import org.ifc4emf.metamodel.express.core.Redeclaration;
import org.ifc4emf.metamodel.express.core.Relationship;
import org.ifc4emf.metamodel.express.core.Remark;
import org.ifc4emf.metamodel.express.core.Role;
import org.ifc4emf.metamodel.express.core.SETType;
import org.ifc4emf.metamodel.express.core.Schema;
import org.ifc4emf.metamodel.express.core.SchemaElement;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.core.ScopedId;
import org.ifc4emf.metamodel.express.core.SelectType;
import org.ifc4emf.metamodel.express.core.SimpleType;
import org.ifc4emf.metamodel.express.core.SingleEntityType;
import org.ifc4emf.metamodel.express.core.SizeConstraint;
import org.ifc4emf.metamodel.express.core.SpecializedType;
import org.ifc4emf.metamodel.express.core.StringType;
import org.ifc4emf.metamodel.express.core.TypeElement;
import org.ifc4emf.metamodel.express.core.UniqueRule;
import org.ifc4emf.metamodel.express.core.VariableType;
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
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalBAGTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalAggregationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalSETTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invertibleAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfacedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantiableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalLISTTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remarkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalARRAYTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopedIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explicitAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteAggregationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keywordEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType expressTextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orderingKindEDataType = null;

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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExpressPackageImpl theExpressPackage = (ExpressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressPackage.eNS_URI) instanceof ExpressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressPackage.eNS_URI) : ExpressPackage.eINSTANCE);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		MofPackageImpl theMofPackage = (MofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI) instanceof MofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI) : MofPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		AlgorithmsPackageImpl theAlgorithmsPackage = (AlgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI) instanceof AlgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI) : AlgorithmsPackage.eINSTANCE);
		InstancesPackageImpl theInstancesPackage = (InstancesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI) instanceof InstancesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI) : InstancesPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theExpressPackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theMofPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theAlgorithmsPackage.createPackageContents();
		theInstancesPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theExpressPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theMofPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theAlgorithmsPackage.initializePackageContents();
		theInstancesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeElement() {
		return typeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleEntityType() {
		return singleEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleEntityType_DeclaresExplicitAttribute() {
		return (EReference)singleEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleEntityType_DeclaresAttribute() {
		return (EReference)singleEntityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleEntityType_DeclaredIn() {
		return (EReference)singleEntityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleEntityType_Equivalent() {
		return (EReference)singleEntityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleEntityType_Id() {
		return (EReference)singleEntityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAGGREGATEType() {
		return aggregateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAGGREGATEType_UpperBound() {
		return (EReference)aggregateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAGGREGATEType_MemberType() {
		return (EReference)aggregateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAGGREGATEType_Constraint() {
		return (EReference)aggregateTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAGGREGATEType_LowerBound() {
		return (EReference)aggregateTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralBAGType() {
		return generalBAGTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainRule() {
		return domainRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainRule_Position() {
		return (EAttribute)domainRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralAggregationType() {
		return generalAggregationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralAggregationType_MemberType() {
		return (EReference)generalAggregationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteType() {
		return concreteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Evaluation() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_InterpretationContext() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_DataType() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Text() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseAttribute() {
		return inverseAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseAttribute_ModelsRole() {
		return (EReference)inverseAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseAttribute_Explicit() {
		return (EReference)inverseAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInverseAttribute_IsUnique() {
		return (EAttribute)inverseAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationType() {
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationType_Values() {
		return (EReference)enumerationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationType_DeclaredItems() {
		return (EReference)enumerationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationType_Extension() {
		return (EReference)enumerationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationType_Base() {
		return (EReference)enumerationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_IsExtensible() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableType() {
		return variableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayBound() {
		return arrayBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayBound_BoundExpression() {
		return (EReference)arrayBoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayBound_Bound() {
		return (EAttribute)arrayBoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralSETType() {
		return generalSETTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLISTType() {
		return listTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedeclaration() {
		return redeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedeclaration_Derivation() {
		return (EReference)redeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedeclaration_RestrictedType() {
		return (EReference)redeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedeclaration_Refines() {
		return (EReference)redeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedeclaration_UpperBound() {
		return (EReference)redeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedeclaration_LowerBound() {
		return (EReference)redeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedeclaration_Scope() {
		return (EReference)redeclarationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedeclaration_OriginalAttribute() {
		return (EReference)redeclarationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedeclaration_RefinedRole() {
		return (EReference)redeclarationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedeclaration_Position() {
		return (EAttribute)redeclarationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedeclaration_IsMandatory() {
		return (EAttribute)redeclarationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedeclaration_Alias() {
		return (EReference)redeclarationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityType() {
		return entityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_PlaysRole() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_Redeclarations() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_Attributes() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_PlaysRangeRole() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_Declares() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_Extension() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_InvertibleAttributes() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_PlaysDomainRole() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_UniqueRules() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_UsedIn() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_SubtypeOf() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityType_IsAbstract() {
		return (EAttribute)entityTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Instances() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialEntityType() {
		return partialEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialEntityType_Components() {
		return (EReference)partialEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Documentation() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Interfaces() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_SchemaElements() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_InterfacedElements() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Name() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Version() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvertibleAttribute() {
		return invertibleAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvertibleAttribute_Inverse() {
		return (EReference)invertibleAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvertibleAttribute_RangeType() {
		return (EReference)invertibleAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvertibleAttribute_CreatesRelationship() {
		return (EReference)invertibleAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvertibleAttribute_ReferencingType() {
		return (EReference)invertibleAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvertibleAttribute_ModelsRole() {
		return (EReference)invertibleAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizedType() {
		return generalizedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizedType_OccursIn() {
		return (EReference)generalizedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfacedElement() {
		return interfacedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacedElement_InterfacingSchema() {
		return (EReference)interfacedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacedElement_RefersTo() {
		return (EReference)interfacedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfacedElement_IsUSE() {
		return (EAttribute)interfacedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacedElement_InterfacedId() {
		return (EReference)interfacedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericType() {
		return numericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinedType() {
		return definedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueRule() {
		return uniqueRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniqueRule_Domain() {
		return (EReference)uniqueRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniqueRule_KeyComponent() {
		return (EReference)uniqueRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniqueRule_Position() {
		return (EAttribute)uniqueRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainRole() {
		return domainRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainRole_RangeView() {
		return (EReference)domainRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainRole_Domain() {
		return (EReference)domainRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainRole_Id() {
		return (EReference)domainRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainConstraint() {
		return domainConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainConstraint_Domain() {
		return (EReference)domainConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainConstraint_Asserts() {
		return (EReference)domainConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantiableType() {
		return instantiableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiableType_FundamentalType() {
		return (EReference)instantiableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralLISTType() {
		return generalLISTTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_Namespace() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_Documentation() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_Id() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_AttributeType() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_OfEntity() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsAbstract() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Position() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_OwningEntity() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAGType() {
		return bagTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealType() {
		return realTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Precision() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicType() {
		return logicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericType() {
		return genericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType_Constraint() {
		return (EReference)genericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericType_IsEntity() {
		return (EAttribute)genericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringType() {
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringType_StringLengthConstraint() {
		return (EReference)stringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousType() {
		return anonymousTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnonymousType_Specializes() {
		return (EReference)anonymousTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithmScope() {
		return algorithmScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmScope_CommonElements() {
		return (EReference)algorithmScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmScope_Variables() {
		return (EReference)algorithmScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_AppearsInPopulation() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_OfType() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Role() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Constraints() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedAttribute() {
		return derivedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedAttribute_Derivation() {
		return (EReference)derivedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeRole() {
		return rangeRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeRole_DomainView() {
		return (EReference)rangeRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeRole_Range() {
		return (EReference)rangeRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeRole_Id() {
		return (EReference)rangeRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalElement() {
		return localElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemark() {
		return remarkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemark_DescribesSchema() {
		return (EReference)remarkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemark_AppearsIn() {
		return (EReference)remarkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemark_DescribesElement() {
		return (EReference)remarkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemark_IsTagged() {
		return (EAttribute)remarkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemark_IsTail() {
		return (EAttribute)remarkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemark_Text() {
		return (EAttribute)remarkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizeConstraint() {
		return sizeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizeConstraint_Bound() {
		return (EAttribute)sizeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_InRelationship() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_OfEntity() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_UpperBound() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_LowerBound() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSETType() {
		return setTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecializedType() {
		return specializedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecializedType_UnderlyingType() {
		return (EReference)specializedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralARRAYType() {
		return generalARRAYTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralARRAYType_HiIndex() {
		return (EReference)generalARRAYTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralARRAYType_LoIndex() {
		return (EReference)generalARRAYTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralARRAYType_IsOptional() {
		return (EAttribute)generalARRAYTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Domain() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Roles() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_BasedOn() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Range() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthConstraint() {
		return lengthConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthConstraint_MaxLength() {
		return (EAttribute)lengthConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthConstraint_IsFixed() {
		return (EAttribute)lengthConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalScope() {
		return localScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalScope_LocalElements() {
		return (EReference)localScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedType() {
		return namedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedType_Instantiates() {
		return (EReference)namedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedType_DomainRules() {
		return (EReference)namedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryType() {
		return binaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryLengthConstraint() {
		return (EReference)binaryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopedId() {
		return scopedIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopedId_LocalName() {
		return (EAttribute)scopedIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopedId_DefiningScope() {
		return (EReference)scopedIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationType() {
		return aggregationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationType_LowerBound() {
		return (EReference)aggregationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationType_UpperBound() {
		return (EReference)aggregationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationType_IsUnique() {
		return (EAttribute)aggregationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationType_Ordering() {
		return (EAttribute)aggregationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScope() {
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_NamedElements() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_IncludesRemarks() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterType_Contains() {
		return (EReference)parameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectType() {
		return selectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectType_AllowedTypes() {
		return (EReference)selectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectType_Extension() {
		return (EReference)selectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectType_Base() {
		return (EReference)selectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectType_SelectList() {
		return (EReference)selectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectType_IsExtensible() {
		return (EAttribute)selectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectType_IsEntity() {
		return (EAttribute)selectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualType() {
		return actualTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualType_Scope() {
		return (EReference)actualTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplicitAttribute() {
		return explicitAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExplicitAttribute_IsOptional() {
		return (EAttribute)explicitAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleType() {
		return simpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Id() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonElement() {
		return commonElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonElement_LocalScope() {
		return (EReference)commonElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaElement() {
		return schemaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaElement_ReferencedAs() {
		return (EReference)schemaElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaElement_ReferencedIn() {
		return (EReference)schemaElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaElement_DefinedIn() {
		return (EReference)schemaElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteAggregationType() {
		return concreteAggregationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteAggregationType_MemberType() {
		return (EReference)concreteAggregationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARRAYType() {
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARRAYType_LoIndex() {
		return (EReference)arrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARRAYType_HiIndex() {
		return (EReference)arrayTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getARRAYType_IsOptional() {
		return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKeyword() {
		return keywordEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExpressText() {
		return expressTextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentifier() {
		return identifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOrderingKind() {
		return orderingKindEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		typeElementEClass = createEClass(TYPE_ELEMENT);

		singleEntityTypeEClass = createEClass(SINGLE_ENTITY_TYPE);
		createEReference(singleEntityTypeEClass, SINGLE_ENTITY_TYPE__DECLARES_EXPLICIT_ATTRIBUTE);
		createEReference(singleEntityTypeEClass, SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE);
		createEReference(singleEntityTypeEClass, SINGLE_ENTITY_TYPE__DECLARED_IN);
		createEReference(singleEntityTypeEClass, SINGLE_ENTITY_TYPE__EQUIVALENT);
		createEReference(singleEntityTypeEClass, SINGLE_ENTITY_TYPE__ID);

		aggregateTypeEClass = createEClass(AGGREGATE_TYPE);
		createEReference(aggregateTypeEClass, AGGREGATE_TYPE__UPPER_BOUND);
		createEReference(aggregateTypeEClass, AGGREGATE_TYPE__MEMBER_TYPE);
		createEReference(aggregateTypeEClass, AGGREGATE_TYPE__CONSTRAINT);
		createEReference(aggregateTypeEClass, AGGREGATE_TYPE__LOWER_BOUND);

		generalBAGTypeEClass = createEClass(GENERAL_BAG_TYPE);

		domainRuleEClass = createEClass(DOMAIN_RULE);
		createEAttribute(domainRuleEClass, DOMAIN_RULE__POSITION);

		generalAggregationTypeEClass = createEClass(GENERAL_AGGREGATION_TYPE);
		createEReference(generalAggregationTypeEClass, GENERAL_AGGREGATION_TYPE__MEMBER_TYPE);

		concreteTypeEClass = createEClass(CONCRETE_TYPE);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__EVALUATION);
		createEReference(expressionEClass, EXPRESSION__INTERPRETATION_CONTEXT);
		createEReference(expressionEClass, EXPRESSION__DATA_TYPE);
		createEAttribute(expressionEClass, EXPRESSION__TEXT);

		inverseAttributeEClass = createEClass(INVERSE_ATTRIBUTE);
		createEReference(inverseAttributeEClass, INVERSE_ATTRIBUTE__MODELS_ROLE);
		createEReference(inverseAttributeEClass, INVERSE_ATTRIBUTE__EXPLICIT);
		createEAttribute(inverseAttributeEClass, INVERSE_ATTRIBUTE__IS_UNIQUE);

		enumerationTypeEClass = createEClass(ENUMERATION_TYPE);
		createEReference(enumerationTypeEClass, ENUMERATION_TYPE__VALUES);
		createEReference(enumerationTypeEClass, ENUMERATION_TYPE__DECLARED_ITEMS);
		createEReference(enumerationTypeEClass, ENUMERATION_TYPE__EXTENSION);
		createEReference(enumerationTypeEClass, ENUMERATION_TYPE__BASE);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__IS_EXTENSIBLE);

		variableTypeEClass = createEClass(VARIABLE_TYPE);

		arrayBoundEClass = createEClass(ARRAY_BOUND);
		createEReference(arrayBoundEClass, ARRAY_BOUND__BOUND_EXPRESSION);
		createEAttribute(arrayBoundEClass, ARRAY_BOUND__BOUND);

		generalSETTypeEClass = createEClass(GENERAL_SET_TYPE);

		listTypeEClass = createEClass(LIST_TYPE);

		redeclarationEClass = createEClass(REDECLARATION);
		createEReference(redeclarationEClass, REDECLARATION__DERIVATION);
		createEReference(redeclarationEClass, REDECLARATION__RESTRICTED_TYPE);
		createEReference(redeclarationEClass, REDECLARATION__REFINES);
		createEReference(redeclarationEClass, REDECLARATION__UPPER_BOUND);
		createEReference(redeclarationEClass, REDECLARATION__LOWER_BOUND);
		createEReference(redeclarationEClass, REDECLARATION__SCOPE);
		createEReference(redeclarationEClass, REDECLARATION__ORIGINAL_ATTRIBUTE);
		createEReference(redeclarationEClass, REDECLARATION__REFINED_ROLE);
		createEAttribute(redeclarationEClass, REDECLARATION__POSITION);
		createEAttribute(redeclarationEClass, REDECLARATION__IS_MANDATORY);
		createEReference(redeclarationEClass, REDECLARATION__ALIAS);

		entityTypeEClass = createEClass(ENTITY_TYPE);
		createEReference(entityTypeEClass, ENTITY_TYPE__PLAYS_ROLE);
		createEReference(entityTypeEClass, ENTITY_TYPE__REDECLARATIONS);
		createEReference(entityTypeEClass, ENTITY_TYPE__ATTRIBUTES);
		createEReference(entityTypeEClass, ENTITY_TYPE__PLAYS_RANGE_ROLE);
		createEReference(entityTypeEClass, ENTITY_TYPE__DECLARES);
		createEReference(entityTypeEClass, ENTITY_TYPE__EXTENSION);
		createEReference(entityTypeEClass, ENTITY_TYPE__INVERTIBLE_ATTRIBUTES);
		createEReference(entityTypeEClass, ENTITY_TYPE__PLAYS_DOMAIN_ROLE);
		createEReference(entityTypeEClass, ENTITY_TYPE__UNIQUE_RULES);
		createEReference(entityTypeEClass, ENTITY_TYPE__USED_IN);
		createEReference(entityTypeEClass, ENTITY_TYPE__SUBTYPE_OF);
		createEAttribute(entityTypeEClass, ENTITY_TYPE__IS_ABSTRACT);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__INSTANCES);

		partialEntityTypeEClass = createEClass(PARTIAL_ENTITY_TYPE);
		createEReference(partialEntityTypeEClass, PARTIAL_ENTITY_TYPE__COMPONENTS);

		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__DOCUMENTATION);
		createEReference(schemaEClass, SCHEMA__INTERFACES);
		createEReference(schemaEClass, SCHEMA__SCHEMA_ELEMENTS);
		createEReference(schemaEClass, SCHEMA__INTERFACED_ELEMENTS);
		createEAttribute(schemaEClass, SCHEMA__NAME);
		createEAttribute(schemaEClass, SCHEMA__VERSION);

		invertibleAttributeEClass = createEClass(INVERTIBLE_ATTRIBUTE);
		createEReference(invertibleAttributeEClass, INVERTIBLE_ATTRIBUTE__INVERSE);
		createEReference(invertibleAttributeEClass, INVERTIBLE_ATTRIBUTE__RANGE_TYPE);
		createEReference(invertibleAttributeEClass, INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP);
		createEReference(invertibleAttributeEClass, INVERTIBLE_ATTRIBUTE__REFERENCING_TYPE);
		createEReference(invertibleAttributeEClass, INVERTIBLE_ATTRIBUTE__MODELS_ROLE);

		generalizedTypeEClass = createEClass(GENERALIZED_TYPE);
		createEReference(generalizedTypeEClass, GENERALIZED_TYPE__OCCURS_IN);

		interfacedElementEClass = createEClass(INTERFACED_ELEMENT);
		createEReference(interfacedElementEClass, INTERFACED_ELEMENT__INTERFACING_SCHEMA);
		createEReference(interfacedElementEClass, INTERFACED_ELEMENT__REFERS_TO);
		createEAttribute(interfacedElementEClass, INTERFACED_ELEMENT__IS_USE);
		createEReference(interfacedElementEClass, INTERFACED_ELEMENT__INTERFACED_ID);

		numericTypeEClass = createEClass(NUMERIC_TYPE);

		definedTypeEClass = createEClass(DEFINED_TYPE);

		uniqueRuleEClass = createEClass(UNIQUE_RULE);
		createEReference(uniqueRuleEClass, UNIQUE_RULE__DOMAIN);
		createEReference(uniqueRuleEClass, UNIQUE_RULE__KEY_COMPONENT);
		createEAttribute(uniqueRuleEClass, UNIQUE_RULE__POSITION);

		domainRoleEClass = createEClass(DOMAIN_ROLE);
		createEReference(domainRoleEClass, DOMAIN_ROLE__RANGE_VIEW);
		createEReference(domainRoleEClass, DOMAIN_ROLE__DOMAIN);
		createEReference(domainRoleEClass, DOMAIN_ROLE__ID);

		domainConstraintEClass = createEClass(DOMAIN_CONSTRAINT);
		createEReference(domainConstraintEClass, DOMAIN_CONSTRAINT__DOMAIN);
		createEReference(domainConstraintEClass, DOMAIN_CONSTRAINT__ASSERTS);

		instantiableTypeEClass = createEClass(INSTANTIABLE_TYPE);
		createEReference(instantiableTypeEClass, INSTANTIABLE_TYPE__FUNDAMENTAL_TYPE);

		generalLISTTypeEClass = createEClass(GENERAL_LIST_TYPE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEReference(namedElementEClass, NAMED_ELEMENT__NAMESPACE);
		createEReference(namedElementEClass, NAMED_ELEMENT__DOCUMENTATION);
		createEReference(namedElementEClass, NAMED_ELEMENT__ID);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTE_TYPE);
		createEReference(attributeEClass, ATTRIBUTE__OF_ENTITY);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_ABSTRACT);
		createEAttribute(attributeEClass, ATTRIBUTE__POSITION);
		createEReference(attributeEClass, ATTRIBUTE__OWNING_ENTITY);

		bagTypeEClass = createEClass(BAG_TYPE);

		realTypeEClass = createEClass(REAL_TYPE);
		createEAttribute(realTypeEClass, REAL_TYPE__PRECISION);

		logicTypeEClass = createEClass(LOGIC_TYPE);

		genericTypeEClass = createEClass(GENERIC_TYPE);
		createEReference(genericTypeEClass, GENERIC_TYPE__CONSTRAINT);
		createEAttribute(genericTypeEClass, GENERIC_TYPE__IS_ENTITY);

		stringTypeEClass = createEClass(STRING_TYPE);
		createEReference(stringTypeEClass, STRING_TYPE__STRING_LENGTH_CONSTRAINT);

		anonymousTypeEClass = createEClass(ANONYMOUS_TYPE);
		createEReference(anonymousTypeEClass, ANONYMOUS_TYPE__SPECIALIZES);

		algorithmScopeEClass = createEClass(ALGORITHM_SCOPE);
		createEReference(algorithmScopeEClass, ALGORITHM_SCOPE__COMMON_ELEMENTS);
		createEReference(algorithmScopeEClass, ALGORITHM_SCOPE__VARIABLES);

		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__APPEARS_IN_POPULATION);
		createEReference(instanceEClass, INSTANCE__OF_TYPE);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__ROLE);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__CONSTRAINTS);

		derivedAttributeEClass = createEClass(DERIVED_ATTRIBUTE);
		createEReference(derivedAttributeEClass, DERIVED_ATTRIBUTE__DERIVATION);

		rangeRoleEClass = createEClass(RANGE_ROLE);
		createEReference(rangeRoleEClass, RANGE_ROLE__DOMAIN_VIEW);
		createEReference(rangeRoleEClass, RANGE_ROLE__RANGE);
		createEReference(rangeRoleEClass, RANGE_ROLE__ID);

		localElementEClass = createEClass(LOCAL_ELEMENT);

		remarkEClass = createEClass(REMARK);
		createEReference(remarkEClass, REMARK__DESCRIBES_SCHEMA);
		createEReference(remarkEClass, REMARK__APPEARS_IN);
		createEReference(remarkEClass, REMARK__DESCRIBES_ELEMENT);
		createEAttribute(remarkEClass, REMARK__IS_TAGGED);
		createEAttribute(remarkEClass, REMARK__IS_TAIL);
		createEAttribute(remarkEClass, REMARK__TEXT);

		sizeConstraintEClass = createEClass(SIZE_CONSTRAINT);
		createEAttribute(sizeConstraintEClass, SIZE_CONSTRAINT__BOUND);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__IN_RELATIONSHIP);
		createEReference(roleEClass, ROLE__OF_ENTITY);
		createEReference(roleEClass, ROLE__UPPER_BOUND);
		createEReference(roleEClass, ROLE__LOWER_BOUND);

		setTypeEClass = createEClass(SET_TYPE);

		specializedTypeEClass = createEClass(SPECIALIZED_TYPE);
		createEReference(specializedTypeEClass, SPECIALIZED_TYPE__UNDERLYING_TYPE);

		generalARRAYTypeEClass = createEClass(GENERAL_ARRAY_TYPE);
		createEReference(generalARRAYTypeEClass, GENERAL_ARRAY_TYPE__HI_INDEX);
		createEReference(generalARRAYTypeEClass, GENERAL_ARRAY_TYPE__LO_INDEX);
		createEAttribute(generalARRAYTypeEClass, GENERAL_ARRAY_TYPE__IS_OPTIONAL);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__DOMAIN);
		createEReference(relationshipEClass, RELATIONSHIP__ROLES);
		createEReference(relationshipEClass, RELATIONSHIP__BASED_ON);
		createEReference(relationshipEClass, RELATIONSHIP__RANGE);

		lengthConstraintEClass = createEClass(LENGTH_CONSTRAINT);
		createEAttribute(lengthConstraintEClass, LENGTH_CONSTRAINT__MAX_LENGTH);
		createEAttribute(lengthConstraintEClass, LENGTH_CONSTRAINT__IS_FIXED);

		localScopeEClass = createEClass(LOCAL_SCOPE);
		createEReference(localScopeEClass, LOCAL_SCOPE__LOCAL_ELEMENTS);

		namedTypeEClass = createEClass(NAMED_TYPE);
		createEReference(namedTypeEClass, NAMED_TYPE__INSTANTIATES);
		createEReference(namedTypeEClass, NAMED_TYPE__DOMAIN_RULES);

		binaryTypeEClass = createEClass(BINARY_TYPE);
		createEReference(binaryTypeEClass, BINARY_TYPE__BINARY_LENGTH_CONSTRAINT);

		scopedIdEClass = createEClass(SCOPED_ID);
		createEAttribute(scopedIdEClass, SCOPED_ID__LOCAL_NAME);
		createEReference(scopedIdEClass, SCOPED_ID__DEFINING_SCOPE);

		aggregationTypeEClass = createEClass(AGGREGATION_TYPE);
		createEReference(aggregationTypeEClass, AGGREGATION_TYPE__LOWER_BOUND);
		createEReference(aggregationTypeEClass, AGGREGATION_TYPE__UPPER_BOUND);
		createEAttribute(aggregationTypeEClass, AGGREGATION_TYPE__IS_UNIQUE);
		createEAttribute(aggregationTypeEClass, AGGREGATION_TYPE__ORDERING);

		scopeEClass = createEClass(SCOPE);
		createEReference(scopeEClass, SCOPE__NAMED_ELEMENTS);
		createEReference(scopeEClass, SCOPE__INCLUDES_REMARKS);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEReference(parameterTypeEClass, PARAMETER_TYPE__CONTAINS);

		selectTypeEClass = createEClass(SELECT_TYPE);
		createEReference(selectTypeEClass, SELECT_TYPE__ALLOWED_TYPES);
		createEReference(selectTypeEClass, SELECT_TYPE__EXTENSION);
		createEReference(selectTypeEClass, SELECT_TYPE__BASE);
		createEReference(selectTypeEClass, SELECT_TYPE__SELECT_LIST);
		createEAttribute(selectTypeEClass, SELECT_TYPE__IS_EXTENSIBLE);
		createEAttribute(selectTypeEClass, SELECT_TYPE__IS_ENTITY);

		actualTypeEClass = createEClass(ACTUAL_TYPE);
		createEReference(actualTypeEClass, ACTUAL_TYPE__SCOPE);

		explicitAttributeEClass = createEClass(EXPLICIT_ATTRIBUTE);
		createEAttribute(explicitAttributeEClass, EXPLICIT_ATTRIBUTE__IS_OPTIONAL);

		simpleTypeEClass = createEClass(SIMPLE_TYPE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__ID);

		commonElementEClass = createEClass(COMMON_ELEMENT);
		createEReference(commonElementEClass, COMMON_ELEMENT__LOCAL_SCOPE);

		schemaElementEClass = createEClass(SCHEMA_ELEMENT);
		createEReference(schemaElementEClass, SCHEMA_ELEMENT__REFERENCED_AS);
		createEReference(schemaElementEClass, SCHEMA_ELEMENT__REFERENCED_IN);
		createEReference(schemaElementEClass, SCHEMA_ELEMENT__DEFINED_IN);

		concreteAggregationTypeEClass = createEClass(CONCRETE_AGGREGATION_TYPE);
		createEReference(concreteAggregationTypeEClass, CONCRETE_AGGREGATION_TYPE__MEMBER_TYPE);

		arrayTypeEClass = createEClass(ARRAY_TYPE);
		createEReference(arrayTypeEClass, ARRAY_TYPE__LO_INDEX);
		createEReference(arrayTypeEClass, ARRAY_TYPE__HI_INDEX);
		createEAttribute(arrayTypeEClass, ARRAY_TYPE__IS_OPTIONAL);

		// Create data types
		keywordEDataType = createEDataType(KEYWORD);
		expressTextEDataType = createEDataType(EXPRESS_TEXT);
		identifierEDataType = createEDataType(IDENTIFIER);
		orderingKindEDataType = createEDataType(ORDERING_KIND);
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
		AlgorithmsPackage theAlgorithmsPackage = (AlgorithmsPackage)EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI);
		MofPackage theMofPackage = (MofPackage)EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI);
		InstancesPackage theInstancesPackage = (InstancesPackage)EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI);
		RulesPackage theRulesPackage = (RulesPackage)EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeElementEClass.getESuperTypes().add(this.getNamedElement());
		aggregateTypeEClass.getESuperTypes().add(this.getGeneralizedType());
		generalBAGTypeEClass.getESuperTypes().add(this.getGeneralAggregationType());
		domainRuleEClass.getESuperTypes().add(this.getDomainConstraint());
		domainRuleEClass.getESuperTypes().add(this.getTypeElement());
		generalAggregationTypeEClass.getESuperTypes().add(this.getGeneralizedType());
		generalAggregationTypeEClass.getESuperTypes().add(this.getAggregationType());
		concreteTypeEClass.getESuperTypes().add(this.getInstantiableType());
		inverseAttributeEClass.getESuperTypes().add(this.getAttribute());
		enumerationTypeEClass.getESuperTypes().add(this.getDefinedType());
		variableTypeEClass.getESuperTypes().add(this.getDataType());
		variableTypeEClass.getESuperTypes().add(this.getAttributeType());
		generalSETTypeEClass.getESuperTypes().add(this.getGeneralAggregationType());
		listTypeEClass.getESuperTypes().add(this.getConcreteAggregationType());
		entityTypeEClass.getESuperTypes().add(this.getNamedType());
		entityTypeEClass.getESuperTypes().add(this.getInstantiableType());
		partialEntityTypeEClass.getESuperTypes().add(this.getDataType());
		schemaEClass.getESuperTypes().add(this.getScope());
		invertibleAttributeEClass.getESuperTypes().add(this.getExplicitAttribute());
		generalizedTypeEClass.getESuperTypes().add(this.getParameterType());
		generalizedTypeEClass.getESuperTypes().add(this.getAttributeType());
		numericTypeEClass.getESuperTypes().add(this.getSimpleType());
		definedTypeEClass.getESuperTypes().add(this.getNamedType());
		definedTypeEClass.getESuperTypes().add(this.getConcreteType());
		uniqueRuleEClass.getESuperTypes().add(this.getTypeElement());
		domainRoleEClass.getESuperTypes().add(this.getRole());
		instantiableTypeEClass.getESuperTypes().add(this.getParameterType());
		instantiableTypeEClass.getESuperTypes().add(this.getVariableType());
		generalLISTTypeEClass.getESuperTypes().add(this.getGeneralAggregationType());
		attributeEClass.getESuperTypes().add(this.getTypeElement());
		bagTypeEClass.getESuperTypes().add(this.getConcreteAggregationType());
		realTypeEClass.getESuperTypes().add(this.getNumericType());
		logicTypeEClass.getESuperTypes().add(this.getSimpleType());
		genericTypeEClass.getESuperTypes().add(this.getGeneralizedType());
		stringTypeEClass.getESuperTypes().add(this.getSimpleType());
		anonymousTypeEClass.getESuperTypes().add(this.getConcreteType());
		anonymousTypeEClass.getESuperTypes().add(this.getInstantiableType());
		algorithmScopeEClass.getESuperTypes().add(this.getLocalScope());
		derivedAttributeEClass.getESuperTypes().add(this.getAttribute());
		rangeRoleEClass.getESuperTypes().add(this.getRole());
		localElementEClass.getESuperTypes().add(this.getNamedElement());
		sizeConstraintEClass.getESuperTypes().add(this.getDomainConstraint());
		setTypeEClass.getESuperTypes().add(this.getConcreteAggregationType());
		specializedTypeEClass.getESuperTypes().add(this.getDefinedType());
		generalARRAYTypeEClass.getESuperTypes().add(this.getGeneralAggregationType());
		lengthConstraintEClass.getESuperTypes().add(this.getDomainConstraint());
		localScopeEClass.getESuperTypes().add(this.getScope());
		namedTypeEClass.getESuperTypes().add(this.getInstantiableType());
		namedTypeEClass.getESuperTypes().add(this.getScope());
		namedTypeEClass.getESuperTypes().add(this.getCommonElement());
		namedTypeEClass.getESuperTypes().add(this.getAttributeType());
		binaryTypeEClass.getESuperTypes().add(this.getSimpleType());
		selectTypeEClass.getESuperTypes().add(this.getDefinedType());
		actualTypeEClass.getESuperTypes().add(this.getVariableType());
		explicitAttributeEClass.getESuperTypes().add(this.getAttribute());
		simpleTypeEClass.getESuperTypes().add(this.getAnonymousType());
		commonElementEClass.getESuperTypes().add(this.getSchemaElement());
		schemaElementEClass.getESuperTypes().add(this.getNamedElement());
		concreteAggregationTypeEClass.getESuperTypes().add(this.getAnonymousType());
		concreteAggregationTypeEClass.getESuperTypes().add(this.getAggregationType());
		arrayTypeEClass.getESuperTypes().add(this.getConcreteAggregationType());

		// Initialize classes and features; add operations and parameters
		initEClass(typeElementEClass, TypeElement.class, "TypeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleEntityTypeEClass, SingleEntityType.class, "SingleEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleEntityType_DeclaresExplicitAttribute(), this.getExplicitAttribute(), null, "declaresExplicitAttribute", null, 0, -1, SingleEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSingleEntityType_DeclaresAttribute(), this.getAttribute(), this.getAttribute_OfEntity(), "declaresAttribute", null, 0, -1, SingleEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSingleEntityType_DeclaredIn(), this.getEntityType(), this.getEntityType_Declares(), "declaredIn", null, 1, 1, SingleEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSingleEntityType_Equivalent(), this.getPartialEntityType(), null, "equivalent", null, 1, 1, SingleEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSingleEntityType_Id(), this.getScopedId(), null, "id", null, 1, 1, SingleEntityType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(aggregateTypeEClass, AGGREGATEType.class, "AGGREGATEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAGGREGATEType_UpperBound(), this.getSizeConstraint(), null, "upperBound", null, 0, 1, AGGREGATEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAGGREGATEType_MemberType(), this.getParameterType(), null, "memberType", null, 1, 1, AGGREGATEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAGGREGATEType_Constraint(), theAlgorithmsPackage.getActualStructureConstraint(), theAlgorithmsPackage.getActualStructureConstraint_MatchingStructure(), "constraint", null, 0, 1, AGGREGATEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAGGREGATEType_LowerBound(), this.getSizeConstraint(), null, "lowerBound", null, 0, 1, AGGREGATEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalBAGTypeEClass, GeneralBAGType.class, "GeneralBAGType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainRuleEClass, DomainRule.class, "DomainRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainRule_Position(), theMofPackage.getInteger(), "position", null, 1, 1, DomainRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalAggregationTypeEClass, GeneralAggregationType.class, "GeneralAggregationType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralAggregationType_MemberType(), this.getGeneralizedType(), null, "memberType", null, 1, 1, GeneralAggregationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(concreteTypeEClass, ConcreteType.class, "ConcreteType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Evaluation(), this.getInstance(), null, "evaluation", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpression_InterpretationContext(), this.getScope(), null, "interpretationContext", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpression_DataType(), this.getDataType(), null, "dataType", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExpression_Text(), this.getExpressText(), "text", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inverseAttributeEClass, InverseAttribute.class, "InverseAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInverseAttribute_ModelsRole(), this.getDomainRole(), this.getDomainRole_RangeView(), "modelsRole", null, 1, 1, InverseAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInverseAttribute_Explicit(), this.getInvertibleAttribute(), this.getInvertibleAttribute_Inverse(), "explicit", null, 1, 1, InverseAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInverseAttribute_IsUnique(), theMofPackage.getBoolean(), "isUnique", null, 1, 1, InverseAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumerationTypeEClass, EnumerationType.class, "EnumerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationType_Values(), theInstancesPackage.getEnumerationItem(), null, "values", null, 0, -1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnumerationType_DeclaredItems(), theInstancesPackage.getEnumerationItem(), theInstancesPackage.getEnumerationItem_DeclaredIn(), "declaredItems", null, 0, -1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnumerationType_Extension(), this.getEnumerationType(), this.getEnumerationType_Base(), "extension", null, 0, -1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnumerationType_Base(), this.getEnumerationType(), this.getEnumerationType_Extension(), "base", null, 1, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEnumerationType_IsExtensible(), theMofPackage.getBoolean(), "isExtensible", null, 1, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variableTypeEClass, VariableType.class, "VariableType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayBoundEClass, ArrayBound.class, "ArrayBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayBound_BoundExpression(), this.getExpression(), null, "boundExpression", null, 1, 1, ArrayBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArrayBound_Bound(), theMofPackage.getInteger(), "bound", null, 0, 1, ArrayBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalSETTypeEClass, GeneralSETType.class, "GeneralSETType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listTypeEClass, LISTType.class, "LISTType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(redeclarationEClass, Redeclaration.class, "Redeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedeclaration_Derivation(), this.getExpression(), null, "derivation", null, 0, 1, Redeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedeclaration_RestrictedType(), this.getAttributeType(), null, "restrictedType", null, 1, 1, Redeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedeclaration_Refines(), this.getRedeclaration(), null, "refines", null, 0, 1, Redeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedeclaration_UpperBound(), this.getSizeConstraint(), null, "upperBound", null, 0, 1, Redeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedeclaration_LowerBound(), this.getSizeConstraint(), null, "lowerBound", null, 0, 1, Redeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedeclaration_Scope(), this.getEntityType(), this.getEntityType_Redeclarations(), "scope", null, 1, 1, Redeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedeclaration_OriginalAttribute(), this.getAttribute(), null, "originalAttribute", null, 1, 1, Redeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedeclaration_RefinedRole(), this.getRole(), null, "refinedRole", null, 0, 1, Redeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRedeclaration_Position(), theMofPackage.getInteger(), "position", null, 1, 1, Redeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRedeclaration_IsMandatory(), theMofPackage.getBoolean(), "isMandatory", null, 0, 1, Redeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedeclaration_Alias(), this.getScopedId(), null, "alias", null, 0, 1, Redeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(entityTypeEClass, EntityType.class, "EntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityType_PlaysRole(), this.getRole(), this.getRole_OfEntity(), "playsRole", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityType_Redeclarations(), this.getRedeclaration(), this.getRedeclaration_Scope(), "redeclarations", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityType_Attributes(), this.getAttribute(), this.getAttribute_OwningEntity(), "attributes", null, 0, -1, EntityType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_PlaysRangeRole(), this.getRangeRole(), this.getRangeRole_Range(), "playsRangeRole", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityType_Declares(), this.getSingleEntityType(), this.getSingleEntityType_DeclaredIn(), "declares", null, 1, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityType_Extension(), theRulesPackage.getExtent(), theRulesPackage.getExtent_ForType(), "extension", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityType_InvertibleAttributes(), this.getInvertibleAttribute(), this.getInvertibleAttribute_ReferencingType(), "invertibleAttributes", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityType_PlaysDomainRole(), this.getDomainRole(), this.getDomainRole_Domain(), "playsDomainRole", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityType_UniqueRules(), this.getUniqueRule(), this.getUniqueRule_Domain(), "uniqueRules", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityType_UsedIn(), this.getInvertibleAttribute(), this.getInvertibleAttribute_RangeType(), "usedIn", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityType_SubtypeOf(), this.getEntityType(), null, "subtypeOf", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEntityType_IsAbstract(), theMofPackage.getBoolean(), "isAbstract", null, 1, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_Instances(), this.getInstance(), this.getInstance_OfType(), "instances", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(partialEntityTypeEClass, PartialEntityType.class, "PartialEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialEntityType_Components(), this.getSingleEntityType(), null, "components", null, 1, -1, PartialEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema_Documentation(), this.getRemark(), this.getRemark_DescribesSchema(), "documentation", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchema_Interfaces(), this.getInterfacedElement(), this.getInterfacedElement_InterfacingSchema(), "interfaces", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchema_SchemaElements(), this.getSchemaElement(), this.getSchemaElement_DefinedIn(), "schemaElements", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchema_InterfacedElements(), this.getSchemaElement(), this.getSchemaElement_ReferencedIn(), "interfacedElements", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchema_Name(), this.getIdentifier(), "name", null, 1, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchema_Version(), this.getIdentifier(), "version", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(invertibleAttributeEClass, InvertibleAttribute.class, "InvertibleAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvertibleAttribute_Inverse(), this.getInverseAttribute(), this.getInverseAttribute_Explicit(), "inverse", null, 0, -1, InvertibleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInvertibleAttribute_RangeType(), this.getEntityType(), this.getEntityType_UsedIn(), "rangeType", null, 1, -1, InvertibleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInvertibleAttribute_CreatesRelationship(), this.getRelationship(), this.getRelationship_BasedOn(), "createsRelationship", null, 1, 1, InvertibleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInvertibleAttribute_ReferencingType(), this.getEntityType(), this.getEntityType_InvertibleAttributes(), "referencingType", null, 1, -1, InvertibleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInvertibleAttribute_ModelsRole(), this.getRangeRole(), this.getRangeRole_DomainView(), "modelsRole", null, 1, 1, InvertibleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalizedTypeEClass, GeneralizedType.class, "GeneralizedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralizedType_OccursIn(), this.getParameterType(), this.getParameterType_Contains(), "occursIn", null, 1, -1, GeneralizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interfacedElementEClass, InterfacedElement.class, "InterfacedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfacedElement_InterfacingSchema(), this.getSchema(), this.getSchema_Interfaces(), "interfacingSchema", null, 1, 1, InterfacedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterfacedElement_RefersTo(), this.getSchemaElement(), this.getSchemaElement_ReferencedAs(), "refersTo", null, 1, 1, InterfacedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfacedElement_IsUSE(), theMofPackage.getBoolean(), "isUSE", null, 1, 1, InterfacedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterfacedElement_InterfacedId(), this.getScopedId(), null, "interfacedId", null, 0, 1, InterfacedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numericTypeEClass, NumericType.class, "NumericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(definedTypeEClass, DefinedType.class, "DefinedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uniqueRuleEClass, UniqueRule.class, "UniqueRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniqueRule_Domain(), this.getEntityType(), this.getEntityType_UniqueRules(), "domain", null, 1, 1, UniqueRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUniqueRule_KeyComponent(), this.getAttribute(), null, "keyComponent", null, 1, -1, UniqueRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUniqueRule_Position(), theMofPackage.getInteger(), "position", null, 1, 1, UniqueRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(domainRoleEClass, DomainRole.class, "DomainRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainRole_RangeView(), this.getInverseAttribute(), this.getInverseAttribute_ModelsRole(), "rangeView", null, 0, 1, DomainRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDomainRole_Domain(), this.getEntityType(), this.getEntityType_PlaysDomainRole(), "domain", null, 1, 1, DomainRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDomainRole_Id(), this.getScopedId(), null, "id", null, 0, 1, DomainRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(domainConstraintEClass, DomainConstraint.class, "DomainConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainConstraint_Domain(), this.getAttributeType(), this.getAttributeType_Constraints(), "domain", null, 1, 1, DomainConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDomainConstraint_Asserts(), this.getExpression(), null, "asserts", null, 0, 1, DomainConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(instantiableTypeEClass, InstantiableType.class, "InstantiableType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstantiableType_FundamentalType(), this.getInstantiableType(), null, "fundamentalType", null, 1, 1, InstantiableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalLISTTypeEClass, GeneralLISTType.class, "GeneralLISTType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedElement_Namespace(), this.getScope(), this.getScope_NamedElements(), "namespace", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_Documentation(), this.getRemark(), this.getRemark_DescribesElement(), "documentation", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_Id(), this.getScopedId(), null, "id", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_AttributeType(), this.getAttributeType(), this.getAttributeType_Role(), "attributeType", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttribute_OfEntity(), this.getSingleEntityType(), this.getSingleEntityType_DeclaresAttribute(), "ofEntity", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttribute_IsAbstract(), theMofPackage.getBoolean(), "isAbstract", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttribute_Position(), theMofPackage.getInteger(), "position", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttribute_OwningEntity(), this.getEntityType(), this.getEntityType_Attributes(), "owningEntity", null, 1, -1, Attribute.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(bagTypeEClass, BAGType.class, "BAGType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realTypeEClass, RealType.class, "RealType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealType_Precision(), theMofPackage.getInteger(), "precision", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(logicTypeEClass, LogicType.class, "LogicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericTypeEClass, GenericType.class, "GenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericType_Constraint(), theAlgorithmsPackage.getActualTypeConstraint(), theAlgorithmsPackage.getActualTypeConstraint_MatchingType(), "constraint", null, 0, 1, GenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenericType_IsEntity(), theMofPackage.getBoolean(), "isEntity", null, 1, 1, GenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringType_StringLengthConstraint(), this.getLengthConstraint(), null, "stringLengthConstraint", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(anonymousTypeEClass, AnonymousType.class, "AnonymousType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnonymousType_Specializes(), this.getAnonymousType(), null, "specializes", null, 0, -1, AnonymousType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(algorithmScopeEClass, AlgorithmScope.class, "AlgorithmScope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgorithmScope_CommonElements(), this.getCommonElement(), this.getCommonElement_LocalScope(), "commonElements", null, 0, -1, AlgorithmScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAlgorithmScope_Variables(), theAlgorithmsPackage.getVariable(), null, "variables", null, 0, -1, AlgorithmScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_AppearsInPopulation(), theInstancesPackage.getPopulation(), theInstancesPackage.getPopulation_CompositionInstance(), "appearsInPopulation", null, 0, -1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstance_OfType(), this.getDataType(), this.getDataType_Instances(), "ofType", null, 1, -1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeType_Role(), this.getAttribute(), this.getAttribute_AttributeType(), "role", null, 0, -1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeType_Constraints(), this.getDomainConstraint(), this.getDomainConstraint_Domain(), "constraints", null, 0, -1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(derivedAttributeEClass, DerivedAttribute.class, "DerivedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedAttribute_Derivation(), this.getExpression(), null, "derivation", null, 1, 1, DerivedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rangeRoleEClass, RangeRole.class, "RangeRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeRole_DomainView(), this.getInvertibleAttribute(), this.getInvertibleAttribute_ModelsRole(), "domainView", null, 1, 1, RangeRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRangeRole_Range(), this.getEntityType(), this.getEntityType_PlaysRangeRole(), "range", null, 1, 1, RangeRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRangeRole_Id(), this.getScopedId(), null, "id", null, 1, 1, RangeRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localElementEClass, LocalElement.class, "LocalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remarkEClass, Remark.class, "Remark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemark_DescribesSchema(), this.getSchema(), this.getSchema_Documentation(), "describesSchema", null, 0, -1, Remark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRemark_AppearsIn(), this.getScope(), this.getScope_IncludesRemarks(), "appearsIn", null, 1, 1, Remark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRemark_DescribesElement(), this.getNamedElement(), this.getNamedElement_Documentation(), "describesElement", null, 0, -1, Remark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRemark_IsTagged(), theMofPackage.getBoolean(), "isTagged", null, 1, 1, Remark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRemark_IsTail(), theMofPackage.getBoolean(), "isTail", null, 1, 1, Remark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRemark_Text(), this.getExpressText(), "text", null, 1, 1, Remark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sizeConstraintEClass, SizeConstraint.class, "SizeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSizeConstraint_Bound(), theMofPackage.getInteger(), "bound", null, 0, 1, SizeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_InRelationship(), this.getRelationship(), this.getRelationship_Roles(), "inRelationship", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_OfEntity(), this.getEntityType(), this.getEntityType_PlaysRole(), "ofEntity", null, 1, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_UpperBound(), this.getSizeConstraint(), null, "upperBound", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_LowerBound(), this.getSizeConstraint(), null, "lowerBound", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setTypeEClass, SETType.class, "SETType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specializedTypeEClass, SpecializedType.class, "SpecializedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecializedType_UnderlyingType(), this.getConcreteType(), null, "underlyingType", null, 1, 1, SpecializedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalARRAYTypeEClass, GeneralARRAYType.class, "GeneralARRAYType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralARRAYType_HiIndex(), this.getArrayBound(), null, "hiIndex", null, 0, 1, GeneralARRAYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralARRAYType_LoIndex(), this.getArrayBound(), null, "loIndex", null, 0, 1, GeneralARRAYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralARRAYType_IsOptional(), theMofPackage.getBoolean(), "isOptional", null, 1, 1, GeneralARRAYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Domain(), this.getDomainRole(), null, "domain", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_Roles(), this.getRole(), this.getRole_InRelationship(), "roles", null, 2, 2, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_BasedOn(), this.getInvertibleAttribute(), this.getInvertibleAttribute_CreatesRelationship(), "basedOn", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_Range(), this.getRangeRole(), null, "range", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lengthConstraintEClass, LengthConstraint.class, "LengthConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLengthConstraint_MaxLength(), theMofPackage.getInteger(), "maxLength", null, 0, 1, LengthConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLengthConstraint_IsFixed(), theMofPackage.getBoolean(), "isFixed", null, 1, 1, LengthConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localScopeEClass, LocalScope.class, "LocalScope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalScope_LocalElements(), this.getLocalElement(), null, "localElements", null, 0, -1, LocalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(namedTypeEClass, NamedType.class, "NamedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedType_Instantiates(), this.getSelectType(), this.getSelectType_AllowedTypes(), "instantiates", null, 0, -1, NamedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedType_DomainRules(), this.getDomainRule(), null, "domainRules", null, 0, -1, NamedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(binaryTypeEClass, BinaryType.class, "BinaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryType_BinaryLengthConstraint(), this.getLengthConstraint(), null, "binaryLengthConstraint", null, 0, 1, BinaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scopedIdEClass, ScopedId.class, "ScopedId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScopedId_LocalName(), this.getIdentifier(), "localName", null, 1, 1, ScopedId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScopedId_DefiningScope(), this.getScope(), null, "definingScope", null, 1, 1, ScopedId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aggregationTypeEClass, AggregationType.class, "AggregationType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregationType_LowerBound(), this.getSizeConstraint(), null, "lowerBound", null, 0, 1, AggregationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAggregationType_UpperBound(), this.getSizeConstraint(), null, "upperBound", null, 0, 1, AggregationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAggregationType_IsUnique(), theMofPackage.getBoolean(), "isUnique", null, 1, 1, AggregationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAggregationType_Ordering(), this.getOrderingKind(), "ordering", null, 1, 1, AggregationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scopeEClass, Scope.class, "Scope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScope_NamedElements(), this.getNamedElement(), this.getNamedElement_Namespace(), "namedElements", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScope_IncludesRemarks(), this.getRemark(), this.getRemark_AppearsIn(), "includesRemarks", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterType_Contains(), this.getGeneralizedType(), this.getGeneralizedType_OccursIn(), "contains", null, 0, -1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(selectTypeEClass, SelectType.class, "SelectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectType_AllowedTypes(), this.getNamedType(), this.getNamedType_Instantiates(), "allowedTypes", null, 0, -1, SelectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSelectType_Extension(), this.getSelectType(), this.getSelectType_Base(), "extension", null, 0, -1, SelectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSelectType_Base(), this.getSelectType(), this.getSelectType_Extension(), "base", null, 1, 1, SelectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSelectType_SelectList(), this.getNamedType(), null, "selectList", null, 0, -1, SelectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelectType_IsExtensible(), theMofPackage.getBoolean(), "isExtensible", null, 1, 1, SelectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelectType_IsEntity(), theMofPackage.getBoolean(), "isEntity", null, 1, 1, SelectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actualTypeEClass, ActualType.class, "ActualType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualType_Scope(), theAlgorithmsPackage.getAlgorithm(), null, "scope", null, 1, 1, ActualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(explicitAttributeEClass, ExplicitAttribute.class, "ExplicitAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExplicitAttribute_IsOptional(), theMofPackage.getBoolean(), "isOptional", null, 1, 1, ExplicitAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleType_Id(), this.getKeyword(), "id", null, 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(commonElementEClass, CommonElement.class, "CommonElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommonElement_LocalScope(), this.getAlgorithmScope(), this.getAlgorithmScope_CommonElements(), "localScope", null, 0, 1, CommonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(schemaElementEClass, SchemaElement.class, "SchemaElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchemaElement_ReferencedAs(), this.getInterfacedElement(), this.getInterfacedElement_RefersTo(), "referencedAs", null, 0, -1, SchemaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchemaElement_ReferencedIn(), this.getSchema(), this.getSchema_InterfacedElements(), "referencedIn", null, 0, -1, SchemaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchemaElement_DefinedIn(), this.getSchema(), this.getSchema_SchemaElements(), "definedIn", null, 0, 1, SchemaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(concreteAggregationTypeEClass, ConcreteAggregationType.class, "ConcreteAggregationType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteAggregationType_MemberType(), this.getInstantiableType(), null, "memberType", null, 1, 1, ConcreteAggregationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrayTypeEClass, ARRAYType.class, "ARRAYType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getARRAYType_LoIndex(), this.getArrayBound(), null, "loIndex", null, 1, 1, ARRAYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getARRAYType_HiIndex(), this.getArrayBound(), null, "hiIndex", null, 1, 1, ARRAYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getARRAYType_IsOptional(), theMofPackage.getBoolean(), "isOptional", null, 1, 1, ARRAYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize data types
		initEDataType(keywordEDataType, String.class, "Keyword", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(expressTextEDataType, String.class, "ExpressText", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(identifierEDataType, String.class, "Identifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(orderingKindEDataType, String.class, "OrderingKind", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //CorePackageImpl
