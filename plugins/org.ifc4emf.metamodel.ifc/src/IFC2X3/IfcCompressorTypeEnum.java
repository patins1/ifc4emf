/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Compressor Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFC2X3.IFC2X3Package#getIfcCompressorTypeEnum()
 * @model
 * @generated
 */
public enum IfcCompressorTypeEnum implements Enumerator {
	/**
	 * The '<em><b>DYNAMIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMIC(0, "DYNAMIC", "DYNAMIC"), /**
	 * The '<em><b>RECIPROCATING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECIPROCATING_VALUE
	 * @generated
	 * @ordered
	 */
	RECIPROCATING(1, "RECIPROCATING", "RECIPROCATING"), /**
	 * The '<em><b>ROTARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROTARY_VALUE
	 * @generated
	 * @ordered
	 */
	ROTARY(2, "ROTARY", "ROTARY"), /**
	 * The '<em><b>SCROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCROLL_VALUE
	 * @generated
	 * @ordered
	 */
	SCROLL(3, "SCROLL", "SCROLL"), /**
	 * The '<em><b>TROCHOIDAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TROCHOIDAL_VALUE
	 * @generated
	 * @ordered
	 */
	TROCHOIDAL(4, "TROCHOIDAL", "TROCHOIDAL"), /**
	 * The '<em><b>SINGLESTAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLESTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLESTAGE(5, "SINGLESTAGE", "SINGLESTAGE"), /**
	 * The '<em><b>BOOSTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOSTER_VALUE
	 * @generated
	 * @ordered
	 */
	BOOSTER(6, "BOOSTER", "BOOSTER"), /**
	 * The '<em><b>OPENTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	OPENTYPE(7, "OPENTYPE", "OPENTYPE"), /**
	 * The '<em><b>HERMETIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HERMETIC_VALUE
	 * @generated
	 * @ordered
	 */
	HERMETIC(8, "HERMETIC", "HERMETIC"), /**
	 * The '<em><b>SEMIHERMETIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMIHERMETIC_VALUE
	 * @generated
	 * @ordered
	 */
	SEMIHERMETIC(9, "SEMIHERMETIC", "SEMIHERMETIC"), /**
	 * The '<em><b>WELDEDSHELLHERMETIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WELDEDSHELLHERMETIC_VALUE
	 * @generated
	 * @ordered
	 */
	WELDEDSHELLHERMETIC(10, "WELDEDSHELLHERMETIC", "WELDEDSHELLHERMETIC"), /**
	 * The '<em><b>ROLLINGPISTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLLINGPISTON_VALUE
	 * @generated
	 * @ordered
	 */
	ROLLINGPISTON(11, "ROLLINGPISTON", "ROLLINGPISTON"), /**
	 * The '<em><b>ROTARYVANE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROTARYVANE_VALUE
	 * @generated
	 * @ordered
	 */
	ROTARYVANE(12, "ROTARYVANE", "ROTARYVANE"), /**
	 * The '<em><b>SINGLESCREW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLESCREW_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLESCREW(13, "SINGLESCREW", "SINGLESCREW"), /**
	 * The '<em><b>TWINSCREW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWINSCREW_VALUE
	 * @generated
	 * @ordered
	 */
	TWINSCREW(14, "TWINSCREW", "TWINSCREW"), /**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(15, "USERDEFINED", "USERDEFINED"), /**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(16, "NOTDEFINED", "NOTDEFINED");

	/**
	 * The '<em><b>DYNAMIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DYNAMIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_VALUE = 0;

	/**
	 * The '<em><b>RECIPROCATING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECIPROCATING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECIPROCATING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECIPROCATING_VALUE = 1;

	/**
	 * The '<em><b>ROTARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROTARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROTARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROTARY_VALUE = 2;

	/**
	 * The '<em><b>SCROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCROLL_VALUE = 3;

	/**
	 * The '<em><b>TROCHOIDAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TROCHOIDAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TROCHOIDAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TROCHOIDAL_VALUE = 4;

	/**
	 * The '<em><b>SINGLESTAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLESTAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLESTAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLESTAGE_VALUE = 5;

	/**
	 * The '<em><b>BOOSTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOOSTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOSTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOSTER_VALUE = 6;

	/**
	 * The '<em><b>OPENTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPENTYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPENTYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENTYPE_VALUE = 7;

	/**
	 * The '<em><b>HERMETIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HERMETIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HERMETIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HERMETIC_VALUE = 8;

	/**
	 * The '<em><b>SEMIHERMETIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEMIHERMETIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMIHERMETIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEMIHERMETIC_VALUE = 9;

	/**
	 * The '<em><b>WELDEDSHELLHERMETIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WELDEDSHELLHERMETIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WELDEDSHELLHERMETIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WELDEDSHELLHERMETIC_VALUE = 10;

	/**
	 * The '<em><b>ROLLINGPISTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROLLINGPISTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROLLINGPISTON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROLLINGPISTON_VALUE = 11;

	/**
	 * The '<em><b>ROTARYVANE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROTARYVANE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROTARYVANE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROTARYVANE_VALUE = 12;

	/**
	 * The '<em><b>SINGLESCREW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLESCREW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLESCREW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLESCREW_VALUE = 13;

	/**
	 * The '<em><b>TWINSCREW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWINSCREW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWINSCREW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWINSCREW_VALUE = 14;

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USERDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USERDEFINED_VALUE = 15;

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTDEFINED_VALUE = 16;

	/**
	 * An array of all the '<em><b>Ifc Compressor Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcCompressorTypeEnum[] VALUES_ARRAY =
		new IfcCompressorTypeEnum[] {
			DYNAMIC,
			RECIPROCATING,
			ROTARY,
			SCROLL,
			TROCHOIDAL,
			SINGLESTAGE,
			BOOSTER,
			OPENTYPE,
			HERMETIC,
			SEMIHERMETIC,
			WELDEDSHELLHERMETIC,
			ROLLINGPISTON,
			ROTARYVANE,
			SINGLESCREW,
			TWINSCREW,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Compressor Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcCompressorTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Compressor Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCompressorTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCompressorTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Compressor Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCompressorTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCompressorTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Compressor Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCompressorTypeEnum get(int value) {
		switch (value) {
			case DYNAMIC_VALUE: return DYNAMIC;
			case RECIPROCATING_VALUE: return RECIPROCATING;
			case ROTARY_VALUE: return ROTARY;
			case SCROLL_VALUE: return SCROLL;
			case TROCHOIDAL_VALUE: return TROCHOIDAL;
			case SINGLESTAGE_VALUE: return SINGLESTAGE;
			case BOOSTER_VALUE: return BOOSTER;
			case OPENTYPE_VALUE: return OPENTYPE;
			case HERMETIC_VALUE: return HERMETIC;
			case SEMIHERMETIC_VALUE: return SEMIHERMETIC;
			case WELDEDSHELLHERMETIC_VALUE: return WELDEDSHELLHERMETIC;
			case ROLLINGPISTON_VALUE: return ROLLINGPISTON;
			case ROTARYVANE_VALUE: return ROTARYVANE;
			case SINGLESCREW_VALUE: return SINGLESCREW;
			case TWINSCREW_VALUE: return TWINSCREW;
			case USERDEFINED_VALUE: return USERDEFINED;
			case NOTDEFINED_VALUE: return NOTDEFINED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IfcCompressorTypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //IfcCompressorTypeEnum
