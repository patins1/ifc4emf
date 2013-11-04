/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.DataType;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.Instance;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.core.impl.LocalScopeImpl;
import org.ifc4emf.metamodel.express.expressions.ExpressionsPackage;
import org.ifc4emf.metamodel.express.expressions.QueryExpression;
import org.ifc4emf.metamodel.express.expressions.QueryVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.QueryExpressionImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.QueryExpressionImpl#getInterpretationContext <em>Interpretation Context</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.QueryExpressionImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.QueryExpressionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.QueryExpressionImpl#getSelectCondition <em>Select Condition</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.QueryExpressionImpl#getQueryVariable <em>Query Variable</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.expressions.impl.QueryExpressionImpl#getAggregateOperand <em>Aggregate Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryExpressionImpl extends LocalScopeImpl implements QueryExpression {
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
	 * The cached value of the '{@link #getSelectCondition() <em>Select Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression selectCondition;

	/**
	 * The cached value of the '{@link #getQueryVariable() <em>Query Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryVariable()
	 * @generated
	 * @ordered
	 */
	protected QueryVariable queryVariable;

	/**
	 * The cached value of the '{@link #getAggregateOperand() <em>Aggregate Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateOperand()
	 * @generated
	 * @ordered
	 */
	protected Expression aggregateOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.QUERY_EXPRESSION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.QUERY_EXPRESSION__EVALUATION, oldEvaluation, evaluation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.QUERY_EXPRESSION__EVALUATION, oldEvaluation, evaluation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.QUERY_EXPRESSION__INTERPRETATION_CONTEXT, oldInterpretationContext, interpretationContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.QUERY_EXPRESSION__INTERPRETATION_CONTEXT, oldInterpretationContext, interpretationContext));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.QUERY_EXPRESSION__DATA_TYPE, oldDataType, dataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.QUERY_EXPRESSION__DATA_TYPE, oldDataType, dataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.QUERY_EXPRESSION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSelectCondition() {
		return selectCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectCondition(Expression newSelectCondition, NotificationChain msgs) {
		Expression oldSelectCondition = selectCondition;
		selectCondition = newSelectCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.QUERY_EXPRESSION__SELECT_CONDITION, oldSelectCondition, newSelectCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectCondition(Expression newSelectCondition) {
		if (newSelectCondition != selectCondition) {
			NotificationChain msgs = null;
			if (selectCondition != null)
				msgs = ((InternalEObject)selectCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.QUERY_EXPRESSION__SELECT_CONDITION, null, msgs);
			if (newSelectCondition != null)
				msgs = ((InternalEObject)newSelectCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.QUERY_EXPRESSION__SELECT_CONDITION, null, msgs);
			msgs = basicSetSelectCondition(newSelectCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.QUERY_EXPRESSION__SELECT_CONDITION, newSelectCondition, newSelectCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryVariable getQueryVariable() {
		if (queryVariable != null && queryVariable.eIsProxy()) {
			InternalEObject oldQueryVariable = (InternalEObject)queryVariable;
			queryVariable = (QueryVariable)eResolveProxy(oldQueryVariable);
			if (queryVariable != oldQueryVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.QUERY_EXPRESSION__QUERY_VARIABLE, oldQueryVariable, queryVariable));
			}
		}
		return queryVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryVariable basicGetQueryVariable() {
		return queryVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryVariable(QueryVariable newQueryVariable) {
		QueryVariable oldQueryVariable = queryVariable;
		queryVariable = newQueryVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.QUERY_EXPRESSION__QUERY_VARIABLE, oldQueryVariable, queryVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAggregateOperand() {
		if (aggregateOperand != null && aggregateOperand.eIsProxy()) {
			InternalEObject oldAggregateOperand = (InternalEObject)aggregateOperand;
			aggregateOperand = (Expression)eResolveProxy(oldAggregateOperand);
			if (aggregateOperand != oldAggregateOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.QUERY_EXPRESSION__AGGREGATE_OPERAND, oldAggregateOperand, aggregateOperand));
			}
		}
		return aggregateOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetAggregateOperand() {
		return aggregateOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateOperand(Expression newAggregateOperand) {
		Expression oldAggregateOperand = aggregateOperand;
		aggregateOperand = newAggregateOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.QUERY_EXPRESSION__AGGREGATE_OPERAND, oldAggregateOperand, aggregateOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.QUERY_EXPRESSION__SELECT_CONDITION:
				return basicSetSelectCondition(null, msgs);
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
			case ExpressionsPackage.QUERY_EXPRESSION__EVALUATION:
				if (resolve) return getEvaluation();
				return basicGetEvaluation();
			case ExpressionsPackage.QUERY_EXPRESSION__INTERPRETATION_CONTEXT:
				if (resolve) return getInterpretationContext();
				return basicGetInterpretationContext();
			case ExpressionsPackage.QUERY_EXPRESSION__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case ExpressionsPackage.QUERY_EXPRESSION__TEXT:
				return getText();
			case ExpressionsPackage.QUERY_EXPRESSION__SELECT_CONDITION:
				return getSelectCondition();
			case ExpressionsPackage.QUERY_EXPRESSION__QUERY_VARIABLE:
				if (resolve) return getQueryVariable();
				return basicGetQueryVariable();
			case ExpressionsPackage.QUERY_EXPRESSION__AGGREGATE_OPERAND:
				if (resolve) return getAggregateOperand();
				return basicGetAggregateOperand();
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
			case ExpressionsPackage.QUERY_EXPRESSION__EVALUATION:
				setEvaluation((Instance)newValue);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__INTERPRETATION_CONTEXT:
				setInterpretationContext((Scope)newValue);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__TEXT:
				setText((String)newValue);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__SELECT_CONDITION:
				setSelectCondition((Expression)newValue);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__QUERY_VARIABLE:
				setQueryVariable((QueryVariable)newValue);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__AGGREGATE_OPERAND:
				setAggregateOperand((Expression)newValue);
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
			case ExpressionsPackage.QUERY_EXPRESSION__EVALUATION:
				setEvaluation((Instance)null);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__INTERPRETATION_CONTEXT:
				setInterpretationContext((Scope)null);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__SELECT_CONDITION:
				setSelectCondition((Expression)null);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__QUERY_VARIABLE:
				setQueryVariable((QueryVariable)null);
				return;
			case ExpressionsPackage.QUERY_EXPRESSION__AGGREGATE_OPERAND:
				setAggregateOperand((Expression)null);
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
			case ExpressionsPackage.QUERY_EXPRESSION__EVALUATION:
				return evaluation != null;
			case ExpressionsPackage.QUERY_EXPRESSION__INTERPRETATION_CONTEXT:
				return interpretationContext != null;
			case ExpressionsPackage.QUERY_EXPRESSION__DATA_TYPE:
				return dataType != null;
			case ExpressionsPackage.QUERY_EXPRESSION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case ExpressionsPackage.QUERY_EXPRESSION__SELECT_CONDITION:
				return selectCondition != null;
			case ExpressionsPackage.QUERY_EXPRESSION__QUERY_VARIABLE:
				return queryVariable != null;
			case ExpressionsPackage.QUERY_EXPRESSION__AGGREGATE_OPERAND:
				return aggregateOperand != null;
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
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				case ExpressionsPackage.QUERY_EXPRESSION__EVALUATION: return CorePackage.EXPRESSION__EVALUATION;
				case ExpressionsPackage.QUERY_EXPRESSION__INTERPRETATION_CONTEXT: return CorePackage.EXPRESSION__INTERPRETATION_CONTEXT;
				case ExpressionsPackage.QUERY_EXPRESSION__DATA_TYPE: return CorePackage.EXPRESSION__DATA_TYPE;
				case ExpressionsPackage.QUERY_EXPRESSION__TEXT: return CorePackage.EXPRESSION__TEXT;
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
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				case CorePackage.EXPRESSION__EVALUATION: return ExpressionsPackage.QUERY_EXPRESSION__EVALUATION;
				case CorePackage.EXPRESSION__INTERPRETATION_CONTEXT: return ExpressionsPackage.QUERY_EXPRESSION__INTERPRETATION_CONTEXT;
				case CorePackage.EXPRESSION__DATA_TYPE: return ExpressionsPackage.QUERY_EXPRESSION__DATA_TYPE;
				case CorePackage.EXPRESSION__TEXT: return ExpressionsPackage.QUERY_EXPRESSION__TEXT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //QueryExpressionImpl
