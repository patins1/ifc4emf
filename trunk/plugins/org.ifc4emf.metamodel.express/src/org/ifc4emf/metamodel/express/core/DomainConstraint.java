/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.DomainConstraint#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.DomainConstraint#getAsserts <em>Asserts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getDomainConstraint()
 * @model abstract="true"
 * @generated
 */
public interface DomainConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.AttributeType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(AttributeType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getDomainConstraint_Domain()
	 * @see org.ifc4emf.metamodel.express.core.AttributeType#getConstraints
	 * @model opposite="constraints" required="true" ordered="false"
	 * @generated
	 */
	AttributeType getDomain();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.DomainConstraint#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Asserts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asserts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asserts</em>' containment reference.
	 * @see #setAsserts(Expression)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getDomainConstraint_Asserts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getAsserts();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.DomainConstraint#getAsserts <em>Asserts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserts</em>' containment reference.
	 * @see #getAsserts()
	 * @generated
	 */
	void setAsserts(Expression value);

} // DomainConstraint
