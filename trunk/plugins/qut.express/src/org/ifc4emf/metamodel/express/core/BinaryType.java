/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.BinaryType#getBinaryLengthConstraint <em>Binary Length Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getBinaryType()
 * @model
 * @generated
 */
public interface BinaryType extends SimpleType {
	/**
	 * Returns the value of the '<em><b>Binary Length Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Length Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Length Constraint</em>' containment reference.
	 * @see #setBinaryLengthConstraint(LengthConstraint)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getBinaryType_BinaryLengthConstraint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	LengthConstraint getBinaryLengthConstraint();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.BinaryType#getBinaryLengthConstraint <em>Binary Length Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Length Constraint</em>' containment reference.
	 * @see #getBinaryLengthConstraint()
	 * @generated
	 */
	void setBinaryLengthConstraint(LengthConstraint value);

} // BinaryType
