/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.ifcheader.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ifc4emf.metamodel.ifcheader.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Part21FactoryImpl extends EFactoryImpl implements Part21Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Part21Factory init() {
		try {
			Part21Factory thePart21Factory = (Part21Factory)EPackage.Registry.INSTANCE.getEFactory(Part21Package.eNS_URI);
			if (thePart21Factory != null) {
				return thePart21Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Part21FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part21FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Part21Package.MODEL: return (EObject)createModel();
			case Part21Package.MODEL_NAME: return (EObject)createModelName();
			case Part21Package.MODEL_DESCRIPTION: return (EObject)createModelDescription();
			case Part21Package.MODEL_SCHEMA: return (EObject)createModelSchema();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelName createModelName() {
		ModelNameImpl modelName = new ModelNameImpl();
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDescription createModelDescription() {
		ModelDescriptionImpl modelDescription = new ModelDescriptionImpl();
		return modelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSchema createModelSchema() {
		ModelSchemaImpl modelSchema = new ModelSchemaImpl();
		return modelSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part21Package getPart21Package() {
		return (Part21Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Part21Package getPackage() {
		return Part21Package.eINSTANCE;
	}

} //Part21FactoryImpl
