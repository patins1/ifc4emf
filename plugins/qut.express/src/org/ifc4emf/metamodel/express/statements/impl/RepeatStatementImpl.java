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
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.Expression;
import org.ifc4emf.metamodel.express.core.LocalElement;
import org.ifc4emf.metamodel.express.core.LocalScope;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.Remark;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.statements.ControlVariable;
import org.ifc4emf.metamodel.express.statements.RepeatStatement;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.RepeatStatementImpl#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.RepeatStatementImpl#getIncludesRemarks <em>Includes Remarks</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.RepeatStatementImpl#getLocalElements <em>Local Elements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.RepeatStatementImpl#getWhileExpression <em>While Expression</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.RepeatStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.RepeatStatementImpl#getControlVariable <em>Control Variable</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.statements.impl.RepeatStatementImpl#getUntilExpression <em>Until Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatStatementImpl extends StatementImpl implements RepeatStatement {
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
	 * The cached value of the '{@link #getWhileExpression() <em>While Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression whileExpression;

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
	 * The cached value of the '{@link #getControlVariable() <em>Control Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlVariable()
	 * @generated
	 * @ordered
	 */
	protected ControlVariable controlVariable;

	/**
	 * The cached value of the '{@link #getUntilExpression() <em>Until Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression untilExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.REPEAT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getNamedElements() {
		if (namedElements == null) {
			namedElements = new EObjectWithInverseResolvingEList<NamedElement>(NamedElement.class, this, StatementsPackage.REPEAT_STATEMENT__NAMED_ELEMENTS, CorePackage.NAMED_ELEMENT__NAMESPACE);
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
			includesRemarks = new EObjectWithInverseResolvingEList<Remark>(Remark.class, this, StatementsPackage.REPEAT_STATEMENT__INCLUDES_REMARKS, CorePackage.REMARK__APPEARS_IN);
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
			localElements = new EObjectResolvingEList<LocalElement>(LocalElement.class, this, StatementsPackage.REPEAT_STATEMENT__LOCAL_ELEMENTS);
		}
		return localElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWhileExpression() {
		if (whileExpression != null && whileExpression.eIsProxy()) {
			InternalEObject oldWhileExpression = (InternalEObject)whileExpression;
			whileExpression = (Expression)eResolveProxy(oldWhileExpression);
			if (whileExpression != oldWhileExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.REPEAT_STATEMENT__WHILE_EXPRESSION, oldWhileExpression, whileExpression));
			}
		}
		return whileExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetWhileExpression() {
		return whileExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhileExpression(Expression newWhileExpression) {
		Expression oldWhileExpression = whileExpression;
		whileExpression = newWhileExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.REPEAT_STATEMENT__WHILE_EXPRESSION, oldWhileExpression, whileExpression));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.REPEAT_STATEMENT__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, AlgorithmsPackage.STATEMENT__CONTROLLED_BY, Statement.class, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, AlgorithmsPackage.STATEMENT__CONTROLLED_BY, Statement.class, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.REPEAT_STATEMENT__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlVariable getControlVariable() {
		return controlVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlVariable(ControlVariable newControlVariable, NotificationChain msgs) {
		ControlVariable oldControlVariable = controlVariable;
		controlVariable = newControlVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.REPEAT_STATEMENT__CONTROL_VARIABLE, oldControlVariable, newControlVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlVariable(ControlVariable newControlVariable) {
		if (newControlVariable != controlVariable) {
			NotificationChain msgs = null;
			if (controlVariable != null)
				msgs = ((InternalEObject)controlVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.REPEAT_STATEMENT__CONTROL_VARIABLE, null, msgs);
			if (newControlVariable != null)
				msgs = ((InternalEObject)newControlVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.REPEAT_STATEMENT__CONTROL_VARIABLE, null, msgs);
			msgs = basicSetControlVariable(newControlVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.REPEAT_STATEMENT__CONTROL_VARIABLE, newControlVariable, newControlVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getUntilExpression() {
		if (untilExpression != null && untilExpression.eIsProxy()) {
			InternalEObject oldUntilExpression = (InternalEObject)untilExpression;
			untilExpression = (Expression)eResolveProxy(oldUntilExpression);
			if (untilExpression != oldUntilExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.REPEAT_STATEMENT__UNTIL_EXPRESSION, oldUntilExpression, untilExpression));
			}
		}
		return untilExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetUntilExpression() {
		return untilExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilExpression(Expression newUntilExpression) {
		Expression oldUntilExpression = untilExpression;
		untilExpression = newUntilExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.REPEAT_STATEMENT__UNTIL_EXPRESSION, oldUntilExpression, untilExpression));
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
			case StatementsPackage.REPEAT_STATEMENT__NAMED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNamedElements()).basicAdd(otherEnd, msgs);
			case StatementsPackage.REPEAT_STATEMENT__INCLUDES_REMARKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludesRemarks()).basicAdd(otherEnd, msgs);
			case StatementsPackage.REPEAT_STATEMENT__BODY:
				if (body != null)
					msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.REPEAT_STATEMENT__BODY, null, msgs);
				return basicSetBody((Statement)otherEnd, msgs);
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
			case StatementsPackage.REPEAT_STATEMENT__NAMED_ELEMENTS:
				return ((InternalEList<?>)getNamedElements()).basicRemove(otherEnd, msgs);
			case StatementsPackage.REPEAT_STATEMENT__INCLUDES_REMARKS:
				return ((InternalEList<?>)getIncludesRemarks()).basicRemove(otherEnd, msgs);
			case StatementsPackage.REPEAT_STATEMENT__BODY:
				return basicSetBody(null, msgs);
			case StatementsPackage.REPEAT_STATEMENT__CONTROL_VARIABLE:
				return basicSetControlVariable(null, msgs);
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
			case StatementsPackage.REPEAT_STATEMENT__NAMED_ELEMENTS:
				return getNamedElements();
			case StatementsPackage.REPEAT_STATEMENT__INCLUDES_REMARKS:
				return getIncludesRemarks();
			case StatementsPackage.REPEAT_STATEMENT__LOCAL_ELEMENTS:
				return getLocalElements();
			case StatementsPackage.REPEAT_STATEMENT__WHILE_EXPRESSION:
				if (resolve) return getWhileExpression();
				return basicGetWhileExpression();
			case StatementsPackage.REPEAT_STATEMENT__BODY:
				return getBody();
			case StatementsPackage.REPEAT_STATEMENT__CONTROL_VARIABLE:
				return getControlVariable();
			case StatementsPackage.REPEAT_STATEMENT__UNTIL_EXPRESSION:
				if (resolve) return getUntilExpression();
				return basicGetUntilExpression();
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
			case StatementsPackage.REPEAT_STATEMENT__NAMED_ELEMENTS:
				getNamedElements().clear();
				getNamedElements().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case StatementsPackage.REPEAT_STATEMENT__INCLUDES_REMARKS:
				getIncludesRemarks().clear();
				getIncludesRemarks().addAll((Collection<? extends Remark>)newValue);
				return;
			case StatementsPackage.REPEAT_STATEMENT__LOCAL_ELEMENTS:
				getLocalElements().clear();
				getLocalElements().addAll((Collection<? extends LocalElement>)newValue);
				return;
			case StatementsPackage.REPEAT_STATEMENT__WHILE_EXPRESSION:
				setWhileExpression((Expression)newValue);
				return;
			case StatementsPackage.REPEAT_STATEMENT__BODY:
				setBody((Statement)newValue);
				return;
			case StatementsPackage.REPEAT_STATEMENT__CONTROL_VARIABLE:
				setControlVariable((ControlVariable)newValue);
				return;
			case StatementsPackage.REPEAT_STATEMENT__UNTIL_EXPRESSION:
				setUntilExpression((Expression)newValue);
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
			case StatementsPackage.REPEAT_STATEMENT__NAMED_ELEMENTS:
				getNamedElements().clear();
				return;
			case StatementsPackage.REPEAT_STATEMENT__INCLUDES_REMARKS:
				getIncludesRemarks().clear();
				return;
			case StatementsPackage.REPEAT_STATEMENT__LOCAL_ELEMENTS:
				getLocalElements().clear();
				return;
			case StatementsPackage.REPEAT_STATEMENT__WHILE_EXPRESSION:
				setWhileExpression((Expression)null);
				return;
			case StatementsPackage.REPEAT_STATEMENT__BODY:
				setBody((Statement)null);
				return;
			case StatementsPackage.REPEAT_STATEMENT__CONTROL_VARIABLE:
				setControlVariable((ControlVariable)null);
				return;
			case StatementsPackage.REPEAT_STATEMENT__UNTIL_EXPRESSION:
				setUntilExpression((Expression)null);
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
			case StatementsPackage.REPEAT_STATEMENT__NAMED_ELEMENTS:
				return namedElements != null && !namedElements.isEmpty();
			case StatementsPackage.REPEAT_STATEMENT__INCLUDES_REMARKS:
				return includesRemarks != null && !includesRemarks.isEmpty();
			case StatementsPackage.REPEAT_STATEMENT__LOCAL_ELEMENTS:
				return localElements != null && !localElements.isEmpty();
			case StatementsPackage.REPEAT_STATEMENT__WHILE_EXPRESSION:
				return whileExpression != null;
			case StatementsPackage.REPEAT_STATEMENT__BODY:
				return body != null;
			case StatementsPackage.REPEAT_STATEMENT__CONTROL_VARIABLE:
				return controlVariable != null;
			case StatementsPackage.REPEAT_STATEMENT__UNTIL_EXPRESSION:
				return untilExpression != null;
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
				case StatementsPackage.REPEAT_STATEMENT__NAMED_ELEMENTS: return CorePackage.SCOPE__NAMED_ELEMENTS;
				case StatementsPackage.REPEAT_STATEMENT__INCLUDES_REMARKS: return CorePackage.SCOPE__INCLUDES_REMARKS;
				default: return -1;
			}
		}
		if (baseClass == LocalScope.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.REPEAT_STATEMENT__LOCAL_ELEMENTS: return CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS;
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
				case CorePackage.SCOPE__NAMED_ELEMENTS: return StatementsPackage.REPEAT_STATEMENT__NAMED_ELEMENTS;
				case CorePackage.SCOPE__INCLUDES_REMARKS: return StatementsPackage.REPEAT_STATEMENT__INCLUDES_REMARKS;
				default: return -1;
			}
		}
		if (baseClass == LocalScope.class) {
			switch (baseFeatureID) {
				case CorePackage.LOCAL_SCOPE__LOCAL_ELEMENTS: return StatementsPackage.REPEAT_STATEMENT__LOCAL_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RepeatStatementImpl
