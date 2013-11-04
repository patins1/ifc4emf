/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.ifc4emf.metamodel.express.algorithms.*;
import org.ifc4emf.metamodel.express.core.AGGREGATEType;
import org.ifc4emf.metamodel.express.core.ActualType;
import org.ifc4emf.metamodel.express.core.AggregationType;
import org.ifc4emf.metamodel.express.core.AlgorithmScope;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.CommonElement;
import org.ifc4emf.metamodel.express.core.DataType;
import org.ifc4emf.metamodel.express.core.GeneralizedType;
import org.ifc4emf.metamodel.express.core.GenericType;
import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.LocalScope;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.ParameterType;
import org.ifc4emf.metamodel.express.core.SchemaElement;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.core.VariableType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage
 * @generated
 */
public class AlgorithmsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlgorithmsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmsSwitch() {
		if (modelPackage == null) {
			modelPackage = AlgorithmsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT: {
				ActualTypeConstraint actualTypeConstraint = (ActualTypeConstraint)theEObject;
				T result = caseActualTypeConstraint(actualTypeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.FUNCTION_RESULT: {
				FunctionResult functionResult = (FunctionResult)theEObject;
				T result = caseFunctionResult(functionResult);
				if (result == null) result = caseVariable(functionResult);
				if (result == null) result = caseNamedVariable(functionResult);
				if (result == null) result = caseLocalElement(functionResult);
				if (result == null) result = caseNamedElement(functionResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseAlgorithm(function);
				if (result == null) result = caseAlgorithmScope(function);
				if (result == null) result = caseCommonElement(function);
				if (result == null) result = caseLocalScope(function);
				if (result == null) result = caseSchemaElement(function);
				if (result == null) result = caseScope(function);
				if (result == null) result = caseNamedElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.IN_PARAMETER: {
				InParameter inParameter = (InParameter)theEObject;
				T result = caseInParameter(inParameter);
				if (result == null) result = caseParameter(inParameter);
				if (result == null) result = caseLocalElement(inParameter);
				if (result == null) result = caseNamedElement(inParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.LOCAL_VARIABLE: {
				LocalVariable localVariable = (LocalVariable)theEObject;
				T result = caseLocalVariable(localVariable);
				if (result == null) result = caseVariable(localVariable);
				if (result == null) result = caseNamedVariable(localVariable);
				if (result == null) result = caseLocalElement(localVariable);
				if (result == null) result = caseNamedElement(localVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.ACTUAL_STRUCTURE: {
				ActualStructure actualStructure = (ActualStructure)theEObject;
				T result = caseActualStructure(actualStructure);
				if (result == null) result = caseGenericElement(actualStructure);
				if (result == null) result = caseAGGREGATEType(actualStructure);
				if (result == null) result = caseLocalElement(actualStructure);
				if (result == null) result = caseGeneralizedType(actualStructure);
				if (result == null) result = caseNamedElement(actualStructure);
				if (result == null) result = caseParameterType(actualStructure);
				if (result == null) result = caseAttributeType(actualStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.ACTUAL_GENERIC_TYPE: {
				ActualGenericType actualGenericType = (ActualGenericType)theEObject;
				T result = caseActualGenericType(actualGenericType);
				if (result == null) result = caseActualType(actualGenericType);
				if (result == null) result = caseVariableType(actualGenericType);
				if (result == null) result = caseDataType(actualGenericType);
				if (result == null) result = caseAttributeType(actualGenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.NAMED_VARIABLE: {
				NamedVariable namedVariable = (NamedVariable)theEObject;
				T result = caseNamedVariable(namedVariable);
				if (result == null) result = caseLocalElement(namedVariable);
				if (result == null) result = caseNamedElement(namedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.IN_VARIABLE: {
				InVariable inVariable = (InVariable)theEObject;
				T result = caseInVariable(inVariable);
				if (result == null) result = caseVariable(inVariable);
				if (result == null) result = caseNamedVariable(inVariable);
				if (result == null) result = caseLocalElement(inVariable);
				if (result == null) result = caseNamedElement(inVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseAlgorithm(procedure);
				if (result == null) result = caseAlgorithmScope(procedure);
				if (result == null) result = caseCommonElement(procedure);
				if (result == null) result = caseLocalScope(procedure);
				if (result == null) result = caseSchemaElement(procedure);
				if (result == null) result = caseScope(procedure);
				if (result == null) result = caseNamedElement(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.ACTUAL_ARRAY_TYPE: {
				ActualARRAYType actualARRAYType = (ActualARRAYType)theEObject;
				T result = caseActualARRAYType(actualARRAYType);
				if (result == null) result = caseActualAggregationType(actualARRAYType);
				if (result == null) result = caseActualType(actualARRAYType);
				if (result == null) result = caseAggregationType(actualARRAYType);
				if (result == null) result = caseVariableType(actualARRAYType);
				if (result == null) result = caseDataType(actualARRAYType);
				if (result == null) result = caseAttributeType(actualARRAYType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.ACTUAL_SET_TYPE: {
				ActualSETType actualSETType = (ActualSETType)theEObject;
				T result = caseActualSETType(actualSETType);
				if (result == null) result = caseActualAggregationType(actualSETType);
				if (result == null) result = caseActualType(actualSETType);
				if (result == null) result = caseAggregationType(actualSETType);
				if (result == null) result = caseVariableType(actualSETType);
				if (result == null) result = caseDataType(actualSETType);
				if (result == null) result = caseAttributeType(actualSETType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE: {
				ActualAGGREGATEType actualAGGREGATEType = (ActualAGGREGATEType)theEObject;
				T result = caseActualAGGREGATEType(actualAGGREGATEType);
				if (result == null) result = caseActualType(actualAGGREGATEType);
				if (result == null) result = caseVariableType(actualAGGREGATEType);
				if (result == null) result = caseDataType(actualAGGREGATEType);
				if (result == null) result = caseAttributeType(actualAGGREGATEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseLocalElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT: {
				ActualStructureConstraint actualStructureConstraint = (ActualStructureConstraint)theEObject;
				T result = caseActualStructureConstraint(actualStructureConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.ALGORITHM: {
				Algorithm algorithm = (Algorithm)theEObject;
				T result = caseAlgorithm(algorithm);
				if (result == null) result = caseAlgorithmScope(algorithm);
				if (result == null) result = caseCommonElement(algorithm);
				if (result == null) result = caseLocalScope(algorithm);
				if (result == null) result = caseSchemaElement(algorithm);
				if (result == null) result = caseScope(algorithm);
				if (result == null) result = caseNamedElement(algorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.ACTUAL_AGGREGATION_TYPE: {
				ActualAggregationType actualAggregationType = (ActualAggregationType)theEObject;
				T result = caseActualAggregationType(actualAggregationType);
				if (result == null) result = caseActualType(actualAggregationType);
				if (result == null) result = caseAggregationType(actualAggregationType);
				if (result == null) result = caseVariableType(actualAggregationType);
				if (result == null) result = caseDataType(actualAggregationType);
				if (result == null) result = caseAttributeType(actualAggregationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.VAR_VARIABLE: {
				VARVariable varVariable = (VARVariable)theEObject;
				T result = caseVARVariable(varVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.ACTUAL_LIST_TYPE: {
				ActualLISTType actualLISTType = (ActualLISTType)theEObject;
				T result = caseActualLISTType(actualLISTType);
				if (result == null) result = caseActualAggregationType(actualLISTType);
				if (result == null) result = caseActualType(actualLISTType);
				if (result == null) result = caseAggregationType(actualLISTType);
				if (result == null) result = caseVariableType(actualLISTType);
				if (result == null) result = caseDataType(actualLISTType);
				if (result == null) result = caseAttributeType(actualLISTType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseNamedVariable(variable);
				if (result == null) result = caseLocalElement(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.GENERIC_ELEMENT: {
				GenericElement genericElement = (GenericElement)theEObject;
				T result = caseGenericElement(genericElement);
				if (result == null) result = caseLocalElement(genericElement);
				if (result == null) result = caseNamedElement(genericElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.VAR_PARAMETER: {
				VARParameter varParameter = (VARParameter)theEObject;
				T result = caseVARParameter(varParameter);
				if (result == null) result = caseParameter(varParameter);
				if (result == null) result = caseVARVariable(varParameter);
				if (result == null) result = caseLocalElement(varParameter);
				if (result == null) result = caseNamedElement(varParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.ACTUAL_DATA_TYPE: {
				ActualDataType actualDataType = (ActualDataType)theEObject;
				T result = caseActualDataType(actualDataType);
				if (result == null) result = caseGenericType(actualDataType);
				if (result == null) result = caseGenericElement(actualDataType);
				if (result == null) result = caseGeneralizedType(actualDataType);
				if (result == null) result = caseLocalElement(actualDataType);
				if (result == null) result = caseParameterType(actualDataType);
				if (result == null) result = caseAttributeType(actualDataType);
				if (result == null) result = caseNamedElement(actualDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgorithmsPackage.ACTUAL_BAG_TYPE: {
				ActualBAGType actualBAGType = (ActualBAGType)theEObject;
				T result = caseActualBAGType(actualBAGType);
				if (result == null) result = caseActualAggregationType(actualBAGType);
				if (result == null) result = caseActualType(actualBAGType);
				if (result == null) result = caseAggregationType(actualBAGType);
				if (result == null) result = caseVariableType(actualBAGType);
				if (result == null) result = caseDataType(actualBAGType);
				if (result == null) result = caseAttributeType(actualBAGType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Type Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Type Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualTypeConstraint(ActualTypeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionResult(FunctionResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInParameter(InParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariable(LocalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualStructure(ActualStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Generic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualGenericType(ActualGenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedVariable(NamedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInVariable(InVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual ARRAY Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual ARRAY Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualARRAYType(ActualARRAYType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual SET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual SET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualSETType(ActualSETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual AGGREGATE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual AGGREGATE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualAGGREGATEType(ActualAGGREGATEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Structure Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Structure Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualStructureConstraint(ActualStructureConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithm(Algorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Aggregation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Aggregation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualAggregationType(ActualAggregationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VAR Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VAR Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVARVariable(VARVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual LIST Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual LIST Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualLISTType(ActualLISTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericElement(GenericElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VAR Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VAR Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVARParameter(VARParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualDataType(ActualDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual BAG Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual BAG Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualBAGType(ActualBAGType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalElement(LocalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalScope(LocalScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithmScope(AlgorithmScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaElement(SchemaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonElement(CommonElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeType(AttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizedType(GeneralizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AGGREGATE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AGGREGATE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAGGREGATEType(AGGREGATEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType(VariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualType(ActualType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationType(AggregationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericType(GenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AlgorithmsSwitch
