/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.LocalScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.LocalScopeImpl#getLocalElements <em>Local Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LocalScopeImpl extends ScopeImpl implements LocalScope {
	/**
	 * The cached value of the '{@link #getLocalElements() <em>Local Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalElements()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalElement> localElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.LOCAL_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalElement> getLocalElements() {
		if (localElements == null) {
			localElements = new EObjectResolvingEList<LocalElement>(LocalElement.class, this, CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS);
		}
		return localElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS:
				return getLocalElements();
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
			case CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS:
				getLocalElements().clear();
				getLocalElements().addAll((Collection<? extends LocalElement>)newValue);
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
			case CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS:
				getLocalElements().clear();
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
			case CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS:
				return localElements != null && !localElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocalScopeImpl
