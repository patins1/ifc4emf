/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.Remark;
import org.ifc4emf.metamodel.express.core.Schema;
import org.ifc4emf.metamodel.express.core.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RemarkImpl#getDescribesSchema <em>Describes Schema</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RemarkImpl#getAppearsIn <em>Appears In</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RemarkImpl#getDescribesElement <em>Describes Element</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RemarkImpl#getIsTagged <em>Is Tagged</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RemarkImpl#getIsTail <em>Is Tail</em>}</li>
 *   <li>{@link org.ifc4emf.metamodel.express.core.impl.RemarkImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemarkImpl extends EObjectImpl implements Remark {
	/**
	 * The cached value of the '{@link #getDescribesSchema() <em>Describes Schema</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribesSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> describesSchema;

	/**
	 * The cached value of the '{@link #getAppearsIn() <em>Appears In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearsIn()
	 * @generated
	 * @ordered
	 */
	protected Scope appearsIn;

	/**
	 * The cached value of the '{@link #getDescribesElement() <em>Describes Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribesElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> describesElement;

	/**
	 * The default value of the '{@link #getIsTagged() <em>Is Tagged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTagged()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_TAGGED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsTagged() <em>Is Tagged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTagged()
	 * @generated
	 * @ordered
	 */
	protected Boolean isTagged = IS_TAGGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsTail() <em>Is Tail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTail()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_TAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsTail() <em>Is Tail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTail()
	 * @generated
	 * @ordered
	 */
	protected Boolean isTail = IS_TAIL_EDEFAULT;

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
	protected RemarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REMARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getDescribesSchema() {
		if (describesSchema == null) {
			describesSchema = new EObjectWithInverseResolvingEList.ManyInverse<Schema>(Schema.class, this, CorePackage.REMARK__DESCRIBES_SCHEMA, CorePackage.SCHEMA__DOCUMENTATION);
		}
		return describesSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getAppearsIn() {
		if (appearsIn != null && appearsIn.eIsProxy()) {
			InternalEObject oldAppearsIn = (InternalEObject)appearsIn;
			appearsIn = (Scope)eResolveProxy(oldAppearsIn);
			if (appearsIn != oldAppearsIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.REMARK__APPEARS_IN, oldAppearsIn, appearsIn));
			}
		}
		return appearsIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope basicGetAppearsIn() {
		return appearsIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearsIn(Scope newAppearsIn, NotificationChain msgs) {
		Scope oldAppearsIn = appearsIn;
		appearsIn = newAppearsIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.REMARK__APPEARS_IN, oldAppearsIn, newAppearsIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearsIn(Scope newAppearsIn) {
		if (newAppearsIn != appearsIn) {
			NotificationChain msgs = null;
			if (appearsIn != null)
				msgs = ((InternalEObject)appearsIn).eInverseRemove(this, CorePackage.SCOPE__INCLUDES_REMARKS, Scope.class, msgs);
			if (newAppearsIn != null)
				msgs = ((InternalEObject)newAppearsIn).eInverseAdd(this, CorePackage.SCOPE__INCLUDES_REMARKS, Scope.class, msgs);
			msgs = basicSetAppearsIn(newAppearsIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REMARK__APPEARS_IN, newAppearsIn, newAppearsIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getDescribesElement() {
		if (describesElement == null) {
			describesElement = new EObjectWithInverseResolvingEList.ManyInverse<NamedElement>(NamedElement.class, this, CorePackage.REMARK__DESCRIBES_ELEMENT, CorePackage.NAMED_ELEMENT__DOCUMENTATION);
		}
		return describesElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsTagged() {
		return isTagged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTagged(Boolean newIsTagged) {
		Boolean oldIsTagged = isTagged;
		isTagged = newIsTagged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REMARK__IS_TAGGED, oldIsTagged, isTagged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsTail() {
		return isTail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTail(Boolean newIsTail) {
		Boolean oldIsTail = isTail;
		isTail = newIsTail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REMARK__IS_TAIL, oldIsTail, isTail));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REMARK__TEXT, oldText, text));
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
			case CorePackage.REMARK__DESCRIBES_SCHEMA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDescribesSchema()).basicAdd(otherEnd, msgs);
			case CorePackage.REMARK__APPEARS_IN:
				if (appearsIn != null)
					msgs = ((InternalEObject)appearsIn).eInverseRemove(this, CorePackage.SCOPE__INCLUDES_REMARKS, Scope.class, msgs);
				return basicSetAppearsIn((Scope)otherEnd, msgs);
			case CorePackage.REMARK__DESCRIBES_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDescribesElement()).basicAdd(otherEnd, msgs);
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
			case CorePackage.REMARK__DESCRIBES_SCHEMA:
				return ((InternalEList<?>)getDescribesSchema()).basicRemove(otherEnd, msgs);
			case CorePackage.REMARK__APPEARS_IN:
				return basicSetAppearsIn(null, msgs);
			case CorePackage.REMARK__DESCRIBES_ELEMENT:
				return ((InternalEList<?>)getDescribesElement()).basicRemove(otherEnd, msgs);
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
			case CorePackage.REMARK__DESCRIBES_SCHEMA:
				return getDescribesSchema();
			case CorePackage.REMARK__APPEARS_IN:
				if (resolve) return getAppearsIn();
				return basicGetAppearsIn();
			case CorePackage.REMARK__DESCRIBES_ELEMENT:
				return getDescribesElement();
			case CorePackage.REMARK__IS_TAGGED:
				return getIsTagged();
			case CorePackage.REMARK__IS_TAIL:
				return getIsTail();
			case CorePackage.REMARK__TEXT:
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
			case CorePackage.REMARK__DESCRIBES_SCHEMA:
				getDescribesSchema().clear();
				getDescribesSchema().addAll((Collection<? extends Schema>)newValue);
				return;
			case CorePackage.REMARK__APPEARS_IN:
				setAppearsIn((Scope)newValue);
				return;
			case CorePackage.REMARK__DESCRIBES_ELEMENT:
				getDescribesElement().clear();
				getDescribesElement().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case CorePackage.REMARK__IS_TAGGED:
				setIsTagged((Boolean)newValue);
				return;
			case CorePackage.REMARK__IS_TAIL:
				setIsTail((Boolean)newValue);
				return;
			case CorePackage.REMARK__TEXT:
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
			case CorePackage.REMARK__DESCRIBES_SCHEMA:
				getDescribesSchema().clear();
				return;
			case CorePackage.REMARK__APPEARS_IN:
				setAppearsIn((Scope)null);
				return;
			case CorePackage.REMARK__DESCRIBES_ELEMENT:
				getDescribesElement().clear();
				return;
			case CorePackage.REMARK__IS_TAGGED:
				setIsTagged(IS_TAGGED_EDEFAULT);
				return;
			case CorePackage.REMARK__IS_TAIL:
				setIsTail(IS_TAIL_EDEFAULT);
				return;
			case CorePackage.REMARK__TEXT:
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
			case CorePackage.REMARK__DESCRIBES_SCHEMA:
				return describesSchema != null && !describesSchema.isEmpty();
			case CorePackage.REMARK__APPEARS_IN:
				return appearsIn != null;
			case CorePackage.REMARK__DESCRIBES_ELEMENT:
				return describesElement != null && !describesElement.isEmpty();
			case CorePackage.REMARK__IS_TAGGED:
				return IS_TAGGED_EDEFAULT == null ? isTagged != null : !IS_TAGGED_EDEFAULT.equals(isTagged);
			case CorePackage.REMARK__IS_TAIL:
				return IS_TAIL_EDEFAULT == null ? isTail != null : !IS_TAIL_EDEFAULT.equals(isTail);
			case CorePackage.REMARK__TEXT:
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
		result.append(" (isTagged: ");
		result.append(isTagged);
		result.append(", isTail: ");
		result.append(isTail);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //RemarkImpl
