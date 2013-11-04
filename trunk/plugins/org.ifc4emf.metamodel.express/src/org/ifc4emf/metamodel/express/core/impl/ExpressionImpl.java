/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DataType;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.ExpressionImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.ExpressionImpl#getInterpretationContext <em>Interpretation Context</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.ExpressionImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.ExpressionImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends EObjectImpl implements Expression {
	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected Instance evaluation;

	/**
	 * The cached value of the '{@link #getInterpretationContext() <em>Interpretation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationContext()
	 * @generated
	 * @ordered
	 */
	protected Scope interpretationContext;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance getEvaluation() {
		if (evaluation != null && evaluation.eIsProxy()) {
			InternalEObject oldEvaluation = (InternalEObject)evaluation;
			evaluation = (Instance)eResolveProxy(oldEvaluation);
			if (evaluation != oldEvaluation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.EXPRESSION__EVALUATION, oldEvaluation, evaluation));
			}
		}
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance basicGetEvaluation() {
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation(Instance newEvaluation) {
		Instance oldEvaluation = evaluation;
		evaluation = newEvaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXPRESSION__EVALUATION, oldEvaluation, evaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getInterpretationContext() {
		if (interpretationContext != null && interpretationContext.eIsProxy()) {
			InternalEObject oldInterpretationContext = (InternalEObject)interpretationContext;
			interpretationContext = (Scope)eResolveProxy(oldInterpretationContext);
			if (interpretationContext != oldInterpretationContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.EXPRESSION__INTERPRETATION_CONTEXT, oldInterpretationContext, interpretationContext));
			}
		}
		return interpretationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope basicGetInterpretationContext() {
		return interpretationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretationContext(Scope newInterpretationContext) {
		Scope oldInterpretationContext = interpretationContext;
		interpretationContext = newInterpretationContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXPRESSION__INTERPRETATION_CONTEXT, oldInterpretationContext, interpretationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.EXPRESSION__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXPRESSION__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXPRESSION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.EXPRESSION__EVALUATION:
				if (resolve) return getEvaluation();
				return basicGetEvaluation();
			case CorePackage.EXPRESSION__INTERPRETATION_CONTEXT:
				if (resolve) return getInterpretationContext();
				return basicGetInterpretationContext();
			case CorePackage.EXPRESSION__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case CorePackage.EXPRESSION__TEXT:
				return getText();
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
			case CorePackage.EXPRESSION__EVALUATION:
				setEvaluation((Instance)newValue);
				return;
			case CorePackage.EXPRESSION__INTERPRETATION_CONTEXT:
				setInterpretationContext((Scope)newValue);
				return;
			case CorePackage.EXPRESSION__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case CorePackage.EXPRESSION__TEXT:
				setText((String)newValue);
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
			case CorePackage.EXPRESSION__EVALUATION:
				setEvaluation((Instance)null);
				return;
			case CorePackage.EXPRESSION__INTERPRETATION_CONTEXT:
				setInterpretationContext((Scope)null);
				return;
			case CorePackage.EXPRESSION__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case CorePackage.EXPRESSION__TEXT:
				setText(TEXT_EDEFAULT);
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
			case CorePackage.EXPRESSION__EVALUATION:
				return evaluation != null;
			case CorePackage.EXPRESSION__INTERPRETATION_CONTEXT:
				return interpretationContext != null;
			case CorePackage.EXPRESSION__DATA_TYPE:
				return dataType != null;
			case CorePackage.EXPRESSION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl
