/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.ifcheader.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.metamodel.ifcheader.ModelDescription;
import org.ifc4emf.metamodel.ifcheader.Part21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelDescriptionImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelDescriptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelDescriptionImpl#getImplementation_level <em>Implementation level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelDescriptionImpl extends CDOObjectImpl implements ModelDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part21Package.Literals.MODEL_DESCRIPTION;
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
	public Model getModel() {
		return (Model)eGet(Part21Package.Literals.MODEL_DESCRIPTION__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		eSet(Part21Package.Literals.MODEL_DESCRIPTION__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getDescription() {
		return (EList<String>)eGet(Part21Package.Literals.MODEL_DESCRIPTION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementation_level() {
		return (String)eGet(Part21Package.Literals.MODEL_DESCRIPTION__IMPLEMENTATION_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation_level(String newImplementation_level) {
		eSet(Part21Package.Literals.MODEL_DESCRIPTION__IMPLEMENTATION_LEVEL, newImplementation_level);
	}

} //ModelDescriptionImpl
