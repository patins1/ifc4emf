/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.modelblob.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.ifc4emf.metamodel.modelblob.ContainmentTreeNode;
import org.ifc4emf.metamodel.modelblob.ModelblobPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Containment Tree Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.ContainmentTreeNodeImpl#getBranch0 <em>Branch0</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.ContainmentTreeNodeImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.ContainmentTreeNodeImpl#getBranch1 <em>Branch1</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.ContainmentTreeNodeImpl#getForwardReferences <em>Forward References</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.ContainmentTreeNodeImpl#getOrderings <em>Orderings</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.ContainmentTreeNodeImpl#getContentList <em>Content List</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.ContainmentTreeNodeImpl#getVirtualContent <em>Virtual Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainmentTreeNodeImpl extends CDOObjectImpl implements ContainmentTreeNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainmentTreeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelblobPackage.Literals.CONTAINMENT_TREE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getContent() {
		return (EObject)eGet(ModelblobPackage.Literals.CONTAINMENT_TREE_NODE__CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(EObject newContent) {
		eSet(ModelblobPackage.Literals.CONTAINMENT_TREE_NODE__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentTreeNode getBranch0() {
		return (ContainmentTreeNode)eGet(ModelblobPackage.Literals.CONTAINMENT_TREE_NODE__BRANCH0, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranch0(ContainmentTreeNode newBranch0) {
		eSet(ModelblobPackage.Literals.CONTAINMENT_TREE_NODE__BRANCH0, newBranch0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentTreeNode getBranch1() {
		return (ContainmentTreeNode)eGet(ModelblobPackage.Literals.CONTAINMENT_TREE_NODE__BRANCH1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranch1(ContainmentTreeNode newBranch1) {
		eSet(ModelblobPackage.Literals.CONTAINMENT_TREE_NODE__BRANCH1, newBranch1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> getForwardReferences() {
		return (EList<Integer>)eGet(ModelblobPackage.Literals.CONTAINMENT_TREE_NODE__FORWARD_REFERENCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> getOrderings() {
		return (EList<Integer>)eGet(ModelblobPackage.Literals.CONTAINMENT_TREE_NODE__ORDERINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> getContentList() {
		return (EList<EObject>)eGet(ModelblobPackage.Literals.CONTAINMENT_TREE_NODE__CONTENT_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getVirtualContent() {
		return (EObject)eGet(ModelblobPackage.Literals.CONTAINMENT_TREE_NODE__VIRTUAL_CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualContent(EObject newVirtualContent) {
		eSet(ModelblobPackage.Literals.CONTAINMENT_TREE_NODE__VIRTUAL_CONTENT, newVirtualContent);
	}

} //ContainmentTreeNodeImpl
