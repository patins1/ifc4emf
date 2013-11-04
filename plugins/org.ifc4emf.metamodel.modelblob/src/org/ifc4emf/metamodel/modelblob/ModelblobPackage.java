/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.modelblob;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.ifc4emf.metamodel.modelblob.ModelblobFactory
 * @model kind="package"
 * @generated
 */
public interface ModelblobPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelblob";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.ifc4emf.metamodel.modelblob.ecore/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelblob";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelblobPackage eINSTANCE = org.ifc4emf.metamodel.modelblob.impl.ModelblobPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.modelblob.impl.ContainmentTreeNodeImpl <em>Containment Tree Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.modelblob.impl.ContainmentTreeNodeImpl
	 * @see org.ifc4emf.metamodel.modelblob.impl.ModelblobPackageImpl#getContainmentTreeNode()
	 * @generated
	 */
	int CONTAINMENT_TREE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Branch0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_TREE_NODE__BRANCH0 = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_TREE_NODE__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Branch1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_TREE_NODE__BRANCH1 = 2;

	/**
	 * The feature id for the '<em><b>Forward References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_TREE_NODE__FORWARD_REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Orderings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_TREE_NODE__ORDERINGS = 4;

	/**
	 * The feature id for the '<em><b>Content List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_TREE_NODE__CONTENT_LIST = 5;

	/**
	 * The feature id for the '<em><b>Virtual Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_TREE_NODE__VIRTUAL_CONTENT = 6;

	/**
	 * The number of structural features of the '<em>Containment Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_TREE_NODE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.modelblob.impl.BinaryTreeRootImpl <em>Binary Tree Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.modelblob.impl.BinaryTreeRootImpl
	 * @see org.ifc4emf.metamodel.modelblob.impl.ModelblobPackageImpl#getBinaryTreeRoot()
	 * @generated
	 */
	int BINARY_TREE_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Branch0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT__BRANCH0 = CONTAINMENT_TREE_NODE__BRANCH0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT__CONTENT = CONTAINMENT_TREE_NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Branch1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT__BRANCH1 = CONTAINMENT_TREE_NODE__BRANCH1;

	/**
	 * The feature id for the '<em><b>Forward References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT__FORWARD_REFERENCES = CONTAINMENT_TREE_NODE__FORWARD_REFERENCES;

	/**
	 * The feature id for the '<em><b>Orderings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT__ORDERINGS = CONTAINMENT_TREE_NODE__ORDERINGS;

	/**
	 * The feature id for the '<em><b>Content List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT__CONTENT_LIST = CONTAINMENT_TREE_NODE__CONTENT_LIST;

	/**
	 * The feature id for the '<em><b>Virtual Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT__VIRTUAL_CONTENT = CONTAINMENT_TREE_NODE__VIRTUAL_CONTENT;

	/**
	 * The feature id for the '<em><b>Total Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT__TOTAL_WORK = CONTAINMENT_TREE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT__WORKED = CONTAINMENT_TREE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT__DEPTH = CONTAINMENT_TREE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT__COUNT = CONTAINMENT_TREE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Binary Tree Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TREE_ROOT_FEATURE_COUNT = CONTAINMENT_TREE_NODE_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.ifc4emf.metamodel.modelblob.impl.ResumableModelImpl <em>Resumable Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ifc4emf.metamodel.modelblob.impl.ResumableModelImpl
	 * @see org.ifc4emf.metamodel.modelblob.impl.ModelblobPackageImpl#getResumableModel()
	 * @generated
	 */
	int RESUMABLE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Total Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUMABLE_MODEL__TOTAL_WORK = 0;

	/**
	 * The feature id for the '<em><b>Worked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUMABLE_MODEL__WORKED = 1;

	/**
	 * The number of structural features of the '<em>Resumable Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUMABLE_MODEL_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode <em>Containment Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Tree Node</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.ContainmentTreeNode
	 * @generated
	 */
	EClass getContainmentTreeNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getContent()
	 * @see #getContainmentTreeNode()
	 * @generated
	 */
	EReference getContainmentTreeNode_Content();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getBranch0 <em>Branch0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branch0</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getBranch0()
	 * @see #getContainmentTreeNode()
	 * @generated
	 */
	EReference getContainmentTreeNode_Branch0();

	/**
	 * Returns the meta object for the containment reference '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getBranch1 <em>Branch1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branch1</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getBranch1()
	 * @see #getContainmentTreeNode()
	 * @generated
	 */
	EReference getContainmentTreeNode_Branch1();

	/**
	 * Returns the meta object for the attribute list '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getForwardReferences <em>Forward References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Forward References</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getForwardReferences()
	 * @see #getContainmentTreeNode()
	 * @generated
	 */
	EAttribute getContainmentTreeNode_ForwardReferences();

	/**
	 * Returns the meta object for the attribute list '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getOrderings <em>Orderings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Orderings</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getOrderings()
	 * @see #getContainmentTreeNode()
	 * @generated
	 */
	EAttribute getContainmentTreeNode_Orderings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getContentList <em>Content List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content List</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getContentList()
	 * @see #getContainmentTreeNode()
	 * @generated
	 */
	EReference getContainmentTreeNode_ContentList();

	/**
	 * Returns the meta object for the reference '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getVirtualContent <em>Virtual Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtual Content</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getVirtualContent()
	 * @see #getContainmentTreeNode()
	 * @generated
	 */
	EReference getContainmentTreeNode_VirtualContent();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.modelblob.BinaryTreeRoot <em>Binary Tree Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Tree Root</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.BinaryTreeRoot
	 * @generated
	 */
	EClass getBinaryTreeRoot();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.modelblob.BinaryTreeRoot#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.BinaryTreeRoot#getDepth()
	 * @see #getBinaryTreeRoot()
	 * @generated
	 */
	EAttribute getBinaryTreeRoot_Depth();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.modelblob.BinaryTreeRoot#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.BinaryTreeRoot#getCount()
	 * @see #getBinaryTreeRoot()
	 * @generated
	 */
	EAttribute getBinaryTreeRoot_Count();

	/**
	 * Returns the meta object for class '{@link org.ifc4emf.metamodel.modelblob.ResumableModel <em>Resumable Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resumable Model</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.ResumableModel
	 * @generated
	 */
	EClass getResumableModel();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.modelblob.ResumableModel#getTotalWork <em>Total Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Work</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.ResumableModel#getTotalWork()
	 * @see #getResumableModel()
	 * @generated
	 */
	EAttribute getResumableModel_TotalWork();

	/**
	 * Returns the meta object for the attribute '{@link org.ifc4emf.metamodel.modelblob.ResumableModel#getWorked <em>Worked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worked</em>'.
	 * @see org.ifc4emf.metamodel.modelblob.ResumableModel#getWorked()
	 * @see #getResumableModel()
	 * @generated
	 */
	EAttribute getResumableModel_Worked();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelblobFactory getModelblobFactory();

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
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.modelblob.impl.ContainmentTreeNodeImpl <em>Containment Tree Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.modelblob.impl.ContainmentTreeNodeImpl
		 * @see org.ifc4emf.metamodel.modelblob.impl.ModelblobPackageImpl#getContainmentTreeNode()
		 * @generated
		 */
		EClass CONTAINMENT_TREE_NODE = eINSTANCE.getContainmentTreeNode();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_TREE_NODE__CONTENT = eINSTANCE.getContainmentTreeNode_Content();

		/**
		 * The meta object literal for the '<em><b>Branch0</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_TREE_NODE__BRANCH0 = eINSTANCE.getContainmentTreeNode_Branch0();

		/**
		 * The meta object literal for the '<em><b>Branch1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_TREE_NODE__BRANCH1 = eINSTANCE.getContainmentTreeNode_Branch1();

		/**
		 * The meta object literal for the '<em><b>Forward References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINMENT_TREE_NODE__FORWARD_REFERENCES = eINSTANCE.getContainmentTreeNode_ForwardReferences();

		/**
		 * The meta object literal for the '<em><b>Orderings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINMENT_TREE_NODE__ORDERINGS = eINSTANCE.getContainmentTreeNode_Orderings();

		/**
		 * The meta object literal for the '<em><b>Content List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_TREE_NODE__CONTENT_LIST = eINSTANCE.getContainmentTreeNode_ContentList();

		/**
		 * The meta object literal for the '<em><b>Virtual Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_TREE_NODE__VIRTUAL_CONTENT = eINSTANCE.getContainmentTreeNode_VirtualContent();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.modelblob.impl.BinaryTreeRootImpl <em>Binary Tree Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.modelblob.impl.BinaryTreeRootImpl
		 * @see org.ifc4emf.metamodel.modelblob.impl.ModelblobPackageImpl#getBinaryTreeRoot()
		 * @generated
		 */
		EClass BINARY_TREE_ROOT = eINSTANCE.getBinaryTreeRoot();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_TREE_ROOT__DEPTH = eINSTANCE.getBinaryTreeRoot_Depth();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_TREE_ROOT__COUNT = eINSTANCE.getBinaryTreeRoot_Count();

		/**
		 * The meta object literal for the '{@link org.ifc4emf.metamodel.modelblob.impl.ResumableModelImpl <em>Resumable Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ifc4emf.metamodel.modelblob.impl.ResumableModelImpl
		 * @see org.ifc4emf.metamodel.modelblob.impl.ModelblobPackageImpl#getResumableModel()
		 * @generated
		 */
		EClass RESUMABLE_MODEL = eINSTANCE.getResumableModel();

		/**
		 * The meta object literal for the '<em><b>Total Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESUMABLE_MODEL__TOTAL_WORK = eINSTANCE.getResumableModel_TotalWork();

		/**
		 * The meta object literal for the '<em><b>Worked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESUMABLE_MODEL__WORKED = eINSTANCE.getResumableModel_Worked();

	}

} //ModelblobPackage
