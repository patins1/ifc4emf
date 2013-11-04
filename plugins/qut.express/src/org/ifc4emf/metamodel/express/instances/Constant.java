/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.ifc4emf.metamodel.express.core.CommonElement;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.InstantiableType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.Constant#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.Constant#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.Constant#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends CommonElement {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Expression</em>' reference.
	 * @see #setValueExpression(Expression)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getConstant_ValueExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getValueExpression();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.Constant#getValueExpression <em>Value Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' reference.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Actual Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Value</em>' reference.
	 * @see #setActualValue(Instance)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getConstant_ActualValue()
	 * @model ordered="false"
	 * @generated
	 */
	Instance getActualValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.Constant#getActualValue <em>Actual Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Value</em>' reference.
	 * @see #getActualValue()
	 * @generated
	 */
	void setActualValue(Instance value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(InstantiableType)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getConstant_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstantiableType getDataType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.Constant#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(InstantiableType value);

} // Constant
