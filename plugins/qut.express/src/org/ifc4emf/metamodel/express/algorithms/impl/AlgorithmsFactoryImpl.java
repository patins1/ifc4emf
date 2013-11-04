/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ifc4emf.metamodel.express.algorithms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgorithmsFactoryImpl extends EFactoryImpl implements AlgorithmsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlgorithmsFactory init() {
		try {
			AlgorithmsFactory theAlgorithmsFactory = (AlgorithmsFactory)EPackage.Registry.INSTANCE.getEFactory(AlgorithmsPackage.eNS_URI);
			if (theAlgorithmsFactory != null) {
				return theAlgorithmsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AlgorithmsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmsFactoryImpl() {
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
			case AlgorithmsPackage.ACTUAL_TYPE_CONSTRAINT: return createActualTypeConstraint();
			case AlgorithmsPackage.FUNCTION_RESULT: return createFunctionResult();
			case AlgorithmsPackage.FUNCTION: return createFunction();
			case AlgorithmsPackage.IN_PARAMETER: return createInParameter();
			case AlgorithmsPackage.LOCAL_VARIABLE: return createLocalVariable();
			case AlgorithmsPackage.ACTUAL_STRUCTURE: return createActualStructure();
			case AlgorithmsPackage.ACTUAL_GENERIC_TYPE: return createActualGenericType();
			case AlgorithmsPackage.STATEMENT: return createStatement();
			case AlgorithmsPackage.IN_VARIABLE: return createInVariable();
			case AlgorithmsPackage.PROCEDURE: return createProcedure();
			case AlgorithmsPackage.ACTUAL_ARRAY_TYPE: return createActualARRAYType();
			case AlgorithmsPackage.ACTUAL_SET_TYPE: return createActualSETType();
			case AlgorithmsPackage.ACTUAL_AGGREGATE_TYPE: return createActualAGGREGATEType();
			case AlgorithmsPackage.ACTUAL_STRUCTURE_CONSTRAINT: return createActualStructureConstraint();
			case AlgorithmsPackage.ACTUAL_LIST_TYPE: return createActualLISTType();
			case AlgorithmsPackage.VAR_PARAMETER: return createVARParameter();
			case AlgorithmsPackage.ACTUAL_DATA_TYPE: return createActualDataType();
			case AlgorithmsPackage.ACTUAL_BAG_TYPE: return createActualBAGType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualTypeConstraint createActualTypeConstraint() {
		ActualTypeConstraintImpl actualTypeConstraint = new ActualTypeConstraintImpl();
		return actualTypeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionResult createFunctionResult() {
		FunctionResultImpl functionResult = new FunctionResultImpl();
		return functionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InParameter createInParameter() {
		InParameterImpl inParameter = new InParameterImpl();
		return inParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable createLocalVariable() {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualStructure createActualStructure() {
		ActualStructureImpl actualStructure = new ActualStructureImpl();
		return actualStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualGenericType createActualGenericType() {
		ActualGenericTypeImpl actualGenericType = new ActualGenericTypeImpl();
		return actualGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InVariable createInVariable() {
		InVariableImpl inVariable = new InVariableImpl();
		return inVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualARRAYType createActualARRAYType() {
		ActualARRAYTypeImpl actualARRAYType = new ActualARRAYTypeImpl();
		return actualARRAYType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualSETType createActualSETType() {
		ActualSETTypeImpl actualSETType = new ActualSETTypeImpl();
		return actualSETType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualAGGREGATEType createActualAGGREGATEType() {
		ActualAGGREGATETypeImpl actualAGGREGATEType = new ActualAGGREGATETypeImpl();
		return actualAGGREGATEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualStructureConstraint createActualStructureConstraint() {
		ActualStructureConstraintImpl actualStructureConstraint = new ActualStructureConstraintImpl();
		return actualStructureConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualLISTType createActualLISTType() {
		ActualLISTTypeImpl actualLISTType = new ActualLISTTypeImpl();
		return actualLISTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VARParameter createVARParameter() {
		VARParameterImpl varParameter = new VARParameterImpl();
		return varParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualDataType createActualDataType() {
		ActualDataTypeImpl actualDataType = new ActualDataTypeImpl();
		return actualDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualBAGType createActualBAGType() {
		ActualBAGTypeImpl actualBAGType = new ActualBAGTypeImpl();
		return actualBAGType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmsPackage getAlgorithmsPackage() {
		return (AlgorithmsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AlgorithmsPackage getPackage() {
		return AlgorithmsPackage.eINSTANCE;
	}

} //AlgorithmsFactoryImpl
