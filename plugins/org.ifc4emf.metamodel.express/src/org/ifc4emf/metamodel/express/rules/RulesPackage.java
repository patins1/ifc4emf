/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.rules;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.instances.InstancesPackage;

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
 * @see org.ifc4emf.metamodel.express.rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://express.ecore#//rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "express_rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.rules.impl.SubtypeConstraintImpl <em>Subtype Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.rules.impl.SubtypeConstraintImpl
	 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getSubtypeConstraint()
	 * @generated
	 */
	int SUBTYPE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Constrained Subtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES = 0;

	/**
	 * The feature id for the '<em><b>Equivalent Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_CONSTRAINT__EQUIVALENT_RULE = 1;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_CONSTRAINT__COLLECTION = 2;

	/**
	 * The number of structural features of the '<em>Subtype Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.rules.impl.ONEOFConstraintImpl <em>ONEOF Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.rules.impl.ONEOFConstraintImpl
	 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getONEOFConstraint()
	 * @generated
	 */
	int ONEOF_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Constrained Subtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONEOF_CONSTRAINT__CONSTRAINED_SUBTYPES = SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES;

	/**
	 * The feature id for the '<em><b>Equivalent Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONEOF_CONSTRAINT__EQUIVALENT_RULE = SUBTYPE_CONSTRAINT__EQUIVALENT_RULE;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONEOF_CONSTRAINT__COLLECTION = SUBTYPE_CONSTRAINT__COLLECTION;

	/**
	 * The number of structural features of the '<em>ONEOF Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONEOF_CONSTRAINT_FEATURE_COUNT = SUBTYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.rules.impl.SupertypeRuleImpl <em>Supertype Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.rules.impl.SupertypeRuleImpl
	 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getSupertypeRule()
	 * @generated
	 */
	int SUPERTYPE_RULE = 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERTYPE_RULE__NAMESPACE = CorePackage.COMMON_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERTYPE_RULE__DOCUMENTATION = CorePackage.COMMON_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERTYPE_RULE__ID = CorePackage.COMMON_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERTYPE_RULE__REFERENCED_AS = CorePackage.COMMON_ELEMENT__REFERENCED_AS;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERTYPE_RULE__REFERENCED_IN = CorePackage.COMMON_ELEMENT__REFERENCED_IN;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERTYPE_RULE__DEFINED_IN = CorePackage.COMMON_ELEMENT__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERTYPE_RULE__LOCAL_SCOPE = CorePackage.COMMON_ELEMENT__LOCAL_SCOPE;

	/**
	 * The feature id for the '<em><b>Named Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERTYPE_RULE__NAMED_SUPERTYPE = CorePackage.COMMON_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERTYPE_RULE__CONSTRAINTS = CorePackage.COMMON_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asserts Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERTYPE_RULE__ASSERTS_ABSTRACT = CorePackage.COMMON_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Supertype Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERTYPE_RULE_FEATURE_COUNT = CorePackage.COMMON_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.rules.impl.ExtentImpl <em>Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.rules.impl.ExtentImpl
	 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getExtent()
	 * @generated
	 */
	int EXTENT = 3;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__APPEARS_IN_POPULATION = InstancesPackage.SET_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__OF_TYPE = InstancesPackage.SET_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Member Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__MEMBER_VALUE = InstancesPackage.SET_VALUE__MEMBER_VALUE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__CONSTRAINTS = InstancesPackage.SET_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__CONTENT = InstancesPackage.SET_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Within Population</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__WITHIN_POPULATION = InstancesPackage.SET_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraint Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__CONSTRAINT_RULES = InstancesPackage.SET_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>For Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__FOR_TYPE = InstancesPackage.SET_VALUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__ID = InstancesPackage.SET_VALUE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_FEATURE_COUNT = InstancesPackage.SET_VALUE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.rules.impl.TOTAL_OVERConstraintImpl <em>TOTAL OVER Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.rules.impl.TOTAL_OVERConstraintImpl
	 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getTOTAL_OVERConstraint()
	 * @generated
	 */
	int TOTAL_OVER_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Constrained Subtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_OVER_CONSTRAINT__CONSTRAINED_SUBTYPES = SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES;

	/**
	 * The feature id for the '<em><b>Equivalent Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_OVER_CONSTRAINT__EQUIVALENT_RULE = SUBTYPE_CONSTRAINT__EQUIVALENT_RULE;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_OVER_CONSTRAINT__COLLECTION = SUBTYPE_CONSTRAINT__COLLECTION;

	/**
	 * The number of structural features of the '<em>TOTAL OVER Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_OVER_CONSTRAINT_FEATURE_COUNT = SUBTYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.rules.impl.ANDConstraintImpl <em>AND Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.rules.impl.ANDConstraintImpl
	 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getANDConstraint()
	 * @generated
	 */
	int AND_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Constrained Subtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONSTRAINT__CONSTRAINED_SUBTYPES = SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES;

	/**
	 * The feature id for the '<em><b>Equivalent Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONSTRAINT__EQUIVALENT_RULE = SUBTYPE_CONSTRAINT__EQUIVALENT_RULE;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONSTRAINT__COLLECTION = SUBTYPE_CONSTRAINT__COLLECTION;

	/**
	 * The number of structural features of the '<em>AND Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONSTRAINT_FEATURE_COUNT = SUBTYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl <em>Global Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl
	 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getGlobalRule()
	 * @generated
	 */
	int GLOBAL_RULE = 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__NAMESPACE = CorePackage.SCHEMA_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__DOCUMENTATION = CorePackage.SCHEMA_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__ID = CorePackage.SCHEMA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__REFERENCED_AS = CorePackage.SCHEMA_ELEMENT__REFERENCED_AS;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__REFERENCED_IN = CorePackage.SCHEMA_ELEMENT__REFERENCED_IN;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__DEFINED_IN = CorePackage.SCHEMA_ELEMENT__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__NAMED_ELEMENTS = CorePackage.SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__INCLUDES_REMARKS = CorePackage.SCHEMA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__LOCAL_ELEMENTS = CorePackage.SCHEMA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Common Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__COMMON_ELEMENTS = CorePackage.SCHEMA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__VARIABLES = CorePackage.SCHEMA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Supporting Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__SUPPORTING_BODY = CorePackage.SCHEMA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Constrained Extents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__CONSTRAINED_EXTENTS = CorePackage.SCHEMA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contains Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE__CONTAINS_RULES = CorePackage.SCHEMA_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Global Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RULE_FEATURE_COUNT = CorePackage.SCHEMA_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.rules.impl.NamedRuleImpl <em>Named Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.rules.impl.NamedRuleImpl
	 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getNamedRule()
	 * @generated
	 */
	int NAMED_RULE = 7;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RULE__NAMESPACE = CorePackage.LOCAL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RULE__DOCUMENTATION = CorePackage.LOCAL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RULE__ID = CorePackage.LOCAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Asserts Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RULE__ASSERTS_EXPRESSION = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RULE__POSITION = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RULE_FEATURE_COUNT = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.rules.ONEOFConstraint <em>ONEOF Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ONEOF Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.ONEOFConstraint
	 * @generated
	 */
	EClass getONEOFConstraint();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.rules.SupertypeRule <em>Supertype Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supertype Rule</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.SupertypeRule
	 * @generated
	 */
	EClass getSupertypeRule();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.rules.SupertypeRule#getNamedSupertype <em>Named Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Named Supertype</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.SupertypeRule#getNamedSupertype()
	 * @see #getSupertypeRule()
	 * @generated
	 */
	EReference getSupertypeRule_NamedSupertype();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.rules.SupertypeRule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.SupertypeRule#getConstraints()
	 * @see #getSupertypeRule()
	 * @generated
	 */
	EReference getSupertypeRule_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.rules.SupertypeRule#getAssertsAbstract <em>Asserts Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asserts Abstract</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.SupertypeRule#getAssertsAbstract()
	 * @see #getSupertypeRule()
	 * @generated
	 */
	EAttribute getSupertypeRule_AssertsAbstract();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint <em>Subtype Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtype Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.SubtypeConstraint
	 * @generated
	 */
	EClass getSubtypeConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getConstrainedSubtypes <em>Constrained Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Subtypes</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getConstrainedSubtypes()
	 * @see #getSubtypeConstraint()
	 * @generated
	 */
	EReference getSubtypeConstraint_ConstrainedSubtypes();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getEquivalentRule <em>Equivalent Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Equivalent Rule</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getEquivalentRule()
	 * @see #getSubtypeConstraint()
	 * @generated
	 */
	EReference getSubtypeConstraint_EquivalentRule();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getCollection()
	 * @see #getSubtypeConstraint()
	 * @generated
	 */
	EReference getSubtypeConstraint_Collection();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.rules.Extent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extent</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.Extent
	 * @generated
	 */
	EClass getExtent();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.rules.Extent#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraints</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.Extent#getConstraints()
	 * @see #getExtent()
	 * @generated
	 */
	EReference getExtent_Constraints();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.rules.Extent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.Extent#getContent()
	 * @see #getExtent()
	 * @generated
	 */
	EReference getExtent_Content();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.rules.Extent#getWithinPopulation <em>Within Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Within Population</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.Extent#getWithinPopulation()
	 * @see #getExtent()
	 * @generated
	 */
	EReference getExtent_WithinPopulation();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.rules.Extent#getConstraintRules <em>Constraint Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint Rules</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.Extent#getConstraintRules()
	 * @see #getExtent()
	 * @generated
	 */
	EReference getExtent_ConstraintRules();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.rules.Extent#getForType <em>For Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Type</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.Extent#getForType()
	 * @see #getExtent()
	 * @generated
	 */
	EReference getExtent_ForType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.rules.Extent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.Extent#getId()
	 * @see #getExtent()
	 * @generated
	 */
	EReference getExtent_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.rules.TOTAL_OVERConstraint <em>TOTAL OVER Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOTAL OVER Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.TOTAL_OVERConstraint
	 * @generated
	 */
	EClass getTOTAL_OVERConstraint();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.rules.ANDConstraint <em>AND Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.ANDConstraint
	 * @generated
	 */
	EClass getANDConstraint();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.rules.GlobalRule <em>Global Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Rule</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.GlobalRule
	 * @generated
	 */
	EClass getGlobalRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.rules.GlobalRule#getSupportingBody <em>Supporting Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supporting Body</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.GlobalRule#getSupportingBody()
	 * @see #getGlobalRule()
	 * @generated
	 */
	EReference getGlobalRule_SupportingBody();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.rules.GlobalRule#getConstrainedExtents <em>Constrained Extents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Extents</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.GlobalRule#getConstrainedExtents()
	 * @see #getGlobalRule()
	 * @generated
	 */
	EReference getGlobalRule_ConstrainedExtents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.rules.GlobalRule#getContainsRules <em>Contains Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Rules</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.GlobalRule#getContainsRules()
	 * @see #getGlobalRule()
	 * @generated
	 */
	EReference getGlobalRule_ContainsRules();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.rules.NamedRule <em>Named Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Rule</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.NamedRule
	 * @generated
	 */
	EClass getNamedRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.rules.NamedRule#getAssertsExpression <em>Asserts Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asserts Expression</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.NamedRule#getAssertsExpression()
	 * @see #getNamedRule()
	 * @generated
	 */
	EReference getNamedRule_AssertsExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.rules.NamedRule#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.ifc4emf.metamodel.express.rules.NamedRule#getPosition()
	 * @see #getNamedRule()
	 * @generated
	 */
	EAttribute getNamedRule_Position();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

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
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.rules.impl.ONEOFConstraintImpl <em>ONEOF Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.rules.impl.ONEOFConstraintImpl
		 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getONEOFConstraint()
		 * @generated
		 */
		EClass ONEOF_CONSTRAINT = eINSTANCE.getONEOFConstraint();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.rules.impl.SupertypeRuleImpl <em>Supertype Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.rules.impl.SupertypeRuleImpl
		 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getSupertypeRule()
		 * @generated
		 */
		EClass SUPERTYPE_RULE = eINSTANCE.getSupertypeRule();

		/**
		 * The meta object literal for the '<em><b>Named Supertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPERTYPE_RULE__NAMED_SUPERTYPE = eINSTANCE.getSupertypeRule_NamedSupertype();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPERTYPE_RULE__CONSTRAINTS = eINSTANCE.getSupertypeRule_Constraints();

		/**
		 * The meta object literal for the '<em><b>Asserts Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPERTYPE_RULE__ASSERTS_ABSTRACT = eINSTANCE.getSupertypeRule_AssertsAbstract();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.rules.impl.SubtypeConstraintImpl <em>Subtype Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.rules.impl.SubtypeConstraintImpl
		 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getSubtypeConstraint()
		 * @generated
		 */
		EClass SUBTYPE_CONSTRAINT = eINSTANCE.getSubtypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Subtypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTYPE_CONSTRAINT__CONSTRAINED_SUBTYPES = eINSTANCE.getSubtypeConstraint_ConstrainedSubtypes();

		/**
		 * The meta object literal for the '<em><b>Equivalent Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTYPE_CONSTRAINT__EQUIVALENT_RULE = eINSTANCE.getSubtypeConstraint_EquivalentRule();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTYPE_CONSTRAINT__COLLECTION = eINSTANCE.getSubtypeConstraint_Collection();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.rules.impl.ExtentImpl <em>Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.rules.impl.ExtentImpl
		 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getExtent()
		 * @generated
		 */
		EClass EXTENT = eINSTANCE.getExtent();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT__CONSTRAINTS = eINSTANCE.getExtent_Constraints();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT__CONTENT = eINSTANCE.getExtent_Content();

		/**
		 * The meta object literal for the '<em><b>Within Population</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT__WITHIN_POPULATION = eINSTANCE.getExtent_WithinPopulation();

		/**
		 * The meta object literal for the '<em><b>Constraint Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT__CONSTRAINT_RULES = eINSTANCE.getExtent_ConstraintRules();

		/**
		 * The meta object literal for the '<em><b>For Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT__FOR_TYPE = eINSTANCE.getExtent_ForType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT__ID = eINSTANCE.getExtent_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.rules.impl.TOTAL_OVERConstraintImpl <em>TOTAL OVER Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.rules.impl.TOTAL_OVERConstraintImpl
		 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getTOTAL_OVERConstraint()
		 * @generated
		 */
		EClass TOTAL_OVER_CONSTRAINT = eINSTANCE.getTOTAL_OVERConstraint();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.rules.impl.ANDConstraintImpl <em>AND Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.rules.impl.ANDConstraintImpl
		 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getANDConstraint()
		 * @generated
		 */
		EClass AND_CONSTRAINT = eINSTANCE.getANDConstraint();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl <em>Global Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl
		 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getGlobalRule()
		 * @generated
		 */
		EClass GLOBAL_RULE = eINSTANCE.getGlobalRule();

		/**
		 * The meta object literal for the '<em><b>Supporting Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_RULE__SUPPORTING_BODY = eINSTANCE.getGlobalRule_SupportingBody();

		/**
		 * The meta object literal for the '<em><b>Constrained Extents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_RULE__CONSTRAINED_EXTENTS = eINSTANCE.getGlobalRule_ConstrainedExtents();

		/**
		 * The meta object literal for the '<em><b>Contains Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_RULE__CONTAINS_RULES = eINSTANCE.getGlobalRule_ContainsRules();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.rules.impl.NamedRuleImpl <em>Named Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.rules.impl.NamedRuleImpl
		 * @see org.ifc4emf.metamodel.express.rules.impl.RulesPackageImpl#getNamedRule()
		 * @generated
		 */
		EClass NAMED_RULE = eINSTANCE.getNamedRule();

		/**
		 * The meta object literal for the '<em><b>Asserts Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_RULE__ASSERTS_EXPRESSION = eINSTANCE.getNamedRule_AssertsExpression();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_RULE__POSITION = eINSTANCE.getNamedRule_Position();

	}

} //RulesPackage
