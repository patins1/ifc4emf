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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ifc4emf.metamodel.express.core.AggregationType;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.BinaryType;
import org.ifc4emf.metamodel.express.core.ConcreteAggregationType;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.EnumerationType;
import org.ifc4emf.metamodel.express.core.LogicType;
import org.ifc4emf.metamodel.express.core.NumericType;
import org.ifc4emf.metamodel.express.core.SelectType;
import org.ifc4emf.metamodel.express.core.SpecializedType;
import org.ifc4emf.metamodel.express.core.StringType;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.metamodel.ifcheader.ModelDescription;
import org.ifc4emf.metamodel.ifcheader.ModelName;
import org.ifc4emf.metamodel.ifcheader.ModelSchema;
import org.ifc4emf.metamodel.ifcheader.Part21Factory;
import org.ifc4emf.part21.Activator;
import org.ifc4emf.part21.parser.ASTdata_section;
import org.ifc4emf.part21.parser.ASTentity_instance;
import org.ifc4emf.part21.parser.ASTentity_instance_list;
import org.ifc4emf.part21.parser.ASTexchange_file;
import org.ifc4emf.part21.parser.ASTexport_list;
import org.ifc4emf.part21.parser.ASTheader_entity;
import org.ifc4emf.part21.parser.ASTheader_entity_list;
import org.ifc4emf.part21.parser.ASTheader_section;
import org.ifc4emf.part21.parser.ASTlist;
import org.ifc4emf.part21.parser.ASTomitted_parameter;
import org.ifc4emf.part21.parser.ASTscope;
import org.ifc4emf.part21.parser.ASTsimple_record;
import org.ifc4emf.part21.parser.ASTsimple_record_list;
import org.ifc4emf.part21.parser.ASTsubsuper_record;
import org.ifc4emf.part21.parser.ASTsyntax;
import org.ifc4emf.part21.parser.ASTtyped_parameter;
import org.ifc4emf.part21.parser.ASTuntyped_parameter;
import org.ifc4emf.part21.parser.ClearTextReaderVisitor;
import org.ifc4emf.part21.parser.EnumValue;
import org.ifc4emf.part21.parser.SimpleNode;
import org.ifc4emf.part21.parser.TypedParameter;
import org.ifc4emf.part21.parser.UnsetParameter;

/**
 * @author steelj
 * 
 */
public class Part21Loader implements ClearTextReaderVisitor {

	protected IProgressMonitor monitor;

	public static final boolean USE_CONTAINMENT_TREE = true;

	public static boolean ALWAYS_PRESEVER_ORDERING = true;

	final protected Model modelObject;

	final private IContainmentHelper containmentHelper;

	final private IForwardReferenceHelper forwardReferenceHelper;

	static Handler LOGHANDLER = new Handler() {

		@Override
		public void publish(LogRecord record) {
			Activator.log(record.getMessage());
		}

		@Override
		public void flush() {
			// TODO Auto-generated method stub

		}

		@Override
		public void close() throws SecurityException {
			// TODO Auto-generated method stub

		}
	};

	private class ObjectReference {
		private int id;

		public ObjectReference(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

	}

	// public static void main(String[] args) {
	// // try {
	// //ClearTextReader parser = new ClearTextReader(new FileInputStream(args[0]));
	// //ASTsyntax syntax = parser.syntax();
	//
	// // create resource set and resource
	// ResourceSet resourceSet = new ResourceSetImpl();
	// resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ifc", new Part21ResourceFactoryImpl());
	// //Resource resource = resourceSet.getResource(URI.createFileURI("c:/workspaces/jsdai/org.ifc4emf.part21/columns_basic_all_1.ifc"), false);
	// Resource resource = resourceSet.getResource(URI.createFileURI(args[0]), true);
	//
	// //Part21Loader loader = new Part21Loader(resource);
	// //loader.load(syntax);
	//
	// // } catch (FileNotFoundException e) {
	// // Activator.err(e);
	// // } catch (ParseException e) {
	// // Activator.err(e);
	// // } catch (IOException e) {
	// // Activator.err(e);
	// // }
	// }

	private EFactory factory;

	public void load(ASTsyntax syntax) throws IOException {

		syntax.jjtAccept(this, null);
		if (monitor.isCanceled())
			return;
		currentEntityId = -1;
		int lastObj = -1;
		Activator.log("Final linking");
		Iterator<LinkageTuple> it = forwardReferenceHelper.linkObjects();
		while (it.hasNext()) {
			LinkageTuple tuple = it.next();
			linkObject(tuple);
			if (lastObj != tuple.getObj()) {
				work(false);
				lastObj = tuple.getObj();
			}
		}
		if (getRemainingForwardReferences() > 0)
			if (whiteList != null)
				Activator.log("There are " + getRemainingForwardReferences() + " forward references unresolved due to MVD parsing.");
			else
				throw new RuntimeException("There are still " + getRemainingForwardReferences() + " forward references!");
		work(true);
	}

