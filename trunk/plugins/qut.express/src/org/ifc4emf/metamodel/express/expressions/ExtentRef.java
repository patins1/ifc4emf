/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions;

import org.ifc4emf.metamodel.express.core.NamedType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extent Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.ExtentRef#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.ExtentRef#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getExtentRef()
 * @model
 * @generated
 */
public interface ExtentRef extends Primary {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(NamedType)
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getExtentRef_RefersTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedType getRefersTo();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.ExtentRef#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(NamedType value);

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
	 * @see org.ifc4emf.metamodel.express.expressions.ExpressionsPackage#getExtentRef_Id()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.expressions.ExtentRef#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ExtentRef
