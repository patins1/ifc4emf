/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.rules;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.core.AlgorithmScope;
import org.ifc4emf.metamodel.express.core.SchemaElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.GlobalRule#getSupportingBody <em>Supporting Body</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.GlobalRule#getConstrainedExtents <em>Constrained Extents</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.GlobalRule#getContainsRules <em>Contains Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getGlobalRule()
 * @model
 * @generated
 */
public interface GlobalRule extends SchemaElement, AlgorithmScope {
	/**
	 * Returns the value of the '<em><b>Supporting Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Body</em>' containment reference.
	 * @see #setSupportingBody(Statement)
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getGlobalRule_SupportingBody()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Statement getSupportingBody();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.rules.GlobalRule#getSupportingBody <em>Supporting Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting Body</em>' containment reference.
	 * @see #getSupportingBody()
	 * @generated
	 */
	void setSupportingBody(Statement value);

	/**
	 * Returns the value of the '<em><b>Constrained Extents</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.rules.Extent}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.rules.Extent#getConstraintRules <em>Constraint Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Extents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Extents</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getGlobalRule_ConstrainedExtents()
	 * @see org.ifc4emf.metamodel.express.rules.Extent#getConstraintRules
	 * @model opposite="constraintRules" required="true" ordered="false"
	 * @generated
	 */
	EList<Extent> getConstrainedExtents();

	/**
	 * Returns the value of the '<em><b>Contains Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.rules.NamedRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Rules</em>' containment reference list.
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getGlobalRule_ContainsRules()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<NamedRule> getContainsRules();

} // GlobalRule