	protected void work(boolean workIsFinished) {
		if (monitor.isCanceled())
			throw new MonitorCanceledException();
	}

	protected int getRemainingForwardReferences() {
		return forwardReferences - resolvedForwardReferences;
	}

	private void linkObject(LinkageTuple tuple) {
		EObject target = containmentHelper.get(tuple.getId());
		if (target == null) {
			throw new RuntimeException("Got null reference!");
		}
		EObject eobj = containmentHelper.get(tuple.getObj());
		EReference ref = tuple.getRef(eobj);
		linkObject(eobj, ref, target);
		if (preserveOrdering(ref)) {
			try {
				forwardReferenceHelper.orderReferences(eobj, ref);
			} catch (IndexOutOfBoundsException ioob) {
				Activator.err("Could not apply ordering for reference " + ref.eClass().getName() + "." + ref.getName() + " in line #" + currentEntityId + ": " + ioob.getMessage());
			}
		}
		resolvedForwardReferences++;
	}

	private boolean preserveOrdering(EReference ref) {
		return ref.isMany() && (ref.isOrdered() || ALWAYS_PRESEVER_ORDERING);
	}

	private void linkObject(EObject eobj, EReference ref, EObject target) {
		if (!ref.getEType().isInstance(target)) {
			// try processNonEntity as target is resolved now
			EClass eCls = (EClass) ref.getEType();
			try {
				processNonEntity(eobj, eCls.getName().toUpperCase(), ref, eCls, target.eClass().getName().toUpperCase(), target);
			} catch (NoSuchClassException e) {
				Activator.err(e);
			}
		} else {
			checkAssignmentSanity(ref, target);
			if (ref.isMany()) {
				((InternalEList) eobj.eGet(ref)).addUnique(target);
			} else {
				eobj.eSet(ref, target);
			}
		}
	}

	private void checkAssignmentSanity(EReference ref, EObject target) {
		EReference oppositeRef = ref.getEOpposite();
		if (oppositeRef != null) {
			Object oppTarget = target.eGet(oppositeRef);
			if (oppTarget != null && !(oppTarget instanceof List)) {
				String s = oppositeRef.getEContainingClass().getName() + "." + oppositeRef.getName() + " should be multivalued, otherwise it will be assigned multiple times!";
				// throw new RuntimeException(s);
				Activator.err(s);
			}
		}
		if (ref.isContainment() && target.eContainer() != null) {
			String s = ref.getEContainingClass().getName() + "." + ref.getName() + " should be non-containment, since the object to be referenced is already contained by " + target.eContainer().eClass().getName() + "." + target.eContainingFeature().getName() + "!";
			// throw new RuntimeException(s);
			Activator.err(s);
		}
	}

	private Logger logger;
	private Resource resource;
	private Part21LoadHelper helper;

	public int currentEntityId = -1;

	protected int backwardReferences = 0;
	protected int forwardReferences = 0;
	protected int resolvedForwardReferences = 0;

	private EReference currentRef = null;

	private List<Integer> currentRefList = new ArrayList<Integer>();

	private boolean currentRefIsForward;

	private Set<EClass> whiteList;
	private Set<EClass> whiteListWithSupertypes;

