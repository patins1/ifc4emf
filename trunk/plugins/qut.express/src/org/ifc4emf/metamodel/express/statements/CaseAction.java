/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.CaseAction#getLabelValue <em>Label Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.CaseAction#getAction <em>Action</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.CaseAction#getIsDefault <em>Is Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getCaseAction()
 * @model
 * @generated
 */
public interface CaseAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Value</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Value</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getCaseAction_LabelValue()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expression> getLabelValue();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Statement)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getCaseAction_Action()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Statement getAction();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.CaseAction#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Statement value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Boolean)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getCaseAction_IsDefault()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.CaseAction#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Boolean value);

} // CaseAction
