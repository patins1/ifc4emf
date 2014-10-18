/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.ifcheader;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.ifc4emf.metamodel.modelblob.ModelblobPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.ifcheader.Part21Factory
 * @model kind="package"
 * @generated
 */
public interface Part21Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ifcheader";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.ifc4emf.metamodel.ifcheader.ecore/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ifcheader";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Part21Package eINSTANCE = org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.ifcheader.impl.ModelImpl
	 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Branch0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BRANCH0 = ModelblobPackage.BINARY_TREE_ROOT__BRANCH0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTENT = ModelblobPackage.BINARY_TREE_ROOT__CONTENT;

	/**
	 * The feature id for the '<em><b>Branch1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BRANCH1 = ModelblobPackage.BINARY_TREE_ROOT__BRANCH1;

	/**
	 * The feature id for the '<em><b>Forward References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FORWARD_REFERENCES = ModelblobPackage.BINARY_TREE_ROOT__FORWARD_REFERENCES;

	/**
	 * The feature id for the '<em><b>Orderings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ORDERINGS = ModelblobPackage.BINARY_TREE_ROOT__ORDERINGS;

	/**
	 * The feature id for the '<em><b>Content List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTENT_LIST = ModelblobPackage.BINARY_TREE_ROOT__CONTENT_LIST;

	/**
	 * The feature id for the '<em><b>Virtual Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VIRTUAL_CONTENT = ModelblobPackage.BINARY_TREE_ROOT__VIRTUAL_CONTENT;

	/**
	 * The feature id for the '<em><b>Total Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TOTAL_WORK = ModelblobPackage.BINARY_TREE_ROOT__TOTAL_WORK;

	/**
	 * The feature id for the '<em><b>Worked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__WORKED = ModelblobPackage.BINARY_TREE_ROOT__WORKED;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEPTH = ModelblobPackage.BINARY_TREE_ROOT__DEPTH;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COUNT = ModelblobPackage.BINARY_TREE_ROOT__COUNT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTENTS = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SCHEMA = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Ifc Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NUM_IFC_OBJECTS = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NUM_SPACES = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Num Sites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NUM_SITES = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Num Building Stories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NUM_BUILDING_STORIES = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Num Buildings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NUM_BUILDINGS = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Num Building Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NUM_BUILDING_ELEMENTS = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Num Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NUM_PRODUCTS = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ROOT = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Parsing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PARSING_TIME = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Saving Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SAVING_TIME = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Build Model Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BUILD_MODEL_TIME = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Guid To Part21</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GUID_TO_PART21 = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = ModelblobPackage.BINARY_TREE_ROOT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl <em>Model Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl
	 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getModelName()
	 * @generated
	 */
	int MODEL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAME__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAME__NAME = 1;

	/**
	 * The feature id for the '<em><b>Time stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAME__TIME_STAMP = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAME__AUTHOR = 3;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAME__ORGANIZATION = 4;

	/**
	 * The feature id for the '<em><b>Preprocessor version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAME__PREPROCESSOR_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Originating system</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAME__ORIGINATING_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAME__AUTHORIZATION = 7;

	/**
	 * The number of structural features of the '<em>Model Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAME_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.ifcheader.impl.ModelDescriptionImpl <em>Model Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.ifcheader.impl.ModelDescriptionImpl
	 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getModelDescription()
	 * @generated
	 */
	int MODEL_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DESCRIPTION__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DESCRIPTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Implementation level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DESCRIPTION__IMPLEMENTATION_LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Model Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.ifcheader.impl.ModelSchemaImpl <em>Model Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.ifcheader.impl.ModelSchemaImpl
	 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getModelSchema()
	 * @generated
	 */
	int MODEL_SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Schema identifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SCHEMA__SCHEMA_IDENTIFIERS = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SCHEMA__MODEL = 1;

	/**
	 * The number of structural features of the '<em>Model Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SCHEMA_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.ifcheader.impl.GuidToPart21MapImpl <em>Guid To Part21 Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.ifcheader.impl.GuidToPart21MapImpl
	 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getGuidToPart21Map()
	 * @generated
	 */
	int GUID_TO_PART21_MAP = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUID_TO_PART21_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUID_TO_PART21_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Guid To Part21 Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUID_TO_PART21_MAP_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.ifcheader.impl.GuidToPart21ContainerImpl <em>Guid To Part21 Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.ifcheader.impl.GuidToPart21ContainerImpl
	 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getGuidToPart21Container()
	 * @generated
	 */
	int GUID_TO_PART21_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Guid To Part21</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUID_TO_PART21_CONTAINER__GUID_TO_PART21 = 0;

	/**
	 * The number of structural features of the '<em>Guid To Part21 Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUID_TO_PART21_CONTAINER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.ifcheader.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.ifcheader.Model#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getContents()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Contents();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.ifcheader.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.ifcheader.Model#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getDescription()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.ifcheader.Model#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getSchema()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumIfcObjects <em>Num Ifc Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Ifc Objects</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getNumIfcObjects()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_NumIfcObjects();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumSpaces <em>Num Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Spaces</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getNumSpaces()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_NumSpaces();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumSites <em>Num Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Sites</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getNumSites()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_NumSites();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumBuildingStories <em>Num Building Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Building Stories</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getNumBuildingStories()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_NumBuildingStories();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumBuildings <em>Num Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Buildings</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getNumBuildings()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_NumBuildings();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumBuildingElements <em>Num Building Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Building Elements</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getNumBuildingElements()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_NumBuildingElements();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.Model#getNumProducts <em>Num Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Products</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getNumProducts()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_NumProducts();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.ifcheader.Model#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getRoot()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Root();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.Model#getParsingTime <em>Parsing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parsing Time</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getParsingTime()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ParsingTime();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.Model#getSavingTime <em>Saving Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saving Time</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getSavingTime()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_SavingTime();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.Model#getBuildModelTime <em>Build Model Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Model Time</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getBuildModelTime()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_BuildModelTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.ifcheader.Model#getGuidToPart21 <em>Guid To Part21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guid To Part21</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.Model#getGuidToPart21()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_GuidToPart21();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.ifcheader.ModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Name</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelName
	 * @generated
	 */
	EClass getModelName();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelName#getModel()
	 * @see #getModelName()
	 * @generated
	 */
	EReference getModelName_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelName#getName()
	 * @see #getModelName()
	 * @generated
	 */
	EAttribute getModelName_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getTime_stamp <em>Time stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time stamp</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelName#getTime_stamp()
	 * @see #getModelName()
	 * @generated
	 */
	EAttribute getModelName_Time_stamp();

	/**
	 * Returns the meta object for the attribute list '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Author</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelName#getAuthor()
	 * @see #getModelName()
	 * @generated
	 */
	EAttribute getModelName_Author();

	/**
	 * Returns the meta object for the attribute list '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Organization</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelName#getOrganization()
	 * @see #getModelName()
	 * @generated
	 */
	EAttribute getModelName_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getPreprocessor_version <em>Preprocessor version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preprocessor version</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelName#getPreprocessor_version()
	 * @see #getModelName()
	 * @generated
	 */
	EAttribute getModelName_Preprocessor_version();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getOriginating_system <em>Originating system</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originating system</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelName#getOriginating_system()
	 * @see #getModelName()
	 * @generated
	 */
	EAttribute getModelName_Originating_system();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.ModelName#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelName#getAuthorization()
	 * @see #getModelName()
	 * @generated
	 */
	EAttribute getModelName_Authorization();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.ifcheader.ModelDescription <em>Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Description</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelDescription
	 * @generated
	 */
	EClass getModelDescription();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.ifcheader.ModelDescription#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelDescription#getModel()
	 * @see #getModelDescription()
	 * @generated
	 */
	EReference getModelDescription_Model();

	/**
	 * Returns the meta object for the attribute list '{@link org.ifc4emf.metamodel.ifcheader.ModelDescription#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelDescription#getDescription()
	 * @see #getModelDescription()
	 * @generated
	 */
	EAttribute getModelDescription_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.ifcheader.ModelDescription#getImplementation_level <em>Implementation level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation level</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelDescription#getImplementation_level()
	 * @see #getModelDescription()
	 * @generated
	 */
	EAttribute getModelDescription_Implementation_level();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.ifcheader.ModelSchema <em>Model Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Schema</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelSchema
	 * @generated
	 */
	EClass getModelSchema();

	/**
	 * Returns the meta object for the attribute list '{@link org.ifc4emf.metamodel.ifcheader.ModelSchema#getSchema_identifiers <em>Schema identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schema identifiers</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelSchema#getSchema_identifiers()
	 * @see #getModelSchema()
	 * @generated
	 */
	EAttribute getModelSchema_Schema_identifiers();

	/**
	 * Returns the meta object for the container reference '{@link org.ifc4emf.metamodel.ifcheader.ModelSchema#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelSchema#getModel()
	 * @see #getModelSchema()
	 * @generated
	 */
	EReference getModelSchema_Model();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Guid To Part21 Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guid To Part21 Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.emf.ecore.EObject" valueRequired="true"
	 * @generated
	 */
	EClass getGuidToPart21Map();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getGuidToPart21Map()
	 * @generated
	 */
	EAttribute getGuidToPart21Map_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getGuidToPart21Map()
	 * @generated
	 */
	EReference getGuidToPart21Map_Value();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.ifcheader.GuidToPart21Container <em>Guid To Part21 Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guid To Part21 Container</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.GuidToPart21Container
	 * @generated
	 */
	EClass getGuidToPart21Container();

	/**
	 * Returns the meta object for the map '{@link org.ifc4emf.metamodel.ifcheader.GuidToPart21Container#getGuidToPart21 <em>Guid To Part21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Guid To Part21</em>'.
	 * @see org.ifc4emf.metamodel.ifcheader.GuidToPart21Container#getGuidToPart21()
	 * @see #getGuidToPart21Container()
	 * @generated
	 */
	EReference getGuidToPart21Container_GuidToPart21();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Part21Factory getPart21Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.ifcheader.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.ifcheader.impl.ModelImpl
		 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTENTS = eINSTANCE.getModel_Contents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SCHEMA = eINSTANCE.getModel_Schema();

		/**
		 * The meta object literal for the '<em><b>Num Ifc Objects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NUM_IFC_OBJECTS = eINSTANCE.getModel_NumIfcObjects();

		/**
		 * The meta object literal for the '<em><b>Num Spaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NUM_SPACES = eINSTANCE.getModel_NumSpaces();

		/**
		 * The meta object literal for the '<em><b>Num Sites</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NUM_SITES = eINSTANCE.getModel_NumSites();

		/**
		 * The meta object literal for the '<em><b>Num Building Stories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NUM_BUILDING_STORIES = eINSTANCE.getModel_NumBuildingStories();

		/**
		 * The meta object literal for the '<em><b>Num Buildings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NUM_BUILDINGS = eINSTANCE.getModel_NumBuildings();

		/**
		 * The meta object literal for the '<em><b>Num Building Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NUM_BUILDING_ELEMENTS = eINSTANCE.getModel_NumBuildingElements();

		/**
		 * The meta object literal for the '<em><b>Num Products</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NUM_PRODUCTS = eINSTANCE.getModel_NumProducts();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ROOT = eINSTANCE.getModel_Root();

		/**
		 * The meta object literal for the '<em><b>Parsing Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__PARSING_TIME = eINSTANCE.getModel_ParsingTime();

		/**
		 * The meta object literal for the '<em><b>Saving Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__SAVING_TIME = eINSTANCE.getModel_SavingTime();

		/**
		 * The meta object literal for the '<em><b>Build Model Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__BUILD_MODEL_TIME = eINSTANCE.getModel_BuildModelTime();

		/**
		 * The meta object literal for the '<em><b>Guid To Part21</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__GUID_TO_PART21 = eINSTANCE.getModel_GuidToPart21();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl <em>Model Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl
		 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getModelName()
		 * @generated
		 */
		EClass MODEL_NAME = eINSTANCE.getModelName();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_NAME__MODEL = eINSTANCE.getModelName_Model();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NAME__NAME = eINSTANCE.getModelName_Name();

		/**
		 * The meta object literal for the '<em><b>Time stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NAME__TIME_STAMP = eINSTANCE.getModelName_Time_stamp();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NAME__AUTHOR = eINSTANCE.getModelName_Author();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NAME__ORGANIZATION = eINSTANCE.getModelName_Organization();

		/**
		 * The meta object literal for the '<em><b>Preprocessor version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NAME__PREPROCESSOR_VERSION = eINSTANCE.getModelName_Preprocessor_version();

		/**
		 * The meta object literal for the '<em><b>Originating system</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NAME__ORIGINATING_SYSTEM = eINSTANCE.getModelName_Originating_system();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NAME__AUTHORIZATION = eINSTANCE.getModelName_Authorization();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.ifcheader.impl.ModelDescriptionImpl <em>Model Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.ifcheader.impl.ModelDescriptionImpl
		 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getModelDescription()
		 * @generated
		 */
		EClass MODEL_DESCRIPTION = eINSTANCE.getModelDescription();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DESCRIPTION__MODEL = eINSTANCE.getModelDescription_Model();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DESCRIPTION__DESCRIPTION = eINSTANCE.getModelDescription_Description();

		/**
		 * The meta object literal for the '<em><b>Implementation level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DESCRIPTION__IMPLEMENTATION_LEVEL = eINSTANCE.getModelDescription_Implementation_level();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.ifcheader.impl.ModelSchemaImpl <em>Model Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.ifcheader.impl.ModelSchemaImpl
		 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getModelSchema()
		 * @generated
		 */
		EClass MODEL_SCHEMA = eINSTANCE.getModelSchema();

		/**
		 * The meta object literal for the '<em><b>Schema identifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SCHEMA__SCHEMA_IDENTIFIERS = eINSTANCE.getModelSchema_Schema_identifiers();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_SCHEMA__MODEL = eINSTANCE.getModelSchema_Model();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.ifcheader.impl.GuidToPart21MapImpl <em>Guid To Part21 Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.ifcheader.impl.GuidToPart21MapImpl
		 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getGuidToPart21Map()
		 * @generated
		 */
		EClass GUID_TO_PART21_MAP = eINSTANCE.getGuidToPart21Map();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUID_TO_PART21_MAP__KEY = eINSTANCE.getGuidToPart21Map_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUID_TO_PART21_MAP__VALUE = eINSTANCE.getGuidToPart21Map_Value();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.ifcheader.impl.GuidToPart21ContainerImpl <em>Guid To Part21 Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.ifcheader.impl.GuidToPart21ContainerImpl
		 * @see org.ifc4emf.metamodel.ifcheader.impl.Part21PackageImpl#getGuidToPart21Container()
		 * @generated
		 */
		EClass GUID_TO_PART21_CONTAINER = eINSTANCE.getGuidToPart21Container();

		/**
		 * The meta object literal for the '<em><b>Guid To Part21</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUID_TO_PART21_CONTAINER__GUID_TO_PART21 = eINSTANCE.getGuidToPart21Container_GuidToPart21();

	}

} //Part21Package
