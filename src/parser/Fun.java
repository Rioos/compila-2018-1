/* Fun.java */
/* Generated By:JavaCC: Do not edit this line. Fun.java */
package parser;
import java.io.*;

public class Fun implements FunConstants {
  final static String Version ="X++ Compiler - version 1.0 - 2018\u005cn";
  boolean menosShort = false;

  public static void main(String args []) throws ParseException {
        String filename ="";
    Fun parser;
    int i;
    boolean ms = false;

        System.out.println(Version);
        // le os parametros passados para o compilador
        for (i = 0; i<args.length - 1; i++) {
          if (args[i].toLowerCase().equals("-short"))
          ms = true;
          else {
            System.out.println("Usase is: java Fun [-short] inputfile");
            System.exit(0);
          }

        }

        if(args[i].equals("-")) {
          // le a entrada - padrao
          System.out.println("Reading standart input...");
          parser = new Fun(System.in);
        }
        else {
          // le o arquivo
          filename = args[args.length-1];
          System.out.println("Reading from file " + filename + "...");
          try {
            parser = new Fun(new java.io.FileInputStream(filename));
          }
          catch (java.io.FileNotFoundException e) {
            System.out.println("File " + filename + " not found.");
            return;
          }
        }


        parser.menosShort = ms;
        parser.program(); //chama o metodo que faz a analise

        // verifica se houve erro lexico
        if (parser.token_source.foundLexError() != 0) {
          System.out.println(parser.token_source.foundLexError() + " lexical errors found");
        }
        else {
          System.out.println("Program successfully analized");
        } // main
}
  public static String im (int x) {
    int k;
    String s;
    s = tokenImage[x];
    k = s.lastIndexOf("\u005c"");
    try { s = s.substring(1,k); }
    catch (StringIndexOutOfBoundsException e)
    { }
    return s;
  }

  final public void paramlist() throws ParseException {
    trace_call("paramlist");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INT:
      case STRING:
      case FLOAT:
      case CHAR:
      case BOOLEAN:
      case IDENT:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INT:{
          jj_consume_token(INT);
          break;
          }
        case STRING:{
          jj_consume_token(STRING);
          break;
          }
        case CHAR:{
          jj_consume_token(CHAR);
          break;
          }
        case BOOLEAN:{
          jj_consume_token(BOOLEAN);
          break;
          }
        case FLOAT:{
          jj_consume_token(FLOAT);
          break;
          }
        case IDENT:{
          jj_consume_token(IDENT);
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        jj_consume_token(IDENT);
        label_1:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case LBRACKET:{
            ;
            break;
            }
          default:
            jj_la1[1] = jj_gen;
            break label_1;
          }
          jj_consume_token(LBRACKET);
          jj_consume_token(RBRACKET);
        }
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case COMMA:{
            ;
            break;
            }
          default:
            jj_la1[2] = jj_gen;
            break label_2;
          }
          jj_consume_token(COMMA);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case INT:{
            jj_consume_token(INT);
            break;
            }
          case STRING:{
            jj_consume_token(STRING);
            break;
            }
          case CHAR:{
            jj_consume_token(CHAR);
            break;
            }
          case BOOLEAN:{
            jj_consume_token(BOOLEAN);
            break;
            }
          case FLOAT:{
            jj_consume_token(FLOAT);
            break;
            }
          case IDENT:{
            jj_consume_token(IDENT);
            break;
            }
          default:
            jj_la1[3] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          jj_consume_token(IDENT);
          label_3:
          while (true) {
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case LBRACKET:{
              ;
              break;
              }
            default:
              jj_la1[4] = jj_gen;
              break label_3;
            }
            jj_consume_token(LBRACKET);
            jj_consume_token(RBRACKET);
          }
        }
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        ;
      }
    } finally {
      trace_return("paramlist");
    }
  }

  final public void vardecl() throws ParseException {
    trace_call("vardecl");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INT:{
        jj_consume_token(INT);
        break;
        }
      case STRING:{
        jj_consume_token(STRING);
        break;
        }
      case CHAR:{
        jj_consume_token(CHAR);
        break;
        }
      case BOOLEAN:{
        jj_consume_token(BOOLEAN);
        break;
        }
      case FLOAT:{
        jj_consume_token(FLOAT);
        break;
        }
      case IDENT:{
        jj_consume_token(IDENT);
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(IDENT);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:{
          ;
          break;
          }
        default:
          jj_la1[7] = jj_gen;
          break label_4;
        }
        jj_consume_token(LBRACKET);
        jj_consume_token(RBRACKET);
      }
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          ;
          break;
          }
        default:
          jj_la1[8] = jj_gen;
          break label_5;
        }
        jj_consume_token(COMMA);
        jj_consume_token(IDENT);
        label_6:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case LBRACKET:{
            ;
            break;
            }
          default:
            jj_la1[9] = jj_gen;
            break label_6;
          }
          jj_consume_token(LBRACKET);
          jj_consume_token(RBRACKET);
        }
      }
    } finally {
      trace_return("vardecl");
    }
  }

  final public void factor() throws ParseException {
    trace_call("factor");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case int_constant:{
        jj_consume_token(int_constant);
        break;
        }
      case string_constant:{
        jj_consume_token(string_constant);
        break;
        }
      case char_constant:{
        jj_consume_token(char_constant);
        break;
        }
      case null_constant:{
        jj_consume_token(null_constant);
        break;
        }
      case boolean_constant:{
        jj_consume_token(boolean_constant);
        break;
        }
      case float_constant:{
        jj_consume_token(float_constant);
        break;
        }
      case IDENT:{
        lvalue();
        break;
        }
      case LPAREN:{
        jj_consume_token(LPAREN);
        expression();
        jj_consume_token(RPAREN);
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("factor");
    }
  }

  final public void unaryexpr() throws ParseException {
    trace_call("unaryexpr");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NOT:{
        jj_consume_token(NOT);
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PLUS:{
          jj_consume_token(PLUS);
          break;
          }
        case MINUS:{
          jj_consume_token(MINUS);
          break;
          }
        default:
          jj_la1[12] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        ;
      }
      factor();
    } finally {
      trace_return("unaryexpr");
    }
  }

  final public void term() throws ParseException {
    trace_call("term");
    try {
      unaryexpr();
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MULTIPLY:
        case DIVIDE:
        case REM:{
          ;
          break;
          }
        default:
          jj_la1[14] = jj_gen;
          break label_7;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MULTIPLY:{
          jj_consume_token(MULTIPLY);
          break;
          }
        case DIVIDE:{
          jj_consume_token(DIVIDE);
          break;
          }
        case REM:{
          jj_consume_token(REM);
          break;
          }
        default:
          jj_la1[15] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        unaryexpr();
      }
    } finally {
      trace_return("term");
    }
  }

  final public void numexpr() throws ParseException {
    trace_call("numexpr");
    try {
      term();
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PLUS:
        case MINUS:{
          ;
          break;
          }
        default:
          jj_la1[16] = jj_gen;
          break label_8;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PLUS:{
          jj_consume_token(PLUS);
          break;
          }
        case MINUS:{
          jj_consume_token(MINUS);
          break;
          }
        default:
          jj_la1[17] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        term();
      }
    } finally {
      trace_return("numexpr");
    }
  }

  final public void equalityExpression() throws ParseException {
    trace_call("equalityExpression");
    try {
      numexpr();
      label_9:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case GT:
        case LT:
        case EQ:
        case LE:
        case GE:
        case NEQ:{
          ;
          break;
          }
        default:
          jj_la1[18] = jj_gen;
          break label_9;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LT:{
          jj_consume_token(LT);
          break;
          }
        case GT:{
          jj_consume_token(GT);
          break;
          }
        case LE:{
          jj_consume_token(LE);
          break;
          }
        case GE:{
          jj_consume_token(GE);
          break;
          }
        case EQ:{
          jj_consume_token(EQ);
          break;
          }
        case NEQ:{
          jj_consume_token(NEQ);
          break;
          }
        default:
          jj_la1[19] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        numexpr();
      }
    } finally {
      trace_return("equalityExpression");
    }
  }

  final public void condANDexpression() throws ParseException {
    trace_call("condANDexpression");
    try {
      equalityExpression();
      label_10:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case AND:{
          ;
          break;
          }
        default:
          jj_la1[20] = jj_gen;
          break label_10;
        }
        jj_consume_token(AND);
        equalityExpression();
      }
    } finally {
      trace_return("condANDexpression");
    }
  }

  final public void condORexpression() throws ParseException {
    trace_call("condORexpression");
    try {
      condANDexpression();
      label_11:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case XOR:
        case OR:{
          ;
          break;
          }
        default:
          jj_la1[21] = jj_gen;
          break label_11;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case OR:{
          jj_consume_token(OR);
          break;
          }
        case XOR:{
          jj_consume_token(XOR);
          break;
          }
        default:
          jj_la1[22] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        condANDexpression();
      }
    } finally {
      trace_return("condORexpression");
    }
  }

  final public void expression() throws ParseException {
    trace_call("expression");
    try {
      condORexpression();
    } finally {
      trace_return("expression");
    }
  }

  final public void alocexpression() throws ParseException {
    trace_call("alocexpression");
    try {
      jj_consume_token(NEW);
      if (jj_2_1(2)) {
        jj_consume_token(IDENT);
        jj_consume_token(LPAREN);
        arglist();
        jj_consume_token(RPAREN);
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INT:
        case STRING:
        case FLOAT:
        case CHAR:
        case BOOLEAN:
        case IDENT:{
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case INT:{
            jj_consume_token(INT);
            break;
            }
          case STRING:{
            jj_consume_token(STRING);
            break;
            }
          case CHAR:{
            jj_consume_token(CHAR);
            break;
            }
          case BOOLEAN:{
            jj_consume_token(BOOLEAN);
            break;
            }
          case FLOAT:{
            jj_consume_token(FLOAT);
            break;
            }
          case IDENT:{
            jj_consume_token(IDENT);
            break;
            }
          default:
            jj_la1[23] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          label_12:
          while (true) {
            jj_consume_token(RBRACKET);
            expression();
            jj_consume_token(LBRACKET);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case RBRACKET:{
              ;
              break;
              }
            default:
              jj_la1[24] = jj_gen;
              break label_12;
            }
          }
          break;
          }
        default:
          jj_la1[25] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } finally {
      trace_return("alocexpression");
    }
  }

  final public void lvalue() throws ParseException {
    trace_call("lvalue");
    try {
      jj_consume_token(IDENT);
      label_13:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:
        case DOT:{
          ;
          break;
          }
        default:
          jj_la1[26] = jj_gen;
          break label_13;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:{
          jj_consume_token(LBRACKET);
          expression();
          jj_consume_token(RBRACKET);
          break;
          }
        case DOT:{
          jj_consume_token(DOT);
          jj_consume_token(IDENT);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case LPAREN:{
            jj_consume_token(LPAREN);
            arglist();
            jj_consume_token(RPAREN);
            break;
            }
          default:
            jj_la1[27] = jj_gen;
            ;
          }
          break;
          }
        default:
          jj_la1[28] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } finally {
      trace_return("lvalue");
    }
  }

  final public void atribstat() throws ParseException {
    trace_call("atribstat");
    try {
      lvalue();
      jj_consume_token(ASSIGN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NEW:{
        alocexpression();
        break;
        }
      case PLUS:
      case MINUS:
      case NOT:
      case LPAREN:
      case int_constant:
      case string_constant:
      case char_constant:
      case float_constant:
      case boolean_constant:
      case null_constant:
      case IDENT:{
        expression();
        break;
        }
      default:
        jj_la1[29] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("atribstat");
    }
  }

  final public void printstat() throws ParseException {
    trace_call("printstat");
    try {
      jj_consume_token(PRINT);
      expression();
    } finally {
      trace_return("printstat");
    }
  }

  final public void readstat() throws ParseException {
    trace_call("readstat");
    try {
      jj_consume_token(READ);
      lvalue();
    } finally {
      trace_return("readstat");
    }
  }

  final public void returnstat() throws ParseException {
    trace_call("returnstat");
    try {
      jj_consume_token(RETURN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:
      case NOT:
      case LPAREN:
      case int_constant:
      case string_constant:
      case char_constant:
      case float_constant:
      case boolean_constant:
      case null_constant:
      case IDENT:{
        expression();
        break;
        }
      default:
        jj_la1[30] = jj_gen;
        ;
      }
    } finally {
      trace_return("returnstat");
    }
  }

  final public void superstat() throws ParseException {
    trace_call("superstat");
    try {
      jj_consume_token(SUPER);
      jj_consume_token(LPAREN);
      arglist();
      jj_consume_token(RPAREN);
    } finally {
      trace_return("superstat");
    }
  }

  final public void statement() throws ParseException {
    trace_call("statement");
    try {
      if (jj_2_2(2)) {
        vardecl();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PRINT:{
          printstat();
          jj_consume_token(SEMICOLON);
          break;
          }
        case IDENT:{
          atribstat();
          jj_consume_token(SEMICOLON);
          break;
          }
        case READ:{
          readstat();
          jj_consume_token(SEMICOLON);
          break;
          }
        case RETURN:{
          returnstat();
          jj_consume_token(SEMICOLON);
          break;
          }
        case SUPER:{
          superstat();
          jj_consume_token(SEMICOLON);
          break;
          }
        case IF:{
          ifstat();
          break;
          }
        case FOR:{
          forstat();
          break;
          }
        case LBRACE:{
          jj_consume_token(LBRACE);
          statlist();
          jj_consume_token(RBRACE);
          break;
          }
        case BREAK:{
          jj_consume_token(BREAK);
          jj_consume_token(SEMICOLON);
          break;
          }
        case SEMICOLON:{
          jj_consume_token(SEMICOLON);
          break;
          }
        default:
          jj_la1[31] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } finally {
      trace_return("statement");
    }
  }

  final public void methodbody() throws ParseException {
    trace_call("methodbody");
    try {
      jj_consume_token(LPAREN);
      paramlist();
      jj_consume_token(RPAREN);
      statement();
    } finally {
      trace_return("methodbody");
    }
  }

  final public void methoddecl() throws ParseException {
    trace_call("methoddecl");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INT:{
        jj_consume_token(INT);
        break;
        }
      case STRING:{
        jj_consume_token(STRING);
        break;
        }
      case CHAR:{
        jj_consume_token(CHAR);
        break;
        }
      case BOOLEAN:{
        jj_consume_token(BOOLEAN);
        break;
        }
      case FLOAT:{
        jj_consume_token(FLOAT);
        break;
        }
      case IDENT:{
        jj_consume_token(IDENT);
        break;
        }
      default:
        jj_la1[32] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_14:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:{
          ;
          break;
          }
        default:
          jj_la1[33] = jj_gen;
          break label_14;
        }
        jj_consume_token(LBRACKET);
        jj_consume_token(RBRACKET);
      }
      jj_consume_token(IDENT);
      methodbody();
    } finally {
      trace_return("methoddecl");
    }
  }

  final public void constructdecl() throws ParseException {
    trace_call("constructdecl");
    try {
      jj_consume_token(CONSTRUCTOR);
      methodbody();
    } finally {
      trace_return("constructdecl");
    }
  }

  final public void classbody() throws ParseException {
    trace_call("classbody");
    try {
      jj_consume_token(LBRACE);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CLASS:{
        classlist();
        break;
        }
      default:
        jj_la1[34] = jj_gen;
        ;
      }
      label_15:
      while (true) {
        if (jj_2_3(3)) {
          ;
        } else {
          break label_15;
        }
        vardecl();
        jj_consume_token(SEMICOLON);
      }
      label_16:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CONSTRUCTOR:{
          ;
          break;
          }
        default:
          jj_la1[35] = jj_gen;
          break label_16;
        }
        constructdecl();
      }
      label_17:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INT:
        case STRING:
        case FLOAT:
        case CHAR:
        case BOOLEAN:
        case IDENT:{
          ;
          break;
          }
        default:
          jj_la1[36] = jj_gen;
          break label_17;
        }
        methoddecl();
      }
      jj_consume_token(RBRACE);
    } finally {
      trace_return("classbody");
    }
  }

  final public void classdecl() throws ParseException {
    trace_call("classdecl");
    try {
      jj_consume_token(CLASS);
      jj_consume_token(IDENT);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case EXTENDS:{
        jj_consume_token(EXTENDS);
        jj_consume_token(IDENT);
        break;
        }
      default:
        jj_la1[37] = jj_gen;
        ;
      }
      classbody();
    } finally {
      trace_return("classdecl");
    }
  }

  final public void ifstat() throws ParseException {
    trace_call("ifstat");
    try {
      jj_consume_token(IF);
      jj_consume_token(LPAREN);
      expression();
      jj_consume_token(RPAREN);
      statement();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ELSE:{
        jj_consume_token(ELSE);
        statement();
        break;
        }
      default:
        jj_la1[38] = jj_gen;
        ;
      }
    } finally {
      trace_return("ifstat");
    }
  }

  final public void forstat() throws ParseException {
    trace_call("forstat");
    try {
      jj_consume_token(FOR);
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENT:{
        atribstat();
        break;
        }
      default:
        jj_la1[39] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:
      case NOT:
      case LPAREN:
      case int_constant:
      case string_constant:
      case char_constant:
      case float_constant:
      case boolean_constant:
      case null_constant:
      case IDENT:{
        expression();
        break;
        }
      default:
        jj_la1[40] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENT:{
        atribstat();
        break;
        }
      default:
        jj_la1[41] = jj_gen;
        ;
      }
      jj_consume_token(RPAREN);
      statement();
    } finally {
      trace_return("forstat");
    }
  }

  final public void statlist() throws ParseException {
    trace_call("statlist");
    try {
      statement();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BREAK:
      case FOR:
      case IF:
      case INT:
      case PRINT:
      case READ:
      case RETURN:
      case STRING:
      case SUPER:
      case FLOAT:
      case CHAR:
      case BOOLEAN:
      case LBRACE:
      case SEMICOLON:
      case IDENT:{
        statlist();
        break;
        }
      default:
        jj_la1[42] = jj_gen;
        ;
      }
    } finally {
      trace_return("statlist");
    }
  }

  final public void classlist() throws ParseException {
    trace_call("classlist");
    try {
      classdecl();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CLASS:{
        classlist();
        break;
        }
      default:
        jj_la1[43] = jj_gen;
        ;
      }
    } finally {
      trace_return("classlist");
    }
  }

  final public void arglist() throws ParseException {
    trace_call("arglist");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:
      case NOT:
      case LPAREN:
      case int_constant:
      case string_constant:
      case char_constant:
      case float_constant:
      case boolean_constant:
      case null_constant:
      case IDENT:{
        expression();
        label_18:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case COMMA:{
            ;
            break;
            }
          default:
            jj_la1[44] = jj_gen;
            break label_18;
          }
          jj_consume_token(COMMA);
          expression();
        }
        break;
        }
      default:
        jj_la1[45] = jj_gen;
        ;
      }
    } finally {
      trace_return("arglist");
    }
  }

  final public void program() throws ParseException {
    trace_call("program");
    try {
      classdecl();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CLASS:{
        classlist();
        break;
        }
      default:
        jj_la1[46] = jj_gen;
        ;
      }
    } finally {
      trace_return("program");
    }
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_3_3()
 {
    if (jj_3R_19()) return true;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_21()
 {
    if (jj_scan_token(COMMA)) return true;
    return false;
  }

  private boolean jj_3R_19()
 {
    if (!jj_rescan) trace_call("vardecl(LOOKING AHEAD...)");
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(13)) {
    jj_scanpos = xsp;
    if (jj_scan_token(18)) {
    jj_scanpos = xsp;
    if (jj_scan_token(21)) {
    jj_scanpos = xsp;
    if (jj_scan_token(22)) {
    jj_scanpos = xsp;
    if (jj_scan_token(20)) {
    jj_scanpos = xsp;
    if (jj_scan_token(54)) { if (!jj_rescan) trace_return("vardecl(LOOKAHEAD FAILED)"); return true; }
    }
    }
    }
    }
    }
    if (jj_scan_token(IDENT)) { if (!jj_rescan) trace_return("vardecl(LOOKAHEAD FAILED)"); return true; }
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_20()) { jj_scanpos = xsp; break; }
    }
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_21()) { jj_scanpos = xsp; break; }
    }
    { if (!jj_rescan) trace_return("vardecl(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  private boolean jj_3_2()
 {
    if (jj_3R_19()) return true;
    return false;
  }

  private boolean jj_3R_20()
 {
    if (jj_scan_token(LBRACKET)) return true;
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_scan_token(IDENT)) return true;
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public FunTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[47];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x742000,0x0,0x0,0x742000,0x0,0x742000,0x742000,0x0,0x0,0x0,0x0,0x0,0x1800000,0x1800000,0xe000000,0xe000000,0x1800000,0x1800000,0xe0000000,0xe0000000,0x0,0x0,0x0,0x742000,0x0,0x742000,0x0,0x0,0x0,0x1804000,0x1800000,0xb9840,0x742000,0x0,0x80,0x100,0x742000,0x400,0x200,0x0,0x1800000,0x0,0x7fb840,0x80,0x0,0x1800000,0x80,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x400000,0x800,0x4000,0x400000,0x800,0x400000,0x400000,0x800,0x4000,0x800,0x7f0080,0x8,0x0,0x0,0x0,0x0,0x0,0x0,0x7,0x7,0x10,0x60,0x60,0x400000,0x1000,0x400000,0x8800,0x80,0x8800,0x7f0088,0x7f0088,0x402200,0x400000,0x800,0x0,0x0,0x400000,0x0,0x0,0x400000,0x7f0088,0x400000,0x402200,0x0,0x4000,0x7f0088,0x0,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[3];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Fun(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Fun(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new FunTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Fun(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new FunTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Fun(FunTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(FunTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      trace_token(token, "");
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    } else {
      trace_scan(jj_scanpos, kind);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
      trace_token(token, " (in getNextToken)");
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[66];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 47; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 66; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  private int trace_indent = 0;
  private boolean trace_enabled = true;

/** Enable tracing. */
  final public void enable_tracing() {
    trace_enabled = true;
  }

/** Disable tracing. */
  final public void disable_tracing() {
    trace_enabled = false;
  }

  private void trace_call(String s) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Call:   " + s);
    }
    trace_indent = trace_indent + 2;
  }

  private void trace_return(String s) {
    trace_indent = trace_indent - 2;
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Return: " + s);
    }
  }

  private void trace_token(Token t, String where) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Consumed token: <" + tokenImage[t.kind]);
      if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
        System.out.print(": \"" + t.image + "\"");
      }
      System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
    }
  }

  private void trace_scan(Token t1, int t2) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Visited token: <" + tokenImage[t1.kind]);
      if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
        System.out.print(": \"" + t1.image + "\"");
      }
      System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
    }
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 3; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
