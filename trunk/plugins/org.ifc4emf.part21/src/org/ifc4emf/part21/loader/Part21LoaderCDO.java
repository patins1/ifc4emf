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
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Date;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.ecore.resource.Resource;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.part21.Activator;
import org.ifc4emf.part21.parser.ASTentity_instance;
import org.ifc4emf.part21.parser.Node;

public class Part21LoaderCDO extends Part21Loader implements ImmediateConsumer {

	public static final String SUBTASK_SAVING = "Saving";
	public static int MODEL_WINDOW = 5000;
	int unsafedEntities = 0;
	private final InputStream inputStream;
	private int initialAvailable;
	private double doneAndSaved = 0;
	private long started = new Date().getTime();
	private long startedAfterSaving = new Date().getTime();
	private int prevForwardReferences = 0;
	private int prevResolvedForwardReferences = 0;
	private int parserCount;
	private int prevBytesProcessed;
	private int savings;
	private Reference<Object> scarcityIndicator;

	public Part21LoaderCDO(Resource resource, Part21LoadHelper helper, InputStream inputStream, Model ifcModel, IProgressMonitor monitor) throws IOException {
		super(resource, helper, ifcModel);
		this.inputStream = inputStream;
		this.initialAvailable = inputStream.available();
		this.monitor = monitor;
		resource = modelObject.eResource();
		if (resource instanceof CDOResource) {
			setupScarcityIndicator();
		}
		monitor.subTask(isResuming() ? "Resuming" : "Parsing");
	}

	private void save(Resource resource) throws IOException {
		this.monitor.subTask(SUBTASK_SAVING);
		resource.save(Collections.EMPTY_MAP);
		setupScarcityIndicator();
	}

	private void setupScarcityIndicator() {
		scarcityIndicator = new WeakReference<Object>(new int[1024 * 1024]);
	}

	@Override
	public boolean consume(Node node) {
		if (node instanceof ASTentity_instance) {
			if (!isResuming()) {
				parserCount++;
				modelObject.setCount(parserCount);
				long beforeModelling = new Date().getTime();
				node.jjtAccept(this, modelObject);
				long afterModelling = new Date().getTime();
				this.modelObject.setBuildModelTime(this.modelObject.getBuildModelTime() + (afterModelling - beforeModelling));
			} else {
				parserCount++;
				if (!isResuming()) {
					monitor.subTask("Parsing");
					startedAfterSaving = new Date().getTime();
				}
			}
			work(false);
			return true;
		}
		return false;
	}

	protected void work(boolean workIsFinished) {
		super.work(workIsFinished);
		updatedWorked();
		Resource resource = modelObject.eResource();
		if (resource instanceof CDOResource)
			try {
				if (!workIsFinished && !isResuming()) {
					unsafedEntities++;
				}
				if (workIsFinished || meetMemLimit()) {
					double done = getPercentageDone();
					long finished = new Date().getTime();
					this.modelObject.setParsingTime(this.modelObject.getParsingTime() + (finished - startedAfterSaving));

					Activator.log("Saving at " + done + "% #dirty=" + unsafedEntities + " %dirty=" + (done - doneAndSaved) + " new forwards=" + (forwardReferences - prevForwardReferences) + " resolved forwards=" + (resolvedForwardReferences - prevResolvedForwardReferences) + " remaining forwards=" + getRemainingForwardReferences()
							+ " total forwards=" + forwardReferences + " total backward references=" + backwardReferences + " time:" + (finished - started) + " time/element:" + (finished - started) / new Double(unsafedEntities));
					save(resource);
					monitor.subTask("Parsing");
					started = finished;
					startedAfterSaving = new Date().getTime();
					this.modelObject.setSavingTime(this.modelObject.getSavingTime() + (startedAfterSaving - started));
					if (workIsFinished) {
						// just save the changed SavingTime property!
						save(resource);
					}
					doneAndSaved = done;
					unsafedEntities = 0;
					prevForwardReferences = forwardReferences;
					prevResolvedForwardReferences = resolvedForwardReferences;
					savings++;
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
	}

	private boolean meetMemLimit() {
		// if (unsafedEntities==1000)
		// System.gc();
		long mm = Runtime.getRuntime().maxMemory();
		long fm = Runtime.getRuntime().freeMemory();
		long tm = Runtime.getRuntime().totalMemory();
		long usedMemory = tm - fm;
		long usableMemory = mm - usedMemory;
		if (unsafedEntities % 1000 == 0 && !isResuming()) {
			Activator.log("UnsafedEntities=" + unsafedEntities + " Used Memory=" + getMB(usedMemory) + " Max Memory=" + getMB(mm) + " Total Memory=" + getMB(tm) + " Free Memory=" + getMB(fm) + " Free=" + usableMemory / new Double(mm));
		}
		return unsafedEntities >= 1000 && (savings == 0 || scarcityIndicator.get() == null/* usableMemory/new Double(mm)<=0.5 */) || unsafedEntities >= 10000;
	}

	private String getMB(long byteCount) {
		return "" + byteCount / 1000 / 1000;
	}

	private boolean isResuming() {
		return modelObject.getCount() != parserCount;
	}

	private void updatedWorked() {
		try {
			int bytesProcessed = initialAvailable - inputStream.available();
			if (!isResuming())
				modelObject.setWorked(bytesProcessed);
			if (bytesProcessed - prevBytesProcessed > 0)
				monitor.worked(bytesProcessed - prevBytesProcessed);
			if (monitor.isCanceled())
				throw new MonitorCanceledException();
			prevBytesProcessed = bytesProcessed;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private double getPercentageDone() throws IOException {
		int nowAvailable = inputStream.available();
		return (100.0 * ((initialAvailable - nowAvailable) / (1.0 * initialAvailable)));
	}

}
