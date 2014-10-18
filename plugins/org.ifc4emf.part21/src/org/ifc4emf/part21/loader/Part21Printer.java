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

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.BinaryType;
import org.ifc4emf.metamodel.express.core.ConcreteAggregationType;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.EnumerationType;
import org.ifc4emf.metamodel.express.core.ExplicitAttribute;
import org.ifc4emf.metamodel.express.core.LogicType;
import org.ifc4emf.metamodel.express.core.NumericType;
import org.ifc4emf.metamodel.express.core.RealType;
import org.ifc4emf.metamodel.express.core.SelectType;
import org.ifc4emf.metamodel.express.core.SpecializedType;
import org.ifc4emf.metamodel.express.core.StringType;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.metamodel.ifcheader.ModelDescription;
import org.ifc4emf.metamodel.ifcheader.ModelName;
import org.ifc4emf.metamodel.ifcheader.ModelSchema;
import org.ifc4emf.part21.Activator;

public class Part21Printer {

	private final IContainmentHelper containmentHelper;

	final Model modelObject;
	private Part21LoadHelper helper;
	private Logger logger;
	private int currentEntityId;
	private int backwardReferences;
	private int forwardReferences;

	private final IProgressMonitor monitor;

	private int unsafedEntities;

	final private int initialAvailable;

	private int nowAvailable;

	private double doneAndSaved;

	private long started = new Date().getTime();

	private long initialStarted = new Date().getTime();

	private int prevForwardReferences;

	private int prevResolvedForwardReferences;

	private int resolvedForwardReferences;

	public Part21Printer(Part21ResourceImpl resource, IProgressMonitor monitor, Part21LoadHelper helper) {
		this((Model) resource.getContents().get(0), monitor, helper);
	}

	public Part21Printer(Model modelObject, IProgressMonitor monitor, Part21LoadHelper helper) {
		super();
		this.modelObject = modelObject;
		this.initialAvailable = Math.max(modelObject.getCount(), modelObject.getContents().size());
		this.monitor = monitor;
		this.helper = helper;
		this.logger = Logger.getLogger("Loader"/* , "org.ifc4emf.metamodel.express.expressparser" */);
		logger.setLevel(Level.INFO);
		containmentHelper = Part21Loader.useContainmentTree() && modelObject.getContentList().isEmpty() ? new ContainmentTreeOrderedByNumberHelper(modelObject) : new SimpleContainmentHelper(modelObject);
	}

	public void save(OutputStream outputStream) throws IOException {
		monitor.beginTask("Print", initialAvailable);
		// First get all the objects whose type derives from an Express Entity Type
		PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
		printHeader(writer, modelObject);
		// Write the body
		writer.println("DATA;");
		Iterator<EObject> iter = containmentHelper.getIterator();
		printIfcObjects(writer, iter);
	}

	/**
	 * Print IFC objects delivered by the given iterator and finally print the end statements
	 * 
	 * @param writer
	 * @param iter
	 * @throws IOException
	 */
	private void printIfcObjects(PrintWriter writer, Iterator<EObject> iter) throws IOException {
		while (iter.hasNext()) {
			EObject eobj = iter.next();
			EClass eCls = eobj.eClass();
			try {
				EObject expressType = helper.getExpressTypeForEClassifier(eCls);
				if (expressType instanceof EntityType) {
					currentEntityId = -1;
					currentEntityId = getID(eobj);
					printObject(writer, eobj);
					worked(false);
				}
			} catch (NoSuchClassException e) {
				// Do nothing
			}
			if (monitor.isCanceled())
				return;
		}

		writer.println("ENDSEC;");

		writer.println("END-ISO-10303-21;");
		writer.close();
		long ended = new Date().getTime();
		if (!monitor.isCanceled())
			worked(true);
		Activator.log("Forward references=" + forwardReferences + " Backward references=" + backwardReferences + " time:" + (ended - initialStarted));
	}

