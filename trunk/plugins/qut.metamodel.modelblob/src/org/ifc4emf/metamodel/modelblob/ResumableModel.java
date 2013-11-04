/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.modelblob;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resumable Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.ResumableModel#getTotalWork <em>Total Work</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.modelblob.ResumableModel#getWorked <em>Worked</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getResumableModel()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ResumableModel extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Total Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Work</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Work</em>' attribute.
	 * @see #setTotalWork(long)
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getResumableModel_TotalWork()
	 * @model
	 * @generated
	 */
	long getTotalWork();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.modelblob.ResumableModel#getTotalWork <em>Total Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Work</em>' attribute.
	 * @see #getTotalWork()
	 * @generated
	 */
	void setTotalWork(long value);

	/**
	 * Returns the value of the '<em><b>Worked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worked</em>' attribute.
	 * @see #setWorked(long)
	 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage#getResumableModel_Worked()
	 * @model
	 * @generated
	 */
	long getWorked();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.modelblob.ResumableModel#getWorked <em>Worked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worked</em>' attribute.
	 * @see #getWorked()
	 * @generated
	 */
	void setWorked(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Double getCompletionRatio();

} // ResumableModel
