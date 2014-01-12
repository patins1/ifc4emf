/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.ifcheader.util;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.ifcheader.*;
import org.ifc4emf.metamodel.modelblob.BinaryTreeRoot;
import org.ifc4emf.metamodel.modelblob.ContainmentTreeNode;
import org.ifc4emf.metamodel.modelblob.ResumableModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.ifcheader.Part21Package
 * @generated
 */
public class Part21AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Part21Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part21AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Part21Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Part21Switch<Adapter> modelSwitch =
		new Part21Switch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseModelName(ModelName object) {
				return createModelNameAdapter();
			}
			@Override
			public Adapter caseModelDescription(ModelDescription object) {
				return createModelDescriptionAdapter();
			}
			@Override
			public Adapter caseModelSchema(ModelSchema object) {
				return createModelSchemaAdapter();
			}
			@Override
			public Adapter caseGuidToPart21Map(Map.Entry<String, Integer> object) {
				return createGuidToPart21MapAdapter();
			}
			@Override
			public Adapter caseGuidToPart21Container(GuidToPart21Container object) {
				return createGuidToPart21ContainerAdapter();
			}
			@Override
			public Adapter caseContainmentTreeNode(ContainmentTreeNode object) {
				return createContainmentTreeNodeAdapter();
			}
			@Override
			public Adapter caseResumableModel(ResumableModel object) {
				return createResumableModelAdapter();
			}
			@Override
			public Adapter caseBinaryTreeRoot(BinaryTreeRoot object) {
				return createBinaryTreeRootAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.ifcheader.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.ifcheader.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.ifcheader.ModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelName
	 * @generated
	 */
	public Adapter createModelNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.ifcheader.ModelDescription <em>Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelDescription
	 * @generated
	 */
	public Adapter createModelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.ifcheader.ModelSchema <em>Model Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.ifcheader.ModelSchema
	 * @generated
	 */
	public Adapter createModelSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Guid To Part21 Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createGuidToPart21MapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.ifcheader.GuidToPart21Container <em>Guid To Part21 Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.ifcheader.GuidToPart21Container
	 * @generated
	 */
	public Adapter createGuidToPart21ContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.modelblob.ContainmentTreeNode <em>Containment Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.modelblob.ContainmentTreeNode
	 * @generated
	 */
	public Adapter createContainmentTreeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.modelblob.ResumableModel <em>Resumable Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.modelblob.ResumableModel
	 * @generated
	 */
	public Adapter createResumableModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.modelblob.BinaryTreeRoot <em>Binary Tree Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.modelblob.BinaryTreeRoot
	 * @generated
	 */
	public Adapter createBinaryTreeRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Part21AdapterFactory
