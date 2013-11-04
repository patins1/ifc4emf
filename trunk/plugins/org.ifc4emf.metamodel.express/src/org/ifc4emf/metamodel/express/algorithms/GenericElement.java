/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms;

import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.ScopedId;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.GenericElement#getSource <em>Source</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.GenericElement#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getGenericElement()
 * @model abstract="true"
 * @generated
 */
public interface GenericElement extends LocalElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Parameter)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getGenericElement_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter getSource();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.GenericElement#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Parameter value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(ScopedId)
	 * @see org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage#getGenericElement_Label()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ScopedId getLabel();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.algorithms.GenericElement#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(ScopedId value);

} // GenericElement
