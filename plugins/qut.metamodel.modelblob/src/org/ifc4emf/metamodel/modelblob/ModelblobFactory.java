/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.modelblob;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.modelblob.ModelblobPackage
 * @generated
 */
public interface ModelblobFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelblobFactory eINSTANCE = org.ifc4emf.metamodel.modelblob.impl.ModelblobFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Containment Tree Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment Tree Node</em>'.
	 * @generated
	 */
	ContainmentTreeNode createContainmentTreeNode();

	/**
	 * Returns a new object of class '<em>Resumable Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resumable Model</em>'.
	 * @generated
	 */
	ResumableModel createResumableModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelblobPackage getModelblobPackage();

} //ModelblobFactory
