/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.ifc4emf.metamodel.express.core.ExplicitAttribute;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.expressions.AttributeBinding;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.instances.AttributeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.AttributeBindingImpl#getAttributeValue <em>Attribute Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.AttributeBindingImpl#getToValue <em>To Value</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.AttributeBindingImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.AttributeBindingImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeBindingImpl extends EObjectImpl implements AttributeBinding {
	/**
	 * The cached value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected Expression attributeValue;

	/**
	 * The cached value of the '{@link #getToValue() <em>To Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToValue()
	 * @generated
	 * @ordered
	 */
	protected AttributeValue toValue;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected ExplicitAttribute attribute;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Integer position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.ATTRIBUTE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAttributeValue() {
		if (attributeValue != null && attributeValue.eIsProxy()) {
			InternalEObject oldAttributeValue = (InternalEObject)attributeValue;
			attributeValue = (Expression)eResolveProxy(oldAttributeValue);
			if (attributeValue != oldAttributeValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE_VALUE, oldAttributeValue, attributeValue));
			}
		}
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetAttributeValue() {
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeValue(Expression newAttributeValue) {
		Expression oldAttributeValue = attributeValue;
		attributeValue = newAttributeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE_VALUE, oldAttributeValue, attributeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue getToValue() {
		if (toValue != null && toValue.eIsProxy()) {
			InternalEObject oldToValue = (InternalEObject)toValue;
			toValue = (AttributeValue)eResolveProxy(oldToValue);
			if (toValue != oldToValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.ATTRIBUTE_BINDING__TO_VALUE, oldToValue, toValue));
			}
		}
		return toValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue basicGetToValue() {
		return toValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToValue(AttributeValue newToValue) {
		AttributeValue oldToValue = toValue;
		toValue = newToValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ATTRIBUTE_BINDING__TO_VALUE, oldToValue, toValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitAttribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (ExplicitAttribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitAttribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(ExplicitAttribute newAttribute) {
		ExplicitAttribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Integer newPosition) {
		Integer oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ATTRIBUTE_BINDING__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE_VALUE:
				if (resolve) return getAttributeValue();
				return basicGetAttributeValue();
			case ExpressionsPackage.ATTRIBUTE_BINDING__TO_VALUE:
				if (resolve) return getToValue();
				return basicGetToValue();
			case ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case ExpressionsPackage.ATTRIBUTE_BINDING__POSITION:
				return getPosition();
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
			case ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE_VALUE:
				setAttributeValue((Expression)newValue);
				return;
			case ExpressionsPackage.ATTRIBUTE_BINDING__TO_VALUE:
				setToValue((AttributeValue)newValue);
				return;
			case ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE:
				setAttribute((ExplicitAttribute)newValue);
				return;
			case ExpressionsPackage.ATTRIBUTE_BINDING__POSITION:
				setPosition((Integer)newValue);
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
			case ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE_VALUE:
				setAttributeValue((Expression)null);
				return;
			case ExpressionsPackage.ATTRIBUTE_BINDING__TO_VALUE:
				setToValue((AttributeValue)null);
				return;
			case ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE:
				setAttribute((ExplicitAttribute)null);
				return;
			case ExpressionsPackage.ATTRIBUTE_BINDING__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE_VALUE:
				return attributeValue != null;
			case ExpressionsPackage.ATTRIBUTE_BINDING__TO_VALUE:
				return toValue != null;
			case ExpressionsPackage.ATTRIBUTE_BINDING__ATTRIBUTE:
				return attribute != null;
			case ExpressionsPackage.ATTRIBUTE_BINDING__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
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
		result.append(" (position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //AttributeBindingImpl
