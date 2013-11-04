/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.instances.ListMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.MemberBinding#getRepetition <em>Repetition</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.MemberBinding#getToSlot <em>To Slot</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.MemberBinding#getMemberValue <em>Member Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.MemberBinding#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getMemberBinding()
 * @model
 * @generated
 */
public interface MemberBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition</em>' containment reference.
	 * @see #setRepetition(RepeatCount)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getMemberBinding_Repetition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	RepeatCount getRepetition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.MemberBinding#getRepetition <em>Repetition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition</em>' containment reference.
	 * @see #getRepetition()
	 * @generated
	 */
	void setRepetition(RepeatCount value);

	/**
	 * Returns the value of the '<em><b>To Slot</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.ListMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Slot</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Slot</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getMemberBinding_ToSlot()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ListMember> getToSlot();

	/**
	 * Returns the value of the '<em><b>Member Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Value</em>' reference.
	 * @see #setMemberValue(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getMemberBinding_MemberValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getMemberValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.MemberBinding#getMemberValue <em>Member Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Value</em>' reference.
	 * @see #getMemberValue()
	 * @generated
	 */
	void setMemberValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(Integer)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getMemberBinding_Position()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getPosition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.MemberBinding#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Integer value);

} // MemberBinding
