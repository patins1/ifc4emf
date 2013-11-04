/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances.impl;

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
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl;
import org.ifc4emf.metamodel.express.impl.ExpressPackageImpl;
import org.ifc4emf.metamodel.express.instances.ARRAYValue;
import org.ifc4emf.metamodel.express.instances.AggregateValue;
import org.ifc4emf.metamodel.express.instances.ArrayMember;
import org.ifc4emf.metamodel.express.instances.AttributeValue;
import org.ifc4emf.metamodel.express.instances.BAGValue;
import org.ifc4emf.metamodel.express.instances.BagMember;
import org.ifc4emf.metamodel.express.instances.BinaryValue;
import org.ifc4emf.metamodel.express.instances.BooleanValue;
import org.ifc4emf.metamodel.express.instances.ConcreteValue;
import org.ifc4emf.metamodel.express.instances.Constant;
import org.ifc4emf.metamodel.express.instances.EntityInstance;
import org.ifc4emf.metamodel.express.instances.EntityValue;
import org.ifc4emf.metamodel.express.instances.EnumerationItem;
import org.ifc4emf.metamodel.express.instances.GenericAggregate;
import org.ifc4emf.metamodel.express.instances.Indeterminate;
import org.ifc4emf.metamodel.express.instances.InstancesFactory;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.IntegerValue;
import org.ifc4emf.metamodel.express.instances.LISTValue;
import org.ifc4emf.metamodel.express.instances.ListMember;
import org.ifc4emf.metamodel.express.instances.LogicalValue;
import org.ifc4emf.metamodel.express.instances.MultiLeafInstance;
import org.ifc4emf.metamodel.express.instances.NumberValue;
import org.ifc4emf.metamodel.express.instances.PartialEntityValue;
import org.ifc4emf.metamodel.express.instances.Population;
import org.ifc4emf.metamodel.express.instances.RealValue;
import org.ifc4emf.metamodel.express.instances.RoleName;
import org.ifc4emf.metamodel.express.instances.SETValue;
import org.ifc4emf.metamodel.express.instances.SimpleValue;
import org.ifc4emf.metamodel.express.instances.SingleEntityValue;
import org.ifc4emf.metamodel.express.instances.SingleLeafInstance;
import org.ifc4emf.metamodel.express.instances.SpecializedValue;
import org.ifc4emf.metamodel.express.instances.StringValue;
import org.ifc4emf.metamodel.express.instances.TypeName;
import org.ifc4emf.metamodel.express.instances.TypedInstance;
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
public class InstancesPackageImpl extends EPackageImpl implements InstancesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleEntityValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indeterminateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleLeafInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericAggregateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialEntityValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiLeafInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType entityNameEDataType = null;

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
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstancesPackageImpl() {
		super(eNS_URI, InstancesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InstancesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstancesPackage init() {
		if (isInited) return (InstancesPackage)EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI);

		// Obtain or create and register package
		InstancesPackageImpl theInstancesPackage = (InstancesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstancesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstancesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExpressPackageImpl theExpressPackage = (ExpressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressPackage.eNS_URI) instanceof ExpressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressPackage.eNS_URI) : ExpressPackage.eINSTANCE);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		MofPackageImpl theMofPackage = (MofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI) instanceof MofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI) : MofPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		AlgorithmsPackageImpl theAlgorithmsPackage = (AlgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI) instanceof AlgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI) : AlgorithmsPackage.eINSTANCE);

		// Create package meta-data objects
		theInstancesPackage.createPackageContents();
		theExpressPackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theMofPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theLangPackage.createPackageContents();
		theAlgorithmsPackage.createPackageContents();

		// Initialize created meta-data
		theInstancesPackage.initializePackageContents();
		theExpressPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theMofPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theAlgorithmsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstancesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstancesPackage.eNS_URI, theInstancesPackage);
		return theInstancesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValue() {
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValue_ActualValue() {
		return (EReference)attributeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValue_Attribute() {
		return (EReference)attributeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARRAYValue() {
		return arrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARRAYValue_MemberSlot() {
		return (EReference)arrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleName() {
		return roleNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleName_RefersTo() {
		return (EReference)roleNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleName_Represents() {
		return (EReference)roleNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityInstance() {
		return entityInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityInstance_State() {
		return (EReference)entityInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityInstance_InstanceOf() {
		return (EReference)entityInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityInstance_Id() {
		return (EAttribute)entityInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateValue() {
		return aggregateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_ValueExpression() {
		return (EReference)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_ActualValue() {
		return (EReference)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_DataType() {
		return (EReference)constantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalValue() {
		return logicalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedInstance() {
		return typedInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedInstance_SatisfiesType() {
		return (EReference)typedInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListMember() {
		return listMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListMember_MemberValue() {
		return (EReference)listMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListMember_Position() {
		return (EAttribute)listMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagMember() {
		return bagMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagMember_MemberValue() {
		return (EReference)bagMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBagMember_Count() {
		return (EAttribute)bagMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleEntityValue() {
		return singleEntityValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleEntityValue_Equivalent() {
		return (EReference)singleEntityValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleEntityValue_OfType() {
		return (EReference)singleEntityValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleEntityValue_Properties() {
		return (EReference)singleEntityValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndeterminate() {
		return indeterminateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleLeafInstance() {
		return singleLeafInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleLeafInstance_CharacterizingType() {
		return (EReference)singleLeafInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericAggregate() {
		return genericAggregateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryValue() {
		return binaryValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecializedValue() {
		return specializedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecializedValue_FundamentalValue() {
		return (EReference)specializedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAGValue() {
		return bagValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAGValue_MemberSlot() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationItem() {
		return enumerationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationItem_DeclaredIn() {
		return (EReference)enumerationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationItem_Position() {
		return (EAttribute)enumerationItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityValue() {
		return entityValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityValue_CorrespondsTo() {
		return (EReference)entityValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityValue_Describes() {
		return (EReference)entityValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSETValue() {
		return setValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSETValue_MemberValue() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayMember() {
		return arrayMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayMember_MemberValue() {
		return (EReference)arrayMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayMember_Index() {
		return (EAttribute)arrayMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulation() {
		return populationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulation_CompositionEntityInstance() {
		return (EReference)populationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulation_CompositionInstance() {
		return (EReference)populationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulation_GoverningSchema() {
		return (EReference)populationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealValue() {
		return realValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLISTValue() {
		return listValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLISTValue_MemberSlot() {
		return (EReference)listValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeName() {
		return typeNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeName_RefersTo() {
		return (EReference)typeNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeName_Represents() {
		return (EReference)typeNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialEntityValue() {
		return partialEntityValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialEntityValue_Components() {
		return (EReference)partialEntityValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberValue() {
		return numberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiLeafInstance() {
		return multiLeafInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleValue() {
		return simpleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleValue_Name() {
		return (EAttribute)simpleValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteValue() {
		return concreteValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEntityName() {
		return entityNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesFactory getInstancesFactory() {
		return (InstancesFactory)getEFactoryInstance();
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
		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);
		createEReference(attributeValueEClass, ATTRIBUTE_VALUE__ACTUAL_VALUE);
		createEReference(attributeValueEClass, ATTRIBUTE_VALUE__ATTRIBUTE);

		arrayValueEClass = createEClass(ARRAY_VALUE);
		createEReference(arrayValueEClass, ARRAY_VALUE__MEMBER_SLOT);

		roleNameEClass = createEClass(ROLE_NAME);
		createEReference(roleNameEClass, ROLE_NAME__REFERS_TO);
		createEReference(roleNameEClass, ROLE_NAME__REPRESENTS);

		entityInstanceEClass = createEClass(ENTITY_INSTANCE);
		createEReference(entityInstanceEClass, ENTITY_INSTANCE__STATE);
		createEReference(entityInstanceEClass, ENTITY_INSTANCE__INSTANCE_OF);
		createEAttribute(entityInstanceEClass, ENTITY_INSTANCE__ID);

		integerValueEClass = createEClass(INTEGER_VALUE);

		aggregateValueEClass = createEClass(AGGREGATE_VALUE);

		constantEClass = createEClass(CONSTANT);
		createEReference(constantEClass, CONSTANT__VALUE_EXPRESSION);
		createEReference(constantEClass, CONSTANT__ACTUAL_VALUE);
		createEReference(constantEClass, CONSTANT__DATA_TYPE);

		logicalValueEClass = createEClass(LOGICAL_VALUE);

		typedInstanceEClass = createEClass(TYPED_INSTANCE);
		createEReference(typedInstanceEClass, TYPED_INSTANCE__SATISFIES_TYPE);

		listMemberEClass = createEClass(LIST_MEMBER);
		createEReference(listMemberEClass, LIST_MEMBER__MEMBER_VALUE);
		createEAttribute(listMemberEClass, LIST_MEMBER__POSITION);

		bagMemberEClass = createEClass(BAG_MEMBER);
		createEReference(bagMemberEClass, BAG_MEMBER__MEMBER_VALUE);
		createEAttribute(bagMemberEClass, BAG_MEMBER__COUNT);

		singleEntityValueEClass = createEClass(SINGLE_ENTITY_VALUE);
		createEReference(singleEntityValueEClass, SINGLE_ENTITY_VALUE__EQUIVALENT);
		createEReference(singleEntityValueEClass, SINGLE_ENTITY_VALUE__OF_TYPE);
		createEReference(singleEntityValueEClass, SINGLE_ENTITY_VALUE__PROPERTIES);

		indeterminateEClass = createEClass(INDETERMINATE);

		singleLeafInstanceEClass = createEClass(SINGLE_LEAF_INSTANCE);
		createEReference(singleLeafInstanceEClass, SINGLE_LEAF_INSTANCE__CHARACTERIZING_TYPE);

		genericAggregateEClass = createEClass(GENERIC_AGGREGATE);

		binaryValueEClass = createEClass(BINARY_VALUE);

		specializedValueEClass = createEClass(SPECIALIZED_VALUE);
		createEReference(specializedValueEClass, SPECIALIZED_VALUE__FUNDAMENTAL_VALUE);

		bagValueEClass = createEClass(BAG_VALUE);
		createEReference(bagValueEClass, BAG_VALUE__MEMBER_SLOT);

		enumerationItemEClass = createEClass(ENUMERATION_ITEM);
		createEReference(enumerationItemEClass, ENUMERATION_ITEM__DECLARED_IN);
		createEAttribute(enumerationItemEClass, ENUMERATION_ITEM__POSITION);

		entityValueEClass = createEClass(ENTITY_VALUE);
		createEReference(entityValueEClass, ENTITY_VALUE__CORRESPONDS_TO);
		createEReference(entityValueEClass, ENTITY_VALUE__DESCRIBES);

		setValueEClass = createEClass(SET_VALUE);
		createEReference(setValueEClass, SET_VALUE__MEMBER_VALUE);

		arrayMemberEClass = createEClass(ARRAY_MEMBER);
		createEReference(arrayMemberEClass, ARRAY_MEMBER__MEMBER_VALUE);
		createEAttribute(arrayMemberEClass, ARRAY_MEMBER__INDEX);

		populationEClass = createEClass(POPULATION);
		createEReference(populationEClass, POPULATION__COMPOSITION_ENTITY_INSTANCE);
		createEReference(populationEClass, POPULATION__COMPOSITION_INSTANCE);
		createEReference(populationEClass, POPULATION__GOVERNING_SCHEMA);

		realValueEClass = createEClass(REAL_VALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);

		listValueEClass = createEClass(LIST_VALUE);
		createEReference(listValueEClass, LIST_VALUE__MEMBER_SLOT);

		stringValueEClass = createEClass(STRING_VALUE);

		typeNameEClass = createEClass(TYPE_NAME);
		createEReference(typeNameEClass, TYPE_NAME__REFERS_TO);
		createEReference(typeNameEClass, TYPE_NAME__REPRESENTS);

		partialEntityValueEClass = createEClass(PARTIAL_ENTITY_VALUE);
		createEReference(partialEntityValueEClass, PARTIAL_ENTITY_VALUE__COMPONENTS);

		numberValueEClass = createEClass(NUMBER_VALUE);

		multiLeafInstanceEClass = createEClass(MULTI_LEAF_INSTANCE);

		simpleValueEClass = createEClass(SIMPLE_VALUE);
		createEAttribute(simpleValueEClass, SIMPLE_VALUE__NAME);

		concreteValueEClass = createEClass(CONCRETE_VALUE);

		// Create data types
		entityNameEDataType = createEDataType(ENTITY_NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arrayValueEClass.getESuperTypes().add(this.getAggregateValue());
		roleNameEClass.getESuperTypes().add(this.getStringValue());
		entityInstanceEClass.getESuperTypes().add(this.getTypedInstance());
		integerValueEClass.getESuperTypes().add(this.getRealValue());
		aggregateValueEClass.getESuperTypes().add(this.getConcreteValue());
		constantEClass.getESuperTypes().add(theCorePackage.getCommonElement());
		logicalValueEClass.getESuperTypes().add(this.getSimpleValue());
		typedInstanceEClass.getESuperTypes().add(theCorePackage.getInstance());
		indeterminateEClass.getESuperTypes().add(theCorePackage.getInstance());
		singleLeafInstanceEClass.getESuperTypes().add(this.getEntityInstance());
		genericAggregateEClass.getESuperTypes().add(this.getLISTValue());
		binaryValueEClass.getESuperTypes().add(this.getSimpleValue());
		specializedValueEClass.getESuperTypes().add(this.getTypedInstance());
		bagValueEClass.getESuperTypes().add(this.getAggregateValue());
		enumerationItemEClass.getESuperTypes().add(theCorePackage.getTypeElement());
		enumerationItemEClass.getESuperTypes().add(this.getTypedInstance());
		enumerationItemEClass.getESuperTypes().add(this.getConcreteValue());
		entityValueEClass.getESuperTypes().add(this.getPartialEntityValue());
		setValueEClass.getESuperTypes().add(this.getAggregateValue());
		realValueEClass.getESuperTypes().add(this.getNumberValue());
		booleanValueEClass.getESuperTypes().add(this.getLogicalValue());
		listValueEClass.getESuperTypes().add(theCorePackage.getInstance());
		listValueEClass.getESuperTypes().add(this.getAggregateValue());
		stringValueEClass.getESuperTypes().add(this.getSimpleValue());
		typeNameEClass.getESuperTypes().add(this.getStringValue());
		partialEntityValueEClass.getESuperTypes().add(theCorePackage.getInstance());
		numberValueEClass.getESuperTypes().add(this.getSimpleValue());
		multiLeafInstanceEClass.getESuperTypes().add(this.getEntityInstance());
		simpleValueEClass.getESuperTypes().add(this.getConcreteValue());
		concreteValueEClass.getESuperTypes().add(theCorePackage.getInstance());

		// Initialize classes and features; add operations and parameters
		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValue_ActualValue(), theCorePackage.getInstance(), null, "actualValue", null, 0, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValue_Attribute(), theCorePackage.getExplicitAttribute(), null, "attribute", null, 1, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrayValueEClass, ARRAYValue.class, "ARRAYValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getARRAYValue_MemberSlot(), this.getArrayMember(), null, "memberSlot", null, 1, -1, ARRAYValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roleNameEClass, RoleName.class, "RoleName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleName_RefersTo(), theCorePackage.getAttribute(), null, "refersTo", null, 1, 1, RoleName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoleName_Represents(), theCorePackage.getScopedId(), null, "represents", null, 1, 1, RoleName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(entityInstanceEClass, EntityInstance.class, "EntityInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityInstance_State(), this.getEntityValue(), this.getEntityValue_Describes(), "state", null, 1, 1, EntityInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityInstance_InstanceOf(), theCorePackage.getEntityType(), null, "instanceOf", null, 1, -1, EntityInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEntityInstance_Id(), this.getEntityName(), "id", null, 1, 1, EntityInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregateValueEClass, AggregateValue.class, "AggregateValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstant_ValueExpression(), theCorePackage.getExpression(), null, "valueExpression", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstant_ActualValue(), theCorePackage.getInstance(), null, "actualValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstant_DataType(), theCorePackage.getInstantiableType(), null, "dataType", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(logicalValueEClass, LogicalValue.class, "LogicalValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedInstanceEClass, TypedInstance.class, "TypedInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedInstance_SatisfiesType(), theCorePackage.getSelectType(), null, "satisfiesType", null, 0, -1, TypedInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(listMemberEClass, ListMember.class, "ListMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListMember_MemberValue(), theCorePackage.getInstance(), null, "memberValue", null, 1, 1, ListMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getListMember_Position(), theMofPackage.getInteger(), "position", null, 1, 1, ListMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bagMemberEClass, BagMember.class, "BagMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBagMember_MemberValue(), theCorePackage.getInstance(), null, "memberValue", null, 1, 1, BagMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBagMember_Count(), theMofPackage.getInteger(), "count", null, 1, 1, BagMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(singleEntityValueEClass, SingleEntityValue.class, "SingleEntityValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleEntityValue_Equivalent(), this.getPartialEntityValue(), null, "equivalent", null, 1, 1, SingleEntityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSingleEntityValue_OfType(), theCorePackage.getSingleEntityType(), null, "ofType", null, 1, 1, SingleEntityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSingleEntityValue_Properties(), this.getAttributeValue(), null, "properties", null, 0, -1, SingleEntityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(indeterminateEClass, Indeterminate.class, "Indeterminate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleLeafInstanceEClass, SingleLeafInstance.class, "SingleLeafInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleLeafInstance_CharacterizingType(), theCorePackage.getEntityType(), null, "characterizingType", null, 1, 1, SingleLeafInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genericAggregateEClass, GenericAggregate.class, "GenericAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryValueEClass, BinaryValue.class, "BinaryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specializedValueEClass, SpecializedValue.class, "SpecializedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecializedValue_FundamentalValue(), this.getConcreteValue(), null, "fundamentalValue", null, 1, 1, SpecializedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bagValueEClass, BAGValue.class, "BAGValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBAGValue_MemberSlot(), this.getBagMember(), null, "memberSlot", null, 0, -1, BAGValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumerationItemEClass, EnumerationItem.class, "EnumerationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationItem_DeclaredIn(), theCorePackage.getEnumerationType(), theCorePackage.getEnumerationType_DeclaredItems(), "declaredIn", null, 1, 1, EnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEnumerationItem_Position(), theMofPackage.getInteger(), "position", null, 1, 1, EnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(entityValueEClass, EntityValue.class, "EntityValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityValue_CorrespondsTo(), theCorePackage.getEntityType(), null, "correspondsTo", null, 1, -1, EntityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntityValue_Describes(), this.getEntityInstance(), this.getEntityInstance_State(), "describes", null, 0, -1, EntityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setValueEClass, SETValue.class, "SETValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSETValue_MemberValue(), theCorePackage.getInstance(), null, "memberValue", null, 0, -1, SETValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrayMemberEClass, ArrayMember.class, "ArrayMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayMember_MemberValue(), theCorePackage.getInstance(), null, "memberValue", null, 0, 1, ArrayMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArrayMember_Index(), theMofPackage.getInteger(), "index", null, 1, 1, ArrayMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(populationEClass, Population.class, "Population", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPopulation_CompositionEntityInstance(), this.getEntityInstance(), null, "compositionEntityInstance", null, 0, -1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPopulation_CompositionInstance(), theCorePackage.getInstance(), theCorePackage.getInstance_AppearsInPopulation(), "compositionInstance", null, 0, -1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPopulation_GoverningSchema(), theCorePackage.getSchema(), null, "governingSchema", null, 0, -1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(realValueEClass, RealValue.class, "RealValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listValueEClass, LISTValue.class, "LISTValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLISTValue_MemberSlot(), this.getListMember(), null, "memberSlot", null, 0, -1, LISTValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeNameEClass, TypeName.class, "TypeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeName_RefersTo(), theCorePackage.getNamedType(), null, "refersTo", null, 1, 1, TypeName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypeName_Represents(), theCorePackage.getScopedId(), null, "represents", null, 1, 1, TypeName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(partialEntityValueEClass, PartialEntityValue.class, "PartialEntityValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialEntityValue_Components(), this.getSingleEntityValue(), null, "components", null, 1, -1, PartialEntityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numberValueEClass, NumberValue.class, "NumberValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiLeafInstanceEClass, MultiLeafInstance.class, "MultiLeafInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleValueEClass, SimpleValue.class, "SimpleValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleValue_Name(), theMofPackage.getString(), "name", null, 1, 1, SimpleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(concreteValueEClass, ConcreteValue.class, "ConcreteValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(entityNameEDataType, String.class, "EntityName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //InstancesPackageImpl
