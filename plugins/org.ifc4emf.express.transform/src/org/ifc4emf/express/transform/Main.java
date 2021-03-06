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

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.ifc4emf.metamodel.trace.impl.TracePackageImpl;

import tefkat.config.TefkatConfig.Configuration;
import tefkat.config.TefkatConfig.Model;
import tefkat.config.TefkatConfig.TransformationTask;
import tefkat.config.TefkatConfig.impl.TefkatConfigPackageImpl;
import tefkat.engine.Binding;
import tefkat.engine.ExtentUtil;
import tefkat.engine.Node;
import tefkat.engine.ResolutionException;
import tefkat.engine.Tefkat;
import tefkat.engine.TefkatListenerAdapter;
import tefkat.engine.view.ResourceSetModel;
import tefkat.engine.view.ResourceView;
import tefkat.model.ContainerExtent;
import tefkat.model.Extent;
import tefkat.model.PatternUse;
import tefkat.model.Query;
import tefkat.model.ReferenceExtent;
import tefkat.model.SourceTerm;
import tefkat.model.TRule;
import tefkat.model.TefkatException;
import tefkat.model.TefkatFactory;
import tefkat.model.Term;
import tefkat.model.Transformation;
import tefkat.model.Var;
import tefkat.model.internal.ModelUtils;
import tefkat.model.parser.TefkatLexer;
import tefkat.model.parser.TefkatParser;
import tefkat.model.parser.TefkatResourceFactory;
import antlr.RecognitionException;
import antlr.TokenStreamException;
import antlr.TokenStreamHiddenTokenFilter;
import antlr.debug.MessageAdapter;
import antlr.debug.MessageEvent;


/**
 * @author lawley
 * 
 */
public class Main {

    private static final int DELAY = 1;

    private static final TefkatResourceFactory TEFKAT_RESOURCE_FACTORY = new TefkatResourceFactory();
    
    private static final Resource.Factory XMI_RESOURCE_FACTORY = new XMIResourceFactoryImpl();

    private static boolean quiet = false;

    private static boolean force = false;
    
    private static boolean visualize = false;

    private static boolean layout = false;

    private static ResourceSetModel model;

    private static ResourceView graph;

    public static Resource trace;

    private static void usage(String message) {
        System.err.println(message);
        System.err.println("usage: tefkat [-quiet] [-debug] [-force] [-fixpoint] [-statistics] [-save] [-layout] [-vis mtsT] [-mapURI from to]*");
        System.err.println("\t[-conf configURI | -transformation mappingURI");
        System.err.println("\t[-source srcURI | -sourceVar var=srcURI]* [-target targetURI]* [-trace traceURI]]");
        System.exit(1);
    }
    
