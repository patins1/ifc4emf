/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.CommonElement#getLocalScope <em>Local Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getCommonElement()
 * @model abstract="true"
 * @generated
 */
public interface CommonElement extends SchemaElement {
	/**
	 * Returns the value of the '<em><b>Local Scope</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.AlgorithmScope#getCommonElements <em>Common Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Scope</em>' reference.
	 * @see #setLocalScope(AlgorithmScope)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getCommonElement_LocalScope()
	 * @see org.ifc4emf.metamodel.express.core.AlgorithmScope#getCommonElements
	 * @model opposite="commonElements" ordered="false"
	 * @generated
	 */
	AlgorithmScope getLocalScope();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.CommonElement#getLocalScope <em>Local Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Scope</em>' reference.
	 * @see #getLocalScope()
	 * @generated
	 */
	void setLocalScope(AlgorithmScope value);

} // CommonElement
