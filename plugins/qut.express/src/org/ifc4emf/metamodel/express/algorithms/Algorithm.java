/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.core.AlgorithmScope;
import org.ifc4emf.metamodel.express.core.CommonElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Algorithm#getBody <em>Body</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.Algorithm#getFormalParameters <em>Formal Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getAlgorithm()
 * @model abstract="true"
 * @generated
 */
public interface Algorithm extends AlgorithmScope, CommonElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.algorithms.Statement#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Statement)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getAlgorithm_Body()
	 * @see org.ifc4emf.metamodel.express.algorithms.Statement#getImplements
	 * @model opposite="implements" containment="true" ordered="false"
	 * @generated
	 */
	Statement getBody();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.Algorithm#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Statement value);

	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.algorithms.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getAlgorithm_FormalParameters()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Parameter> getFormalParameters();

} // Algorithm
