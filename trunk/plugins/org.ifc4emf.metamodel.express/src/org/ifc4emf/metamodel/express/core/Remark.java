/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Remark#getDescribesSchema <em>Describes Schema</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Remark#getAppearsIn <em>Appears In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Remark#getDescribesElement <em>Describes Element</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Remark#getIsTagged <em>Is Tagged</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Remark#getIsTail <em>Is Tail</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Remark#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRemark()
 * @model
 * @generated
 */
public interface Remark extends EObject {
	/**
	 * Returns the value of the '<em><b>Describes Schema</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Schema}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Schema#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes Schema</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes Schema</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRemark_DescribesSchema()
	 * @see org.ifc4emf.metamodel.express.core.Schema#getDocumentation
	 * @model opposite="documentation" ordered="false"
	 * @generated
	 */
	EList<Schema> getDescribesSchema();

	/**
	 * Returns the value of the '<em><b>Appears In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Scope#getIncludesRemarks <em>Includes Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appears In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appears In</em>' reference.
	 * @see #setAppearsIn(Scope)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRemark_AppearsIn()
	 * @see org.ifc4emf.metamodel.express.core.Scope#getIncludesRemarks
	 * @model opposite="includesRemarks" required="true" ordered="false"
	 * @generated
	 */
	Scope getAppearsIn();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Remark#getAppearsIn <em>Appears In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appears In</em>' reference.
	 * @see #getAppearsIn()
	 * @generated
	 */
	void setAppearsIn(Scope value);

	/**
	 * Returns the value of the '<em><b>Describes Element</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.NamedElement}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.NamedElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes Element</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRemark_DescribesElement()
	 * @see org.ifc4emf.metamodel.express.core.NamedElement#getDocumentation
	 * @model opposite="documentation" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getDescribesElement();

	/**
	 * Returns the value of the '<em><b>Is Tagged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tagged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tagged</em>' attribute.
	 * @see #setIsTagged(Boolean)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRemark_IsTagged()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsTagged();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Remark#getIsTagged <em>Is Tagged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tagged</em>' attribute.
	 * @see #getIsTagged()
	 * @generated
	 */
	void setIsTagged(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Tail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tail</em>' attribute.
	 * @see #setIsTail(Boolean)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRemark_IsTail()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsTail();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Remark#getIsTail <em>Is Tail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tail</em>' attribute.
	 * @see #getIsTail()
	 * @generated
	 */
	void setIsTail(Boolean value);

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
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRemark_Text()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.ExpressText" required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Remark#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Remark
