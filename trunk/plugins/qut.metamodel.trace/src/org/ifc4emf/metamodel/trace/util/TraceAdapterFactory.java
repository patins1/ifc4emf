/**
 * Copyright michael lawley 2004
 */
package org.ifc4emf.metamodel.trace.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.trace.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.trace.TracePackage
 * @generated
 */
public class TraceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright michael lawley 2004";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TracePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TracePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceSwitch modelSwitch =
		new TraceSwitch() {
			public Object caseTrace(Trace object) {
				return createTraceAdapter();
			}
			public Object caseAny(Any object) {
				return createAnyAdapter();
			}
			public Object caseBoolAny(BoolAny object) {
				return createBoolAnyAdapter();
			}
			public Object caseIntAny(IntAny object) {
				return createIntAnyAdapter();
			}
			public Object caseDecimalAny(DecimalAny object) {
				return createDecimalAnyAdapter();
			}
			public Object caseStringAny(StringAny object) {
				return createStringAnyAdapter();
			}
			public Object caseObjectAny(ObjectAny object) {
				return createObjectAnyAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.trace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.trace.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.trace.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.trace.Any
	 * @generated
	 */
	public Adapter createAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.trace.BoolAny <em>Bool Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.trace.BoolAny
	 * @generated
	 */
	public Adapter createBoolAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.trace.IntAny <em>Int Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.trace.IntAny
	 * @generated
	 */
	public Adapter createIntAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.trace.DecimalAny <em>Decimal Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.trace.DecimalAny
	 * @generated
	 */
	public Adapter createDecimalAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.trace.StringAny <em>String Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.trace.StringAny
	 * @generated
	 */
	public Adapter createStringAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ifc4emf.metamodel.trace.ObjectAny <em>Object Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ifc4emf.metamodel.trace.ObjectAny
	 * @generated
	 */
	public Adapter createObjectAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TraceAdapterFactory
