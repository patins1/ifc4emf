/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Member2 Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link express2ecore.SelectMember2Feature#getSelectType <em>Select Type</em>}</li>
 *   <li>{@link express2ecore.SelectMember2Feature#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link express2ecore.SelectMember2Feature#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see express2ecore.Express2ecorePackage#getSelectMember2Feature()
 * @model
 * @generated
 */
public interface SelectMember2Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Type</em>' reference.
	 * @see #setSelectType(org.ifc4emf.metamodel.express.core.SelectType)
	 * @see express2ecore.Express2ecorePackage#getSelectMember2Feature_SelectType()
	 * @model
	 * @generated
	 */
	org.ifc4emf.metamodel.express.core.SelectType getSelectType();

	/**
	 * Sets the value of the '{@link express2ecore.SelectMember2Feature#getSelectType <em>Select Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Type</em>' reference.
	 * @see #getSelectType()
	 * @generated
	 */
	void setSelectType(org.ifc4emf.metamodel.express.core.SelectType value);

	/**
	 * Returns the value of the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Type</em>' reference.
	 * @see #setMemberType(org.ifc4emf.metamodel.express.core.NamedType)
	 * @see express2ecore.Express2ecorePackage#getSelectMember2Feature_MemberType()
	 * @model
	 * @generated
	 */
	org.ifc4emf.metamodel.express.core.NamedType getMemberType();

	/**
	 * Sets the value of the '{@link express2ecore.SelectMember2Feature#getMemberType <em>Member Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Type</em>' reference.
	 * @see #getMemberType()
	 * @generated
	 */
	void setMemberType(org.ifc4emf.metamodel.express.core.NamedType value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see express2ecore.Express2ecorePackage#getSelectMember2Feature_Feature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link express2ecore.SelectMember2Feature#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

} // SelectMember2Feature
