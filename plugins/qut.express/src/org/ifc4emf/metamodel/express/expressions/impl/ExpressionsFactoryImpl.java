/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ifc4emf.metamodel.express.expressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionsFactory init() {
		try {
			ExpressionsFactory theExpressionsFactory = (ExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionsPackage.eNS_URI);
			if (theExpressionsFactory != null) {
				return theExpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactoryImpl() {
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
			case ExpressionsPackage.REPEAT_COUNT: return createRepeatCount();
			case ExpressionsPackage.ENUM_ITEM_REF: return createEnumItemRef();
			case ExpressionsPackage.LITERAL: return createLiteral();
			case ExpressionsPackage.BINARY_INDEX: return createBinaryIndex();
			case ExpressionsPackage.INDETERMINATE_REF: return createIndeterminateRef();
			case ExpressionsPackage.SELF_REF: return createSELFRef();
			case ExpressionsPackage.BINARY_OPERATION: return createBinaryOperation();
			case ExpressionsPackage.AGGREGATE_INITIALIZER: return createAggregateInitializer();
			case ExpressionsPackage.STRING_INDEX: return createStringIndex();
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR: return createPartialEntityConstructor();
			case ExpressionsPackage.COERCION: return createCoercion();
			case ExpressionsPackage.ACTUAL_PARAMETER: return createActualParameter();
			case ExpressionsPackage.PARAMETER_REF: return createParameterRef();
			case ExpressionsPackage.ATTRIBUTE_REF: return createAttributeRef();
			case ExpressionsPackage.AGGREGATE_INDEX: return createAggregateIndex();
			case ExpressionsPackage.GROUP_REF: return createGroupRef();
			case ExpressionsPackage.UNARY_OPERATION: return createUnaryOperation();
			case ExpressionsPackage.USED_IN_REF: return createUsedInRef();
			case ExpressionsPackage.CONSTANT_REF: return createConstantRef();
			case ExpressionsPackage.QUERY_EXPRESSION: return createQueryExpression();
			case ExpressionsPackage.QUERY_VARIABLE: return createQueryVariable();
			case ExpressionsPackage.ATTRIBUTE_BINDING: return createAttributeBinding();
			case ExpressionsPackage.FUNCTION_CALL: return createFunctionCall();
			case ExpressionsPackage.MEMBER_BINDING: return createMemberBinding();
			case ExpressionsPackage.EXTENT_REF: return createExtentRef();
			case ExpressionsPackage.VARIABLE_REF: return createVariableRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExpressionsPackage.UNARY_OPERATOR:
				return createUnaryOperatorFromString(eDataType, initialValue);
			case ExpressionsPackage.BINARY_OPERATOR:
				return createBinaryOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExpressionsPackage.UNARY_OPERATOR:
				return convertUnaryOperatorToString(eDataType, instanceValue);
			case ExpressionsPackage.BINARY_OPERATOR:
				return convertBinaryOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatCount createRepeatCount() {
		RepeatCountImpl repeatCount = new RepeatCountImpl();
		return repeatCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumItemRef createEnumItemRef() {
		EnumItemRefImpl enumItemRef = new EnumItemRefImpl();
		return enumItemRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIndex createBinaryIndex() {
		BinaryIndexImpl binaryIndex = new BinaryIndexImpl();
		return binaryIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndeterminateRef createIndeterminateRef() {
		IndeterminateRefImpl indeterminateRef = new IndeterminateRefImpl();
		return indeterminateRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SELFRef createSELFRef() {
		SELFRefImpl selfRef = new SELFRefImpl();
		return selfRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperation createBinaryOperation() {
		BinaryOperationImpl binaryOperation = new BinaryOperationImpl();
		return binaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateInitializer createAggregateInitializer() {
		AggregateInitializerImpl aggregateInitializer = new AggregateInitializerImpl();
		return aggregateInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringIndex createStringIndex() {
		StringIndexImpl stringIndex = new StringIndexImpl();
		return stringIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialEntityConstructor createPartialEntityConstructor() {
		PartialEntityConstructorImpl partialEntityConstructor = new PartialEntityConstructorImpl();
		return partialEntityConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coercion createCoercion() {
		CoercionImpl coercion = new CoercionImpl();
		return coercion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualParameter createActualParameter() {
		ActualParameterImpl actualParameter = new ActualParameterImpl();
		return actualParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRef createParameterRef() {
		ParameterRefImpl parameterRef = new ParameterRefImpl();
		return parameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRef createAttributeRef() {
		AttributeRefImpl attributeRef = new AttributeRefImpl();
		return attributeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateIndex createAggregateIndex() {
		AggregateIndexImpl aggregateIndex = new AggregateIndexImpl();
		return aggregateIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupRef createGroupRef() {
		GroupRefImpl groupRef = new GroupRefImpl();
		return groupRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperation createUnaryOperation() {
		UnaryOperationImpl unaryOperation = new UnaryOperationImpl();
		return unaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedInRef createUsedInRef() {
		UsedInRefImpl usedInRef = new UsedInRefImpl();
		return usedInRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantRef createConstantRef() {
		ConstantRefImpl constantRef = new ConstantRefImpl();
		return constantRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryExpression createQueryExpression() {
		QueryExpressionImpl queryExpression = new QueryExpressionImpl();
		return queryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryVariable createQueryVariable() {
		QueryVariableImpl queryVariable = new QueryVariableImpl();
		return queryVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeBinding createAttributeBinding() {
		AttributeBindingImpl attributeBinding = new AttributeBindingImpl();
		return attributeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberBinding createMemberBinding() {
		MemberBindingImpl memberBinding = new MemberBindingImpl();
		return memberBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtentRef createExtentRef() {
		ExtentRefImpl extentRef = new ExtentRefImpl();
		return extentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef createVariableRef() {
		VariableRefImpl variableRef = new VariableRefImpl();
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsPackage getExpressionsPackage() {
		return (ExpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionsPackage getPackage() {
		return ExpressionsPackage.eINSTANCE;
	}

} //ExpressionsFactoryImpl
