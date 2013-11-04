/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.DerivedAttribute#getDerivation <em>Derivation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getDerivedAttribute()
 * @model
 * @generated
 */
public interface DerivedAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation</em>' reference.
	 * @see #setDerivation(Expression)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getDerivedAttribute_Derivation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getDerivation();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.DerivedAttribute#getDerivation <em>Derivation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation</em>' reference.
	 * @see #getDerivation()
	 * @generated
	 */
	void setDerivation(Expression value);

} // DerivedAttribute
