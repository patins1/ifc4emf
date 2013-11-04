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
 * A representation of the model object '<em><b>Schema Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SchemaElement#getReferencedAs <em>Referenced As</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SchemaElement#getReferencedIn <em>Referenced In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.SchemaElement#getDefinedIn <em>Defined In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSchemaElement()
 * @model abstract="true"
 * @generated
 */
public interface SchemaElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Referenced As</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.InterfacedElement}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.InterfacedElement#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced As</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced As</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSchemaElement_ReferencedAs()
	 * @see org.ifc4emf.metamodel.express.core.InterfacedElement#getRefersTo
	 * @model opposite="refersTo" ordered="false"
	 * @generated
	 */
	EList<InterfacedElement> getReferencedAs();

	/**
	 * Returns the value of the '<em><b>Referenced In</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.Schema}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Schema#getInterfacedElements <em>Interfaced Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced In</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSchemaElement_ReferencedIn()
	 * @see org.ifc4emf.metamodel.express.core.Schema#getInterfacedElements
	 * @model opposite="interfacedElements" ordered="false"
	 * @generated
	 */
	EList<Schema> getReferencedIn();

	/**
	 * Returns the value of the '<em><b>Defined In</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.Schema#getSchemaElements <em>Schema Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined In</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined In</em>' container reference.
	 * @see #setDefinedIn(Schema)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getSchemaElement_DefinedIn()
	 * @see org.ifc4emf.metamodel.express.core.Schema#getSchemaElements
	 * @model opposite="schemaElements" transient="false" ordered="false"
	 * @generated
	 */
	Schema getDefinedIn();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.SchemaElement#getDefinedIn <em>Defined In</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined In</em>' container reference.
	 * @see #getDefinedIn()
	 * @generated
	 */
	void setDefinedIn(Schema value);

} // SchemaElement
