/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.MemberCell#getIndexValue <em>Index Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.MemberCell#getBaseAggregate <em>Base Aggregate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getMemberCell()
 * @model
 * @generated
 */
public interface MemberCell extends VARExpression {
	/**
	 * Returns the value of the '<em><b>Index Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Value</em>' reference.
	 * @see #setIndexValue(Expression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getMemberCell_IndexValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getIndexValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.MemberCell#getIndexValue <em>Index Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Value</em>' reference.
	 * @see #getIndexValue()
	 * @generated
	 */
	void setIndexValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Base Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Aggregate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Aggregate</em>' containment reference.
	 * @see #setBaseAggregate(VARExpression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getMemberCell_BaseAggregate()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	VARExpression getBaseAggregate();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.MemberCell#getBaseAggregate <em>Base Aggregate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Aggregate</em>' containment reference.
	 * @see #getBaseAggregate()
	 * @generated
	 */
	void setBaseAggregate(VARExpression value);

} // MemberCell
