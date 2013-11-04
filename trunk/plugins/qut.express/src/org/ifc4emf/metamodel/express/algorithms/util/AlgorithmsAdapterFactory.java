/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage
 * @generated
 */
public class AlgorithmsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlgorithmsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AlgorithmsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmsSwitch<Adapter> modelSwitch =
		new AlgorithmsSwitch<Adapter>() {
			@Override
			public Adapter caseActualTypeConstraint(ActualTypeConstraint object) {
				return createActualTypeConstraintAdapter();
			}
			@Override
			public Adapter caseFunctionResult(FunctionResult object) {
				return createFunctionResultAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseInParameter(InParameter object) {
				return createInParameterAdapter();
			}
			@Override
			public Adapter caseLocalVariable(LocalVariable object) {
				return createLocalVariableAdapter();
			}
			@Override
			public Adapter caseActualStructure(ActualStructure object) {
				return createActualStructureAdapter();
			}
			@Override
			public Adapter caseActualGenericType(ActualGenericType object) {
				return createActualGenericTypeAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseNamedVariable(NamedVariable object) {
				return createNamedVariableAdapter();
			}
			@Override
			public Adapter caseInVariable(InVariable object) {
				return createInVariableAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseActualARRAYType(ActualARRAYType object) {
				return createActualARRAYTypeAdapter();
			}
			@Override
			public Adapter caseActualSETType(ActualSETType object) {
				return createActualSETTypeAdapter();
			}
			@Override
			public Adapter caseActualAGGREGATEType(ActualAGGREGATEType object) {
				return createActualAGGREGATETypeAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseActualStructureConstraint(ActualStructureConstraint object) {
				return createActualStructureConstraintAdapter();
			}
			@Override
			public Adapter caseAlgorithm(Algorithm object) {
				return createAlgorithmAdapter();
			}
			@Override
			public Adapter caseActualAggregationType(ActualAggregationType object) {
				return createActualAggregationTypeAdapter();
			}
			@Override
			public Adapter caseVARVariable(VARVariable object) {
				return createVARVariableAdapter();
			}
			@Override
			public Adapter caseActualLISTType(ActualLISTType object) {
				return createActualLISTTypeAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseGenericElement(GenericElement object) {
				return createGenericElementAdapter();
			}
			@Override
			public Adapter caseVARParameter(VARParameter object) {
				return createVARParameterAdapter();
			}
			@Override
			public Adapter caseActualDataType(ActualDataType object) {
				return createActualDataTypeAdapter();
			}
			@Override
			public Adapter caseActualBAGType(ActualBAGType object) {
				return createActualBAGTypeAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseLocalElement(LocalElement object) {
				return createLocalElementAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter caseLocalScope(LocalScope object) {
				return createLocalScopeAdapter();
			}
			@Override
			public Adapter caseAlgorithmScope(AlgorithmScope object) {
				return createAlgorithmScopeAdapter();
			}
			@Override
			public Adapter caseSchemaElement(SchemaElement object) {
				return createSchemaElementAdapter();
			}
			@Override
			public Adapter caseCommonElement(CommonElement object) {
				return createCommonElementAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			@Override
			public Adapter caseGeneralizedType(GeneralizedType object) {
				return createGeneralizedTypeAdapter();
			}
			@Override
			public Adapter caseAGGREGATEType(AGGREGATEType object) {
				return createAGGREGATETypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseVariableType(VariableType object) {
				return createVariableTypeAdapter();
			}
			@Override
			public Adapter caseActualType(ActualType object) {
				return createActualTypeAdapter();
			}
			@Override
			public Adapter caseAggregationType(AggregationType object) {
				return createAggregationTypeAdapter();
			}
			@Override
			public Adapter caseGenericType(GenericType object) {
				return createGenericTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint <em>Actual Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint
	 * @generated
	 */
	public Adapter createActualTypeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.FunctionResult <em>Function Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.FunctionResult
	 * @generated
	 */
	public Adapter createFunctionResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.InParameter <em>In Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.InParameter
	 * @generated
	 */
	public Adapter createInParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.LocalVariable
	 * @generated
	 */
	public Adapter createLocalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.ActualStructure <em>Actual Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualStructure
	 * @generated
	 */
	public Adapter createActualStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.ActualGenericType <em>Actual Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualGenericType
	 * @generated
	 */
	public Adapter createActualGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.NamedVariable <em>Named Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.NamedVariable
	 * @generated
	 */
	public Adapter createNamedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.InVariable <em>In Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.InVariable
	 * @generated
	 */
	public Adapter createInVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.ActualARRAYType <em>Actual ARRAY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualARRAYType
	 * @generated
	 */
	public Adapter createActualARRAYTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.ActualSETType <em>Actual SET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualSETType
	 * @generated
	 */
	public Adapter createActualSETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType <em>Actual AGGREGATE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualAGGREGATEType
	 * @generated
	 */
	public Adapter createActualAGGREGATETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint <em>Actual Structure Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualStructureConstraint
	 * @generated
	 */
	public Adapter createActualStructureConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.Algorithm
	 * @generated
	 */
	public Adapter createAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.ActualAggregationType <em>Actual Aggregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualAggregationType
	 * @generated
	 */
	public Adapter createActualAggregationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.VARVariable <em>VAR Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.VARVariable
	 * @generated
	 */
	public Adapter createVARVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.ActualLISTType <em>Actual LIST Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualLISTType
	 * @generated
	 */
	public Adapter createActualLISTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.GenericElement <em>Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.GenericElement
	 * @generated
	 */
	public Adapter createGenericElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.VARParameter <em>VAR Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.VARParameter
	 * @generated
	 */
	public Adapter createVARParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.ActualDataType <em>Actual Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualDataType
	 * @generated
	 */
	public Adapter createActualDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.algorithms.ActualBAGType <em>Actual BAG Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualBAGType
	 * @generated
	 */
	public Adapter createActualBAGTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.LocalElement <em>Local Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.LocalElement
	 * @generated
	 */
	public Adapter createLocalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.LocalScope <em>Local Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.LocalScope
	 * @generated
	 */
	public Adapter createLocalScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.AlgorithmScope <em>Algorithm Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.AlgorithmScope
	 * @generated
	 */
	public Adapter createAlgorithmScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.SchemaElement <em>Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.SchemaElement
	 * @generated
	 */
	public Adapter createSchemaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.CommonElement <em>Common Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.CommonElement
	 * @generated
	 */
	public Adapter createCommonElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.GeneralizedType <em>Generalized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.GeneralizedType
	 * @generated
	 */
	public Adapter createGeneralizedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.AGGREGATEType <em>AGGREGATE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.AGGREGATEType
	 * @generated
	 */
	public Adapter createAGGREGATETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.VariableType
	 * @generated
	 */
	public Adapter createVariableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.ActualType <em>Actual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.ActualType
	 * @generated
	 */
	public Adapter createActualTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.AggregationType <em>Aggregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.AggregationType
	 * @generated
	 */
	public Adapter createAggregationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.GenericType <em>Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.GenericType
	 * @generated
	 */
	public Adapter createGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AlgorithmsAdapterFactory
