/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.Redeclaration;
import org.ifc4emf.metamodel.express.core.Role;
import org.ifc4emf.metamodel.express.core.ScopedId;
import org.ifc4emf.metamodel.express.core.SizeConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redeclaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl#getDerivation <em>Derivation</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl#getRestrictedType <em>Restricted Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl#getOriginalAttribute <em>Original Attribute</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl#getRefinedRole <em>Refined Role</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl#getIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RedeclarationImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedeclarationImpl extends EObjectImpl implements Redeclaration {
	/**
	 * The cached value of the '{@link #getDerivation() <em>Derivation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected Expression derivation;

	/**
	 * The cached value of the '{@link #getRestrictedType() <em>Restricted Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictedType()
	 * @generated
	 * @ordered
	 */
	protected AttributeType restrictedType;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected Redeclaration refines;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected SizeConstraint upperBound;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected SizeConstraint lowerBound;

	/**
	 * The cached value of the '{@link #getOriginalAttribute() <em>Original Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute originalAttribute;

	/**
	 * The cached value of the '{@link #getRefinedRole() <em>Refined Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedRole()
	 * @generated
	 * @ordered
	 */
	protected Role refinedRole;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Integer position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MANDATORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected ScopedId alias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REDECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDerivation() {
		if (derivation != null && derivation.eIsProxy()) {
			InternalEObject oldDerivation = (InternalEObject)derivation;
			derivation = (Expression)eResolveProxy(oldDerivation);
			if (derivation != oldDerivation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.REDECLARATION__DERIVATION, oldDerivation, derivation));
			}
		}
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetDerivation() {
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivation(Expression newDerivation) {
		Expression oldDerivation = derivation;
		derivation = newDerivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__DERIVATION, oldDerivation, derivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType getRestrictedType() {
		if (restrictedType != null && restrictedType.eIsProxy()) {
			InternalEObject oldRestrictedType = (InternalEObject)restrictedType;
			restrictedType = (AttributeType)eResolveProxy(oldRestrictedType);
			if (restrictedType != oldRestrictedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.REDECLARATION__RESTRICTED_TYPE, oldRestrictedType, restrictedType));
			}
		}
		return restrictedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType basicGetRestrictedType() {
		return restrictedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictedType(AttributeType newRestrictedType) {
		AttributeType oldRestrictedType = restrictedType;
		restrictedType = newRestrictedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__RESTRICTED_TYPE, oldRestrictedType, restrictedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Redeclaration getRefines() {
		if (refines != null && refines.eIsProxy()) {
			InternalEObject oldRefines = (InternalEObject)refines;
			refines = (Redeclaration)eResolveProxy(oldRefines);
			if (refines != oldRefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.REDECLARATION__REFINES, oldRefines, refines));
			}
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Redeclaration basicGetRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(Redeclaration newRefines) {
		Redeclaration oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__REFINES, oldRefines, refines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(SizeConstraint newUpperBound, NotificationChain msgs) {
		SizeConstraint oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(SizeConstraint newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.REDECLARATION__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.REDECLARATION__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeConstraint getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBound(SizeConstraint newLowerBound, NotificationChain msgs) {
		SizeConstraint oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__LOWER_BOUND, oldLowerBound, newLowerBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(SizeConstraint newLowerBound) {
		if (newLowerBound != lowerBound) {
			NotificationChain msgs = null;
			if (lowerBound != null)
				msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.REDECLARATION__LOWER_BOUND, null, msgs);
			if (newLowerBound != null)
				msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.REDECLARATION__LOWER_BOUND, null, msgs);
			msgs = basicSetLowerBound(newLowerBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__LOWER_BOUND, newLowerBound, newLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getScope() {
		if (eContainerFeatureID() != CorePackage.REDECLARATION__SCOPE) return null;
		return (EntityType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(EntityType newScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScope, CorePackage.REDECLARATION__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(EntityType newScope) {
		if (newScope != eInternalContainer() || (eContainerFeatureID() != CorePackage.REDECLARATION__SCOPE && newScope != null)) {
			if (EcoreUtil.isAncestor(this, newScope))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, CorePackage.ENTITY_TYPE__REDECLARATIONS, EntityType.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getOriginalAttribute() {
		if (originalAttribute != null && originalAttribute.eIsProxy()) {
			InternalEObject oldOriginalAttribute = (InternalEObject)originalAttribute;
			originalAttribute = (Attribute)eResolveProxy(oldOriginalAttribute);
			if (originalAttribute != oldOriginalAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.REDECLARATION__ORIGINAL_ATTRIBUTE, oldOriginalAttribute, originalAttribute));
			}
		}
		return originalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetOriginalAttribute() {
		return originalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalAttribute(Attribute newOriginalAttribute) {
		Attribute oldOriginalAttribute = originalAttribute;
		originalAttribute = newOriginalAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__ORIGINAL_ATTRIBUTE, oldOriginalAttribute, originalAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRefinedRole() {
		if (refinedRole != null && refinedRole.eIsProxy()) {
			InternalEObject oldRefinedRole = (InternalEObject)refinedRole;
			refinedRole = (Role)eResolveProxy(oldRefinedRole);
			if (refinedRole != oldRefinedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.REDECLARATION__REFINED_ROLE, oldRefinedRole, refinedRole));
			}
		}
		return refinedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRefinedRole() {
		return refinedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedRole(Role newRefinedRole) {
		Role oldRefinedRole = refinedRole;
		refinedRole = newRefinedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__REFINED_ROLE, oldRefinedRole, refinedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Integer newPosition) {
		Integer oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(Boolean newIsMandatory) {
		Boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__IS_MANDATORY, oldIsMandatory, isMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedId getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlias(ScopedId newAlias, NotificationChain msgs) {
		ScopedId oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__ALIAS, oldAlias, newAlias);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(ScopedId newAlias) {
		if (newAlias != alias) {
			NotificationChain msgs = null;
			if (alias != null)
				msgs = ((InternalEObject)alias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.REDECLARATION__ALIAS, null, msgs);
			if (newAlias != null)
				msgs = ((InternalEObject)newAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.REDECLARATION__ALIAS, null, msgs);
			msgs = basicSetAlias(newAlias, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REDECLARATION__ALIAS, newAlias, newAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.REDECLARATION__SCOPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScope((EntityType)otherEnd, msgs);
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
			case CorePackage.REDECLARATION__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
			case CorePackage.REDECLARATION__LOWER_BOUND:
				return basicSetLowerBound(null, msgs);
			case CorePackage.REDECLARATION__SCOPE:
				return basicSetScope(null, msgs);
			case CorePackage.REDECLARATION__ALIAS:
				return basicSetAlias(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CorePackage.REDECLARATION__SCOPE:
				return eInternalContainer().eInverseRemove(this, CorePackage.ENTITY_TYPE__REDECLARATIONS, EntityType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.REDECLARATION__DERIVATION:
				if (resolve) return getDerivation();
				return basicGetDerivation();
			case CorePackage.REDECLARATION__RESTRICTED_TYPE:
				if (resolve) return getRestrictedType();
				return basicGetRestrictedType();
			case CorePackage.REDECLARATION__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
			case CorePackage.REDECLARATION__UPPER_BOUND:
				return getUpperBound();
			case CorePackage.REDECLARATION__LOWER_BOUND:
				return getLowerBound();
			case CorePackage.REDECLARATION__SCOPE:
				return getScope();
			case CorePackage.REDECLARATION__ORIGINAL_ATTRIBUTE:
				if (resolve) return getOriginalAttribute();
				return basicGetOriginalAttribute();
			case CorePackage.REDECLARATION__REFINED_ROLE:
				if (resolve) return getRefinedRole();
				return basicGetRefinedRole();
			case CorePackage.REDECLARATION__POSITION:
				return getPosition();
			case CorePackage.REDECLARATION__IS_MANDATORY:
				return getIsMandatory();
			case CorePackage.REDECLARATION__ALIAS:
				return getAlias();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.REDECLARATION__DERIVATION:
				setDerivation((Expression)newValue);
				return;
			case CorePackage.REDECLARATION__RESTRICTED_TYPE:
				setRestrictedType((AttributeType)newValue);
				return;
			case CorePackage.REDECLARATION__REFINES:
				setRefines((Redeclaration)newValue);
				return;
			case CorePackage.REDECLARATION__UPPER_BOUND:
				setUpperBound((SizeConstraint)newValue);
				return;
			case CorePackage.REDECLARATION__LOWER_BOUND:
				setLowerBound((SizeConstraint)newValue);
				return;
			case CorePackage.REDECLARATION__SCOPE:
				setScope((EntityType)newValue);
				return;
			case CorePackage.REDECLARATION__ORIGINAL_ATTRIBUTE:
				setOriginalAttribute((Attribute)newValue);
				return;
			case CorePackage.REDECLARATION__REFINED_ROLE:
				setRefinedRole((Role)newValue);
				return;
			case CorePackage.REDECLARATION__POSITION:
				setPosition((Integer)newValue);
				return;
			case CorePackage.REDECLARATION__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case CorePackage.REDECLARATION__ALIAS:
				setAlias((ScopedId)newValue);
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
			case CorePackage.REDECLARATION__DERIVATION:
				setDerivation((Expression)null);
				return;
			case CorePackage.REDECLARATION__RESTRICTED_TYPE:
				setRestrictedType((AttributeType)null);
				return;
			case CorePackage.REDECLARATION__REFINES:
				setRefines((Redeclaration)null);
				return;
			case CorePackage.REDECLARATION__UPPER_BOUND:
				setUpperBound((SizeConstraint)null);
				return;
			case CorePackage.REDECLARATION__LOWER_BOUND:
				setLowerBound((SizeConstraint)null);
				return;
			case CorePackage.REDECLARATION__SCOPE:
				setScope((EntityType)null);
				return;
			case CorePackage.REDECLARATION__ORIGINAL_ATTRIBUTE:
				setOriginalAttribute((Attribute)null);
				return;
			case CorePackage.REDECLARATION__REFINED_ROLE:
				setRefinedRole((Role)null);
				return;
			case CorePackage.REDECLARATION__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case CorePackage.REDECLARATION__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case CorePackage.REDECLARATION__ALIAS:
				setAlias((ScopedId)null);
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
			case CorePackage.REDECLARATION__DERIVATION:
				return derivation != null;
			case CorePackage.REDECLARATION__RESTRICTED_TYPE:
				return restrictedType != null;
			case CorePackage.REDECLARATION__REFINES:
				return refines != null;
			case CorePackage.REDECLARATION__UPPER_BOUND:
				return upperBound != null;
			case CorePackage.REDECLARATION__LOWER_BOUND:
				return lowerBound != null;
			case CorePackage.REDECLARATION__SCOPE:
				return getScope() != null;
			case CorePackage.REDECLARATION__ORIGINAL_ATTRIBUTE:
				return originalAttribute != null;
			case CorePackage.REDECLARATION__REFINED_ROLE:
				return refinedRole != null;
			case CorePackage.REDECLARATION__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case CorePackage.REDECLARATION__IS_MANDATORY:
				return IS_MANDATORY_EDEFAULT == null ? isMandatory != null : !IS_MANDATORY_EDEFAULT.equals(isMandatory);
			case CorePackage.REDECLARATION__ALIAS:
				return alias != null;
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
		result.append(" (position: ");
		result.append(position);
		result.append(", isMandatory: ");
		result.append(isMandatory);
		result.append(')');
		return result.toString();
	}

} //RedeclarationImpl
