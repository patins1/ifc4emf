/*
 * Copyright (c) 2004- michael lawley and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License version 2.1 as published by the Free Software Foundation
 * which accompanies this distribution, and is available by writing to
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * Contributors:
 *     michael lawley
 *
 */

package org.ifc4emf.express.transform;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringBufferInputStream;
import java.net.URISyntaxException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.ifc4emf.metamodel.express.util.ExpressResourceFactoryImpl;

import IFC2X3.IFC2X3Package;
import IFC2X3.util.IfcLoadHelper;
import express2ecore.Express2ecorePackage;

public class EXPRESS2ECOREMain {

	public static void main(String[] args) throws Exception {
		System.out.println("usage: expURI ifcURI");
		if (args.length != 2)
			throw new RuntimeException("Expected exactly 2 parameters!");
		String expFileURI = args[0];
		String ifcFileURI = args[1];
		EXPRESS2ECOREMain.makeIFCFileFromEXPRESS(ifcFileURI, "platform:/resource/org.ifc4emf.metamodel.ifc/model/express2ecore.qvt", expFileURI);

	}

	private static void stringToFile(File file, String gsmContent) throws IOException {
		InputStream in = new StringBufferInputStream(gsmContent);
		OutputStream out = new FileOutputStream(file);

		// Copy the bits from instream to outstream
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

	public static String stringFromFile(File sourceLocation) throws IOException {
		InputStream in = new FileInputStream(sourceLocation);
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		// Copy the bits from instream to outstream
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();

		return new String(out.toByteArray());
	}

	public static void makeIFCFileFromEXPRESS(String ifcFileURI, String transformation3dURI, String expFileURI) throws IOException, InterruptedException, URISyntaxException {

		// register metamodel packages
		EPackage.Registry.INSTANCE.put(Express2ecorePackage.eNS_URI, Express2ecorePackage.eINSTANCE);
		// EPackage.Registry.INSTANCE.put(IFC2X3Package.eNS_URI, IFC2X3Package.eINSTANCE);

		// register resource factories
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("exp", new ExpressResourceFactoryImpl());
		// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMLResourceFactoryImpl());

		XMLResourceFactoryImpl fac = new XMLResourceFactoryImpl() {

			@Override
			public Resource createResource(URI uri) {
				XMLResource result = new XMLResourceImpl(uri) {
					@Override
					protected boolean useIDs() {
						return false;
					}
				};
				result.setEncoding("UTF-8");

				result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
				result.getDefaultSaveOptions().put(XMLResource.OPTION_LINE_WIDTH, 80);
				result.getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware());
				return result;
			}

		};
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fac);

		String traceUri = ifcFileURI.substring(0, ifcFileURI.replace("\\", "/").lastIndexOf("/") + 1) + "trace.xmi";
		String s3duri = stripPrefix(expFileURI);
		String[] args = { "-save", "-transformation", stripPrefix(transformation3dURI), "-source", stripPrefix(s3duri), "-target", stripPrefix(ifcFileURI), "-trace", stripPrefix(traceUri) };

		Main.main(args);

		String xmlContent = stringFromFile(new File(stripPrefix(ifcFileURI)));
		xmlContent = xmlContent.replace(stripPrefix(ifcFileURI), "");
		xmlContent = xmlContent.replace("eType=\"ecore:EDataType #//LOGICAL\"", "eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBooleanObject\"");
		stringToFile(new File(stripPrefix(ifcFileURI)), xmlContent);

		xmlContent = stringFromFile(new File(stripPrefix(traceUri)));
		xmlContent = xmlContent.replace(stripPrefix(ifcFileURI), "http://IFC2X3.ecore");
		xmlContent = xmlContent.replace(stripPrefix(expFileURI), "platform:/plugin/" + expFileURI.substring(expFileURI.indexOf("org.ifc4emf.metamodel.ifc")));
		xmlContent = xmlContent.replace(stripPrefix(transformation3dURI), new File(stripPrefix(transformation3dURI)).getName());
		stringToFile(new File(stripPrefix(traceUri)), xmlContent);
	}

	/**
	 * @param path
	 * @return the given path, quoted if it contains a space
	 */
	private static String quote(String path) {
		if (path.contains(" "))
			return "\"" + path + "\"";
		return path;
	}

	static final int prefixlength = "platform:/resource/org.ifc4emf.metamodel.ifc".length();

	private static String stripPrefix(String uri) throws URISyntaxException, IOException {
		if (uri.startsWith("platform:/resource/org.ifc4emf.metamodel.ifc")) {
			return IfcLoadHelper.getResourceFile(IFC2X3Package.class, uri.substring(prefixlength)).toURI().getPath();
		} else {
			return uri;
		}
	}

}
