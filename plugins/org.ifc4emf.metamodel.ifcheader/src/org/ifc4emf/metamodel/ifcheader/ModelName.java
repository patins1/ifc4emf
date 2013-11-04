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
 * A representation of the model object '<em><b>Model Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelName#getModel <em>Model</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelName#getName <em>Name</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelName#getTime_stamp <em>Time stamp</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelName#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelName#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelName#getPreprocessor_version <em>Preprocessor version</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelName#getOriginating_system <em>Originating system</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.ModelName#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelName()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ModelName extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.ifcheader.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelName_Model()
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getName
	 * @model opposite="name" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

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
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelName_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Time stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time stamp</em>' attribute.
	 * @see #setTime_stamp(String)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelName_Time_stamp()
	 * @model required="true"
	 * @generated
	 */
	String getTime_stamp();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getTime_stamp <em>Time stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time stamp</em>' attribute.
	 * @see #getTime_stamp()
	 * @generated
	 */
	void setTime_stamp(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute list.
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelName_Author()
	 * @model
	 * @generated
	 */
	EList<String> getAuthor();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' attribute list.
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelName_Organization()
	 * @model
	 * @generated
	 */
	EList<String> getOrganization();

	/**
	 * Returns the value of the '<em><b>Preprocessor version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preprocessor version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessor version</em>' attribute.
	 * @see #setPreprocessor_version(String)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelName_Preprocessor_version()
	 * @model
	 * @generated
	 */
	String getPreprocessor_version();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getPreprocessor_version <em>Preprocessor version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preprocessor version</em>' attribute.
	 * @see #getPreprocessor_version()
	 * @generated
	 */
	void setPreprocessor_version(String value);

	/**
	 * Returns the value of the '<em><b>Originating system</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originating system</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originating system</em>' attribute.
	 * @see #setOriginating_system(String)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelName_Originating_system()
	 * @model
	 * @generated
	 */
	String getOriginating_system();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getOriginating_system <em>Originating system</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originating system</em>' attribute.
	 * @see #getOriginating_system()
	 * @generated
	 */
	void setOriginating_system(String value);

	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization</em>' attribute.
	 * @see #setAuthorization(String)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModelName_Authorization()
	 * @model
	 * @generated
	 */
	String getAuthorization();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getAuthorization <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization</em>' attribute.
	 * @see #getAuthorization()
	 * @generated
	 */
	void setAuthorization(String value);

} // ModelName
