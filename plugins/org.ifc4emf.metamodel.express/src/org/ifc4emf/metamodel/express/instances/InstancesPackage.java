/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * @see org.ifc4emf.metamodel.express.instances.InstancesFactory
 * @model kind="package"
 * @generated
 */
public interface InstancesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instances";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://express.ecore#//instances";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "express_instances";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancesPackage eINSTANCE = org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.AttributeValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__ACTUAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.ConcreteValueImpl <em>Concrete Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.ConcreteValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getConcreteValue()
	 * @generated
	 */
	int CONCRETE_VALUE = 32;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_VALUE__APPEARS_IN_POPULATION = CorePackage.INSTANCE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_VALUE__OF_TYPE = CorePackage.INSTANCE__OF_TYPE;

	/**
	 * The number of structural features of the '<em>Concrete Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_VALUE_FEATURE_COUNT = CorePackage.INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.AggregateValueImpl <em>Aggregate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.AggregateValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getAggregateValue()
	 * @generated
	 */
	int AGGREGATE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_VALUE__APPEARS_IN_POPULATION = CONCRETE_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_VALUE__OF_TYPE = CONCRETE_VALUE__OF_TYPE;

	/**
	 * The number of structural features of the '<em>Aggregate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_VALUE_FEATURE_COUNT = CONCRETE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.ARRAYValueImpl <em>ARRAY Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.ARRAYValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getARRAYValue()
	 * @generated
	 */
	int ARRAY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__APPEARS_IN_POPULATION = AGGREGATE_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__OF_TYPE = AGGREGATE_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Member Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__MEMBER_SLOT = AGGREGATE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ARRAY Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_FEATURE_COUNT = AGGREGATE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.SimpleValueImpl <em>Simple Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.SimpleValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getSimpleValue()
	 * @generated
	 */
	int SIMPLE_VALUE = 31;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE__APPEARS_IN_POPULATION = CONCRETE_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE__OF_TYPE = CONCRETE_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE__NAME = CONCRETE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_FEATURE_COUNT = CONCRETE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.StringValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 26;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__APPEARS_IN_POPULATION = SIMPLE_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__OF_TYPE = SIMPLE_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__NAME = SIMPLE_VALUE__NAME;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = SIMPLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.RoleNameImpl <em>Role Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.RoleNameImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getRoleName()
	 * @generated
	 */
	int ROLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME__APPEARS_IN_POPULATION = STRING_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME__OF_TYPE = STRING_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME__NAME = STRING_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME__REFERS_TO = STRING_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME__REPRESENTS = STRING_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_FEATURE_COUNT = STRING_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.TypedInstanceImpl <em>Typed Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.TypedInstanceImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getTypedInstance()
	 * @generated
	 */
	int TYPED_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_INSTANCE__APPEARS_IN_POPULATION = CorePackage.INSTANCE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_INSTANCE__OF_TYPE = CorePackage.INSTANCE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Satisfies Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_INSTANCE__SATISFIES_TYPE = CorePackage.INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_INSTANCE_FEATURE_COUNT = CorePackage.INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.EntityInstanceImpl <em>Entity Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.EntityInstanceImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getEntityInstance()
	 * @generated
	 */
	int ENTITY_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE__APPEARS_IN_POPULATION = TYPED_INSTANCE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE__OF_TYPE = TYPED_INSTANCE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Satisfies Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE__SATISFIES_TYPE = TYPED_INSTANCE__SATISFIES_TYPE;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE__STATE = TYPED_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE__INSTANCE_OF = TYPED_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE__ID = TYPED_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE_FEATURE_COUNT = TYPED_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.NumberValueImpl <em>Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.NumberValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getNumberValue()
	 * @generated
	 */
	int NUMBER_VALUE = 29;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__APPEARS_IN_POPULATION = SIMPLE_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__OF_TYPE = SIMPLE_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__NAME = SIMPLE_VALUE__NAME;

	/**
	 * The number of structural features of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FEATURE_COUNT = SIMPLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.RealValueImpl <em>Real Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.RealValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getRealValue()
	 * @generated
	 */
	int REAL_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE__APPEARS_IN_POPULATION = NUMBER_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE__OF_TYPE = NUMBER_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE__NAME = NUMBER_VALUE__NAME;

	/**
	 * The number of structural features of the '<em>Real Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_FEATURE_COUNT = NUMBER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.IntegerValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__APPEARS_IN_POPULATION = REAL_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__OF_TYPE = REAL_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__NAME = REAL_VALUE__NAME;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = REAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.ConstantImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAMESPACE = CorePackage.COMMON_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DOCUMENTATION = CorePackage.COMMON_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ID = CorePackage.COMMON_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__REFERENCED_AS = CorePackage.COMMON_ELEMENT__REFERENCED_AS;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__REFERENCED_IN = CorePackage.COMMON_ELEMENT__REFERENCED_IN;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DEFINED_IN = CorePackage.COMMON_ELEMENT__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__LOCAL_SCOPE = CorePackage.COMMON_ELEMENT__LOCAL_SCOPE;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE_EXPRESSION = CorePackage.COMMON_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ACTUAL_VALUE = CorePackage.COMMON_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DATA_TYPE = CorePackage.COMMON_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = CorePackage.COMMON_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.LogicalValueImpl <em>Logical Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.LogicalValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getLogicalValue()
	 * @generated
	 */
	int LOGICAL_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VALUE__APPEARS_IN_POPULATION = SIMPLE_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VALUE__OF_TYPE = SIMPLE_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VALUE__NAME = SIMPLE_VALUE__NAME;

	/**
	 * The number of structural features of the '<em>Logical Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VALUE_FEATURE_COUNT = SIMPLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.ListMemberImpl <em>List Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.ListMemberImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getListMember()
	 * @generated
	 */
	int LIST_MEMBER = 9;

	/**
	 * The feature id for the '<em><b>Member Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_MEMBER__MEMBER_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_MEMBER__POSITION = 1;

	/**
	 * The number of structural features of the '<em>List Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_MEMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.BagMemberImpl <em>Bag Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.BagMemberImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getBagMember()
	 * @generated
	 */
	int BAG_MEMBER = 10;

	/**
	 * The feature id for the '<em><b>Member Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_MEMBER__MEMBER_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_MEMBER__COUNT = 1;

	/**
	 * The number of structural features of the '<em>Bag Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_MEMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.SingleEntityValueImpl <em>Single Entity Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.SingleEntityValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getSingleEntityValue()
	 * @generated
	 */
	int SINGLE_ENTITY_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Equivalent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ENTITY_VALUE__EQUIVALENT = 0;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ENTITY_VALUE__OF_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ENTITY_VALUE__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Single Entity Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ENTITY_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.IndeterminateImpl <em>Indeterminate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.IndeterminateImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getIndeterminate()
	 * @generated
	 */
	int INDETERMINATE = 12;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDETERMINATE__APPEARS_IN_POPULATION = CorePackage.INSTANCE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDETERMINATE__OF_TYPE = CorePackage.INSTANCE__OF_TYPE;

	/**
	 * The number of structural features of the '<em>Indeterminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDETERMINATE_FEATURE_COUNT = CorePackage.INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.SingleLeafInstanceImpl <em>Single Leaf Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.SingleLeafInstanceImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getSingleLeafInstance()
	 * @generated
	 */
	int SINGLE_LEAF_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LEAF_INSTANCE__APPEARS_IN_POPULATION = ENTITY_INSTANCE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LEAF_INSTANCE__OF_TYPE = ENTITY_INSTANCE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Satisfies Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LEAF_INSTANCE__SATISFIES_TYPE = ENTITY_INSTANCE__SATISFIES_TYPE;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LEAF_INSTANCE__STATE = ENTITY_INSTANCE__STATE;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LEAF_INSTANCE__INSTANCE_OF = ENTITY_INSTANCE__INSTANCE_OF;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LEAF_INSTANCE__ID = ENTITY_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Characterizing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LEAF_INSTANCE__CHARACTERIZING_TYPE = ENTITY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Leaf Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LEAF_INSTANCE_FEATURE_COUNT = ENTITY_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.LISTValueImpl <em>LIST Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.LISTValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getLISTValue()
	 * @generated
	 */
	int LIST_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__APPEARS_IN_POPULATION = CorePackage.INSTANCE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__OF_TYPE = CorePackage.INSTANCE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Member Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__MEMBER_SLOT = CorePackage.INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LIST Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_FEATURE_COUNT = CorePackage.INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.GenericAggregateImpl <em>Generic Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.GenericAggregateImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getGenericAggregate()
	 * @generated
	 */
	int GENERIC_AGGREGATE = 14;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_AGGREGATE__APPEARS_IN_POPULATION = LIST_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_AGGREGATE__OF_TYPE = LIST_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Member Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_AGGREGATE__MEMBER_SLOT = LIST_VALUE__MEMBER_SLOT;

	/**
	 * The number of structural features of the '<em>Generic Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_AGGREGATE_FEATURE_COUNT = LIST_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.BinaryValueImpl <em>Binary Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.BinaryValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getBinaryValue()
	 * @generated
	 */
	int BINARY_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VALUE__APPEARS_IN_POPULATION = SIMPLE_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VALUE__OF_TYPE = SIMPLE_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VALUE__NAME = SIMPLE_VALUE__NAME;

	/**
	 * The number of structural features of the '<em>Binary Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VALUE_FEATURE_COUNT = SIMPLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.SpecializedValueImpl <em>Specialized Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.SpecializedValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getSpecializedValue()
	 * @generated
	 */
	int SPECIALIZED_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_VALUE__APPEARS_IN_POPULATION = TYPED_INSTANCE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_VALUE__OF_TYPE = TYPED_INSTANCE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Satisfies Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_VALUE__SATISFIES_TYPE = TYPED_INSTANCE__SATISFIES_TYPE;

	/**
	 * The feature id for the '<em><b>Fundamental Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_VALUE__FUNDAMENTAL_VALUE = TYPED_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specialized Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_VALUE_FEATURE_COUNT = TYPED_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.BAGValueImpl <em>BAG Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.BAGValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getBAGValue()
	 * @generated
	 */
	int BAG_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__APPEARS_IN_POPULATION = AGGREGATE_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__OF_TYPE = AGGREGATE_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Member Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__MEMBER_SLOT = AGGREGATE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BAG Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_FEATURE_COUNT = AGGREGATE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.EnumerationItemImpl <em>Enumeration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.EnumerationItemImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getEnumerationItem()
	 * @generated
	 */
	int ENUMERATION_ITEM = 18;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__NAMESPACE = CorePackage.TYPE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__DOCUMENTATION = CorePackage.TYPE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__ID = CorePackage.TYPE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__APPEARS_IN_POPULATION = CorePackage.TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__OF_TYPE = CorePackage.TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Satisfies Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__SATISFIES_TYPE = CorePackage.TYPE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declared In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__DECLARED_IN = CorePackage.TYPE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__POSITION = CorePackage.TYPE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM_FEATURE_COUNT = CorePackage.TYPE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.PartialEntityValueImpl <em>Partial Entity Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.PartialEntityValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getPartialEntityValue()
	 * @generated
	 */
	int PARTIAL_ENTITY_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_VALUE__APPEARS_IN_POPULATION = CorePackage.INSTANCE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_VALUE__OF_TYPE = CorePackage.INSTANCE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_VALUE__COMPONENTS = CorePackage.INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partial Entity Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ENTITY_VALUE_FEATURE_COUNT = CorePackage.INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.EntityValueImpl <em>Entity Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.EntityValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getEntityValue()
	 * @generated
	 */
	int ENTITY_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_VALUE__APPEARS_IN_POPULATION = PARTIAL_ENTITY_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_VALUE__OF_TYPE = PARTIAL_ENTITY_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_VALUE__COMPONENTS = PARTIAL_ENTITY_VALUE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Corresponds To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_VALUE__CORRESPONDS_TO = PARTIAL_ENTITY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Describes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_VALUE__DESCRIBES = PARTIAL_ENTITY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_VALUE_FEATURE_COUNT = PARTIAL_ENTITY_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.SETValueImpl <em>SET Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.SETValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getSETValue()
	 * @generated
	 */
	int SET_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__APPEARS_IN_POPULATION = AGGREGATE_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__OF_TYPE = AGGREGATE_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Member Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__MEMBER_VALUE = AGGREGATE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SET Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_FEATURE_COUNT = AGGREGATE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.ArrayMemberImpl <em>Array Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.ArrayMemberImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getArrayMember()
	 * @generated
	 */
	int ARRAY_MEMBER = 21;

	/**
	 * The feature id for the '<em><b>Member Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_MEMBER__MEMBER_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_MEMBER__INDEX = 1;

	/**
	 * The number of structural features of the '<em>Array Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_MEMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.PopulationImpl <em>Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.PopulationImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getPopulation()
	 * @generated
	 */
	int POPULATION = 22;

	/**
	 * The feature id for the '<em><b>Composition Entity Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__COMPOSITION_ENTITY_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Composition Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__COMPOSITION_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Governing Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__GOVERNING_SCHEMA = 2;

	/**
	 * The number of structural features of the '<em>Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.BooleanValueImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__APPEARS_IN_POPULATION = LOGICAL_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__OF_TYPE = LOGICAL_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__NAME = LOGICAL_VALUE__NAME;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = LOGICAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.TypeNameImpl <em>Type Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.TypeNameImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 27;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME__APPEARS_IN_POPULATION = STRING_VALUE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME__OF_TYPE = STRING_VALUE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME__NAME = STRING_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME__REFERS_TO = STRING_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME__REPRESENTS = STRING_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_FEATURE_COUNT = STRING_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.instances.impl.MultiLeafInstanceImpl <em>Multi Leaf Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.instances.impl.MultiLeafInstanceImpl
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getMultiLeafInstance()
	 * @generated
	 */
	int MULTI_LEAF_INSTANCE = 30;

	/**
	 * The feature id for the '<em><b>Appears In Population</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEAF_INSTANCE__APPEARS_IN_POPULATION = ENTITY_INSTANCE__APPEARS_IN_POPULATION;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEAF_INSTANCE__OF_TYPE = ENTITY_INSTANCE__OF_TYPE;

	/**
	 * The feature id for the '<em><b>Satisfies Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEAF_INSTANCE__SATISFIES_TYPE = ENTITY_INSTANCE__SATISFIES_TYPE;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEAF_INSTANCE__STATE = ENTITY_INSTANCE__STATE;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEAF_INSTANCE__INSTANCE_OF = ENTITY_INSTANCE__INSTANCE_OF;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEAF_INSTANCE__ID = ENTITY_INSTANCE__ID;

	/**
	 * The number of structural features of the '<em>Multi Leaf Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEAF_INSTANCE_FEATURE_COUNT = ENTITY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Entity Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getEntityName()
	 * @generated
	 */
	int ENTITY_NAME = 33;


	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.AttributeValue#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.AttributeValue#getActualValue()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EReference getAttributeValue_ActualValue();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.AttributeValue#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.AttributeValue#getAttribute()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EReference getAttributeValue_Attribute();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.ARRAYValue <em>ARRAY Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARRAY Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.ARRAYValue
	 * @generated
	 */
	EClass getARRAYValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.instances.ARRAYValue#getMemberSlot <em>Member Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Slot</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.ARRAYValue#getMemberSlot()
	 * @see #getARRAYValue()
	 * @generated
	 */
	EReference getARRAYValue_MemberSlot();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.RoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.RoleName
	 * @generated
	 */
	EClass getRoleName();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.RoleName#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.RoleName#getRefersTo()
	 * @see #getRoleName()
	 * @generated
	 */
	EReference getRoleName_RefersTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.instances.RoleName#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Represents</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.RoleName#getRepresents()
	 * @see #getRoleName()
	 * @generated
	 */
	EReference getRoleName_Represents();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.EntityInstance <em>Entity Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Instance</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.EntityInstance
	 * @generated
	 */
	EClass getEntityInstance();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.EntityInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.EntityInstance#getState()
	 * @see #getEntityInstance()
	 * @generated
	 */
	EReference getEntityInstance_State();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.instances.EntityInstance#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance Of</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.EntityInstance#getInstanceOf()
	 * @see #getEntityInstance()
	 * @generated
	 */
	EReference getEntityInstance_InstanceOf();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.instances.EntityInstance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.EntityInstance#getId()
	 * @see #getEntityInstance()
	 * @generated
	 */
	EAttribute getEntityInstance_Id();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.AggregateValue <em>Aggregate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.AggregateValue
	 * @generated
	 */
	EClass getAggregateValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.Constant#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Expression</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.Constant#getValueExpression()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_ValueExpression();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.Constant#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.Constant#getActualValue()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_ActualValue();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.Constant#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.Constant#getDataType()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_DataType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.LogicalValue <em>Logical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.LogicalValue
	 * @generated
	 */
	EClass getLogicalValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.TypedInstance <em>Typed Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Instance</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.TypedInstance
	 * @generated
	 */
	EClass getTypedInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.instances.TypedInstance#getSatisfiesType <em>Satisfies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfies Type</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.TypedInstance#getSatisfiesType()
	 * @see #getTypedInstance()
	 * @generated
	 */
	EReference getTypedInstance_SatisfiesType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.ListMember <em>List Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Member</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.ListMember
	 * @generated
	 */
	EClass getListMember();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.ListMember#getMemberValue <em>Member Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.ListMember#getMemberValue()
	 * @see #getListMember()
	 * @generated
	 */
	EReference getListMember_MemberValue();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.instances.ListMember#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.ListMember#getPosition()
	 * @see #getListMember()
	 * @generated
	 */
	EAttribute getListMember_Position();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.BagMember <em>Bag Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Member</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.BagMember
	 * @generated
	 */
	EClass getBagMember();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.BagMember#getMemberValue <em>Member Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.BagMember#getMemberValue()
	 * @see #getBagMember()
	 * @generated
	 */
	EReference getBagMember_MemberValue();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.instances.BagMember#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.BagMember#getCount()
	 * @see #getBagMember()
	 * @generated
	 */
	EAttribute getBagMember_Count();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.SingleEntityValue <em>Single Entity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Entity Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SingleEntityValue
	 * @generated
	 */
	EClass getSingleEntityValue();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.SingleEntityValue#getEquivalent <em>Equivalent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equivalent</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SingleEntityValue#getEquivalent()
	 * @see #getSingleEntityValue()
	 * @generated
	 */
	EReference getSingleEntityValue_Equivalent();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.SingleEntityValue#getOfType <em>Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Of Type</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SingleEntityValue#getOfType()
	 * @see #getSingleEntityValue()
	 * @generated
	 */
	EReference getSingleEntityValue_OfType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.instances.SingleEntityValue#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SingleEntityValue#getProperties()
	 * @see #getSingleEntityValue()
	 * @generated
	 */
	EReference getSingleEntityValue_Properties();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.Indeterminate <em>Indeterminate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indeterminate</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.Indeterminate
	 * @generated
	 */
	EClass getIndeterminate();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.SingleLeafInstance <em>Single Leaf Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Leaf Instance</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SingleLeafInstance
	 * @generated
	 */
	EClass getSingleLeafInstance();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.SingleLeafInstance#getCharacterizingType <em>Characterizing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Characterizing Type</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SingleLeafInstance#getCharacterizingType()
	 * @see #getSingleLeafInstance()
	 * @generated
	 */
	EReference getSingleLeafInstance_CharacterizingType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.GenericAggregate <em>Generic Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Aggregate</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.GenericAggregate
	 * @generated
	 */
	EClass getGenericAggregate();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.BinaryValue <em>Binary Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.BinaryValue
	 * @generated
	 */
	EClass getBinaryValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.SpecializedValue <em>Specialized Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialized Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SpecializedValue
	 * @generated
	 */
	EClass getSpecializedValue();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.SpecializedValue#getFundamentalValue <em>Fundamental Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fundamental Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SpecializedValue#getFundamentalValue()
	 * @see #getSpecializedValue()
	 * @generated
	 */
	EReference getSpecializedValue_FundamentalValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.BAGValue <em>BAG Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAG Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.BAGValue
	 * @generated
	 */
	EClass getBAGValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.instances.BAGValue#getMemberSlot <em>Member Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Slot</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.BAGValue#getMemberSlot()
	 * @see #getBAGValue()
	 * @generated
	 */
	EReference getBAGValue_MemberSlot();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.EnumerationItem <em>Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Item</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.EnumerationItem
	 * @generated
	 */
	EClass getEnumerationItem();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.instances.EnumerationItem#getDeclaredIn <em>Declared In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Declared In</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.EnumerationItem#getDeclaredIn()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_DeclaredIn();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.instances.EnumerationItem#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.EnumerationItem#getPosition()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EAttribute getEnumerationItem_Position();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.EntityValue <em>Entity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.EntityValue
	 * @generated
	 */
	EClass getEntityValue();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.instances.EntityValue#getCorrespondsTo <em>Corresponds To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Corresponds To</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.EntityValue#getCorrespondsTo()
	 * @see #getEntityValue()
	 * @generated
	 */
	EReference getEntityValue_CorrespondsTo();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.instances.EntityValue#getDescribes <em>Describes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Describes</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.EntityValue#getDescribes()
	 * @see #getEntityValue()
	 * @generated
	 */
	EReference getEntityValue_Describes();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.SETValue <em>SET Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SET Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SETValue
	 * @generated
	 */
	EClass getSETValue();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.instances.SETValue#getMemberValue <em>Member Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SETValue#getMemberValue()
	 * @see #getSETValue()
	 * @generated
	 */
	EReference getSETValue_MemberValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.ArrayMember <em>Array Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Member</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.ArrayMember
	 * @generated
	 */
	EClass getArrayMember();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.ArrayMember#getMemberValue <em>Member Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.ArrayMember#getMemberValue()
	 * @see #getArrayMember()
	 * @generated
	 */
	EReference getArrayMember_MemberValue();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.instances.ArrayMember#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.ArrayMember#getIndex()
	 * @see #getArrayMember()
	 * @generated
	 */
	EAttribute getArrayMember_Index();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.Population
	 * @generated
	 */
	EClass getPopulation();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.instances.Population#getCompositionEntityInstance <em>Composition Entity Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composition Entity Instance</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.Population#getCompositionEntityInstance()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_CompositionEntityInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.instances.Population#getCompositionInstance <em>Composition Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composition Instance</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.Population#getCompositionInstance()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_CompositionInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.instances.Population#getGoverningSchema <em>Governing Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Governing Schema</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.Population#getGoverningSchema()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_GoverningSchema();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.RealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.RealValue
	 * @generated
	 */
	EClass getRealValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.LISTValue <em>LIST Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LIST Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.LISTValue
	 * @generated
	 */
	EClass getLISTValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.instances.LISTValue#getMemberSlot <em>Member Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Slot</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.LISTValue#getMemberSlot()
	 * @see #getLISTValue()
	 * @generated
	 */
	EReference getLISTValue_MemberSlot();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.TypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Name</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.TypeName
	 * @generated
	 */
	EClass getTypeName();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.instances.TypeName#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.TypeName#getRefersTo()
	 * @see #getTypeName()
	 * @generated
	 */
	EReference getTypeName_RefersTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.instances.TypeName#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Represents</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.TypeName#getRepresents()
	 * @see #getTypeName()
	 * @generated
	 */
	EReference getTypeName_Represents();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.PartialEntityValue <em>Partial Entity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Entity Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.PartialEntityValue
	 * @generated
	 */
	EClass getPartialEntityValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.instances.PartialEntityValue#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.PartialEntityValue#getComponents()
	 * @see #getPartialEntityValue()
	 * @generated
	 */
	EReference getPartialEntityValue_Components();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.NumberValue
	 * @generated
	 */
	EClass getNumberValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.MultiLeafInstance <em>Multi Leaf Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Leaf Instance</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.MultiLeafInstance
	 * @generated
	 */
	EClass getMultiLeafInstance();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.SimpleValue <em>Simple Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SimpleValue
	 * @generated
	 */
	EClass getSimpleValue();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.instances.SimpleValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.SimpleValue#getName()
	 * @see #getSimpleValue()
	 * @generated
	 */
	EAttribute getSimpleValue_Name();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.instances.ConcreteValue <em>Concrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Value</em>'.
	 * @see org.ifc4emf.metamodel.express.instances.ConcreteValue
	 * @generated
	 */
	EClass getConcreteValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Entity Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getEntityName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstancesFactory getInstancesFactory();

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
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.AttributeValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Actual Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE__ACTUAL_VALUE = eINSTANCE.getAttributeValue_ActualValue();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE__ATTRIBUTE = eINSTANCE.getAttributeValue_Attribute();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.ARRAYValueImpl <em>ARRAY Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.ARRAYValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getARRAYValue()
		 * @generated
		 */
		EClass ARRAY_VALUE = eINSTANCE.getARRAYValue();

		/**
		 * The meta object literal for the '<em><b>Member Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VALUE__MEMBER_SLOT = eINSTANCE.getARRAYValue_MemberSlot();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.RoleNameImpl <em>Role Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.RoleNameImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getRoleName()
		 * @generated
		 */
		EClass ROLE_NAME = eINSTANCE.getRoleName();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_NAME__REFERS_TO = eINSTANCE.getRoleName_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_NAME__REPRESENTS = eINSTANCE.getRoleName_Represents();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.EntityInstanceImpl <em>Entity Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.EntityInstanceImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getEntityInstance()
		 * @generated
		 */
		EClass ENTITY_INSTANCE = eINSTANCE.getEntityInstance();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_INSTANCE__STATE = eINSTANCE.getEntityInstance_State();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_INSTANCE__INSTANCE_OF = eINSTANCE.getEntityInstance_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_INSTANCE__ID = eINSTANCE.getEntityInstance_Id();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.IntegerValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.AggregateValueImpl <em>Aggregate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.AggregateValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getAggregateValue()
		 * @generated
		 */
		EClass AGGREGATE_VALUE = eINSTANCE.getAggregateValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.ConstantImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__VALUE_EXPRESSION = eINSTANCE.getConstant_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Actual Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__ACTUAL_VALUE = eINSTANCE.getConstant_ActualValue();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__DATA_TYPE = eINSTANCE.getConstant_DataType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.LogicalValueImpl <em>Logical Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.LogicalValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getLogicalValue()
		 * @generated
		 */
		EClass LOGICAL_VALUE = eINSTANCE.getLogicalValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.TypedInstanceImpl <em>Typed Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.TypedInstanceImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getTypedInstance()
		 * @generated
		 */
		EClass TYPED_INSTANCE = eINSTANCE.getTypedInstance();

		/**
		 * The meta object literal for the '<em><b>Satisfies Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_INSTANCE__SATISFIES_TYPE = eINSTANCE.getTypedInstance_SatisfiesType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.ListMemberImpl <em>List Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.ListMemberImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getListMember()
		 * @generated
		 */
		EClass LIST_MEMBER = eINSTANCE.getListMember();

		/**
		 * The meta object literal for the '<em><b>Member Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_MEMBER__MEMBER_VALUE = eINSTANCE.getListMember_MemberValue();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_MEMBER__POSITION = eINSTANCE.getListMember_Position();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.BagMemberImpl <em>Bag Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.BagMemberImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getBagMember()
		 * @generated
		 */
		EClass BAG_MEMBER = eINSTANCE.getBagMember();

		/**
		 * The meta object literal for the '<em><b>Member Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_MEMBER__MEMBER_VALUE = eINSTANCE.getBagMember_MemberValue();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAG_MEMBER__COUNT = eINSTANCE.getBagMember_Count();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.SingleEntityValueImpl <em>Single Entity Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.SingleEntityValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getSingleEntityValue()
		 * @generated
		 */
		EClass SINGLE_ENTITY_VALUE = eINSTANCE.getSingleEntityValue();

		/**
		 * The meta object literal for the '<em><b>Equivalent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ENTITY_VALUE__EQUIVALENT = eINSTANCE.getSingleEntityValue_Equivalent();

		/**
		 * The meta object literal for the '<em><b>Of Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ENTITY_VALUE__OF_TYPE = eINSTANCE.getSingleEntityValue_OfType();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ENTITY_VALUE__PROPERTIES = eINSTANCE.getSingleEntityValue_Properties();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.IndeterminateImpl <em>Indeterminate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.IndeterminateImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getIndeterminate()
		 * @generated
		 */
		EClass INDETERMINATE = eINSTANCE.getIndeterminate();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.SingleLeafInstanceImpl <em>Single Leaf Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.SingleLeafInstanceImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getSingleLeafInstance()
		 * @generated
		 */
		EClass SINGLE_LEAF_INSTANCE = eINSTANCE.getSingleLeafInstance();

		/**
		 * The meta object literal for the '<em><b>Characterizing Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_LEAF_INSTANCE__CHARACTERIZING_TYPE = eINSTANCE.getSingleLeafInstance_CharacterizingType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.GenericAggregateImpl <em>Generic Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.GenericAggregateImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getGenericAggregate()
		 * @generated
		 */
		EClass GENERIC_AGGREGATE = eINSTANCE.getGenericAggregate();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.BinaryValueImpl <em>Binary Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.BinaryValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getBinaryValue()
		 * @generated
		 */
		EClass BINARY_VALUE = eINSTANCE.getBinaryValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.SpecializedValueImpl <em>Specialized Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.SpecializedValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getSpecializedValue()
		 * @generated
		 */
		EClass SPECIALIZED_VALUE = eINSTANCE.getSpecializedValue();

		/**
		 * The meta object literal for the '<em><b>Fundamental Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZED_VALUE__FUNDAMENTAL_VALUE = eINSTANCE.getSpecializedValue_FundamentalValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.BAGValueImpl <em>BAG Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.BAGValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getBAGValue()
		 * @generated
		 */
		EClass BAG_VALUE = eINSTANCE.getBAGValue();

		/**
		 * The meta object literal for the '<em><b>Member Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__MEMBER_SLOT = eINSTANCE.getBAGValue_MemberSlot();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.EnumerationItemImpl <em>Enumeration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.EnumerationItemImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getEnumerationItem()
		 * @generated
		 */
		EClass ENUMERATION_ITEM = eINSTANCE.getEnumerationItem();

		/**
		 * The meta object literal for the '<em><b>Declared In</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_ITEM__DECLARED_IN = eINSTANCE.getEnumerationItem_DeclaredIn();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_ITEM__POSITION = eINSTANCE.getEnumerationItem_Position();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.EntityValueImpl <em>Entity Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.EntityValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getEntityValue()
		 * @generated
		 */
		EClass ENTITY_VALUE = eINSTANCE.getEntityValue();

		/**
		 * The meta object literal for the '<em><b>Corresponds To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_VALUE__CORRESPONDS_TO = eINSTANCE.getEntityValue_CorrespondsTo();

		/**
		 * The meta object literal for the '<em><b>Describes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_VALUE__DESCRIBES = eINSTANCE.getEntityValue_Describes();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.SETValueImpl <em>SET Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.SETValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getSETValue()
		 * @generated
		 */
		EClass SET_VALUE = eINSTANCE.getSETValue();

		/**
		 * The meta object literal for the '<em><b>Member Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__MEMBER_VALUE = eINSTANCE.getSETValue_MemberValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.ArrayMemberImpl <em>Array Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.ArrayMemberImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getArrayMember()
		 * @generated
		 */
		EClass ARRAY_MEMBER = eINSTANCE.getArrayMember();

		/**
		 * The meta object literal for the '<em><b>Member Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_MEMBER__MEMBER_VALUE = eINSTANCE.getArrayMember_MemberValue();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_MEMBER__INDEX = eINSTANCE.getArrayMember_Index();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.PopulationImpl <em>Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.PopulationImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getPopulation()
		 * @generated
		 */
		EClass POPULATION = eINSTANCE.getPopulation();

		/**
		 * The meta object literal for the '<em><b>Composition Entity Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION__COMPOSITION_ENTITY_INSTANCE = eINSTANCE.getPopulation_CompositionEntityInstance();

		/**
		 * The meta object literal for the '<em><b>Composition Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION__COMPOSITION_INSTANCE = eINSTANCE.getPopulation_CompositionInstance();

		/**
		 * The meta object literal for the '<em><b>Governing Schema</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION__GOVERNING_SCHEMA = eINSTANCE.getPopulation_GoverningSchema();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.RealValueImpl <em>Real Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.RealValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getRealValue()
		 * @generated
		 */
		EClass REAL_VALUE = eINSTANCE.getRealValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.BooleanValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.LISTValueImpl <em>LIST Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.LISTValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getLISTValue()
		 * @generated
		 */
		EClass LIST_VALUE = eINSTANCE.getLISTValue();

		/**
		 * The meta object literal for the '<em><b>Member Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VALUE__MEMBER_SLOT = eINSTANCE.getLISTValue_MemberSlot();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.StringValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.TypeNameImpl <em>Type Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.TypeNameImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getTypeName()
		 * @generated
		 */
		EClass TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_NAME__REFERS_TO = eINSTANCE.getTypeName_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_NAME__REPRESENTS = eINSTANCE.getTypeName_Represents();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.PartialEntityValueImpl <em>Partial Entity Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.PartialEntityValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getPartialEntityValue()
		 * @generated
		 */
		EClass PARTIAL_ENTITY_VALUE = eINSTANCE.getPartialEntityValue();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_ENTITY_VALUE__COMPONENTS = eINSTANCE.getPartialEntityValue_Components();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.NumberValueImpl <em>Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.NumberValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getNumberValue()
		 * @generated
		 */
		EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.MultiLeafInstanceImpl <em>Multi Leaf Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.MultiLeafInstanceImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getMultiLeafInstance()
		 * @generated
		 */
		EClass MULTI_LEAF_INSTANCE = eINSTANCE.getMultiLeafInstance();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.SimpleValueImpl <em>Simple Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.SimpleValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getSimpleValue()
		 * @generated
		 */
		EClass SIMPLE_VALUE = eINSTANCE.getSimpleValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VALUE__NAME = eINSTANCE.getSimpleValue_Name();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.instances.impl.ConcreteValueImpl <em>Concrete Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.instances.impl.ConcreteValueImpl
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getConcreteValue()
		 * @generated
		 */
		EClass CONCRETE_VALUE = eINSTANCE.getConcreteValue();

		/**
		 * The meta object literal for the '<em>Entity Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.ifc4emf.metamodel.express.instances.impl.InstancesPackageImpl#getEntityName()
		 * @generated
		 */
		EDataType ENTITY_NAME = eINSTANCE.getEntityName();

	}

} //InstancesPackage
