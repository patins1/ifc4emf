/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.StringType#getStringLengthConstraint <em>String Length Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getStringType()
 * @model
 * @generated
 */
public interface StringType extends SimpleType {
	/**
	 * Returns the value of the '<em><b>String Length Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Length Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Length Constraint</em>' containment reference.
	 * @see #setStringLengthConstraint(LengthConstraint)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getStringType_StringLengthConstraint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	LengthConstraint getStringLengthConstraint();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.StringType#getStringLengthConstraint <em>String Length Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Length Constraint</em>' containment reference.
	 * @see #getStringLengthConstraint()
	 * @generated
	 */
	void setStringLengthConstraint(LengthConstraint value);

} // StringType
