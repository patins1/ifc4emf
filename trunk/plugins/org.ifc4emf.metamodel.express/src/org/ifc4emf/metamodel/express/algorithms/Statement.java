/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.statements.EscapeStatement;
import org.ifc4emf.metamodel.express.statements.RepeatStatement;
import org.ifc4emf.metamodel.express.statements.SkipStatement;
import org.ifc4emf.metamodel.express.statements.StatementBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Statement#getInBlock <em>In Block</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Statement#getBodyStatementsSkipStatement <em>Body Statements Skip Statement</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Statement#getBodyStatementsEscapeStatement <em>Body Statements Escape Statement</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Statement#getControlledBy <em>Controlled By</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Statement#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Statement#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>In Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.statements.StatementBlock#getBodyStatements_Statement <em>Body Statements Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Block</em>' container reference.
	 * @see #setInBlock(StatementBlock)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getStatement_InBlock()
	 * @see org.ifc4emf.metamodel.express.statements.StatementBlock#getBodyStatements_Statement
	 * @model opposite="bodyStatements_Statement" transient="false" ordered="false"
	 * @generated
	 */
	StatementBlock getInBlock();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getInBlock <em>In Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Block</em>' container reference.
	 * @see #getInBlock()
	 * @generated
	 */
	void setInBlock(StatementBlock value);

	/**
	 * Returns the value of the '<em><b>Body Statements Skip Statement</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.statements.SkipStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Statements Skip Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Statements Skip Statement</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getStatement_BodyStatementsSkipStatement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SkipStatement> getBodyStatementsSkipStatement();

	/**
	 * Returns the value of the '<em><b>Body Statements Escape Statement</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.statements.EscapeStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Statements Escape Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Statements Escape Statement</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getStatement_BodyStatementsEscapeStatement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EscapeStatement> getBodyStatementsEscapeStatement();

	/**
	 * Returns the value of the '<em><b>Controlled By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.statements.RepeatStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled By</em>' container reference.
	 * @see #setControlledBy(RepeatStatement)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getStatement_ControlledBy()
	 * @see org.ifc4emf.metamodel.express.statements.RepeatStatement#getBody
	 * @model opposite="body" transient="false" ordered="false"
	 * @generated
	 */
	RepeatStatement getControlledBy();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getControlledBy <em>Controlled By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled By</em>' container reference.
	 * @see #getControlledBy()
	 * @generated
	 */
	void setControlledBy(RepeatStatement value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.algorithms.Algorithm#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' container reference.
	 * @see #setImplements(Algorithm)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getStatement_Implements()
	 * @see org.ifc4emf.metamodel.express.algorithms.Algorithm#getBody
	 * @model opposite="body" transient="false" ordered="false"
	 * @generated
	 */
	Algorithm getImplements();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getImplements <em>Implements</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' container reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(Algorithm value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getStatement_Text()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.ExpressText" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Statement
