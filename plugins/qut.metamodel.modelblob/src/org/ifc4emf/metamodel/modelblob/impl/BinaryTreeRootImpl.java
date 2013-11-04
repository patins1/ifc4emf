/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.modelblob.impl;

import org.eclipse.emf.ecore.EClass;
import org.ifc4emf.metamodel.modelblob.BinaryTreeRoot;
import org.ifc4emf.metamodel.modelblob.ModelblobPackage;
import org.ifc4emf.metamodel.modelblob.ResumableModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Tree Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.BinaryTreeRootImpl#getTotalWork <em>Total Work</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.BinaryTreeRootImpl#getWorked <em>Worked</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.BinaryTreeRootImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.BinaryTreeRootImpl#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BinaryTreeRootImpl extends ContainmentTreeNodeImpl implements BinaryTreeRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryTreeRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelblobPackage.Literals.BINARY_TREE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDepth() {
		return (Integer)eGet(ModelblobPackage.Literals.BINARY_TREE_ROOT__DEPTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(int newDepth) {
		eSet(ModelblobPackage.Literals.BINARY_TREE_ROOT__DEPTH, newDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return (Integer)eGet(ModelblobPackage.Literals.BINARY_TREE_ROOT__COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		eSet(ModelblobPackage.Literals.BINARY_TREE_ROOT__COUNT, newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTotalWork() {
		return (Long)eGet(ModelblobPackage.Literals.RESUMABLE_MODEL__TOTAL_WORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalWork(long newTotalWork) {
		eSet(ModelblobPackage.Literals.RESUMABLE_MODEL__TOTAL_WORK, newTotalWork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getWorked() {
		return (Long)eGet(ModelblobPackage.Literals.RESUMABLE_MODEL__WORKED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorked(long newWorked) {
		eSet(ModelblobPackage.Literals.RESUMABLE_MODEL__WORKED, newWorked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resume() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Double getCompletionRatio() {
		if (getTotalWork()>0)
			return 1.0*getWorked()/getTotalWork();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResumableModel.class) {
			switch (derivedFeatureID) {
				case ModelblobPackage.BINARY_TREE_ROOT__TOTAL_WORK: return ModelblobPackage.RESUMABLE_MODEL__TOTAL_WORK;
				case ModelblobPackage.BINARY_TREE_ROOT__WORKED: return ModelblobPackage.RESUMABLE_MODEL__WORKED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResumableModel.class) {
			switch (baseFeatureID) {
				case ModelblobPackage.RESUMABLE_MODEL__TOTAL_WORK: return ModelblobPackage.BINARY_TREE_ROOT__TOTAL_WORK;
				case ModelblobPackage.RESUMABLE_MODEL__WORKED: return ModelblobPackage.BINARY_TREE_ROOT__WORKED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BinaryTreeRootImpl
