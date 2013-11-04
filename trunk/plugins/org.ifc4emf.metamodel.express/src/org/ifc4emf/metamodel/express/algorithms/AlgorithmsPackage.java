/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsFactory
 * @model kind="package"
 * @generated
 */
public interface AlgorithmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algorithms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://express.ecore#//algorithms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "express_algorithms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmsPackage eINSTANCE = org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualTypeConstraintImpl <em>Actual Type Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualTypeConstraintImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualTypeConstraint()
	 * @generated
	 */
	int ACTUAL_TYPE_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Matching Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Required Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TYPE_CONSTRAINT__REQUIRED_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TYPE_CONSTRAINT__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Actual Type Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TYPE_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.NamedVariableImpl <em>Named Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.NamedVariableImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getNamedVariable()
	 * @generated
	 */
	int NAMED_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VARIABLE__NAMESPACE = CorePackage.LOCAL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VARIABLE__DOCUMENTATION = CorePackage.LOCAL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VARIABLE__ID = CorePackage.LOCAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VARIABLE__VARIABLE_TYPE = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VARIABLE_FEATURE_COUNT = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.VariableImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 20;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAMESPACE = NAMED_VARIABLE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DOCUMENTATION = NAMED_VARIABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = NAMED_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE_TYPE = NAMED_VARIABLE__VARIABLE_TYPE;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.FunctionResultImpl <em>Function Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.FunctionResultImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getFunctionResult()
	 * @generated
	 */
	int FUNCTION_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT__NAMESPACE = VARIABLE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT__DOCUMENTATION = VARIABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT__ID = VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT__VARIABLE_TYPE = VARIABLE__VARIABLE_TYPE;

	/**
	 * The number of structural features of the '<em>Function Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 16;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__NAMED_ELEMENTS = CorePackage.ALGORITHM_SCOPE__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__INCLUDES_REMARKS = CorePackage.ALGORITHM_SCOPE__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Local Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__LOCAL_ELEMENTS = CorePackage.ALGORITHM_SCOPE__LOCAL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Common Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__COMMON_ELEMENTS = CorePackage.ALGORITHM_SCOPE__COMMON_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__VARIABLES = CorePackage.ALGORITHM_SCOPE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__NAMESPACE = CorePackage.ALGORITHM_SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__DOCUMENTATION = CorePackage.ALGORITHM_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__ID = CorePackage.ALGORITHM_SCOPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__REFERENCED_AS = CorePackage.ALGORITHM_SCOPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__REFERENCED_IN = CorePackage.ALGORITHM_SCOPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__DEFINED_IN = CorePackage.ALGORITHM_SCOPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__LOCAL_SCOPE = CorePackage.ALGORITHM_SCOPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__BODY = CorePackage.ALGORITHM_SCOPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__FORMAL_PARAMETERS = CorePackage.ALGORITHM_SCOPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = CorePackage.ALGORITHM_SCOPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.FunctionImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAMED_ELEMENTS = ALGORITHM__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INCLUDES_REMARKS = ALGORITHM__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Local Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LOCAL_ELEMENTS = ALGORITHM__LOCAL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Common Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__COMMON_ELEMENTS = ALGORITHM__COMMON_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__VARIABLES = ALGORITHM__VARIABLES;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAMESPACE = ALGORITHM__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DOCUMENTATION = ALGORITHM__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = ALGORITHM__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__REFERENCED_AS = ALGORITHM__REFERENCED_AS;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__REFERENCED_IN = ALGORITHM__REFERENCED_IN;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DEFINED_IN = ALGORITHM__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LOCAL_SCOPE = ALGORITHM__LOCAL_SCOPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = ALGORITHM__BODY;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FORMAL_PARAMETERS = ALGORITHM__FORMAL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RESULT = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ParameterImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAMESPACE = CorePackage.LOCAL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOCUMENTATION = CorePackage.LOCAL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = CorePackage.LOCAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Structure Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STRUCTURE_CONSTRAINTS = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_CONSTRAINTS = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formal Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FORMAL_PARAMETER_TYPE = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INOUT = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__POSITION = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.InParameterImpl <em>In Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.InParameterImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getInParameter()
	 * @generated
	 */
	int IN_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER__NAMESPACE = PARAMETER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER__DOCUMENTATION = PARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Structure Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER__STRUCTURE_CONSTRAINTS = PARAMETER__STRUCTURE_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Type Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER__TYPE_CONSTRAINTS = PARAMETER__TYPE_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Formal Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER__FORMAL_PARAMETER_TYPE = PARAMETER__FORMAL_PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Inout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER__INOUT = PARAMETER__INOUT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER__POSITION = PARAMETER__POSITION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER__VARIABLE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.LocalVariableImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__NAMESPACE = VARIABLE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__DOCUMENTATION = VARIABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__ID = VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__VARIABLE_TYPE = VARIABLE__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.GenericElementImpl <em>Generic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.GenericElementImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getGenericElement()
	 * @generated
	 */
	int GENERIC_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__NAMESPACE = CorePackage.LOCAL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__DOCUMENTATION = CorePackage.LOCAL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__ID = CorePackage.LOCAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__SOURCE = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__LABEL = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT_FEATURE_COUNT = CorePackage.LOCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl <em>Actual Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualStructure()
	 * @generated
	 */
	int ACTUAL_STRUCTURE = 5;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__NAMESPACE = GENERIC_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__DOCUMENTATION = GENERIC_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__ID = GENERIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__SOURCE = GENERIC_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__LABEL = GENERIC_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__CONTAINS = GENERIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__ROLE = GENERIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__CONSTRAINTS = GENERIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occurs In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__OCCURS_IN = GENERIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__UPPER_BOUND = GENERIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__MEMBER_TYPE = GENERIC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__CONSTRAINT = GENERIC_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE__LOWER_BOUND = GENERIC_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Actual Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE_FEATURE_COUNT = GENERIC_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualGenericTypeImpl <em>Actual Generic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualGenericTypeImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualGenericType()
	 * @generated
	 */
	int ACTUAL_GENERIC_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_GENERIC_TYPE__INSTANCES = CorePackage.ACTUAL_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_GENERIC_TYPE__ROLE = CorePackage.ACTUAL_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_GENERIC_TYPE__CONSTRAINTS = CorePackage.ACTUAL_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_GENERIC_TYPE__SCOPE = CorePackage.ACTUAL_TYPE__SCOPE;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_GENERIC_TYPE__REFERS_TO = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_GENERIC_TYPE__IS_ENTITY = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_GENERIC_TYPE__LABEL = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actual Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_GENERIC_TYPE_FEATURE_COUNT = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__IN_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__CONTROLLED_BY = 3;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__IMPLEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__TEXT = 5;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.InVariableImpl <em>In Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.InVariableImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getInVariable()
	 * @generated
	 */
	int IN_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE__NAMESPACE = VARIABLE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE__DOCUMENTATION = VARIABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE__ID = VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE__VARIABLE_TYPE = VARIABLE__VARIABLE_TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE__SOURCE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ProcedureImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 10;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAMED_ELEMENTS = ALGORITHM__NAMED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Includes Remarks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__INCLUDES_REMARKS = ALGORITHM__INCLUDES_REMARKS;

	/**
	 * The feature id for the '<em><b>Local Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__LOCAL_ELEMENTS = ALGORITHM__LOCAL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Common Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__COMMON_ELEMENTS = ALGORITHM__COMMON_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__VARIABLES = ALGORITHM__VARIABLES;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAMESPACE = ALGORITHM__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__DOCUMENTATION = ALGORITHM__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ID = ALGORITHM__ID;

	/**
	 * The feature id for the '<em><b>Referenced As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__REFERENCED_AS = ALGORITHM__REFERENCED_AS;

	/**
	 * The feature id for the '<em><b>Referenced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__REFERENCED_IN = ALGORITHM__REFERENCED_IN;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__DEFINED_IN = ALGORITHM__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Local Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__LOCAL_SCOPE = ALGORITHM__LOCAL_SCOPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__BODY = ALGORITHM__BODY;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__FORMAL_PARAMETERS = ALGORITHM__FORMAL_PARAMETERS;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualAggregationTypeImpl <em>Actual Aggregation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualAggregationTypeImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualAggregationType()
	 * @generated
	 */
	int ACTUAL_AGGREGATION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATION_TYPE__INSTANCES = CorePackage.ACTUAL_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATION_TYPE__ROLE = CorePackage.ACTUAL_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATION_TYPE__CONSTRAINTS = CorePackage.ACTUAL_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATION_TYPE__SCOPE = CorePackage.ACTUAL_TYPE__SCOPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATION_TYPE__LOWER_BOUND = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATION_TYPE__UPPER_BOUND = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATION_TYPE__IS_UNIQUE = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATION_TYPE__ORDERING = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATION_TYPE__MEMBER_TYPE = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actual Aggregation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATION_TYPE_FEATURE_COUNT = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualARRAYTypeImpl <em>Actual ARRAY Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualARRAYTypeImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualARRAYType()
	 * @generated
	 */
	int ACTUAL_ARRAY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__INSTANCES = ACTUAL_AGGREGATION_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__ROLE = ACTUAL_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__CONSTRAINTS = ACTUAL_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__SCOPE = ACTUAL_AGGREGATION_TYPE__SCOPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__LOWER_BOUND = ACTUAL_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__UPPER_BOUND = ACTUAL_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__IS_UNIQUE = ACTUAL_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__ORDERING = ACTUAL_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__MEMBER_TYPE = ACTUAL_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Hi Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__HI_INDEX = ACTUAL_AGGREGATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lo Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__LO_INDEX = ACTUAL_AGGREGATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE__IS_OPTIONAL = ACTUAL_AGGREGATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actual ARRAY Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARRAY_TYPE_FEATURE_COUNT = ACTUAL_AGGREGATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualSETTypeImpl <em>Actual SET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualSETTypeImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualSETType()
	 * @generated
	 */
	int ACTUAL_SET_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_SET_TYPE__INSTANCES = ACTUAL_AGGREGATION_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_SET_TYPE__ROLE = ACTUAL_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_SET_TYPE__CONSTRAINTS = ACTUAL_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_SET_TYPE__SCOPE = ACTUAL_AGGREGATION_TYPE__SCOPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_SET_TYPE__LOWER_BOUND = ACTUAL_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_SET_TYPE__UPPER_BOUND = ACTUAL_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_SET_TYPE__IS_UNIQUE = ACTUAL_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_SET_TYPE__ORDERING = ACTUAL_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_SET_TYPE__MEMBER_TYPE = ACTUAL_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The number of structural features of the '<em>Actual SET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_SET_TYPE_FEATURE_COUNT = ACTUAL_AGGREGATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualAGGREGATETypeImpl <em>Actual AGGREGATE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualAGGREGATETypeImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualAGGREGATEType()
	 * @generated
	 */
	int ACTUAL_AGGREGATE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATE_TYPE__INSTANCES = CorePackage.ACTUAL_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATE_TYPE__ROLE = CorePackage.ACTUAL_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATE_TYPE__CONSTRAINTS = CorePackage.ACTUAL_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATE_TYPE__SCOPE = CorePackage.ACTUAL_TYPE__SCOPE;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATE_TYPE__UPPER_BOUND = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATE_TYPE__REFERS_TO = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATE_TYPE__MEMBER_TYPE = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATE_TYPE__LOWER_BOUND = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATE_TYPE__LABEL = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actual AGGREGATE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_AGGREGATE_TYPE_FEATURE_COUNT = CorePackage.ACTUAL_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureConstraintImpl <em>Actual Structure Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureConstraintImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualStructureConstraint()
	 * @generated
	 */
	int ACTUAL_STRUCTURE_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Matching Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Required Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE_CONSTRAINT__REQUIRED_STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE_CONSTRAINT__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Actual Structure Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_STRUCTURE_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.VARVariableImpl <em>VAR Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.VARVariableImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getVARVariable()
	 * @generated
	 */
	int VAR_VARIABLE = 18;

	/**
	 * The number of structural features of the '<em>VAR Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualLISTTypeImpl <em>Actual LIST Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualLISTTypeImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualLISTType()
	 * @generated
	 */
	int ACTUAL_LIST_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_LIST_TYPE__INSTANCES = ACTUAL_AGGREGATION_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_LIST_TYPE__ROLE = ACTUAL_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_LIST_TYPE__CONSTRAINTS = ACTUAL_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_LIST_TYPE__SCOPE = ACTUAL_AGGREGATION_TYPE__SCOPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_LIST_TYPE__LOWER_BOUND = ACTUAL_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_LIST_TYPE__UPPER_BOUND = ACTUAL_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_LIST_TYPE__IS_UNIQUE = ACTUAL_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_LIST_TYPE__ORDERING = ACTUAL_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_LIST_TYPE__MEMBER_TYPE = ACTUAL_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The number of structural features of the '<em>Actual LIST Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_LIST_TYPE_FEATURE_COUNT = ACTUAL_AGGREGATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.VARParameterImpl <em>VAR Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.VARParameterImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getVARParameter()
	 * @generated
	 */
	int VAR_PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__NAMESPACE = PARAMETER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__DOCUMENTATION = PARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Structure Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__STRUCTURE_CONSTRAINTS = PARAMETER__STRUCTURE_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Type Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__TYPE_CONSTRAINTS = PARAMETER__TYPE_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Formal Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__FORMAL_PARAMETER_TYPE = PARAMETER__FORMAL_PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Inout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__INOUT = PARAMETER__INOUT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__POSITION = PARAMETER__POSITION;

	/**
	 * The number of structural features of the '<em>VAR Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualDataTypeImpl <em>Actual Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualDataTypeImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualDataType()
	 * @generated
	 */
	int ACTUAL_DATA_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE__CONTAINS = CorePackage.GENERIC_TYPE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE__ROLE = CorePackage.GENERIC_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE__CONSTRAINTS = CorePackage.GENERIC_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Occurs In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE__OCCURS_IN = CorePackage.GENERIC_TYPE__OCCURS_IN;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE__CONSTRAINT = CorePackage.GENERIC_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE__IS_ENTITY = CorePackage.GENERIC_TYPE__IS_ENTITY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE__NAMESPACE = CorePackage.GENERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE__DOCUMENTATION = CorePackage.GENERIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE__ID = CorePackage.GENERIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE__SOURCE = CorePackage.GENERIC_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE__LABEL = CorePackage.GENERIC_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actual Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_DATA_TYPE_FEATURE_COUNT = CorePackage.GENERIC_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualBAGTypeImpl <em>Actual BAG Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualBAGTypeImpl
	 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualBAGType()
	 * @generated
	 */
	int ACTUAL_BAG_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_BAG_TYPE__INSTANCES = ACTUAL_AGGREGATION_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_BAG_TYPE__ROLE = ACTUAL_AGGREGATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_BAG_TYPE__CONSTRAINTS = ACTUAL_AGGREGATION_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_BAG_TYPE__SCOPE = ACTUAL_AGGREGATION_TYPE__SCOPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_BAG_TYPE__LOWER_BOUND = ACTUAL_AGGREGATION_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_BAG_TYPE__UPPER_BOUND = ACTUAL_AGGREGATION_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_BAG_TYPE__IS_UNIQUE = ACTUAL_AGGREGATION_TYPE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_BAG_TYPE__ORDERING = ACTUAL_AGGREGATION_TYPE__ORDERING;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_BAG_TYPE__MEMBER_TYPE = ACTUAL_AGGREGATION_TYPE__MEMBER_TYPE;

	/**
	 * The number of structural features of the '<em>Actual BAG Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_BAG_TYPE_FEATURE_COUNT = ACTUAL_AGGREGATION_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint <em>Actual Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Type Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint
	 * @generated
	 */
	EClass getActualTypeConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getMatchingType <em>Matching Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matching Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getMatchingType()
	 * @see #getActualTypeConstraint()
	 * @generated
	 */
	EReference getActualTypeConstraint_MatchingType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getRequiredType <em>Required Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getRequiredType()
	 * @see #getActualTypeConstraint()
	 * @generated
	 */
	EReference getActualTypeConstraint_RequiredType();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getLabel()
	 * @see #getActualTypeConstraint()
	 * @generated
	 */
	EAttribute getActualTypeConstraint_Label();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.FunctionResult <em>Function Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Result</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.FunctionResult
	 * @generated
	 */
	EClass getFunctionResult();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.algorithms.Function#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Function#getResult()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Result();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.InParameter <em>In Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Parameter</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.InParameter
	 * @generated
	 */
	EClass getInParameter();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.InParameter#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.InParameter#getVariable()
	 * @see #getInParameter()
	 * @generated
	 */
	EReference getInParameter_Variable();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.LocalVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Value</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.LocalVariable#getInitialValue()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.ActualStructure <em>Actual Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Structure</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualStructure
	 * @generated
	 */
	EClass getActualStructure();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.ActualGenericType <em>Actual Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Generic Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualGenericType
	 * @generated
	 */
	EClass getActualGenericType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualGenericType#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualGenericType#getRefersTo()
	 * @see #getActualGenericType()
	 * @generated
	 */
	EReference getActualGenericType_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.algorithms.ActualGenericType#getIsEntity <em>Is Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Entity</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualGenericType#getIsEntity()
	 * @see #getActualGenericType()
	 * @generated
	 */
	EAttribute getActualGenericType_IsEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.algorithms.ActualGenericType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualGenericType#getLabel()
	 * @see #getActualGenericType()
	 * @generated
	 */
	EAttribute getActualGenericType_Label();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getInBlock <em>In Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Block</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Statement#getInBlock()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_InBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getBodyStatementsSkipStatement <em>Body Statements Skip Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Statements Skip Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Statement#getBodyStatementsSkipStatement()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_BodyStatementsSkipStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getBodyStatementsEscapeStatement <em>Body Statements Escape Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Statements Escape Statement</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Statement#getBodyStatementsEscapeStatement()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_BodyStatementsEscapeStatement();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getControlledBy <em>Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Controlled By</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Statement#getControlledBy()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_ControlledBy();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Implements</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Statement#getImplements()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Implements();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Statement#getText()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Text();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.NamedVariable <em>Named Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.NamedVariable
	 * @generated
	 */
	EClass getNamedVariable();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.NamedVariable#getVariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.NamedVariable#getVariableType()
	 * @see #getNamedVariable()
	 * @generated
	 */
	EReference getNamedVariable_VariableType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.InVariable <em>In Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.InVariable
	 * @generated
	 */
	EClass getInVariable();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.InVariable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.InVariable#getSource()
	 * @see #getInVariable()
	 * @generated
	 */
	EReference getInVariable_Source();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.ActualARRAYType <em>Actual ARRAY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual ARRAY Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualARRAYType
	 * @generated
	 */
	EClass getActualARRAYType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getHiIndex <em>Hi Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hi Index</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getHiIndex()
	 * @see #getActualARRAYType()
	 * @generated
	 */
	EReference getActualARRAYType_HiIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getLoIndex <em>Lo Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lo Index</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getLoIndex()
	 * @see #getActualARRAYType()
	 * @generated
	 */
	EReference getActualARRAYType_LoIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getIsOptional()
	 * @see #getActualARRAYType()
	 * @generated
	 */
	EAttribute getActualARRAYType_IsOptional();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.ActualSETType <em>Actual SET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual SET Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualSETType
	 * @generated
	 */
	EClass getActualSETType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType <em>Actual AGGREGATE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual AGGREGATE Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType
	 * @generated
	 */
	EClass getActualAGGREGATEType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getUpperBound()
	 * @see #getActualAGGREGATEType()
	 * @generated
	 */
	EReference getActualAGGREGATEType_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getRefersTo()
	 * @see #getActualAGGREGATEType()
	 * @generated
	 */
	EReference getActualAGGREGATEType_RefersTo();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getMemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getMemberType()
	 * @see #getActualAGGREGATEType()
	 * @generated
	 */
	EReference getActualAGGREGATEType_MemberType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getLowerBound()
	 * @see #getActualAGGREGATEType()
	 * @generated
	 */
	EReference getActualAGGREGATEType_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType#getLabel()
	 * @see #getActualAGGREGATEType()
	 * @generated
	 */
	EAttribute getActualAGGREGATEType_Label();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getStructureConstraints <em>Structure Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Constraints</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Parameter#getStructureConstraints()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_StructureConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getTypeConstraints <em>Type Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Constraints</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Parameter#getTypeConstraints()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_TypeConstraints();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getFormalParameterType <em>Formal Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formal Parameter Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Parameter#getFormalParameterType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_FormalParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getInout <em>Inout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inout</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Parameter#getInout()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Inout();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.algorithms.Parameter#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Parameter#getPosition()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Position();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint <em>Actual Structure Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Structure Constraint</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint
	 * @generated
	 */
	EClass getActualStructureConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getMatchingStructure <em>Matching Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matching Structure</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getMatchingStructure()
	 * @see #getActualStructureConstraint()
	 * @generated
	 */
	EReference getActualStructureConstraint_MatchingStructure();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getRequiredStructure <em>Required Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Structure</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getRequiredStructure()
	 * @see #getActualStructureConstraint()
	 * @generated
	 */
	EReference getActualStructureConstraint_RequiredStructure();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint#getLabel()
	 * @see #getActualStructureConstraint()
	 * @generated
	 */
	EAttribute getActualStructureConstraint_Label();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Algorithm
	 * @generated
	 */
	EClass getAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.algorithms.Algorithm#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Algorithm#getBody()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Body();

	/**
	 * Returns the meta object for the reference list '{@link org.ifc4emf.metamodel.express.algorithms.Algorithm#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formal Parameters</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Algorithm#getFormalParameters()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_FormalParameters();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.ActualAggregationType <em>Actual Aggregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Aggregation Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualAggregationType
	 * @generated
	 */
	EClass getActualAggregationType();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.ActualAggregationType#getMemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualAggregationType#getMemberType()
	 * @see #getActualAggregationType()
	 * @generated
	 */
	EReference getActualAggregationType_MemberType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.VARVariable <em>VAR Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VAR Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.VARVariable
	 * @generated
	 */
	EClass getVARVariable();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.ActualLISTType <em>Actual LIST Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual LIST Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualLISTType
	 * @generated
	 */
	EClass getActualLISTType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.GenericElement <em>Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Element</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.GenericElement
	 * @generated
	 */
	EClass getGenericElement();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.express.algorithms.GenericElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.GenericElement#getSource()
	 * @see #getGenericElement()
	 * @generated
	 */
	EReference getGenericElement_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.express.algorithms.GenericElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.GenericElement#getLabel()
	 * @see #getGenericElement()
	 * @generated
	 */
	EReference getGenericElement_Label();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.VARParameter <em>VAR Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VAR Parameter</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.VARParameter
	 * @generated
	 */
	EClass getVARParameter();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.ActualDataType <em>Actual Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Data Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualDataType
	 * @generated
	 */
	EClass getActualDataType();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.express.algorithms.ActualBAGType <em>Actual BAG Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual BAG Type</em>'.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualBAGType
	 * @generated
	 */
	EClass getActualBAGType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgorithmsFactory getAlgorithmsFactory();

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
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualTypeConstraintImpl <em>Actual Type Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualTypeConstraintImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualTypeConstraint()
		 * @generated
		 */
		EClass ACTUAL_TYPE_CONSTRAINT = eINSTANCE.getActualTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Matching Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_TYPE_CONSTRAINT__MATCHING_TYPE = eINSTANCE.getActualTypeConstraint_MatchingType();

		/**
		 * The meta object literal for the '<em><b>Required Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_TYPE_CONSTRAINT__REQUIRED_TYPE = eINSTANCE.getActualTypeConstraint_RequiredType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_TYPE_CONSTRAINT__LABEL = eINSTANCE.getActualTypeConstraint_Label();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.FunctionResultImpl <em>Function Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.FunctionResultImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getFunctionResult()
		 * @generated
		 */
		EClass FUNCTION_RESULT = eINSTANCE.getFunctionResult();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.FunctionImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RESULT = eINSTANCE.getFunction_Result();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.InParameterImpl <em>In Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.InParameterImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getInParameter()
		 * @generated
		 */
		EClass IN_PARAMETER = eINSTANCE.getInParameter();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PARAMETER__VARIABLE = eINSTANCE.getInParameter_Variable();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.LocalVariableImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__INITIAL_VALUE = eINSTANCE.getLocalVariable_InitialValue();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl <em>Actual Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualStructure()
		 * @generated
		 */
		EClass ACTUAL_STRUCTURE = eINSTANCE.getActualStructure();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualGenericTypeImpl <em>Actual Generic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualGenericTypeImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualGenericType()
		 * @generated
		 */
		EClass ACTUAL_GENERIC_TYPE = eINSTANCE.getActualGenericType();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_GENERIC_TYPE__REFERS_TO = eINSTANCE.getActualGenericType_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Is Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_GENERIC_TYPE__IS_ENTITY = eINSTANCE.getActualGenericType_IsEntity();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_GENERIC_TYPE__LABEL = eINSTANCE.getActualGenericType_Label();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>In Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__IN_BLOCK = eINSTANCE.getStatement_InBlock();

		/**
		 * The meta object literal for the '<em><b>Body Statements Skip Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT = eINSTANCE.getStatement_BodyStatementsSkipStatement();

		/**
		 * The meta object literal for the '<em><b>Body Statements Escape Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT = eINSTANCE.getStatement_BodyStatementsEscapeStatement();

		/**
		 * The meta object literal for the '<em><b>Controlled By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__CONTROLLED_BY = eINSTANCE.getStatement_ControlledBy();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__IMPLEMENTS = eINSTANCE.getStatement_Implements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__TEXT = eINSTANCE.getStatement_Text();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.NamedVariableImpl <em>Named Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.NamedVariableImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getNamedVariable()
		 * @generated
		 */
		EClass NAMED_VARIABLE = eINSTANCE.getNamedVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_VARIABLE__VARIABLE_TYPE = eINSTANCE.getNamedVariable_VariableType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.InVariableImpl <em>In Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.InVariableImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getInVariable()
		 * @generated
		 */
		EClass IN_VARIABLE = eINSTANCE.getInVariable();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_VARIABLE__SOURCE = eINSTANCE.getInVariable_Source();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ProcedureImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualARRAYTypeImpl <em>Actual ARRAY Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualARRAYTypeImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualARRAYType()
		 * @generated
		 */
		EClass ACTUAL_ARRAY_TYPE = eINSTANCE.getActualARRAYType();

		/**
		 * The meta object literal for the '<em><b>Hi Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_ARRAY_TYPE__HI_INDEX = eINSTANCE.getActualARRAYType_HiIndex();

		/**
		 * The meta object literal for the '<em><b>Lo Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_ARRAY_TYPE__LO_INDEX = eINSTANCE.getActualARRAYType_LoIndex();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_ARRAY_TYPE__IS_OPTIONAL = eINSTANCE.getActualARRAYType_IsOptional();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualSETTypeImpl <em>Actual SET Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualSETTypeImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualSETType()
		 * @generated
		 */
		EClass ACTUAL_SET_TYPE = eINSTANCE.getActualSETType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualAGGREGATETypeImpl <em>Actual AGGREGATE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualAGGREGATETypeImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualAGGREGATEType()
		 * @generated
		 */
		EClass ACTUAL_AGGREGATE_TYPE = eINSTANCE.getActualAGGREGATEType();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_AGGREGATE_TYPE__UPPER_BOUND = eINSTANCE.getActualAGGREGATEType_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_AGGREGATE_TYPE__REFERS_TO = eINSTANCE.getActualAGGREGATEType_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Member Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_AGGREGATE_TYPE__MEMBER_TYPE = eINSTANCE.getActualAGGREGATEType_MemberType();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_AGGREGATE_TYPE__LOWER_BOUND = eINSTANCE.getActualAGGREGATEType_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_AGGREGATE_TYPE__LABEL = eINSTANCE.getActualAGGREGATEType_Label();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ParameterImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Structure Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__STRUCTURE_CONSTRAINTS = eINSTANCE.getParameter_StructureConstraints();

		/**
		 * The meta object literal for the '<em><b>Type Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE_CONSTRAINTS = eINSTANCE.getParameter_TypeConstraints();

		/**
		 * The meta object literal for the '<em><b>Formal Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__FORMAL_PARAMETER_TYPE = eINSTANCE.getParameter_FormalParameterType();

		/**
		 * The meta object literal for the '<em><b>Inout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__INOUT = eINSTANCE.getParameter_Inout();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__POSITION = eINSTANCE.getParameter_Position();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureConstraintImpl <em>Actual Structure Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualStructureConstraintImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualStructureConstraint()
		 * @generated
		 */
		EClass ACTUAL_STRUCTURE_CONSTRAINT = eINSTANCE.getActualStructureConstraint();

		/**
		 * The meta object literal for the '<em><b>Matching Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_STRUCTURE_CONSTRAINT__MATCHING_STRUCTURE = eINSTANCE.getActualStructureConstraint_MatchingStructure();

		/**
		 * The meta object literal for the '<em><b>Required Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_STRUCTURE_CONSTRAINT__REQUIRED_STRUCTURE = eINSTANCE.getActualStructureConstraint_RequiredStructure();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_STRUCTURE_CONSTRAINT__LABEL = eINSTANCE.getActualStructureConstraint_Label();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getAlgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__BODY = eINSTANCE.getAlgorithm_Body();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__FORMAL_PARAMETERS = eINSTANCE.getAlgorithm_FormalParameters();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualAggregationTypeImpl <em>Actual Aggregation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualAggregationTypeImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualAggregationType()
		 * @generated
		 */
		EClass ACTUAL_AGGREGATION_TYPE = eINSTANCE.getActualAggregationType();

		/**
		 * The meta object literal for the '<em><b>Member Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_AGGREGATION_TYPE__MEMBER_TYPE = eINSTANCE.getActualAggregationType_MemberType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.VARVariableImpl <em>VAR Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.VARVariableImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getVARVariable()
		 * @generated
		 */
		EClass VAR_VARIABLE = eINSTANCE.getVARVariable();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualLISTTypeImpl <em>Actual LIST Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualLISTTypeImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualLISTType()
		 * @generated
		 */
		EClass ACTUAL_LIST_TYPE = eINSTANCE.getActualLISTType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.VariableImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.GenericElementImpl <em>Generic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.GenericElementImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getGenericElement()
		 * @generated
		 */
		EClass GENERIC_ELEMENT = eINSTANCE.getGenericElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_ELEMENT__SOURCE = eINSTANCE.getGenericElement_Source();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_ELEMENT__LABEL = eINSTANCE.getGenericElement_Label();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.VARParameterImpl <em>VAR Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.VARParameterImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getVARParameter()
		 * @generated
		 */
		EClass VAR_PARAMETER = eINSTANCE.getVARParameter();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualDataTypeImpl <em>Actual Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualDataTypeImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualDataType()
		 * @generated
		 */
		EClass ACTUAL_DATA_TYPE = eINSTANCE.getActualDataType();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualBAGTypeImpl <em>Actual BAG Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.ActualBAGTypeImpl
		 * @see org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsPackageImpl#getActualBAGType()
		 * @generated
		 */
		EClass ACTUAL_BAG_TYPE = eINSTANCE.getActualBAGType();

	}

} //AlgorithmsPackage
