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

import org.eclipse.core.runtime.IProgressMonitor;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.part21.Activator;
import org.ifc4emf.part21.parser.ASTentity_instance;
import org.ifc4emf.part21.parser.ASTsyntax;
import org.ifc4emf.part21.parser.Node;

public class Part21LoaderResume extends Part21Loader implements ImmediateConsumer {

	private final IProgressMonitor monitor;
	private int parserCount;

	public Part21LoaderResume(Part21ResourceImpl resource, Part21LoadHelper helper, InputStream inputStream, Model ifcModel, IProgressMonitor monitor) {
		super(resource, helper, ifcModel);
		this.monitor = monitor;
		monitor.beginTask("Resume", ifcModel.getCount());
		monitor.subTask("Find resume point");
	}

	@Override
	public boolean consume(Node node) {
		if (node instanceof ASTentity_instance) {
			parserCount++;
			monitor.worked(1);
			return true;
		}
		return false;
	}

	@Override
	public void load(ASTsyntax syntax) throws IOException {
		// do nothing
		Activator.log("Parsed " + parserCount + " objects");
	}

}
