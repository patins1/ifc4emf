/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.algorithms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.algorithms.Algorithm;
import org.ifc4emf.metamodel.express.algorithms.AlgorithmsPackage;
import org.ifc4emf.metamodel.express.algorithms.Statement;
import org.ifc4emf.metamodel.express.statements.EscapeStatement;
import org.ifc4emf.metamodel.express.statements.RepeatStatement;
import org.ifc4emf.metamodel.express.statements.SkipStatement;
import org.ifc4emf.metamodel.express.statements.StatementBlock;
import org.ifc4emf.metamodel.express.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl#getInBlock <em>In Block</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl#getBodyStatementsSkipStatement <em>Body Statements Skip Statement</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl#getBodyStatementsEscapeStatement <em>Body Statements Escape Statement</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl#getControlledBy <em>Controlled By</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.algorithms.impl.StatementImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends EObjectImpl implements Statement {
	/**
	 * The cached value of the '{@link #getBodyStatementsSkipStatement() <em>Body Statements Skip Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyStatementsSkipStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<SkipStatement> bodyStatementsSkipStatement;

	/**
	 * The cached value of the '{@link #getBodyStatementsEscapeStatement() <em>Body Statements Escape Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyStatementsEscapeStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<EscapeStatement> bodyStatementsEscapeStatement;

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
	protected StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmsPackage.Literals.STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementBlock getInBlock() {
		if (eContainerFeatureID() != AlgorithmsPackage.STATEMENT__IN_BLOCK) return null;
		return (StatementBlock)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInBlock(StatementBlock newInBlock, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInBlock, AlgorithmsPackage.STATEMENT__IN_BLOCK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInBlock(StatementBlock newInBlock) {
		if (newInBlock != eInternalContainer() || (eContainerFeatureID() != AlgorithmsPackage.STATEMENT__IN_BLOCK && newInBlock != null)) {
			if (EcoreUtil.isAncestor(this, newInBlock))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInBlock != null)
				msgs = ((InternalEObject)newInBlock).eInverseAdd(this, StatementsPackage.STATEMENT_BLOCK__BODY_STATEMENTS_STATEMENT, StatementBlock.class, msgs);
			msgs = basicSetInBlock(newInBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.STATEMENT__IN_BLOCK, newInBlock, newInBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SkipStatement> getBodyStatementsSkipStatement() {
		if (bodyStatementsSkipStatement == null) {
			bodyStatementsSkipStatement = new EObjectContainmentEList<SkipStatement>(SkipStatement.class, this, AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT);
		}
		return bodyStatementsSkipStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EscapeStatement> getBodyStatementsEscapeStatement() {
		if (bodyStatementsEscapeStatement == null) {
			bodyStatementsEscapeStatement = new EObjectContainmentEList<EscapeStatement>(EscapeStatement.class, this, AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT);
		}
		return bodyStatementsEscapeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatStatement getControlledBy() {
		if (eContainerFeatureID() != AlgorithmsPackage.STATEMENT__CONTROLLED_BY) return null;
		return (RepeatStatement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlledBy(RepeatStatement newControlledBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newControlledBy, AlgorithmsPackage.STATEMENT__CONTROLLED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlledBy(RepeatStatement newControlledBy) {
		if (newControlledBy != eInternalContainer() || (eContainerFeatureID() != AlgorithmsPackage.STATEMENT__CONTROLLED_BY && newControlledBy != null)) {
			if (EcoreUtil.isAncestor(this, newControlledBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newControlledBy != null)
				msgs = ((InternalEObject)newControlledBy).eInverseAdd(this, StatementsPackage.REPEAT_STATEMENT__BODY, RepeatStatement.class, msgs);
			msgs = basicSetControlledBy(newControlledBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.STATEMENT__CONTROLLED_BY, newControlledBy, newControlledBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithm getImplements() {
		if (eContainerFeatureID() != AlgorithmsPackage.STATEMENT__IMPLEMENTS) return null;
		return (Algorithm)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplements(Algorithm newImplements, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImplements, AlgorithmsPackage.STATEMENT__IMPLEMENTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(Algorithm newImplements) {
		if (newImplements != eInternalContainer() || (eContainerFeatureID() != AlgorithmsPackage.STATEMENT__IMPLEMENTS && newImplements != null)) {
			if (EcoreUtil.isAncestor(this, newImplements))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImplements != null)
				msgs = ((InternalEObject)newImplements).eInverseAdd(this, AlgorithmsPackage.ALGORITHM__BODY, Algorithm.class, msgs);
			msgs = basicSetImplements(newImplements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.STATEMENT__IMPLEMENTS, newImplements, newImplements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmsPackage.STATEMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmsPackage.STATEMENT__IN_BLOCK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInBlock((StatementBlock)otherEnd, msgs);
			case AlgorithmsPackage.STATEMENT__CONTROLLED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetControlledBy((RepeatStatement)otherEnd, msgs);
			case AlgorithmsPackage.STATEMENT__IMPLEMENTS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImplements((Algorithm)otherEnd, msgs);
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
			case AlgorithmsPackage.STATEMENT__IN_BLOCK:
				return basicSetInBlock(null, msgs);
			case AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT:
				return ((InternalEList<?>)getBodyStatementsSkipStatement()).basicRemove(otherEnd, msgs);
			case AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT:
				return ((InternalEList<?>)getBodyStatementsEscapeStatement()).basicRemove(otherEnd, msgs);
			case AlgorithmsPackage.STATEMENT__CONTROLLED_BY:
				return basicSetControlledBy(null, msgs);
			case AlgorithmsPackage.STATEMENT__IMPLEMENTS:
				return basicSetImplements(null, msgs);
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
			case AlgorithmsPackage.STATEMENT__IN_BLOCK:
				return eInternalContainer().eInverseRemove(this, StatementsPackage.STATEMENT_BLOCK__BODY_STATEMENTS_STATEMENT, StatementBlock.class, msgs);
			case AlgorithmsPackage.STATEMENT__CONTROLLED_BY:
				return eInternalContainer().eInverseRemove(this, StatementsPackage.REPEAT_STATEMENT__BODY, RepeatStatement.class, msgs);
			case AlgorithmsPackage.STATEMENT__IMPLEMENTS:
				return eInternalContainer().eInverseRemove(this, AlgorithmsPackage.ALGORITHM__BODY, Algorithm.class, msgs);
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
			case AlgorithmsPackage.STATEMENT__IN_BLOCK:
				return getInBlock();
			case AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT:
				return getBodyStatementsSkipStatement();
			case AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT:
				return getBodyStatementsEscapeStatement();
			case AlgorithmsPackage.STATEMENT__CONTROLLED_BY:
				return getControlledBy();
			case AlgorithmsPackage.STATEMENT__IMPLEMENTS:
				return getImplements();
			case AlgorithmsPackage.STATEMENT__TEXT:
				return getText();
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
			case AlgorithmsPackage.STATEMENT__IN_BLOCK:
				setInBlock((StatementBlock)newValue);
				return;
			case AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT:
				getBodyStatementsSkipStatement().clear();
				getBodyStatementsSkipStatement().addAll((Collection<? extends SkipStatement>)newValue);
				return;
			case AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT:
				getBodyStatementsEscapeStatement().clear();
				getBodyStatementsEscapeStatement().addAll((Collection<? extends EscapeStatement>)newValue);
				return;
			case AlgorithmsPackage.STATEMENT__CONTROLLED_BY:
				setControlledBy((RepeatStatement)newValue);
				return;
			case AlgorithmsPackage.STATEMENT__IMPLEMENTS:
				setImplements((Algorithm)newValue);
				return;
			case AlgorithmsPackage.STATEMENT__TEXT:
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
			case AlgorithmsPackage.STATEMENT__IN_BLOCK:
				setInBlock((StatementBlock)null);
				return;
			case AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT:
				getBodyStatementsSkipStatement().clear();
				return;
			case AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT:
				getBodyStatementsEscapeStatement().clear();
				return;
			case AlgorithmsPackage.STATEMENT__CONTROLLED_BY:
				setControlledBy((RepeatStatement)null);
				return;
			case AlgorithmsPackage.STATEMENT__IMPLEMENTS:
				setImplements((Algorithm)null);
				return;
			case AlgorithmsPackage.STATEMENT__TEXT:
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
			case AlgorithmsPackage.STATEMENT__IN_BLOCK:
				return getInBlock() != null;
			case AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_SKIP_STATEMENT:
				return bodyStatementsSkipStatement != null && !bodyStatementsSkipStatement.isEmpty();
			case AlgorithmsPackage.STATEMENT__BODY_STATEMENTS_ESCAPE_STATEMENT:
				return bodyStatementsEscapeStatement != null && !bodyStatementsEscapeStatement.isEmpty();
			case AlgorithmsPackage.STATEMENT__CONTROLLED_BY:
				return getControlledBy() != null;
			case AlgorithmsPackage.STATEMENT__IMPLEMENTS:
				return getImplements() != null;
			case AlgorithmsPackage.STATEMENT__TEXT:
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

} //StatementImpl
