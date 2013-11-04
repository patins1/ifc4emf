/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.SingleEntityType;
import org.ifc4emf.metamodel.express.instances.PartialEntityValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Entity Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getPartialEntityConstructor()
 * @model
 * @generated
 */
public interface PartialEntityConstructor extends Expression {
	/**
	 * Returns the value of the '<em><b>Result Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Value</em>' reference.
	 * @see #setResultValue(PartialEntityValue)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getPartialEntityConstructor_ResultValue()
	 * @model ordered="false"
	 * @generated
	 */
	PartialEntityValue getResultValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getResultValue <em>Result Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Value</em>' reference.
	 * @see #getResultValue()
	 * @generated
	 */
	void setResultValue(PartialEntityValue value);

	/**
	 * Returns the value of the '<em><b>Attribute Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Group</em>' reference.
	 * @see #setAttributeGroup(SingleEntityType)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getPartialEntityConstructor_AttributeGroup()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SingleEntityType getAttributeGroup();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getAttributeGroup <em>Attribute Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Group</em>' reference.
	 * @see #getAttributeGroup()
	 * @generated
	 */
	void setAttributeGroup(SingleEntityType value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.expressions.AttributeBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getPartialEntityConstructor_Bindings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AttributeBinding> getBindings();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getPartialEntityConstructor_Id()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PartialEntityConstructor
