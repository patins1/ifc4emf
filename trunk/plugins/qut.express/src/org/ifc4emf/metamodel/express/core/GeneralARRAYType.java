/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General ARRAY Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.GeneralARRAYType#getHiIndex <em>Hi Index</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.GeneralARRAYType#getLoIndex <em>Lo Index</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.GeneralARRAYType#getIsOptional <em>Is Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getGeneralARRAYType()
 * @model
 * @generated
 */
public interface GeneralARRAYType extends GeneralAggregationType {
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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getGeneralARRAYType_HiIndex()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ArrayBound getHiIndex();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.GeneralARRAYType#getHiIndex <em>Hi Index</em>}' containment reference.
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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getGeneralARRAYType_LoIndex()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ArrayBound getLoIndex();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.GeneralARRAYType#getLoIndex <em>Lo Index</em>}' containment reference.
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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getGeneralARRAYType_IsOptional()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsOptional();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.GeneralARRAYType#getIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #getIsOptional()
	 * @generated
	 */
	void setIsOptional(Boolean value);

} // GeneralARRAYType
