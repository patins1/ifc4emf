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
package org.ifc4emf.metamodel.express.loader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.ifc4emf.metamodel.express.core.ARRAYType;
import org.ifc4emf.metamodel.express.core.AggregationType;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.BinaryType;
import org.ifc4emf.metamodel.express.core.ConcreteAggregationType;
import org.ifc4emf.metamodel.express.core.ConcreteType;
import org.ifc4emf.metamodel.express.core.CoreFactory;
import org.ifc4emf.metamodel.express.core.CorePackage;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.EnumerationType;
import org.ifc4emf.metamodel.express.core.ExplicitAttribute;
import org.ifc4emf.metamodel.express.core.InstantiableType;
import org.ifc4emf.metamodel.express.core.InverseAttribute;
import org.ifc4emf.metamodel.express.core.InvertibleAttribute;
import org.ifc4emf.metamodel.express.core.LISTType;
import org.ifc4emf.metamodel.express.core.LogicType;
import org.ifc4emf.metamodel.express.core.NamedType;
import org.ifc4emf.metamodel.express.core.NumericType;
import org.ifc4emf.metamodel.express.core.PartialEntityType;
import org.ifc4emf.metamodel.express.core.RealType;
import org.ifc4emf.metamodel.express.core.SETType;
import org.ifc4emf.metamodel.express.core.Schema;
import org.ifc4emf.metamodel.express.core.Scope;
import org.ifc4emf.metamodel.express.core.ScopedId;
import org.ifc4emf.metamodel.express.core.SelectType;
import org.ifc4emf.metamodel.express.core.SingleEntityType;
import org.ifc4emf.metamodel.express.core.SizeConstraint;
import org.ifc4emf.metamodel.express.core.SpecializedType;
import org.ifc4emf.metamodel.express.core.StringType;
import org.ifc4emf.metamodel.express.instances.EnumerationItem;
import org.ifc4emf.metamodel.express.instances.InstancesFactory;
import org.ifc4emf.metamodel.express.parser.*;
import org.ifc4emf.metamodel.express.util.ExpressResourceFactoryImpl;

public class ExpressLoader implements ExpressParserVisitor {

	private class LinkageTuple {
		private EObject from;
		private EReference ref;
		private String toId;
		private EClass toCls;

		public EClass getToCls() {
			return toCls;
		}

		public EObject getFrom() {
			return from;
		}

		public EReference getRef() {
			return ref;
		}

		public String getToId() {
			return toId;
		}

		public LinkageTuple(EObject from, EReference ref, EClass toCls, String toId) {
			this.from = from;
			this.ref = ref;
			this.toCls = toCls;
			this.toId = toId;
		}
	}

	Logger logger;
	private List<LinkageTuple> linkagePhase;

