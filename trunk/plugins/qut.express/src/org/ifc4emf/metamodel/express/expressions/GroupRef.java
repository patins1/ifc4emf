/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.ifc4emf.metamodel.express.core.SingleEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.GroupRef#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.GroupRef#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getGroupRef()
 * @model
 * @generated
 */
public interface GroupRef extends Selector {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(SingleEntityType)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getGroupRef_RefersTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SingleEntityType getRefersTo();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.GroupRef#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(SingleEntityType value);

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
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getGroupRef_Id()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.GroupRef#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // GroupRef
