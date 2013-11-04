/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.instances;

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.express.core.Instance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.ArrayMember#getMemberValue <em>Member Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.instances.ArrayMember#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getArrayMember()
 * @model
 * @generated
 */
public interface ArrayMember extends EObject {
	/**
	 * Returns the value of the '<em><b>Member Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Value</em>' reference.
	 * @see #setMemberValue(Instance)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getArrayMember_MemberValue()
	 * @model ordered="false"
	 * @generated
	 */
	Instance getMemberValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.ArrayMember#getMemberValue <em>Member Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Value</em>' reference.
	 * @see #getMemberValue()
	 * @generated
	 */
	void setMemberValue(Instance value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(Integer)
	 * @see org.ifc4emf.metamodel.express.instances.InstancesPackage#getArrayMember_Index()
	 * @model unique="false" dataType="org.ifc4emf.metamodel.express.mof.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getIndex();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.instances.ArrayMember#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Integer value);

} // ArrayMember
