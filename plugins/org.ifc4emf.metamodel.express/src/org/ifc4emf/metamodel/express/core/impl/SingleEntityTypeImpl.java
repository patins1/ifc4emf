/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.ExplicitAttribute;
import org.ifc4emf.metamodel.express.core.PartialEntityType;
import org.ifc4emf.metamodel.express.core.ScopedId;
import org.ifc4emf.metamodel.express.core.SingleEntityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SingleEntityTypeImpl#getDeclaresExplicitAttribute <em>Declares Explicit Attribute</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SingleEntityTypeImpl#getDeclaresAttribute <em>Declares Attribute</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SingleEntityTypeImpl#getDeclaredIn <em>Declared In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SingleEntityTypeImpl#getEquivalent <em>Equivalent</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SingleEntityTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleEntityTypeImpl extends EObjectImpl implements SingleEntityType {
	/**
	 * The cached value of the '{@link #getDeclaresExplicitAttribute() <em>Declares Explicit Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaresExplicitAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplicitAttribute> declaresExplicitAttribute;

	/**
	 * The cached value of the '{@link #getDeclaresAttribute() <em>Declares Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaresAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> declaresAttribute;

	/**
	 * The cached value of the '{@link #getEquivalent() <em>Equivalent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalent()
	 * @generated
	 * @ordered
	 */
	protected PartialEntityType equivalent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleEntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SINGLE_ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplicitAttribute> getDeclaresExplicitAttribute() {
		if (declaresExplicitAttribute == null) {
			declaresExplicitAttribute = new EObjectResolvingEList<ExplicitAttribute>(ExplicitAttribute.class, this, CorePackage.SINGLE_ENTITY_TYPE__DECLARES_EXPLICIT_ATTRIBUTE);
		}
		return declaresExplicitAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getDeclaresAttribute() {
		if (declaresAttribute == null) {
			declaresAttribute = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, CorePackage.SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE, CorePackage.ATTRIBUTE__OF_ENTITY);
		}
		return declaresAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getDeclaredIn() {
		if (eContainerFeatureID() != CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN) return null;
		return (EntityType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaredIn(EntityType newDeclaredIn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDeclaredIn, CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredIn(EntityType newDeclaredIn) {
		if (newDeclaredIn != eInternalContainer() || (eContainerFeatureID() != CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN && newDeclaredIn != null)) {
			if (EcoreUtil.isAncestor(this, newDeclaredIn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeclaredIn != null)
				msgs = ((InternalEObject)newDeclaredIn).eInverseAdd(this, CorePackage.ENTITY_TYPE__DECLARES, EntityType.class, msgs);
			msgs = basicSetDeclaredIn(newDeclaredIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN, newDeclaredIn, newDeclaredIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialEntityType getEquivalent() {
		if (equivalent != null && equivalent.eIsProxy()) {
			InternalEObject oldEquivalent = (InternalEObject)equivalent;
			equivalent = (PartialEntityType)eResolveProxy(oldEquivalent);
			if (equivalent != oldEquivalent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.SINGLE_ENTITY_TYPE__EQUIVALENT, oldEquivalent, equivalent));
			}
		}
		return equivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialEntityType basicGetEquivalent() {
		return equivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquivalent(PartialEntityType newEquivalent) {
		PartialEntityType oldEquivalent = equivalent;
		equivalent = newEquivalent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SINGLE_ENTITY_TYPE__EQUIVALENT, oldEquivalent, equivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ScopedId getId() {
		return getDeclaredIn().getId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(ScopedId newId, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Id' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(ScopedId newId) {
		// TODO: implement this method to set the 'Id' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeclaresAttribute()).basicAdd(otherEnd, msgs);
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeclaredIn((EntityType)otherEnd, msgs);
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
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE:
				return ((InternalEList<?>)getDeclaresAttribute()).basicRemove(otherEnd, msgs);
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN:
				return basicSetDeclaredIn(null, msgs);
			case CorePackage.SINGLE_ENTITY_TYPE__ID:
				return basicSetId(null, msgs);
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
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN:
				return eInternalContainer().eInverseRemove(this, CorePackage.ENTITY_TYPE__DECLARES, EntityType.class, msgs);
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
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARES_EXPLICIT_ATTRIBUTE:
				return getDeclaresExplicitAttribute();
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE:
				return getDeclaresAttribute();
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN:
				return getDeclaredIn();
			case CorePackage.SINGLE_ENTITY_TYPE__EQUIVALENT:
				if (resolve) return getEquivalent();
				return basicGetEquivalent();
			case CorePackage.SINGLE_ENTITY_TYPE__ID:
				return getId();
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
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARES_EXPLICIT_ATTRIBUTE:
				getDeclaresExplicitAttribute().clear();
				getDeclaresExplicitAttribute().addAll((Collection<? extends ExplicitAttribute>)newValue);
				return;
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE:
				getDeclaresAttribute().clear();
				getDeclaresAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN:
				setDeclaredIn((EntityType)newValue);
				return;
			case CorePackage.SINGLE_ENTITY_TYPE__EQUIVALENT:
				setEquivalent((PartialEntityType)newValue);
				return;
			case CorePackage.SINGLE_ENTITY_TYPE__ID:
				setId((ScopedId)newValue);
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
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARES_EXPLICIT_ATTRIBUTE:
				getDeclaresExplicitAttribute().clear();
				return;
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE:
				getDeclaresAttribute().clear();
				return;
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN:
				setDeclaredIn((EntityType)null);
				return;
			case CorePackage.SINGLE_ENTITY_TYPE__EQUIVALENT:
				setEquivalent((PartialEntityType)null);
				return;
			case CorePackage.SINGLE_ENTITY_TYPE__ID:
				setId((ScopedId)null);
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
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARES_EXPLICIT_ATTRIBUTE:
				return declaresExplicitAttribute != null && !declaresExplicitAttribute.isEmpty();
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARES_ATTRIBUTE:
				return declaresAttribute != null && !declaresAttribute.isEmpty();
			case CorePackage.SINGLE_ENTITY_TYPE__DECLARED_IN:
				return getDeclaredIn() != null;
			case CorePackage.SINGLE_ENTITY_TYPE__EQUIVALENT:
				return equivalent != null;
			case CorePackage.SINGLE_ENTITY_TYPE__ID:
				return getId() != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleEntityTypeImpl
