/**
 * Copyright michael lawley 2004
 */
package org.ifc4emf.metamodel.trace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Any</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.trace.BoolAny#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.trace.TracePackage#getBoolAny()
 * @model
 * @generated
 */
public interface BoolAny extends Any {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright michael lawley 2004";

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.ifc4emf.metamodel.trace.TracePackage#getBoolAny_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.ifc4emf.metamodel.trace.BoolAny#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BoolAny
