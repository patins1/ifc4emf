/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.rules.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.algorithms.Variable;
import org.ifc4emf.metamodel.express.core.AlgorithmScope;
import org.ifc4emf.metamodel.express.core.CommonElement;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.LocalScope;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.Remark;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.core.impl.SchemaElementImpl;
import org.ifc4emf.metamodel.express.rules.Extent;
import org.ifc4emf.metamodel.express.rules.GlobalRule;
import org.ifc4emf.metamodel.express.rules.NamedRule;
import org.ifc4emf.metamodel.express.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl#getIncludesRemarks <em>Includes Remarks</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl#getLocalElements <em>Local Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl#getCommonElements <em>Common Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl#getSupportingBody <em>Supporting Body</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl#getConstrainedExtents <em>Constrained Extents</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.rules.impl.GlobalRuleImpl#getContainsRules <em>Contains Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalRuleImpl extends SchemaElementImpl implements GlobalRule {
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
	 * The cached value of the '{@link #getCommonElements() <em>Common Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CommonElement> commonElements;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getSupportingBody() <em>Supporting Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingBody()
	 * @generated
	 * @ordered
	 */
	protected Statement supportingBody;

	/**
	 * The cached value of the '{@link #getConstrainedExtents() <em>Constrained Extents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedExtents()
	 * @generated
	 * @ordered
	 */
	protected EList<Extent> constrainedExtents;

	/**
	 * The cached value of the '{@link #getContainsRules() <em>Contains Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsRules()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedRule> containsRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.GLOBAL_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getNamedElements() {
		if (namedElements == null) {
			namedElements = new EObjectWithInverseResolvingEList<NamedElement>(NamedElement.class, this, RulesPackage.GLOBAL_RULE__NAMED_ELEMENTS, CorePackage.NAMED_ELEMENT__NAMESPACE);
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
			includesRemarks = new EObjectWithInverseResolvingEList<Remark>(Remark.class, this, RulesPackage.GLOBAL_RULE__INCLUDES_REMARKS, CorePackage.REMARK__APPEARS_IN);
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
			localElements = new EObjectResolvingEList<LocalElement>(LocalElement.class, this, RulesPackage.GLOBAL_RULE__LOCAL_ELEMENTS);
		}
		return localElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommonElement> getCommonElements() {
		if (commonElements == null) {
			commonElements = new EObjectWithInverseResolvingEList<CommonElement>(CommonElement.class, this, RulesPackage.GLOBAL_RULE__COMMON_ELEMENTS, CorePackage.COMMON_ELEMENT__LOCAL_SCOPE);
		}
		return commonElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectResolvingEList<Variable>(Variable.class, this, RulesPackage.GLOBAL_RULE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getSupportingBody() {
		return supportingBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportingBody(Statement newSupportingBody, NotificationChain msgs) {
		Statement oldSupportingBody = supportingBody;
		supportingBody = newSupportingBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.GLOBAL_RULE__SUPPORTING_BODY, oldSupportingBody, newSupportingBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportingBody(Statement newSupportingBody) {
		if (newSupportingBody != supportingBody) {
			NotificationChain msgs = null;
			if (supportingBody != null)
				msgs = ((InternalEObject)supportingBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.GLOBAL_RULE__SUPPORTING_BODY, null, msgs);
			if (newSupportingBody != null)
				msgs = ((InternalEObject)newSupportingBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.GLOBAL_RULE__SUPPORTING_BODY, null, msgs);
			msgs = basicSetSupportingBody(newSupportingBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.GLOBAL_RULE__SUPPORTING_BODY, newSupportingBody, newSupportingBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extent> getConstrainedExtents() {
		if (constrainedExtents == null) {
			constrainedExtents = new EObjectWithInverseResolvingEList.ManyInverse<Extent>(Extent.class, this, RulesPackage.GLOBAL_RULE__CONSTRAINED_EXTENTS, RulesPackage.EXTENT__CONSTRAINT_RULES);
		}
		return constrainedExtents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedRule> getContainsRules() {
		if (containsRules == null) {
			containsRules = new EObjectContainmentEList<NamedRule>(NamedRule.class, this, RulesPackage.GLOBAL_RULE__CONTAINS_RULES);
		}
		return containsRules;
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
			case RulesPackage.GLOBAL_RULE__NAMED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNamedElements()).basicAdd(otherEnd, msgs);
			case RulesPackage.GLOBAL_RULE__INCLUDES_REMARKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludesRemarks()).basicAdd(otherEnd, msgs);
			case RulesPackage.GLOBAL_RULE__COMMON_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommonElements()).basicAdd(otherEnd, msgs);
			case RulesPackage.GLOBAL_RULE__CONSTRAINED_EXTENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstrainedExtents()).basicAdd(otherEnd, msgs);
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
			case RulesPackage.GLOBAL_RULE__NAMED_ELEMENTS:
				return ((InternalEList<?>)getNamedElements()).basicRemove(otherEnd, msgs);
			case RulesPackage.GLOBAL_RULE__INCLUDES_REMARKS:
				return ((InternalEList<?>)getIncludesRemarks()).basicRemove(otherEnd, msgs);
			case RulesPackage.GLOBAL_RULE__COMMON_ELEMENTS:
				return ((InternalEList<?>)getCommonElements()).basicRemove(otherEnd, msgs);
			case RulesPackage.GLOBAL_RULE__SUPPORTING_BODY:
				return basicSetSupportingBody(null, msgs);
			case RulesPackage.GLOBAL_RULE__CONSTRAINED_EXTENTS:
				return ((InternalEList<?>)getConstrainedExtents()).basicRemove(otherEnd, msgs);
			case RulesPackage.GLOBAL_RULE__CONTAINS_RULES:
				return ((InternalEList<?>)getContainsRules()).basicRemove(otherEnd, msgs);
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
			case RulesPackage.GLOBAL_RULE__NAMED_ELEMENTS:
				return getNamedElements();
			case RulesPackage.GLOBAL_RULE__INCLUDES_REMARKS:
				return getIncludesRemarks();
			case RulesPackage.GLOBAL_RULE__LOCAL_ELEMENTS:
				return getLocalElements();
			case RulesPackage.GLOBAL_RULE__COMMON_ELEMENTS:
				return getCommonElements();
			case RulesPackage.GLOBAL_RULE__VARIABLES:
				return getVariables();
			case RulesPackage.GLOBAL_RULE__SUPPORTING_BODY:
				return getSupportingBody();
			case RulesPackage.GLOBAL_RULE__CONSTRAINED_EXTENTS:
				return getConstrainedExtents();
			case RulesPackage.GLOBAL_RULE__CONTAINS_RULES:
				return getContainsRules();
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
			case RulesPackage.GLOBAL_RULE__NAMED_ELEMENTS:
				getNamedElements().clear();
				getNamedElements().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case RulesPackage.GLOBAL_RULE__INCLUDES_REMARKS:
				getIncludesRemarks().clear();
				getIncludesRemarks().addAll((Collection<? extends Remark>)newValue);
				return;
			case RulesPackage.GLOBAL_RULE__LOCAL_ELEMENTS:
				getLocalElements().clear();
				getLocalElements().addAll((Collection<? extends LocalElement>)newValue);
				return;
			case RulesPackage.GLOBAL_RULE__COMMON_ELEMENTS:
				getCommonElements().clear();
				getCommonElements().addAll((Collection<? extends CommonElement>)newValue);
				return;
			case RulesPackage.GLOBAL_RULE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case RulesPackage.GLOBAL_RULE__SUPPORTING_BODY:
				setSupportingBody((Statement)newValue);
				return;
			case RulesPackage.GLOBAL_RULE__CONSTRAINED_EXTENTS:
				getConstrainedExtents().clear();
				getConstrainedExtents().addAll((Collection<? extends Extent>)newValue);
				return;
			case RulesPackage.GLOBAL_RULE__CONTAINS_RULES:
				getContainsRules().clear();
				getContainsRules().addAll((Collection<? extends NamedRule>)newValue);
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
			case RulesPackage.GLOBAL_RULE__NAMED_ELEMENTS:
				getNamedElements().clear();
				return;
			case RulesPackage.GLOBAL_RULE__INCLUDES_REMARKS:
				getIncludesRemarks().clear();
				return;
			case RulesPackage.GLOBAL_RULE__LOCAL_ELEMENTS:
				getLocalElements().clear();
				return;
			case RulesPackage.GLOBAL_RULE__COMMON_ELEMENTS:
				getCommonElements().clear();
				return;
			case RulesPackage.GLOBAL_RULE__VARIABLES:
				getVariables().clear();
				return;
			case RulesPackage.GLOBAL_RULE__SUPPORTING_BODY:
				setSupportingBody((Statement)null);
				return;
			case RulesPackage.GLOBAL_RULE__CONSTRAINED_EXTENTS:
				getConstrainedExtents().clear();
				return;
			case RulesPackage.GLOBAL_RULE__CONTAINS_RULES:
				getContainsRules().clear();
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
			case RulesPackage.GLOBAL_RULE__NAMED_ELEMENTS:
				return namedElements != null && !namedElements.isEmpty();
			case RulesPackage.GLOBAL_RULE__INCLUDES_REMARKS:
				return includesRemarks != null && !includesRemarks.isEmpty();
			case RulesPackage.GLOBAL_RULE__LOCAL_ELEMENTS:
				return localElements != null && !localElements.isEmpty();
			case RulesPackage.GLOBAL_RULE__COMMON_ELEMENTS:
				return commonElements != null && !commonElements.isEmpty();
			case RulesPackage.GLOBAL_RULE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case RulesPackage.GLOBAL_RULE__SUPPORTING_BODY:
				return supportingBody != null;
			case RulesPackage.GLOBAL_RULE__CONSTRAINED_EXTENTS:
				return constrainedExtents != null && !constrainedExtents.isEmpty();
			case RulesPackage.GLOBAL_RULE__CONTAINS_RULES:
				return containsRules != null && !containsRules.isEmpty();
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
				case RulesPackage.GLOBAL_RULE__NAMED_ELEMENTS: return CorePackage.SCOPE__NAMED_ELEMENTS;
				case RulesPackage.GLOBAL_RULE__INCLUDES_REMARKS: return CorePackage.SCOPE__INCLUDES_REMARKS;
				default: return -1;
			}
		}
		if (baseClass == LocalScope.class) {
			switch (derivedFeatureID) {
				case RulesPackage.GLOBAL_RULE__LOCAL_ELEMENTS: return CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AlgorithmScope.class) {
			switch (derivedFeatureID) {
				case RulesPackage.GLOBAL_RULE__COMMON_ELEMENTS: return CorePackage.ALGORITHM_SCOPE__COMMON_ELEMENTS;
				case RulesPackage.GLOBAL_RULE__VARIABLES: return CorePackage.ALGORITHM_SCOPE__VARIABLES;
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
				case CorePackage.SCOPE__NAMED_ELEMENTS: return RulesPackage.GLOBAL_RULE__NAMED_ELEMENTS;
				case CorePackage.SCOPE__INCLUDES_REMARKS: return RulesPackage.GLOBAL_RULE__INCLUDES_REMARKS;
				default: return -1;
			}
		}
		if (baseClass == LocalScope.class) {
			switch (baseFeatureID) {
				case CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS: return RulesPackage.GLOBAL_RULE__LOCAL_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AlgorithmScope.class) {
			switch (baseFeatureID) {
				case CorePackage.ALGORITHM_SCOPE__COMMON_ELEMENTS: return RulesPackage.GLOBAL_RULE__COMMON_ELEMENTS;
				case CorePackage.ALGORITHM_SCOPE__VARIABLES: return RulesPackage.GLOBAL_RULE__VARIABLES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GlobalRuleImpl
