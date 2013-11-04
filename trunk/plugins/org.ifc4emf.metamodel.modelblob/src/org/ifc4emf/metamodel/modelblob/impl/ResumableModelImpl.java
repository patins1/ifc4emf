/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.modelblob.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.ifc4emf.metamodel.modelblob.ModelblobPackage;
import org.ifc4emf.metamodel.modelblob.ResumableModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resumable Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.ResumableModelImpl#getTotalWork <em>Total Work</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.impl.ResumableModelImpl#getWorked <em>Worked</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResumableModelImpl extends CDOObjectImpl implements ResumableModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResumableModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelblobPackage.Literals.RESUMABLE_MODEL;
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
	public Double getCompletionRatio() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //ResumableModelImpl
