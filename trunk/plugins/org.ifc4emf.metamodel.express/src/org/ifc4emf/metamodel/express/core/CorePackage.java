/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.ifc4emf.metamodel.express.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://express.ecore#//core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "express_core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.ifc4emf.metamodel.express.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.NamedElementImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 29;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.TypeElementImpl <em>Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.TypeElementImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getTypeElement()
	 * @generated
	 */
	int TYPE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ELEMENT__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ELEMENT__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.SingleEntityTypeImpl <em>Single Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.SingleEntityTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSingleEntityType()
	 * @generated
	 */
	int SINGLE_ENTITY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Declares Explicit Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ENTITY_TYPE__DECLARES_EXPLICIT_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Declares Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Declared In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ENTITY_TYPE__DECLARED_IN = 2;

	/**
	 * The feature id for the '<em><b>Equivalent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ENTITY_TYPE__EQUIVALENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ENTITY_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Single Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ENTITY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.ParameterTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__CONTAINS = 0;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralizedTypeImpl <em>Generalized Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.GeneralizedTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralizedType()
	 * @generated
	 */
	int GENERALIZED_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_TYPE__CONTAINS = PARAMETER_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_TYPE__ROLE = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_TYPE__CONSTRAINTS = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occurs In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_TYPE__OCCURS_IN = PARAMETER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generalized Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.AGGREGATETypeImpl <em>AGGREGATE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.AGGREGATETypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAGGREGATEType()
	 * @generated
	 */
	int AGGREGATE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__CONTAINS = GENERALIZED_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__ROLE = GENERALIZED_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__CONSTRAINTS = GENERALIZED_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Occurs In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__OCCURS_IN = GENERALIZED_TYPE__OCCURS_IN;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__UPPER_BOUND = GENERALIZED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__MEMBER_TYPE = GENERALIZED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__CONSTRAINT = GENERALIZED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__LOWER_BOUND = GENERALIZED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>AGGREGATE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_FEATURE_COUNT = GENERALIZED_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralAggregationTypeImpl <em>General Aggregation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.GeneralAggregationTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralAggregationType()
	 * @generated
	 */
	int GENERAL_AGGREGATION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_AGGREGATION_TYPE__CONTAINS = GENERALIZED_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_AGGREGATION_TYPE__ROLE = GENERALIZED_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_AGGREGATION_TYPE__CONSTRAINTS = GENERALIZED_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Occurs In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_AGGREGATION_TYPE__OCCURS_IN = GENERALIZED_TYPE__OCCURS_IN;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_AGGREGATION_TYPE__LOWER_BOUND = GENERALIZED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_AGGREGATION_TYPE__UPPER_BOUND = GENERALIZED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_AGGREGATION_TYPE__IS_UNIQUE = GENERALIZED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_AGGREGATION_TYPE__ORDERING = GENERALIZED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_AGGREGATION_TYPE__MEMBER_TYPE = GENERALIZED_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>General Aggregation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_AGGREGATION_TYPE_FEATURE_COUNT = GENERALIZED_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralBAGTypeImpl <em>General BAG Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.GeneralBAGTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralBAGType()
	 * @generated
	 */
	int GENERAL_BAG_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_BAG_TYPE__CONTAINS = GENERAL_AGGREGATION_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_BAG_TYPE__ROLE = GENERAL_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_BAG_TYPE__CONSTRAINTS = GENERAL_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Occurs In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_BAG_TYPE__OCCURS_IN = GENERAL_AGGREGATION_TYPE__OCCURS_IN;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_BAG_TYPE__LOWER_BOUND = GENERAL_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_BAG_TYPE__UPPER_BOUND = GENERAL_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_BAG_TYPE__IS_UNIQUE = GENERAL_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_BAG_TYPE__ORDERING = GENERAL_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_BAG_TYPE__MEMBER_TYPE = GENERAL_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The number of structural features of the '<em>General BAG Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_BAG_TYPE_FEATURE_COUNT = GENERAL_AGGREGATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.DomainConstraintImpl <em>Domain Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.DomainConstraintImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDomainConstraint()
	 * @generated
	 */
	int DOMAIN_CONSTRAINT = 26;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONSTRAINT__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Asserts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONSTRAINT__ASSERTS = 1;

	/**
	 * The number of structural features of the '<em>Domain Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.DomainRuleImpl <em>Domain Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.DomainRuleImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDomainRule()
	 * @generated
	 */
	int DOMAIN_RULE = 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RULE__DOMAIN = DOMAIN_CONSTRAINT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Asserts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RULE__ASSERTS = DOMAIN_CONSTRAINT__ASSERTS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RULE__NAMESPACE = DOMAIN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RULE__DOCUMENTATION = DOMAIN_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RULE__ID = DOMAIN_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RULE__POSITION = DOMAIN_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Domain Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RULE_FEATURE_COUNT = DOMAIN_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.InstantiableTypeImpl <em>Instantiable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.InstantiableTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getInstantiableType()
	 * @generated
	 */
	int INSTANTIABLE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIABLE_TYPE__CONTAINS = PARAMETER_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIABLE_TYPE__INSTANCES = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIABLE_TYPE__ROLE = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIABLE_TYPE__CONSTRAINTS = PARAMETER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIABLE_TYPE__FUNDAMENTAL_TYPE = PARAMETER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Instantiable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIABLE_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.ConcreteTypeImpl <em>Concrete Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.ConcreteTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getConcreteType()
	 * @generated
	 */
	int CONCRETE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE__CONTAINS = INSTANTIABLE_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE__INSTANCES = INSTANTIABLE_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE__ROLE = INSTANTIABLE_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE__CONSTRAINTS = INSTANTIABLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE__FUNDAMENTAL_TYPE = INSTANTIABLE_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The number of structural features of the '<em>Concrete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE_FEATURE_COUNT = INSTANTIABLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.ExpressionImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EVALUATION = 0;

	/**
	 * The feature id for the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__INTERPRETATION_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TEXT = 3;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.AttributeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 30;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAMESPACE = TYPE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DOCUMENTATION = TYPE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = TYPE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_TYPE = TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Of Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OF_ENTITY = TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ABSTRACT = TYPE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__POSITION = TYPE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owning Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNING_ENTITY = TYPE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.InverseAttributeImpl <em>Inverse Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.InverseAttributeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getInverseAttribute()
	 * @generated
	 */
	int INVERSE_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE__NAMESPACE = ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE__DOCUMENTATION = ATTRIBUTE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE__ATTRIBUTE_TYPE = ATTRIBUTE__ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Of Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE__OF_ENTITY = ATTRIBUTE__OF_ENTITY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE__IS_ABSTRACT = ATTRIBUTE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE__POSITION = ATTRIBUTE__POSITION;

	/**
	 * The feature id for the '<em><b>Owning Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE__OWNING_ENTITY = ATTRIBUTE__OWNING_ENTITY;

	/**
	 * The feature id for the '<em><b>Models Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE__MODELS_ROLE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE__EXPLICIT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE__IS_UNIQUE = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Inverse Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl <em>Named Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getNamedType()
	 * @generated
	 */
	int NAMED_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__CONTAINS = INSTANTIABLE_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__INSTANCES = INSTANTIABLE_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__ROLE = INSTANTIABLE_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__CONSTRAINTS = INSTANTIABLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__FUNDAMENTAL_TYPE = INSTANTIABLE_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__NAMED_ELEMENTS = INSTANTIABLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__INCLUDES_REMARKS = INSTANTIABLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__NAMESPACE = INSTANTIABLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__DOCUMENTATION = INSTANTIABLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__ID = INSTANTIABLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__REFERENCED_AS = INSTANTIABLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__REFERENCED_IN = INSTANTIABLE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__DEFINED_IN = INSTANTIABLE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__LOCAL_SCOPE = INSTANTIABLE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Instantiates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__INSTANTIATES = INSTANTIABLE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Domain Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__DOMAIN_RULES = INSTANTIABLE_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Named Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_FEATURE_COUNT = INSTANTIABLE_TYPE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.DefinedTypeImpl <em>Defined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.DefinedTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDefinedType()
	 * @generated
	 */
	int DEFINED_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__CONTAINS = NAMED_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__INSTANCES = NAMED_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__ROLE = NAMED_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__CONSTRAINTS = NAMED_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__FUNDAMENTAL_TYPE = NAMED_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__NAMED_ELEMENTS = NAMED_TYPE__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__INCLUDES_REMARKS = NAMED_TYPE__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__NAMESPACE = NAMED_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__DOCUMENTATION = NAMED_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__ID = NAMED_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__REFERENCED_AS = NAMED_TYPE__REFERENCED_AS;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__REFERENCED_IN = NAMED_TYPE__REFERENCED_IN;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__DEFINED_IN = NAMED_TYPE__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__LOCAL_SCOPE = NAMED_TYPE__LOCAL_SCOPE;

	/**
	 * The feature id for the '<em><b>Instantiates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__INSTANTIATES = NAMED_TYPE__INSTANTIATES;

	/**
	 * The feature id for the '<em><b>Domain Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__DOMAIN_RULES = NAMED_TYPE__DOMAIN_RULES;

	/**
	 * The number of structural features of the '<em>Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.EnumerationTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__CONTAINS = DEFINED_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__INSTANCES = DEFINED_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__ROLE = DEFINED_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__CONSTRAINTS = DEFINED_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__FUNDAMENTAL_TYPE = DEFINED_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__NAMED_ELEMENTS = DEFINED_TYPE__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__INCLUDES_REMARKS = DEFINED_TYPE__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__NAMESPACE = DEFINED_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__DOCUMENTATION = DEFINED_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__ID = DEFINED_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__REFERENCED_AS = DEFINED_TYPE__REFERENCED_AS;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__REFERENCED_IN = DEFINED_TYPE__REFERENCED_IN;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__DEFINED_IN = DEFINED_TYPE__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__LOCAL_SCOPE = DEFINED_TYPE__LOCAL_SCOPE;

	/**
	 * The feature id for the '<em><b>Instantiates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__INSTANTIATES = DEFINED_TYPE__INSTANTIATES;

	/**
	 * The feature id for the '<em><b>Domain Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__DOMAIN_RULES = DEFINED_TYPE__DOMAIN_RULES;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__VALUES = DEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declared Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__DECLARED_ITEMS = DEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__EXTENSION = DEFINED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__BASE = DEFINED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Extensible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_EXTENSIBLE = DEFINED_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = DEFINED_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.DataTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.VariableTypeImpl <em>Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.VariableTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__INSTANCES = DATA_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__ROLE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__CONSTRAINTS = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.ArrayBoundImpl <em>Array Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.ArrayBoundImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getArrayBound()
	 * @generated
	 */
	int ARRAY_BOUND = 11;

	/**
	 * The feature id for the '<em><b>Bound Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_BOUND__BOUND_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_BOUND__BOUND = 1;

	/**
	 * The number of structural features of the '<em>Array Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_BOUND_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralSETTypeImpl <em>General SET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.GeneralSETTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralSETType()
	 * @generated
	 */
	int GENERAL_SET_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SET_TYPE__CONTAINS = GENERAL_AGGREGATION_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SET_TYPE__ROLE = GENERAL_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SET_TYPE__CONSTRAINTS = GENERAL_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Occurs In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SET_TYPE__OCCURS_IN = GENERAL_AGGREGATION_TYPE__OCCURS_IN;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SET_TYPE__LOWER_BOUND = GENERAL_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SET_TYPE__UPPER_BOUND = GENERAL_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SET_TYPE__IS_UNIQUE = GENERAL_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SET_TYPE__ORDERING = GENERAL_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SET_TYPE__MEMBER_TYPE = GENERAL_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The number of structural features of the '<em>General SET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SET_TYPE_FEATURE_COUNT = GENERAL_AGGREGATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.AnonymousTypeImpl <em>Anonymous Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.AnonymousTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAnonymousType()
	 * @generated
	 */
	int ANONYMOUS_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE__CONTAINS = CONCRETE_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE__INSTANCES = CONCRETE_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE__ROLE = CONCRETE_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE__CONSTRAINTS = CONCRETE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE__FUNDAMENTAL_TYPE = CONCRETE_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE__SPECIALIZES = CONCRETE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anonymous Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE_FEATURE_COUNT = CONCRETE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.ConcreteAggregationTypeImpl <em>Concrete Aggregation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.ConcreteAggregationTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getConcreteAggregationType()
	 * @generated
	 */
	int CONCRETE_AGGREGATION_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE__CONTAINS = ANONYMOUS_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE__INSTANCES = ANONYMOUS_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE__ROLE = ANONYMOUS_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE__CONSTRAINTS = ANONYMOUS_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE__FUNDAMENTAL_TYPE = ANONYMOUS_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE__SPECIALIZES = ANONYMOUS_TYPE__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE__LOWER_BOUND = ANONYMOUS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE__UPPER_BOUND = ANONYMOUS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE__IS_UNIQUE = ANONYMOUS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE__ORDERING = ANONYMOUS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE__MEMBER_TYPE = ANONYMOUS_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Concrete Aggregation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_AGGREGATION_TYPE_FEATURE_COUNT = ANONYMOUS_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.LISTTypeImpl <em>LIST Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.LISTTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getLISTType()
	 * @generated
	 */
	int LIST_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__CONTAINS = CONCRETE_AGGREGATION_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__INSTANCES = CONCRETE_AGGREGATION_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__ROLE = CONCRETE_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__CONSTRAINTS = CONCRETE_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__FUNDAMENTAL_TYPE = CONCRETE_AGGREGATION_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__SPECIALIZES = CONCRETE_AGGREGATION_TYPE__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__LOWER_BOUND = CONCRETE_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__UPPER_BOUND = CONCRETE_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__IS_UNIQUE = CONCRETE_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__ORDERING = CONCRETE_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__MEMBER_TYPE = CONCRETE_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The number of structural features of the '<em>LIST Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_FEATURE_COUNT = CONCRETE_AGGREGATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl <em>Redeclaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRedeclaration()
	 * @generated
	 */
	int REDECLARATION = 14;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION__DERIVATION = 0;

	/**
	 * The feature id for the '<em><b>Restricted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION__RESTRICTED_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION__REFINES = 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION__UPPER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION__LOWER_BOUND = 4;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION__SCOPE = 5;

	/**
	 * The feature id for the '<em><b>Original Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION__ORIGINAL_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION__REFINED_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION__POSITION = 8;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION__IS_MANDATORY = 9;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION__ALIAS = 10;

	/**
	 * The number of structural features of the '<em>Redeclaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDECLARATION_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__CONTAINS = NAMED_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__INSTANCES = NAMED_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ROLE = NAMED_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__CONSTRAINTS = NAMED_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__FUNDAMENTAL_TYPE = NAMED_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAMED_ELEMENTS = NAMED_TYPE__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__INCLUDES_REMARKS = NAMED_TYPE__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAMESPACE = NAMED_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DOCUMENTATION = NAMED_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ID = NAMED_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__REFERENCED_AS = NAMED_TYPE__REFERENCED_AS;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__REFERENCED_IN = NAMED_TYPE__REFERENCED_IN;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DEFINED_IN = NAMED_TYPE__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__LOCAL_SCOPE = NAMED_TYPE__LOCAL_SCOPE;

	/**
	 * The feature id for the '<em><b>Instantiates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__INSTANTIATES = NAMED_TYPE__INSTANTIATES;

	/**
	 * The feature id for the '<em><b>Domain Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DOMAIN_RULES = NAMED_TYPE__DOMAIN_RULES;

	/**
	 * The feature id for the '<em><b>Plays Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PLAYS_ROLE = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redeclarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__REDECLARATIONS = NAMED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ATTRIBUTES = NAMED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plays Range Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PLAYS_RANGE_ROLE = NAMED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declares</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DECLARES = NAMED_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__EXTENSION = NAMED_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invertible Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__INVERTIBLE_ATTRIBUTES = NAMED_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Plays Domain Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PLAYS_DOMAIN_ROLE = NAMED_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Unique Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__UNIQUE_RULES = NAMED_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Used In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__USED_IN = NAMED_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Subtype Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SUBTYPE_OF = NAMED_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__IS_ABSTRACT = NAMED_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.PartialEntityTypeImpl <em>Partial Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.PartialEntityTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getPartialEntityType()
	 * @generated
	 */
	int PARTIAL_ENTITY_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_TYPE__INSTANCES = DATA_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_TYPE__COMPONENTS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partial Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.ScopeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 56;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__NAMED_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__INCLUDES_REMARKS = 1;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.SchemaImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 18;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAMED_ELEMENTS = SCOPE__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__INCLUDES_REMARKS = SCOPE__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DOCUMENTATION = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__INTERFACES = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__SCHEMA_ELEMENTS = SCOPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interfaced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__INTERFACED_ELEMENTS = SCOPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = SCOPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__VERSION = SCOPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.ExplicitAttributeImpl <em>Explicit Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.ExplicitAttributeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getExplicitAttribute()
	 * @generated
	 */
	int EXPLICIT_ATTRIBUTE = 60;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ATTRIBUTE__NAMESPACE = ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ATTRIBUTE__DOCUMENTATION = ATTRIBUTE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ATTRIBUTE__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ATTRIBUTE__ATTRIBUTE_TYPE = ATTRIBUTE__ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Of Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ATTRIBUTE__OF_ENTITY = ATTRIBUTE__OF_ENTITY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ATTRIBUTE__IS_ABSTRACT = ATTRIBUTE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ATTRIBUTE__POSITION = ATTRIBUTE__POSITION;

	/**
	 * The feature id for the '<em><b>Owning Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ATTRIBUTE__OWNING_ENTITY = ATTRIBUTE__OWNING_ENTITY;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ATTRIBUTE__IS_OPTIONAL = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Explicit Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.InvertibleAttributeImpl <em>Invertible Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.InvertibleAttributeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getInvertibleAttribute()
	 * @generated
	 */
	int INVERTIBLE_ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__NAMESPACE = EXPLICIT_ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__DOCUMENTATION = EXPLICIT_ATTRIBUTE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__ID = EXPLICIT_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__ATTRIBUTE_TYPE = EXPLICIT_ATTRIBUTE__ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Of Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__OF_ENTITY = EXPLICIT_ATTRIBUTE__OF_ENTITY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__IS_ABSTRACT = EXPLICIT_ATTRIBUTE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__POSITION = EXPLICIT_ATTRIBUTE__POSITION;

	/**
	 * The feature id for the '<em><b>Owning Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__OWNING_ENTITY = EXPLICIT_ATTRIBUTE__OWNING_ENTITY;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__IS_OPTIONAL = EXPLICIT_ATTRIBUTE__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__INVERSE = EXPLICIT_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__RANGE_TYPE = EXPLICIT_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creates Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP = EXPLICIT_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referencing Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__REFERENCING_TYPE = EXPLICIT_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Models Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE__MODELS_ROLE = EXPLICIT_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Invertible Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTIBLE_ATTRIBUTE_FEATURE_COUNT = EXPLICIT_ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.InterfacedElementImpl <em>Interfaced Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.InterfacedElementImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getInterfacedElement()
	 * @generated
	 */
	int INTERFACED_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Interfacing Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACED_ELEMENT__INTERFACING_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACED_ELEMENT__REFERS_TO = 1;

	/**
	 * The feature id for the '<em><b>Is USE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACED_ELEMENT__IS_USE = 2;

	/**
	 * The feature id for the '<em><b>Interfaced Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACED_ELEMENT__INTERFACED_ID = 3;

	/**
	 * The number of structural features of the '<em>Interfaced Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.SimpleTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__CONTAINS = ANONYMOUS_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__INSTANCES = ANONYMOUS_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__ROLE = ANONYMOUS_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__CONSTRAINTS = ANONYMOUS_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__FUNDAMENTAL_TYPE = ANONYMOUS_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__SPECIALIZES = ANONYMOUS_TYPE__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__ID = ANONYMOUS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = ANONYMOUS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.NumericTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getNumericType()
	 * @generated
	 */
	int NUMERIC_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__CONTAINS = SIMPLE_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__INSTANCES = SIMPLE_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__ROLE = SIMPLE_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__CONSTRAINTS = SIMPLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__FUNDAMENTAL_TYPE = SIMPLE_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__SPECIALIZES = SIMPLE_TYPE__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__ID = SIMPLE_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.UniqueRuleImpl <em>Unique Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.UniqueRuleImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getUniqueRule()
	 * @generated
	 */
	int UNIQUE_RULE = 24;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_RULE__NAMESPACE = TYPE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_RULE__DOCUMENTATION = TYPE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_RULE__ID = TYPE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_RULE__DOMAIN = TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_RULE__KEY_COMPONENT = TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_RULE__POSITION = TYPE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unique Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_RULE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.RoleImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 45;

	/**
	 * The feature id for the '<em><b>In Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IN_RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Of Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OF_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__UPPER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__LOWER_BOUND = 3;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.DomainRoleImpl <em>Domain Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.DomainRoleImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDomainRole()
	 * @generated
	 */
	int DOMAIN_ROLE = 25;

	/**
	 * The feature id for the '<em><b>In Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ROLE__IN_RELATIONSHIP = ROLE__IN_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Of Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ROLE__OF_ENTITY = ROLE__OF_ENTITY;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ROLE__UPPER_BOUND = ROLE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ROLE__LOWER_BOUND = ROLE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Range View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ROLE__RANGE_VIEW = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ROLE__DOMAIN = ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ROLE__ID = ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Domain Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralLISTTypeImpl <em>General LIST Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.GeneralLISTTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralLISTType()
	 * @generated
	 */
	int GENERAL_LIST_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIST_TYPE__CONTAINS = GENERAL_AGGREGATION_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIST_TYPE__ROLE = GENERAL_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIST_TYPE__CONSTRAINTS = GENERAL_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Occurs In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIST_TYPE__OCCURS_IN = GENERAL_AGGREGATION_TYPE__OCCURS_IN;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIST_TYPE__LOWER_BOUND = GENERAL_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIST_TYPE__UPPER_BOUND = GENERAL_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIST_TYPE__IS_UNIQUE = GENERAL_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIST_TYPE__ORDERING = GENERAL_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIST_TYPE__MEMBER_TYPE = GENERAL_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The number of structural features of the '<em>General LIST Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIST_TYPE_FEATURE_COUNT = GENERAL_AGGREGATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.BAGTypeImpl <em>BAG Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.BAGTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getBAGType()
	 * @generated
	 */
	int BAG_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__CONTAINS = CONCRETE_AGGREGATION_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__INSTANCES = CONCRETE_AGGREGATION_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ROLE = CONCRETE_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__CONSTRAINTS = CONCRETE_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__FUNDAMENTAL_TYPE = CONCRETE_AGGREGATION_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__SPECIALIZES = CONCRETE_AGGREGATION_TYPE__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__LOWER_BOUND = CONCRETE_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__UPPER_BOUND = CONCRETE_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__IS_UNIQUE = CONCRETE_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ORDERING = CONCRETE_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__MEMBER_TYPE = CONCRETE_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The number of structural features of the '<em>BAG Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE_FEATURE_COUNT = CONCRETE_AGGREGATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.RealTypeImpl <em>Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.RealTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__CONTAINS = NUMERIC_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__INSTANCES = NUMERIC_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__ROLE = NUMERIC_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__CONSTRAINTS = NUMERIC_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__FUNDAMENTAL_TYPE = NUMERIC_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__SPECIALIZES = NUMERIC_TYPE__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__ID = NUMERIC_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__PRECISION = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.LogicTypeImpl <em>Logic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.LogicTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getLogicType()
	 * @generated
	 */
	int LOGIC_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_TYPE__CONTAINS = SIMPLE_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_TYPE__INSTANCES = SIMPLE_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_TYPE__ROLE = SIMPLE_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_TYPE__CONSTRAINTS = SIMPLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_TYPE__FUNDAMENTAL_TYPE = SIMPLE_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_TYPE__SPECIALIZES = SIMPLE_TYPE__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_TYPE__ID = SIMPLE_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Logic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.GenericTypeImpl <em>Generic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.GenericTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGenericType()
	 * @generated
	 */
	int GENERIC_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__CONTAINS = GENERALIZED_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__ROLE = GENERALIZED_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__CONSTRAINTS = GENERALIZED_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Occurs In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__OCCURS_IN = GENERALIZED_TYPE__OCCURS_IN;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__CONSTRAINT = GENERALIZED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__IS_ENTITY = GENERALIZED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_FEATURE_COUNT = GENERALIZED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.StringTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__CONTAINS = SIMPLE_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__INSTANCES = SIMPLE_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__ROLE = SIMPLE_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__CONSTRAINTS = SIMPLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__FUNDAMENTAL_TYPE = SIMPLE_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__SPECIALIZES = SIMPLE_TYPE__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__ID = SIMPLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>String Length Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__STRING_LENGTH_CONSTRAINT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.LocalScopeImpl <em>Local Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.LocalScopeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getLocalScope()
	 * @generated
	 */
	int LOCAL_SCOPE = 51;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SCOPE__NAMED_ELEMENTS = SCOPE__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SCOPE__INCLUDES_REMARKS = SCOPE__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Local Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SCOPE__LOCAL_ELEMENTS = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.AlgorithmScopeImpl <em>Algorithm Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.AlgorithmScopeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAlgorithmScope()
	 * @generated
	 */
	int ALGORITHM_SCOPE = 37;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SCOPE__NAMED_ELEMENTS = LOCAL_SCOPE__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SCOPE__INCLUDES_REMARKS = LOCAL_SCOPE__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Local Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SCOPE__LOCAL_ELEMENTS = LOCAL_SCOPE__LOCAL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Common Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SCOPE__COMMON_ELEMENTS = LOCAL_SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SCOPE__VARIABLES = LOCAL_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Algorithm Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SCOPE_FEATURE_COUNT = LOCAL_SCOPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.InstanceImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 38;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__APPEARS_IN_POPULATION = 0;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OF_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.AttributeTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__CONSTRAINTS = 1;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.DerivedAttributeImpl <em>Derived Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.DerivedAttributeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDerivedAttribute()
	 * @generated
	 */
	int DERIVED_ATTRIBUTE = 40;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ATTRIBUTE__NAMESPACE = ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ATTRIBUTE__DOCUMENTATION = ATTRIBUTE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ATTRIBUTE__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ATTRIBUTE__ATTRIBUTE_TYPE = ATTRIBUTE__ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Of Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ATTRIBUTE__OF_ENTITY = ATTRIBUTE__OF_ENTITY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ATTRIBUTE__IS_ABSTRACT = ATTRIBUTE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ATTRIBUTE__POSITION = ATTRIBUTE__POSITION;

	/**
	 * The feature id for the '<em><b>Owning Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ATTRIBUTE__OWNING_ENTITY = ATTRIBUTE__OWNING_ENTITY;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ATTRIBUTE__DERIVATION = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.RangeRoleImpl <em>Range Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.RangeRoleImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRangeRole()
	 * @generated
	 */
	int RANGE_ROLE = 41;

	/**
	 * The feature id for the '<em><b>In Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ROLE__IN_RELATIONSHIP = ROLE__IN_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Of Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ROLE__OF_ENTITY = ROLE__OF_ENTITY;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ROLE__UPPER_BOUND = ROLE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ROLE__LOWER_BOUND = ROLE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Domain View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ROLE__DOMAIN_VIEW = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ROLE__RANGE = ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ROLE__ID = ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.LocalElementImpl <em>Local Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.LocalElementImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getLocalElement()
	 * @generated
	 */
	int LOCAL_ELEMENT = 42;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Local Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.RemarkImpl <em>Remark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.RemarkImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRemark()
	 * @generated
	 */
	int REMARK = 43;

	/**
	 * The feature id for the '<em><b>Describes Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMARK__DESCRIBES_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Appears In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMARK__APPEARS_IN = 1;

	/**
	 * The feature id for the '<em><b>Describes Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMARK__DESCRIBES_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMARK__IS_TAGGED = 3;

	/**
	 * The feature id for the '<em><b>Is Tail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMARK__IS_TAIL = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMARK__TEXT = 5;

	/**
	 * The number of structural features of the '<em>Remark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMARK_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.SizeConstraintImpl <em>Size Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.SizeConstraintImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSizeConstraint()
	 * @generated
	 */
	int SIZE_CONSTRAINT = 44;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINT__DOMAIN = DOMAIN_CONSTRAINT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Asserts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINT__ASSERTS = DOMAIN_CONSTRAINT__ASSERTS;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINT__BOUND = DOMAIN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Size Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONSTRAINT_FEATURE_COUNT = DOMAIN_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.SETTypeImpl <em>SET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.SETTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSETType()
	 * @generated
	 */
	int SET_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__CONTAINS = CONCRETE_AGGREGATION_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__INSTANCES = CONCRETE_AGGREGATION_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ROLE = CONCRETE_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__CONSTRAINTS = CONCRETE_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__FUNDAMENTAL_TYPE = CONCRETE_AGGREGATION_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__SPECIALIZES = CONCRETE_AGGREGATION_TYPE__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__LOWER_BOUND = CONCRETE_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__UPPER_BOUND = CONCRETE_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__IS_UNIQUE = CONCRETE_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ORDERING = CONCRETE_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__MEMBER_TYPE = CONCRETE_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The number of structural features of the '<em>SET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_FEATURE_COUNT = CONCRETE_AGGREGATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.SpecializedTypeImpl <em>Specialized Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.SpecializedTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSpecializedType()
	 * @generated
	 */
	int SPECIALIZED_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__CONTAINS = DEFINED_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__INSTANCES = DEFINED_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__ROLE = DEFINED_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__CONSTRAINTS = DEFINED_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__FUNDAMENTAL_TYPE = DEFINED_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__NAMED_ELEMENTS = DEFINED_TYPE__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__INCLUDES_REMARKS = DEFINED_TYPE__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__NAMESPACE = DEFINED_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__DOCUMENTATION = DEFINED_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__ID = DEFINED_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__REFERENCED_AS = DEFINED_TYPE__REFERENCED_AS;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__REFERENCED_IN = DEFINED_TYPE__REFERENCED_IN;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__DEFINED_IN = DEFINED_TYPE__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__LOCAL_SCOPE = DEFINED_TYPE__LOCAL_SCOPE;

	/**
	 * The feature id for the '<em><b>Instantiates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__INSTANTIATES = DEFINED_TYPE__INSTANTIATES;

	/**
	 * The feature id for the '<em><b>Domain Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__DOMAIN_RULES = DEFINED_TYPE__DOMAIN_RULES;

	/**
	 * The feature id for the '<em><b>Underlying Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE__UNDERLYING_TYPE = DEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specialized Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_TYPE_FEATURE_COUNT = DEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralARRAYTypeImpl <em>General ARRAY Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.GeneralARRAYTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralARRAYType()
	 * @generated
	 */
	int GENERAL_ARRAY_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__CONTAINS = GENERAL_AGGREGATION_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__ROLE = GENERAL_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__CONSTRAINTS = GENERAL_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Occurs In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__OCCURS_IN = GENERAL_AGGREGATION_TYPE__OCCURS_IN;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__LOWER_BOUND = GENERAL_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__UPPER_BOUND = GENERAL_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__IS_UNIQUE = GENERAL_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__ORDERING = GENERAL_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__MEMBER_TYPE = GENERAL_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Hi Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__HI_INDEX = GENERAL_AGGREGATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lo Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__LO_INDEX = GENERAL_AGGREGATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE__IS_OPTIONAL = GENERAL_AGGREGATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>General ARRAY Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ARRAY_TYPE_FEATURE_COUNT = GENERAL_AGGREGATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.RelationshipImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 49;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__BASED_ON = 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RANGE = 3;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.LengthConstraintImpl <em>Length Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.LengthConstraintImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getLengthConstraint()
	 * @generated
	 */
	int LENGTH_CONSTRAINT = 50;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_CONSTRAINT__DOMAIN = DOMAIN_CONSTRAINT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Asserts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_CONSTRAINT__ASSERTS = DOMAIN_CONSTRAINT__ASSERTS;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_CONSTRAINT__MAX_LENGTH = DOMAIN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_CONSTRAINT__IS_FIXED = DOMAIN_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_CONSTRAINT_FEATURE_COUNT = DOMAIN_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.BinaryTypeImpl <em>Binary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.BinaryTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getBinaryType()
	 * @generated
	 */
	int BINARY_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__CONTAINS = SIMPLE_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__INSTANCES = SIMPLE_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__ROLE = SIMPLE_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__CONSTRAINTS = SIMPLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__FUNDAMENTAL_TYPE = SIMPLE_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__SPECIALIZES = SIMPLE_TYPE__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__ID = SIMPLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Binary Length Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__BINARY_LENGTH_CONSTRAINT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.ScopedIdImpl <em>Scoped Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.ScopedIdImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getScopedId()
	 * @generated
	 */
	int SCOPED_ID = 54;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ID__LOCAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Defining Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ID__DEFINING_SCOPE = 1;

	/**
	 * The number of structural features of the '<em>Scoped Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ID_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.AggregationTypeImpl <em>Aggregation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.AggregationTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAggregationType()
	 * @generated
	 */
	int AGGREGATION_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_TYPE__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_TYPE__UPPER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_TYPE__IS_UNIQUE = 2;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_TYPE__ORDERING = 3;

	/**
	 * The number of structural features of the '<em>Aggregation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.SelectTypeImpl <em>Select Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.SelectTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSelectType()
	 * @generated
	 */
	int SELECT_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__CONTAINS = DEFINED_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__INSTANCES = DEFINED_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__ROLE = DEFINED_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__CONSTRAINTS = DEFINED_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__FUNDAMENTAL_TYPE = DEFINED_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__NAMED_ELEMENTS = DEFINED_TYPE__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__INCLUDES_REMARKS = DEFINED_TYPE__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__NAMESPACE = DEFINED_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__DOCUMENTATION = DEFINED_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__ID = DEFINED_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__REFERENCED_AS = DEFINED_TYPE__REFERENCED_AS;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__REFERENCED_IN = DEFINED_TYPE__REFERENCED_IN;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__DEFINED_IN = DEFINED_TYPE__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__LOCAL_SCOPE = DEFINED_TYPE__LOCAL_SCOPE;

	/**
	 * The feature id for the '<em><b>Instantiates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__INSTANTIATES = DEFINED_TYPE__INSTANTIATES;

	/**
	 * The feature id for the '<em><b>Domain Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__DOMAIN_RULES = DEFINED_TYPE__DOMAIN_RULES;

	/**
	 * The feature id for the '<em><b>Allowed Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__ALLOWED_TYPES = DEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__EXTENSION = DEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__BASE = DEFINED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Select List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__SELECT_LIST = DEFINED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Extensible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__IS_EXTENSIBLE = DEFINED_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__IS_ENTITY = DEFINED_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Select Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE_FEATURE_COUNT = DEFINED_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.ActualTypeImpl <em>Actual Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.ActualTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getActualType()
	 * @generated
	 */
	int ACTUAL_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TYPE__INSTANCES = VARIABLE_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TYPE__ROLE = VARIABLE_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TYPE__CONSTRAINTS = VARIABLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TYPE__SCOPE = VARIABLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actual Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TYPE_FEATURE_COUNT = VARIABLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.SchemaElementImpl <em>Schema Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.SchemaElementImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSchemaElement()
	 * @generated
	 */
	int SCHEMA_ELEMENT = 63;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT__REFERENCED_AS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT__REFERENCED_IN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT__DEFINED_IN = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Schema Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.CommonElementImpl <em>Common Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.CommonElementImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getCommonElement()
	 * @generated
	 */
	int COMMON_ELEMENT = 62;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ELEMENT__NAMESPACE = SCHEMA_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ELEMENT__DOCUMENTATION = SCHEMA_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ELEMENT__ID = SCHEMA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ELEMENT__REFERENCED_AS = SCHEMA_ELEMENT__REFERENCED_AS;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ELEMENT__REFERENCED_IN = SCHEMA_ELEMENT__REFERENCED_IN;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ELEMENT__DEFINED_IN = SCHEMA_ELEMENT__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ELEMENT__LOCAL_SCOPE = SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Common Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ELEMENT_FEATURE_COUNT = SCHEMA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.core.impl.ARRAYTypeImpl <em>ARRAY Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.core.impl.ARRAYTypeImpl
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getARRAYType()
	 * @generated
	 */
	int ARRAY_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__CONTAINS = CONCRETE_AGGREGATION_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__INSTANCES = CONCRETE_AGGREGATION_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ROLE = CONCRETE_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__CONSTRAINTS = CONCRETE_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Fundamental Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__FUNDAMENTAL_TYPE = CONCRETE_AGGREGATION_TYPE__FUNDAMENTAL_TYPE;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__SPECIALIZES = CONCRETE_AGGREGATION_TYPE__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LOWER_BOUND = CONCRETE_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__UPPER_BOUND = CONCRETE_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__IS_UNIQUE = CONCRETE_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ORDERING = CONCRETE_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__MEMBER_TYPE = CONCRETE_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Lo Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LO_INDEX = CONCRETE_AGGREGATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hi Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__HI_INDEX = CONCRETE_AGGREGATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__IS_OPTIONAL = CONCRETE_AGGREGATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ARRAY Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = CONCRETE_AGGREGATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '<em>Keyword</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 66;

	/**
	 * The meta object id for the '<em>Express Text</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getExpressText()
	 * @generated
	 */
	int EXPRESS_TEXT = 67;

	/**
	 * The meta object id for the '<em>Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 68;

	/**
	 * The meta object id for the '<em>Ordering Kind</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getOrderingKind()
	 * @generated
	 */
	int ORDERING_KIND = 69;


	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.TypeElement <em>Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Element</em>'.
	 * @see org.ifc4emf.metamodel.express.core.TypeElement
	 * @generated
	 */
	EClass getTypeElement();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.SingleEntityType <em>Single Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Entity Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SingleEntityType
	 * @generated
	 */
	EClass getSingleEntityType();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaresExplicitAttribute <em>Declares Explicit Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Declares Explicit Attribute</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaresExplicitAttribute()
	 * @see #getSingleEntityType()
	 * @generated
	 */
	EReference getSingleEntityType_DeclaresExplicitAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaresAttribute <em>Declares Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declares Attribute</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaresAttribute()
	 * @see #getSingleEntityType()
	 * @generated
	 */
	EReference getSingleEntityType_DeclaresAttribute();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaredIn <em>Declared In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Declared In</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SingleEntityType#getDeclaredIn()
	 * @see #getSingleEntityType()
	 * @generated
	 */
	EReference getSingleEntityType_DeclaredIn();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getEquivalent <em>Equivalent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equivalent</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SingleEntityType#getEquivalent()
	 * @see #getSingleEntityType()
	 * @generated
	 */
	EReference getSingleEntityType_Equivalent();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.SingleEntityType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SingleEntityType#getId()
	 * @see #getSingleEntityType()
	 * @generated
	 */
	EReference getSingleEntityType_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.AGGREGATEType <em>AGGREGATE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AGGREGATE Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AGGREGATEType
	 * @generated
	 */
	EClass getAGGREGATEType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AGGREGATEType#getUpperBound()
	 * @see #getAGGREGATEType()
	 * @generated
	 */
	EReference getAGGREGATEType_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getMemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AGGREGATEType#getMemberType()
	 * @see #getAGGREGATEType()
	 * @generated
	 */
	EReference getAGGREGATEType_MemberType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AGGREGATEType#getConstraint()
	 * @see #getAGGREGATEType()
	 * @generated
	 */
	EReference getAGGREGATEType_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.AGGREGATEType#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AGGREGATEType#getLowerBound()
	 * @see #getAGGREGATEType()
	 * @generated
	 */
	EReference getAGGREGATEType_LowerBound();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.GeneralBAGType <em>General BAG Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General BAG Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GeneralBAGType
	 * @generated
	 */
	EClass getGeneralBAGType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.DomainRule <em>Domain Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Rule</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DomainRule
	 * @generated
	 */
	EClass getDomainRule();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.DomainRule#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DomainRule#getPosition()
	 * @see #getDomainRule()
	 * @generated
	 */
	EAttribute getDomainRule_Position();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.GeneralAggregationType <em>General Aggregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Aggregation Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GeneralAggregationType
	 * @generated
	 */
	EClass getGeneralAggregationType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.GeneralAggregationType#getMemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GeneralAggregationType#getMemberType()
	 * @see #getGeneralAggregationType()
	 * @generated
	 */
	EReference getGeneralAggregationType_MemberType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.ConcreteType <em>Concrete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ConcreteType
	 * @generated
	 */
	EClass getConcreteType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Expression#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaluation</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Expression#getEvaluation()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Evaluation();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Expression#getInterpretationContext <em>Interpretation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interpretation Context</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Expression#getInterpretationContext()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_InterpretationContext();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Expression#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Expression#getDataType()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.Expression#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Expression#getText()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Text();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.InverseAttribute <em>Inverse Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse Attribute</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InverseAttribute
	 * @generated
	 */
	EClass getInverseAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.InverseAttribute#getModelsRole <em>Models Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Models Role</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InverseAttribute#getModelsRole()
	 * @see #getInverseAttribute()
	 * @generated
	 */
	EReference getInverseAttribute_ModelsRole();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.InverseAttribute#getExplicit <em>Explicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Explicit</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InverseAttribute#getExplicit()
	 * @see #getInverseAttribute()
	 * @generated
	 */
	EReference getInverseAttribute_Explicit();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.InverseAttribute#getIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InverseAttribute#getIsUnique()
	 * @see #getInverseAttribute()
	 * @generated
	 */
	EAttribute getInverseAttribute_IsUnique();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.EnumerationType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EnumerationType#getValues()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_Values();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.core.EnumerationType#getDeclaredItems <em>Declared Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Items</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EnumerationType#getDeclaredItems()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_DeclaredItems();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.EnumerationType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EnumerationType#getExtension()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_Extension();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.EnumerationType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EnumerationType#getBase()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_Base();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.EnumerationType#getIsExtensible <em>Is Extensible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Extensible</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EnumerationType#getIsExtensible()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_IsExtensible();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.VariableType
	 * @generated
	 */
	EClass getVariableType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.ArrayBound <em>Array Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ArrayBound
	 * @generated
	 */
	EClass getArrayBound();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.ArrayBound#getBoundExpression <em>Bound Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Expression</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ArrayBound#getBoundExpression()
	 * @see #getArrayBound()
	 * @generated
	 */
	EReference getArrayBound_BoundExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.ArrayBound#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ArrayBound#getBound()
	 * @see #getArrayBound()
	 * @generated
	 */
	EAttribute getArrayBound_Bound();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.GeneralSETType <em>General SET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General SET Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GeneralSETType
	 * @generated
	 */
	EClass getGeneralSETType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.LISTType <em>LIST Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LIST Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.LISTType
	 * @generated
	 */
	EClass getLISTType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.Redeclaration <em>Redeclaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redeclaration</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration
	 * @generated
	 */
	EClass getRedeclaration();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derivation</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getDerivation()
	 * @see #getRedeclaration()
	 * @generated
	 */
	EReference getRedeclaration_Derivation();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getRestrictedType <em>Restricted Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Restricted Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getRestrictedType()
	 * @see #getRedeclaration()
	 * @generated
	 */
	EReference getRedeclaration_RestrictedType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getRefines()
	 * @see #getRedeclaration()
	 * @generated
	 */
	EReference getRedeclaration_Refines();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getUpperBound()
	 * @see #getRedeclaration()
	 * @generated
	 */
	EReference getRedeclaration_UpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getLowerBound()
	 * @see #getRedeclaration()
	 * @generated
	 */
	EReference getRedeclaration_LowerBound();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scope</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getScope()
	 * @see #getRedeclaration()
	 * @generated
	 */
	EReference getRedeclaration_Scope();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getOriginalAttribute <em>Original Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Attribute</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getOriginalAttribute()
	 * @see #getRedeclaration()
	 * @generated
	 */
	EReference getRedeclaration_OriginalAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getRefinedRole <em>Refined Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Role</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getRefinedRole()
	 * @see #getRedeclaration()
	 * @generated
	 */
	EReference getRedeclaration_RefinedRole();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getPosition()
	 * @see #getRedeclaration()
	 * @generated
	 */
	EAttribute getRedeclaration_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getIsMandatory()
	 * @see #getRedeclaration()
	 * @generated
	 */
	EAttribute getRedeclaration_IsMandatory();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Redeclaration#getAlias()
	 * @see #getRedeclaration()
	 * @generated
	 */
	EReference getRedeclaration_Alias();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.EntityType#getPlaysRole <em>Plays Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plays Role</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getPlaysRole()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_PlaysRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.core.EntityType#getRedeclarations <em>Redeclarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Redeclarations</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getRedeclarations()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Redeclarations();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.EntityType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getAttributes()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.EntityType#getPlaysRangeRole <em>Plays Range Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plays Range Role</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getPlaysRangeRole()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_PlaysRangeRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.EntityType#getDeclares <em>Declares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declares</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getDeclares()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Declares();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.EntityType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getExtension()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Extension();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.EntityType#getInvertibleAttributes <em>Invertible Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invertible Attributes</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getInvertibleAttributes()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_InvertibleAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.EntityType#getPlaysDomainRole <em>Plays Domain Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plays Domain Role</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getPlaysDomainRole()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_PlaysDomainRole();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.EntityType#getUniqueRules <em>Unique Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unique Rules</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getUniqueRules()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_UniqueRules();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.EntityType#getUsedIn <em>Used In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used In</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getUsedIn()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_UsedIn();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.EntityType#getSubtypeOf <em>Subtype Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtype Of</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getSubtypeOf()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_SubtypeOf();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.EntityType#getIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getIsAbstract()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_IsAbstract();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.DataType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DataType#getInstances()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Instances();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.PartialEntityType <em>Partial Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Entity Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.PartialEntityType
	 * @generated
	 */
	EClass getPartialEntityType();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.PartialEntityType#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see org.ifc4emf.metamodel.express.core.PartialEntityType#getComponents()
	 * @see #getPartialEntityType()
	 * @generated
	 */
	EReference getPartialEntityType_Components();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.Schema#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentation</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Schema#getDocumentation()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.core.Schema#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Schema#getInterfaces()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.core.Schema#getSchemaElements <em>Schema Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema Elements</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Schema#getSchemaElements()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_SchemaElements();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.Schema#getInterfacedElements <em>Interfaced Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaced Elements</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Schema#getInterfacedElements()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_InterfacedElements();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.Schema#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Schema#getVersion()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Version();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute <em>Invertible Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invertible Attribute</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InvertibleAttribute
	 * @generated
	 */
	EClass getInvertibleAttribute();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inverse</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InvertibleAttribute#getInverse()
	 * @see #getInvertibleAttribute()
	 * @generated
	 */
	EReference getInvertibleAttribute_Inverse();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getRangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Range Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InvertibleAttribute#getRangeType()
	 * @see #getInvertibleAttribute()
	 * @generated
	 */
	EReference getInvertibleAttribute_RangeType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getCreatesRelationship <em>Creates Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creates Relationship</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InvertibleAttribute#getCreatesRelationship()
	 * @see #getInvertibleAttribute()
	 * @generated
	 */
	EReference getInvertibleAttribute_CreatesRelationship();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getReferencingType <em>Referencing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InvertibleAttribute#getReferencingType()
	 * @see #getInvertibleAttribute()
	 * @generated
	 */
	EReference getInvertibleAttribute_ReferencingType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.InvertibleAttribute#getModelsRole <em>Models Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Models Role</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InvertibleAttribute#getModelsRole()
	 * @see #getInvertibleAttribute()
	 * @generated
	 */
	EReference getInvertibleAttribute_ModelsRole();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.GeneralizedType <em>Generalized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalized Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GeneralizedType
	 * @generated
	 */
	EClass getGeneralizedType();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.GeneralizedType#getOccursIn <em>Occurs In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occurs In</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GeneralizedType#getOccursIn()
	 * @see #getGeneralizedType()
	 * @generated
	 */
	EReference getGeneralizedType_OccursIn();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.InterfacedElement <em>Interfaced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaced Element</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InterfacedElement
	 * @generated
	 */
	EClass getInterfacedElement();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getInterfacingSchema <em>Interfacing Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interfacing Schema</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InterfacedElement#getInterfacingSchema()
	 * @see #getInterfacedElement()
	 * @generated
	 */
	EReference getInterfacedElement_InterfacingSchema();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InterfacedElement#getRefersTo()
	 * @see #getInterfacedElement()
	 * @generated
	 */
	EReference getInterfacedElement_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getIsUSE <em>Is USE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is USE</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InterfacedElement#getIsUSE()
	 * @see #getInterfacedElement()
	 * @generated
	 */
	EAttribute getInterfacedElement_IsUSE();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getInterfacedId <em>Interfaced Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaced Id</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InterfacedElement#getInterfacedId()
	 * @see #getInterfacedElement()
	 * @generated
	 */
	EReference getInterfacedElement_InterfacedId();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.NumericType
	 * @generated
	 */
	EClass getNumericType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.DefinedType <em>Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defined Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DefinedType
	 * @generated
	 */
	EClass getDefinedType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.UniqueRule <em>Unique Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Rule</em>'.
	 * @see org.ifc4emf.metamodel.express.core.UniqueRule
	 * @generated
	 */
	EClass getUniqueRule();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.UniqueRule#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see org.ifc4emf.metamodel.express.core.UniqueRule#getDomain()
	 * @see #getUniqueRule()
	 * @generated
	 */
	EReference getUniqueRule_Domain();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.UniqueRule#getKeyComponent <em>Key Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key Component</em>'.
	 * @see org.ifc4emf.metamodel.express.core.UniqueRule#getKeyComponent()
	 * @see #getUniqueRule()
	 * @generated
	 */
	EReference getUniqueRule_KeyComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.UniqueRule#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.ifc4emf.metamodel.express.core.UniqueRule#getPosition()
	 * @see #getUniqueRule()
	 * @generated
	 */
	EAttribute getUniqueRule_Position();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.DomainRole <em>Domain Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Role</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DomainRole
	 * @generated
	 */
	EClass getDomainRole();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.DomainRole#getRangeView <em>Range View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range View</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DomainRole#getRangeView()
	 * @see #getDomainRole()
	 * @generated
	 */
	EReference getDomainRole_RangeView();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.DomainRole#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DomainRole#getDomain()
	 * @see #getDomainRole()
	 * @generated
	 */
	EReference getDomainRole_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.DomainRole#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DomainRole#getId()
	 * @see #getDomainRole()
	 * @generated
	 */
	EReference getDomainRole_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.DomainConstraint <em>Domain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DomainConstraint
	 * @generated
	 */
	EClass getDomainConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.DomainConstraint#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DomainConstraint#getDomain()
	 * @see #getDomainConstraint()
	 * @generated
	 */
	EReference getDomainConstraint_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.DomainConstraint#getAsserts <em>Asserts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asserts</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DomainConstraint#getAsserts()
	 * @see #getDomainConstraint()
	 * @generated
	 */
	EReference getDomainConstraint_Asserts();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.InstantiableType <em>Instantiable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiable Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InstantiableType
	 * @generated
	 */
	EClass getInstantiableType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.InstantiableType#getFundamentalType <em>Fundamental Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fundamental Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.InstantiableType#getFundamentalType()
	 * @see #getInstantiableType()
	 * @generated
	 */
	EReference getInstantiableType_FundamentalType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.GeneralLISTType <em>General LIST Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General LIST Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GeneralLISTType
	 * @generated
	 */
	EClass getGeneralLISTType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.ifc4emf.metamodel.express.core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see org.ifc4emf.metamodel.express.core.NamedElement#getNamespace()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Namespace();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.NamedElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentation</em>'.
	 * @see org.ifc4emf.metamodel.express.core.NamedElement#getDocumentation()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.NamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.core.NamedElement#getId()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Attribute#getAttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Attribute#getAttributeType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_AttributeType();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.core.Attribute#getOfEntity <em>Of Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Of Entity</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Attribute#getOfEntity()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_OfEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.Attribute#getIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Attribute#getIsAbstract()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.Attribute#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Attribute#getPosition()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Position();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.Attribute#getOwningEntity <em>Owning Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owning Entity</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Attribute#getOwningEntity()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_OwningEntity();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.BAGType <em>BAG Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAG Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.BAGType
	 * @generated
	 */
	EClass getBAGType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.RealType
	 * @generated
	 */
	EClass getRealType();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.RealType#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.ifc4emf.metamodel.express.core.RealType#getPrecision()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_Precision();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.LogicType <em>Logic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.LogicType
	 * @generated
	 */
	EClass getLogicType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.GenericType <em>Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GenericType
	 * @generated
	 */
	EClass getGenericType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.GenericType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GenericType#getConstraint()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.GenericType#getIsEntity <em>Is Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Entity</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GenericType#getIsEntity()
	 * @see #getGenericType()
	 * @generated
	 */
	EAttribute getGenericType_IsEntity();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.StringType#getStringLengthConstraint <em>String Length Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Length Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.core.StringType#getStringLengthConstraint()
	 * @see #getStringType()
	 * @generated
	 */
	EReference getStringType_StringLengthConstraint();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.AnonymousType <em>Anonymous Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AnonymousType
	 * @generated
	 */
	EClass getAnonymousType();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.AnonymousType#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specializes</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AnonymousType#getSpecializes()
	 * @see #getAnonymousType()
	 * @generated
	 */
	EReference getAnonymousType_Specializes();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.AlgorithmScope <em>Algorithm Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm Scope</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AlgorithmScope
	 * @generated
	 */
	EClass getAlgorithmScope();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.AlgorithmScope#getCommonElements <em>Common Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Common Elements</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AlgorithmScope#getCommonElements()
	 * @see #getAlgorithmScope()
	 * @generated
	 */
	EReference getAlgorithmScope_CommonElements();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.AlgorithmScope#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AlgorithmScope#getVariables()
	 * @see #getAlgorithmScope()
	 * @generated
	 */
	EReference getAlgorithmScope_Variables();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.Instance#getAppearsInPopulation <em>Appears In Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appears In Population</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Instance#getAppearsInPopulation()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_AppearsInPopulation();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.Instance#getOfType <em>Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Of Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Instance#getOfType()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_OfType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AttributeType
	 * @generated
	 */
	EClass getAttributeType();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.AttributeType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AttributeType#getRole()
	 * @see #getAttributeType()
	 * @generated
	 */
	EReference getAttributeType_Role();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.AttributeType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraints</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AttributeType#getConstraints()
	 * @see #getAttributeType()
	 * @generated
	 */
	EReference getAttributeType_Constraints();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.DerivedAttribute <em>Derived Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Attribute</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DerivedAttribute
	 * @generated
	 */
	EClass getDerivedAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.DerivedAttribute#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derivation</em>'.
	 * @see org.ifc4emf.metamodel.express.core.DerivedAttribute#getDerivation()
	 * @see #getDerivedAttribute()
	 * @generated
	 */
	EReference getDerivedAttribute_Derivation();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.RangeRole <em>Range Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Role</em>'.
	 * @see org.ifc4emf.metamodel.express.core.RangeRole
	 * @generated
	 */
	EClass getRangeRole();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.RangeRole#getDomainView <em>Domain View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain View</em>'.
	 * @see org.ifc4emf.metamodel.express.core.RangeRole#getDomainView()
	 * @see #getRangeRole()
	 * @generated
	 */
	EReference getRangeRole_DomainView();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.RangeRole#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see org.ifc4emf.metamodel.express.core.RangeRole#getRange()
	 * @see #getRangeRole()
	 * @generated
	 */
	EReference getRangeRole_Range();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.RangeRole#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.core.RangeRole#getId()
	 * @see #getRangeRole()
	 * @generated
	 */
	EReference getRangeRole_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.LocalElement <em>Local Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Element</em>'.
	 * @see org.ifc4emf.metamodel.express.core.LocalElement
	 * @generated
	 */
	EClass getLocalElement();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.Remark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remark</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Remark
	 * @generated
	 */
	EClass getRemark();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.Remark#getDescribesSchema <em>Describes Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Describes Schema</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Remark#getDescribesSchema()
	 * @see #getRemark()
	 * @generated
	 */
	EReference getRemark_DescribesSchema();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Remark#getAppearsIn <em>Appears In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Appears In</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Remark#getAppearsIn()
	 * @see #getRemark()
	 * @generated
	 */
	EReference getRemark_AppearsIn();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.Remark#getDescribesElement <em>Describes Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Describes Element</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Remark#getDescribesElement()
	 * @see #getRemark()
	 * @generated
	 */
	EReference getRemark_DescribesElement();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.Remark#getIsTagged <em>Is Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tagged</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Remark#getIsTagged()
	 * @see #getRemark()
	 * @generated
	 */
	EAttribute getRemark_IsTagged();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.Remark#getIsTail <em>Is Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tail</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Remark#getIsTail()
	 * @see #getRemark()
	 * @generated
	 */
	EAttribute getRemark_IsTail();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.Remark#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Remark#getText()
	 * @see #getRemark()
	 * @generated
	 */
	EAttribute getRemark_Text();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.SizeConstraint <em>Size Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SizeConstraint
	 * @generated
	 */
	EClass getSizeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.SizeConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SizeConstraint#getBound()
	 * @see #getSizeConstraint()
	 * @generated
	 */
	EAttribute getSizeConstraint_Bound();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Role#getInRelationship <em>In Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Relationship</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Role#getInRelationship()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_InRelationship();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.Role#getOfEntity <em>Of Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Of Entity</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Role#getOfEntity()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_OfEntity();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Role#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Upper Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Role#getUpperBound()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Role#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lower Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Role#getLowerBound()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_LowerBound();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.SETType <em>SET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SET Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SETType
	 * @generated
	 */
	EClass getSETType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.SpecializedType <em>Specialized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialized Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SpecializedType
	 * @generated
	 */
	EClass getSpecializedType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.SpecializedType#getUnderlyingType <em>Underlying Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Underlying Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SpecializedType#getUnderlyingType()
	 * @see #getSpecializedType()
	 * @generated
	 */
	EReference getSpecializedType_UnderlyingType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.GeneralARRAYType <em>General ARRAY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General ARRAY Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GeneralARRAYType
	 * @generated
	 */
	EClass getGeneralARRAYType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.GeneralARRAYType#getHiIndex <em>Hi Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hi Index</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GeneralARRAYType#getHiIndex()
	 * @see #getGeneralARRAYType()
	 * @generated
	 */
	EReference getGeneralARRAYType_HiIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.GeneralARRAYType#getLoIndex <em>Lo Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lo Index</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GeneralARRAYType#getLoIndex()
	 * @see #getGeneralARRAYType()
	 * @generated
	 */
	EReference getGeneralARRAYType_LoIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.GeneralARRAYType#getIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.ifc4emf.metamodel.express.core.GeneralARRAYType#getIsOptional()
	 * @see #getGeneralARRAYType()
	 * @generated
	 */
	EAttribute getGeneralARRAYType_IsOptional();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Relationship#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Relationship#getDomain()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Domain();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.Relationship#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Relationship#getRoles()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Roles();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Relationship#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Based On</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Relationship#getBasedOn()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_BasedOn();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.Relationship#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Relationship#getRange()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Range();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.LengthConstraint <em>Length Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.core.LengthConstraint
	 * @generated
	 */
	EClass getLengthConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.LengthConstraint#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.ifc4emf.metamodel.express.core.LengthConstraint#getMaxLength()
	 * @see #getLengthConstraint()
	 * @generated
	 */
	EAttribute getLengthConstraint_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.LengthConstraint#getIsFixed <em>Is Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fixed</em>'.
	 * @see org.ifc4emf.metamodel.express.core.LengthConstraint#getIsFixed()
	 * @see #getLengthConstraint()
	 * @generated
	 */
	EAttribute getLengthConstraint_IsFixed();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.LocalScope <em>Local Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Scope</em>'.
	 * @see org.ifc4emf.metamodel.express.core.LocalScope
	 * @generated
	 */
	EClass getLocalScope();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.LocalScope#getLocalElements <em>Local Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Local Elements</em>'.
	 * @see org.ifc4emf.metamodel.express.core.LocalScope#getLocalElements()
	 * @see #getLocalScope()
	 * @generated
	 */
	EReference getLocalScope_LocalElements();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.NamedType <em>Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.NamedType
	 * @generated
	 */
	EClass getNamedType();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.NamedType#getInstantiates <em>Instantiates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiates</em>'.
	 * @see org.ifc4emf.metamodel.express.core.NamedType#getInstantiates()
	 * @see #getNamedType()
	 * @generated
	 */
	EReference getNamedType_Instantiates();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.NamedType#getDomainRules <em>Domain Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Rules</em>'.
	 * @see org.ifc4emf.metamodel.express.core.NamedType#getDomainRules()
	 * @see #getNamedType()
	 * @generated
	 */
	EReference getNamedType_DomainRules();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.BinaryType
	 * @generated
	 */
	EClass getBinaryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.BinaryType#getBinaryLengthConstraint <em>Binary Length Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary Length Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.core.BinaryType#getBinaryLengthConstraint()
	 * @see #getBinaryType()
	 * @generated
	 */
	EReference getBinaryType_BinaryLengthConstraint();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.ScopedId <em>Scoped Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Id</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ScopedId
	 * @generated
	 */
	EClass getScopedId();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.ScopedId#getLocalName <em>Local Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Name</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ScopedId#getLocalName()
	 * @see #getScopedId()
	 * @generated
	 */
	EAttribute getScopedId_LocalName();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.ScopedId#getDefiningScope <em>Defining Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defining Scope</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ScopedId#getDefiningScope()
	 * @see #getScopedId()
	 * @generated
	 */
	EReference getScopedId_DefiningScope();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.AggregationType <em>Aggregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AggregationType
	 * @generated
	 */
	EClass getAggregationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.AggregationType#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AggregationType#getLowerBound()
	 * @see #getAggregationType()
	 * @generated
	 */
	EReference getAggregationType_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.AggregationType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AggregationType#getUpperBound()
	 * @see #getAggregationType()
	 * @generated
	 */
	EReference getAggregationType_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.AggregationType#getIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AggregationType#getIsUnique()
	 * @see #getAggregationType()
	 * @generated
	 */
	EAttribute getAggregationType_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.AggregationType#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see org.ifc4emf.metamodel.express.core.AggregationType#getOrdering()
	 * @see #getAggregationType()
	 * @generated
	 */
	EAttribute getAggregationType_Ordering();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.Scope#getNamedElements <em>Named Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Named Elements</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Scope#getNamedElements()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_NamedElements();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.Scope#getIncludesRemarks <em>Includes Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes Remarks</em>'.
	 * @see org.ifc4emf.metamodel.express.core.Scope#getIncludesRemarks()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_IncludesRemarks();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.ParameterType#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ParameterType#getContains()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_Contains();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.SelectType <em>Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SelectType
	 * @generated
	 */
	EClass getSelectType();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.SelectType#getAllowedTypes <em>Allowed Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Types</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SelectType#getAllowedTypes()
	 * @see #getSelectType()
	 * @generated
	 */
	EReference getSelectType_AllowedTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.SelectType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SelectType#getExtension()
	 * @see #getSelectType()
	 * @generated
	 */
	EReference getSelectType_Extension();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.SelectType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SelectType#getBase()
	 * @see #getSelectType()
	 * @generated
	 */
	EReference getSelectType_Base();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.SelectType#getSelectList <em>Select List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Select List</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SelectType#getSelectList()
	 * @see #getSelectType()
	 * @generated
	 */
	EReference getSelectType_SelectList();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.SelectType#getIsExtensible <em>Is Extensible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Extensible</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SelectType#getIsExtensible()
	 * @see #getSelectType()
	 * @generated
	 */
	EAttribute getSelectType_IsExtensible();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.SelectType#getIsEntity <em>Is Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Entity</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SelectType#getIsEntity()
	 * @see #getSelectType()
	 * @generated
	 */
	EAttribute getSelectType_IsEntity();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.ActualType <em>Actual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ActualType
	 * @generated
	 */
	EClass getActualType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.ActualType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ActualType#getScope()
	 * @see #getActualType()
	 * @generated
	 */
	EReference getActualType_Scope();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.ExplicitAttribute <em>Explicit Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Attribute</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ExplicitAttribute
	 * @generated
	 */
	EClass getExplicitAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.ExplicitAttribute#getIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ExplicitAttribute#getIsOptional()
	 * @see #getExplicitAttribute()
	 * @generated
	 */
	EAttribute getExplicitAttribute_IsOptional();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.SimpleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SimpleType#getId()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.CommonElement <em>Common Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Element</em>'.
	 * @see org.ifc4emf.metamodel.express.core.CommonElement
	 * @generated
	 */
	EClass getCommonElement();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.CommonElement#getLocalScope <em>Local Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local Scope</em>'.
	 * @see org.ifc4emf.metamodel.express.core.CommonElement#getLocalScope()
	 * @see #getCommonElement()
	 * @generated
	 */
	EReference getCommonElement_LocalScope();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.SchemaElement <em>Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Element</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SchemaElement
	 * @generated
	 */
	EClass getSchemaElement();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.SchemaElement#getReferencedAs <em>Referenced As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced As</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SchemaElement#getReferencedAs()
	 * @see #getSchemaElement()
	 * @generated
	 */
	EReference getSchemaElement_ReferencedAs();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.core.SchemaElement#getReferencedIn <em>Referenced In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced In</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SchemaElement#getReferencedIn()
	 * @see #getSchemaElement()
	 * @generated
	 */
	EReference getSchemaElement_ReferencedIn();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.core.SchemaElement#getDefinedIn <em>Defined In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Defined In</em>'.
	 * @see org.ifc4emf.metamodel.express.core.SchemaElement#getDefinedIn()
	 * @see #getSchemaElement()
	 * @generated
	 */
	EReference getSchemaElement_DefinedIn();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.ConcreteAggregationType <em>Concrete Aggregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Aggregation Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ConcreteAggregationType
	 * @generated
	 */
	EClass getConcreteAggregationType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.core.ConcreteAggregationType#getMemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ConcreteAggregationType#getMemberType()
	 * @see #getConcreteAggregationType()
	 * @generated
	 */
	EReference getConcreteAggregationType_MemberType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.core.ARRAYType <em>ARRAY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARRAY Type</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ARRAYType
	 * @generated
	 */
	EClass getARRAYType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.ARRAYType#getLoIndex <em>Lo Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lo Index</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ARRAYType#getLoIndex()
	 * @see #getARRAYType()
	 * @generated
	 */
	EReference getARRAYType_LoIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.core.ARRAYType#getHiIndex <em>Hi Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hi Index</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ARRAYType#getHiIndex()
	 * @see #getARRAYType()
	 * @generated
	 */
	EReference getARRAYType_HiIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.core.ARRAYType#getIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.ifc4emf.metamodel.express.core.ARRAYType#getIsOptional()
	 * @see #getARRAYType()
	 * @generated
	 */
	EAttribute getARRAYType_IsOptional();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Keyword</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getKeyword();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Express Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Express Text</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getExpressText();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ordering Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ordering Kind</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getOrderingKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.TypeElementImpl <em>Type Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.TypeElementImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getTypeElement()
		 * @generated
		 */
		EClass TYPE_ELEMENT = eINSTANCE.getTypeElement();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.SingleEntityTypeImpl <em>Single Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.SingleEntityTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSingleEntityType()
		 * @generated
		 */
		EClass SINGLE_ENTITY_TYPE = eINSTANCE.getSingleEntityType();

		/**
		 * The meta object literal for the '<em><b>Declares Explicit Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ENTITY_TYPE__DECLARES_EXPLICIT_ATTRIBUTE = eINSTANCE.getSingleEntityType_DeclaresExplicitAttribute();

		/**
		 * The meta object literal for the '<em><b>Declares Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE = eINSTANCE.getSingleEntityType_DeclaresAttribute();

		/**
		 * The meta object literal for the '<em><b>Declared In</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ENTITY_TYPE__DECLARED_IN = eINSTANCE.getSingleEntityType_DeclaredIn();

		/**
		 * The meta object literal for the '<em><b>Equivalent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ENTITY_TYPE__EQUIVALENT = eINSTANCE.getSingleEntityType_Equivalent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ENTITY_TYPE__ID = eINSTANCE.getSingleEntityType_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.AGGREGATETypeImpl <em>AGGREGATE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.AGGREGATETypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAGGREGATEType()
		 * @generated
		 */
		EClass AGGREGATE_TYPE = eINSTANCE.getAGGREGATEType();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_TYPE__UPPER_BOUND = eINSTANCE.getAGGREGATEType_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Member Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_TYPE__MEMBER_TYPE = eINSTANCE.getAGGREGATEType_MemberType();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_TYPE__CONSTRAINT = eINSTANCE.getAGGREGATEType_Constraint();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_TYPE__LOWER_BOUND = eINSTANCE.getAGGREGATEType_LowerBound();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralBAGTypeImpl <em>General BAG Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.GeneralBAGTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralBAGType()
		 * @generated
		 */
		EClass GENERAL_BAG_TYPE = eINSTANCE.getGeneralBAGType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.DomainRuleImpl <em>Domain Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.DomainRuleImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDomainRule()
		 * @generated
		 */
		EClass DOMAIN_RULE = eINSTANCE.getDomainRule();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_RULE__POSITION = eINSTANCE.getDomainRule_Position();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralAggregationTypeImpl <em>General Aggregation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.GeneralAggregationTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralAggregationType()
		 * @generated
		 */
		EClass GENERAL_AGGREGATION_TYPE = eINSTANCE.getGeneralAggregationType();

		/**
		 * The meta object literal for the '<em><b>Member Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_AGGREGATION_TYPE__MEMBER_TYPE = eINSTANCE.getGeneralAggregationType_MemberType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.ConcreteTypeImpl <em>Concrete Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.ConcreteTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getConcreteType()
		 * @generated
		 */
		EClass CONCRETE_TYPE = eINSTANCE.getConcreteType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.ExpressionImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EVALUATION = eINSTANCE.getExpression_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Interpretation Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__INTERPRETATION_CONTEXT = eINSTANCE.getExpression_InterpretationContext();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__DATA_TYPE = eINSTANCE.getExpression_DataType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__TEXT = eINSTANCE.getExpression_Text();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.InverseAttributeImpl <em>Inverse Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.InverseAttributeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getInverseAttribute()
		 * @generated
		 */
		EClass INVERSE_ATTRIBUTE = eINSTANCE.getInverseAttribute();

		/**
		 * The meta object literal for the '<em><b>Models Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERSE_ATTRIBUTE__MODELS_ROLE = eINSTANCE.getInverseAttribute_ModelsRole();

		/**
		 * The meta object literal for the '<em><b>Explicit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERSE_ATTRIBUTE__EXPLICIT = eINSTANCE.getInverseAttribute_Explicit();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVERSE_ATTRIBUTE__IS_UNIQUE = eINSTANCE.getInverseAttribute_IsUnique();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.EnumerationTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__VALUES = eINSTANCE.getEnumerationType_Values();

		/**
		 * The meta object literal for the '<em><b>Declared Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__DECLARED_ITEMS = eINSTANCE.getEnumerationType_DeclaredItems();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__EXTENSION = eINSTANCE.getEnumerationType_Extension();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__BASE = eINSTANCE.getEnumerationType_Base();

		/**
		 * The meta object literal for the '<em><b>Is Extensible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__IS_EXTENSIBLE = eINSTANCE.getEnumerationType_IsExtensible();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.VariableTypeImpl <em>Variable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.VariableTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getVariableType()
		 * @generated
		 */
		EClass VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.ArrayBoundImpl <em>Array Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.ArrayBoundImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getArrayBound()
		 * @generated
		 */
		EClass ARRAY_BOUND = eINSTANCE.getArrayBound();

		/**
		 * The meta object literal for the '<em><b>Bound Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_BOUND__BOUND_EXPRESSION = eINSTANCE.getArrayBound_BoundExpression();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_BOUND__BOUND = eINSTANCE.getArrayBound_Bound();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralSETTypeImpl <em>General SET Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.GeneralSETTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralSETType()
		 * @generated
		 */
		EClass GENERAL_SET_TYPE = eINSTANCE.getGeneralSETType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.LISTTypeImpl <em>LIST Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.LISTTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getLISTType()
		 * @generated
		 */
		EClass LIST_TYPE = eINSTANCE.getLISTType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl <em>Redeclaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRedeclaration()
		 * @generated
		 */
		EClass REDECLARATION = eINSTANCE.getRedeclaration();

		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDECLARATION__DERIVATION = eINSTANCE.getRedeclaration_Derivation();

		/**
		 * The meta object literal for the '<em><b>Restricted Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDECLARATION__RESTRICTED_TYPE = eINSTANCE.getRedeclaration_RestrictedType();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDECLARATION__REFINES = eINSTANCE.getRedeclaration_Refines();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDECLARATION__UPPER_BOUND = eINSTANCE.getRedeclaration_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDECLARATION__LOWER_BOUND = eINSTANCE.getRedeclaration_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDECLARATION__SCOPE = eINSTANCE.getRedeclaration_Scope();

		/**
		 * The meta object literal for the '<em><b>Original Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDECLARATION__ORIGINAL_ATTRIBUTE = eINSTANCE.getRedeclaration_OriginalAttribute();

		/**
		 * The meta object literal for the '<em><b>Refined Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDECLARATION__REFINED_ROLE = eINSTANCE.getRedeclaration_RefinedRole();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDECLARATION__POSITION = eINSTANCE.getRedeclaration_Position();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDECLARATION__IS_MANDATORY = eINSTANCE.getRedeclaration_IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDECLARATION__ALIAS = eINSTANCE.getRedeclaration_Alias();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Plays Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__PLAYS_ROLE = eINSTANCE.getEntityType_PlaysRole();

		/**
		 * The meta object literal for the '<em><b>Redeclarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__REDECLARATIONS = eINSTANCE.getEntityType_Redeclarations();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__ATTRIBUTES = eINSTANCE.getEntityType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Plays Range Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__PLAYS_RANGE_ROLE = eINSTANCE.getEntityType_PlaysRangeRole();

		/**
		 * The meta object literal for the '<em><b>Declares</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__DECLARES = eINSTANCE.getEntityType_Declares();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__EXTENSION = eINSTANCE.getEntityType_Extension();

		/**
		 * The meta object literal for the '<em><b>Invertible Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__INVERTIBLE_ATTRIBUTES = eINSTANCE.getEntityType_InvertibleAttributes();

		/**
		 * The meta object literal for the '<em><b>Plays Domain Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__PLAYS_DOMAIN_ROLE = eINSTANCE.getEntityType_PlaysDomainRole();

		/**
		 * The meta object literal for the '<em><b>Unique Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__UNIQUE_RULES = eINSTANCE.getEntityType_UniqueRules();

		/**
		 * The meta object literal for the '<em><b>Used In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__USED_IN = eINSTANCE.getEntityType_UsedIn();

		/**
		 * The meta object literal for the '<em><b>Subtype Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SUBTYPE_OF = eINSTANCE.getEntityType_SubtypeOf();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__IS_ABSTRACT = eINSTANCE.getEntityType_IsAbstract();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.DataTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__INSTANCES = eINSTANCE.getDataType_Instances();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.PartialEntityTypeImpl <em>Partial Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.PartialEntityTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getPartialEntityType()
		 * @generated
		 */
		EClass PARTIAL_ENTITY_TYPE = eINSTANCE.getPartialEntityType();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_ENTITY_TYPE__COMPONENTS = eINSTANCE.getPartialEntityType_Components();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.SchemaImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DOCUMENTATION = eINSTANCE.getSchema_Documentation();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__INTERFACES = eINSTANCE.getSchema_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Schema Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__SCHEMA_ELEMENTS = eINSTANCE.getSchema_SchemaElements();

		/**
		 * The meta object literal for the '<em><b>Interfaced Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__INTERFACED_ELEMENTS = eINSTANCE.getSchema_InterfacedElements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__VERSION = eINSTANCE.getSchema_Version();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.InvertibleAttributeImpl <em>Invertible Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.InvertibleAttributeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getInvertibleAttribute()
		 * @generated
		 */
		EClass INVERTIBLE_ATTRIBUTE = eINSTANCE.getInvertibleAttribute();

		/**
		 * The meta object literal for the '<em><b>Inverse</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTIBLE_ATTRIBUTE__INVERSE = eINSTANCE.getInvertibleAttribute_Inverse();

		/**
		 * The meta object literal for the '<em><b>Range Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTIBLE_ATTRIBUTE__RANGE_TYPE = eINSTANCE.getInvertibleAttribute_RangeType();

		/**
		 * The meta object literal for the '<em><b>Creates Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTIBLE_ATTRIBUTE__CREATES_RELATIONSHIP = eINSTANCE.getInvertibleAttribute_CreatesRelationship();

		/**
		 * The meta object literal for the '<em><b>Referencing Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTIBLE_ATTRIBUTE__REFERENCING_TYPE = eINSTANCE.getInvertibleAttribute_ReferencingType();

		/**
		 * The meta object literal for the '<em><b>Models Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTIBLE_ATTRIBUTE__MODELS_ROLE = eINSTANCE.getInvertibleAttribute_ModelsRole();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralizedTypeImpl <em>Generalized Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.GeneralizedTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralizedType()
		 * @generated
		 */
		EClass GENERALIZED_TYPE = eINSTANCE.getGeneralizedType();

		/**
		 * The meta object literal for the '<em><b>Occurs In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZED_TYPE__OCCURS_IN = eINSTANCE.getGeneralizedType_OccursIn();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.InterfacedElementImpl <em>Interfaced Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.InterfacedElementImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getInterfacedElement()
		 * @generated
		 */
		EClass INTERFACED_ELEMENT = eINSTANCE.getInterfacedElement();

		/**
		 * The meta object literal for the '<em><b>Interfacing Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACED_ELEMENT__INTERFACING_SCHEMA = eINSTANCE.getInterfacedElement_InterfacingSchema();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACED_ELEMENT__REFERS_TO = eINSTANCE.getInterfacedElement_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Is USE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACED_ELEMENT__IS_USE = eINSTANCE.getInterfacedElement_IsUSE();

		/**
		 * The meta object literal for the '<em><b>Interfaced Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACED_ELEMENT__INTERFACED_ID = eINSTANCE.getInterfacedElement_InterfacedId();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.NumericTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getNumericType()
		 * @generated
		 */
		EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.DefinedTypeImpl <em>Defined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.DefinedTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDefinedType()
		 * @generated
		 */
		EClass DEFINED_TYPE = eINSTANCE.getDefinedType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.UniqueRuleImpl <em>Unique Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.UniqueRuleImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getUniqueRule()
		 * @generated
		 */
		EClass UNIQUE_RULE = eINSTANCE.getUniqueRule();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUE_RULE__DOMAIN = eINSTANCE.getUniqueRule_Domain();

		/**
		 * The meta object literal for the '<em><b>Key Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUE_RULE__KEY_COMPONENT = eINSTANCE.getUniqueRule_KeyComponent();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUE_RULE__POSITION = eINSTANCE.getUniqueRule_Position();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.DomainRoleImpl <em>Domain Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.DomainRoleImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDomainRole()
		 * @generated
		 */
		EClass DOMAIN_ROLE = eINSTANCE.getDomainRole();

		/**
		 * The meta object literal for the '<em><b>Range View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ROLE__RANGE_VIEW = eINSTANCE.getDomainRole_RangeView();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ROLE__DOMAIN = eINSTANCE.getDomainRole_Domain();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ROLE__ID = eINSTANCE.getDomainRole_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.DomainConstraintImpl <em>Domain Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.DomainConstraintImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDomainConstraint()
		 * @generated
		 */
		EClass DOMAIN_CONSTRAINT = eINSTANCE.getDomainConstraint();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONSTRAINT__DOMAIN = eINSTANCE.getDomainConstraint_Domain();

		/**
		 * The meta object literal for the '<em><b>Asserts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONSTRAINT__ASSERTS = eINSTANCE.getDomainConstraint_Asserts();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.InstantiableTypeImpl <em>Instantiable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.InstantiableTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getInstantiableType()
		 * @generated
		 */
		EClass INSTANTIABLE_TYPE = eINSTANCE.getInstantiableType();

		/**
		 * The meta object literal for the '<em><b>Fundamental Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIABLE_TYPE__FUNDAMENTAL_TYPE = eINSTANCE.getInstantiableType_FundamentalType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralLISTTypeImpl <em>General LIST Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.GeneralLISTTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralLISTType()
		 * @generated
		 */
		EClass GENERAL_LIST_TYPE = eINSTANCE.getGeneralLISTType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.NamedElementImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__NAMESPACE = eINSTANCE.getNamedElement_Namespace();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__DOCUMENTATION = eINSTANCE.getNamedElement_Documentation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__ID = eINSTANCE.getNamedElement_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.AttributeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTE_TYPE = eINSTANCE.getAttribute_AttributeType();

		/**
		 * The meta object literal for the '<em><b>Of Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OF_ENTITY = eINSTANCE.getAttribute_OfEntity();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_ABSTRACT = eINSTANCE.getAttribute_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__POSITION = eINSTANCE.getAttribute_Position();

		/**
		 * The meta object literal for the '<em><b>Owning Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OWNING_ENTITY = eINSTANCE.getAttribute_OwningEntity();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.BAGTypeImpl <em>BAG Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.BAGTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getBAGType()
		 * @generated
		 */
		EClass BAG_TYPE = eINSTANCE.getBAGType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.RealTypeImpl <em>Real Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.RealTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRealType()
		 * @generated
		 */
		EClass REAL_TYPE = eINSTANCE.getRealType();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE__PRECISION = eINSTANCE.getRealType_Precision();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.LogicTypeImpl <em>Logic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.LogicTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getLogicType()
		 * @generated
		 */
		EClass LOGIC_TYPE = eINSTANCE.getLogicType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.GenericTypeImpl <em>Generic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.GenericTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGenericType()
		 * @generated
		 */
		EClass GENERIC_TYPE = eINSTANCE.getGenericType();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE__CONSTRAINT = eINSTANCE.getGenericType_Constraint();

		/**
		 * The meta object literal for the '<em><b>Is Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_TYPE__IS_ENTITY = eINSTANCE.getGenericType_IsEntity();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.StringTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '<em><b>String Length Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TYPE__STRING_LENGTH_CONSTRAINT = eINSTANCE.getStringType_StringLengthConstraint();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.AnonymousTypeImpl <em>Anonymous Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.AnonymousTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAnonymousType()
		 * @generated
		 */
		EClass ANONYMOUS_TYPE = eINSTANCE.getAnonymousType();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_TYPE__SPECIALIZES = eINSTANCE.getAnonymousType_Specializes();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.AlgorithmScopeImpl <em>Algorithm Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.AlgorithmScopeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAlgorithmScope()
		 * @generated
		 */
		EClass ALGORITHM_SCOPE = eINSTANCE.getAlgorithmScope();

		/**
		 * The meta object literal for the '<em><b>Common Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM_SCOPE__COMMON_ELEMENTS = eINSTANCE.getAlgorithmScope_CommonElements();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM_SCOPE__VARIABLES = eINSTANCE.getAlgorithmScope_Variables();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.InstanceImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Appears In Population</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__APPEARS_IN_POPULATION = eINSTANCE.getInstance_AppearsInPopulation();

		/**
		 * The meta object literal for the '<em><b>Of Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__OF_TYPE = eINSTANCE.getInstance_OfType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.AttributeTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAttributeType()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE__ROLE = eINSTANCE.getAttributeType_Role();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE__CONSTRAINTS = eINSTANCE.getAttributeType_Constraints();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.DerivedAttributeImpl <em>Derived Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.DerivedAttributeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getDerivedAttribute()
		 * @generated
		 */
		EClass DERIVED_ATTRIBUTE = eINSTANCE.getDerivedAttribute();

		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_ATTRIBUTE__DERIVATION = eINSTANCE.getDerivedAttribute_Derivation();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.RangeRoleImpl <em>Range Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.RangeRoleImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRangeRole()
		 * @generated
		 */
		EClass RANGE_ROLE = eINSTANCE.getRangeRole();

		/**
		 * The meta object literal for the '<em><b>Domain View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_ROLE__DOMAIN_VIEW = eINSTANCE.getRangeRole_DomainView();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_ROLE__RANGE = eINSTANCE.getRangeRole_Range();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_ROLE__ID = eINSTANCE.getRangeRole_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.LocalElementImpl <em>Local Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.LocalElementImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getLocalElement()
		 * @generated
		 */
		EClass LOCAL_ELEMENT = eINSTANCE.getLocalElement();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.RemarkImpl <em>Remark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.RemarkImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRemark()
		 * @generated
		 */
		EClass REMARK = eINSTANCE.getRemark();

		/**
		 * The meta object literal for the '<em><b>Describes Schema</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMARK__DESCRIBES_SCHEMA = eINSTANCE.getRemark_DescribesSchema();

		/**
		 * The meta object literal for the '<em><b>Appears In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMARK__APPEARS_IN = eINSTANCE.getRemark_AppearsIn();

		/**
		 * The meta object literal for the '<em><b>Describes Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMARK__DESCRIBES_ELEMENT = eINSTANCE.getRemark_DescribesElement();

		/**
		 * The meta object literal for the '<em><b>Is Tagged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMARK__IS_TAGGED = eINSTANCE.getRemark_IsTagged();

		/**
		 * The meta object literal for the '<em><b>Is Tail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMARK__IS_TAIL = eINSTANCE.getRemark_IsTail();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMARK__TEXT = eINSTANCE.getRemark_Text();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.SizeConstraintImpl <em>Size Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.SizeConstraintImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSizeConstraint()
		 * @generated
		 */
		EClass SIZE_CONSTRAINT = eINSTANCE.getSizeConstraint();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_CONSTRAINT__BOUND = eINSTANCE.getSizeConstraint_Bound();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.RoleImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>In Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__IN_RELATIONSHIP = eINSTANCE.getRole_InRelationship();

		/**
		 * The meta object literal for the '<em><b>Of Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__OF_ENTITY = eINSTANCE.getRole_OfEntity();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__UPPER_BOUND = eINSTANCE.getRole_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__LOWER_BOUND = eINSTANCE.getRole_LowerBound();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.SETTypeImpl <em>SET Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.SETTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSETType()
		 * @generated
		 */
		EClass SET_TYPE = eINSTANCE.getSETType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.SpecializedTypeImpl <em>Specialized Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.SpecializedTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSpecializedType()
		 * @generated
		 */
		EClass SPECIALIZED_TYPE = eINSTANCE.getSpecializedType();

		/**
		 * The meta object literal for the '<em><b>Underlying Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZED_TYPE__UNDERLYING_TYPE = eINSTANCE.getSpecializedType_UnderlyingType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.GeneralARRAYTypeImpl <em>General ARRAY Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.GeneralARRAYTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getGeneralARRAYType()
		 * @generated
		 */
		EClass GENERAL_ARRAY_TYPE = eINSTANCE.getGeneralARRAYType();

		/**
		 * The meta object literal for the '<em><b>Hi Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_ARRAY_TYPE__HI_INDEX = eINSTANCE.getGeneralARRAYType_HiIndex();

		/**
		 * The meta object literal for the '<em><b>Lo Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_ARRAY_TYPE__LO_INDEX = eINSTANCE.getGeneralARRAYType_LoIndex();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_ARRAY_TYPE__IS_OPTIONAL = eINSTANCE.getGeneralARRAYType_IsOptional();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.RelationshipImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__DOMAIN = eINSTANCE.getRelationship_Domain();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__ROLES = eINSTANCE.getRelationship_Roles();

		/**
		 * The meta object literal for the '<em><b>Based On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__BASED_ON = eINSTANCE.getRelationship_BasedOn();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RANGE = eINSTANCE.getRelationship_Range();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.LengthConstraintImpl <em>Length Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.LengthConstraintImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getLengthConstraint()
		 * @generated
		 */
		EClass LENGTH_CONSTRAINT = eINSTANCE.getLengthConstraint();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH_CONSTRAINT__MAX_LENGTH = eINSTANCE.getLengthConstraint_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Is Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH_CONSTRAINT__IS_FIXED = eINSTANCE.getLengthConstraint_IsFixed();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.LocalScopeImpl <em>Local Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.LocalScopeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getLocalScope()
		 * @generated
		 */
		EClass LOCAL_SCOPE = eINSTANCE.getLocalScope();

		/**
		 * The meta object literal for the '<em><b>Local Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_SCOPE__LOCAL_ELEMENTS = eINSTANCE.getLocalScope_LocalElements();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl <em>Named Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getNamedType()
		 * @generated
		 */
		EClass NAMED_TYPE = eINSTANCE.getNamedType();

		/**
		 * The meta object literal for the '<em><b>Instantiates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE__INSTANTIATES = eINSTANCE.getNamedType_Instantiates();

		/**
		 * The meta object literal for the '<em><b>Domain Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE__DOMAIN_RULES = eINSTANCE.getNamedType_DomainRules();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.BinaryTypeImpl <em>Binary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.BinaryTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getBinaryType()
		 * @generated
		 */
		EClass BINARY_TYPE = eINSTANCE.getBinaryType();

		/**
		 * The meta object literal for the '<em><b>Binary Length Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_TYPE__BINARY_LENGTH_CONSTRAINT = eINSTANCE.getBinaryType_BinaryLengthConstraint();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.ScopedIdImpl <em>Scoped Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.ScopedIdImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getScopedId()
		 * @generated
		 */
		EClass SCOPED_ID = eINSTANCE.getScopedId();

		/**
		 * The meta object literal for the '<em><b>Local Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPED_ID__LOCAL_NAME = eINSTANCE.getScopedId_LocalName();

		/**
		 * The meta object literal for the '<em><b>Defining Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPED_ID__DEFINING_SCOPE = eINSTANCE.getScopedId_DefiningScope();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.AggregationTypeImpl <em>Aggregation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.AggregationTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getAggregationType()
		 * @generated
		 */
		EClass AGGREGATION_TYPE = eINSTANCE.getAggregationType();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_TYPE__LOWER_BOUND = eINSTANCE.getAggregationType_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_TYPE__UPPER_BOUND = eINSTANCE.getAggregationType_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_TYPE__IS_UNIQUE = eINSTANCE.getAggregationType_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_TYPE__ORDERING = eINSTANCE.getAggregationType_Ordering();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.ScopeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Named Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__NAMED_ELEMENTS = eINSTANCE.getScope_NamedElements();

		/**
		 * The meta object literal for the '<em><b>Includes Remarks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__INCLUDES_REMARKS = eINSTANCE.getScope_IncludesRemarks();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.ParameterTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TYPE__CONTAINS = eINSTANCE.getParameterType_Contains();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.SelectTypeImpl <em>Select Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.SelectTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSelectType()
		 * @generated
		 */
		EClass SELECT_TYPE = eINSTANCE.getSelectType();

		/**
		 * The meta object literal for the '<em><b>Allowed Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_TYPE__ALLOWED_TYPES = eINSTANCE.getSelectType_AllowedTypes();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_TYPE__EXTENSION = eINSTANCE.getSelectType_Extension();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_TYPE__BASE = eINSTANCE.getSelectType_Base();

		/**
		 * The meta object literal for the '<em><b>Select List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_TYPE__SELECT_LIST = eINSTANCE.getSelectType_SelectList();

		/**
		 * The meta object literal for the '<em><b>Is Extensible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_TYPE__IS_EXTENSIBLE = eINSTANCE.getSelectType_IsExtensible();

		/**
		 * The meta object literal for the '<em><b>Is Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_TYPE__IS_ENTITY = eINSTANCE.getSelectType_IsEntity();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.ActualTypeImpl <em>Actual Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.ActualTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getActualType()
		 * @generated
		 */
		EClass ACTUAL_TYPE = eINSTANCE.getActualType();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_TYPE__SCOPE = eINSTANCE.getActualType_Scope();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.ExplicitAttributeImpl <em>Explicit Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.ExplicitAttributeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getExplicitAttribute()
		 * @generated
		 */
		EClass EXPLICIT_ATTRIBUTE = eINSTANCE.getExplicitAttribute();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLICIT_ATTRIBUTE__IS_OPTIONAL = eINSTANCE.getExplicitAttribute_IsOptional();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.SimpleTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__ID = eINSTANCE.getSimpleType_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.CommonElementImpl <em>Common Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.CommonElementImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getCommonElement()
		 * @generated
		 */
		EClass COMMON_ELEMENT = eINSTANCE.getCommonElement();

		/**
		 * The meta object literal for the '<em><b>Local Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_ELEMENT__LOCAL_SCOPE = eINSTANCE.getCommonElement_LocalScope();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.SchemaElementImpl <em>Schema Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.SchemaElementImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getSchemaElement()
		 * @generated
		 */
		EClass SCHEMA_ELEMENT = eINSTANCE.getSchemaElement();

		/**
		 * The meta object literal for the '<em><b>Referenced As</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_ELEMENT__REFERENCED_AS = eINSTANCE.getSchemaElement_ReferencedAs();

		/**
		 * The meta object literal for the '<em><b>Referenced In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_ELEMENT__REFERENCED_IN = eINSTANCE.getSchemaElement_ReferencedIn();

		/**
		 * The meta object literal for the '<em><b>Defined In</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_ELEMENT__DEFINED_IN = eINSTANCE.getSchemaElement_DefinedIn();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.ConcreteAggregationTypeImpl <em>Concrete Aggregation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.ConcreteAggregationTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getConcreteAggregationType()
		 * @generated
		 */
		EClass CONCRETE_AGGREGATION_TYPE = eINSTANCE.getConcreteAggregationType();

		/**
		 * The meta object literal for the '<em><b>Member Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_AGGREGATION_TYPE__MEMBER_TYPE = eINSTANCE.getConcreteAggregationType_MemberType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.core.impl.ARRAYTypeImpl <em>ARRAY Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.core.impl.ARRAYTypeImpl
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getARRAYType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getARRAYType();

		/**
		 * The meta object literal for the '<em><b>Lo Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__LO_INDEX = eINSTANCE.getARRAYType_LoIndex();

		/**
		 * The meta object literal for the '<em><b>Hi Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__HI_INDEX = eINSTANCE.getARRAYType_HiIndex();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__IS_OPTIONAL = eINSTANCE.getARRAYType_IsOptional();

		/**
		 * The meta object literal for the '<em>Keyword</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getKeyword()
		 * @generated
		 */
		EDataType KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '<em>Express Text</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getExpressText()
		 * @generated
		 */
		EDataType EXPRESS_TEXT = eINSTANCE.getExpressText();

		/**
		 * The meta object literal for the '<em>Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getIdentifier()
		 * @generated
		 */
		EDataType IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em>Ordering Kind</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.ifc4emf.metamodel.express.core.impl.CorePackageImpl#getOrderingKind()
		 * @generated
		 */
		EDataType ORDERING_KIND = eINSTANCE.getOrderingKind();

	}

} //CorePackage