	public Part21Loader(Resource resource, Part21LoadHelper helper, Model ifcModel) {
		super();
		this.modelObject = ifcModel;
		this.resource = resource;
		this.helper = helper;
		this.logger = Logger.getLogger("Loader"/* , "org.ifc4emf.metamodel.express.expressparser" */);
		logger.setLevel(Level.WARNING);
		// logger.addHandler(LOGHANDLER);
		this.factory = helper.getFactory();
		if (Part21Loader.USE_CONTAINMENT_TREE) {
			this.containmentHelper = new ContainmentTreeOrderedByNumberHelper(modelObject);
			this.forwardReferenceHelper = new BinaryTreeBasedForwardReferenceHelper((ContainmentTreeHelper) this.containmentHelper, helper);
			// this.forwardReferenceHelper = new ComposedForwardReferenceHelper(new BinaryTreeBasedForwardReferenceHelper((ContainmentTreeHelper) this.containmentHelper));
		} else {
			this.containmentHelper = new SimpleContainmentHelper(modelObject);
			this.forwardReferenceHelper = new SimpleForwardReferenceHelper();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.SimpleNode, java.lang.Object)
	 */
	@Override
	public Object visit(SimpleNode node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTexchange_file, java.lang.Object)
	 */
	@Override
	public Object visit(ASTexchange_file node, Object data) {
		// Two children. Header and body. First create the model object

		// Header. Pass the model object down
		node.jjtGetChild(0).jjtAccept(this, modelObject);

		// Body.
		node.jjtGetChild(1).jjtAccept(this, modelObject);

		return modelObject;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTheader_section, java.lang.Object)
	 */
	@Override
	public Object visit(ASTheader_section node, Object data) {
		// TODO Auto-generated method stub
		// logger.log(Level.INFO, "AST Type not handled: " + node.getClass()); return null;
		// node.childrenAccept(this, data);
		Model model = (Model) data;

		ModelDescription desc = Part21Factory.eINSTANCE.createModelDescription();
		model.setDescription(desc);
		node.jjtGetChild(0).jjtAccept(this, desc);

		ModelName name = Part21Factory.eINSTANCE.createModelName();
		model.setName(name);
		node.jjtGetChild(1).jjtAccept(this, name);

		ModelSchema schema = Part21Factory.eINSTANCE.createModelSchema();
		model.setSchema(schema);
		node.jjtGetChild(2).jjtAccept(this, schema);

		for (int i = 3; i < node.jjtGetNumChildren(); i++) {
			node.jjtGetChild(i).jjtAccept(this, data);
		}

		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTheader_entity_list, java.lang.Object)
	 */
	@Override
	public Object visit(ASTheader_entity_list node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTheader_entity, java.lang.Object)
	 */
	@Override
	public Object visit(ASTheader_entity node, Object data) {
		// TODO Auto-generated method stub
		// logger.log(Level.INFO, "AST Type not handled: " + node.getClass()); return null;
		List<Object> params = new ArrayList<Object>();
		for (int i = 0; i < node.jjtGetNumChildren(); i++) {
			// Get the Object (either collection or String) from the child
			Object attrValue = node.jjtGetChild(i).jjtAccept(this, data);
			if (attrValue instanceof UnsetParameter)
				attrValue = null;
			params.add(attrValue);
		}

		if (data instanceof ModelDescription) {
			if (params.size() == 2) {
				ModelDescription desc = (ModelDescription) data;
				List<String> descriptions = (List<String>) params.get(0);
				for (String d : descriptions) {
					desc.getDescription().add(d);
				}
				String implementation_level = (String) params.get(1);
				desc.setImplementation_level(implementation_level);
			} else {
				logger.severe("Invalid parameter count in FILE_DESCRIPTION: " + params.size());
			}
		} else if (data instanceof ModelName) {
			ModelName nameObj = (ModelName) data;
			if (params.size() == 7) {
				String name = (String) params.get(0);
				nameObj.setName(name);
				String time_stamp = (String) params.get(1);
				nameObj.setTime_stamp(time_stamp);
				List<String> author = (List<String>) params.get(2);
				for (String a : author) {
					nameObj.getAuthor().add(a);
				}
				List<String> organization = (List<String>) params.get(3);
				for (String o : organization) {
					nameObj.getOrganization().add(o);
				}
				String preprocessor_version = (String) params.get(4);
				nameObj.setPreprocessor_version(preprocessor_version);
				String originating_system = (String) params.get(5);
				nameObj.setOriginating_system(originating_system);
				String authorization = (String) params.get(6);
				nameObj.setAuthorization(authorization);
			} else {
				logger.severe("Invalid parameter count in FILE_NAME: " + params.size());
			}
		} else if (data instanceof ModelSchema) {
			ModelSchema schemaObj = (ModelSchema) data;
			if (params.size() == 1) {
				List<String> schema_identifiers = (List<String>) params.get(0);
				if (!schema_identifiers.contains(helper.getSchemaName().toUpperCase())) {
					logger.warning("Nominated schema identifier (" + helper.getSchemaName() + ") not found in FILE_SCHEMA identifiers: " + schema_identifiers);
				}
				for (String id : schema_identifiers) {
					schemaObj.getSchema_identifiers().add(id);
				}
			} else {
				logger.severe("Invalid parameter count in FILE_SCHEMA: " + params.size());
			}
		} else {
			logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
			return null;
		}

		return data;
	}

	public Object visitParameterList(ASTsimple_record node, EObject eobj) {

		for (int i = 0; i < node.jjtGetNumChildren(); i++) {
			// Get the Object (either collection or String) from the child
			Object attrValue = node.jjtGetChild(i).jjtAccept(this, eobj);

			// Get the feature from the helper
			try {
				// EStructuralFeature feature = helper.getEStructuralFeatureByIndex(eobj.eClass().getName(), i);
				Attribute express_attribute = helper.getExpressAttributeByIndex(eobj.eClass().getName(), i);
				if (express_attribute == null) {
					logger.severe("No feature of index " + i + " in class: " + eobj.eClass().getName());
				} else {
					processAttributeValue(eobj, express_attribute, attrValue);
				}
			} catch (NoSuchAttributeException e) {
				Activator.err(e);
			} catch (NoSuchClassException e) {
				Activator.err(e);
			}
		}

		return eobj;
	}

	private void processAttributeValue(EObject eobj, Attribute expressAttribute, Object attrValue) throws NoSuchClassException, NoSuchAttributeException {

		AttributeType aType = expressAttribute.getAttributeType();

		if (helper.isDerivedOverride(eobj.eClass().getName(), expressAttribute.getId().getLocalName())) {
			if (attrValue instanceof UnsetParameter) {
				logger.info("Skipping attribute " + expressAttribute.getId().getLocalName() + " of class " + eobj.eClass().getName() + " because it is a derived override");
			} else {
				logger.severe("Expecting a $ for derived override attribute " + expressAttribute.getId().getLocalName() + ", found " + attrValue);
			}
			return;
		} else if (attrValue instanceof Collection<?>) { // If its a collection, unwrap the values and treat them individually
			if (!(aType instanceof AggregationType) && !(aType instanceof SpecializedType && ((SpecializedType) aType).getUnderlyingType() instanceof AggregationType)) {
				logger.severe("Found collection value for non-aggregation-typed attribute " + expressAttribute.getId().getLocalName());
			}
			Collection<Object> coll = (Collection<Object>) attrValue;
			for (Object obj : coll) {
				processAttributeValue(eobj, expressAttribute, obj);
			}
			return;
		} else if (attrValue instanceof UnsetParameter) { // Allow unsets only if the thing is optional
			EStructuralFeature feature = helper.getEStructuralFeatureForExpressAttribute(expressAttribute);
			if (feature.getLowerBound() > 0) {
				logger.severe("Found unset($) value for mandatory feature " + feature.getName());
			}
		} else {

			// ugh, unwrap types
			while ((aType instanceof ConcreteAggregationType) || (aType instanceof SpecializedType)) {
				if (aType instanceof ConcreteAggregationType) {
					aType = ((ConcreteAggregationType) aType).getMemberType();
					// If its a collection, just go through it and iterate
				} else if (aType instanceof SpecializedType) {
					aType = ((SpecializedType) aType).getUnderlyingType();
				}
			}

			if (aType instanceof NumericType) {
				// For now, don't bother checking if its a real or not, just slurp it in
				EStructuralFeature feature = helper.getEStructuralFeatureForExpressAttribute(expressAttribute);
				if (attrValue instanceof Double) {
					Double r = (Double) attrValue;

					if (feature instanceof EReference) {
						logger.severe("Expecting atn EAttribute, found reference " + expressAttribute.getId().getLocalName());
					} else {
						EAttribute eAttr = (EAttribute) feature;
						if (eAttr.isMany()) {
							EList attrValueList = (EList) eobj.eGet(eAttr, true);
							attrValueList.add(r);
						} else {
							eobj.eSet(eAttr, r);
						}
					}
				} else if (attrValue instanceof Integer) {
					Integer i = (Integer) attrValue;
					if (feature instanceof EReference) {
						logger.severe("Found integer value " + i + " for reference " + expressAttribute.getId().getLocalName());
					} else {
						EAttribute eAttr = (EAttribute) feature;
						Number n = i;
						if (eAttr.getEType().getInstanceClass() == Double.class) {
							n = new Double(i);
						}
						if (eAttr.isMany()) {
							EList attrValueList = (EList) eobj.eGet(eAttr);
							attrValueList.add(n);
						} else {
							eobj.eSet(eAttr, n);
						}
					}
				} else {
					logger.severe("Attribute " + expressAttribute.getId().getLocalName() + " expected a double, found " + attrValue);
				}

			} else if (aType instanceof LogicType) {
				EStructuralFeature feature = helper.getEStructuralFeatureForExpressAttribute(expressAttribute);
				// logger.info("Logic Types not handled yet: " + attrValue);
				if (attrValue instanceof EnumValue) {
					String stringValue = ((EnumValue) attrValue).getValue();
					Boolean value = null;
					if (stringValue.equalsIgnoreCase("T")) {
						value = true;
					} else if (stringValue.equalsIgnoreCase("F")) {
						value = false;
					} else if (stringValue.equalsIgnoreCase("U")) {
						value = null;
					} else {
						logger.severe("Unexpected value for logic-type " + aType + ": " + stringValue);
						return;
					}

					if (feature instanceof EAttribute) {
						EAttribute eAttr = (EAttribute) feature;
						if (eAttr.isMany()) {
							EList attrValueList = (EList) eobj.eGet(eAttr);
							attrValueList.add(value);
						} else {
							eobj.eSet(eAttr, value);
						}
					} else {
						logger.severe("Expecting an EAttribute, found " + feature + " while processing logic type" + aType);
					}

				} else {
					logger.severe("Expected an enum value while processing logic type " + aType + " but found " + attrValue);
				}
			} else if (aType instanceof StringType) {
				if (attrValue instanceof String) {
					String str = (String) attrValue;
					EStructuralFeature feature = helper.getEStructuralFeatureForExpressAttribute(expressAttribute);
					if (feature instanceof EReference) {
						logger.severe("Expecting EAttribute, found reference " + expressAttribute.getId().getLocalName());
					} else {
						EAttribute eAttr = (EAttribute) feature;
						if (eAttr.isMany()) {
							EList attrValueList = (EList) eobj.eGet(eAttr);
							attrValueList.add(str);
						} else {
							eobj.eSet(eAttr, str);
						}
					}
				} else {
					logger.severe("Attribute " + expressAttribute.getId().getLocalName() + " expected a string, found " + attrValue);
				}
			} else if (aType instanceof BinaryType) {
				logger.info("Binary Types not handled yet: " + attrValue);
			} else if (aType instanceof EnumerationType) {
				EClassifier eClsf = helper.getEClassifierFromExpressType(aType);
				EStructuralFeature feature = helper.getEStructuralFeatureForExpressAttribute(expressAttribute);
				if (!(eClsf instanceof EEnum)) {
					logger.severe("Traced an EnumerationType to something that isn't an EEnum: " + eClsf);
				} else if (!(feature instanceof EAttribute)) {
					logger.severe("Expected EAttribute while processing enum value, instead found: " + feature);
				} else {
					EEnum eEnum = (EEnum) eClsf;
					EAttribute eAttr = (EAttribute) feature;
					if (attrValue instanceof EnumValue) {
						EEnumLiteral literal = eEnum.getEEnumLiteralByLiteral(((EnumValue) attrValue).getValue());
						if (null == literal) {
							logger.severe("Enumeration " + eEnum.getName() + " does not contain a literal named " + ((EnumValue) attrValue).getValue());
						} else {
							eobj.eSet(eAttr, literal.getInstance());
						}
					} else {
						logger.severe("Found unexpected value while trying to populate " + eEnum.getName() + " enumeration: " + attrValue);
					}
				}
				// logger.info("Enumeration Types not handled yet: " + attrValue);
			} else if (aType instanceof EntityType) {
				EStructuralFeature feature = helper.getEStructuralFeatureForExpressAttribute(expressAttribute);
				if (attrValue instanceof org.ifc4emf.part21.parser.ObjectReference) {
					int objKey = ((org.ifc4emf.part21.parser.ObjectReference) attrValue).getKey();
					if (feature instanceof EReference) {
						addLinkageTuple(eobj, (EReference) feature, objKey);
					} else {
						logger.severe("Found object reference #" + objKey + " for property " + expressAttribute.getId().getLocalName() + " that isn't a reference type");
					}
				} else if (attrValue instanceof TypedParameter) {
					TypedParameter param = (TypedParameter) attrValue;
					EObject expType = helper.getExpressTypeByName(param.getTypeName());
					Object valueObj = param.getValue();
					if (valueObj instanceof ObjectReference) {
						int objKey = ((ObjectReference) valueObj).getId();
						if (feature instanceof EReference) {
							addLinkageTuple(eobj, (EReference) feature, objKey);
						} else {
							logger.severe("Found object reference #" + objKey + " for property " + expressAttribute.getId().getLocalName() + " that isn't a reference type");
						}
					} else {
						logger.severe("Attribute " + expressAttribute.getId().getLocalName() + " expected an object reference, found " + valueObj);
					}
				} else {
					logger.severe("Attribute " + expressAttribute.getId().getLocalName() + " expected an object reference, found " + attrValue);
				}
			} else if (aType instanceof SelectType) {
				SelectType select = (SelectType) aType;
				String selectName = select.getId().getLocalName().toUpperCase();
				// EClassifier eClsf = helper.getEClassifierByName(((SelectType) aType).getId().getLocalName());
				EClassifier eClsf = helper.getEClassifierFromExpressType(aType);
				EStructuralFeature feature = helper.getEStructuralFeatureForExpressAttribute(expressAttribute);
				if (!(feature instanceof EReference)) {
					logger.severe("Expecting an EReference for SelectType, instead found " + feature.getName());
				} else if (!(eClsf instanceof EClass)) {
					logger.severe("Traced a SelectType (" + select + ") to something that isn't an EClass: " + eClsf);
				} else {
					EReference eRef = (EReference) feature;
					EClass eCls = (EClass) eClsf;
					// This used to be kind of dodgy. Used to check whether the class has any features,
					// to work out whether its an entity select (abstract superclass) or not (struct pattern)
					// if (eCls.getEStructuralFeatures().isEmpty()) {
					if (helper.isEntitySelect(selectName)) {
						// Do stuff
						if (attrValue instanceof org.ifc4emf.part21.parser.ObjectReference) {
							int objKey = ((org.ifc4emf.part21.parser.ObjectReference) attrValue).getKey();
							addLinkageTuple(eobj, (EReference) feature, objKey);
						} else if (attrValue instanceof TypedParameter) {
							TypedParameter tParam = (TypedParameter) attrValue;
							if (tParam.getValue() instanceof ObjectReference) {
								int objKey = ((org.ifc4emf.part21.parser.ObjectReference) tParam.getValue()).getKey();
								addLinkageTuple(eobj, (EReference) feature, objKey);
							} else {
								logger.severe("Attribute " + expressAttribute.getId().getLocalName() + " expected an wrapped object reference, found " + tParam.getValue());
							}
						} else {
							logger.severe("Attribute " + expressAttribute.getId().getLocalName() + " expected an object reference, found " + attrValue);
						}

					} else if (helper.isNonEntitySelect(selectName)) { // its a non-entity select type
						// Do other stuff
						// attrValue = (Object) attrValue;
						if (attrValue instanceof org.ifc4emf.part21.parser.ObjectReference) {
							int objKey = ((org.ifc4emf.part21.parser.ObjectReference) attrValue).getKey();
							addLinkageTuple(eobj, (EReference) feature, objKey);
						} else if (attrValue instanceof TypedParameter) {
							TypedParameter typedParameter = (TypedParameter) attrValue;
							// find the appropriate structural feature based on the type name
							// EStructuralFeature subFeature = eCls.getEStructuralFeature(typedParameter.getTypeName() + "value");
							String typeName = typedParameter.getTypeName();
							Object value = typedParameter.getValue();

							processNonEntity(eobj, selectName, eRef, eCls, typeName, value);
						}
						// logger.severe("Not handling non-entity selects yet: " + attrValue);
					} else {
						logger.severe("Select Type " + selectName + " appears to be neither an entity select type nor a non-entity select type.");
					}
				}
			}

		}

		// -----------------------------------------
		//
		// if (attrValue instanceof org.ifc4emf.part21.parser.ObjectReference) {
		// String objKey = ((org.ifc4emf.part21.parser.ObjectReference) attrValue).getKey();
		// if (expressAttribute instanceof EReference) {
		// linkagePhase.add(new LinkageTuple(eobj,(EReference) expressAttribute,objKey));
		// } else {
		// logger.severe("Found object reference #" + objKey +
		// " for property " + expressAttribute.getName() + " that isn't a reference type");
		// }
		// } else if (attrValue instanceof EnumValue) {
		// logger.info("Enums not done yet: " + attrValue);
		// } else if (attrValue instanceof Integer) {
		// Integer i = (Integer) attrValue;
		// if (expressAttribute instanceof EReference) {
		// logger.severe("Found integer value " + i + " for reference " +
		// expressAttribute.getName());
		// } else {
		// EAttribute eAttr = (EAttribute) expressAttribute;
		// if (eAttr.isMany()) {
		// EList attrValueList = (EList) eobj.eGet(eAttr);
		// attrValueList.add(i);
		// } else {
		// eobj.eSet(eAttr,i);
		// }
		// }
		// } else if (attrValue instanceof Double) {
		// Double r = (Double) attrValue;
		// if (expressAttribute instanceof EReference) {
		// logger.severe("Found real value " + r + " for reference " +
		// expressAttribute.getName());
		// } else {
		// EAttribute eAttr = (EAttribute) expressAttribute;
		// if (eAttr.isMany()) {
		// EList attrValueList = (EList) eobj.eGet(eAttr, true);
		// attrValueList.add(r);
		// } else {
		// eobj.eSet(eAttr,r);
		// }
		// }
		// } else if (attrValue instanceof String) {
		// String str = (String) attrValue;
		// if (expressAttribute instanceof EReference) {
		// logger.severe("Found string value " + str + " for reference " +
		// expressAttribute.getName());
		// } else {
		// EAttribute eAttr = (EAttribute) expressAttribute;
		// if (eAttr.isMany()) {
		// EList attrValueList = (EList) eobj.eGet(eAttr);
		// attrValueList.add(str);
		// } else {
		// eobj.eSet(eAttr, str);
		// }
		// }
		// } else if (null == attrValue) {
		// logger.severe("Null value for attribute " + expressAttribute.getName());
		// } else {//TODO stuff here
		// logger.severe("Unexpected type in attribute value: " + attrValue.getClass());
		// }
		//
	}

	private void addLinkageTuple(EObject eobj, EReference ref, int objKey) {
		if (currentEntityId == -1)
			throw new RuntimeException("currentEntityId not defined!");
		if (whiteListWithSupertypes != null) {
			if (!whiteListWithSupertypes.contains(ref.getEType()))
				return;
		}
		if (currentRef != ref) {
			flushRefList(eobj);
			currentRef = ref;
		}
		currentRefList.add(objKey);
		EObject target = containmentHelper.get(objKey);
		if (forwardReferenceHelper.directInstantiate(ref)) {
			target = containmentHelper.add(objKey, factory.create((EClass) ref.getEType()));
		} else {
			target = containmentHelper.get(objKey);
		}
		if (target == null) {
			forwardReferenceHelper.add(eobj, new LinkageTuple(eobj, currentEntityId, ref, objKey));
			forwardReferences++;
			currentRefIsForward = true;
		} else {
			linkObject(eobj, ref, target);
			backwardReferences++;
			currentRefIsForward = false;
		}
	}

	private void flushRefList(EObject obj) {
		if (currentRef != null && preserveOrdering(currentRef) && currentRefList.size() >= 2) {
			int numberForwardReferences = currentRefList.size() - ((List) obj.eGet(currentRef)).size();
			// if only the last reference is a forward reference, it will be added to the end of the list when the forward reference is resolved, so no need for recording
			if (numberForwardReferences >= 2 || numberForwardReferences == 1 && !currentRefIsForward) {
				forwardReferenceHelper.recordForOrdering(obj, currentRef, currentRefList);
			}
		}
		currentRefList.clear();
		currentRef = null;
	}

	private void processNonEntity(EObject eobj, String selectName, EReference eRef, EClass eCls, String typeName, Object value) throws NoSuchClassException {
		/*
		 * NamedType typeObj = helper.getExpressTypeByName(typeName); String subFeatureName = typeObj.getId().getLocalName() + "value";
		 */
		String subFeatureName = helper.getFeatureNameForNonEntitySelectMemberTypeName(selectName, typeName);
		EStructuralFeature subFeature = null;
		for (EStructuralFeature subFeat : eCls.getEStructuralFeatures()) {
			if (subFeat.getName().equalsIgnoreCase(subFeatureName)) {
				subFeature = subFeat;
			}
		}

		if (null == subFeature) {
			logger.severe("Unable to find subFeature " + subFeatureName + " for non-entity select " + selectName + ".");
		}
		// TODO find the struct class and create that
		// EClass structCls = helper.getEClassifierFromExpressType(selectType);
		EObject structObj = factory.create(eCls);
		if (eRef.isMany()) {
			((EList) eobj.eGet(eRef)).add(structObj);
			// eobj.eGet
		} else {
			eobj.eSet(eRef, structObj);
		}
		// structObj.eSet(eRef, structObj);
		// get the value and marshall it

		if (value instanceof ObjectReference) {
			if (!(subFeature instanceof EReference)) {
				logger.severe("Expecting an EReference (inside select" + selectName + "), found " + subFeature);
			} else {
				ObjectReference objRef = (ObjectReference) value;
				EReference subRef = (EReference) subFeature;
				addLinkageTuple(structObj, subRef, objRef.getId());
			}
		} else if ((value instanceof Integer) || (value instanceof Double) || (value instanceof String)) {
			if (!(subFeature instanceof EAttribute)) {
				logger.severe("Expecting an EAttribute (inside a select" + selectName + "), found " + subFeature);
			} else {
				EAttribute eAttr = (EAttribute) subFeature;
				structObj.eSet(eAttr, value);
			}
		} else if (value instanceof EnumValue) {
			EnumValue enumValue = (EnumValue) value;
			// logger.severe("Unhandled enum typed parameter value inside select type" + typeName);
			// EClassifier eClsf = helper.getEClassifierByName(typeName);
			if (!(subFeature instanceof EAttribute)) {
				logger.severe("Expecting an EAttribute (inside a select" + selectName + "), found " + subFeature);
			} else {
				EAttribute eAttr = (EAttribute) subFeature;
				EClassifier subFeatClsf = helper.getEClassifierByName(typeName);
				if (subFeatClsf instanceof EEnum) {
					EEnum eEnum = (EEnum) subFeatClsf;
					EEnumLiteral literal = eEnum.getEEnumLiteralByLiteral(enumValue.getValue());
					if (null == literal) {
						logger.severe("Enumeration " + eEnum.getName() + " does not contain a literal named " + enumValue.getValue());
					} else {
						structObj.eSet(eAttr, literal.getInstance());
					}
				} else if ((subFeatClsf instanceof EDataType) && (((EDataType) subFeatClsf).getInstanceClassName().equals("java.lang.Boolean"))) {
					if (enumValue.getValue().equalsIgnoreCase("T")) {
						structObj.eSet(eAttr, true);
					} else if (enumValue.getValue().equalsIgnoreCase("F")) {
						structObj.eSet(eAttr, false);
					} else {
						logger.severe("Unexpected value for logic-type: " + enumValue.getValue());
					}
				} else {
					logger.severe("Expecting an Enum, found " + subFeatClsf);
				}
			}
		} else if (subFeature != null && subFeature.getEType().isInstance(value)) {
			// case when called in linkage phase
			if (subFeature instanceof EReference && value instanceof EObject)
				checkAssignmentSanity((EReference) subFeature, (EObject) value);
			structObj.eSet(subFeature, value);
		} else {
			logger.severe("Unhandled typed parameter value inside select type" + value);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTtyped_parameter, java.lang.Object)
	 */
	@Override
	public Object visit(ASTtyped_parameter node, Object data) {
		// TODO Auto-generated method stub
		// logger.log(Level.INFO, "AST Type not handled: " + node.getClass()); return null;
		return new TypedParameter((String) node.jjtGetValue(), node.jjtGetChild(0).jjtAccept(this, data));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTuntyped_parameter, java.lang.Object)
	 */
	@Override
	public Object visit(ASTuntyped_parameter node, Object data) {
		if (node.jjtGetNumChildren() > 0) {
			return node.jjtGetChild(0).jjtAccept(this, data);
		} else {
			return node.jjtGetValue();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTomitted_parameter, java.lang.Object)
	 */
	@Override
	public Object visit(ASTomitted_parameter node, Object data) {
		// TODO Auto-generated method stub
		// logger.log(Level.INFO, "AST Type not handled: " + node.getClass()); return null;
		return UnsetParameter.instance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTlist, java.lang.Object)
	 */
	@Override
	public Object visit(ASTlist node, Object data) {
		Collection<Object> coll = new ArrayList<Object>(node.jjtGetNumChildren());
		for (int i = 0; i < node.jjtGetNumChildren(); i++) {
			Object obj = node.jjtGetChild(i).jjtAccept(this, coll);
			coll.add(obj);
		}
		return coll;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTdata_section, java.lang.Object)
	 */
	@Override
	public Object visit(ASTdata_section node, Object data) {
		node.childrenAccept(this, data);
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTentity_instance_list, java.lang.Object)
	 */
	@Override
	public Object visit(ASTentity_instance_list node, Object data) {
		node.childrenAccept(this, data);
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTentity_instance, java.lang.Object)
	 */
	@Override
	public Object visit(ASTentity_instance node, Object data) {

		currentEntityId = Integer.valueOf(((String) node.jjtGetValue()).substring(1));

		// Trigger a notSupported message for the scope
		if (node.jjtGetNumChildren() > 1) {
			node.jjtGetChild(0).jjtAccept(this, data);
		}

		// For now, only thing we care about is the simple_record. All the interesting things happen down in
		// the simple_record visit
		EObject simpleObj = (EObject) node.jjtGetChild(node.jjtGetNumChildren() - 1).jjtAccept(this, data);
		if (simpleObj == null)
			return simpleObj;

		Collection<LinkageTuple> unresolved = forwardReferenceHelper.processedElement(simpleObj, currentEntityId);
		if (unresolved != null) {
			for (LinkageTuple tuple : unresolved) {
				linkObject(tuple);
			}
		}
		return simpleObj;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTscope, java.lang.Object)
	 */
	@Override
	public Object visit(ASTscope node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTexport_list, java.lang.Object)
	 */
	@Override
	public Object visit(ASTexport_list node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTsimple_record, java.lang.Object)
	 */
	@Override
	public Object visit(ASTsimple_record node, Object data) {
		// First get the type name
		String typeName = (String) node.jjtGetValue();
		EObject eObj = null;
		try {
			EClassifier clsf = helper.getEClassifierByName(typeName);
			if (!(clsf instanceof EClass)) {
				logger.severe("Expecting an EClass, found " + clsf.getName());
			}
			EClass cls = (EClass) clsf;
			if (whiteList != null) {
				if (!whiteList.contains(cls)) {
					return null;
				}
			}
			eObj = factory.create(cls);

			eObj = containmentHelper.add(currentEntityId, eObj);

			// Now descend and do the parameter list
			visitParameterList(node, eObj);
			flushRefList(eObj);
			this.helper.addedObject(modelObject, eObj, currentEntityId);

		} catch (NoSuchClassException ex) {
			logger.severe("Can't find a class for " + typeName);
			// throw new RuntimeException("Can't find a class for " + typeName);
		}
		return eObj;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTsubsuper_record, java.lang.Object)
	 */
	@Override
	public Object visit(ASTsubsuper_record node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTsimple_record_list, java.lang.Object)
	 */
	@Override
	public Object visit(ASTsimple_record_list node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ifc4emf.part21.parser.ClearTextReaderVisitor#visit(org.ifc4emf.part21.parser.ASTsyntax, java.lang.Object)
	 */
	@Override
	public Object visit(ASTsyntax node, Object data) {
		EObject modelObject = (EObject) node.jjtGetChild(0).jjtAccept(this, data);
		if (modelObject.eResource() == null)
			resource.getContents().add(modelObject);
		return modelObject;
	}

	public void setMVD(Set<EClass> eClasses) {
		this.whiteList = eClasses;
		if (whiteList == null)
			return;
		this.whiteListWithSupertypes = new HashSet<EClass>();
		for (EClass eClass : whiteList) {
			if (whiteListWithSupertypes.add(eClass))
				whiteListWithSupertypes.addAll(eClass.getEAllSuperTypes());
		}
	}

}
