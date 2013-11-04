/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcConnectedFaceSet;
import IFC2X3.IfcFace;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connected Face Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConnectedFaceSetImpl#getCfsFaces <em>Cfs Faces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectedFaceSetImpl extends IfcTopologicalRepresentationItemImpl implements IfcConnectedFaceSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectedFaceSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConnectedFaceSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcFace> getCfsFaces() {
		return (EList<IfcFace>)eGet(IFC2X3Package.eINSTANCE.getIfcConnectedFaceSet_CfsFaces(), true);
	}

} //IfcConnectedFaceSetImpl
