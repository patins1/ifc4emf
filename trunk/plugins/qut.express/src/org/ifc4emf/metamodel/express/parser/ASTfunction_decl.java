/* Generated By:JJTree: Do not edit this line. ASTfunction_decl.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.ifc4emf.metamodel.express.parser;

public
@SuppressWarnings("all")
class ASTfunction_decl extends SimpleNode {
  public ASTfunction_decl(int id) {
    super(id);
  }

  public ASTfunction_decl(ExpressParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExpressParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=660e1b6a83a553e9424ac8e5fbe53bca (do not edit this line) */
