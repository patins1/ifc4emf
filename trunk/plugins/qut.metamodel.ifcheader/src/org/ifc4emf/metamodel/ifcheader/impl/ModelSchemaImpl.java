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
import org.ifc4emf.metamodel.ifcheader.ModelSchema;
import org.ifc4emf.metamodel.ifcheader.Part21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelSchemaImpl#getSchema_identifiers <em>Schema identifiers</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.ifcheader.impl.ModelSchemaImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelSchemaImpl extends CDOObjectImpl implements ModelSchema {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part21Package.Literals.MODEL_SCHEMA;
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
	public EList<String> getSchema_identifiers() {
		return (EList<String>)eGet(Part21Package.Literals.MODEL_SCHEMA__SCHEMA_IDENTIFIERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		return (Model)eGet(Part21Package.Literals.MODEL_SCHEMA__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		eSet(Part21Package.Literals.MODEL_SCHEMA__MODEL, newModel);
	}

} //ModelSchemaImpl