	private void worked(boolean workIsFinished) {
		Resource resource = modelObject.eResource();
		if (resource instanceof CDOResource)
			try {
				if (!workIsFinished) {
					unsafedEntities++;
					nowAvailable++;
					monitor.worked(1);
				}
				if (unsafedEntities >= Part21LoaderCDO.MODEL_WINDOW || workIsFinished) {
					double done = getPercentageDone();
					long finished = new Date().getTime();
					Activator.log("Printing at " + done + "% #dirty=" + unsafedEntities + " %dirty=" + (done - doneAndSaved) + " new forwards=" + (forwardReferences - prevForwardReferences) + " resolved forwards=" + (resolvedForwardReferences - prevResolvedForwardReferences) + " remaining forwards="
							+ getRemainingForwardReferences() + " total forwards=" + forwardReferences + " total backward references=" + backwardReferences + " time:" + (finished - started) + " time/element:" + (finished - started) / new Double(unsafedEntities));
					started = finished;
					if (workIsFinished) {
						if (nowAvailable != initialAvailable) {
							throw new RuntimeException("Expected to print " + initialAvailable + " elements but totally printed " + nowAvailable + " elements!");
						}
					}
					doneAndSaved = done;
					unsafedEntities = 0;
					prevForwardReferences = forwardReferences;
					prevResolvedForwardReferences = resolvedForwardReferences;
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
	}

	protected int getRemainingForwardReferences() {
		return forwardReferences - resolvedForwardReferences;
	}

	private double getPercentageDone() throws IOException {
		return (100.0 * (nowAvailable / (1.0 * initialAvailable)));
	}

	private void printHeader(PrintWriter writer, Model modelObj) {
		writer.println("ISO-10303-21;");
		writer.println("HEADER;");

		ModelDescription desc = modelObj.getDescription();
		if (null != desc) {
			writer.print("FILE_DESCRIPTION ((");
			boolean first = true;
			for (String d : desc.getDescription()) {
				if (!first) {
					writer.print(",");
				} else {
					first = false;
				}
				writer.print('\'');
				writer.print(d);
				writer.print('\'');
			}
			writer.print("), '");
			String implementation_level = desc.getImplementation_level();
			writer.print(implementation_level == null ? "" : implementation_level);
			writer.println("');");
			// TODO Do stuff
			// logger.warning("Model description export not implemented yet");
		} else {
			logger.warning("FILE_DESCRIPTION not found, using default");
			writer.println("FILE_DESCRIPTION ((''), '');");
		}

		ModelName nameObj = modelObj.getName();
		if (null != nameObj) {
			writer.print("FILE_NAME ('");
			String name = nameObj.getName();
			writer.print(name == null ? "" : name);
			writer.print("', '");
			writer.print(nameObj.getTime_stamp());
			writer.print("', (");
			boolean first = true;
			for (String author : nameObj.getAuthor()) {
				writer.print(first ? "'" : ", '");
				first = false;
				writer.print(author);
				writer.print('\'');
			}
			writer.print("), (");
			first = true;
			for (String organization : nameObj.getOrganization()) {
				writer.print(first ? "'" : ", '");
				first = false;
				writer.print(organization);
				writer.print('\'');
			}
			writer.print("), '");
			String preprocessor_version = nameObj.getPreprocessor_version();
			writer.print(preprocessor_version == null ? "" : preprocessor_version);
			writer.print("', '");
			String originating_system = nameObj.getOriginating_system();
			writer.print(originating_system == null ? "" : originating_system);
			writer.print("', '");
			String authorization = nameObj.getAuthorization();
			writer.print(authorization == null ? "" : authorization);
			writer.println("');");
			// TODO Do stuff
			// logger.warning("FILE_NAME export not implemented yet");
		} else {
			logger.warning("FILE_NAME not found, using default");
			writer.println("FILE_NAME ('', '', (''), ('', ''), '', '', '');");
		}

		ModelSchema schema = modelObj.getSchema();
		if (null != schema) {
			writer.print("FILE_SCHEMA ((");
			boolean first = true;
			for (String id : schema.getSchema_identifiers()) {
				writer.print(first ? "'" : ", '");
				first = false;
				writer.print(id);
				writer.print('\'');
			}

			writer.println("));");
			// logger.warning("FILE_SCHEMA export not implemented yet");
		} else {
			logger.warning("FILE_SCHEMA not found, using default");
			writer.print("FILE_SCHEMA (('");
			writer.print(helper.getSchemaName().toUpperCase());
			writer.println("'));");
		}

		writer.println("ENDSEC;");
	}

	private void printObject(PrintWriter writer, EObject eobj) throws IOException {
		EntityType entityType = null;
		try {
			entityType = (EntityType) helper.getExpressTypeForEClassifier(eobj.eClass());
		} catch (NoSuchClassException e) {
			logger.severe("Unable to find a corresponding Express type for object: " + eobj);
		}
		writer.print('#');
		writer.print(getID(eobj));
		writer.print(" = ");
		writer.print(entityType.getId().getLocalName().toUpperCase());
		writer.print(" (");
		try {
			List<ExplicitAttribute> explicitAttrs = helper.getExpressAttributesForEntity(entityType);
			boolean first = true;
			for (ExplicitAttribute expAttr : explicitAttrs) {
				EStructuralFeature eFeature;
				try {
					eFeature = helper.getEStructuralFeatureForExpressAttribute(expAttr);
					if (eFeature == null) {
						logger.severe("Unable to find feature for attribute " + expAttr + " on object " + getID(eobj));
					}

					if (!first) {
						writer.print(",");
					}
					first = false;

					Object featureVal = eobj.eGet(eFeature);
					printAttrVal(writer, entityType, expAttr, expAttr.getAttributeType(), featureVal, eobj, eFeature);
				} catch (NoSuchClassException e) {
					Activator.err(e);
				} catch (NoSuchAttributeException e) {
					Activator.err(e);
				}
			}
		} catch (NoSuchClassException e) {
			logger.severe("Couldn't find the express attributes for type " + entityType.getId().getLocalName());
		}
		writer.println(");");
	}

	private Integer getID(EObject eobj) {
		Integer result = containmentHelper.get(eobj, helper);
		if (currentEntityId != -1)
			if (result < currentEntityId) {
				this.backwardReferences++;
			} else if (result > currentEntityId) {
				this.forwardReferences++;
			}
		return result;
	}

	private void printAttrVal(PrintWriter writer, EntityType entityType, ExplicitAttribute expAttr, AttributeType attributeType, Object featureVal, EObject eobj, EStructuralFeature eFeature) throws NoSuchClassException {
		if (attributeType instanceof SpecializedType) {
			printAttrVal(writer, entityType, expAttr, ((SpecializedType) attributeType).getUnderlyingType(), featureVal, eobj, eFeature);
			// logger.severe("Attribute type not handled: " + attributeType);
		} else if (featureVal == null) {
			if (helper.isDerivedOverride(entityType.getId().getLocalName(), expAttr.getId().getLocalName())) {
				writer.print('*');
			} else if (attributeType instanceof LogicType && eobj.eIsSet(eFeature)) {
				writer.print(".U.");
			} else if (expAttr.getIsOptional()) {
				writer.print('$');
			} else {
				logger.severe("Found no value in " + entityType.getId().getLocalName() + " for attribute that claims to not be optional: " + expAttr.getId().getLocalName());
				writer.print('$'); // treat as optional
			}
		} else if (attributeType instanceof ConcreteAggregationType) {
			if (featureVal instanceof Collection<?>) {
				ConcreteAggregationType aggType = (ConcreteAggregationType) attributeType;
				AttributeType memberType = aggType.getMemberType();
				Collection<?> featureColl = (Collection<?>) featureVal;
				if (featureColl.isEmpty() && expAttr.getIsOptional()) {
					writer.print('$');
				} else {
					writer.print('(');
					boolean first = true;
					for (Object val : featureColl) {
						if (!first)
							writer.print(',');
						first = false;
						printAttrVal(writer, entityType, expAttr, memberType, val, eobj, eFeature);
					}
					writer.print(')');
				}
			} else {
				logger.severe("Expecting Collection in " + entityType.getId().getLocalName() + " for aggregation-valued attribute " + expAttr.getId().getLocalName() + ", found " + featureVal);
			}
			// logger.severe("Attribute type not handled: " + attributeType);
		} else if (attributeType instanceof EntityType) {
			if (featureVal instanceof EObject) {
				Integer objId = getID((EObject) featureVal);
				if (null != objId) {
					writer.print('#');
					writer.print(objId);
				} else {
					logger.severe("Unable to find object ID for object " + featureVal);
				}
			} else {
				logger.severe("Expecting EObject in " + entityType.getId().getLocalName() + " for entity-typed attribute " + expAttr.getId().getLocalName() + ", found " + featureVal);
			}
			// logger.severe("Attribute type not handled: " + attributeType);
		} else if (attributeType instanceof LogicType) {
			if (featureVal instanceof Boolean) {
				boolean val = (Boolean) featureVal;
				writer.print(val ? ".T." : ".F.");
			} else {
				logger.severe("Expected boolean in " + entityType.getId().getLocalName() + " for LogicType-d attribute" + expAttr.getId().getLocalName() + ", found " + featureVal);
			}
			// logger.severe("Attribute type not handled: " + attributeType);
		} else if (attributeType instanceof RealType) {
			if (featureVal instanceof Double) {
				String s = String.valueOf((Double) featureVal);
				if (s.endsWith(".0"))
					s = s.substring(0, s.length() - "0".length());
				writer.print(s);
			} else {
				logger.severe("Expected Double in " + entityType.getId().getLocalName() + " for RealType-d attribute " + expAttr.getId().getLocalName() + ", found " + featureVal);
			}
			// logger.severe("Attribute type not handled: " + attributeType);
		} else if (attributeType instanceof NumericType) {
			if (featureVal instanceof Integer) {
				writer.print((Integer) featureVal);
			} else if (featureVal instanceof Double) {
				String s = String.valueOf((Double) featureVal);
				if (s.endsWith(".0"))
					s = s.substring(0, s.length() - "0".length());
				writer.print(s);
			} else {
				logger.severe("Expected int in " + entityType.getId().getLocalName() + " for NumericType-d attribute " + expAttr.getId().getLocalName() + ", found " + featureVal);
			}
			// logger.severe("Attribute type not handled: " + attributeType);
		} else if (attributeType instanceof StringType) {
			// TODO handle string escaping?
			if (featureVal instanceof String) {
				writer.print('\'');
				writer.print((String) featureVal);
				writer.print('\'');
			} else {
				logger.severe("Expected String in " + entityType.getId().getLocalName() + " for StringType-d attribute" + expAttr.getId().getLocalName() + ", instead found " + featureVal);
			}
			// logger.severe("Attribute type not handled: " + attributeType);
		} else if (attributeType instanceof BinaryType) {
			logger.severe("Attribute type not handled: " + attributeType);
		} else if (attributeType instanceof EnumerationType) {
			if (featureVal instanceof Enumerator) {
				Enumerator enumerator = (Enumerator) featureVal;
				if (expAttr.getIsOptional() && !eobj.eIsSet(eFeature)) {
					writer.print('$');
				} else {
					writer.print('.');
					writer.print(((Enumerator) featureVal).getLiteral().toUpperCase());
					writer.print('.');
				}
			} else {
				logger.severe("Expecting enum in " + entityType.getId().getLocalName() + " for EnumerationType-d attribute " + expAttr.getId().getLocalName() + ", instead found " + featureVal);
			}
			// logger.severe("Attribute type not handled: " + attributeType);
		} else if (attributeType instanceof SelectType) {
			SelectType select = (SelectType) attributeType;
			String selectName = select.getId().getLocalName().toUpperCase();
			if (featureVal instanceof EObject) {
				EObject valObj = (EObject) featureVal;
				EClass eCls = valObj.eClass();
				// if (eCls.getEStructuralFeatures().isEmpty()) {
				if (helper.isEntitySelect(selectName)) {
					// entity select?
					Integer objId = getID(valObj);
					if (null != objId) {
						writer.print('#');
						writer.print(objId);
					} else {
						logger.severe("Unable to find object ID for object " + featureVal);
					}
				} else if (helper.isNonEntitySelect(selectName)) {
					// valObj is the struct object. Find which structural feature is set.
					EStructuralFeature setFeature = null;
					for (EStructuralFeature feat : eCls.getEAllStructuralFeatures()) {
						if (valObj.eIsSet(feat)) {
							if (null == setFeature) {
								setFeature = feat;
							} else {
								logger.warning("Found two set features (" + setFeature.getName() + " and " + feat.getName() + " on struct object " + valObj);
							}
						}
					}
					if (null == setFeature) {
						// occurs e.g. at IFCLOGICAL(.U.)
						logger.severe("Struct object has no set features:" + valObj.eClass().getName());
						writer.print('$');
					} else {
						Object structVal = valObj.eGet(setFeature);
						String listTypeName = helper.getMemberTypeNameForNonEntitySelectFeatureName(selectName, setFeature.getName());
						if (!(structVal instanceof EObject)) {
							writer.print(listTypeName);
							writer.print(" (");
							printAttrVal(writer, entityType, expAttr, helper.getExpressTypeByName(listTypeName), structVal, valObj, setFeature);
							writer.print(')');
						} else {
							printAttrVal(writer, entityType, expAttr, helper.getExpressTypeByName(listTypeName), structVal, valObj, setFeature);
						}
					}
					// non-entity select?
					// logger.severe("Non-entity select type not handled: " + attributeType);
				} else {
					logger.severe("SelectType " + selectName + "appears to be neither an entity select nor a non-entity select");
				}
			} else {
				logger.severe("Expecting an object in " + entityType.getId().getLocalName() + " for SelectType-d attribute " + expAttr.getId().getLocalName() + ", instead found " + featureVal);
			}

		} else {
			logger.severe("in " + entityType.getId().getLocalName() + " Unexpected attribute type: " + attributeType);
		}
	}

	public Iterator<EObject> getIterator(int id) {
		EObject eObject = containmentHelper.get(id);
		if (eObject == null)
			return null;
		return containmentHelper.getIterator(eObject);
	}

	public void resumeAt(FileOutputStream os, int id, int worked) throws IOException {
		nowAvailable = worked;
		monitor.subTask("Print");
		printIfcObjects(new PrintWriter(new BufferedWriter(new OutputStreamWriter(os))), getIterator(id));
	}

}
