/**
 * Copyright michael lawley 2004
 */
package org.ifc4emf.metamodel.trace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ifc4emf.metamodel.trace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceFactoryImpl extends EFactoryImpl implements TraceFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright michael lawley 2004";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceFactory init() {
		try {
			TraceFactory theTraceFactory = (TraceFactory)EPackage.Registry.INSTANCE.getEFactory(TracePackage.eNS_URI);
			if (theTraceFactory != null) {
				return theTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TracePackage.TRACE: return createTrace();
			case TracePackage.BOOL_ANY: return createBoolAny();
			case TracePackage.INT_ANY: return createIntAny();
			case TracePackage.DECIMAL_ANY: return createDecimalAny();
			case TracePackage.STRING_ANY: return createStringAny();
			case TracePackage.OBJECT_ANY: return createObjectAny();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolAny createBoolAny() {
		BoolAnyImpl boolAny = new BoolAnyImpl();
		return boolAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntAny createIntAny() {
		IntAnyImpl intAny = new IntAnyImpl();
		return intAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalAny createDecimalAny() {
		DecimalAnyImpl decimalAny = new DecimalAnyImpl();
		return decimalAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringAny createStringAny() {
		StringAnyImpl stringAny = new StringAnyImpl();
		return stringAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAny createObjectAny() {
		ObjectAnyImpl objectAny = new ObjectAnyImpl();
		return objectAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracePackage getTracePackage() {
		return (TracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static TracePackage getPackage() {
		return TracePackage.eINSTANCE;
	}

} //TraceFactoryImpl
