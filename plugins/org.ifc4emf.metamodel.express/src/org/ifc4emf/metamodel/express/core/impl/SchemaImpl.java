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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.InterfacedElement;
import org.ifc4emf.metamodel.express.core.Remark;
import org.ifc4emf.metamodel.express.core.Schema;
import org.ifc4emf.metamodel.express.core.SchemaElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SchemaImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SchemaImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SchemaImpl#getSchemaElements <em>Schema Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SchemaImpl#getInterfacedElements <em>Interfaced Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.SchemaImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends ScopeImpl implements Schema {
	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Remark> documentation;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfacedElement> interfaces;

	/**
	 * The cached value of the '{@link #getSchemaElements() <em>Schema Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemaElement> schemaElements;

	/**
	 * The cached value of the '{@link #getInterfacedElements() <em>Interfaced Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemaElement> interfacedElements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Remark> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectWithInverseResolvingEList.ManyInverse<Remark>(Remark.class, this, CorePackage.SCHEMA__DOCUMENTATION, CorePackage.REMARK__DESCRIBES_SCHEMA);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfacedElement> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentWithInverseEList<InterfacedElement>(InterfacedElement.class, this, CorePackage.SCHEMA__INTERFACES, CorePackage.INTERFACED_ELEMENT__INTERFACING_SCHEMA);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchemaElement> getSchemaElements() {
		if (schemaElements == null) {
			schemaElements = new EObjectContainmentWithInverseEList<SchemaElement>(SchemaElement.class, this, CorePackage.SCHEMA__SCHEMA_ELEMENTS, CorePackage.SCHEMA_ELEMENT__DEFINED_IN);
		}
		return schemaElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchemaElement> getInterfacedElements() {
		if (interfacedElements == null) {
			interfacedElements = new EObjectWithInverseResolvingEList.ManyInverse<SchemaElement>(SchemaElement.class, this, CorePackage.SCHEMA__INTERFACED_ELEMENTS, CorePackage.SCHEMA_ELEMENT__REFERENCED_IN);
		}
		return interfacedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__VERSION, oldVersion, version));
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
			case CorePackage.SCHEMA__DOCUMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentation()).basicAdd(otherEnd, msgs);
			case CorePackage.SCHEMA__INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaces()).basicAdd(otherEnd, msgs);
			case CorePackage.SCHEMA__SCHEMA_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchemaElements()).basicAdd(otherEnd, msgs);
			case CorePackage.SCHEMA__INTERFACED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfacedElements()).basicAdd(otherEnd, msgs);
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
			case CorePackage.SCHEMA__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CorePackage.SCHEMA__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case CorePackage.SCHEMA__SCHEMA_ELEMENTS:
				return ((InternalEList<?>)getSchemaElements()).basicRemove(otherEnd, msgs);
			case CorePackage.SCHEMA__INTERFACED_ELEMENTS:
				return ((InternalEList<?>)getInterfacedElements()).basicRemove(otherEnd, msgs);
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
			case CorePackage.SCHEMA__DOCUMENTATION:
				return getDocumentation();
			case CorePackage.SCHEMA__INTERFACES:
				return getInterfaces();
			case CorePackage.SCHEMA__SCHEMA_ELEMENTS:
				return getSchemaElements();
			case CorePackage.SCHEMA__INTERFACED_ELEMENTS:
				return getInterfacedElements();
			case CorePackage.SCHEMA__NAME:
				return getName();
			case CorePackage.SCHEMA__VERSION:
				return getVersion();
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
			case CorePackage.SCHEMA__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Remark>)newValue);
				return;
			case CorePackage.SCHEMA__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends InterfacedElement>)newValue);
				return;
			case CorePackage.SCHEMA__SCHEMA_ELEMENTS:
				getSchemaElements().clear();
				getSchemaElements().addAll((Collection<? extends SchemaElement>)newValue);
				return;
			case CorePackage.SCHEMA__INTERFACED_ELEMENTS:
				getInterfacedElements().clear();
				getInterfacedElements().addAll((Collection<? extends SchemaElement>)newValue);
				return;
			case CorePackage.SCHEMA__NAME:
				setName((String)newValue);
				return;
			case CorePackage.SCHEMA__VERSION:
				setVersion((String)newValue);
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
			case CorePackage.SCHEMA__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CorePackage.SCHEMA__INTERFACES:
				getInterfaces().clear();
				return;
			case CorePackage.SCHEMA__SCHEMA_ELEMENTS:
				getSchemaElements().clear();
				return;
			case CorePackage.SCHEMA__INTERFACED_ELEMENTS:
				getInterfacedElements().clear();
				return;
			case CorePackage.SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.SCHEMA__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case CorePackage.SCHEMA__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case CorePackage.SCHEMA__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case CorePackage.SCHEMA__SCHEMA_ELEMENTS:
				return schemaElements != null && !schemaElements.isEmpty();
			case CorePackage.SCHEMA__INTERFACED_ELEMENTS:
				return interfacedElements != null && !interfacedElements.isEmpty();
			case CorePackage.SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.SCHEMA__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
