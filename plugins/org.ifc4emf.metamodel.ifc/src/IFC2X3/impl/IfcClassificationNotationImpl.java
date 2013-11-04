/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcClassificationNotation;
import IFC2X3.IfcClassificationNotationFacet;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Notation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcClassificationNotationImpl#getNotationFacets <em>Notation Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationNotationImpl extends IfcClassificationNotationSelectImpl implements IfcClassificationNotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationNotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcClassificationNotation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcClassificationNotationFacet> getNotationFacets() {
		return (EList<IfcClassificationNotationFacet>)eGet(IFC2X3Package.eINSTANCE.getIfcClassificationNotation_NotationFacets(), true);
	}

} //IfcClassificationNotationImpl
