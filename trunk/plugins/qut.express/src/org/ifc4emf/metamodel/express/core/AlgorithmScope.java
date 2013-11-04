/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.algorithms.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.AlgorithmScope#getCommonElements <em>Common Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.AlgorithmScope#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAlgorithmScope()
 * @model abstract="true"
 * @generated
 */
public interface AlgorithmScope extends LocalScope {
	/**
	 * Returns the value of the '<em><b>Common Elements</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.CommonElement}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.CommonElement#getLocalScope <em>Local Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Elements</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAlgorithmScope_CommonElements()
	 * @see org.ifc4emf.metamodel.express.core.CommonElement#getLocalScope
	 * @model opposite="localScope" ordered="false"
	 * @generated
	 */
	EList<CommonElement> getCommonElements();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.algorithms.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getAlgorithmScope_Variables()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Variable> getVariables();

} // AlgorithmScope
