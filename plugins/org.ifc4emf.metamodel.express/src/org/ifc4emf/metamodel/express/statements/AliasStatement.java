/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.core.LocalScope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.AliasStatement#getBindsToReference <em>Binds To Reference</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.AliasStatement#getBody <em>Body</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.AliasStatement#getAliasVariable <em>Alias Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getAliasStatement()
 * @model
 * @generated
 */
public interface AliasStatement extends Statement, LocalScope {
	/**
	 * Returns the value of the '<em><b>Binds To Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binds To Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binds To Reference</em>' reference.
	 * @see #setBindsToReference(VARExpression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getAliasStatement_BindsToReference()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VARExpression getBindsToReference();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.AliasStatement#getBindsToReference <em>Binds To Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binds To Reference</em>' reference.
	 * @see #getBindsToReference()
	 * @generated
	 */
	void setBindsToReference(VARExpression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Statement)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getAliasStatement_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Statement getBody();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.AliasStatement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Statement value);

	/**
	 * Returns the value of the '<em><b>Alias Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Variable</em>' containment reference.
	 * @see #setAliasVariable(AliasVariable)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getAliasStatement_AliasVariable()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AliasVariable getAliasVariable();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.AliasStatement#getAliasVariable <em>Alias Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Variable</em>' containment reference.
	 * @see #getAliasVariable()
	 * @generated
	 */
	void setAliasVariable(AliasVariable value);

} // AliasStatement
