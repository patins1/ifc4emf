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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.InterfacedElement;
import org.ifc4emf.metamodel.express.core.Schema;
import org.ifc4emf.metamodel.express.core.SchemaElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SchemaElementImpl#getReferencedAs <em>Referenced As</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SchemaElementImpl#getReferencedIn <em>Referenced In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SchemaElementImpl#getDefinedIn <em>Defined In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SchemaElementImpl extends NamedElementImpl implements SchemaElement {
	/**
	 * The cached value of the '{@link #getReferencedAs() <em>Referenced As</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedAs()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfacedElement> referencedAs;

	/**
	 * The cached value of the '{@link #getReferencedIn() <em>Referenced In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> referencedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SCHEMA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfacedElement> getReferencedAs() {
		if (referencedAs == null) {
			referencedAs = new EObjectWithInverseResolvingEList<InterfacedElement>(InterfacedElement.class, this, CorePackage.SCHEMA_ELEMENT__REFERENCED_AS, CorePackage.INTERFACED_ELEMENT__REFERS_TO);
		}
		return referencedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getReferencedIn() {
		if (referencedIn == null) {
			referencedIn = new EObjectWithInverseResolvingEList.ManyInverse<Schema>(Schema.class, this, CorePackage.SCHEMA_ELEMENT__REFERENCED_IN, CorePackage.SCHEMA__INTERFACED_ELEMENTS);
		}
		return referencedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getDefinedIn() {
		if (eContainerFeatureID() != CorePackage.SCHEMA_ELEMENT__DEFINED_IN) return null;
		return (Schema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedIn(Schema newDefinedIn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDefinedIn, CorePackage.SCHEMA_ELEMENT__DEFINED_IN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedIn(Schema newDefinedIn) {
		if (newDefinedIn != eInternalContainer() || (eContainerFeatureID() != CorePackage.SCHEMA_ELEMENT__DEFINED_IN && newDefinedIn != null)) {
			if (EcoreUtil.isAncestor(this, newDefinedIn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDefinedIn != null)
				msgs = ((InternalEObject)newDefinedIn).eInverseAdd(this, CorePackage.SCHEMA__SCHEMA_ELEMENTS, Schema.class, msgs);
			msgs = basicSetDefinedIn(newDefinedIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA_ELEMENT__DEFINED_IN, newDefinedIn, newDefinedIn));
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
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_AS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedAs()).basicAdd(otherEnd, msgs);
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedIn()).basicAdd(otherEnd, msgs);
			case CorePackage.SCHEMA_ELEMENT__DEFINED_IN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDefinedIn((Schema)otherEnd, msgs);
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
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_AS:
				return ((InternalEList<?>)getReferencedAs()).basicRemove(otherEnd, msgs);
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_IN:
				return ((InternalEList<?>)getReferencedIn()).basicRemove(otherEnd, msgs);
			case CorePackage.SCHEMA_ELEMENT__DEFINED_IN:
				return basicSetDefinedIn(null, msgs);
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
			case CorePackage.SCHEMA_ELEMENT__DEFINED_IN:
				return eInternalContainer().eInverseRemove(this, CorePackage.SCHEMA__SCHEMA_ELEMENTS, Schema.class, msgs);
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
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_AS:
				return getReferencedAs();
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_IN:
				return getReferencedIn();
			case CorePackage.SCHEMA_ELEMENT__DEFINED_IN:
				return getDefinedIn();
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
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_AS:
				getReferencedAs().clear();
				getReferencedAs().addAll((Collection<? extends InterfacedElement>)newValue);
				return;
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_IN:
				getReferencedIn().clear();
				getReferencedIn().addAll((Collection<? extends Schema>)newValue);
				return;
			case CorePackage.SCHEMA_ELEMENT__DEFINED_IN:
				setDefinedIn((Schema)newValue);
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
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_AS:
				getReferencedAs().clear();
				return;
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_IN:
				getReferencedIn().clear();
				return;
			case CorePackage.SCHEMA_ELEMENT__DEFINED_IN:
				setDefinedIn((Schema)null);
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
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_AS:
				return referencedAs != null && !referencedAs.isEmpty();
			case CorePackage.SCHEMA_ELEMENT__REFERENCED_IN:
				return referencedIn != null && !referencedIn.isEmpty();
			case CorePackage.SCHEMA_ELEMENT__DEFINED_IN:
				return getDefinedIn() != null;
		}
		return super.eIsSet(featureID);
	}

} //SchemaElementImpl
