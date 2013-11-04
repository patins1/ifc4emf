/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.java.lang.impl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ifc4emf.metamodel.express.ExpressPackage;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.impl.CorePackageImpl;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.impl.ExpressionsPackageImpl;
import org.ifc4emf.metamodel.express.impl.ExpressPackageImpl;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;
import org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl;
import org.ifc4emf.metamodel.express.java.lang.LangFactory;
import org.ifc4emf.metamodel.express.java.lang.LangPackage;
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
public class LangPackageImpl extends EPackageImpl implements LangPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voidEDataType = null;

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
	 * @see org.ifc4emf.metamodel.express.java.lang.LangPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LangPackageImpl() {
		super(eNS_URI, LangFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LangPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LangPackage init() {
		if (isInited) return (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);

		// Obtain or create and register package
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LangPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExpressPackageImpl theExpressPackage = (ExpressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressPackage.eNS_URI) instanceof ExpressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressPackage.eNS_URI) : ExpressPackage.eINSTANCE);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		MofPackageImpl theMofPackage = (MofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI) instanceof MofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI) : MofPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		AlgorithmsPackageImpl theAlgorithmsPackage = (AlgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI) instanceof AlgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgorithmsPackage.eNS_URI) : AlgorithmsPackage.eINSTANCE);
		InstancesPackageImpl theInstancesPackage = (InstancesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI) instanceof InstancesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI) : InstancesPackage.eINSTANCE);

		// Create package meta-data objects
		theLangPackage.createPackageContents();
		theExpressPackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theMofPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theAlgorithmsPackage.createPackageContents();
		theInstancesPackage.createPackageContents();

		// Initialize created meta-data
		theLangPackage.initializePackageContents();
		theExpressPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theMofPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAlgorithmsPackage.initializePackageContents();
		theInstancesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLangPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LangPackage.eNS_URI, theLangPackage);
		return theLangPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getint() {
		return intEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getvoid() {
		return voidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangFactory getLangFactory() {
		return (LangFactory)getEFactoryInstance();
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

		// Create data types
		intEDataType = createEDataType(INT);
		voidEDataType = createEDataType(VOID);
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

		// Initialize data types
		initEDataType(intEDataType, Integer.class, "int", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(voidEDataType, Void.class, "void", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //LangPackageImpl
