/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.impl;

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
import org.ifc4emf.metamodel.express.algorithms.ActualDataType;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.algorithms.GenericElement;
import org.ifc4emf.metamodel.express.algorithms.Parameter;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.Remark;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.core.ScopedId;
import org.ifc4emf.metamodel.express.core.impl.GenericTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualDataTypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualDataTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualDataTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualDataTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.ActualDataTypeImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActualDataTypeImpl extends GenericTypeImpl implements ActualDataType {
	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected Scope namespace;

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
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected ScopedId id;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Parameter source;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected ScopedId label;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActualDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmsPackage.Literals.ACTUAL_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getNamespace() {
		if (namespace != null && namespace.eIsProxy()) {
			InternalEObject oldNamespace = (InternalEObject)namespace;
			namespace = (Scope)eResolveProxy(oldNamespace);
			if (namespace != oldNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.ACTUAL_DATA_TYPE__NAMESPACE, oldNamespace, namespace));
			}
		}
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope basicGetNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Scope newNamespace, NotificationChain msgs) {
		Scope oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_DATA_TYPE__NAMESPACE, oldNamespace, newNamespace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Scope newNamespace) {
		if (newNamespace != namespace) {
			NotificationChain msgs = null;
			if (namespace != null)
				msgs = ((InternalEObject)namespace).eInverseRemove(this, CorePackage.SCOPE__NAMED_ELEMENTS, Scope.class, msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, CorePackage.SCOPE__NAMED_ELEMENTS, Scope.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_DATA_TYPE__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Remark> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectWithInverseResolvingEList.ManyInverse<Remark>(Remark.class, this, AlgorithmsPackage.ACTUAL_DATA_TYPE__DOCUMENTATION, CorePackage.REMARK__DESCRIBES_ELEMENT);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedId getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(ScopedId newId, NotificationChain msgs) {
		ScopedId oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_DATA_TYPE__ID, oldId, newId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(ScopedId newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_DATA_TYPE__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_DATA_TYPE__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_DATA_TYPE__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Parameter)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmsPackage.ACTUAL_DATA_TYPE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Parameter newSource) {
		Parameter oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_DATA_TYPE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedId getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(ScopedId newLabel, NotificationChain msgs) {
		ScopedId oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_DATA_TYPE__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(ScopedId newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_DATA_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgorithmsPackage.ACTUAL_DATA_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.ACTUAL_DATA_TYPE__LABEL, newLabel, newLabel));
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
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__NAMESPACE:
				if (namespace != null)
					msgs = ((InternalEObject)namespace).eInverseRemove(this, CorePackage.SCOPE__NAMED_ELEMENTS, Scope.class, msgs);
				return basicSetNamespace((Scope)otherEnd, msgs);
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__DOCUMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentation()).basicAdd(otherEnd, msgs);
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
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__ID:
				return basicSetId(null, msgs);
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__LABEL:
				return basicSetLabel(null, msgs);
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
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__DOCUMENTATION:
				return getDocumentation();
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__ID:
				return getId();
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__LABEL:
				return getLabel();
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
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__NAMESPACE:
				setNamespace((Scope)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Remark>)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__ID:
				setId((ScopedId)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__SOURCE:
				setSource((Parameter)newValue);
				return;
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__LABEL:
				setLabel((ScopedId)newValue);
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
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__NAMESPACE:
				setNamespace((Scope)null);
				return;
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__ID:
				setId((ScopedId)null);
				return;
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__SOURCE:
				setSource((Parameter)null);
				return;
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__LABEL:
				setLabel((ScopedId)null);
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
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__NAMESPACE:
				return namespace != null;
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__ID:
				return id != null;
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__SOURCE:
				return source != null;
			case AlgorithmsPackage.ACTUAL_DATA_TYPE__LABEL:
				return label != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case AlgorithmsPackage.ACTUAL_DATA_TYPE__NAMESPACE: return CorePackage.NAMED_ELEMENT__NAMESPACE;
				case AlgorithmsPackage.ACTUAL_DATA_TYPE__DOCUMENTATION: return CorePackage.NAMED_ELEMENT__DOCUMENTATION;
				case AlgorithmsPackage.ACTUAL_DATA_TYPE__ID: return CorePackage.NAMED_ELEMENT__ID;
				default: return -1;
			}
		}
		if (baseClass == LocalElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GenericElement.class) {
			switch (derivedFeatureID) {
				case AlgorithmsPackage.ACTUAL_DATA_TYPE__SOURCE: return AlgorithmsPackage.GENERIC_ELEMENT__SOURCE;
				case AlgorithmsPackage.ACTUAL_DATA_TYPE__LABEL: return AlgorithmsPackage.GENERIC_ELEMENT__LABEL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAMESPACE: return AlgorithmsPackage.ACTUAL_DATA_TYPE__NAMESPACE;
				case CorePackage.NAMED_ELEMENT__DOCUMENTATION: return AlgorithmsPackage.ACTUAL_DATA_TYPE__DOCUMENTATION;
				case CorePackage.NAMED_ELEMENT__ID: return AlgorithmsPackage.ACTUAL_DATA_TYPE__ID;
				default: return -1;
			}
		}
		if (baseClass == LocalElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GenericElement.class) {
			switch (baseFeatureID) {
				case AlgorithmsPackage.GENERIC_ELEMENT__SOURCE: return AlgorithmsPackage.ACTUAL_DATA_TYPE__SOURCE;
				case AlgorithmsPackage.GENERIC_ELEMENT__LABEL: return AlgorithmsPackage.ACTUAL_DATA_TYPE__LABEL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActualDataTypeImpl
