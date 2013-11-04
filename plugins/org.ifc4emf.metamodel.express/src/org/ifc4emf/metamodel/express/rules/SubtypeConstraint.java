/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtype Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getConstrainedSubtypes <em>Constrained Subtypes</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getEquivalentRule <em>Equivalent Rule</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getSubtypeConstraint()
 * @model
 * @generated
 */
public interface SubtypeConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Constrained Subtypes</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.rules.Extent}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.rules.Extent#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Subtypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Subtypes</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getSubtypeConstraint_ConstrainedSubtypes()
	 * @see org.ifc4emf.metamodel.express.rules.Extent#getConstraints
	 * @model opposite="constraints" required="true" ordered="false"
	 * @generated
	 */
	EList<Extent> getConstrainedSubtypes();

	/**
	 * Returns the value of the '<em><b>Equivalent Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Rule</em>' containment reference.
	 * @see #setEquivalentRule(Expression)
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getSubtypeConstraint_EquivalentRule()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getEquivalentRule();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getEquivalentRule <em>Equivalent Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalent Rule</em>' containment reference.
	 * @see #getEquivalentRule()
	 * @generated
	 */
	void setEquivalentRule(Expression value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.rules.SupertypeRule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' container reference.
	 * @see #setCollection(SupertypeRule)
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getSubtypeConstraint_Collection()
	 * @see org.ifc4emf.metamodel.express.rules.SupertypeRule#getConstraints
	 * @model opposite="constraints" required="true" transient="false" ordered="false"
	 * @generated
	 */
	SupertypeRule getCollection();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getCollection <em>Collection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' container reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(SupertypeRule value);

} // SubtypeConstraint
