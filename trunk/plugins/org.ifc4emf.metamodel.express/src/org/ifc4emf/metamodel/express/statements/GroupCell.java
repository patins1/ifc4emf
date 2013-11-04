/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements;

import org.ifc4emf.metamodel.express.core.SingleEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.GroupCell#getBaseEntity <em>Base Entity</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.GroupCell#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.GroupCell#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getGroupCell()
 * @model
 * @generated
 */
public interface GroupCell extends VARExpression {
	/**
	 * Returns the value of the '<em><b>Base Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Entity</em>' containment reference.
	 * @see #setBaseEntity(VARExpression)
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getGroupCell_BaseEntity()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	VARExpression getBaseEntity();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.GroupCell#getBaseEntity <em>Base Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Entity</em>' containment reference.
	 * @see #getBaseEntity()
	 * @generated
	 */
	void setBaseEntity(VARExpression value);

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
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getGroupCell_RefersTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SingleEntityType getRefersTo();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.GroupCell#getRefersTo <em>Refers To</em>}' reference.
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
	 * @see org.ifc4emf.metamodel.express.statements.StatementsPackage#getGroupCell_Id()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.statements.GroupCell#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // GroupCell
