/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = org.ifc4emf.metamodel.express.core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Single Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Entity Type</em>'.
	 * @generated
	 */
	SingleEntityType createSingleEntityType();

	/**
	 * Returns a new object of class '<em>AGGREGATE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AGGREGATE Type</em>'.
	 * @generated
	 */
	AGGREGATEType createAGGREGATEType();

	/**
	 * Returns a new object of class '<em>General BAG Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General BAG Type</em>'.
	 * @generated
	 */
	GeneralBAGType createGeneralBAGType();

	/**
	 * Returns a new object of class '<em>Domain Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Rule</em>'.
	 * @generated
	 */
	DomainRule createDomainRule();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Inverse Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inverse Attribute</em>'.
	 * @generated
	 */
	InverseAttribute createInverseAttribute();

	/**
	 * Returns a new object of class '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Type</em>'.
	 * @generated
	 */
	EnumerationType createEnumerationType();

	/**
	 * Returns a new object of class '<em>Array Bound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Bound</em>'.
	 * @generated
	 */
	ArrayBound createArrayBound();

	/**
	 * Returns a new object of class '<em>General SET Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General SET Type</em>'.
	 * @generated
	 */
	GeneralSETType createGeneralSETType();

	/**
	 * Returns a new object of class '<em>LIST Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LIST Type</em>'.
	 * @generated
	 */
	LISTType createLISTType();

	/**
	 * Returns a new object of class '<em>Redeclaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redeclaration</em>'.
	 * @generated
	 */
	Redeclaration createRedeclaration();

	/**
	 * Returns a new object of class '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Type</em>'.
	 * @generated
	 */
	EntityType createEntityType();

	/**
	 * Returns a new object of class '<em>Partial Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Entity Type</em>'.
	 * @generated
	 */
	PartialEntityType createPartialEntityType();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>Invertible Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invertible Attribute</em>'.
	 * @generated
	 */
	InvertibleAttribute createInvertibleAttribute();

	/**
	 * Returns a new object of class '<em>Interfaced Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interfaced Element</em>'.
	 * @generated
	 */
	InterfacedElement createInterfacedElement();

	/**
	 * Returns a new object of class '<em>Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Type</em>'.
	 * @generated
	 */
	NumericType createNumericType();

	/**
	 * Returns a new object of class '<em>Unique Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Rule</em>'.
	 * @generated
	 */
	UniqueRule createUniqueRule();

	/**
	 * Returns a new object of class '<em>Domain Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Role</em>'.
	 * @generated
	 */
	DomainRole createDomainRole();

	/**
	 * Returns a new object of class '<em>General LIST Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General LIST Type</em>'.
	 * @generated
	 */
	GeneralLISTType createGeneralLISTType();

	/**
	 * Returns a new object of class '<em>BAG Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BAG Type</em>'.
	 * @generated
	 */
	BAGType createBAGType();

	/**
	 * Returns a new object of class '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Type</em>'.
	 * @generated
	 */
	RealType createRealType();

	/**
	 * Returns a new object of class '<em>Logic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Type</em>'.
	 * @generated
	 */
	LogicType createLogicType();

	/**
	 * Returns a new object of class '<em>Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Type</em>'.
	 * @generated
	 */
	GenericType createGenericType();

	/**
	 * Returns a new object of class '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Type</em>'.
	 * @generated
	 */
	StringType createStringType();

	/**
	 * Returns a new object of class '<em>Derived Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Attribute</em>'.
	 * @generated
	 */
	DerivedAttribute createDerivedAttribute();

	/**
	 * Returns a new object of class '<em>Range Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Role</em>'.
	 * @generated
	 */
	RangeRole createRangeRole();

	/**
	 * Returns a new object of class '<em>Remark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remark</em>'.
	 * @generated
	 */
	Remark createRemark();

	/**
	 * Returns a new object of class '<em>Size Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size Constraint</em>'.
	 * @generated
	 */
	SizeConstraint createSizeConstraint();

	/**
	 * Returns a new object of class '<em>SET Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SET Type</em>'.
	 * @generated
	 */
	SETType createSETType();

	/**
	 * Returns a new object of class '<em>Specialized Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialized Type</em>'.
	 * @generated
	 */
	SpecializedType createSpecializedType();

	/**
	 * Returns a new object of class '<em>General ARRAY Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General ARRAY Type</em>'.
	 * @generated
	 */
	GeneralARRAYType createGeneralARRAYType();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Length Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Constraint</em>'.
	 * @generated
	 */
	LengthConstraint createLengthConstraint();

	/**
	 * Returns a new object of class '<em>Binary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Type</em>'.
	 * @generated
	 */
	BinaryType createBinaryType();

	/**
	 * Returns a new object of class '<em>Scoped Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scoped Id</em>'.
	 * @generated
	 */
	ScopedId createScopedId();

	/**
	 * Returns a new object of class '<em>Select Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Type</em>'.
	 * @generated
	 */
	SelectType createSelectType();

	/**
	 * Returns a new object of class '<em>Explicit Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explicit Attribute</em>'.
	 * @generated
	 */
	ExplicitAttribute createExplicitAttribute();

	/**
	 * Returns a new object of class '<em>ARRAY Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ARRAY Type</em>'.
	 * @generated
	 */
	ARRAYType createARRAYType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
