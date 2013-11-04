/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.modelblob.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ifc4emf.metamodel.modelblob.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelblobFactoryImpl extends EFactoryImpl implements ModelblobFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelblobFactory init() {
		try {
			ModelblobFactory theModelblobFactory = (ModelblobFactory)EPackage.Registry.INSTANCE.getEFactory(ModelblobPackage.eNS_URI);
			if (theModelblobFactory != null) {
				return theModelblobFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelblobFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelblobFactoryImpl() {
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
			case ModelblobPackage.CONTAINMENT_TREE_NODE: return (EObject)createContainmentTreeNode();
			case ModelblobPackage.RESUMABLE_MODEL: return (EObject)createResumableModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentTreeNode createContainmentTreeNode() {
		ContainmentTreeNodeImpl containmentTreeNode = new ContainmentTreeNodeImpl();
		return containmentTreeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResumableModel createResumableModel() {
		ResumableModelImpl resumableModel = new ResumableModelImpl();
		return resumableModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelblobPackage getModelblobPackage() {
		return (ModelblobPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelblobPackage getPackage() {
		return ModelblobPackage.eINSTANCE;
	}

} //ModelblobFactoryImpl
