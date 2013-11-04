/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ifc4emf.metamodel.express.instances.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancesFactoryImpl extends EFactoryImpl implements InstancesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstancesFactory init() {
		try {
			InstancesFactory theInstancesFactory = (InstancesFactory)EPackage.Registry.INSTANCE.getEFactory(InstancesPackage.eNS_URI);
			if (theInstancesFactory != null) {
				return theInstancesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstancesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesFactoryImpl() {
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
			case InstancesPackage.ATTRIBUTE_VALUE: return createAttributeValue();
			case InstancesPackage.ARRAY_VALUE: return createARRAYValue();
			case InstancesPackage.ROLE_NAME: return createRoleName();
			case InstancesPackage.ENTITY_INSTANCE: return createEntityInstance();
			case InstancesPackage.INTEGER_VALUE: return createIntegerValue();
			case InstancesPackage.CONSTANT: return createConstant();
			case InstancesPackage.LOGICAL_VALUE: return createLogicalValue();
			case InstancesPackage.LIST_MEMBER: return createListMember();
			case InstancesPackage.BAG_MEMBER: return createBagMember();
			case InstancesPackage.SINGLE_ENTITY_VALUE: return createSingleEntityValue();
			case InstancesPackage.INDETERMINATE: return createIndeterminate();
			case InstancesPackage.SINGLE_LEAF_INSTANCE: return createSingleLeafInstance();
			case InstancesPackage.GENERIC_AGGREGATE: return createGenericAggregate();
			case InstancesPackage.BINARY_VALUE: return createBinaryValue();
			case InstancesPackage.SPECIALIZED_VALUE: return createSpecializedValue();
			case InstancesPackage.BAG_VALUE: return createBAGValue();
			case InstancesPackage.ENUMERATION_ITEM: return createEnumerationItem();
			case InstancesPackage.ENTITY_VALUE: return createEntityValue();
			case InstancesPackage.SET_VALUE: return createSETValue();
			case InstancesPackage.ARRAY_MEMBER: return createArrayMember();
			case InstancesPackage.POPULATION: return createPopulation();
			case InstancesPackage.REAL_VALUE: return createRealValue();
			case InstancesPackage.BOOLEAN_VALUE: return createBooleanValue();
			case InstancesPackage.LIST_VALUE: return createLISTValue();
			case InstancesPackage.STRING_VALUE: return createStringValue();
			case InstancesPackage.TYPE_NAME: return createTypeName();
			case InstancesPackage.PARTIAL_ENTITY_VALUE: return createPartialEntityValue();
			case InstancesPackage.NUMBER_VALUE: return createNumberValue();
			case InstancesPackage.MULTI_LEAF_INSTANCE: return createMultiLeafInstance();
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
			case InstancesPackage.ENTITY_NAME:
				return createEntityNameFromString(eDataType, initialValue);
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
			case InstancesPackage.ENTITY_NAME:
				return convertEntityNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue createAttributeValue() {
		AttributeValueImpl attributeValue = new AttributeValueImpl();
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARRAYValue createARRAYValue() {
		ARRAYValueImpl arrayValue = new ARRAYValueImpl();
		return arrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleName createRoleName() {
		RoleNameImpl roleName = new RoleNameImpl();
		return roleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityInstance createEntityInstance() {
		EntityInstanceImpl entityInstance = new EntityInstanceImpl();
		return entityInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalValue createLogicalValue() {
		LogicalValueImpl logicalValue = new LogicalValueImpl();
		return logicalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListMember createListMember() {
		ListMemberImpl listMember = new ListMemberImpl();
		return listMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagMember createBagMember() {
		BagMemberImpl bagMember = new BagMemberImpl();
		return bagMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleEntityValue createSingleEntityValue() {
		SingleEntityValueImpl singleEntityValue = new SingleEntityValueImpl();
		return singleEntityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indeterminate createIndeterminate() {
		IndeterminateImpl indeterminate = new IndeterminateImpl();
		return indeterminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLeafInstance createSingleLeafInstance() {
		SingleLeafInstanceImpl singleLeafInstance = new SingleLeafInstanceImpl();
		return singleLeafInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAggregate createGenericAggregate() {
		GenericAggregateImpl genericAggregate = new GenericAggregateImpl();
		return genericAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryValue createBinaryValue() {
		BinaryValueImpl binaryValue = new BinaryValueImpl();
		return binaryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializedValue createSpecializedValue() {
		SpecializedValueImpl specializedValue = new SpecializedValueImpl();
		return specializedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAGValue createBAGValue() {
		BAGValueImpl bagValue = new BAGValueImpl();
		return bagValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationItem createEnumerationItem() {
		EnumerationItemImpl enumerationItem = new EnumerationItemImpl();
		return enumerationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityValue createEntityValue() {
		EntityValueImpl entityValue = new EntityValueImpl();
		return entityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SETValue createSETValue() {
		SETValueImpl setValue = new SETValueImpl();
		return setValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayMember createArrayMember() {
		ArrayMemberImpl arrayMember = new ArrayMemberImpl();
		return arrayMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Population createPopulation() {
		PopulationImpl population = new PopulationImpl();
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealValue createRealValue() {
		RealValueImpl realValue = new RealValueImpl();
		return realValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LISTValue createLISTValue() {
		LISTValueImpl listValue = new LISTValueImpl();
		return listValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeName createTypeName() {
		TypeNameImpl typeName = new TypeNameImpl();
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialEntityValue createPartialEntityValue() {
		PartialEntityValueImpl partialEntityValue = new PartialEntityValueImpl();
		return partialEntityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberValue createNumberValue() {
		NumberValueImpl numberValue = new NumberValueImpl();
		return numberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLeafInstance createMultiLeafInstance() {
		MultiLeafInstanceImpl multiLeafInstance = new MultiLeafInstanceImpl();
		return multiLeafInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEntityNameFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesPackage getInstancesPackage() {
		return (InstancesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstancesPackage getPackage() {
		return InstancesPackage.eINSTANCE;
	}

} //InstancesFactoryImpl
