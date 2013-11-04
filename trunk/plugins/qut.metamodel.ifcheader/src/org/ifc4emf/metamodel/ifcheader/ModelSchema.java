/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.ifcheader;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelSchema#getSchema_identifiers <em>Schema identifiers</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelSchema#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelSchema()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ModelSchema extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Schema identifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema identifiers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema identifiers</em>' attribute list.
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelSchema_Schema_identifiers()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getSchema_identifiers();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.ifcheader.Model#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelSchema_Model()
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getSchema
	 * @model opposite="schema" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.ModelSchema#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // ModelSchema
