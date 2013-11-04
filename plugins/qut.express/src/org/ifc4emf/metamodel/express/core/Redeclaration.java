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
 * A representation of the model object '<em><b>Redeclaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Redeclaration#getDerivation <em>Derivation</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Redeclaration#getRestrictedType <em>Restricted Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Redeclaration#getRefines <em>Refines</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Redeclaration#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Redeclaration#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Redeclaration#getScope <em>Scope</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Redeclaration#getOriginalAttribute <em>Original Attribute</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Redeclaration#getRefinedRole <em>Refined Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Redeclaration#getPosition <em>Position</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Redeclaration#getIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.Redeclaration#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration()
 * @model
 * @generated
 */
public interface Redeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation</em>' reference.
	 * @see #setDerivation(Expression)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration_Derivation()
	 * @model ordered="false"
	 * @generated
	 */
	Expression getDerivation();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getDerivation <em>Derivation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation</em>' reference.
	 * @see #getDerivation()
	 * @generated
	 */
	void setDerivation(Expression value);

	/**
	 * Returns the value of the '<em><b>Restricted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricted Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted Type</em>' reference.
	 * @see #setRestrictedType(AttributeType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration_RestrictedType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AttributeType getRestrictedType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getRestrictedType <em>Restricted Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricted Type</em>' reference.
	 * @see #getRestrictedType()
	 * @generated
	 */
	void setRestrictedType(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(Redeclaration)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration_Refines()
	 * @model ordered="false"
	 * @generated
	 */
	Redeclaration getRefines();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(Redeclaration value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(SizeConstraint)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration_UpperBound()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SizeConstraint getUpperBound();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(SizeConstraint value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(SizeConstraint)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration_LowerBound()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SizeConstraint getLowerBound();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(SizeConstraint value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EntityType#getRedeclarations <em>Redeclarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(EntityType)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration_Scope()
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getRedeclarations
	 * @model opposite="redeclarations" required="true" transient="false" ordered="false"
	 * @generated
	 */
	EntityType getScope();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(EntityType value);

	/**
	 * Returns the value of the '<em><b>Original Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Attribute</em>' reference.
	 * @see #setOriginalAttribute(Attribute)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration_OriginalAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getOriginalAttribute();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getOriginalAttribute <em>Original Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Attribute</em>' reference.
	 * @see #getOriginalAttribute()
	 * @generated
	 */
	void setOriginalAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Role</em>' reference.
	 * @see #setRefinedRole(Role)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration_RefinedRole()
	 * @model ordered="false"
	 * @generated
	 */
	Role getRefinedRole();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getRefinedRole <em>Refined Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Role</em>' reference.
	 * @see #getRefinedRole()
	 * @generated
	 */
	void setRefinedRole(Role value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(Integer)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration_Position()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getPosition();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #setIsMandatory(Boolean)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration_IsMandatory()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsMandatory();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #getIsMandatory()
	 * @generated
	 */
	void setIsMandatory(Boolean value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference.
	 * @see #setAlias(ScopedId)
	 * @see org.ifc4emf.metamodel.express.core.CorePackage#getRedeclaration_Alias()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ScopedId getAlias();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.core.Redeclaration#getAlias <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' containment reference.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(ScopedId value);

} // Redeclaration
