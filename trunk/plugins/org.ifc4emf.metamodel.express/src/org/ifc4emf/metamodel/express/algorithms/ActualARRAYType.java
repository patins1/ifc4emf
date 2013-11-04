/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.ifc4emf.metamodel.express.core.ArrayBound;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual ARRAY Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getHiIndex <em>Hi Index</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getLoIndex <em>Lo Index</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getIsOptional <em>Is Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualARRAYType()
 * @model
 * @generated
 */
public interface ActualARRAYType extends ActualAggregationType {
	/**
	 * Returns the value of the '<em><b>Hi Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hi Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hi Index</em>' containment reference.
	 * @see #setHiIndex(ArrayBound)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualARRAYType_HiIndex()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ArrayBound getHiIndex();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getHiIndex <em>Hi Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hi Index</em>' containment reference.
	 * @see #getHiIndex()
	 * @generated
	 */
	void setHiIndex(ArrayBound value);

	/**
	 * Returns the value of the '<em><b>Lo Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lo Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lo Index</em>' containment reference.
	 * @see #setLoIndex(ArrayBound)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualARRAYType_LoIndex()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ArrayBound getLoIndex();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getLoIndex <em>Lo Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lo Index</em>' containment reference.
	 * @see #getLoIndex()
	 * @generated
	 */
	void setLoIndex(ArrayBound value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(Boolean)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getActualARRAYType_IsOptional()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsOptional();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.ActualARRAYType#getIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #getIsOptional()
	 * @generated
	 */
	void setIsOptional(Boolean value);

} // ActualARRAYType
