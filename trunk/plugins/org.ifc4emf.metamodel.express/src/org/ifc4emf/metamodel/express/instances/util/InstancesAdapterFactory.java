/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.CommonElement;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.SchemaElement;
import org.ifc4emf.metamodel.express.core.TypeElement;
import org.ifc4emf.metamodel.express.instances.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage
 * @generated
 */
public class InstancesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstancesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InstancesPackage.eINSTANCE;
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
	protected InstancesSwitch<Adapter> modelSwitch =
		new InstancesSwitch<Adapter>() {
			@Override
			public Adapter caseAttributeValue(AttributeValue object) {
				return createAttributeValueAdapter();
			}
			@Override
			public Adapter caseARRAYValue(ARRAYValue object) {
				return createARRAYValueAdapter();
			}
			@Override
			public Adapter caseRoleName(RoleName object) {
				return createRoleNameAdapter();
			}
			@Override
			public Adapter caseEntityInstance(EntityInstance object) {
				return createEntityInstanceAdapter();
			}
			@Override
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
			}
			@Override
			public Adapter caseAggregateValue(AggregateValue object) {
				return createAggregateValueAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseLogicalValue(LogicalValue object) {
				return createLogicalValueAdapter();
			}
			@Override
			public Adapter caseTypedInstance(TypedInstance object) {
				return createTypedInstanceAdapter();
			}
			@Override
			public Adapter caseListMember(ListMember object) {
				return createListMemberAdapter();
			}
			@Override
			public Adapter caseBagMember(BagMember object) {
				return createBagMemberAdapter();
			}
			@Override
			public Adapter caseSingleEntityValue(SingleEntityValue object) {
				return createSingleEntityValueAdapter();
			}
			@Override
			public Adapter caseIndeterminate(Indeterminate object) {
				return createIndeterminateAdapter();
			}
			@Override
			public Adapter caseSingleLeafInstance(SingleLeafInstance object) {
				return createSingleLeafInstanceAdapter();
			}
			@Override
			public Adapter caseGenericAggregate(GenericAggregate object) {
				return createGenericAggregateAdapter();
			}
			@Override
			public Adapter caseBinaryValue(BinaryValue object) {
				return createBinaryValueAdapter();
			}
			@Override
			public Adapter caseSpecializedValue(SpecializedValue object) {
				return createSpecializedValueAdapter();
			}
			@Override
			public Adapter caseBAGValue(BAGValue object) {
				return createBAGValueAdapter();
			}
			@Override
			public Adapter caseEnumerationItem(EnumerationItem object) {
				return createEnumerationItemAdapter();
			}
			@Override
			public Adapter caseEntityValue(EntityValue object) {
				return createEntityValueAdapter();
			}
			@Override
			public Adapter caseSETValue(SETValue object) {
				return createSETValueAdapter();
			}
			@Override
			public Adapter caseArrayMember(ArrayMember object) {
				return createArrayMemberAdapter();
			}
			@Override
			public Adapter casePopulation(Population object) {
				return createPopulationAdapter();
			}
			@Override
			public Adapter caseRealValue(RealValue object) {
				return createRealValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseLISTValue(LISTValue object) {
				return createLISTValueAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseTypeName(TypeName object) {
				return createTypeNameAdapter();
			}
			@Override
			public Adapter casePartialEntityValue(PartialEntityValue object) {
				return createPartialEntityValueAdapter();
			}
			@Override
			public Adapter caseNumberValue(NumberValue object) {
				return createNumberValueAdapter();
			}
			@Override
			public Adapter caseMultiLeafInstance(MultiLeafInstance object) {
				return createMultiLeafInstanceAdapter();
			}
			@Override
			public Adapter caseSimpleValue(SimpleValue object) {
				return createSimpleValueAdapter();
			}
			@Override
			public Adapter caseConcreteValue(ConcreteValue object) {
				return createConcreteValueAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
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
			public Adapter caseTypeElement(TypeElement object) {
				return createTypeElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.AttributeValue
	 * @generated
	 */
	public Adapter createAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.ARRAYValue <em>ARRAY Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.ARRAYValue
	 * @generated
	 */
	public Adapter createARRAYValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.RoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.RoleName
	 * @generated
	 */
	public Adapter createRoleNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.EntityInstance <em>Entity Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.EntityInstance
	 * @generated
	 */
	public Adapter createEntityInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.LogicalValue <em>Logical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.LogicalValue
	 * @generated
	 */
	public Adapter createLogicalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.TypedInstance <em>Typed Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.TypedInstance
	 * @generated
	 */
	public Adapter createTypedInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.ListMember <em>List Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.ListMember
	 * @generated
	 */
	public Adapter createListMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.BagMember <em>Bag Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.BagMember
	 * @generated
	 */
	public Adapter createBagMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.SingleEntityValue <em>Single Entity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.SingleEntityValue
	 * @generated
	 */
	public Adapter createSingleEntityValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.Indeterminate <em>Indeterminate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.Indeterminate
	 * @generated
	 */
	public Adapter createIndeterminateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.SingleLeafInstance <em>Single Leaf Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.SingleLeafInstance
	 * @generated
	 */
	public Adapter createSingleLeafInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.GenericAggregate <em>Generic Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.GenericAggregate
	 * @generated
	 */
	public Adapter createGenericAggregateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.BinaryValue <em>Binary Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.BinaryValue
	 * @generated
	 */
	public Adapter createBinaryValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.SpecializedValue <em>Specialized Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.SpecializedValue
	 * @generated
	 */
	public Adapter createSpecializedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.BAGValue <em>BAG Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.BAGValue
	 * @generated
	 */
	public Adapter createBAGValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.EnumerationItem <em>Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.EnumerationItem
	 * @generated
	 */
	public Adapter createEnumerationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.EntityValue <em>Entity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.EntityValue
	 * @generated
	 */
	public Adapter createEntityValueAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.ArrayMember <em>Array Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.ArrayMember
	 * @generated
	 */
	public Adapter createArrayMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.Population
	 * @generated
	 */
	public Adapter createPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.RealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.RealValue
	 * @generated
	 */
	public Adapter createRealValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.LISTValue <em>LIST Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.LISTValue
	 * @generated
	 */
	public Adapter createLISTValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.TypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.TypeName
	 * @generated
	 */
	public Adapter createTypeNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.PartialEntityValue <em>Partial Entity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.PartialEntityValue
	 * @generated
	 */
	public Adapter createPartialEntityValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.NumberValue
	 * @generated
	 */
	public Adapter createNumberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.MultiLeafInstance <em>Multi Leaf Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.MultiLeafInstance
	 * @generated
	 */
	public Adapter createMultiLeafInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.instances.SimpleValue <em>Simple Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.instances.SimpleValue
	 * @generated
	 */
	public Adapter createSimpleValueAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.express.core.TypeElement <em>Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.express.core.TypeElement
	 * @generated
	 */
	public Adapter createTypeElementAdapter() {
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

} //InstancesAdapterFactory
