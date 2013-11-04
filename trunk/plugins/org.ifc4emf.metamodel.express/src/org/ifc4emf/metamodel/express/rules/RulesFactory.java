/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = org.ifc4emf.metamodel.express.rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ONEOF Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ONEOF Constraint</em>'.
	 * @generated
	 */
	ONEOFConstraint createONEOFConstraint();

	/**
	 * Returns a new object of class '<em>Supertype Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supertype Rule</em>'.
	 * @generated
	 */
	SupertypeRule createSupertypeRule();

	/**
	 * Returns a new object of class '<em>Subtype Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtype Constraint</em>'.
	 * @generated
	 */
	SubtypeConstraint createSubtypeConstraint();

	/**
	 * Returns a new object of class '<em>Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extent</em>'.
	 * @generated
	 */
	Extent createExtent();

	/**
	 * Returns a new object of class '<em>TOTAL OVER Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TOTAL OVER Constraint</em>'.
	 * @generated
	 */
	TOTAL_OVERConstraint createTOTAL_OVERConstraint();

	/**
	 * Returns a new object of class '<em>AND Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND Constraint</em>'.
	 * @generated
	 */
	ANDConstraint createANDConstraint();

	/**
	 * Returns a new object of class '<em>Global Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Rule</em>'.
	 * @generated
	 */
	GlobalRule createGlobalRule();

	/**
	 * Returns a new object of class '<em>Named Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Rule</em>'.
	 * @generated
	 */
	NamedRule createNamedRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
