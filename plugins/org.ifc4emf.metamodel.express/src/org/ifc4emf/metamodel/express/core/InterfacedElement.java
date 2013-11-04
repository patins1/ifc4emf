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
 * A representation of the model object '<em><b>Interfaced Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getInterfacingSchema <em>Interfacing Schema</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getIsUSE <em>Is USE</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getInterfacedId <em>Interfaced Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInterfacedElement()
 * @model
 * @generated
 */
public interface InterfacedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Interfacing Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Schema#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacing Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacing Schema</em>' container reference.
	 * @see #setInterfacingSchema(Schema)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInterfacedElement_InterfacingSchema()
	 * @see org.ifc4emf.metamodel.express.core.Schema#getInterfaces
	 * @model opposite="interfaces" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Schema getInterfacingSchema();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getInterfacingSchema <em>Interfacing Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfacing Schema</em>' container reference.
	 * @see #getInterfacingSchema()
	 * @generated
	 */
	void setInterfacingSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.SchemaElement#getReferencedAs <em>Referenced As</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(SchemaElement)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInterfacedElement_RefersTo()
	 * @see org.ifc4emf.metamodel.express.core.SchemaElement#getReferencedAs
	 * @model opposite="referencedAs" required="true" ordered="false"
	 * @generated
	 */
	SchemaElement getRefersTo();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(SchemaElement value);

	/**
	 * Returns the value of the '<em><b>Is USE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is USE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is USE</em>' attribute.
	 * @see #setIsUSE(Boolean)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInterfacedElement_IsUSE()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsUSE();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getIsUSE <em>Is USE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is USE</em>' attribute.
	 * @see #getIsUSE()
	 * @generated
	 */
	void setIsUSE(Boolean value);

	/**
	 * Returns the value of the '<em><b>Interfaced Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaced Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaced Id</em>' containment reference.
	 * @see #setInterfacedId(ScopedId)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getInterfacedElement_InterfacedId()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ScopedId getInterfacedId();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getInterfacedId <em>Interfaced Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaced Id</em>' containment reference.
	 * @see #getInterfacedId()
	 * @generated
	 */
	void setInterfacedId(ScopedId value);

} // InterfacedElement
