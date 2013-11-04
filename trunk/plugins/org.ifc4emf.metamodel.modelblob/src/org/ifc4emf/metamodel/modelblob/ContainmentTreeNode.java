/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.modelblob;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containment Tree Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getBranch0 <em>Branch0</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getContent <em>Content</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getBranch1 <em>Branch1</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getForwardReferences <em>Forward References</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getOrderings <em>Orderings</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getContentList <em>Content List</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getVirtualContent <em>Virtual Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getContainmentTreeNode()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ContainmentTreeNode extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(EObject)
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getContainmentTreeNode_Content()
	 * @model containment="true"
	 * @generated
	 */
	EObject getContent();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(EObject value);

	/**
	 * Returns the value of the '<em><b>Branch0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch0</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch0</em>' containment reference.
	 * @see #setBranch0(ContainmentTreeNode)
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getContainmentTreeNode_Branch0()
	 * @model containment="true"
	 * @generated
	 */
	ContainmentTreeNode getBranch0();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getBranch0 <em>Branch0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch0</em>' containment reference.
	 * @see #getBranch0()
	 * @generated
	 */
	void setBranch0(ContainmentTreeNode value);

	/**
	 * Returns the value of the '<em><b>Branch1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch1</em>' containment reference.
	 * @see #setBranch1(ContainmentTreeNode)
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getContainmentTreeNode_Branch1()
	 * @model containment="true"
	 * @generated
	 */
	ContainmentTreeNode getBranch1();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getBranch1 <em>Branch1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch1</em>' containment reference.
	 * @see #getBranch1()
	 * @generated
	 */
	void setBranch1(ContainmentTreeNode value);

	/**
	 * Returns the value of the '<em><b>Forward References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward References</em>' attribute list.
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getContainmentTreeNode_ForwardReferences()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getForwardReferences();

	/**
	 * Returns the value of the '<em><b>Orderings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orderings</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderings</em>' attribute list.
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getContainmentTreeNode_Orderings()
	 * @model
	 * @generated
	 */
	EList<Integer> getOrderings();

	/**
	 * Returns the value of the '<em><b>Content List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content List</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getContainmentTreeNode_ContentList()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContentList();

	/**
	 * Returns the value of the '<em><b>Virtual Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Content</em>' reference.
	 * @see #setVirtualContent(EObject)
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getContainmentTreeNode_VirtualContent()
	 * @model
	 * @generated
	 */
	EObject getVirtualContent();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode#getVirtualContent <em>Virtual Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Content</em>' reference.
	 * @see #getVirtualContent()
	 * @generated
	 */
	void setVirtualContent(EObject value);

} // ContainmentTreeNode
