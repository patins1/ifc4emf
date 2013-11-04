/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcShell;
import IFC2X3.IfcShellBasedSurfaceModel;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Shell Based Surface Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcShellBasedSurfaceModelImpl#getSbsmBoundary <em>Sbsm Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcShellBasedSurfaceModelImpl extends IfcGeometricRepresentationItemImpl implements IfcShellBasedSurfaceModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcShellBasedSurfaceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcShellBasedSurfaceModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcShell> getSbsmBoundary() {
		return (EList<IfcShell>)eGet(IFC2X3Package.eINSTANCE.getIfcShellBasedSurfaceModel_SbsmBoundary(), true);
	}

} //IfcShellBasedSurfaceModelImpl
