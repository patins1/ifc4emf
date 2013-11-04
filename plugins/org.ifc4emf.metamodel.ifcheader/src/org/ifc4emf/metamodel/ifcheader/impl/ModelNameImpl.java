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
import org.ifc4emf.metamodel.ifcheader.ModelName;
import org.ifc4emf.metamodel.ifcheader.Part21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl#getTime_stamp <em>Time stamp</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl#getPreprocessor_version <em>Preprocessor version</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl#getOriginating_system <em>Originating system</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelNameImpl#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelNameImpl extends CDOObjectImpl implements ModelName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part21Package.Literals.MODEL_NAME;
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
		return (Model)eGet(Part21Package.Literals.MODEL_NAME__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		eSet(Part21Package.Literals.MODEL_NAME__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(Part21Package.Literals.MODEL_NAME__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(Part21Package.Literals.MODEL_NAME__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime_stamp() {
		return (String)eGet(Part21Package.Literals.MODEL_NAME__TIME_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_stamp(String newTime_stamp) {
		eSet(Part21Package.Literals.MODEL_NAME__TIME_STAMP, newTime_stamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getAuthor() {
		return (EList<String>)eGet(Part21Package.Literals.MODEL_NAME__AUTHOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getOrganization() {
		return (EList<String>)eGet(Part21Package.Literals.MODEL_NAME__ORGANIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreprocessor_version() {
		return (String)eGet(Part21Package.Literals.MODEL_NAME__PREPROCESSOR_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreprocessor_version(String newPreprocessor_version) {
		eSet(Part21Package.Literals.MODEL_NAME__PREPROCESSOR_VERSION, newPreprocessor_version);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginating_system() {
		return (String)eGet(Part21Package.Literals.MODEL_NAME__ORIGINATING_SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginating_system(String newOriginating_system) {
		eSet(Part21Package.Literals.MODEL_NAME__ORIGINATING_SYSTEM, newOriginating_system);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorization() {
		return (String)eGet(Part21Package.Literals.MODEL_NAME__AUTHORIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorization(String newAuthorization) {
		eSet(Part21Package.Literals.MODEL_NAME__AUTHORIZATION, newAuthorization);
	}

} //ModelNameImpl
