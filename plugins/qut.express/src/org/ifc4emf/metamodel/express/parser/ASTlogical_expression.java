/* Generated By:JJTree: Do not edit this line. ASTlogical_expression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.ifc4emf.metamodel.express.parser;

public
@SuppressWarnings("all")
class ASTlogical_expression extends SimpleNode {
  public ASTlogical_expression(int id) {
    super(id);
  }

  public ASTlogical_expression(ExpressParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExpressParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=46bdac97c3574287ac78fc5e7c4185c7 (do not edit this line) */
