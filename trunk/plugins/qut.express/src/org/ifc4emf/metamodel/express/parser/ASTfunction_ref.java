/* Generated By:JJTree: Do not edit this line. ASTfunction_ref.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.ifc4emf.metamodel.express.parser;

public
@SuppressWarnings("all")
class ASTfunction_ref extends SimpleNode {
  public ASTfunction_ref(int id) {
    super(id);
  }

  public ASTfunction_ref(ExpressParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExpressParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=79ce5599b6dea49fac96af0c224e3a8c (do not edit this line) */
