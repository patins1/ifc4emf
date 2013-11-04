/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.LengthConstraint#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.LengthConstraint#getIsFixed <em>Is Fixed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getLengthConstraint()
 * @model
 * @generated
 */
public interface LengthConstraint extends DomainConstraint {
	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Integer)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getLengthConstraint_MaxLength()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" ordered="false"
	 * @generated
	 */
	Integer getMaxLength();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.LengthConstraint#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fixed</em>' attribute.
	 * @see #setIsFixed(Boolean)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getLengthConstraint_IsFixed()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsFixed();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.LengthConstraint#getIsFixed <em>Is Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fixed</em>' attribute.
	 * @see #getIsFixed()
	 * @generated
	 */
	void setIsFixed(Boolean value);

} // LengthConstraint
