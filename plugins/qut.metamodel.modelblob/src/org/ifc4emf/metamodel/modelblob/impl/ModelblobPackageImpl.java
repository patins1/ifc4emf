/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.modelblob.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ifc4emf.metamodel.modelblob.BinaryTreeRoot;
import org.ifc4emf.metamodel.modelblob.ContainmentTreeNode;
import org.ifc4emf.metamodel.modelblob.ModelblobFactory;
import org.ifc4emf.metamodel.modelblob.ModelblobPackage;
import org.ifc4emf.metamodel.modelblob.ResumableModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelblobPackageImpl extends EPackageImpl implements ModelblobPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentTreeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryTreeRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resumableModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelblobPackageImpl() {
		super(eNS_URI, ModelblobFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelblobPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelblobPackage init() {
		if (isInited) return (ModelblobPackage)EPackage.Registry.INSTANCE.getEPackage(ModelblobPackage.eNS_URI);

		// Obtain or create and register package
		ModelblobPackageImpl theModelblobPackage = (ModelblobPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelblobPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelblobPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelblobPackage.createPackageContents();

		// Initialize created meta-data
		theModelblobPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelblobPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelblobPackage.eNS_URI, theModelblobPackage);
		return theModelblobPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainmentTreeNode() {
		return containmentTreeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentTreeNode_Content() {
		return (EReference)containmentTreeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentTreeNode_Branch0() {
		return (EReference)containmentTreeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentTreeNode_Branch1() {
		return (EReference)containmentTreeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainmentTreeNode_ForwardReferences() {
		return (EAttribute)containmentTreeNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainmentTreeNode_Orderings() {
		return (EAttribute)containmentTreeNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentTreeNode_ContentList() {
		return (EReference)containmentTreeNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentTreeNode_VirtualContent() {
		return (EReference)containmentTreeNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryTreeRoot() {
		return binaryTreeRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryTreeRoot_Depth() {
		return (EAttribute)binaryTreeRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryTreeRoot_Count() {
		return (EAttribute)binaryTreeRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResumableModel() {
		return resumableModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResumableModel_TotalWork() {
		return (EAttribute)resumableModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResumableModel_Worked() {
		return (EAttribute)resumableModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelblobFactory getModelblobFactory() {
		return (ModelblobFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		containmentTreeNodeEClass = createEClass(CONTAINMENT_TREE_NODE);
		createEReference(containmentTreeNodeEClass, CONTAINMENT_TREE_NODE__BRANCH0);
		createEReference(containmentTreeNodeEClass, CONTAINMENT_TREE_NODE__CONTENT);
		createEReference(containmentTreeNodeEClass, CONTAINMENT_TREE_NODE__BRANCH1);
		createEAttribute(containmentTreeNodeEClass, CONTAINMENT_TREE_NODE__FORWARD_REFERENCES);
		createEAttribute(containmentTreeNodeEClass, CONTAINMENT_TREE_NODE__ORDERINGS);
		createEReference(containmentTreeNodeEClass, CONTAINMENT_TREE_NODE__CONTENT_LIST);
		createEReference(containmentTreeNodeEClass, CONTAINMENT_TREE_NODE__VIRTUAL_CONTENT);

		binaryTreeRootEClass = createEClass(BINARY_TREE_ROOT);
		createEAttribute(binaryTreeRootEClass, BINARY_TREE_ROOT__DEPTH);
		createEAttribute(binaryTreeRootEClass, BINARY_TREE_ROOT__COUNT);

		resumableModelEClass = createEClass(RESUMABLE_MODEL);
		createEAttribute(resumableModelEClass, RESUMABLE_MODEL__TOTAL_WORK);
		createEAttribute(resumableModelEClass, RESUMABLE_MODEL__WORKED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		binaryTreeRootEClass.getESuperTypes().add(this.getContainmentTreeNode());
		binaryTreeRootEClass.getESuperTypes().add(this.getResumableModel());

		// Initialize classes and features; add operations and parameters
		initEClass(containmentTreeNodeEClass, ContainmentTreeNode.class, "ContainmentTreeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainmentTreeNode_Branch0(), this.getContainmentTreeNode(), null, "branch0", null, 0, 1, ContainmentTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainmentTreeNode_Content(), ecorePackage.getEObject(), null, "content", null, 0, 1, ContainmentTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainmentTreeNode_Branch1(), this.getContainmentTreeNode(), null, "branch1", null, 0, 1, ContainmentTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainmentTreeNode_ForwardReferences(), ecorePackage.getEInt(), "forwardReferences", null, 0, -1, ContainmentTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainmentTreeNode_Orderings(), ecorePackage.getEInt(), "orderings", null, 0, -1, ContainmentTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainmentTreeNode_ContentList(), ecorePackage.getEObject(), null, "contentList", null, 0, -1, ContainmentTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainmentTreeNode_VirtualContent(), ecorePackage.getEObject(), null, "virtualContent", null, 0, 1, ContainmentTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryTreeRootEClass, BinaryTreeRoot.class, "BinaryTreeRoot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryTreeRoot_Depth(), ecorePackage.getEInt(), "depth", null, 1, 1, BinaryTreeRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryTreeRoot_Count(), ecorePackage.getEInt(), "count", null, 0, 1, BinaryTreeRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(binaryTreeRootEClass, null, "resume", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resumableModelEClass, ResumableModel.class, "ResumableModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResumableModel_TotalWork(), ecorePackage.getELong(), "totalWork", null, 0, 1, ResumableModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResumableModel_Worked(), ecorePackage.getELong(), "worked", null, 0, 1, ResumableModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(resumableModelEClass, ecorePackage.getEDoubleObject(), "getCompletionRatio", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelblobPackageImpl
