/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.ifc4emf.metamodel.express.core.*;

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
 * @see org.ifc4emf.metamodel.express.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
			case CorePackage.TYPE_ELEMENT: {
				TypeElement typeElement = (TypeElement)theEObject;
				T result = caseTypeElement(typeElement);
				if (result == null) result = caseNamedElement(typeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SINGLE_ENTITY_TYPE: {
				SingleEntityType singleEntityType = (SingleEntityType)theEObject;
				T result = caseSingleEntityType(singleEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.AGGREGATE_TYPE: {
				AGGREGATEType aggregateType = (AGGREGATEType)theEObject;
				T result = caseAGGREGATEType(aggregateType);
				if (result == null) result = caseGeneralizedType(aggregateType);
				if (result == null) result = caseParameterType(aggregateType);
				if (result == null) result = caseAttributeType(aggregateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERAL_BAG_TYPE: {
				GeneralBAGType generalBAGType = (GeneralBAGType)theEObject;
				T result = caseGeneralBAGType(generalBAGType);
				if (result == null) result = caseGeneralAggregationType(generalBAGType);
				if (result == null) result = caseGeneralizedType(generalBAGType);
				if (result == null) result = caseAggregationType(generalBAGType);
				if (result == null) result = caseParameterType(generalBAGType);
				if (result == null) result = caseAttributeType(generalBAGType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOMAIN_RULE: {
				DomainRule domainRule = (DomainRule)theEObject;
				T result = caseDomainRule(domainRule);
				if (result == null) result = caseDomainConstraint(domainRule);
				if (result == null) result = caseTypeElement(domainRule);
				if (result == null) result = caseNamedElement(domainRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERAL_AGGREGATION_TYPE: {
				GeneralAggregationType generalAggregationType = (GeneralAggregationType)theEObject;
				T result = caseGeneralAggregationType(generalAggregationType);
				if (result == null) result = caseGeneralizedType(generalAggregationType);
				if (result == null) result = caseAggregationType(generalAggregationType);
				if (result == null) result = caseParameterType(generalAggregationType);
				if (result == null) result = caseAttributeType(generalAggregationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONCRETE_TYPE: {
				ConcreteType concreteType = (ConcreteType)theEObject;
				T result = caseConcreteType(concreteType);
				if (result == null) result = caseInstantiableType(concreteType);
				if (result == null) result = caseParameterType(concreteType);
				if (result == null) result = caseVariableType(concreteType);
				if (result == null) result = caseDataType(concreteType);
				if (result == null) result = caseAttributeType(concreteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INVERSE_ATTRIBUTE: {
				InverseAttribute inverseAttribute = (InverseAttribute)theEObject;
				T result = caseInverseAttribute(inverseAttribute);
				if (result == null) result = caseAttribute(inverseAttribute);
				if (result == null) result = caseTypeElement(inverseAttribute);
				if (result == null) result = caseNamedElement(inverseAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENUMERATION_TYPE: {
				EnumerationType enumerationType = (EnumerationType)theEObject;
				T result = caseEnumerationType(enumerationType);
				if (result == null) result = caseDefinedType(enumerationType);
				if (result == null) result = caseNamedType(enumerationType);
				if (result == null) result = caseConcreteType(enumerationType);
				if (result == null) result = caseInstantiableType(enumerationType);
				if (result == null) result = caseScope(enumerationType);
				if (result == null) result = caseCommonElement(enumerationType);
				if (result == null) result = caseParameterType(enumerationType);
				if (result == null) result = caseVariableType(enumerationType);
				if (result == null) result = caseSchemaElement(enumerationType);
				if (result == null) result = caseDataType(enumerationType);
				if (result == null) result = caseAttributeType(enumerationType);
				if (result == null) result = caseNamedElement(enumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VARIABLE_TYPE: {
				VariableType variableType = (VariableType)theEObject;
				T result = caseVariableType(variableType);
				if (result == null) result = caseDataType(variableType);
				if (result == null) result = caseAttributeType(variableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ARRAY_BOUND: {
				ArrayBound arrayBound = (ArrayBound)theEObject;
				T result = caseArrayBound(arrayBound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERAL_SET_TYPE: {
				GeneralSETType generalSETType = (GeneralSETType)theEObject;
				T result = caseGeneralSETType(generalSETType);
				if (result == null) result = caseGeneralAggregationType(generalSETType);
				if (result == null) result = caseGeneralizedType(generalSETType);
				if (result == null) result = caseAggregationType(generalSETType);
				if (result == null) result = caseParameterType(generalSETType);
				if (result == null) result = caseAttributeType(generalSETType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LIST_TYPE: {
				LISTType listType = (LISTType)theEObject;
				T result = caseLISTType(listType);
				if (result == null) result = caseConcreteAggregationType(listType);
				if (result == null) result = caseAnonymousType(listType);
				if (result == null) result = caseAggregationType(listType);
				if (result == null) result = caseConcreteType(listType);
				if (result == null) result = caseInstantiableType(listType);
				if (result == null) result = caseParameterType(listType);
				if (result == null) result = caseVariableType(listType);
				if (result == null) result = caseDataType(listType);
				if (result == null) result = caseAttributeType(listType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REDECLARATION: {
				Redeclaration redeclaration = (Redeclaration)theEObject;
				T result = caseRedeclaration(redeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENTITY_TYPE: {
				EntityType entityType = (EntityType)theEObject;
				T result = caseEntityType(entityType);
				if (result == null) result = caseNamedType(entityType);
				if (result == null) result = caseInstantiableType(entityType);
				if (result == null) result = caseScope(entityType);
				if (result == null) result = caseCommonElement(entityType);
				if (result == null) result = caseParameterType(entityType);
				if (result == null) result = caseVariableType(entityType);
				if (result == null) result = caseSchemaElement(entityType);
				if (result == null) result = caseDataType(entityType);
				if (result == null) result = caseAttributeType(entityType);
				if (result == null) result = caseNamedElement(entityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARTIAL_ENTITY_TYPE: {
				PartialEntityType partialEntityType = (PartialEntityType)theEObject;
				T result = casePartialEntityType(partialEntityType);
				if (result == null) result = caseDataType(partialEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = caseScope(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INVERTIBLE_ATTRIBUTE: {
				InvertibleAttribute invertibleAttribute = (InvertibleAttribute)theEObject;
				T result = caseInvertibleAttribute(invertibleAttribute);
				if (result == null) result = caseExplicitAttribute(invertibleAttribute);
				if (result == null) result = caseAttribute(invertibleAttribute);
				if (result == null) result = caseTypeElement(invertibleAttribute);
				if (result == null) result = caseNamedElement(invertibleAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERALIZED_TYPE: {
				GeneralizedType generalizedType = (GeneralizedType)theEObject;
				T result = caseGeneralizedType(generalizedType);
				if (result == null) result = caseParameterType(generalizedType);
				if (result == null) result = caseAttributeType(generalizedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERFACED_ELEMENT: {
				InterfacedElement interfacedElement = (InterfacedElement)theEObject;
				T result = caseInterfacedElement(interfacedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NUMERIC_TYPE: {
				NumericType numericType = (NumericType)theEObject;
				T result = caseNumericType(numericType);
				if (result == null) result = caseSimpleType(numericType);
				if (result == null) result = caseAnonymousType(numericType);
				if (result == null) result = caseConcreteType(numericType);
				if (result == null) result = caseInstantiableType(numericType);
				if (result == null) result = caseParameterType(numericType);
				if (result == null) result = caseVariableType(numericType);
				if (result == null) result = caseDataType(numericType);
				if (result == null) result = caseAttributeType(numericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFINED_TYPE: {
				DefinedType definedType = (DefinedType)theEObject;
				T result = caseDefinedType(definedType);
				if (result == null) result = caseNamedType(definedType);
				if (result == null) result = caseConcreteType(definedType);
				if (result == null) result = caseInstantiableType(definedType);
				if (result == null) result = caseScope(definedType);
				if (result == null) result = caseCommonElement(definedType);
				if (result == null) result = caseParameterType(definedType);
				if (result == null) result = caseVariableType(definedType);
				if (result == null) result = caseSchemaElement(definedType);
				if (result == null) result = caseDataType(definedType);
				if (result == null) result = caseAttributeType(definedType);
				if (result == null) result = caseNamedElement(definedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNIQUE_RULE: {
				UniqueRule uniqueRule = (UniqueRule)theEObject;
				T result = caseUniqueRule(uniqueRule);
				if (result == null) result = caseTypeElement(uniqueRule);
				if (result == null) result = caseNamedElement(uniqueRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOMAIN_ROLE: {
				DomainRole domainRole = (DomainRole)theEObject;
				T result = caseDomainRole(domainRole);
				if (result == null) result = caseRole(domainRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOMAIN_CONSTRAINT: {
				DomainConstraint domainConstraint = (DomainConstraint)theEObject;
				T result = caseDomainConstraint(domainConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INSTANTIABLE_TYPE: {
				InstantiableType instantiableType = (InstantiableType)theEObject;
				T result = caseInstantiableType(instantiableType);
				if (result == null) result = caseParameterType(instantiableType);
				if (result == null) result = caseVariableType(instantiableType);
				if (result == null) result = caseDataType(instantiableType);
				if (result == null) result = caseAttributeType(instantiableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERAL_LIST_TYPE: {
				GeneralLISTType generalLISTType = (GeneralLISTType)theEObject;
				T result = caseGeneralLISTType(generalLISTType);
				if (result == null) result = caseGeneralAggregationType(generalLISTType);
				if (result == null) result = caseGeneralizedType(generalLISTType);
				if (result == null) result = caseAggregationType(generalLISTType);
				if (result == null) result = caseParameterType(generalLISTType);
				if (result == null) result = caseAttributeType(generalLISTType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseTypeElement(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BAG_TYPE: {
				BAGType bagType = (BAGType)theEObject;
				T result = caseBAGType(bagType);
				if (result == null) result = caseConcreteAggregationType(bagType);
				if (result == null) result = caseAnonymousType(bagType);
				if (result == null) result = caseAggregationType(bagType);
				if (result == null) result = caseConcreteType(bagType);
				if (result == null) result = caseInstantiableType(bagType);
				if (result == null) result = caseParameterType(bagType);
				if (result == null) result = caseVariableType(bagType);
				if (result == null) result = caseDataType(bagType);
				if (result == null) result = caseAttributeType(bagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REAL_TYPE: {
				RealType realType = (RealType)theEObject;
				T result = caseRealType(realType);
				if (result == null) result = caseNumericType(realType);
				if (result == null) result = caseSimpleType(realType);
				if (result == null) result = caseAnonymousType(realType);
				if (result == null) result = caseConcreteType(realType);
				if (result == null) result = caseInstantiableType(realType);
				if (result == null) result = caseParameterType(realType);
				if (result == null) result = caseVariableType(realType);
				if (result == null) result = caseDataType(realType);
				if (result == null) result = caseAttributeType(realType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LOGIC_TYPE: {
				LogicType logicType = (LogicType)theEObject;
				T result = caseLogicType(logicType);
				if (result == null) result = caseSimpleType(logicType);
				if (result == null) result = caseAnonymousType(logicType);
				if (result == null) result = caseConcreteType(logicType);
				if (result == null) result = caseInstantiableType(logicType);
				if (result == null) result = caseParameterType(logicType);
				if (result == null) result = caseVariableType(logicType);
				if (result == null) result = caseDataType(logicType);
				if (result == null) result = caseAttributeType(logicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERIC_TYPE: {
				GenericType genericType = (GenericType)theEObject;
				T result = caseGenericType(genericType);
				if (result == null) result = caseGeneralizedType(genericType);
				if (result == null) result = caseParameterType(genericType);
				if (result == null) result = caseAttributeType(genericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = caseSimpleType(stringType);
				if (result == null) result = caseAnonymousType(stringType);
				if (result == null) result = caseConcreteType(stringType);
				if (result == null) result = caseInstantiableType(stringType);
				if (result == null) result = caseParameterType(stringType);
				if (result == null) result = caseVariableType(stringType);
				if (result == null) result = caseDataType(stringType);
				if (result == null) result = caseAttributeType(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ANONYMOUS_TYPE: {
				AnonymousType anonymousType = (AnonymousType)theEObject;
				T result = caseAnonymousType(anonymousType);
				if (result == null) result = caseConcreteType(anonymousType);
				if (result == null) result = caseInstantiableType(anonymousType);
				if (result == null) result = caseParameterType(anonymousType);
				if (result == null) result = caseVariableType(anonymousType);
				if (result == null) result = caseDataType(anonymousType);
				if (result == null) result = caseAttributeType(anonymousType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ALGORITHM_SCOPE: {
				AlgorithmScope algorithmScope = (AlgorithmScope)theEObject;
				T result = caseAlgorithmScope(algorithmScope);
				if (result == null) result = caseLocalScope(algorithmScope);
				if (result == null) result = caseScope(algorithmScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ATTRIBUTE_TYPE: {
				AttributeType attributeType = (AttributeType)theEObject;
				T result = caseAttributeType(attributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DERIVED_ATTRIBUTE: {
				DerivedAttribute derivedAttribute = (DerivedAttribute)theEObject;
				T result = caseDerivedAttribute(derivedAttribute);
				if (result == null) result = caseAttribute(derivedAttribute);
				if (result == null) result = caseTypeElement(derivedAttribute);
				if (result == null) result = caseNamedElement(derivedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RANGE_ROLE: {
				RangeRole rangeRole = (RangeRole)theEObject;
				T result = caseRangeRole(rangeRole);
				if (result == null) result = caseRole(rangeRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LOCAL_ELEMENT: {
				LocalElement localElement = (LocalElement)theEObject;
				T result = caseLocalElement(localElement);
				if (result == null) result = caseNamedElement(localElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REMARK: {
				Remark remark = (Remark)theEObject;
				T result = caseRemark(remark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SIZE_CONSTRAINT: {
				SizeConstraint sizeConstraint = (SizeConstraint)theEObject;
				T result = caseSizeConstraint(sizeConstraint);
				if (result == null) result = caseDomainConstraint(sizeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SET_TYPE: {
				SETType setType = (SETType)theEObject;
				T result = caseSETType(setType);
				if (result == null) result = caseConcreteAggregationType(setType);
				if (result == null) result = caseAnonymousType(setType);
				if (result == null) result = caseAggregationType(setType);
				if (result == null) result = caseConcreteType(setType);
				if (result == null) result = caseInstantiableType(setType);
				if (result == null) result = caseParameterType(setType);
				if (result == null) result = caseVariableType(setType);
				if (result == null) result = caseDataType(setType);
				if (result == null) result = caseAttributeType(setType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SPECIALIZED_TYPE: {
				SpecializedType specializedType = (SpecializedType)theEObject;
				T result = caseSpecializedType(specializedType);
				if (result == null) result = caseDefinedType(specializedType);
				if (result == null) result = caseNamedType(specializedType);
				if (result == null) result = caseConcreteType(specializedType);
				if (result == null) result = caseInstantiableType(specializedType);
				if (result == null) result = caseScope(specializedType);
				if (result == null) result = caseCommonElement(specializedType);
				if (result == null) result = caseParameterType(specializedType);
				if (result == null) result = caseVariableType(specializedType);
				if (result == null) result = caseSchemaElement(specializedType);
				if (result == null) result = caseDataType(specializedType);
				if (result == null) result = caseAttributeType(specializedType);
				if (result == null) result = caseNamedElement(specializedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERAL_ARRAY_TYPE: {
				GeneralARRAYType generalARRAYType = (GeneralARRAYType)theEObject;
				T result = caseGeneralARRAYType(generalARRAYType);
				if (result == null) result = caseGeneralAggregationType(generalARRAYType);
				if (result == null) result = caseGeneralizedType(generalARRAYType);
				if (result == null) result = caseAggregationType(generalARRAYType);
				if (result == null) result = caseParameterType(generalARRAYType);
				if (result == null) result = caseAttributeType(generalARRAYType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LENGTH_CONSTRAINT: {
				LengthConstraint lengthConstraint = (LengthConstraint)theEObject;
				T result = caseLengthConstraint(lengthConstraint);
				if (result == null) result = caseDomainConstraint(lengthConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LOCAL_SCOPE: {
				LocalScope localScope = (LocalScope)theEObject;
				T result = caseLocalScope(localScope);
				if (result == null) result = caseScope(localScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAMED_TYPE: {
				NamedType namedType = (NamedType)theEObject;
				T result = caseNamedType(namedType);
				if (result == null) result = caseInstantiableType(namedType);
				if (result == null) result = caseScope(namedType);
				if (result == null) result = caseCommonElement(namedType);
				if (result == null) result = caseParameterType(namedType);
				if (result == null) result = caseVariableType(namedType);
				if (result == null) result = caseSchemaElement(namedType);
				if (result == null) result = caseDataType(namedType);
				if (result == null) result = caseAttributeType(namedType);
				if (result == null) result = caseNamedElement(namedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BINARY_TYPE: {
				BinaryType binaryType = (BinaryType)theEObject;
				T result = caseBinaryType(binaryType);
				if (result == null) result = caseSimpleType(binaryType);
				if (result == null) result = caseAnonymousType(binaryType);
				if (result == null) result = caseConcreteType(binaryType);
				if (result == null) result = caseInstantiableType(binaryType);
				if (result == null) result = caseParameterType(binaryType);
				if (result == null) result = caseVariableType(binaryType);
				if (result == null) result = caseDataType(binaryType);
				if (result == null) result = caseAttributeType(binaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SCOPED_ID: {
				ScopedId scopedId = (ScopedId)theEObject;
				T result = caseScopedId(scopedId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.AGGREGATION_TYPE: {
				AggregationType aggregationType = (AggregationType)theEObject;
				T result = caseAggregationType(aggregationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SCOPE: {
				Scope scope = (Scope)theEObject;
				T result = caseScope(scope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SELECT_TYPE: {
				SelectType selectType = (SelectType)theEObject;
				T result = caseSelectType(selectType);
				if (result == null) result = caseDefinedType(selectType);
				if (result == null) result = caseNamedType(selectType);
				if (result == null) result = caseConcreteType(selectType);
				if (result == null) result = caseInstantiableType(selectType);
				if (result == null) result = caseScope(selectType);
				if (result == null) result = caseCommonElement(selectType);
				if (result == null) result = caseParameterType(selectType);
				if (result == null) result = caseVariableType(selectType);
				if (result == null) result = caseSchemaElement(selectType);
				if (result == null) result = caseDataType(selectType);
				if (result == null) result = caseAttributeType(selectType);
				if (result == null) result = caseNamedElement(selectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ACTUAL_TYPE: {
				ActualType actualType = (ActualType)theEObject;
				T result = caseActualType(actualType);
				if (result == null) result = caseVariableType(actualType);
				if (result == null) result = caseDataType(actualType);
				if (result == null) result = caseAttributeType(actualType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXPLICIT_ATTRIBUTE: {
				ExplicitAttribute explicitAttribute = (ExplicitAttribute)theEObject;
				T result = caseExplicitAttribute(explicitAttribute);
				if (result == null) result = caseAttribute(explicitAttribute);
				if (result == null) result = caseTypeElement(explicitAttribute);
				if (result == null) result = caseNamedElement(explicitAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SIMPLE_TYPE: {
				SimpleType simpleType = (SimpleType)theEObject;
				T result = caseSimpleType(simpleType);
				if (result == null) result = caseAnonymousType(simpleType);
				if (result == null) result = caseConcreteType(simpleType);
				if (result == null) result = caseInstantiableType(simpleType);
				if (result == null) result = caseParameterType(simpleType);
				if (result == null) result = caseVariableType(simpleType);
				if (result == null) result = caseDataType(simpleType);
				if (result == null) result = caseAttributeType(simpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.COMMON_ELEMENT: {
				CommonElement commonElement = (CommonElement)theEObject;
				T result = caseCommonElement(commonElement);
				if (result == null) result = caseSchemaElement(commonElement);
				if (result == null) result = caseNamedElement(commonElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SCHEMA_ELEMENT: {
				SchemaElement schemaElement = (SchemaElement)theEObject;
				T result = caseSchemaElement(schemaElement);
				if (result == null) result = caseNamedElement(schemaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONCRETE_AGGREGATION_TYPE: {
				ConcreteAggregationType concreteAggregationType = (ConcreteAggregationType)theEObject;
				T result = caseConcreteAggregationType(concreteAggregationType);
				if (result == null) result = caseAnonymousType(concreteAggregationType);
				if (result == null) result = caseAggregationType(concreteAggregationType);
				if (result == null) result = caseConcreteType(concreteAggregationType);
				if (result == null) result = caseInstantiableType(concreteAggregationType);
				if (result == null) result = caseParameterType(concreteAggregationType);
				if (result == null) result = caseVariableType(concreteAggregationType);
				if (result == null) result = caseDataType(concreteAggregationType);
				if (result == null) result = caseAttributeType(concreteAggregationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ARRAY_TYPE: {
				ARRAYType arrayType = (ARRAYType)theEObject;
				T result = caseARRAYType(arrayType);
				if (result == null) result = caseConcreteAggregationType(arrayType);
				if (result == null) result = caseAnonymousType(arrayType);
				if (result == null) result = caseAggregationType(arrayType);
				if (result == null) result = caseConcreteType(arrayType);
				if (result == null) result = caseInstantiableType(arrayType);
				if (result == null) result = caseParameterType(arrayType);
				if (result == null) result = caseVariableType(arrayType);
				if (result == null) result = caseDataType(arrayType);
				if (result == null) result = caseAttributeType(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Single Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleEntityType(SingleEntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AGGREGATE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AGGREGATE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAGGREGATEType(AGGREGATEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General BAG Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General BAG Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralBAGType(GeneralBAGType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainRule(DomainRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Aggregation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Aggregation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralAggregationType(GeneralAggregationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteType(ConcreteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverseAttribute(InverseAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationType(EnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType(VariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayBound(ArrayBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General SET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General SET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralSETType(GeneralSETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LIST Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LIST Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLISTType(LISTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redeclaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redeclaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedeclaration(Redeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityType(EntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialEntityType(PartialEntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invertible Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invertible Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvertibleAttribute(InvertibleAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizedType(GeneralizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interfaced Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interfaced Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfacedElement(InterfacedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericType(NumericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinedType(DefinedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueRule(UniqueRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainRole(DomainRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainConstraint(DomainConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantiable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantiable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantiableType(InstantiableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General LIST Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General LIST Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralLISTType(GeneralLISTType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAG Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAG Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAGType(BAGType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealType(RealType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicType(LogicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericType(GenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousType(AnonymousType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithmScope(AlgorithmScope object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeType(AttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedAttribute(DerivedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeRole(RangeRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalElement(LocalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemark(Remark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeConstraint(SizeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSETType(SETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecializedType(SpecializedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General ARRAY Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General ARRAY Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralARRAYType(GeneralARRAYType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthConstraint(LengthConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalScope(LocalScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedType(NamedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryType(BinaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopedId(ScopedId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationType(AggregationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectType(SelectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualType(ActualType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explicit Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explicit Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplicitAttribute(ExplicitAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleType(SimpleType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Aggregation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Aggregation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteAggregationType(ConcreteAggregationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARRAY Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARRAY Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARRAYType(ARRAYType object) {
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

} //CoreSwitch
