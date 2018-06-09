package syntacticTree;

import parser.*;

public class EqualtyNode extends ExpreNode {
	public ExpreNode expr1;
  public ExpreNode expr2;

  public EqualtyNode(Token t, ExpreNode e1, ExpreNode e2) {
      super(t);
      expr1 = e1;
      expr2 = e2;
  }
}
