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

import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.metamodel.modelblob.ContainmentTreeNode;
import org.ifc4emf.metamodel.modelblob.ModelblobFactory;

/**
 * This refinement of {@link ContainmentTreeHelper} should be used when indices' ordering is mainly monotone, so that a caching effect of the binary tree nodes can be used. This refinement can also be used when the model iterator shall iterate monotonically increasing over the indices.
 */
public class ContainmentTreeOrderedByNumberHelper extends ContainmentTreeHelper {

	public ContainmentTreeOrderedByNumberHelper(Model model) {
		super(model);
	}

	private int mirror(int id) {
		return Integer.rotateRight(Integer.reverse(id), 32 - root.getDepth());
	}

	protected ContainmentTreeNode addNode(int id) {
		int depth = 32 - Integer.numberOfLeadingZeros(id);
		depth = 31;
		if (depth > root.getDepth()) {
			for (int i = root.getDepth(); i < depth; i++) {
				ContainmentTreeNode branch0 = ModelblobFactory.eINSTANCE.createContainmentTreeNode();
				// copy references
				branch0.setContent(root.getContent());
				branch0.setBranch0(root.getBranch0());
				branch0.setBranch1(root.getBranch1());
				// update branch 0
				root.setBranch0(branch0);
			}
			root.setDepth(depth);
		}
		return super.addNode(mirror(id));
	}

	public EObject get(int id) {
		return super.get(mirror(id));
	}

	@Override
	public int get(EObject eObj, Part21LoadHelper helper) {
		return mirror(super.get(eObj, helper));
	}

	@Override
	public boolean orderedByNumber() {
		return true;
	}

	/**
	 * Optimise the "random" approach by selecting high ID numbers only. This has the advantages:
	 * <ul>
	 * <li>new IFC content has higher IDs then parsed IFC content
	 * <li>the tree path has many inner nodes already in database
	 * </ul>
	 */
	@Override
	public int getAvailableId() {
		ContainmentTreeNode currentBranch = root;
		while (true) {
			ContainmentTreeNode nextBranch = currentBranch.getBranch1();
			if (nextBranch == null) {
				if (currentBranch.getContent() != null)
					break;
				nextBranch = currentBranch.getBranch0();
				if (nextBranch == null)
					break;
			}
			currentBranch = nextBranch;
		}
		int result = mirror(get(currentBranch));
		// reuse if no content is defined
		if (currentBranch.getContent() != null)
			result++;
		if (get(result) != null)
			throw new RuntimeException("ID " + result + " is already used!");
		return result;
	}

}
