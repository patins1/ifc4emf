/* Generated By:JJTree: Do not edit this line. ASTfactor.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.ifc4emf.metamodel.express.parser;

public
@SuppressWarnings("all")
class ASTfactor extends SimpleNode {
  public ASTfactor(int id) {
    super(id);
  }

  public ASTfactor(ExpressParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExpressParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=1743eca846e2b868ec76fe84c0debcd6 (do not edit this line) */