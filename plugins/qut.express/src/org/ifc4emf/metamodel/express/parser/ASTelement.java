/* Generated By:JJTree: Do not edit this line. ASTelement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.ifc4emf.metamodel.express.parser;

public
@SuppressWarnings("all")
class ASTelement extends SimpleNode {
  public ASTelement(int id) {
    super(id);
  }

  public ASTelement(ExpressParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExpressParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=03a0b06bcafeb3f025c50edb38bfb695 (do not edit this line) */