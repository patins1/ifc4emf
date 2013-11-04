/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.rules;

import org.eclipse.emf.common.util.EList;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.ScopedId;
import org.ifc4emf.metamodel.express.instances.EntityInstance;
import org.ifc4emf.metamodel.express.instances.Population;
import org.ifc4emf.metamodel.express.instances.SETValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.Extent#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.Extent#getContent <em>Content</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.Extent#getWithinPopulation <em>Within Population</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.Extent#getConstraintRules <em>Constraint Rules</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.Extent#getForType <em>For Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.Extent#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getExtent()
 * @model
 * @generated
 */
public interface Extent extends SETValue {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getConstrainedSubtypes <em>Constrained Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getExtent_Constraints()
	 * @see org.ifc4emf.metamodel.express.rules.SubtypeConstraint#getConstrainedSubtypes
	 * @model opposite="constrainedSubtypes" ordered="false"
	 * @generated
	 */
	EList<SubtypeConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.instances.EntityInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getExtent_Content()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EntityInstance> getContent();

	/**
	 * Returns the value of the '<em><b>Within Population</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Within Population</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Within Population</em>' reference.
	 * @see #setWithinPopulation(Population)
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getExtent_WithinPopulation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Population getWithinPopulation();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.rules.Extent#getWithinPopulation <em>Within Population</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Within Population</em>' reference.
	 * @see #getWithinPopulation()
	 * @generated
	 */
	void setWithinPopulation(Population value);

	/**
	 * Returns the value of the '<em><b>Constraint Rules</b></em>' reference list.
	 * The list contents are of type {@link org.ifc4emf.metamodel.express.rules.GlobalRule}.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.rules.GlobalRule#getConstrainedExtents <em>Constrained Extents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Rules</em>' reference list.
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getExtent_ConstraintRules()
	 * @see org.ifc4emf.metamodel.express.rules.GlobalRule#getConstrainedExtents
	 * @model opposite="constrainedExtents" ordered="false"
	 * @generated
	 */
	EList<GlobalRule> getConstraintRules();

	/**
	 * Returns the value of the '<em><b>For Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ifc4emf.metamodel.express.core.EntityType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Type</em>' reference.
	 * @see #setForType(EntityType)
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getExtent_ForType()
	 * @see org.ifc4emf.metamodel.express.core.EntityType#getExtension
	 * @model opposite="extension" required="true" ordered="false"
	 * @generated
	 */
	EntityType getForType();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.rules.Extent#getForType <em>For Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Type</em>' reference.
	 * @see #getForType()
	 * @generated
	 */
	void setForType(EntityType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(ScopedId)
	 * @see org.ifc4emf.metamodel.express.rules.RulesPackage#getExtent_Id()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ScopedId getId();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.express.rules.Extent#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(ScopedId value);

} // Extent
