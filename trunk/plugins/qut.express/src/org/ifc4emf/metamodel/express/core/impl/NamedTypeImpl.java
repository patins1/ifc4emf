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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.AlgorithmScope;
import org.ifc4emf.metamodel.express.core.CommonElement;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DomainRule;
import org.ifc4emf.metamodel.express.core.InterfacedElement;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.NamedType;
import org.ifc4emf.metamodel.express.core.Remark;
import org.ifc4emf.metamodel.express.core.Schema;
import org.ifc4emf.metamodel.express.core.SchemaElement;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.core.ScopedId;
import org.ifc4emf.metamodel.express.core.SelectType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl#getIncludesRemarks <em>Includes Remarks</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl#getReferencedAs <em>Referenced As</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl#getReferencedIn <em>Referenced In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl#getDefinedIn <em>Defined In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl#getLocalScope <em>Local Scope</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.NamedTypeImpl#getDomainRules <em>Domain Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamedTypeImpl extends InstantiableTypeImpl implements NamedType {
	/**
	 * The cached value of the '{@link #getNamedElements() <em>Named Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> namedElements;

	/**
	 * The cached value of the '{@link #getIncludesRemarks() <em>Includes Remarks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludesRemarks()
	 * @generated
	 * @ordered
	 */
	protected EList<Remark> includesRemarks;

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
	 * The cached value of the '{@link #getLocalScope() <em>Local Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalScope()
	 * @generated
	 * @ordered
	 */
	protected AlgorithmScope localScope;

	/**
	 * The cached value of the '{@link #getInstantiates() <em>Instantiates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiates()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectType> instantiates;

	/**
	 * The cached value of the '{@link #getDomainRules() <em>Domain Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainRules()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainRule> domainRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.NAMED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getNamedElements() {
		if (namedElements == null) {
			namedElements = new EObjectWithInverseResolvingEList<NamedElement>(NamedElement.class, this, CorePackage.NAMED_TYPE__NAMED_ELEMENTS, CorePackage.NAMED_ELEMENT__NAMESPACE);
		}
		return namedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Remark> getIncludesRemarks() {
		if (includesRemarks == null) {
			includesRemarks = new EObjectWithInverseResolvingEList<Remark>(Remark.class, this, CorePackage.NAMED_TYPE__INCLUDES_REMARKS, CorePackage.REMARK__APPEARS_IN);
		}
		return includesRemarks;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.NAMED_TYPE__NAMESPACE, oldNamespace, namespace));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.NAMED_TYPE__NAMESPACE, oldNamespace, newNamespace);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAMED_TYPE__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Remark> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectWithInverseResolvingEList.ManyInverse<Remark>(Remark.class, this, CorePackage.NAMED_TYPE__DOCUMENTATION, CorePackage.REMARK__DESCRIBES_ELEMENT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.NAMED_TYPE__ID, oldId, newId);
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
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.NAMED_TYPE__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.NAMED_TYPE__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAMED_TYPE__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfacedElement> getReferencedAs() {
		if (referencedAs == null) {
			referencedAs = new EObjectWithInverseResolvingEList<InterfacedElement>(InterfacedElement.class, this, CorePackage.NAMED_TYPE__REFERENCED_AS, CorePackage.INTERFACED_ELEMENT__REFERS_TO);
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
			referencedIn = new EObjectWithInverseResolvingEList.ManyInverse<Schema>(Schema.class, this, CorePackage.NAMED_TYPE__REFERENCED_IN, CorePackage.SCHEMA__INTERFACED_ELEMENTS);
		}
		return referencedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getDefinedIn() {
		if (eContainerFeatureID() != CorePackage.NAMED_TYPE__DEFINED_IN) return null;
		return (Schema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedIn(Schema newDefinedIn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDefinedIn, CorePackage.NAMED_TYPE__DEFINED_IN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedIn(Schema newDefinedIn) {
		if (newDefinedIn != eInternalContainer() || (eContainerFeatureID() != CorePackage.NAMED_TYPE__DEFINED_IN && newDefinedIn != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAMED_TYPE__DEFINED_IN, newDefinedIn, newDefinedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmScope getLocalScope() {
		if (localScope != null && localScope.eIsProxy()) {
			InternalEObject oldLocalScope = (InternalEObject)localScope;
			localScope = (AlgorithmScope)eResolveProxy(oldLocalScope);
			if (localScope != oldLocalScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.NAMED_TYPE__LOCAL_SCOPE, oldLocalScope, localScope));
			}
		}
		return localScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmScope basicGetLocalScope() {
		return localScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalScope(AlgorithmScope newLocalScope, NotificationChain msgs) {
		AlgorithmScope oldLocalScope = localScope;
		localScope = newLocalScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.NAMED_TYPE__LOCAL_SCOPE, oldLocalScope, newLocalScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalScope(AlgorithmScope newLocalScope) {
		if (newLocalScope != localScope) {
			NotificationChain msgs = null;
			if (localScope != null)
				msgs = ((InternalEObject)localScope).eInverseRemove(this, CorePackage.ALGORITHM_SCOPE__COMMON_ELEMENTS, AlgorithmScope.class, msgs);
			if (newLocalScope != null)
				msgs = ((InternalEObject)newLocalScope).eInverseAdd(this, CorePackage.ALGORITHM_SCOPE__COMMON_ELEMENTS, AlgorithmScope.class, msgs);
			msgs = basicSetLocalScope(newLocalScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAMED_TYPE__LOCAL_SCOPE, newLocalScope, newLocalScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectType> getInstantiates() {
		if (instantiates == null) {
			instantiates = new EObjectWithInverseResolvingEList.ManyInverse<SelectType>(SelectType.class, this, CorePackage.NAMED_TYPE__INSTANTIATES, CorePackage.SELECT_TYPE__ALLOWED_TYPES);
		}
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainRule> getDomainRules() {
		if (domainRules == null) {
			domainRules = new EObjectResolvingEList<DomainRule>(DomainRule.class, this, CorePackage.NAMED_TYPE__DOMAIN_RULES);
		}
		return domainRules;
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
			case CorePackage.NAMED_TYPE__NAMED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNamedElements()).basicAdd(otherEnd, msgs);
			case CorePackage.NAMED_TYPE__INCLUDES_REMARKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludesRemarks()).basicAdd(otherEnd, msgs);
			case CorePackage.NAMED_TYPE__NAMESPACE:
				if (namespace != null)
					msgs = ((InternalEObject)namespace).eInverseRemove(this, CorePackage.SCOPE__NAMED_ELEMENTS, Scope.class, msgs);
				return basicSetNamespace((Scope)otherEnd, msgs);
			case CorePackage.NAMED_TYPE__DOCUMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentation()).basicAdd(otherEnd, msgs);
			case CorePackage.NAMED_TYPE__REFERENCED_AS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedAs()).basicAdd(otherEnd, msgs);
			case CorePackage.NAMED_TYPE__REFERENCED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedIn()).basicAdd(otherEnd, msgs);
			case CorePackage.NAMED_TYPE__DEFINED_IN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDefinedIn((Schema)otherEnd, msgs);
			case CorePackage.NAMED_TYPE__LOCAL_SCOPE:
				if (localScope != null)
					msgs = ((InternalEObject)localScope).eInverseRemove(this, CorePackage.ALGORITHM_SCOPE__COMMON_ELEMENTS, AlgorithmScope.class, msgs);
				return basicSetLocalScope((AlgorithmScope)otherEnd, msgs);
			case CorePackage.NAMED_TYPE__INSTANTIATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiates()).basicAdd(otherEnd, msgs);
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
			case CorePackage.NAMED_TYPE__NAMED_ELEMENTS:
				return ((InternalEList<?>)getNamedElements()).basicRemove(otherEnd, msgs);
			case CorePackage.NAMED_TYPE__INCLUDES_REMARKS:
				return ((InternalEList<?>)getIncludesRemarks()).basicRemove(otherEnd, msgs);
			case CorePackage.NAMED_TYPE__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case CorePackage.NAMED_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CorePackage.NAMED_TYPE__ID:
				return basicSetId(null, msgs);
			case CorePackage.NAMED_TYPE__REFERENCED_AS:
				return ((InternalEList<?>)getReferencedAs()).basicRemove(otherEnd, msgs);
			case CorePackage.NAMED_TYPE__REFERENCED_IN:
				return ((InternalEList<?>)getReferencedIn()).basicRemove(otherEnd, msgs);
			case CorePackage.NAMED_TYPE__DEFINED_IN:
				return basicSetDefinedIn(null, msgs);
			case CorePackage.NAMED_TYPE__LOCAL_SCOPE:
				return basicSetLocalScope(null, msgs);
			case CorePackage.NAMED_TYPE__INSTANTIATES:
				return ((InternalEList<?>)getInstantiates()).basicRemove(otherEnd, msgs);
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
			case CorePackage.NAMED_TYPE__DEFINED_IN:
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
			case CorePackage.NAMED_TYPE__NAMED_ELEMENTS:
				return getNamedElements();
			case CorePackage.NAMED_TYPE__INCLUDES_REMARKS:
				return getIncludesRemarks();
			case CorePackage.NAMED_TYPE__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
			case CorePackage.NAMED_TYPE__DOCUMENTATION:
				return getDocumentation();
			case CorePackage.NAMED_TYPE__ID:
				return getId();
			case CorePackage.NAMED_TYPE__REFERENCED_AS:
				return getReferencedAs();
			case CorePackage.NAMED_TYPE__REFERENCED_IN:
				return getReferencedIn();
			case CorePackage.NAMED_TYPE__DEFINED_IN:
				return getDefinedIn();
			case CorePackage.NAMED_TYPE__LOCAL_SCOPE:
				if (resolve) return getLocalScope();
				return basicGetLocalScope();
			case CorePackage.NAMED_TYPE__INSTANTIATES:
				return getInstantiates();
			case CorePackage.NAMED_TYPE__DOMAIN_RULES:
				return getDomainRules();
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
			case CorePackage.NAMED_TYPE__NAMED_ELEMENTS:
				getNamedElements().clear();
				getNamedElements().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case CorePackage.NAMED_TYPE__INCLUDES_REMARKS:
				getIncludesRemarks().clear();
				getIncludesRemarks().addAll((Collection<? extends Remark>)newValue);
				return;
			case CorePackage.NAMED_TYPE__NAMESPACE:
				setNamespace((Scope)newValue);
				return;
			case CorePackage.NAMED_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Remark>)newValue);
				return;
			case CorePackage.NAMED_TYPE__ID:
				setId((ScopedId)newValue);
				return;
			case CorePackage.NAMED_TYPE__REFERENCED_AS:
				getReferencedAs().clear();
				getReferencedAs().addAll((Collection<? extends InterfacedElement>)newValue);
				return;
			case CorePackage.NAMED_TYPE__REFERENCED_IN:
				getReferencedIn().clear();
				getReferencedIn().addAll((Collection<? extends Schema>)newValue);
				return;
			case CorePackage.NAMED_TYPE__DEFINED_IN:
				setDefinedIn((Schema)newValue);
				return;
			case CorePackage.NAMED_TYPE__LOCAL_SCOPE:
				setLocalScope((AlgorithmScope)newValue);
				return;
			case CorePackage.NAMED_TYPE__INSTANTIATES:
				getInstantiates().clear();
				getInstantiates().addAll((Collection<? extends SelectType>)newValue);
				return;
			case CorePackage.NAMED_TYPE__DOMAIN_RULES:
				getDomainRules().clear();
				getDomainRules().addAll((Collection<? extends DomainRule>)newValue);
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
			case CorePackage.NAMED_TYPE__NAMED_ELEMENTS:
				getNamedElements().clear();
				return;
			case CorePackage.NAMED_TYPE__INCLUDES_REMARKS:
				getIncludesRemarks().clear();
				return;
			case CorePackage.NAMED_TYPE__NAMESPACE:
				setNamespace((Scope)null);
				return;
			case CorePackage.NAMED_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CorePackage.NAMED_TYPE__ID:
				setId((ScopedId)null);
				return;
			case CorePackage.NAMED_TYPE__REFERENCED_AS:
				getReferencedAs().clear();
				return;
			case CorePackage.NAMED_TYPE__REFERENCED_IN:
				getReferencedIn().clear();
				return;
			case CorePackage.NAMED_TYPE__DEFINED_IN:
				setDefinedIn((Schema)null);
				return;
			case CorePackage.NAMED_TYPE__LOCAL_SCOPE:
				setLocalScope((AlgorithmScope)null);
				return;
			case CorePackage.NAMED_TYPE__INSTANTIATES:
				getInstantiates().clear();
				return;
			case CorePackage.NAMED_TYPE__DOMAIN_RULES:
				getDomainRules().clear();
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
			case CorePackage.NAMED_TYPE__NAMED_ELEMENTS:
				return namedElements != null && !namedElements.isEmpty();
			case CorePackage.NAMED_TYPE__INCLUDES_REMARKS:
				return includesRemarks != null && !includesRemarks.isEmpty();
			case CorePackage.NAMED_TYPE__NAMESPACE:
				return namespace != null;
			case CorePackage.NAMED_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case CorePackage.NAMED_TYPE__ID:
				return id != null;
			case CorePackage.NAMED_TYPE__REFERENCED_AS:
				return referencedAs != null && !referencedAs.isEmpty();
			case CorePackage.NAMED_TYPE__REFERENCED_IN:
				return referencedIn != null && !referencedIn.isEmpty();
			case CorePackage.NAMED_TYPE__DEFINED_IN:
				return getDefinedIn() != null;
			case CorePackage.NAMED_TYPE__LOCAL_SCOPE:
				return localScope != null;
			case CorePackage.NAMED_TYPE__INSTANTIATES:
				return instantiates != null && !instantiates.isEmpty();
			case CorePackage.NAMED_TYPE__DOMAIN_RULES:
				return domainRules != null && !domainRules.isEmpty();
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
		if (baseClass == Scope.class) {
			switch (derivedFeatureID) {
				case CorePackage.NAMED_TYPE__NAMED_ELEMENTS: return CorePackage.SCOPE__NAMED_ELEMENTS;
				case CorePackage.NAMED_TYPE__INCLUDES_REMARKS: return CorePackage.SCOPE__INCLUDES_REMARKS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.NAMED_TYPE__NAMESPACE: return CorePackage.NAMED_ELEMENT__NAMESPACE;
				case CorePackage.NAMED_TYPE__DOCUMENTATION: return CorePackage.NAMED_ELEMENT__DOCUMENTATION;
				case CorePackage.NAMED_TYPE__ID: return CorePackage.NAMED_ELEMENT__ID;
				default: return -1;
			}
		}
		if (baseClass == SchemaElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.NAMED_TYPE__REFERENCED_AS: return CorePackage.SCHEMA_ELEMENT__REFERENCED_AS;
				case CorePackage.NAMED_TYPE__REFERENCED_IN: return CorePackage.SCHEMA_ELEMENT__REFERENCED_IN;
				case CorePackage.NAMED_TYPE__DEFINED_IN: return CorePackage.SCHEMA_ELEMENT__DEFINED_IN;
				default: return -1;
			}
		}
		if (baseClass == CommonElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.NAMED_TYPE__LOCAL_SCOPE: return CorePackage.COMMON_ELEMENT__LOCAL_SCOPE;
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
		if (baseClass == Scope.class) {
			switch (baseFeatureID) {
				case CorePackage.SCOPE__NAMED_ELEMENTS: return CorePackage.NAMED_TYPE__NAMED_ELEMENTS;
				case CorePackage.SCOPE__INCLUDES_REMARKS: return CorePackage.NAMED_TYPE__INCLUDES_REMARKS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAMESPACE: return CorePackage.NAMED_TYPE__NAMESPACE;
				case CorePackage.NAMED_ELEMENT__DOCUMENTATION: return CorePackage.NAMED_TYPE__DOCUMENTATION;
				case CorePackage.NAMED_ELEMENT__ID: return CorePackage.NAMED_TYPE__ID;
				default: return -1;
			}
		}
		if (baseClass == SchemaElement.class) {
			switch (baseFeatureID) {
				case CorePackage.SCHEMA_ELEMENT__REFERENCED_AS: return CorePackage.NAMED_TYPE__REFERENCED_AS;
				case CorePackage.SCHEMA_ELEMENT__REFERENCED_IN: return CorePackage.NAMED_TYPE__REFERENCED_IN;
				case CorePackage.SCHEMA_ELEMENT__DEFINED_IN: return CorePackage.NAMED_TYPE__DEFINED_IN;
				default: return -1;
			}
		}
		if (baseClass == CommonElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMON_ELEMENT__LOCAL_SCOPE: return CorePackage.NAMED_TYPE__LOCAL_SCOPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NamedTypeImpl
