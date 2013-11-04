/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.SingleEntityType;
import org.ifc4emf.metamodel.express.core.impl.ExpressionImpl;
import org.ifc4emf.metamodel.express.expressions.AttributeBinding;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.PartialEntityConstructor;
import org.ifc4emf.metamodel.express.instances.PartialEntityValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Entity Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.PartialEntityConstructorImpl#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.PartialEntityConstructorImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.PartialEntityConstructorImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.PartialEntityConstructorImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartialEntityConstructorImpl extends ExpressionImpl implements PartialEntityConstructor {
	/**
	 * The cached value of the '{@link #getResultValue() <em>Result Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected PartialEntityValue resultValue;

	/**
	 * The cached value of the '{@link #getAttributeGroup() <em>Attribute Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeGroup()
	 * @generated
	 * @ordered
	 */
	protected SingleEntityType attributeGroup;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeBinding> bindings;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialEntityConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.PARTIAL_ENTITY_CONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialEntityValue getResultValue() {
		if (resultValue != null && resultValue.eIsProxy()) {
			InternalEObject oldResultValue = (InternalEObject)resultValue;
			resultValue = (PartialEntityValue)eResolveProxy(oldResultValue);
			if (resultValue != oldResultValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__RESULT_VALUE, oldResultValue, resultValue));
			}
		}
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialEntityValue basicGetResultValue() {
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultValue(PartialEntityValue newResultValue) {
		PartialEntityValue oldResultValue = resultValue;
		resultValue = newResultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__RESULT_VALUE, oldResultValue, resultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleEntityType getAttributeGroup() {
		if (attributeGroup != null && attributeGroup.eIsProxy()) {
			InternalEObject oldAttributeGroup = (InternalEObject)attributeGroup;
			attributeGroup = (SingleEntityType)eResolveProxy(oldAttributeGroup);
			if (attributeGroup != oldAttributeGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__ATTRIBUTE_GROUP, oldAttributeGroup, attributeGroup));
			}
		}
		return attributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleEntityType basicGetAttributeGroup() {
		return attributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeGroup(SingleEntityType newAttributeGroup) {
		SingleEntityType oldAttributeGroup = attributeGroup;
		attributeGroup = newAttributeGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__ATTRIBUTE_GROUP, oldAttributeGroup, attributeGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<AttributeBinding>(AttributeBinding.class, this, ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__RESULT_VALUE:
				if (resolve) return getResultValue();
				return basicGetResultValue();
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__ATTRIBUTE_GROUP:
				if (resolve) return getAttributeGroup();
				return basicGetAttributeGroup();
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__BINDINGS:
				return getBindings();
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__ID:
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
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__RESULT_VALUE:
				setResultValue((PartialEntityValue)newValue);
				return;
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__ATTRIBUTE_GROUP:
				setAttributeGroup((SingleEntityType)newValue);
				return;
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends AttributeBinding>)newValue);
				return;
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__ID:
				setId((String)newValue);
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
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__RESULT_VALUE:
				setResultValue((PartialEntityValue)null);
				return;
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__ATTRIBUTE_GROUP:
				setAttributeGroup((SingleEntityType)null);
				return;
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__BINDINGS:
				getBindings().clear();
				return;
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__ID:
				setId(ID_EDEFAULT);
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
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__RESULT_VALUE:
				return resultValue != null;
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__ATTRIBUTE_GROUP:
				return attributeGroup != null;
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case ExpressionsPackage.PARTIAL_ENTITY_CONSTRUCTOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PartialEntityConstructorImpl
