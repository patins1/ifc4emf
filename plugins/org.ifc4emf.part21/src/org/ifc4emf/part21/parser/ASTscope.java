/* Generated By:JJTree: Do not edit this line. ASTscope.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.ifc4emf.part21.parser;

public
@SuppressWarnings("all")
class ASTscope extends SimpleNode {
  public ASTscope(int id) {
    super(id);
  }

  public ASTscope(ClearTextReader p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ClearTextReaderVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c2adff367aede32246bd0f6bb09ad71b (do not edit this line) */
