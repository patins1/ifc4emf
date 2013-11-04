/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.rules.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.AlgorithmScope;
import org.ifc4emf.metamodel.express.core.CommonElement;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.LocalScope;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.SchemaElement;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.instances.AggregateValue;
import org.ifc4emf.metamodel.express.instances.ConcreteValue;
import org.ifc4emf.metamodel.express.instances.SETValue;
import org.ifc4emf.metamodel.express.rules.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
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
	protected RulesSwitch<Adapter> modelSwitch =
		new RulesSwitch<Adapter>() {
			@Override
			public Adapter caseONEOFConstraint(ONEOFConstraint object) {
				return createONEOFConstraintAdapter();
			}
			@Override
			public Adapter caseSupertypeRule(SupertypeRule object) {
				return createSupertypeRuleAdapter();
			}
			@Override
			public Adapter caseSubtypeConstraint(SubtypeConstraint object) {
				return createSubtypeConstraintAdapter();
			}
			@Override
			public Adapter caseExtent(Extent object) {
				return createExtentAdapter();
			}
			@Override
			public Adapter caseTOTAL_OVERConstraint(TOTAL_OVERConstraint object) {
				return createTOTAL_OVERConstraintAdapter();
			}
			@Override
			public Adapter caseANDConstraint(ANDConstraint object) {
				return createANDConstraintAdapter();
			}
			@Override
			public Adapter caseGlobalRule(GlobalRule object) {
				return createGlobalRuleAdapter();
			}
			@Override
			public Adapter caseNamedRule(NamedRule object) {
				return createNamedRuleAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseSchemaElement(SchemaElement object) {
				return createSchemaElementAdapter();
			}
			@Override
			public Adapter caseCommonElement(CommonElement object) {
				return createCommonElementAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseConcreteValue(ConcreteValue object) {
				return createConcreteValueAdapter();
			}
			@Override
			public Adapter caseAggregateValue(AggregateValue object) {
				return createAggregateValueAdapter();
			}
			@Override
			public Adapter caseSETValue(SETValue object) {
				return createSETValueAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter caseLocalScope(LocalScope object) {
				return createLocalScopeAdapter();
			}
			@Override
			public Adapter caseAlgorithmScope(AlgorithmScope object) {
				return createAlgorithmScopeAdapter();
			}
			@Override
			public Adapter caseLocalElement(LocalElement object) {
				return createLocalElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.rules.ONEOFConstraint <em>ONEOF Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.rules.ONEOFConstraint
	 * @generated
	 */
	public Adapter createONEOFConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.rules.SupertypeRule <em>Supertype Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.rules.SupertypeRule
	 * @generated
	 */
	public Adapter createSupertypeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint <em>Subtype Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.rules.SubtypeConstraint
	 * @generated
	 */
	public Adapter createSubtypeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.rules.Extent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.rules.Extent
	 * @generated
	 */
	public Adapter createExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.rules.TOTAL_OVERConstraint <em>TOTAL OVER Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.rules.TOTAL_OVERConstraint
	 * @generated
	 */
	public Adapter createTOTAL_OVERConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.rules.ANDConstraint <em>AND Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.rules.ANDConstraint
	 * @generated
	 */
	public Adapter createANDConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.rules.GlobalRule <em>Global Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.rules.GlobalRule
	 * @generated
	 */
	public Adapter createGlobalRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.rules.NamedRule <em>Named Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.rules.NamedRule
	 * @generated
	 */
	public Adapter createNamedRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.SchemaElement <em>Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.SchemaElement
	 * @generated
	 */
	public Adapter createSchemaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.CommonElement <em>Common Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.CommonElement
	 * @generated
	 */
	public Adapter createCommonElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.ConcreteValue <em>Concrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.ConcreteValue
	 * @generated
	 */
	public Adapter createConcreteValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.AggregateValue <em>Aggregate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.AggregateValue
	 * @generated
	 */
	public Adapter createAggregateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.SETValue <em>SET Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.SETValue
	 * @generated
	 */
	public Adapter createSETValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.LocalScope <em>Local Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.LocalScope
	 * @generated
	 */
	public Adapter createLocalScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.AlgorithmScope <em>Algorithm Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.AlgorithmScope
	 * @generated
	 */
	public Adapter createAlgorithmScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.LocalElement <em>Local Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.LocalElement
	 * @generated
	 */
	public Adapter createLocalElementAdapter() {
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

} //RulesAdapterFactory
