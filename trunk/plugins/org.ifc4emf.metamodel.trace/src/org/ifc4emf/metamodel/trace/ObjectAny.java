/**
 * Copyright michael lawley 2004
 */
package org.ifc4emf.metamodel.trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Any</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifc4emf.metamodel.trace.ObjectAny#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifc4emf.metamodel.trace.TracePackage#getObjectAny()
 * @model
 * @generated
 */
public interface ObjectAny extends Any {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright michael lawley 2004";

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see org.ifc4emf.metamodel.trace.TracePackage#getObjectAny_Value()
	 * @model type="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EList getValue();

} // ObjectAny
