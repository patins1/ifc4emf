/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DomainRole;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.InvertibleAttribute;
import org.ifc4emf.metamodel.express.core.RangeRole;
import org.ifc4emf.metamodel.express.core.Redeclaration;
import org.ifc4emf.metamodel.express.core.Role;
import org.ifc4emf.metamodel.express.core.SingleEntityType;
import org.ifc4emf.metamodel.express.core.UniqueRule;
import org.ifc4emf.metamodel.express.rules.Extent;
import org.ifc4emf.metamodel.express.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getPlaysRole <em>Plays Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getRedeclarations <em>Redeclarations</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getPlaysRangeRole <em>Plays Range Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getDeclares <em>Declares</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getInvertibleAttributes <em>Invertible Attributes</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getPlaysDomainRole <em>Plays Domain Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getUniqueRules <em>Unique Rules</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getUsedIn <em>Used In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getSubtypeOf <em>Subtype Of</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.EntityTypeImpl#getIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityTypeImpl extends NamedTypeImpl implements EntityType {
	/**
	 * The cached value of the '{@link #getPlaysRole() <em>Plays Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaysRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> playsRole;

	/**
	 * The cached value of the '{@link #getRedeclarations() <em>Redeclarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Redeclaration> redeclarations;

	/**
	 * The cached value of the '{@link #getPlaysRangeRole() <em>Plays Range Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaysRangeRole()
	 * @generated
	 * @ordered
	 */
	protected EList<RangeRole> playsRangeRole;

	/**
	 * The cached value of the '{@link #getDeclares() <em>Declares</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclares()
	 * @generated
	 * @ordered
	 */
	protected SingleEntityType declares;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Extent> extension;

	/**
	 * The cached value of the '{@link #getInvertibleAttributes() <em>Invertible Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvertibleAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<InvertibleAttribute> invertibleAttributes;

	/**
	 * The cached value of the '{@link #getPlaysDomainRole() <em>Plays Domain Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaysDomainRole()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainRole> playsDomainRole;

	/**
	 * The cached value of the '{@link #getUniqueRules() <em>Unique Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueRules()
	 * @generated
	 * @ordered
	 */
	protected EList<UniqueRule> uniqueRules;

	/**
	 * The cached value of the '{@link #getUsedIn() <em>Used In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<InvertibleAttribute> usedIn;

	/**
	 * The cached value of the '{@link #getSubtypeOf() <em>Subtype Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypeOf()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> subtypeOf;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getPlaysRole() {
		if (playsRole == null) {
			playsRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, CorePackage.ENTITY_TYPE__PLAYS_ROLE, CorePackage.ROLE__OF_ENTITY);
		}
		return playsRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Redeclaration> getRedeclarations() {
		if (redeclarations == null) {
			redeclarations = new EObjectContainmentWithInverseEList<Redeclaration>(Redeclaration.class, this, CorePackage.ENTITY_TYPE__REDECLARATIONS, CorePackage.REDECLARATION__SCOPE);
		}
		return redeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Attribute> getAttributes() {
		
		EList<Attribute> attrs = new BasicEList<Attribute>();
		attrs.addAll(this.getDeclares().getDeclaresAttribute());
		
		for (EntityType sup : this.getSubtypeOf()) {
			attrs.addAll(sup.getAttributes());
		}
		
		return attrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RangeRole> getPlaysRangeRole() {
		if (playsRangeRole == null) {
			playsRangeRole = new EObjectWithInverseResolvingEList<RangeRole>(RangeRole.class, this, CorePackage.ENTITY_TYPE__PLAYS_RANGE_ROLE, CorePackage.RANGE_ROLE__RANGE);
		}
		return playsRangeRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleEntityType getDeclares() {
		return declares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclares(SingleEntityType newDeclares, NotificationChain msgs) {
		SingleEntityType oldDeclares = declares;
		declares = newDeclares;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE__DECLARES, oldDeclares, newDeclares);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclares(SingleEntityType newDeclares) {
		if (newDeclares != declares) {
			NotificationChain msgs = null;
			if (declares != null)
				msgs = ((InternalEObject)declares).eInverseRemove(this, CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN, SingleEntityType.class, msgs);
			if (newDeclares != null)
				msgs = ((InternalEObject)newDeclares).eInverseAdd(this, CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN, SingleEntityType.class, msgs);
			msgs = basicSetDeclares(newDeclares, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE__DECLARES, newDeclares, newDeclares));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extent> getExtension() {
		if (extension == null) {
			extension = new EObjectWithInverseResolvingEList<Extent>(Extent.class, this, CorePackage.ENTITY_TYPE__EXTENSION, RulesPackage.EXTENT__FOR_TYPE);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvertibleAttribute> getInvertibleAttributes() {
		if (invertibleAttributes == null) {
			invertibleAttributes = new EObjectWithInverseResolvingEList.ManyInverse<InvertibleAttribute>(InvertibleAttribute.class, this, CorePackage.ENTITY_TYPE__INVERTIBLE_ATTRIBUTES, CorePackage.INVERTIBLE_ATTRIBUTE__REFERENCING_TYPE);
		}
		return invertibleAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainRole> getPlaysDomainRole() {
		if (playsDomainRole == null) {
			playsDomainRole = new EObjectWithInverseResolvingEList<DomainRole>(DomainRole.class, this, CorePackage.ENTITY_TYPE__PLAYS_DOMAIN_ROLE, CorePackage.DOMAIN_ROLE__DOMAIN);
		}
		return playsDomainRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UniqueRule> getUniqueRules() {
		if (uniqueRules == null) {
			uniqueRules = new EObjectWithInverseResolvingEList<UniqueRule>(UniqueRule.class, this, CorePackage.ENTITY_TYPE__UNIQUE_RULES, CorePackage.UNIQUE_RULE__DOMAIN);
		}
		return uniqueRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvertibleAttribute> getUsedIn() {
		if (usedIn == null) {
			usedIn = new EObjectWithInverseResolvingEList.ManyInverse<InvertibleAttribute>(InvertibleAttribute.class, this, CorePackage.ENTITY_TYPE__USED_IN, CorePackage.INVERTIBLE_ATTRIBUTE__RANGE_TYPE);
		}
		return usedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getSubtypeOf() {
		if (subtypeOf == null) {
			subtypeOf = new EObjectResolvingEList<EntityType>(EntityType.class, this, CorePackage.ENTITY_TYPE__SUBTYPE_OF);
		}
		return subtypeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ENTITY_TYPE__PLAYS_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlaysRole()).basicAdd(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__REDECLARATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRedeclarations()).basicAdd(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__PLAYS_RANGE_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlaysRangeRole()).basicAdd(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__DECLARES:
				if (declares != null)
					msgs = ((InternalEObject)declares).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ENTITY_TYPE__DECLARES, null, msgs);
				return basicSetDeclares((SingleEntityType)otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__EXTENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtension()).basicAdd(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__INVERTIBLE_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvertibleAttributes()).basicAdd(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__PLAYS_DOMAIN_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlaysDomainRole()).basicAdd(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__UNIQUE_RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUniqueRules()).basicAdd(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__USED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedIn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ENTITY_TYPE__PLAYS_ROLE:
				return ((InternalEList<?>)getPlaysRole()).basicRemove(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__REDECLARATIONS:
				return ((InternalEList<?>)getRedeclarations()).basicRemove(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__PLAYS_RANGE_ROLE:
				return ((InternalEList<?>)getPlaysRangeRole()).basicRemove(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__DECLARES:
				return basicSetDeclares(null, msgs);
			case CorePackage.ENTITY_TYPE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__INVERTIBLE_ATTRIBUTES:
				return ((InternalEList<?>)getInvertibleAttributes()).basicRemove(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__PLAYS_DOMAIN_ROLE:
				return ((InternalEList<?>)getPlaysDomainRole()).basicRemove(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__UNIQUE_RULES:
				return ((InternalEList<?>)getUniqueRules()).basicRemove(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE__USED_IN:
				return ((InternalEList<?>)getUsedIn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ENTITY_TYPE__PLAYS_ROLE:
				return getPlaysRole();
			case CorePackage.ENTITY_TYPE__REDECLARATIONS:
				return getRedeclarations();
			case CorePackage.ENTITY_TYPE__ATTRIBUTES:
				return getAttributes();
			case CorePackage.ENTITY_TYPE__PLAYS_RANGE_ROLE:
				return getPlaysRangeRole();
			case CorePackage.ENTITY_TYPE__DECLARES:
				return getDeclares();
			case CorePackage.ENTITY_TYPE__EXTENSION:
				return getExtension();
			case CorePackage.ENTITY_TYPE__INVERTIBLE_ATTRIBUTES:
				return getInvertibleAttributes();
			case CorePackage.ENTITY_TYPE__PLAYS_DOMAIN_ROLE:
				return getPlaysDomainRole();
			case CorePackage.ENTITY_TYPE__UNIQUE_RULES:
				return getUniqueRules();
			case CorePackage.ENTITY_TYPE__USED_IN:
				return getUsedIn();
			case CorePackage.ENTITY_TYPE__SUBTYPE_OF:
				return getSubtypeOf();
			case CorePackage.ENTITY_TYPE__IS_ABSTRACT:
				return getIsAbstract();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.ENTITY_TYPE__PLAYS_ROLE:
				getPlaysRole().clear();
				getPlaysRole().addAll((Collection<? extends Role>)newValue);
				return;
			case CorePackage.ENTITY_TYPE__REDECLARATIONS:
				getRedeclarations().clear();
				getRedeclarations().addAll((Collection<? extends Redeclaration>)newValue);
				return;
			case CorePackage.ENTITY_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CorePackage.ENTITY_TYPE__PLAYS_RANGE_ROLE:
				getPlaysRangeRole().clear();
				getPlaysRangeRole().addAll((Collection<? extends RangeRole>)newValue);
				return;
			case CorePackage.ENTITY_TYPE__DECLARES:
				setDeclares((SingleEntityType)newValue);
				return;
			case CorePackage.ENTITY_TYPE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends Extent>)newValue);
				return;
			case CorePackage.ENTITY_TYPE__INVERTIBLE_ATTRIBUTES:
				getInvertibleAttributes().clear();
				getInvertibleAttributes().addAll((Collection<? extends InvertibleAttribute>)newValue);
				return;
			case CorePackage.ENTITY_TYPE__PLAYS_DOMAIN_ROLE:
				getPlaysDomainRole().clear();
				getPlaysDomainRole().addAll((Collection<? extends DomainRole>)newValue);
				return;
			case CorePackage.ENTITY_TYPE__UNIQUE_RULES:
				getUniqueRules().clear();
				getUniqueRules().addAll((Collection<? extends UniqueRule>)newValue);
				return;
			case CorePackage.ENTITY_TYPE__USED_IN:
				getUsedIn().clear();
				getUsedIn().addAll((Collection<? extends InvertibleAttribute>)newValue);
				return;
			case CorePackage.ENTITY_TYPE__SUBTYPE_OF:
				getSubtypeOf().clear();
				getSubtypeOf().addAll((Collection<? extends EntityType>)newValue);
				return;
			case CorePackage.ENTITY_TYPE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.ENTITY_TYPE__PLAYS_ROLE:
				getPlaysRole().clear();
				return;
			case CorePackage.ENTITY_TYPE__REDECLARATIONS:
				getRedeclarations().clear();
				return;
			case CorePackage.ENTITY_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case CorePackage.ENTITY_TYPE__PLAYS_RANGE_ROLE:
				getPlaysRangeRole().clear();
				return;
			case CorePackage.ENTITY_TYPE__DECLARES:
				setDeclares((SingleEntityType)null);
				return;
			case CorePackage.ENTITY_TYPE__EXTENSION:
				getExtension().clear();
				return;
			case CorePackage.ENTITY_TYPE__INVERTIBLE_ATTRIBUTES:
				getInvertibleAttributes().clear();
				return;
			case CorePackage.ENTITY_TYPE__PLAYS_DOMAIN_ROLE:
				getPlaysDomainRole().clear();
				return;
			case CorePackage.ENTITY_TYPE__UNIQUE_RULES:
				getUniqueRules().clear();
				return;
			case CorePackage.ENTITY_TYPE__USED_IN:
				getUsedIn().clear();
				return;
			case CorePackage.ENTITY_TYPE__SUBTYPE_OF:
				getSubtypeOf().clear();
				return;
			case CorePackage.ENTITY_TYPE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.ENTITY_TYPE__PLAYS_ROLE:
				return playsRole != null && !playsRole.isEmpty();
			case CorePackage.ENTITY_TYPE__REDECLARATIONS:
				return redeclarations != null && !redeclarations.isEmpty();
			case CorePackage.ENTITY_TYPE__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case CorePackage.ENTITY_TYPE__PLAYS_RANGE_ROLE:
				return playsRangeRole != null && !playsRangeRole.isEmpty();
			case CorePackage.ENTITY_TYPE__DECLARES:
				return declares != null;
			case CorePackage.ENTITY_TYPE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case CorePackage.ENTITY_TYPE__INVERTIBLE_ATTRIBUTES:
				return invertibleAttributes != null && !invertibleAttributes.isEmpty();
			case CorePackage.ENTITY_TYPE__PLAYS_DOMAIN_ROLE:
				return playsDomainRole != null && !playsDomainRole.isEmpty();
			case CorePackage.ENTITY_TYPE__UNIQUE_RULES:
				return uniqueRules != null && !uniqueRules.isEmpty();
			case CorePackage.ENTITY_TYPE__USED_IN:
				return usedIn != null && !usedIn.isEmpty();
			case CorePackage.ENTITY_TYPE__SUBTYPE_OF:
				return subtypeOf != null && !subtypeOf.isEmpty();
			case CorePackage.ENTITY_TYPE__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //EntityTypeImpl
