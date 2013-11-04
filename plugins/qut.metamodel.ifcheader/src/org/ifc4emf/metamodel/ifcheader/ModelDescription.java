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
 * A representation of the model object '<em><b>Model Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelDescription#getModel <em>Model</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelDescription#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelDescription#getImplementation_level <em>Implementation level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelDescription()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ModelDescription extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.ifcheader.Model#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelDescription_Model()
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getDescription
	 * @model opposite="description" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.ModelDescription#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelDescription_Description()
	 * @model
	 * @generated
	 */
	EList<String> getDescription();

	/**
	 * Returns the value of the '<em><b>Implementation level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation level</em>' attribute.
	 * @see #setImplementation_level(String)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelDescription_Implementation_level()
	 * @model
	 * @generated
	 */
	String getImplementation_level();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.ModelDescription#getImplementation_level <em>Implementation level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation level</em>' attribute.
	 * @see #getImplementation_level()
	 * @generated
	 */
	void setImplementation_level(String value);

} // ModelDescription
