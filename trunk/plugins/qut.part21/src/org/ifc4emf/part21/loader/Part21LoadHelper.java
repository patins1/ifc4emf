/**
 * Copyright (c) 2010- 2011 QUT (Brisbane, Australia).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jim Steel - initial API and implementation
 *    Joerg Kiegeland - extension for database storage 
 */
package org.ifc4emf.part21.loader;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.ExplicitAttribute;
import org.ifc4emf.metamodel.express.core.NamedType;
import org.ifc4emf.metamodel.ifcheader.Model;

public interface Part21LoadHelper {

	public EFactory getFactory();

	public String getSchemaName();

	public NamedType getExpressTypeByName(String typeName) throws NoSuchClassException;

	public EClassifier getEClassifierByName(String typeName) throws NoSuchClassException;

	public EClassifier getEClassifierFromExpressType(AttributeType expressType) throws NoSuchClassException;

	public EStructuralFeature getEStructuralFeatureForExpressAttribute(Attribute express_attribute) throws NoSuchClassException, NoSuchAttributeException;

	public Attribute getExpressAttributeByIndex(String entityName, int i) throws NoSuchClassException, NoSuchAttributeException;

	public boolean isDerivedOverride(String className, String attributeName);

	public void addDerivedOverrideObject(EObject obj);

	public void fillDerivedOverriddens();

	public EObject getExpressTypeForEClassifier(EClass eCls) throws NoSuchClassException;

	public List<ExplicitAttribute> getExpressAttributesForEntity(EntityType entityType) throws NoSuchClassException;

	public boolean isNonEntitySelect(String typeName);

	public String getMemberTypeNameForNonEntitySelectFeatureName(String selectTypeName, String featureName);

	public String getFeatureNameForNonEntitySelectMemberTypeName(String selectTypeName, String memberTypeName);

	public boolean isEntitySelect(String typeName);

	public void addedObject(Model model, EObject ifcObject);

}
