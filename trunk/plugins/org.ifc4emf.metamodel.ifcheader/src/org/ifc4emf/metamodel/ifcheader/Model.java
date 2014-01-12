/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.ifcheader;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.modelblob.BinaryTreeRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getContents <em>Contents</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getNumIfcObjects <em>Num Ifc Objects</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getNumSpaces <em>Num Spaces</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getNumSites <em>Num Sites</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getNumBuildingStories <em>Num Building Stories</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getNumBuildings <em>Num Buildings</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getNumBuildingElements <em>Num Building Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getNumProducts <em>Num Products</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getRoot <em>Root</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getParsingTime <em>Parsing Time</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getSavingTime <em>Saving Time</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getBuildModelTime <em>Build Model Time</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.Model#getGuidToPart21 <em>Guid To Part21</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel()
 * @model
 * @generated
 */
public interface Model extends BinaryTreeRoot {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(ModelName)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_Name()
	 * @see org.ifc4emf.metamodel.ifcheader.ModelName#getModel
	 * @model opposite="model" containment="true" required="true"
	 * @generated
	 */
	ModelName getName();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(ModelName value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.ifcheader.ModelDescription#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(ModelDescription)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_Description()
	 * @see org.ifc4emf.metamodel.ifcheader.ModelDescription#getModel
	 * @model opposite="model" containment="true" required="true"
	 * @generated
	 */
	ModelDescription getDescription();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(ModelDescription value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.ifcheader.ModelSchema#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(ModelSchema)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_Schema()
	 * @see org.ifc4emf.metamodel.ifcheader.ModelSchema#getModel
	 * @model opposite="model" containment="true" required="true"
	 * @generated
	 */
	ModelSchema getSchema();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(ModelSchema value);

	/**
	 * Returns the value of the '<em><b>Num Ifc Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Ifc Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Ifc Objects</em>' attribute.
	 * @see #setNumIfcObjects(long)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_NumIfcObjects()
	 * @model
	 * @generated
	 */
	long getNumIfcObjects();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumIfcObjects <em>Num Ifc Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Ifc Objects</em>' attribute.
	 * @see #getNumIfcObjects()
	 * @generated
	 */
	void setNumIfcObjects(long value);

	/**
	 * Returns the value of the '<em><b>Num Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Spaces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Spaces</em>' attribute.
	 * @see #setNumSpaces(long)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_NumSpaces()
	 * @model
	 * @generated
	 */
	long getNumSpaces();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumSpaces <em>Num Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Spaces</em>' attribute.
	 * @see #getNumSpaces()
	 * @generated
	 */
	void setNumSpaces(long value);

	/**
	 * Returns the value of the '<em><b>Num Sites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Sites</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Sites</em>' attribute.
	 * @see #setNumSites(long)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_NumSites()
	 * @model
	 * @generated
	 */
	long getNumSites();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumSites <em>Num Sites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Sites</em>' attribute.
	 * @see #getNumSites()
	 * @generated
	 */
	void setNumSites(long value);

	/**
	 * Returns the value of the '<em><b>Num Building Stories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Building Stories</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Building Stories</em>' attribute.
	 * @see #setNumBuildingStories(long)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_NumBuildingStories()
	 * @model
	 * @generated
	 */
	long getNumBuildingStories();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumBuildingStories <em>Num Building Stories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Building Stories</em>' attribute.
	 * @see #getNumBuildingStories()
	 * @generated
	 */
	void setNumBuildingStories(long value);

	/**
	 * Returns the value of the '<em><b>Num Buildings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Buildings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Buildings</em>' attribute.
	 * @see #setNumBuildings(long)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_NumBuildings()
	 * @model
	 * @generated
	 */
	long getNumBuildings();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumBuildings <em>Num Buildings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Buildings</em>' attribute.
	 * @see #getNumBuildings()
	 * @generated
	 */
	void setNumBuildings(long value);

	/**
	 * Returns the value of the '<em><b>Num Building Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Building Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Building Elements</em>' attribute.
	 * @see #setNumBuildingElements(long)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_NumBuildingElements()
	 * @model
	 * @generated
	 */
	long getNumBuildingElements();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumBuildingElements <em>Num Building Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Building Elements</em>' attribute.
	 * @see #getNumBuildingElements()
	 * @generated
	 */
	void setNumBuildingElements(long value);

	/**
	 * Returns the value of the '<em><b>Num Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Products</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Products</em>' attribute.
	 * @see #setNumProducts(long)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_NumProducts()
	 * @model
	 * @generated
	 */
	long getNumProducts();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumProducts <em>Num Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Products</em>' attribute.
	 * @see #getNumProducts()
	 * @generated
	 */
	void setNumProducts(long value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(EObject)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_Root()
	 * @model
	 * @generated
	 */
	EObject getRoot();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(EObject value);

	/**
	 * Returns the value of the '<em><b>Parsing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsing Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsing Time</em>' attribute.
	 * @see #setParsingTime(long)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_ParsingTime()
	 * @model
	 * @generated
	 */
	long getParsingTime();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getParsingTime <em>Parsing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsing Time</em>' attribute.
	 * @see #getParsingTime()
	 * @generated
	 */
	void setParsingTime(long value);

	/**
	 * Returns the value of the '<em><b>Saving Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saving Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saving Time</em>' attribute.
	 * @see #setSavingTime(long)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_SavingTime()
	 * @model
	 * @generated
	 */
	long getSavingTime();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getSavingTime <em>Saving Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saving Time</em>' attribute.
	 * @see #getSavingTime()
	 * @generated
	 */
	void setSavingTime(long value);

	/**
	 * Returns the value of the '<em><b>Build Model Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Model Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Model Time</em>' attribute.
	 * @see #setBuildModelTime(long)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_BuildModelTime()
	 * @model
	 * @generated
	 */
	long getBuildModelTime();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getBuildModelTime <em>Build Model Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Model Time</em>' attribute.
	 * @see #getBuildModelTime()
	 * @generated
	 */
	void setBuildModelTime(long value);

	/**
	 * Returns the value of the '<em><b>Guid To Part21</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guid To Part21</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid To Part21</em>' containment reference.
	 * @see #setGuidToPart21(GuidToPart21Container)
	 * @see org.ifc4emf.metamodel.ifcheader.Part21Package#getModel_GuidToPart21()
	 * @model containment="true"
	 * @generated
	 */
	GuidToPart21Container getGuidToPart21();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.ifcheader.Model#getGuidToPart21 <em>Guid To Part21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid To Part21</em>' containment reference.
	 * @see #getGuidToPart21()
	 * @generated
	 */
	void setGuidToPart21(GuidToPart21Container value);

} // Model