	public static void main(String args[]) {

		try {
			ExpressParser parser = new ExpressParser(new FileInputStream(args[0]));
			ASTsyntax syntax = parser.syntax();

			// create resource set and resource
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("express", new ExpressResourceFactoryImpl());
			Resource resource = resourceSet.createResource(URI.createFileURI("c:/workspaces/jsdai/org.ifc4emf.metamodel.ifc/model/ifc2x3.express"));

			ExpressLoader loader = new ExpressLoader(resource);
			loader.load(syntax);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void load(ASTsyntax syntax) throws IOException {

		syntax.jjtAccept(this, null);

		// do the linking phase
		linkObjects(linkagePhase);

		// Post-processing phases
		upgradeInvertibleAttributes();
		linkObjects(linkagePhase2);

		// serialize resource – you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		// this.resource.save(null);
	}

	private void upgradeInvertibleAttributes() {
		Iterator<EObject> resourceIter = this.resource.getAllContents();
		while (resourceIter.hasNext()) {
			EObject eObj = resourceIter.next();
			if (eObj instanceof EntityType) {
				EntityType entity = (EntityType) eObj;
				Collection<ExplicitAttribute> toReplace = new ArrayList<ExplicitAttribute>();
				for (Attribute attr : entity.getDeclares().getDeclaresAttribute()) {
					if (attr instanceof ExplicitAttribute) {
						ExplicitAttribute eAttr = (ExplicitAttribute) attr;
						if (isEntityOrEntitySelectType(eAttr.getAttributeType())) {
							// Just gather them up. We will deal with them outside the iterator, to avoid ConcurrentModificationException
							toReplace.add(eAttr);
						}
					}
				}
				for (ExplicitAttribute eAttr : toReplace) {
					String attrName = eAttr.getId().getLocalName();
					// Remove the old explicit attribute, copy its details into an invertible, then add the invertible
					InvertibleAttribute invertible = CoreFactory.eINSTANCE.createInvertibleAttribute();
					// Generic copy routine - doing this should also add the invertible to the entityType,
					// through the namespace reference, but we will check (because the subsetted references
					// have messed up opposites in this metamodel
					int originalPosition = entity.getDeclares().getDeclaresAttribute().indexOf(eAttr);
					copyObjectProperties(eAttr, invertible);
					entity.getDeclares().getDeclaresAttribute().remove(eAttr);
					if (!entity.getDeclares().getDeclaresAttribute().contains(invertible)) {
						// entity.getAttributes().add(invertible);
						entity.getDeclares().getDeclaresAttribute().add(originalPosition, invertible);
					}
					// We also need to fix the lookup tables (remember that the scopedId object has been unlinked from the

					// unregisterAttribute(entity.getId().getLocalName(), attrName);
					// registerAttribute(entity, invertible);
					String qualifiedName = entity.getId().getLocalName() + "." + attrName;
					typesTable.get(CorePackage.eINSTANCE.getExplicitAttribute()).remove(qualifiedName);
					registerType(qualifiedName, invertible);
				}
			}
		}
	}

	private void copyObjectProperties(EObject oldObject, EObject newObject) {
		// Attributes first
		for (EAttribute eAttr : oldObject.eClass().getEAllAttributes()) {
			newObject.eSet(eAttr, oldObject.eGet(eAttr));
		}
		// And now references
		for (EReference eRef : oldObject.eClass().getEAllReferences()) {
			// This is some ninja shit, right here. Check the values of the references, to make sure that no opposite references
			// refer to the old object. Then, make sure the new object gets their values
			if (!eRef.isDerived()) {
				Object val = oldObject.eGet(eRef);
				newObject.eSet(eRef, oldObject.eGet(eRef));

				if (eRef.getEOpposite() != null) {
					if (val instanceof EList) {
						for (Object obj : (EList) val) {
							EObject eobj = (EObject) obj;
							removeFromReference(eobj, eRef.getEOpposite(), oldObject);
						}
					} else if (val != null) {
						// Its an EObject
						EObject eobj = (EObject) val;
						removeFromReference(eobj, eRef.getEOpposite(), oldObject);
					}
				}
			}
		}
	}

	private void removeFromReference(EObject subject, EReference reference, EObject object) {
		Object value = subject.eGet(reference);
		if (value instanceof EList) {
			EList valueList = (EList) value;
			valueList.remove(object);
		} else if (value != null) {
			EObject valueObj = (EObject) value;
			if (valueObj == object) {
				subject.eUnset(reference);
			}
		}
	}

	private boolean isEntityOrEntitySelectType(AttributeType type) {
		if (type instanceof EntityType) {
			return true;
		}
		if (type instanceof SelectType) {
			return isEntitySelectType((SelectType) type);
		}
		if (type instanceof ConcreteAggregationType) {
			return isEntityOrEntitySelectType(((ConcreteAggregationType) type).getMemberType());
		}
		return false;
	}

	private boolean isEntitySelectType(SelectType selectType) {
		if (selectType.eIsSet(CorePackage.eINSTANCE.getSelectType_Base())) {
			logger.warning("Extensible/extending SelectTypes are not fully supported");
		}
		for (NamedType listType : selectType.getSelectList()) {
			if (!(listType instanceof EntityType)) {
				return false;
			}
		}
		return true;
	}

	private void linkObjects(Collection<LinkageTuple> linkage) {
		for (LinkageTuple tuple : linkage) {
			// If its a single reference...
			EObject toObj = lookupTypeId(tuple.getToCls(), tuple.getToId());
			if (toObj == null) {
				continue;
			}
			if (tuple.getRef().isMany()) {
				EList list = (EList) tuple.getFrom().eGet(tuple.getRef(), false);
				list.add(toObj);
			} else {
				tuple.getFrom().eSet(tuple.getRef(), toObj);
			}
		}
	}

	private Hashtable<EClass, Hashtable<String, EObject>> typesTable;
	private Hashtable<String, Hashtable<String, Attribute>> attributesTable;
	private LogicType booleanType;
	private RealType realType;
	private StringType stringType;
	private NumericType integerType;
	private NumericType numberType;
	private LogicType logicalType;
	private Resource resource;
	private Collection<LinkageTuple> linkagePhase2;

	private EObject lookupTypeId(EClass toCls, String toId) {

		if (typesTable.containsKey(toCls) && typesTable.get(toCls).containsKey(toId)) {
			return typesTable.get(toCls).get(toId);
		}
		for (EClass subclass : typesTable.keySet()) {
			if (subclass.getEAllSuperTypes().contains(toCls) && typesTable.get(subclass).containsKey(toId)) {
				// logger.info("Lookup up ID " + toId + ": Found a match in class " + subclass.getName());
				return typesTable.get(subclass).get(toId);
			}
		}

		logger.severe("Lookup failed for ID " + toId + " within class " + toCls.getName());
		return null;

		// //For now just deal with direct class lookups. We'll handle inheritance when it crops up. NOW!
		// if (!lookupTable.containsKey(toCls)) {
		// logger.warning("No objects registered in lookupTable for class " + toCls);
		// return null;
		// }
		// if (!lookupTable.get(toCls).containsKey(toId)) {
		// logger.warning("No object found with id " + toId + " for class " + toCls);
		// return null;
		// }
		// return lookupTable.get(toCls).get(toId);
	}

	private void registerType(String id, EObject obj) {
		EClass cls = obj.eClass();
		if (!typesTable.containsKey(cls)) {
			typesTable.put(cls, new Hashtable<String, EObject>());
		}
		if (typesTable.get(cls).containsKey(id)) {
			logger.warning("Warning: overwriting lookup id " + id + " for class " + cls + "replacing " + typesTable.get(cls).get(id) + " with " + obj);
		}
		typesTable.get(cls).put(id, obj);
	}

	private Attribute lookupAttribute(String entityName, String attributeName) {
		// TODO Do some error checking, you bum
		return attributesTable.get(entityName).get(attributeName);
	}

	private void unregisterAttribute(String entityName, String attributeName) {
		// TODO Do some error checking, you bum
		attributesTable.get(entityName).remove(attributeName);
	}

	private void registerAttribute(EntityType entity, Attribute attr) {
		String entityName = entity.getId().getLocalName();
		if (!attributesTable.containsKey(entityName)) {
			attributesTable.put(entityName, new Hashtable<String, Attribute>());
		}
		String attributeName = attr.getId().getLocalName();
		if (!attributesTable.get(entityName).containsKey(attributeName)) {
			logger.warning("Warning: overwriting attribute lookup id " + attributeName + " in entity " + entityName);
		}
		attributesTable.get(entityName).put(attributeName, attr);

	}

	public ExpressLoader(Resource resource) {
		super();
		this.resource = resource;
		this.linkagePhase = new ArrayList<LinkageTuple>();
		this.linkagePhase2 = new ArrayList<LinkageTuple>();
		this.typesTable = new Hashtable<EClass, Hashtable<String, EObject>>();
		this.attributesTable = new Hashtable<String, Hashtable<String, Attribute>>();
		this.logger = Logger.getLogger("Loader"/* , "org.ifc4emf.metamodel.express.expressparser" */);
		logger.setLevel(Level.INFO);
	}

	@Override
	public Object visit(SimpleNode node, Object data) {
		// TODO Auto-generated method stub
		logger.info("Unimplemented visit method for SimpleNode");
		return null;
	}

	@Override
	public Object visit(ASTsimple_id node, Object data) {
		String id = (String) node.jjtGetValue();
		return id;
	}

	@Override
	public Object visit(ASTattribute_ref node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTconstant_ref node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTentity_ref node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTenumeration_ref node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTfunction_ref node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTparameter_ref node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTprocedure_ref node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTschema_ref node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTtype_label_ref node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTtype_ref node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTvariable_ref node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTabstract_supertype_declaration node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTactual_parameter_list node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTadd_like_op node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTaggregate_initializer node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTaggregate_source node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTaggregate_type node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTaggregation_types node, Object data) {
		AggregationType aType = (AggregationType) node.jjtGetChild(0).jjtAccept(this, data);
		resource.getContents().add(aType);
		return aType;
	}

	@Override
	public Object visit(ASTalgorithm_head node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTalias_stmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTarray_type node, Object data) {
		// <ARRAY> bound_spec() <OF> (<OPTIONAL>)? (<UNIQUE>)? base_type()
		ARRAYType arrayType = CoreFactory.eINSTANCE.createARRAYType();
		arrayType.setOrdering("Indexed");

		// TODO There is a weird duplication with ARRAYTypes and hi-index/lo-index versus lower-bound/upper-bound.
		Object boundObj = node.jjtGetChild(0).jjtAccept(this, arrayType);

		Object typeObj = node.jjtGetChild(node.jjtGetNumChildren() - 1).jjtAccept(this, data);
		if (typeObj instanceof String) {
			String typeName = (String) typeObj;
			linkagePhase.add(new LinkageTuple(arrayType, CorePackage.eINSTANCE.getConcreteAggregationType_MemberType(), CorePackage.eINSTANCE.getInstantiableType(), typeName));
		} else if (typeObj instanceof InstantiableType) {
			InstantiableType type = (InstantiableType) typeObj;
			arrayType.setMemberType(type);
		} else {
			logger.warning("Unexpected type for array type: " + typeObj);
		}
		return arrayType;
	}

	@Override
	public Object visit(ASTassignment_stmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTattribute_decl node, Object data) {
		// Assume that we're dealing with an attribute_id, not a qualified id

		Object o = node.jjtGetChild(0).jjtAccept(this, data);
		return o;
	}

	@Override
	public Object visit(ASTattribute_id node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTattribute_qualifier node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTbag_type node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTbase_type node, Object data) {
		// Delegate
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTbinary_type node, Object data) {
		// TODO Auto-generated method stub
		// logger.log(Level.INFO, "AST Type not handled: " + node.getClass()); return null;
		BinaryType binType = CoreFactory.eINSTANCE.createBinaryType();
		binType.setFundamentalType(binType);
		binType.setId("BINARY");
		resource.getContents().add(binType);
		return binType;
	}

	@Override
	public Object visit(ASTboolean_type node, Object data) {
		if (this.booleanType == null) {
			this.booleanType = CoreFactory.eINSTANCE.createLogicType();
			this.booleanType.setFundamentalType(this.booleanType);
			this.booleanType.setId("BOOLEAN");
			resource.getContents().add(this.booleanType);
		}
		return this.booleanType;
	}

	@Override
	public Object visit(ASTbound_1 node, Object data) {
		SizeConstraint constraint = CoreFactory.eINSTANCE.createSizeConstraint();
		Object expr = node.jjtGetChild(0).jjtAccept(this, data);
		constraint.setBound((Integer) expr);
		return constraint;
	}

	@Override
	public Object visit(ASTbound_2 node, Object data) {
		SizeConstraint constraint = CoreFactory.eINSTANCE.createSizeConstraint();
		Object expr = node.jjtGetChild(0).jjtAccept(this, data);
		constraint.setBound((Integer) expr);
		return constraint;
	}

	@Override
	public Object visit(ASTbound_spec node, Object data) {
		// For now we will assume that this will always occur in the context of an AggregationType
		AggregationType aType = (AggregationType) data;
		Object lowerBound = node.jjtGetChild(0).jjtAccept(this, data);
		aType.setLowerBound((SizeConstraint) lowerBound);
		Object upperBound = node.jjtGetChild(1).jjtAccept(this, data);
		aType.setUpperBound((SizeConstraint) upperBound);
		return aType;
	}

	@Override
	public Object visit(ASTbuilt_in_constant node, Object data) {
		return node.jjtGetValue();
	}

	@Override
	public Object visit(ASTbuilt_in_function node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTbuilt_in_procedure node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTcase_action node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTcase_label node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTcase_stmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTcompound_stmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTconstant_body node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTconstant_decl node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTconstant_factor node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTconstant_id node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTconstructed_types node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTdeclaration node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTderived_attr node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTderive_clause node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTdomain_rule node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTelement node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTentity_body node, Object data) {
		EntityType entity = (EntityType) data;
		SingleEntityType sEntityType = CoreFactory.eINSTANCE.createSingleEntityType();
		entity.setDeclares(sEntityType);
		PartialEntityType pEntityType = CoreFactory.eINSTANCE.createPartialEntityType();
		sEntityType.setEquivalent(pEntityType);
		pEntityType.getComponents().add(sEntityType);
		node.childrenAccept(this, sEntityType);
		return data;
	}

	@Override
	public Object visit(ASTentity_constructor node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTentity_decl node, Object data) {
		// Create the entity, and pass it down to the entity_head and entity_body to get the details
		// fleshed out.
		EntityType entity = CoreFactory.eINSTANCE.createEntityType();
		Schema schema = (Schema) data;
		schema.getSchemaElements().add(entity);
		// Pass to head
		node.jjtGetChild(0).jjtAccept(this, entity);
		// Pass to body
		node.jjtGetChild(1).jjtAccept(this, entity);
		// logger.log(Level.INFO, "AST Type not handled: " + node.getClass()); return null;
		return entity;
	}

	@Override
	public Object visit(ASTentity_head node, Object data) {
		EntityType entity = (EntityType) data;
		// First child is the id
		String id = (String) node.jjtGetChild(0).jjtAccept(this, null);
		// Construct a scopedId
		ScopedId scopedId = CoreFactory.eINSTANCE.createScopedId();
		scopedId.setDefiningScope(entity.getNamespace());
		scopedId.setLocalName(id);
		entity.setId(scopedId);
		registerType(id, entity);
		// Second child is the subsuper stuff. We don't expect anything back from this (in fact, it will
		// mostly be post-processed in the linking phase.
		node.jjtGetChild(1).jjtAccept(this, entity);
		// logger.log(Level.INFO, "AST Type not handled: " + node.getClass()); return null;
		return entity;
	}

	@Override
	public Object visit(ASTentity_id node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTenumeration_id node, Object data) {
		String localName = (String) node.jjtGetChild(0).jjtAccept(this, data);
		EnumerationItem item = InstancesFactory.eINSTANCE.createEnumerationItem();
		ScopedId id = CoreFactory.eINSTANCE.createScopedId();
		id.setDefiningScope((Scope) data);
		id.setLocalName(localName);
		item.setId(id);
		return item;
	}

	@Override
	public Object visit(ASTenumeration_reference node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTenumeration_type node, Object data) {
		EnumerationType enumType = CoreFactory.eINSTANCE.createEnumerationType();
		enumType.setFundamentalType(enumType);
		int itemCount = 0;
		for (int i = 0; i < node.jjtGetNumChildren(); i++) {
			EnumerationItem item = (EnumerationItem) node.jjtGetChild(i).jjtAccept(this, enumType);
			item.setPosition(itemCount);
			itemCount++;
			enumType.getDeclaredItems().add(item);
		}
		return enumType;
	}

	@Override
	public Object visit(ASTescape_stmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTexplicit_attr node, Object data) {
		SingleEntityType entity = (SingleEntityType) data;
		boolean optional = false;
		if (node.jjtGetValue() == Boolean.TRUE) {
			optional = true;
		}
		// String typeName = null;
		// int attrCount = 0;
		int attrCount = entity.getDeclaresAttribute().size();
		Collection<ExplicitAttribute> attrs = new ArrayList<ExplicitAttribute>();
		// Stop before the last child, which will be the type.
		for (int i = 0; i < node.jjtGetNumChildren() - 1; i++) {
			Object child = node.jjtGetChild(i).jjtAccept(this, data);
			if (child instanceof String) {
				ExplicitAttribute attr = CoreFactory.eINSTANCE.createExplicitAttribute();
				ScopedId id = CoreFactory.eINSTANCE.createScopedId();
				id.setDefiningScope(entity.getDeclaredIn());
				String localId = (String) child;
				id.setLocalName(localId);
				attr.setId(id);
				entity.getDeclaresAttribute().add(attr);
				attr.setPosition(attrCount);
				attrCount++;
				attrs.add(attr);
				// registerAttribute(entity, attr);
				String qualifiedName = entity.getId().getLocalName() + "." + localId;
				registerType(qualifiedName, attr);
				// } else if (child instanceof Boolean) { //This should be the "optional"
				// optional = (Boolean) child;
			} else {
				logger.warning("Unhandled type in attribute declaration: " + child);
			}
		}
		for (ExplicitAttribute attr : attrs) {
			attr.setIsOptional(optional);

		}
		Object typeObj = node.jjtGetChild(node.jjtGetNumChildren() - 1).jjtAccept(this, data);
		addAttributeType(attrs, typeObj);
		return entity;
	}

	private void addAttributeType(Collection<? extends Attribute> attrs, Object typeObj) {
		// We will either get a String (type id) or an actual object back depending on what type
		// we're dealing with. If its an entity type, it'll be a String, for example, but if its an
		// aggregated or builtin type it could be a type object.
		if (typeObj instanceof String) {
			String typeName = (String) typeObj;
			for (Attribute attr : attrs) {
				linkagePhase.add(new LinkageTuple(attr, CorePackage.eINSTANCE.getAttribute_AttributeType(), CorePackage.eINSTANCE.getAttributeType(), typeName));
			}
		} else if (typeObj instanceof AttributeType) {
			AttributeType type = (AttributeType) typeObj;
			for (Attribute attr : attrs) {
				attr.setAttributeType(type);
			}
		} else {
			logger.warning("Unexpected type for attribute: " + typeObj);
		}
	}

	@Override
	public Object visit(ASTexpression node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTfactor node, Object data) {
		if (node.jjtGetNumChildren() == 1) {
			return node.jjtGetChild(0).jjtAccept(this, data);
		} else {
			logger.warning("Power factors are not yet implemented");
			return null;
		}
	}

	@Override
	public Object visit(ASTformal_parameter node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTfunction_call node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTfunction_decl node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTfunction_head node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTfunction_id node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTgeneralized_types node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTgeneral_aggregation_types node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTgeneral_array_type node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTgeneral_bag_type node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTgeneral_list_type node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTgeneral_ref node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTgeneral_set_type node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTgeneric_type node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTgroup_qualifier node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTif_stmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTincrement node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTincrement_control node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTindex node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTindex_1 node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTindex_2 node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTindex_qualifier node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTinteger_type node, Object data) {
		if (this.integerType == null) {
			this.integerType = CoreFactory.eINSTANCE.createNumericType();
			this.integerType.setFundamentalType(this.integerType);
			this.integerType.setId("INTEGER");
			resource.getContents().add(this.integerType);
		}
		return this.integerType;
	}

	@Override
	public Object visit(ASTinterface_specification node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTinterval node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTinterval_high node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTinterval_item node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTinterval_low node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTinterval_op node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTinverse_attr node, Object data) {
		// attribute_decl() <COLON> ((<SET>|<BAG>) (bound_spec())? <OF>)? entity_ref() <FOR> attribute_ref() <SEMICOLON>
		// First one is an attribute_decl (which is just the id)
		SingleEntityType entity = (SingleEntityType) data;
		InverseAttribute invAttr = CoreFactory.eINSTANCE.createInverseAttribute();
		String localName = (String) node.jjtGetChild(0).jjtAccept(this, invAttr);
		ScopedId id = CoreFactory.eINSTANCE.createScopedId();
		id.setDefiningScope(entity.getDeclaredIn());
		int attrCount = entity.getDeclaresAttribute().size();
		invAttr.setPosition(attrCount);
		entity.getDeclaresAttribute().add(invAttr);
		id.setLocalName(localName);
		invAttr.setId(id);
		String qualifiedId = entity.getId().getLocalName() + "." + localName;
		registerType(qualifiedId, invAttr);

		Object typeObj = node.jjtGetChild(node.jjtGetNumChildren() - 2).jjtAccept(this, invAttr);
		addAttributeType(Arrays.asList(invAttr), typeObj);
		String referredEntityType = null;
		if (typeObj instanceof AttributeType) {
			for (int i = linkagePhase.size() - 1; i > 0; i--) {
				if (typeObj == linkagePhase.get(i).from) {
					referredEntityType = linkagePhase.get(i).toId;
					break;
				}
			}
		} else
			referredEntityType = (String) typeObj;

		// Last child is the inverse
		String otherAttrId = (String) node.jjtGetChild(node.jjtGetNumChildren() - 1).jjtAccept(this, invAttr);
		String otherQualified = referredEntityType + "." + otherAttrId;
		linkagePhase2.add(new LinkageTuple(invAttr, CorePackage.eINSTANCE.getInverseAttribute_Explicit(), CorePackage.eINSTANCE.getInvertibleAttribute(), otherQualified));

		return invAttr;
	}

	@Override
	public Object visit(ASTinverse_clause node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTlabel node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTlist_type node, Object data) {
		LISTType listType = CoreFactory.eINSTANCE.createLISTType();
		listType.setOrdering("Ordered");
		// TODO doesn't handle unique lists for now
		listType.setIsUnique(false);
		// Children will consist of an optional bound spec, and also a type reference
		if (node.jjtGetNumChildren() > 1) {
			node.jjtGetChild(0).jjtAccept(this, listType);
		}

		Object typeObj = node.jjtGetChild(node.jjtGetNumChildren() - 1).jjtAccept(this, data);
		if (typeObj instanceof String) {
			String typeName = (String) typeObj;
			linkagePhase.add(new LinkageTuple(listType, CorePackage.eINSTANCE.getConcreteAggregationType_MemberType(), CorePackage.eINSTANCE.getInstantiableType(), typeName));
		} else if (typeObj instanceof InstantiableType) {
			InstantiableType type = (InstantiableType) typeObj;
			listType.setMemberType(type);
		} else {
			logger.warning("Unexpected type for list type: " + typeObj);
		}

		return listType;
	}

	@Override
	public Object visit(ASTliteral node, Object data) {
		return node.jjtGetValue();
	}

	@Override
	public Object visit(ASTlocal_decl node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTlocal_variable node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTlogical_expression node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTlogical_literal node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTlogical_type node, Object data) {
		if (this.logicalType == null) {
			this.logicalType = CoreFactory.eINSTANCE.createLogicType();
			this.logicalType.setFundamentalType(this.logicalType);
			this.logicalType.setId("LOGICAL");
			resource.getContents().add(this.logicalType);
		}
		return this.logicalType;
	}

	@Override
	public Object visit(ASTmultiplication_like_op node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTnamed_types node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTnamed_type_or_rename node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTnull_stmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTnumber_type node, Object data) {
		if (this.numberType == null) {
			this.numberType = CoreFactory.eINSTANCE.createNumericType();
			this.numberType.setFundamentalType(this.numberType);
			this.numberType.setId("NUMBER");
			resource.getContents().add(this.numberType);
		}
		return this.numberType;
	}

	@Override
	public Object visit(ASTnumeric_expression node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTone_of node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTparameter node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTparameter_id node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTparameter_type node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTpopulation node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTprecision_spec node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTprimary node, Object data) {
		if (node.jjtGetNumChildren() == 1) {
			return node.jjtGetChild(0).jjtAccept(this, data);
		} else {
			logger.warning("Qualified primaries are not yet implemented");
			return null;
		}
	}

	@Override
	public Object visit(ASTprocedure_call_stmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTprocedure_decl node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTprocedure_head node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTprocedure_id node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTqualifiable_factor node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTqualified_attribute node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTqualifier node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTquery_expression node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTreal_type node, Object data) {
		// Cache the unparameterised real type, otherwise create one
		if (node.jjtGetNumChildren() == 0) {
			if (this.realType == null) {
				this.realType = CoreFactory.eINSTANCE.createRealType();
				this.realType.setId("REAL");
				this.realType.setFundamentalType(this.realType);
				resource.getContents().add(this.realType);
			}
			return this.realType;
		} else {
			int precision = (Integer) node.jjtGetChild(0).jjtAccept(this, data);
			RealType paramRealType = CoreFactory.eINSTANCE.createRealType();
			paramRealType.setId("REAL");
			paramRealType.setPrecision(precision);
			paramRealType.setFundamentalType(paramRealType);
			resource.getContents().add(paramRealType);
			return paramRealType;
		}
	}

	@Override
	public Object visit(ASTreferenced_attribute node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTreference_clause node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTrel_op node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTrel_op_extended node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTrename_id node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTrepeat_control node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTrepeat_stmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTrepetition node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTresource_or_rename node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTresource_ref node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTreturn_stmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTrule_decl node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTrule_head node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTrule_id node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTschema_body node, Object data) {
		Collection<Object> elts = new HashSet<Object>();
		for (int i = 0; i < node.jjtGetNumChildren(); i++) {
			Object elt = node.jjtGetChild(i).jjtAccept(this, data);
			// if (elt != null) {
			// elts.add(elt);
			// }
		}
		return elts;
	}

	@Override
	public Object visit(ASTschema_decl node, Object data) {
		Schema s = CoreFactory.eINSTANCE.createSchema();
		String name = (String) node.jjtGetChild(0).jjtAccept(this, data);
		s.setName(name);
		Collection<EObject> decls = (Collection<EObject>) node.jjtGetChild(1).jjtAccept(this, s);
		// for (EObject decl : decls) {
		// if (decl instanceof SchemaElement) {
		// //No need to add - this is being done by the contained element
		// //s.getSchemaElements().add((SchemaElement) decl);
		// } else {
		// logger.info("Unhandled element in schema_decl: " + decl);
		// }
		// }
		return s;
	}

	@Override
	public Object visit(ASTschema_id node, Object data) {
		String id = (String) node.jjtGetChild(0).jjtAccept(this, data);
		return id;
	}

	@Override
	public Object visit(ASTselector node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTselect_type node, Object data) {
		SelectType selectType = CoreFactory.eINSTANCE.createSelectType();
		selectType.setFundamentalType(selectType);
		for (int i = 0; i < node.jjtGetNumChildren(); i++) {
			String typeName = (String) node.jjtGetChild(i).jjtAccept(this, selectType);
			linkagePhase.add(new LinkageTuple(selectType, CorePackage.eINSTANCE.getSelectType_SelectList(), CorePackage.eINSTANCE.getNamedType(), typeName));
		}
		return selectType;
	}

	@Override
	public Object visit(ASTset_type node, Object data) {
		SETType setType = CoreFactory.eINSTANCE.createSETType();
		setType.setOrdering("Unordered");
		setType.setIsUnique(true);
		// Children will consist of an optional bound spec, and also a type reference
		if (node.jjtGetNumChildren() > 1) {
			node.jjtGetChild(0).jjtAccept(this, setType);
		}
		Object typeObj = node.jjtGetChild(node.jjtGetNumChildren() - 1).jjtAccept(this, data);
		if (typeObj instanceof String) {
			String typeName = (String) typeObj;
			linkagePhase.add(new LinkageTuple(setType, CorePackage.eINSTANCE.getConcreteAggregationType_MemberType(), CorePackage.eINSTANCE.getInstantiableType(), typeName));
		} else if (typeObj instanceof InstantiableType) {
			InstantiableType type = (InstantiableType) typeObj;
			setType.setMemberType(type);
		} else {
			logger.warning("Unexpected type for set type: " + typeObj);
		}

		return setType;
	}

	@Override
	public Object visit(ASTsign node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTsimple_expression node, Object data) {
		if (node.jjtGetNumChildren() == 1) {
			return node.jjtGetChild(0).jjtAccept(this, data);
		} else {
			logger.warning("Binary expressions are not yet implemented");
			return null;
		}
	}

	@Override
	public Object visit(ASTsimple_factor node, Object data) {
		if (node.jjtGetNumChildren() == 1) {
			return node.jjtGetChild(0).jjtAccept(this, data);
		} else {
			logger.warning("Unary ops are not yet implemented");
			return null;
		}
	}

	@Override
	public Object visit(ASTsimple_types node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTskip_stmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTstmt node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTstring_literal node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTstring_type node, Object data) {
		if (node.jjtGetNumChildren() > 0) {
			logger.warning("width specs on string types not supported");
		}
		if (this.stringType == null) {
			this.stringType = CoreFactory.eINSTANCE.createStringType();
			stringType.setFundamentalType(stringType);
			stringType.setId("STRING");
			resource.getContents().add(this.stringType);
		}
		return this.stringType;
	}

	@Override
	public Object visit(ASTsubsuper node, Object data) {
		// Delegate down to the supertype_constraint or subtype_declaration
		for (int i = 0; i < node.jjtGetNumChildren(); i++) {
			node.jjtGetChild(i).jjtAccept(this, data);
		}
		return data;
	}

	@Override
	public Object visit(ASTsubtype_constraint node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTsubtype_declaration node, Object data) {
		// This will just be a list of entity refs. Queue them up for addition in the linking phase
		for (int i = 0; i < node.jjtGetNumChildren(); i++) {
			String superId = (String) node.jjtGetChild(i).jjtAccept(this, null);
			linkagePhase.add(new LinkageTuple((EntityType) data, CorePackage.eINSTANCE.getEntityType_SubtypeOf(), CorePackage.eINSTANCE.getEntityType(), superId));
		}
		return data;
	}

	@Override
	public Object visit(ASTsupertype_constraint node, Object data) {
		// Don't need to deal with this one - its handled by the subtype_constraint
		// logger.log(Level.INFO, "AST Type not handled: " + node.getClass()); return null;
		return null;
	}

	@Override
	public Object visit(ASTsupertype_expression node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTsupertype_factor node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTsupertype_rule node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTsupertype_term node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTsyntax node, Object data) {
		// Gather schemas from children
		Collection<Schema> schemata = new HashSet<Schema>();
		for (int i = 0; i < node.jjtGetNumChildren(); i++) {
			Schema s = (Schema) node.jjtGetChild(i).jjtAccept(this, data);
			schemata.add(s);
			this.resource.getContents().add(s);
		}
		return schemata;
	}

	@Override
	public Object visit(ASTterm node, Object data) {
		if (node.jjtGetNumChildren() == 1) {
			return node.jjtGetChild(0).jjtAccept(this, data);
		} else {
			logger.warning("Binary terms are not yet implemented");
			return null;
		}
	}

	@Override
	public Object visit(ASTtype_decl node, Object data) {
		Schema scope = (Schema) data;
		// <TYPE> type_id() <EQ> underlying_type() <SEMICOLON> (where_clause())? <END_TYPE> <SEMICOLON>
		String localId = (String) node.jjtGetChild(0).jjtAccept(this, data);
		ScopedId scopedId = CoreFactory.eINSTANCE.createScopedId();
		scopedId.setDefiningScope(scope);
		scopedId.setLocalName(localId);
		Object typeObj = node.jjtGetChild(1).jjtAccept(this, data);
		if (typeObj instanceof NamedType) {
			NamedType nt = (NamedType) typeObj;
			registerType(localId, nt);
			nt.setId(scopedId);
			scope.getSchemaElements().add(nt);
		} else if (typeObj instanceof ConcreteType) {
			ConcreteType cType = (ConcreteType) typeObj;
			// Create a specializedType
			SpecializedType sType = CoreFactory.eINSTANCE.createSpecializedType();
			sType.setId(scopedId);
			sType.setFundamentalType(cType);
			sType.setUnderlyingType(cType);
			registerType(localId, sType);
			scope.getSchemaElements().add(sType);
		} else if (typeObj instanceof String) {
			// Its a type_ref, which will point to a Defined Type.
			SpecializedType sType = CoreFactory.eINSTANCE.createSpecializedType();
			sType.setId(scopedId);
			registerType(localId, sType);
			linkagePhase.add(new LinkageTuple(sType, CorePackage.eINSTANCE.getSpecializedType_UnderlyingType(), CorePackage.eINSTANCE.getDefinedType(), (String) typeObj));
			scope.getSchemaElements().add(sType);
		} else {
			logger.warning("Unrecognised underlying type for type decl: " + typeObj);
		}
		// Visit the where_clause just to make sure the not-visited message is logged
		if (node.jjtGetNumChildren() > 2) {
			node.jjtGetChild(2).jjtAccept(this, typeObj);
		}
		return typeObj;
	}

	@Override
	public Object visit(ASTtype_id node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTtype_label node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: : " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTtype_label_id node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTunary_op node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTunderlying_type node, Object data) {
		return node.jjtGetChild(0).jjtAccept(this, data);
	}

	@Override
	public Object visit(ASTunique_clause node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTunique_rule node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTuntil_control node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTuse_clause node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTvariable_id node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTwhere_clause node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTwhile_control node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTwidth node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

	@Override
	public Object visit(ASTwidth_spec node, Object data) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "AST Type not handled: " + node.getClass());
		return null;
	}

}
