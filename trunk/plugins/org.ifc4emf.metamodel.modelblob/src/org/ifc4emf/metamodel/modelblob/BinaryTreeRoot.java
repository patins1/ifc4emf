/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.modelblob;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Tree Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.BinaryTreeRoot#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.BinaryTreeRoot#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getBinaryTreeRoot()
 * @model abstract="true"
 * @generated
 */
public interface BinaryTreeRoot extends ContainmentTreeNode, ResumableModel {
	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getBinaryTreeRoot_Depth()
	 * @model required="true"
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.modelblob.BinaryTreeRoot#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getBinaryTreeRoot_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.modelblob.BinaryTreeRoot#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resume();

} // BinaryTreeRoot
