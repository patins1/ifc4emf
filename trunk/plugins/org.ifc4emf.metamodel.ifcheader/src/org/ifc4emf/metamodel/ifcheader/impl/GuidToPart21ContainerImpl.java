/**
 */
package org.ifc4emf.metamodel.ifcheader.impl;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.ifc4emf.metamodel.ifcheader.GuidToPart21Container;
import org.ifc4emf.metamodel.ifcheader.Part21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guid To Part21 Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.GuidToPart21ContainerImpl#getGuidToPart21 <em>Guid To Part21</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuidToPart21ContainerImpl extends CDOObjectImpl implements GuidToPart21Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuidToPart21ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part21Package.Literals.GUID_TO_PART21_CONTAINER;
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
	@SuppressWarnings("unchecked")
	public EMap<String, Integer> getGuidToPart21() {
		return (EMap<String, Integer>)eGet(Part21Package.Literals.GUID_TO_PART21_CONTAINER__GUID_TO_PART21, true);
	}

} //GuidToPart21ContainerImpl
