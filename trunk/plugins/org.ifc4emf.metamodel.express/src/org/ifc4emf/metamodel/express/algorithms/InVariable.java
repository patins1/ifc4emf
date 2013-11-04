/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.InVariable#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getInVariable()
 * @model
 * @generated
 */
public interface InVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.algorithms.InParameter#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(InParameter)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getInVariable_Source()
	 * @see org.ifc4emf.metamodel.express.algorithms.InParameter#getVariable
	 * @model opposite="variable" required="true" ordered="false"
	 * @generated
	 */
	InParameter getSource();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.InVariable#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(InParameter value);

} // InVariable
