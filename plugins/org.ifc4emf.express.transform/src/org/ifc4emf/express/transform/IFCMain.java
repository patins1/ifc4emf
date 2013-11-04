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


public class IFCMain {

	public static void main(String[] args) throws Exception {
		EXPRESS2ECOREMain.main(new String[] { "platform:/resource/org.ifc4emf.metamodel.ifc/model/IFC2X3_Final_Struct.exp", "platform:/resource/org.ifc4emf.metamodel.ifc/model/ifc2x3.ecore" });
	}
}