    public static void main(String[] args) {
        boolean mapVis = false, targetVis = false, sourceVis = false, traceVis = false;
        boolean queryMode = false;
        boolean debugger = false;
        String configURI = null;
        String transformationURI = null;
        List sourceURIs = new ArrayList();
        List targetURIs = new ArrayList();
        String traceURI = null;
        boolean saveResult = false;
        JFrame frame = null;
        
        final Tefkat engine = new Tefkat();
        engine.addTefkatListener(new TefkatListenerAdapter() {

            public void resourceLoaded(Resource res) {
                if (!quiet) {
                    System.err.println("Loaded " + res.getURI());
                }
                displayDiagnostics("Warning", res.getWarnings());
                final List<Diagnostic> errors = res.getErrors();
                displayDiagnostics("Error", errors);
                if (errors.size() > 0) {
                    System.exit(-1);
                }
            }

            private void displayDiagnostics(final String prefix, final List<Diagnostic> errors) {
                for (final Iterator<Diagnostic> itr = errors.iterator(); itr.hasNext(); ) {
                    final Diagnostic e = itr.next();
                    System.err.println(prefix + ": (" + e.getLine() + ", " + e.getColumn() + ") " + e.getMessage());
                }
            }
            
            public void info(String message) {
                if (!quiet) {
                    System.err.println("Info: " + message);
                }
            }
            
            public void warning(String message) {
                System.err.println("Warn: " + message);
            }
            
            public void error(String message, Throwable cause) {
                if (cause instanceof RuntimeException) {
                    cause.printStackTrace();
                } else {
                    System.err.println("Error: " + message);
                    for (StackTraceElement elt: cause.getStackTrace()) {
                        if (elt.getClassName().startsWith("tefkat")) {
                            System.err.println("  at " + elt);
//                            break;
                        }
                    }
                }
            }

        });
        
        ResourceSet rs = engine.getResourceSet();
        Map URIMap = rs.getURIConverter().getURIMap();
        Map parameters = new HashMap();

        for (int i = 0; i < args.length; i++) {

            if (args[i].equals("-query")) {
                queryMode = true;
            } else if (args[i].equals("-layout")) {
                layout = true;
            } else if (args[i].equals("-debug")) {
                debugger = true;
            } else if (args[i].equals("-force")) {
                force = true;
            } else if (args[i].equals("-quiet")) {
                quiet = true;
            } else if (args[i].equals("-fixpoint")) {
                engine.setIncremental(false);
            } else if (args[i].equals("-statistics")) {
                engine.setPrintingStats(true);
            } else if (args[i].equals("-save")) {
                saveResult = true;
            } else if (args[i].equals("-vis")) {
                visualize = true;
                i += 1;
                for (int j = 0; j < args[i].length(); j++) {
                    char c = args[i].charAt(j);
                    switch (c) {
                    case 'm':
                        mapVis = true;
                        break;
                    case 's':
                        sourceVis = true;
                        break;
                    case 't':
                        targetVis = true;
                        break;
                    case 'T':
                        traceVis = true;
                        break;
                    default:
                        usage("Unknown flag for visualisation: " + c);
                    }
                }
            } else if (args[i].equals("-mapURI")) {
                URI uri1 = URI.createURI(args[i+1]);
                URI uri2 = URI.createURI(args[i+2]);
                URIMap.put(uri1, uri2);
                URIConverter.URI_MAP.put(uri1, uri2);
                i += 2;
            } else if (args[i].equals("-conf")) {
                i += 1;
                configURI = args[i];
            } else if (args[i].equals("-transformation")) {
                i += 1;
                transformationURI = args[i];
            } else if (args[i].equals("-source")) {
                i += 1;
                sourceURIs.add(args[i]);
            } else if (args[i].equals("-sourceVar")) {
                i += 1;
                int idx = args[i].indexOf("=");
                String var = args[i].substring(0, idx);
                String uri = args[i].substring(idx+1);
                parameters.put(var, uri);
            } else if (args[i].equals("-target")) {
                i += 1;
                targetURIs.add(args[i]);
            } else if (args[i].equals("-trace")) {
                i += 1;
                traceURI = args[i];
            } else if (args[i].equals("-converter")) {
                i += 1;
            } else {
                usage("Unknown flag: " + args[i]);
            }
        }
        
        TefkatConfigPackageImpl.init();
        TracePackageImpl.init();
        
        engine.registerFactory("qvt", TEFKAT_RESOURCE_FACTORY);
//        engine.registerFactory("*", XMI_RESOURCE_FACTORY);

        EcoreResourceFactoryImpl fac = new EcoreResourceFactoryImpl() {

			  @Override
			  public Resource createResource(URI uri)
			  {
			    XMLResource result = 
			      new XMLResourceImpl(uri)
			      {
			        @Override
			        protected boolean useIDs()
			        {
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
		
        try {
            
            if (debugger) {
                System.err.println("debugging mode");
                createDebuggerListener(engine);
            }
            
            if (configURI != null) {
                if (visualize) {
                    frame = createUI(rs, new ArrayList(0), layout);
                    createVisualisationListener(engine, mapVis, sourceVis, targetVis, traceVis);
                }

                Resource config = rs.getResource(URI.createURI(configURI), true);
                for (Iterator configItr = config.getContents().iterator(); configItr.hasNext(); ) {
                    Object obj = configItr.next();
                    if (obj instanceof Configuration) {
                    	Configuration configuration = (Configuration) obj;
                    	for (Iterator pkgClsItr = configuration.getPackageClasses().iterator(); pkgClsItr.hasNext(); ) {
                    		String pkgClsName = (String) pkgClsItr.next();
                    		Class pkgClass = Class.forName(pkgClsName);
                    		pkgClass.getDeclaredField("eINSTANCE").get(null);
                    	}
                        for (Iterator transItr = configuration.getTransformationTasks().iterator(); transItr.hasNext(); ) {
                            TransformationTask task = (TransformationTask) transItr.next();

                            if (task.isEnabled()) {
                                // override trace URI
                                if (null != traceURI) {
                                    task.getTrace().setLocationUri(traceURI);
                                }
                                // override target URIs
                                if (targetURIs.size() > 0) {
                                    List targets = task.getTargetModels();
                                    for (int i = 0; i < targets.size(); i++) {
                                        ((Model) targets.get(i)).setLocationUri((String) targetURIs.get(i));
                                    }
                                }
                                engine.transform(task, saveResult, force);
                            }
                        }
                    } else {
                        System.err.println("Warning: " + obj + " is not a Configuration instance.");
                    }
                }
            } else if (queryMode) {
                ReferenceExtent extent = TefkatFactory.eINSTANCE.createReferenceExtent();
                List extentResources = extent.getResources();

//                    for (Iterator itr = parameters.entrySet().iterator(); itr.hasNext(); ) {
//                        Map.Entry entry = (Map.Entry) itr.next();
//                        URI uri = URI.createURI((String) entry.getValue());
//                        entry.setValue(rs.getResource(uri, true));
//                    }
                for (Iterator itr = sourceURIs.iterator(); itr.hasNext(); ) {
                    URI uri = URI.createURI((String) itr.next());
                    extentResources.add(rs.getResource(uri, true));
                }
                
                Query query = TefkatFactory.eINSTANCE.createQuery();
                query.setName("");
                Var srcExtent = TefkatFactory.eINSTANCE.createVar();
                srcExtent.setName("Source");

                Resource r = rs.createResource(URI.createURI("query"));
                r.getContents().add(query);

                Binding context = new Binding();
                context.add(srcExtent, extent);

                final Map packageNameMap = new HashMap();

                System.out.println("Global packages: " + Registry.INSTANCE.keySet());
                System.out.println("Local packages: " + rs.getPackageRegistry().keySet());

                ModelUtils.buildPackageNameMaps(Registry.INSTANCE.values(), packageNameMap, "global");
                ModelUtils.buildPackageNameMaps(rs.getPackageRegistry().values(), packageNameMap, "locate");

                // loop until EOF
                boolean done;
                do {
                    try {
                        done = readAndEvalQuery(engine, query, srcExtent, context, packageNameMap);
                    } catch (ResolutionException e) {
                        System.err.println(e);
                        done = false;
                    } catch (RecognitionException e) {
                        System.err.println(e);
                        done = false;
                    } catch (TokenStreamException e) {
                        System.err.println(e);
                        done = false;
                    }
                } while (!done);

            } else {
                if (transformationURI == null) {
                    usage("Must specify a config URI or a transformation URI");
                }
                Resource transformation = rs.getResource(URI.createURI(transformationURI), true);
                int j;
                for (Iterator itr = parameters.entrySet().iterator(); itr.hasNext(); ) {
                    Map.Entry entry = (Map.Entry) itr.next();
                    URI uri = URI.createURI((String) entry.getValue());
                    entry.setValue(rs.getResource(uri, true));
                }
                Resource[] srcs = new Resource[sourceURIs.size()];
                j = 0;
                for (Iterator itr = sourceURIs.iterator(); itr.hasNext(); j++) {
                    URI uri = URI.createURI((String) itr.next());
                    srcs[j] = rs.getResource(uri, true);
                }
                Resource[] tgts = new Resource[targetURIs.size()];
                j = 0;
                for (Iterator itr = targetURIs.iterator(); itr.hasNext(); j++) {
                    URI uri = URI.createURI((String) itr.next());
                    tgts[j] = rs.createResource(uri);
                }
                trace = null;
                if (traceURI != null) {
                    trace = rs.createResource(URI.createURI(traceURI));
                }

                if (visualize) {
                    List resList = new ArrayList();
                    if (mapVis) {
                        resList.add(transformation);
                    }
                    if (sourceVis) {
                        resList.addAll(Arrays.asList(srcs));
                    }
                    if (targetVis) {
                        resList.addAll(Arrays.asList(tgts));
                    }
                    if (traceVis) {
                        resList.add(trace);
                    }

                    frame = createUI(engine.getResourceSet(), resList, layout);
                    createVisualisationListener(engine, mapVis, sourceVis, targetVis, traceVis);
                }

                System.out.println("transforming...");
                engine.transform(transformation, parameters, srcs, tgts, trace, false);
                if (saveResult) {
                    Map options = new HashMap();
                    options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
                    options.put(XMLResource.OPTION_EXTENDED_META_DATA, ExtendedMetaData.INSTANCE);
                    for (int i = 0; i < tgts.length; i++) {
                        setObjectIds(tgts[i]);
						tgts[i].save(options);
                    }
		    if (null != trace) {
                        setObjectIds(trace);
			trace.save(options);
		    }
                }
                System.out.println("...done");
            }

            if (visualize) {
                final JFrame theFrame = frame;
                // Be thread-safe
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        theFrame.repaint();
                    }
                });
                Thread.sleep(5000);
            }

        } catch (ResolutionException e) {
        } catch (Throwable t) {
            t.printStackTrace();
//        } finally {
//             System.exit(0);
        }

    }

	private static JFrame createUI(ResourceSet rs, List resList, boolean layout2) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean readAndEvalQuery(final Tefkat engine, final Query query, final Var srcExtent, final Binding context, final Map namespace) throws RecognitionException, TokenStreamException, ResolutionException, TefkatException, IOException {
        System.out.println("Enter query:");
        
        final StringBuilder sb = new StringBuilder();
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Need to preserve EOL in input since parsing of NAMESPACE/IMPORT depends on it :(
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
            final String trim = line.trim();
            if (trim.endsWith(";") || trim.startsWith("NAMESPACE")) {
                break;
            }
        }
        
        TefkatLexer lexer = new TefkatLexer(new StringReader(sb.toString()));
        // use nonstandard token object
        lexer.setTokenObjectClass("antlr.CommonHiddenStreamToken");
        // create the filter
        TokenStreamHiddenTokenFilter filter = new TokenStreamHiddenTokenFilter(lexer);

        // hide not discard
        filter.hide(TefkatParser.COMMENT);
        filter.hide(TefkatParser.WS);

        TefkatParser parser = new TefkatParser(filter);
        parser.addMessageListener(new MessageAdapter() {
            public void reportError(MessageEvent e) {
                System.err.println("parser error: " + e);
            }

            public void reportWarning(MessageEvent e) {
                System.err.println("parser warning: " + e);
            }
            
        });
        
        parser.trackingMap.putAll(namespace);
        
        query.getVars().clear();
        query.getParameterVar().clear();
        query.getVars().add(srcExtent);
        
        SourceTerm stmt = parser.queryStatement(query, srcExtent);
        if (null != stmt) {
            query.setTerm(stmt);

            Collection<Binding> answers = engine.evaluateQuery(context, query);

            if (null != answers) {
                for (Binding b: answers) {
                    System.out.println(b);
                }
                System.out.println(answers.size() + " results.");
            } else {
                System.out.println("No.");
            }
        }
        
        namespace.putAll(parser.trackingMap);
        
        return sb.length() == 0 && null == line;
    }

    /**
     * Sets the XMI IDs of the objects and avoids duplicates in the XMIResource
     * @param res
     */
    private static void setObjectIds(Resource res) {
        if (res instanceof XMLResource) {
        	XMLResource xres = (XMLResource) res;
            Object[] roots = xres.getContents().toArray();
            for (int i = roots.length - 1; i >= 0; i--) {
                EObject obj = (EObject) roots[i];
                
                fixObjectId(xres, obj);
            }
        }
    }

    private static void fixObjectId(XMLResource xres, EObject obj) {
        // Set XMI ID if not already set
        if (null == xres.getID(obj) && xres instanceof XMIResource) {
            xres.setID(obj, String.valueOf(obj.hashCode()));
        }
        // remove direct containment for things that are transitively contained
        if (null != obj.eContainer()) {
            xres.getContents().remove(obj);
        }
        Object[] children = obj.eContents().toArray();
        for (int i = children.length - 1; i >= 0; i--) {
            fixObjectId(xres, (EObject) children[i]);
        }
    }
    
    /**
     * @param engine
     */
    private static void createDebuggerListener(final Tefkat engine) {
        engine.addTefkatListener(new TefkatListenerAdapter() {
            
            int depth = 0;

            public void started() {
                engine.pause();
            }
            
            public void suspended() {
                try {
                    int c;
                    do {
                        c = System.in.read();
                    } while (c >= 0 && c != '\n');
                        
                    if (c < 0) {
                        engine.setInterrupted(true);
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                engine.step();
            }
            
            public void enterTerm(Node node) {
                depth++;
                indent(depth, '>');
                System.err.print(" " + node.selectedLiteral() + " ? ");
            }

            public void exitTerm(Node node) {
                System.err.println(node.getBindings());
                indent(depth, '<');
                System.err.println(" " + !node.isFailure());
                depth--;
            }

            public void delayTerm(Node node) {
                System.err.println(node.getBindings());
                indent(depth, '-');
                System.err.println(" delayed");
                depth--;
            }
            
            private void indent(int n, char c) {
                for (int i = 0; i < n; i++) {
                    System.err.print(c);
                }
            }

        });
    }

    /**
     * @param engine
     */
    private static void createVisualisationListener(Tefkat engine, final boolean mapVis, final boolean sourceVis, final boolean targetVis, final boolean traceVis) {
        engine.addTefkatListener(new TefkatListenerAdapter() {

            public void resourceLoaded(Resource res) {
                System.err.println("Loaded " + res.getURI());
            }
            
            public void transformationStarted(Transformation transformation, Extent[] srcs, Extent[] tgts, Extent trace, Binding context) {
                if (mapVis) {
                    model.addResource(transformation.eResource());
                }
                if (sourceVis) {
                    for (int i = 0; i < srcs.length; i++) {
                    	if (srcs[i] instanceof ContainerExtent) {
                    		model.addResource(((ContainerExtent) srcs[i]).getResource());
                    	} else {
                    		for (Iterator itr = ((ReferenceExtent) srcs[i]).getResources().iterator(); itr.hasNext(); ) {
                    			model.addResource((Resource) itr.next());
                    		}
                    	}
                    }
                }
                if (targetVis) {
                    for (int i = 0; i < tgts.length; i++) {
                    	if (tgts[i] instanceof ContainerExtent) {
                    		model.addResource(((ContainerExtent) tgts[i]).getResource());
                    	} else {
                    		for (Iterator itr = ((ReferenceExtent) tgts[i]).getResources().iterator(); itr.hasNext(); ) {
                    			model.addResource((Resource) itr.next());
                    		}
                    	}
                    }
                }
                if (traceVis) {
                	if (trace instanceof ContainerExtent) {
                		model.addResource(((ContainerExtent) trace).getResource());
                	} else {
                		for (Iterator itr = ((ReferenceExtent) trace).getResources().iterator(); itr.hasNext(); ) {
                			model.addResource((Resource) itr.next());
                		}
                	}
                }
            }

            public void evaluateRule(TRule rule, Binding context, boolean cached) {
                if (mapVis) {
                    ExtentUtil.highlightNode(rule, ExtentUtil.RULE_EVAL);
                }
            }

            public void enterTerm(Node node) {
                if (mapVis) {
                    Term term = node.selectedLiteral();
                    if (term instanceof PatternUse) {
                        ExtentUtil.highlightNode(((PatternUse) term)
                                .getDefn(), ExtentUtil.TERM_ENTER);
                    }
                    ExtentUtil.highlightNode(term, ExtentUtil.TERM_ENTER);
                }
            }

            public void exitTerm(Node node) {
                if (mapVis) {
                    Term term = node.selectedLiteral();
                    if (term instanceof PatternUse) {
                        ExtentUtil.highlightNode(((PatternUse) term)
                                .getDefn(), ExtentUtil.TERM_EXIT);
                    }
                    ExtentUtil.highlightNode(term, ExtentUtil.TERM_EXIT);
                }
            }

            public void delayTerm(Node node) {
                if (mapVis) {
                    Term term = node.selectedLiteral();
                    if (term instanceof PatternUse) {
                        ExtentUtil.highlightNode(((PatternUse) term).getDefn(), ExtentUtil.TERM_DELAY);
                    }
                    ExtentUtil.highlightNode(term, ExtentUtil.TERM_DELAY);
                }
            }

        });
    }


}
