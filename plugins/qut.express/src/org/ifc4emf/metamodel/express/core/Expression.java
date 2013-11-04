/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Expression#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Expression#getInterpretationContext <em>Interpretation Context</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Expression#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Expression#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' reference.
	 * @see #setEvaluation(Instance)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getExpression_Evaluation()
	 * @model ordered="false"
	 * @generated
	 */
	Instance getEvaluation();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Expression#getEvaluation <em>Evaluation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' reference.
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(Instance value);

	/**
	 * Returns the value of the '<em><b>Interpretation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation Context</em>' reference.
	 * @see #setInterpretationContext(Scope)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getExpression_InterpretationContext()
	 * @model ordered="false"
	 * @generated
	 */
	Scope getInterpretationContext();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Expression#getInterpretationContext <em>Interpretation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation Context</em>' reference.
	 * @see #getInterpretationContext()
	 * @generated
	 */
	void setInterpretationContext(Scope value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getExpression_DataType()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Expression#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getExpression_Text()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.ExpressText" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Expression#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Expression
