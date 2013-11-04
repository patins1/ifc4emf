/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Schema#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Schema#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Schema#getSchemaElements <em>Schema Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Schema#getInterfacedElements <em>Interfaced Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Schema#getName <em>Name</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Schema#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends Scope {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Remark}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Remark#getDescribesSchema <em>Describes Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSchema_Documentation()
	 * @see org.ifc4emf.metamodel.express.core.Remark#getDescribesSchema
	 * @model opposite="describesSchema" ordered="false"
	 * @generated
	 */
	EList<Remark> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.InterfacedElement}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getInterfacingSchema <em>Interfacing Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSchema_Interfaces()
	 * @see org.ifc4emf.metamodel.express.core.InterfacedElement#getInterfacingSchema
	 * @model opposite="interfacingSchema" containment="true" ordered="false"
	 * @generated
	 */
	EList<InterfacedElement> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Schema Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.SchemaElement}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.SchemaElement#getDefinedIn <em>Defined In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Elements</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSchema_SchemaElements()
	 * @see org.ifc4emf.metamodel.express.core.SchemaElement#getDefinedIn
	 * @model opposite="definedIn" containment="true" ordered="false"
	 * @generated
	 */
	EList<SchemaElement> getSchemaElements();

	/**
	 * Returns the value of the '<em><b>Interfaced Elements</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.SchemaElement}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.SchemaElement#getReferencedIn <em>Referenced In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaced Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaced Elements</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSchema_InterfacedElements()
	 * @see org.ifc4emf.metamodel.express.core.SchemaElement#getReferencedIn
	 * @model opposite="referencedIn" ordered="false"
	 * @generated
	 */
	EList<SchemaElement> getInterfacedElements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSchema_Name()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Schema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSchema_Version()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.core.Identifier" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Schema#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Schema
