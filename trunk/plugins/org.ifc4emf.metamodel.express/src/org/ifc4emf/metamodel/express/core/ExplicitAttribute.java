/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.ExplicitAttribute#getIsOptional <em>Is Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getExplicitAttribute()
 * @model
 * @generated
 */
public interface ExplicitAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(Boolean)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getExplicitAttribute_IsOptional()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsOptional();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.ExplicitAttribute#getIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #getIsOptional()
	 * @generated
	 */
	void setIsOptional(Boolean value);

} // ExplicitAttribute
