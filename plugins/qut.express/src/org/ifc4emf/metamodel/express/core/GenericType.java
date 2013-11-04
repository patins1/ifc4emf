/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.GenericType#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.GenericType#getIsEntity <em>Is Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getGenericType()
 * @model
 * @generated
 */
public interface GenericType extends GeneralizedType {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getMatchingType <em>Matching Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(ActualTypeConstraint)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getGenericType_Constraint()
	 * @see org.ifc4emf.metamodel.express.algorithms.ActualTypeConstraint#getMatchingType
	 * @model opposite="matchingType" ordered="false"
	 * @generated
	 */
	ActualTypeConstraint getConstraint();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.GenericType#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(ActualTypeConstraint value);

	/**
	 * Returns the value of the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Entity</em>' attribute.
	 * @see #setIsEntity(Boolean)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getGenericType_IsEntity()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsEntity();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.GenericType#getIsEntity <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entity</em>' attribute.
	 * @see #getIsEntity()
	 * @generated
	 */
	void setIsEntity(Boolean value);

} // GenericType
