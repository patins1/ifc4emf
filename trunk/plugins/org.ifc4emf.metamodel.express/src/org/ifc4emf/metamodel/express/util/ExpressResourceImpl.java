/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ifc4emf.metamodel.express.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.ifc4emf.metamodel.express.loader.ExpressLoader;
import org.ifc4emf.metamodel.express.parser.ASTsyntax;
import org.ifc4emf.metamodel.express.parser.ExpressParser;
import org.ifc4emf.metamodel.express.parser.ParseException;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.ifc4emf.metamodel.express.util.ExpressResourceFactoryImpl
 * @generated
 */
public class ExpressResourceImpl extends ResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public ExpressResourceImpl(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#doLoad(java.io.InputStream, java.util.Map)
	 */
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		try {
			ExpressParser parser = new ExpressParser(inputStream);
			ASTsyntax syntax = parser.syntax();
			ExpressLoader loader = new ExpressLoader(this);
			loader.load(syntax);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#doSave(java.io.OutputStream, java.util.Map)
	 */
	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		// TODO Auto-generated method stub
		super.doSave(outputStream, options);
	}

} //ExpressResourceImpl
