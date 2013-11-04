/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.ExplicitAttribute;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.instances.AttributeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getAttributeValue <em>Attribute Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getToValue <em>To Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getAttributeBinding()
 * @model
 * @generated
 */
public interface AttributeBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Value</em>' reference.
	 * @see #setAttributeValue(Expression)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getAttributeBinding_AttributeValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getAttributeValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getAttributeValue <em>Attribute Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Value</em>' reference.
	 * @see #getAttributeValue()
	 * @generated
	 */
	void setAttributeValue(Expression value);

	/**
	 * Returns the value of the '<em><b>To Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Value</em>' reference.
	 * @see #setToValue(AttributeValue)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getAttributeBinding_ToValue()
	 * @model ordered="false"
	 * @generated
	 */
	AttributeValue getToValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getToValue <em>To Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Value</em>' reference.
	 * @see #getToValue()
	 * @generated
	 */
	void setToValue(AttributeValue value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(ExplicitAttribute)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getAttributeBinding_Attribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExplicitAttribute getAttribute();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(ExplicitAttribute value);

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
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getAttributeBinding_Position()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getPosition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.AttributeBinding#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Integer value);

} // AttributeBinding
