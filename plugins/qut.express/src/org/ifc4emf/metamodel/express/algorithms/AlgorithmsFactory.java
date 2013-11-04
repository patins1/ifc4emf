/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage
 * @generated
 */
public interface AlgorithmsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmsFactory eINSTANCE = org.ifc4emf.metamodel.express.algorithms.impl.AlgorithmsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Actual Type Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual Type Constraint</em>'.
	 * @generated
	 */
	ActualTypeConstraint createActualTypeConstraint();

	/**
	 * Returns a new object of class '<em>Function Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Result</em>'.
	 * @generated
	 */
	FunctionResult createFunctionResult();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>In Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Parameter</em>'.
	 * @generated
	 */
	InParameter createInParameter();

	/**
	 * Returns a new object of class '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variable</em>'.
	 * @generated
	 */
	LocalVariable createLocalVariable();

	/**
	 * Returns a new object of class '<em>Actual Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual Structure</em>'.
	 * @generated
	 */
	ActualStructure createActualStructure();

	/**
	 * Returns a new object of class '<em>Actual Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual Generic Type</em>'.
	 * @generated
	 */
	ActualGenericType createActualGenericType();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>In Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Variable</em>'.
	 * @generated
	 */
	InVariable createInVariable();

	/**
	 * Returns a new object of class '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure</em>'.
	 * @generated
	 */
	Procedure createProcedure();

	/**
	 * Returns a new object of class '<em>Actual ARRAY Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual ARRAY Type</em>'.
	 * @generated
	 */
	ActualARRAYType createActualARRAYType();

	/**
	 * Returns a new object of class '<em>Actual SET Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual SET Type</em>'.
	 * @generated
	 */
	ActualSETType createActualSETType();

	/**
	 * Returns a new object of class '<em>Actual AGGREGATE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual AGGREGATE Type</em>'.
	 * @generated
	 */
	ActualAGGREGATEType createActualAGGREGATEType();

	/**
	 * Returns a new object of class '<em>Actual Structure Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual Structure Constraint</em>'.
	 * @generated
	 */
	ActualStructureConstraint createActualStructureConstraint();

	/**
	 * Returns a new object of class '<em>Actual LIST Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual LIST Type</em>'.
	 * @generated
	 */
	ActualLISTType createActualLISTType();

	/**
	 * Returns a new object of class '<em>VAR Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VAR Parameter</em>'.
	 * @generated
	 */
	VARParameter createVARParameter();

	/**
	 * Returns a new object of class '<em>Actual Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual Data Type</em>'.
	 * @generated
	 */
	ActualDataType createActualDataType();

	/**
	 * Returns a new object of class '<em>Actual BAG Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual BAG Type</em>'.
	 * @generated
	 */
	ActualBAGType createActualBAGType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AlgorithmsPackage getAlgorithmsPackage();

} //AlgorithmsFactory
