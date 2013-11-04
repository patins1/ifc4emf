/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cooling Tower Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCoolingTowerType#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCoolingTowerType()
 * @model
 * @generated
 */
public interface IfcCoolingTowerType extends IfcEnergyConversionDeviceType {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcCoolingTowerTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcCoolingTowerTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcCoolingTowerTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcCoolingTowerType_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcCoolingTowerTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCoolingTowerType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcCoolingTowerTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcCoolingTowerTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCoolingTowerType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcCoolingTowerTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCoolingTowerType#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcCoolingTowerTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

} // IfcCoolingTowerType
