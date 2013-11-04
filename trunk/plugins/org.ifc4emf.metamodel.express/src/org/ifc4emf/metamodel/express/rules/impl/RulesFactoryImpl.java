/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ifc4emf.metamodel.express.rules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory)EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
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
			case RulesPackage.ONEOF_CONSTRAINT: return createONEOFConstraint();
			case RulesPackage.SUPERTYPE_RULE: return createSupertypeRule();
			case RulesPackage.SUBTYPE_CONSTRAINT: return createSubtypeConstraint();
			case RulesPackage.EXTENT: return createExtent();
			case RulesPackage.TOTAL_OVER_CONSTRAINT: return createTOTAL_OVERConstraint();
			case RulesPackage.AND_CONSTRAINT: return createANDConstraint();
			case RulesPackage.GLOBAL_RULE: return createGlobalRule();
			case RulesPackage.NAMED_RULE: return createNamedRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ONEOFConstraint createONEOFConstraint() {
		ONEOFConstraintImpl oneofConstraint = new ONEOFConstraintImpl();
		return oneofConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupertypeRule createSupertypeRule() {
		SupertypeRuleImpl supertypeRule = new SupertypeRuleImpl();
		return supertypeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtypeConstraint createSubtypeConstraint() {
		SubtypeConstraintImpl subtypeConstraint = new SubtypeConstraintImpl();
		return subtypeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extent createExtent() {
		ExtentImpl extent = new ExtentImpl();
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOTAL_OVERConstraint createTOTAL_OVERConstraint() {
		TOTAL_OVERConstraintImpl totaL_OVERConstraint = new TOTAL_OVERConstraintImpl();
		return totaL_OVERConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDConstraint createANDConstraint() {
		ANDConstraintImpl andConstraint = new ANDConstraintImpl();
		return andConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalRule createGlobalRule() {
		GlobalRuleImpl globalRule = new GlobalRuleImpl();
		return globalRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedRule createNamedRule() {
		NamedRuleImpl namedRule = new NamedRuleImpl();
		return namedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
