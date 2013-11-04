/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.NamedType#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.NamedType#getDomainRules <em>Domain Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getNamedType()
 * @model abstract="true"
 * @generated
 */
public interface NamedType extends InstantiableType, Scope, CommonElement, AttributeType {
	/**
	 * Returns the value of the '<em><b>Instantiates</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.SelectType}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.SelectType#getAllowedTypes <em>Allowed Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getNamedType_Instantiates()
	 * @see org.ifc4emf.metamodel.express.core.SelectType#getAllowedTypes
	 * @model opposite="allowedTypes" ordered="false"
	 * @generated
	 */
	EList<SelectType> getInstantiates();

	/**
	 * Returns the value of the '<em><b>Domain Rules</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.core.DomainRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Rules</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getNamedType_DomainRules()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DomainRule> getDomainRules();

} // NamedType
