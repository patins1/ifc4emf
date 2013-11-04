/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.statements.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.LocalScope;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.Remark;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.statements.AliasStatement;
import org.ifc4emf.metamodel.express.statements.AliasVariable;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;
import org.ifc4emf.metamodel.express.statements.VARExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.AliasStatementImpl#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.AliasStatementImpl#getIncludesRemarks <em>Includes Remarks</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.AliasStatementImpl#getLocalElements <em>Local Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.AliasStatementImpl#getBindsToReference <em>Binds To Reference</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.AliasStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.AliasStatementImpl#getAliasVariable <em>Alias Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasStatementImpl extends StatementImpl implements AliasStatement {
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
	 * The cached value of the '{@link #getLocalElements() <em>Local Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalElements()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalElement> localElements;

	/**
	 * The cached value of the '{@link #getBindsToReference() <em>Binds To Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindsToReference()
	 * @generated
	 * @ordered
	 */
	protected VARExpression bindsToReference;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Statement body;

	/**
	 * The cached value of the '{@link #getAliasVariable() <em>Alias Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasVariable()
	 * @generated
	 * @ordered
	 */
	protected AliasVariable aliasVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliasStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.ALIAS_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getNamedElements() {
		if (namedElements == null) {
			namedElements = new EObjectWithInverseResolvingEList<NamedElement>(NamedElement.class, this, StatementsPackage.ALIAS_STATEMENT__NAMED_ELEMENTS, CorePackage.NAMED_ELEMENT__NAMESPACE);
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
			includesRemarks = new EObjectWithInverseResolvingEList<Remark>(Remark.class, this, StatementsPackage.ALIAS_STATEMENT__INCLUDES_REMARKS, CorePackage.REMARK__APPEARS_IN);
		}
		return includesRemarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalElement> getLocalElements() {
		if (localElements == null) {
			localElements = new EObjectResolvingEList<LocalElement>(LocalElement.class, this, StatementsPackage.ALIAS_STATEMENT__LOCAL_ELEMENTS);
		}
		return localElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VARExpression getBindsToReference() {
		if (bindsToReference != null && bindsToReference.eIsProxy()) {
			InternalEObject oldBindsToReference = (InternalEObject)bindsToReference;
			bindsToReference = (VARExpression)eResolveProxy(oldBindsToReference);
			if (bindsToReference != oldBindsToReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.ALIAS_STATEMENT__BINDS_TO_REFERENCE, oldBindsToReference, bindsToReference));
			}
		}
		return bindsToReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VARExpression basicGetBindsToReference() {
		return bindsToReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindsToReference(VARExpression newBindsToReference) {
		VARExpression oldBindsToReference = bindsToReference;
		bindsToReference = newBindsToReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ALIAS_STATEMENT__BINDS_TO_REFERENCE, oldBindsToReference, bindsToReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Statement newBody, NotificationChain msgs) {
		Statement oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.ALIAS_STATEMENT__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Statement newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.ALIAS_STATEMENT__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.ALIAS_STATEMENT__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ALIAS_STATEMENT__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasVariable getAliasVariable() {
		return aliasVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAliasVariable(AliasVariable newAliasVariable, NotificationChain msgs) {
		AliasVariable oldAliasVariable = aliasVariable;
		aliasVariable = newAliasVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.ALIAS_STATEMENT__ALIAS_VARIABLE, oldAliasVariable, newAliasVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasVariable(AliasVariable newAliasVariable) {
		if (newAliasVariable != aliasVariable) {
			NotificationChain msgs = null;
			if (aliasVariable != null)
				msgs = ((InternalEObject)aliasVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.ALIAS_STATEMENT__ALIAS_VARIABLE, null, msgs);
			if (newAliasVariable != null)
				msgs = ((InternalEObject)newAliasVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.ALIAS_STATEMENT__ALIAS_VARIABLE, null, msgs);
			msgs = basicSetAliasVariable(newAliasVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ALIAS_STATEMENT__ALIAS_VARIABLE, newAliasVariable, newAliasVariable));
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
			case StatementsPackage.ALIAS_STATEMENT__NAMED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNamedElements()).basicAdd(otherEnd, msgs);
			case StatementsPackage.ALIAS_STATEMENT__INCLUDES_REMARKS:
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
			case StatementsPackage.ALIAS_STATEMENT__NAMED_ELEMENTS:
				return ((InternalEList<?>)getNamedElements()).basicRemove(otherEnd, msgs);
			case StatementsPackage.ALIAS_STATEMENT__INCLUDES_REMARKS:
				return ((InternalEList<?>)getIncludesRemarks()).basicRemove(otherEnd, msgs);
			case StatementsPackage.ALIAS_STATEMENT__BODY:
				return basicSetBody(null, msgs);
			case StatementsPackage.ALIAS_STATEMENT__ALIAS_VARIABLE:
				return basicSetAliasVariable(null, msgs);
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
			case StatementsPackage.ALIAS_STATEMENT__NAMED_ELEMENTS:
				return getNamedElements();
			case StatementsPackage.ALIAS_STATEMENT__INCLUDES_REMARKS:
				return getIncludesRemarks();
			case StatementsPackage.ALIAS_STATEMENT__LOCAL_ELEMENTS:
				return getLocalElements();
			case StatementsPackage.ALIAS_STATEMENT__BINDS_TO_REFERENCE:
				if (resolve) return getBindsToReference();
				return basicGetBindsToReference();
			case StatementsPackage.ALIAS_STATEMENT__BODY:
				return getBody();
			case StatementsPackage.ALIAS_STATEMENT__ALIAS_VARIABLE:
				return getAliasVariable();
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
			case StatementsPackage.ALIAS_STATEMENT__NAMED_ELEMENTS:
				getNamedElements().clear();
				getNamedElements().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case StatementsPackage.ALIAS_STATEMENT__INCLUDES_REMARKS:
				getIncludesRemarks().clear();
				getIncludesRemarks().addAll((Collection<? extends Remark>)newValue);
				return;
			case StatementsPackage.ALIAS_STATEMENT__LOCAL_ELEMENTS:
				getLocalElements().clear();
				getLocalElements().addAll((Collection<? extends LocalElement>)newValue);
				return;
			case StatementsPackage.ALIAS_STATEMENT__BINDS_TO_REFERENCE:
				setBindsToReference((VARExpression)newValue);
				return;
			case StatementsPackage.ALIAS_STATEMENT__BODY:
				setBody((Statement)newValue);
				return;
			case StatementsPackage.ALIAS_STATEMENT__ALIAS_VARIABLE:
				setAliasVariable((AliasVariable)newValue);
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
			case StatementsPackage.ALIAS_STATEMENT__NAMED_ELEMENTS:
				getNamedElements().clear();
				return;
			case StatementsPackage.ALIAS_STATEMENT__INCLUDES_REMARKS:
				getIncludesRemarks().clear();
				return;
			case StatementsPackage.ALIAS_STATEMENT__LOCAL_ELEMENTS:
				getLocalElements().clear();
				return;
			case StatementsPackage.ALIAS_STATEMENT__BINDS_TO_REFERENCE:
				setBindsToReference((VARExpression)null);
				return;
			case StatementsPackage.ALIAS_STATEMENT__BODY:
				setBody((Statement)null);
				return;
			case StatementsPackage.ALIAS_STATEMENT__ALIAS_VARIABLE:
				setAliasVariable((AliasVariable)null);
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
			case StatementsPackage.ALIAS_STATEMENT__NAMED_ELEMENTS:
				return namedElements != null && !namedElements.isEmpty();
			case StatementsPackage.ALIAS_STATEMENT__INCLUDES_REMARKS:
				return includesRemarks != null && !includesRemarks.isEmpty();
			case StatementsPackage.ALIAS_STATEMENT__LOCAL_ELEMENTS:
				return localElements != null && !localElements.isEmpty();
			case StatementsPackage.ALIAS_STATEMENT__BINDS_TO_REFERENCE:
				return bindsToReference != null;
			case StatementsPackage.ALIAS_STATEMENT__BODY:
				return body != null;
			case StatementsPackage.ALIAS_STATEMENT__ALIAS_VARIABLE:
				return aliasVariable != null;
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
				case StatementsPackage.ALIAS_STATEMENT__NAMED_ELEMENTS: return CorePackage.SCOPE__NAMED_ELEMENTS;
				case StatementsPackage.ALIAS_STATEMENT__INCLUDES_REMARKS: return CorePackage.SCOPE__INCLUDES_REMARKS;
				default: return -1;
			}
		}
		if (baseClass == LocalScope.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.ALIAS_STATEMENT__LOCAL_ELEMENTS: return CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS;
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
				case CorePackage.SCOPE__NAMED_ELEMENTS: return StatementsPackage.ALIAS_STATEMENT__NAMED_ELEMENTS;
				case CorePackage.SCOPE__INCLUDES_REMARKS: return StatementsPackage.ALIAS_STATEMENT__INCLUDES_REMARKS;
				default: return -1;
			}
		}
		if (baseClass == LocalScope.class) {
			switch (baseFeatureID) {
				case CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS: return StatementsPackage.ALIAS_STATEMENT__LOCAL_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AliasStatementImpl
