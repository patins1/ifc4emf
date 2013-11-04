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
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.InterfacedElement;
import org.ifc4emf.metamodel.express.core.Schema;
import org.ifc4emf.metamodel.express.core.SchemaElement;
import org.ifc4emf.metamodel.express.core.ScopedId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interfaced Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InterfacedElementImpl#getInterfacingSchema <em>Interfacing Schema</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InterfacedElementImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InterfacedElementImpl#getIsUSE <em>Is USE</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.InterfacedElementImpl#getInterfacedId <em>Interfaced Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfacedElementImpl extends EObjectImpl implements InterfacedElement {
	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected SchemaElement refersTo;

	/**
	 * The default value of the '{@link #getIsUSE() <em>Is USE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUSE()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUSE() <em>Is USE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUSE()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUSE = IS_USE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfacedId() <em>Interfaced Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacedId()
	 * @generated
	 * @ordered
	 */
	protected ScopedId interfacedId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfacedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INTERFACED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getInterfacingSchema() {
		if (eContainerFeatureID() != CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA) return null;
		return (Schema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfacingSchema(Schema newInterfacingSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterfacingSchema, CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfacingSchema(Schema newInterfacingSchema) {
		if (newInterfacingSchema != eInternalContainer() || (eContainerFeatureID() != CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA && newInterfacingSchema != null)) {
			if (EcoreUtil.isAncestor(this, newInterfacingSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterfacingSchema != null)
				msgs = ((InternalEObject)newInterfacingSchema).eInverseAdd(this, CorePackage.SCHEMA__INTERFACES, Schema.class, msgs);
			msgs = basicSetInterfacingSchema(newInterfacingSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA, newInterfacingSchema, newInterfacingSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaElement getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (SchemaElement)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.INTERFACED_ELEMENT__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaElement basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefersTo(SchemaElement newRefersTo, NotificationChain msgs) {
		SchemaElement oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INTERFACED_ELEMENT__REFERS_TO, oldRefersTo, newRefersTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(SchemaElement newRefersTo) {
		if (newRefersTo != refersTo) {
			NotificationChain msgs = null;
			if (refersTo != null)
				msgs = ((InternalEObject)refersTo).eInverseRemove(this, CorePackage.SCHEMA_ELEMENT__REFERENCED_AS, SchemaElement.class, msgs);
			if (newRefersTo != null)
				msgs = ((InternalEObject)newRefersTo).eInverseAdd(this, CorePackage.SCHEMA_ELEMENT__REFERENCED_AS, SchemaElement.class, msgs);
			msgs = basicSetRefersTo(newRefersTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERFACED_ELEMENT__REFERS_TO, newRefersTo, newRefersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsUSE() {
		return isUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUSE(Boolean newIsUSE) {
		Boolean oldIsUSE = isUSE;
		isUSE = newIsUSE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERFACED_ELEMENT__IS_USE, oldIsUSE, isUSE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedId getInterfacedId() {
		return interfacedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfacedId(ScopedId newInterfacedId, NotificationChain msgs) {
		ScopedId oldInterfacedId = interfacedId;
		interfacedId = newInterfacedId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INTERFACED_ELEMENT__INTERFACED_ID, oldInterfacedId, newInterfacedId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfacedId(ScopedId newInterfacedId) {
		if (newInterfacedId != interfacedId) {
			NotificationChain msgs = null;
			if (interfacedId != null)
				msgs = ((InternalEObject)interfacedId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.INTERFACED_ELEMENT__INTERFACED_ID, null, msgs);
			if (newInterfacedId != null)
				msgs = ((InternalEObject)newInterfacedId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.INTERFACED_ELEMENT__INTERFACED_ID, null, msgs);
			msgs = basicSetInterfacedId(newInterfacedId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERFACED_ELEMENT__INTERFACED_ID, newInterfacedId, newInterfacedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterfacingSchema((Schema)otherEnd, msgs);
			case CorePackage.INTERFACED_ELEMENT__REFERS_TO:
				if (refersTo != null)
					msgs = ((InternalEObject)refersTo).eInverseRemove(this, CorePackage.SCHEMA_ELEMENT__REFERENCED_AS, SchemaElement.class, msgs);
				return basicSetRefersTo((SchemaElement)otherEnd, msgs);
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
			case CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA:
				return basicSetInterfacingSchema(null, msgs);
			case CorePackage.INTERFACED_ELEMENT__REFERS_TO:
				return basicSetRefersTo(null, msgs);
			case CorePackage.INTERFACED_ELEMENT__INTERFACED_ID:
				return basicSetInterfacedId(null, msgs);
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
			case CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA:
				return eInternalContainer().eInverseRemove(this, CorePackage.SCHEMA__INTERFACES, Schema.class, msgs);
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
			case CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA:
				return getInterfacingSchema();
			case CorePackage.INTERFACED_ELEMENT__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case CorePackage.INTERFACED_ELEMENT__IS_USE:
				return getIsUSE();
			case CorePackage.INTERFACED_ELEMENT__INTERFACED_ID:
				return getInterfacedId();
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
			case CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA:
				setInterfacingSchema((Schema)newValue);
				return;
			case CorePackage.INTERFACED_ELEMENT__REFERS_TO:
				setRefersTo((SchemaElement)newValue);
				return;
			case CorePackage.INTERFACED_ELEMENT__IS_USE:
				setIsUSE((Boolean)newValue);
				return;
			case CorePackage.INTERFACED_ELEMENT__INTERFACED_ID:
				setInterfacedId((ScopedId)newValue);
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
			case CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA:
				setInterfacingSchema((Schema)null);
				return;
			case CorePackage.INTERFACED_ELEMENT__REFERS_TO:
				setRefersTo((SchemaElement)null);
				return;
			case CorePackage.INTERFACED_ELEMENT__IS_USE:
				setIsUSE(IS_USE_EDEFAULT);
				return;
			case CorePackage.INTERFACED_ELEMENT__INTERFACED_ID:
				setInterfacedId((ScopedId)null);
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
			case CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA:
				return getInterfacingSchema() != null;
			case CorePackage.INTERFACED_ELEMENT__REFERS_TO:
				return refersTo != null;
			case CorePackage.INTERFACED_ELEMENT__IS_USE:
				return IS_USE_EDEFAULT == null ? isUSE != null : !IS_USE_EDEFAULT.equals(isUSE);
			case CorePackage.INTERFACED_ELEMENT__INTERFACED_ID:
				return interfacedId != null;
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
		result.append(" (isUSE: ");
		result.append(isUSE);
		result.append(')');
		return result.toString();
	}

} //InterfacedElementImpl
