/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.ifc4emf.metamodel.express.algorithms.NamedVariable;
import org.ifc4emf.metamodel.express.algorithms.VARVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.AliasVariable#getReferent <em>Referent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getAliasVariable()
 * @model
 * @generated
 */
public interface AliasVariable extends NamedVariable, VARVariable {
	/**
	 * Returns the value of the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referent</em>' reference.
	 * @see #setReferent(VARExpression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getAliasVariable_Referent()
	 * @model ordered="false"
	 * @generated
	 */
	VARExpression getReferent();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.AliasVariable#getReferent <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referent</em>' reference.
	 * @see #getReferent()
	 * @generated
	 */
	void setReferent(VARExpression value);

} // AliasVariable
