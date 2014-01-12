/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.ifcheader.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.ifcheader.GuidToPart21Container;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.metamodel.ifcheader.ModelDescription;
import org.ifc4emf.metamodel.ifcheader.ModelName;
import org.ifc4emf.metamodel.ifcheader.ModelSchema;
import org.ifc4emf.metamodel.ifcheader.Part21Package;
import org.ifc4emf.metamodel.modelblob.impl.BinaryTreeRootImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getNumIfcObjects <em>Num Ifc Objects</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getNumSpaces <em>Num Spaces</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getNumSites <em>Num Sites</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getNumBuildingStories <em>Num Building Stories</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getNumBuildings <em>Num Buildings</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getNumBuildingElements <em>Num Building Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getNumProducts <em>Num Products</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getParsingTime <em>Parsing Time</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getSavingTime <em>Saving Time</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getBuildModelTime <em>Build Model Time</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl#getGuidToPart21 <em>Guid To Part21</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends BinaryTreeRootImpl implements Model {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part21Package.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> getContents() {
		return (EList<EObject>)eGet(Part21Package.Literals.MODEL__CONTENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelName getName() {
		return (ModelName)eGet(Part21Package.Literals.MODEL__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(ModelName newName) {
		eSet(Part21Package.Literals.MODEL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDescription getDescription() {
		return (ModelDescription)eGet(Part21Package.Literals.MODEL__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(ModelDescription newDescription) {
		eSet(Part21Package.Literals.MODEL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSchema getSchema() {
		return (ModelSchema)eGet(Part21Package.Literals.MODEL__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(ModelSchema newSchema) {
		eSet(Part21Package.Literals.MODEL__SCHEMA, newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumIfcObjects() {
		return (Long)eGet(Part21Package.Literals.MODEL__NUM_IFC_OBJECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumIfcObjects(long newNumIfcObjects) {
		eSet(Part21Package.Literals.MODEL__NUM_IFC_OBJECTS, newNumIfcObjects);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumSpaces() {
		return (Long)eGet(Part21Package.Literals.MODEL__NUM_SPACES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumSpaces(long newNumSpaces) {
		eSet(Part21Package.Literals.MODEL__NUM_SPACES, newNumSpaces);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumSites() {
		return (Long)eGet(Part21Package.Literals.MODEL__NUM_SITES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumSites(long newNumSites) {
		eSet(Part21Package.Literals.MODEL__NUM_SITES, newNumSites);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumBuildingStories() {
		return (Long)eGet(Part21Package.Literals.MODEL__NUM_BUILDING_STORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumBuildingStories(long newNumBuildingStories) {
		eSet(Part21Package.Literals.MODEL__NUM_BUILDING_STORIES, newNumBuildingStories);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumBuildings() {
		return (Long)eGet(Part21Package.Literals.MODEL__NUM_BUILDINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumBuildings(long newNumBuildings) {
		eSet(Part21Package.Literals.MODEL__NUM_BUILDINGS, newNumBuildings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumBuildingElements() {
		return (Long)eGet(Part21Package.Literals.MODEL__NUM_BUILDING_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumBuildingElements(long newNumBuildingElements) {
		eSet(Part21Package.Literals.MODEL__NUM_BUILDING_ELEMENTS, newNumBuildingElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumProducts() {
		return (Long)eGet(Part21Package.Literals.MODEL__NUM_PRODUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumProducts(long newNumProducts) {
		eSet(Part21Package.Literals.MODEL__NUM_PRODUCTS, newNumProducts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRoot() {
		return (EObject)eGet(Part21Package.Literals.MODEL__ROOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(EObject newRoot) {
		eSet(Part21Package.Literals.MODEL__ROOT, newRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getParsingTime() {
		return (Long)eGet(Part21Package.Literals.MODEL__PARSING_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParsingTime(long newParsingTime) {
		eSet(Part21Package.Literals.MODEL__PARSING_TIME, newParsingTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSavingTime() {
		return (Long)eGet(Part21Package.Literals.MODEL__SAVING_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSavingTime(long newSavingTime) {
		eSet(Part21Package.Literals.MODEL__SAVING_TIME, newSavingTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBuildModelTime() {
		return (Long)eGet(Part21Package.Literals.MODEL__BUILD_MODEL_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildModelTime(long newBuildModelTime) {
		eSet(Part21Package.Literals.MODEL__BUILD_MODEL_TIME, newBuildModelTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public GuidToPart21Container getGuidToPart21() {
		return (GuidToPart21Container)eGet(Part21Package.Literals.MODEL__GUID_TO_PART21, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuidToPart21(GuidToPart21Container newGuidToPart21) {
		eSet(Part21Package.Literals.MODEL__GUID_TO_PART21, newGuidToPart21);
	}

} //ModelImpl
