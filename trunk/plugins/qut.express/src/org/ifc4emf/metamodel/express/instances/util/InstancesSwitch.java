/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.ifc4emf.metamodel.express.core.CommonElement;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.SchemaElement;
import org.ifc4emf.metamodel.express.core.TypeElement;
import org.ifc4emf.metamodel.express.instances.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage
 * @generated
 */
public class InstancesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstancesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesSwitch() {
		if (modelPackage == null) {
			modelPackage = InstancesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InstancesPackage.ATTRIBUTE_VALUE: {
				AttributeValue attributeValue = (AttributeValue)theEObject;
				T result = caseAttributeValue(attributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.ARRAY_VALUE: {
				ARRAYValue arrayValue = (ARRAYValue)theEObject;
				T result = caseARRAYValue(arrayValue);
				if (result == null) result = caseAggregateValue(arrayValue);
				if (result == null) result = caseConcreteValue(arrayValue);
				if (result == null) result = caseInstance(arrayValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.ROLE_NAME: {
				RoleName roleName = (RoleName)theEObject;
				T result = caseRoleName(roleName);
				if (result == null) result = caseStringValue(roleName);
				if (result == null) result = caseSimpleValue(roleName);
				if (result == null) result = caseConcreteValue(roleName);
				if (result == null) result = caseInstance(roleName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.ENTITY_INSTANCE: {
				EntityInstance entityInstance = (EntityInstance)theEObject;
				T result = caseEntityInstance(entityInstance);
				if (result == null) result = caseTypedInstance(entityInstance);
				if (result == null) result = caseInstance(entityInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.INTEGER_VALUE: {
				IntegerValue integerValue = (IntegerValue)theEObject;
				T result = caseIntegerValue(integerValue);
				if (result == null) result = caseRealValue(integerValue);
				if (result == null) result = caseNumberValue(integerValue);
				if (result == null) result = caseSimpleValue(integerValue);
				if (result == null) result = caseConcreteValue(integerValue);
				if (result == null) result = caseInstance(integerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.AGGREGATE_VALUE: {
				AggregateValue aggregateValue = (AggregateValue)theEObject;
				T result = caseAggregateValue(aggregateValue);
				if (result == null) result = caseConcreteValue(aggregateValue);
				if (result == null) result = caseInstance(aggregateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseCommonElement(constant);
				if (result == null) result = caseSchemaElement(constant);
				if (result == null) result = caseNamedElement(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.LOGICAL_VALUE: {
				LogicalValue logicalValue = (LogicalValue)theEObject;
				T result = caseLogicalValue(logicalValue);
				if (result == null) result = caseSimpleValue(logicalValue);
				if (result == null) result = caseConcreteValue(logicalValue);
				if (result == null) result = caseInstance(logicalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.TYPED_INSTANCE: {
				TypedInstance typedInstance = (TypedInstance)theEObject;
				T result = caseTypedInstance(typedInstance);
				if (result == null) result = caseInstance(typedInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.LIST_MEMBER: {
				ListMember listMember = (ListMember)theEObject;
				T result = caseListMember(listMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.BAG_MEMBER: {
				BagMember bagMember = (BagMember)theEObject;
				T result = caseBagMember(bagMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.SINGLE_ENTITY_VALUE: {
				SingleEntityValue singleEntityValue = (SingleEntityValue)theEObject;
				T result = caseSingleEntityValue(singleEntityValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.INDETERMINATE: {
				Indeterminate indeterminate = (Indeterminate)theEObject;
				T result = caseIndeterminate(indeterminate);
				if (result == null) result = caseInstance(indeterminate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.SINGLE_LEAF_INSTANCE: {
				SingleLeafInstance singleLeafInstance = (SingleLeafInstance)theEObject;
				T result = caseSingleLeafInstance(singleLeafInstance);
				if (result == null) result = caseEntityInstance(singleLeafInstance);
				if (result == null) result = caseTypedInstance(singleLeafInstance);
				if (result == null) result = caseInstance(singleLeafInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.GENERIC_AGGREGATE: {
				GenericAggregate genericAggregate = (GenericAggregate)theEObject;
				T result = caseGenericAggregate(genericAggregate);
				if (result == null) result = caseLISTValue(genericAggregate);
				if (result == null) result = caseAggregateValue(genericAggregate);
				if (result == null) result = caseConcreteValue(genericAggregate);
				if (result == null) result = caseInstance(genericAggregate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.BINARY_VALUE: {
				BinaryValue binaryValue = (BinaryValue)theEObject;
				T result = caseBinaryValue(binaryValue);
				if (result == null) result = caseSimpleValue(binaryValue);
				if (result == null) result = caseConcreteValue(binaryValue);
				if (result == null) result = caseInstance(binaryValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.SPECIALIZED_VALUE: {
				SpecializedValue specializedValue = (SpecializedValue)theEObject;
				T result = caseSpecializedValue(specializedValue);
				if (result == null) result = caseTypedInstance(specializedValue);
				if (result == null) result = caseInstance(specializedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.BAG_VALUE: {
				BAGValue bagValue = (BAGValue)theEObject;
				T result = caseBAGValue(bagValue);
				if (result == null) result = caseAggregateValue(bagValue);
				if (result == null) result = caseConcreteValue(bagValue);
				if (result == null) result = caseInstance(bagValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.ENUMERATION_ITEM: {
				EnumerationItem enumerationItem = (EnumerationItem)theEObject;
				T result = caseEnumerationItem(enumerationItem);
				if (result == null) result = caseTypeElement(enumerationItem);
				if (result == null) result = caseTypedInstance(enumerationItem);
				if (result == null) result = caseConcreteValue(enumerationItem);
				if (result == null) result = caseNamedElement(enumerationItem);
				if (result == null) result = caseInstance(enumerationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.ENTITY_VALUE: {
				EntityValue entityValue = (EntityValue)theEObject;
				T result = caseEntityValue(entityValue);
				if (result == null) result = casePartialEntityValue(entityValue);
				if (result == null) result = caseInstance(entityValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.SET_VALUE: {
				SETValue setValue = (SETValue)theEObject;
				T result = caseSETValue(setValue);
				if (result == null) result = caseAggregateValue(setValue);
				if (result == null) result = caseConcreteValue(setValue);
				if (result == null) result = caseInstance(setValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.ARRAY_MEMBER: {
				ArrayMember arrayMember = (ArrayMember)theEObject;
				T result = caseArrayMember(arrayMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.POPULATION: {
				Population population = (Population)theEObject;
				T result = casePopulation(population);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.REAL_VALUE: {
				RealValue realValue = (RealValue)theEObject;
				T result = caseRealValue(realValue);
				if (result == null) result = caseNumberValue(realValue);
				if (result == null) result = caseSimpleValue(realValue);
				if (result == null) result = caseConcreteValue(realValue);
				if (result == null) result = caseInstance(realValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseLogicalValue(booleanValue);
				if (result == null) result = caseSimpleValue(booleanValue);
				if (result == null) result = caseConcreteValue(booleanValue);
				if (result == null) result = caseInstance(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.LIST_VALUE: {
				LISTValue listValue = (LISTValue)theEObject;
				T result = caseLISTValue(listValue);
				if (result == null) result = caseAggregateValue(listValue);
				if (result == null) result = caseConcreteValue(listValue);
				if (result == null) result = caseInstance(listValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseSimpleValue(stringValue);
				if (result == null) result = caseConcreteValue(stringValue);
				if (result == null) result = caseInstance(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.TYPE_NAME: {
				TypeName typeName = (TypeName)theEObject;
				T result = caseTypeName(typeName);
				if (result == null) result = caseStringValue(typeName);
				if (result == null) result = caseSimpleValue(typeName);
				if (result == null) result = caseConcreteValue(typeName);
				if (result == null) result = caseInstance(typeName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.PARTIAL_ENTITY_VALUE: {
				PartialEntityValue partialEntityValue = (PartialEntityValue)theEObject;
				T result = casePartialEntityValue(partialEntityValue);
				if (result == null) result = caseInstance(partialEntityValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.NUMBER_VALUE: {
				NumberValue numberValue = (NumberValue)theEObject;
				T result = caseNumberValue(numberValue);
				if (result == null) result = caseSimpleValue(numberValue);
				if (result == null) result = caseConcreteValue(numberValue);
				if (result == null) result = caseInstance(numberValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.MULTI_LEAF_INSTANCE: {
				MultiLeafInstance multiLeafInstance = (MultiLeafInstance)theEObject;
				T result = caseMultiLeafInstance(multiLeafInstance);
				if (result == null) result = caseEntityInstance(multiLeafInstance);
				if (result == null) result = caseTypedInstance(multiLeafInstance);
				if (result == null) result = caseInstance(multiLeafInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.SIMPLE_VALUE: {
				SimpleValue simpleValue = (SimpleValue)theEObject;
				T result = caseSimpleValue(simpleValue);
				if (result == null) result = caseConcreteValue(simpleValue);
				if (result == null) result = caseInstance(simpleValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.CONCRETE_VALUE: {
				ConcreteValue concreteValue = (ConcreteValue)theEObject;
				T result = caseConcreteValue(concreteValue);
				if (result == null) result = caseInstance(concreteValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValue(AttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARRAY Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARRAY Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARRAYValue(ARRAYValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleName(RoleName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityInstance(EntityInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateValue(AggregateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalValue(LogicalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedInstance(TypedInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListMember(ListMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagMember(BagMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Entity Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Entity Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleEntityValue(SingleEntityValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indeterminate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indeterminate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndeterminate(Indeterminate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Leaf Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Leaf Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleLeafInstance(SingleLeafInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Aggregate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericAggregate(GenericAggregate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryValue(BinaryValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialized Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialized Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecializedValue(SpecializedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAG Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAG Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAGValue(BAGValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationItem(EnumerationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityValue(EntityValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SET Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SET Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSETValue(SETValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayMember(ArrayMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopulation(Population object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealValue(RealValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LIST Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LIST Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLISTValue(LISTValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeName(TypeName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Entity Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Entity Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialEntityValue(PartialEntityValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberValue(NumberValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Leaf Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Leaf Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiLeafInstance(MultiLeafInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleValue(SimpleValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteValue(ConcreteValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaElement(SchemaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonElement(CommonElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeElement(TypeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InstancesSwitch
