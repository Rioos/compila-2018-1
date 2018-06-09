package syntacticTree;

import parser.*;


public class UnaryNode extends ExpreNode {
    public ExpreNode expr;
    public Token not;

    public UnaryNode(Token t, ExpreNode e) {
        super(t);
        expr = e;
    }
    
    public UnaryNode(Token t, Token tn, ExpreNode e) {
      super(t);
      not = tn;
      expr = e;
  }
}
