/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Function#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Algorithm {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(FunctionResult)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getFunction_Result()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FunctionResult getResult();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.Function#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(FunctionResult value);

} // Function
