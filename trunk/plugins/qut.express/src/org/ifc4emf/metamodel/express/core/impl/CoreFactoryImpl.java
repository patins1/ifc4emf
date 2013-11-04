/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ifc4emf.metamodel.express.core.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
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
			case CorePackage.SINGLE_ENTITY_TYPE: return createSingleEntityType();
			case CorePackage.AGGREGATE_TYPE: return createAGGREGATEType();
			case CorePackage.GENERAL_BAG_TYPE: return createGeneralBAGType();
			case CorePackage.DOMAIN_RULE: return createDomainRule();
			case CorePackage.EXPRESSION: return createExpression();
			case CorePackage.INVERSE_ATTRIBUTE: return createInverseAttribute();
			case CorePackage.ENUMERATION_TYPE: return createEnumerationType();
			case CorePackage.ARRAY_BOUND: return createArrayBound();
			case CorePackage.GENERAL_SET_TYPE: return createGeneralSETType();
			case CorePackage.LIST_TYPE: return createLISTType();
			case CorePackage.REDECLARATION: return createRedeclaration();
			case CorePackage.ENTITY_TYPE: return createEntityType();
			case CorePackage.PARTIAL_ENTITY_TYPE: return createPartialEntityType();
			case CorePackage.SCHEMA: return createSchema();
			case CorePackage.INVERTIBLE_ATTRIBUTE: return createInvertibleAttribute();
			case CorePackage.INTERFACED_ELEMENT: return createInterfacedElement();
			case CorePackage.NUMERIC_TYPE: return createNumericType();
			case CorePackage.UNIQUE_RULE: return createUniqueRule();
			case CorePackage.DOMAIN_ROLE: return createDomainRole();
			case CorePackage.GENERAL_LIST_TYPE: return createGeneralLISTType();
			case CorePackage.BAG_TYPE: return createBAGType();
			case CorePackage.REAL_TYPE: return createRealType();
			case CorePackage.LOGIC_TYPE: return createLogicType();
			case CorePackage.GENERIC_TYPE: return createGenericType();
			case CorePackage.STRING_TYPE: return createStringType();
			case CorePackage.DERIVED_ATTRIBUTE: return createDerivedAttribute();
			case CorePackage.RANGE_ROLE: return createRangeRole();
			case CorePackage.REMARK: return createRemark();
			case CorePackage.SIZE_CONSTRAINT: return createSizeConstraint();
			case CorePackage.SET_TYPE: return createSETType();
			case CorePackage.SPECIALIZED_TYPE: return createSpecializedType();
			case CorePackage.GENERAL_ARRAY_TYPE: return createGeneralARRAYType();
			case CorePackage.RELATIONSHIP: return createRelationship();
			case CorePackage.LENGTH_CONSTRAINT: return createLengthConstraint();
			case CorePackage.BINARY_TYPE: return createBinaryType();
			case CorePackage.SCOPED_ID: return createScopedId();
			case CorePackage.SELECT_TYPE: return createSelectType();
			case CorePackage.EXPLICIT_ATTRIBUTE: return createExplicitAttribute();
			case CorePackage.ARRAY_TYPE: return createARRAYType();
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
			case CorePackage.KEYWORD:
				return createKeywordFromString(eDataType, initialValue);
			case CorePackage.EXPRESS_TEXT:
				return createExpressTextFromString(eDataType, initialValue);
			case CorePackage.IDENTIFIER:
				return createIdentifierFromString(eDataType, initialValue);
			case CorePackage.ORDERING_KIND:
				return createOrderingKindFromString(eDataType, initialValue);
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
			case CorePackage.KEYWORD:
				return convertKeywordToString(eDataType, instanceValue);
			case CorePackage.EXPRESS_TEXT:
				return convertExpressTextToString(eDataType, instanceValue);
			case CorePackage.IDENTIFIER:
				return convertIdentifierToString(eDataType, instanceValue);
			case CorePackage.ORDERING_KIND:
				return convertOrderingKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleEntityType createSingleEntityType() {
		SingleEntityTypeImpl singleEntityType = new SingleEntityTypeImpl();
		return singleEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGGREGATEType createAGGREGATEType() {
		AGGREGATETypeImpl aggregateType = new AGGREGATETypeImpl();
		return aggregateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralBAGType createGeneralBAGType() {
		GeneralBAGTypeImpl generalBAGType = new GeneralBAGTypeImpl();
		return generalBAGType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRule createDomainRule() {
		DomainRuleImpl domainRule = new DomainRuleImpl();
		return domainRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseAttribute createInverseAttribute() {
		InverseAttributeImpl inverseAttribute = new InverseAttributeImpl();
		return inverseAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayBound createArrayBound() {
		ArrayBoundImpl arrayBound = new ArrayBoundImpl();
		return arrayBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralSETType createGeneralSETType() {
		GeneralSETTypeImpl generalSETType = new GeneralSETTypeImpl();
		return generalSETType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LISTType createLISTType() {
		LISTTypeImpl listType = new LISTTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Redeclaration createRedeclaration() {
		RedeclarationImpl redeclaration = new RedeclarationImpl();
		return redeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType createEntityType() {
		EntityTypeImpl entityType = new EntityTypeImpl();
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialEntityType createPartialEntityType() {
		PartialEntityTypeImpl partialEntityType = new PartialEntityTypeImpl();
		return partialEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvertibleAttribute createInvertibleAttribute() {
		InvertibleAttributeImpl invertibleAttribute = new InvertibleAttributeImpl();
		return invertibleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacedElement createInterfacedElement() {
		InterfacedElementImpl interfacedElement = new InterfacedElementImpl();
		return interfacedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType createNumericType() {
		NumericTypeImpl numericType = new NumericTypeImpl();
		return numericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueRule createUniqueRule() {
		UniqueRuleImpl uniqueRule = new UniqueRuleImpl();
		return uniqueRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRole createDomainRole() {
		DomainRoleImpl domainRole = new DomainRoleImpl();
		return domainRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLISTType createGeneralLISTType() {
		GeneralLISTTypeImpl generalLISTType = new GeneralLISTTypeImpl();
		return generalLISTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAGType createBAGType() {
		BAGTypeImpl bagType = new BAGTypeImpl();
		return bagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType createRealType() {
		RealTypeImpl realType = new RealTypeImpl();
		return realType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicType createLogicType() {
		LogicTypeImpl logicType = new LogicTypeImpl();
		return logicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericType createGenericType() {
		GenericTypeImpl genericType = new GenericTypeImpl();
		return genericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedAttribute createDerivedAttribute() {
		DerivedAttributeImpl derivedAttribute = new DerivedAttributeImpl();
		return derivedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeRole createRangeRole() {
		RangeRoleImpl rangeRole = new RangeRoleImpl();
		return rangeRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remark createRemark() {
		RemarkImpl remark = new RemarkImpl();
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint createSizeConstraint() {
		SizeConstraintImpl sizeConstraint = new SizeConstraintImpl();
		return sizeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SETType createSETType() {
		SETTypeImpl setType = new SETTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializedType createSpecializedType() {
		SpecializedTypeImpl specializedType = new SpecializedTypeImpl();
		return specializedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralARRAYType createGeneralARRAYType() {
		GeneralARRAYTypeImpl generalARRAYType = new GeneralARRAYTypeImpl();
		return generalARRAYType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthConstraint createLengthConstraint() {
		LengthConstraintImpl lengthConstraint = new LengthConstraintImpl();
		return lengthConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryType createBinaryType() {
		BinaryTypeImpl binaryType = new BinaryTypeImpl();
		return binaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedId createScopedId() {
		ScopedIdImpl scopedId = new ScopedIdImpl();
		return scopedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectType createSelectType() {
		SelectTypeImpl selectType = new SelectTypeImpl();
		return selectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitAttribute createExplicitAttribute() {
		ExplicitAttributeImpl explicitAttribute = new ExplicitAttributeImpl();
		return explicitAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARRAYType createARRAYType() {
		ARRAYTypeImpl arrayType = new ARRAYTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKeywordFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeywordToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExpressTextFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressTextToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOrderingKindFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderingKindToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
