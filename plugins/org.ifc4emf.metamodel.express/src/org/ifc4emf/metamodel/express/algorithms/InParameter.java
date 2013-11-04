/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.InParameter#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getInParameter()
 * @model
 * @generated
 */
public interface InParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.algorithms.InVariable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(InVariable)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getInParameter_Variable()
	 * @see org.ifc4emf.metamodel.express.algorithms.InVariable#getSource
	 * @model opposite="source" required="true" ordered="false"
	 * @generated
	 */
	InVariable getVariable();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.InParameter#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(InVariable value);

} // InParameter
