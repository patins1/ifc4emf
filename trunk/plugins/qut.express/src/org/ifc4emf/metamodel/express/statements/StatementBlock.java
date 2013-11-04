/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.algorithms.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.StatementBlock#getBodyStatements_Statement <em>Body Statements Statement</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.StatementBlock#getDelimited <em>Delimited</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getStatementBlock()
 * @model
 * @generated
 */
public interface StatementBlock extends Statement {
	/**
	 * Returns the value of the '<em><b>Body Statements Statement</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.algorithms.Statement}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getInBlock <em>In Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Statements Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Statements Statement</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getStatementBlock_BodyStatements_Statement()
	 * @see org.ifc4emf.metamodel.express.algorithms.Statement#getInBlock
	 * @model opposite="inBlock" containment="true" ordered="false"
	 * @generated
	 */
	EList<Statement> getBodyStatements_Statement();

	/**
	 * Returns the value of the '<em><b>Delimited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimited</em>' attribute.
	 * @see #setDelimited(Boolean)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getStatementBlock_Delimited()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getDelimited();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.StatementBlock#getDelimited <em>Delimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimited</em>' attribute.
	 * @see #getDelimited()
	 * @generated
	 */
	void setDelimited(Boolean value);

} // StatementBlock
