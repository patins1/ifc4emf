/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import java.util.Arrays;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IFC2X3Package;
import IFC2X3.IfcAxis2Placement3D;
import IFC2X3.IfcCartesianPoint;
import IFC2X3.IfcDirection;
import IFC2X3.IfcGeometricRepresentationItem;
import IFC2X3.IfcLayeredItem;
import IFC2X3.IfcPlacement;
import IFC2X3.IfcPresentationLayerAssignment;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcStyledItem;
import IFC2X3.util.GeometricAlgorithms;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Axis2 Placement3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAxis2Placement3DImpl#getLayerAssignments <em>Layer Assignments</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAxis2Placement3DImpl#getStyledByItem <em>Styled By Item</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAxis2Placement3DImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAxis2Placement3DImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAxis2Placement3DImpl#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAxis2Placement3DImpl extends IfcAxis2PlacementImpl implements IfcAxis2Placement3D {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAxis2Placement3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAxis2Placement3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPresentationLayerAssignment> getLayerAssignments() {
		return (EList<IfcPresentationLayerAssignment>)eGet(IFC2X3Package.eINSTANCE.getIfcLayeredItem_LayerAssignments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStyledItem getStyledByItem() {
		return (IfcStyledItem)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentationItem_StyledByItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyledByItem(IfcStyledItem newStyledByItem) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentationItem_StyledByItem(), newStyledByItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getLocation() {
		return (IfcCartesianPoint)eGet(IFC2X3Package.eINSTANCE.getIfcPlacement_Location(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(IfcCartesianPoint newLocation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPlacement_Location(), newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getRefDirection() {
		return (IfcDirection)eGet(IFC2X3Package.eINSTANCE.getIfcAxis2Placement3D_RefDirection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefDirection(IfcDirection newRefDirection) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAxis2Placement3D_RefDirection(), newRefDirection);
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IfcDirection> getP() {
		return GeometricAlgorithms.getP(getAxis(), getRefDirection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getAxis() {
		return (IfcDirection)eGet(IFC2X3Package.eINSTANCE.getIfcAxis2Placement3D_Axis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(IfcDirection newAxis) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAxis2Placement3D_Axis(), newAxis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IfcLayeredItem.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_AXIS2_PLACEMENT3_D__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_AXIS2_PLACEMENT3_D__STYLED_BY_ITEM: return IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM;
				default: return -1;
			}
		}
		if (baseClass == IfcGeometricRepresentationItem.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IfcPlacement.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_AXIS2_PLACEMENT3_D__LOCATION: return IFC2X3Package.IFC_PLACEMENT__LOCATION;
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
		if (baseClass == IfcLayeredItem.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_AXIS2_PLACEMENT3_D__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM: return IFC2X3Package.IFC_AXIS2_PLACEMENT3_D__STYLED_BY_ITEM;
				default: return -1;
			}
		}
		if (baseClass == IfcGeometricRepresentationItem.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IfcPlacement.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_PLACEMENT__LOCATION: return IFC2X3Package.IFC_AXIS2_PLACEMENT3_D__LOCATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IfcAxis2Placement3DImpl
