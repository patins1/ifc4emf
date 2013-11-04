/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.rules;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.core.CommonElement;
import org.ifc4emf.metamodel.express.core.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supertype Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.SupertypeRule#getNamedSupertype <em>Named Supertype</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.SupertypeRule#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.SupertypeRule#getAssertsAbstract <em>Asserts Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getSupertypeRule()
 * @model
 * @generated
 */
public interface SupertypeRule extends CommonElement {
	/**
	 * Returns the value of the '<em><b>Named Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Supertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Supertype</em>' reference.
	 * @see #setNamedSupertype(EntityType)
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getSupertypeRule_NamedSupertype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EntityType getNamedSupertype();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.rules.SupertypeRule#getNamedSupertype <em>Named Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Supertype</em>' reference.
	 * @see #getNamedSupertype()
	 * @generated
	 */
	void setNamedSupertype(EntityType value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getSupertypeRule_Constraints()
	 * @see org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getCollection
	 * @model opposite="collection" containment="true" ordered="false"
	 * @generated
	 */
	EList<SubtypeConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Asserts Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asserts Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asserts Abstract</em>' attribute.
	 * @see #setAssertsAbstract(Boolean)
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getSupertypeRule_AssertsAbstract()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getAssertsAbstract();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.rules.SupertypeRule#getAssertsAbstract <em>Asserts Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserts Abstract</em>' attribute.
	 * @see #getAssertsAbstract()
	 * @generated
	 */
	void setAssertsAbstract(Boolean value);

} // SupertypeRule
