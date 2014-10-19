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
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.metamodel.ifcheader.Part21Factory;
import org.ifc4emf.metamodel.modelblob.util.ResumableResourceUtil;
import org.ifc4emf.part21.Activator;
import org.ifc4emf.part21.parser.ASTsyntax;
import org.ifc4emf.part21.parser.ClearTextReader;
import org.ifc4emf.part21.parser.ParseException;

abstract public class Part21ResourceImpl extends ResourceImpl {

	static public final String OPTION_CONTENTSLIST = EList.class.getName();
	public static final String OPTION_SAVE_PROGRESS_MONITOR = IProgressMonitor.class.getName();
	static public final String OPTION_MVD = "OPTION_MVD";
	static public final String OPTION_SKIPREFERENCES = "OPTION_SKIPREFERENCES";

	public Part21ResourceImpl() {
		super();
	}

	public Part21ResourceImpl(URI uri) {
		super(uri);
	}

	public void doLoad(InputStream inputStream, Map<?, ?> options, Part21LoadHelper helper) throws IOException {

		EList contentsList = options != null ? (EList) options.get(OPTION_CONTENTSLIST) : null;
		Model ifcModel = null;
		if (contentsList != null)
			for (Object model : contentsList)
				if (model instanceof Model)
					ifcModel = (Model) model;

		IProgressMonitor monitor = options != null ? (IProgressMonitor) options.get(OPTION_SAVE_PROGRESS_MONITOR) : null;
		boolean resumeOnly = options != null ? Boolean.TRUE.equals(options.get(ResumableResourceUtil.RESUMEONLY)) : false;
		if (ifcModel == null)
			ifcModel = Part21Factory.eINSTANCE.createModel();
		if (ifcModel.eContainer() == null && contentsList != null)
			contentsList.add(ifcModel);
		if (monitor == null)
			monitor = new NullProgressMonitor();
		Part21Loader loader;
		if (resumeOnly) {
			loader = new Part21LoaderResume(this, helper, inputStream, ifcModel, monitor);
		} else {
			int initialAvailable = inputStream.available();
			if (ifcModel.getTotalWork() > 0) {
				if (ifcModel.getTotalWork() != initialAvailable)
					throw new RuntimeException("File sizes differ: expected to resume a file of " + ifcModel.getTotalWork() + " bytes, instead found a file of actually " + initialAvailable + " bytes.");
			} else
				ifcModel.setTotalWork(initialAvailable);
			String taskName = "Loading " + this.getURI().lastSegment();
			monitor.beginTask(taskName, 1000);
			monitor = SubMonitor.convert(monitor, 1000); // RAP can't handle large initialAvailable, so scale it down to 1000
			monitor.beginTask(taskName, initialAvailable);
			Activator.log("IFC model size:" + inputStream.available());
			loader = new Part21LoaderCDO(this, helper, inputStream, ifcModel, monitor);
			loader.setMVD((Set<EClass>) options.get(OPTION_MVD));
			loader.setSkipReferences((Boolean) options.get(OPTION_SKIPREFERENCES));
		}
		ClearTextReader parser = new ClearTextReader(inputStream);
		parser.immediateConsumer = (ImmediateConsumer) loader;
		try {
			long started = new Date().getTime();
			ASTsyntax syntax = parser.syntax();
			long ended = new Date().getTime();
			Activator.log("Parsing IFC file took " + (ended - started));
			started = new Date().getTime();
			loader.load(syntax);
			ended = new Date().getTime();
			Activator.log("Building IFC EMF model took " + (ended - started));
		} catch (ParseException e) {
			if (!resumeOnly)
				throw new RuntimeException(e);
		} catch (RuntimeException re) {
			if (loader.currentEntityId != -1)
				throw new RuntimeException("Got exception while parsing #" + loader.currentEntityId, re);
			throw re;
		}

	}

	public void doSave(OutputStream outputStream, Map<?, ?> options, Part21LoadHelper helper) throws IOException {

		EList contentsList = options != null ? (EList) options.get(OPTION_CONTENTSLIST) : null;
		Model ifcModel = null;
		if (contentsList != null)
			for (Object model : contentsList)
				if (model instanceof Model)
					ifcModel = (Model) model;

		IProgressMonitor monitor = options != null ? (IProgressMonitor) options.get(OPTION_SAVE_PROGRESS_MONITOR) : null;
		if (monitor == null)
			monitor = new NullProgressMonitor();

		Part21Printer printer;
		if (ifcModel != null) {
			printer = new Part21Printer(ifcModel, monitor, helper);
		} else {
			printer = new Part21Printer(this, monitor, helper);
		}
		printer.save(outputStream);
	}

	/**
	 * Should be called for new created IFC objects (not created within the parsing process) which will put them into a containment relationship to the IFC model
	 * 
	 * @param eObject
	 *            the new object to add
	 * @param context
	 *            some object which is already contained in the IFC model
	 * @return
	 */
	public static <T extends EObject> T addToModel(T eObject, EObject context) {
		if (eObject.eContainer() == null) {
			while (context != null) {
				if (context instanceof Model) {
					Model model = (Model) context;
					ContainmentTreeOrderedByNumberHelper containmentHelper = new ContainmentTreeOrderedByNumberHelper(model);
					containmentHelper.add(containmentHelper.getAvailableId(), eObject);
					model.setCount(model.getCount() + 1);
					return eObject;
				}
				context = context.eContainer();
			}
			throw new RuntimeException("Could not find model context");
		}
		throw new RuntimeException("Element is already contained");
	}

}
