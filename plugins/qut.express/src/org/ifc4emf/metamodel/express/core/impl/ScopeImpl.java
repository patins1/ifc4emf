/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.Remark;
import org.ifc4emf.metamodel.express.core.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.ScopeImpl#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.ScopeImpl#getIncludesRemarks <em>Includes Remarks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ScopeImpl extends EObjectImpl implements Scope {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getNamedElements() {
		if (namedElements == null) {
			namedElements = new EObjectWithInverseResolvingEList<NamedElement>(NamedElement.class, this, CorePackage.SCOPE__NAMED_ELEMENTS, CorePackage.NAMED_ELEMENT__NAMESPACE);
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
			includesRemarks = new EObjectWithInverseResolvingEList<Remark>(Remark.class, this, CorePackage.SCOPE__INCLUDES_REMARKS, CorePackage.REMARK__APPEARS_IN);
		}
		return includesRemarks;
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
			case CorePackage.SCOPE__NAMED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNamedElements()).basicAdd(otherEnd, msgs);
			case CorePackage.SCOPE__INCLUDES_REMARKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludesRemarks()).basicAdd(otherEnd, msgs);
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
			case CorePackage.SCOPE__NAMED_ELEMENTS:
				return ((InternalEList<?>)getNamedElements()).basicRemove(otherEnd, msgs);
			case CorePackage.SCOPE__INCLUDES_REMARKS:
				return ((InternalEList<?>)getIncludesRemarks()).basicRemove(otherEnd, msgs);
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
			case CorePackage.SCOPE__NAMED_ELEMENTS:
				return getNamedElements();
			case CorePackage.SCOPE__INCLUDES_REMARKS:
				return getIncludesRemarks();
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
			case CorePackage.SCOPE__NAMED_ELEMENTS:
				getNamedElements().clear();
				getNamedElements().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case CorePackage.SCOPE__INCLUDES_REMARKS:
				getIncludesRemarks().clear();
				getIncludesRemarks().addAll((Collection<? extends Remark>)newValue);
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
			case CorePackage.SCOPE__NAMED_ELEMENTS:
				getNamedElements().clear();
				return;
			case CorePackage.SCOPE__INCLUDES_REMARKS:
				getIncludesRemarks().clear();
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
			case CorePackage.SCOPE__NAMED_ELEMENTS:
				return namedElements != null && !namedElements.isEmpty();
			case CorePackage.SCOPE__INCLUDES_REMARKS:
				return includesRemarks != null && !includesRemarks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScopeImpl
