/* Generated By:JJTree&JavaCC: Do not edit this line. ClearTextReader.java */
package org.ifc4emf.part21.parser;

import java.io.*;
import java.util.*;

import org.ifc4emf.part21.loader.ImmediateConsumer;

@SuppressWarnings("all")
public class ClearTextReader/*@bgen(jjtree)*/implements ClearTextReaderTreeConstants, ClearTextReaderConstants {/*@bgen(jjtree)*/
  protected JJTClearTextReaderState jjtree = new JJTClearTextReaderState();
    public ImmediateConsumer immediateConsumer;

    void jjtreeOpenNodeScope(Node n)
    {
    }
    void jjtreeCloseNodeScope(Node n)
    {
       if (immediateConsumer!=null && immediateConsumer.consume(n))
       {
         jjtree.popNode();
       }
    }


        public static void main(String args[])
        {

           ClearTextReader parser;

                if (args.length == 0)
                {
                        System.out.println("ClearTextReader:  Reading from standard input . . .");
                        parser = new ClearTextReader(System.in);
                }
                else if (args.length == 1)
                {
                        System.out.println("ClearTextReader:  Reading from file " + args[0] + " . . .");
                        try
                        {
                                parser = new ClearTextReader(new java.io.FileInputStream(args[0]));
                        }
                        catch (java.io.FileNotFoundException e)
                        {
                                System.out.println("Express Parser:  File " + args[0] + " not found.");
                                return;
                        }
                }
                else
                {
                        System.out.println("ClearTextReader:  Usage is one of:");
                        System.out.println("         java ClearTextReader < inputfile");
                        System.out.println("OR");
                        System.out.println("         java ClearTextReader inputfile");
                        return;
                }
                try
                {
                        parser.syntax();
                        System.out.println("ClearTextReader: source parsed successfully.");

                }
                catch (ParseException e)
                {
                        System.out.println(e.getMessage());
                        System.out.println("ClearTextReader:  Encountered errors during parse.");
                }
        }

/************************************************
 * Grammar
 ***********************************************/
  final public void exchange_file() throws ParseException {
                        /*@bgen(jjtree) exchange_file */
  ASTexchange_file jjtn000 = new ASTexchange_file(JJTEXCHANGE_FILE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      jj_consume_token(50);
      header_section();
      data_section();
      jj_consume_token(51);
    } catch (Throwable jjte000) {
     if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
       jjtreeCloseNodeScope(jjtn000);
     }
    }
  }

  final public void header_section() throws ParseException {
                         /*@bgen(jjtree) header_section */
  ASTheader_section jjtn000 = new ASTheader_section(JJTHEADER_SECTION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      jj_consume_token(52);
      header_entity();
      header_entity();
      header_entity();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case KEYWORD:
        header_entity_list();
        break;
      default:
        jj_la1[0] = jj_gen;
        ;
      }
      jj_consume_token(53);
    } catch (Throwable jjte000) {
     if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
       jjtreeCloseNodeScope(jjtn000);
     }
    }
  }

  final public void header_entity_list() throws ParseException {
                             /*@bgen(jjtree) header_entity_list */
  ASTheader_entity_list jjtn000 = new ASTheader_entity_list(JJTHEADER_ENTITY_LIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      header_entity();
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case KEYWORD:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_1;
        }
        header_entity();
      }
    } catch (Throwable jjte000) {
     if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
       jjtreeCloseNodeScope(jjtn000);
     }
    }
  }

  final public void header_entity() throws ParseException {
                        /*@bgen(jjtree) header_entity */
  ASTheader_entity jjtn000 = new ASTheader_entity(JJTHEADER_ENTITY);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      jj_consume_token(KEYWORD);
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAREN:
      case DOLLAR:
      case STAR:
      case INTEGER:
      case KEYWORD:
      case REAL:
      case STRING:
      case ENTITY_INSTANCE_NAME:
      case ENUMERATION:
      case BINARY:
        parameter_list();
        break;
      default:
        jj_la1[2] = jj_gen;
        ;
      }
      jj_consume_token(RPAREN);
      jj_consume_token(SEMICOLON);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
      jjtreeCloseNodeScope(jjtn000);
    }
    }
  }

  final public void parameter_list() throws ParseException {
    parameter();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
      jj_consume_token(COMMA);
      parameter();
    }
  }

  final public void parameter() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case KEYWORD:
      typed_parameter();
      break;
    case LPAREN:
    case DOLLAR:
    case INTEGER:
    case REAL:
    case STRING:
    case ENTITY_INSTANCE_NAME:
    case ENUMERATION:
    case BINARY:
      untyped_parameter();
      break;
    case STAR:
      omitted_parameter();
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void typed_parameter() throws ParseException {
                          /*@bgen(jjtree) typed_parameter */
                          ASTtyped_parameter jjtn000 = new ASTtyped_parameter(JJTTYPED_PARAMETER);
                          boolean jjtc000 = true;
                          jjtree.openNodeScope(jjtn000);
                          jjtreeOpenNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(KEYWORD);
      jj_consume_token(LPAREN);
      parameter();
      jj_consume_token(RPAREN);
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    jjtreeCloseNodeScope(jjtn000);
    jjtn000.jjtSetValue(t.image);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
      jjtreeCloseNodeScope(jjtn000);
    }
    }
  }

  final public void untyped_parameter() throws ParseException {
                            /*@bgen(jjtree) untyped_parameter */
                            ASTuntyped_parameter jjtn000 = new ASTuntyped_parameter(JJTUNTYPED_PARAMETER);
                            boolean jjtc000 = true;
                            jjtree.openNodeScope(jjtn000);
                            jjtreeOpenNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DOLLAR:
        t = jj_consume_token(DOLLAR);
      jjtree.closeNodeScope(jjtn000, true);
      jjtc000 = false;
      jjtreeCloseNodeScope(jjtn000);
      //jjtThis.jjtSetValue(t.image);
      jjtn000.jjtSetValue(UnsetParameter.instance());
        break;
      case INTEGER:
        t = jj_consume_token(INTEGER);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
      jjtn000.jjtSetValue(Integer.parseInt(t.image));
        break;
      case REAL:
        t = jj_consume_token(REAL);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
      jjtn000.jjtSetValue(Double.parseDouble(t.image));
        break;
      case STRING:
        t = jj_consume_token(STRING);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
      jjtn000.jjtSetValue(t.image.substring(1,t.image.length()-1));
        break;
      case ENTITY_INSTANCE_NAME:
        t = jj_consume_token(ENTITY_INSTANCE_NAME);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
      jjtn000.jjtSetValue(new ObjectReference(Integer.valueOf(t.image.substring(1))));
        break;
      case ENUMERATION:
        t = jj_consume_token(ENUMERATION);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
      jjtn000.jjtSetValue(new EnumValue(t.image.substring(1,t.image.length()-1)));
        break;
      case BINARY:
        t = jj_consume_token(BINARY);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
      //jjtThis.jjtSetValue(t.image);
      {if (true) throw new ParseException("Binaries not yet handled: " + t.image);}
        break;
      case LPAREN:
        list();
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
        jjtreeCloseNodeScope(jjtn000);
      }
    }
  }

  final public void omitted_parameter() throws ParseException {
                            /*@bgen(jjtree) omitted_parameter */
  ASTomitted_parameter jjtn000 = new ASTomitted_parameter(JJTOMITTED_PARAMETER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      jj_consume_token(STAR);
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
      jjtreeCloseNodeScope(jjtn000);
    }
    }
  }

  final public void list() throws ParseException {
               /*@bgen(jjtree) list */
  ASTlist jjtn000 = new ASTlist(JJTLIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAREN:
      case DOLLAR:
      case STAR:
      case INTEGER:
      case KEYWORD:
      case REAL:
      case STRING:
      case ENTITY_INSTANCE_NAME:
      case ENUMERATION:
      case BINARY:
        parameter();
        label_3:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case COMMA:
            ;
            break;
          default:
            jj_la1[6] = jj_gen;
            break label_3;
          }
          jj_consume_token(COMMA);
          parameter();
        }
        break;
      default:
        jj_la1[7] = jj_gen;
        ;
      }
      jj_consume_token(RPAREN);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
      jjtreeCloseNodeScope(jjtn000);
    }
    }
  }

  final public void data_section() throws ParseException {
                       /*@bgen(jjtree) data_section */
  ASTdata_section jjtn000 = new ASTdata_section(JJTDATA_SECTION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      jj_consume_token(54);
      entity_instance_list();
      jj_consume_token(53);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
      jjtreeCloseNodeScope(jjtn000);
    }
    }
  }

  final public void entity_instance_list() throws ParseException {
                               /*@bgen(jjtree) entity_instance_list */
  ASTentity_instance_list jjtn000 = new ASTentity_instance_list(JJTENTITY_INSTANCE_LIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      entity_instance();
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ENTITY_INSTANCE_NAME:
          ;
          break;
        default:
          jj_la1[8] = jj_gen;
          break label_4;
        }
        entity_instance();
      }
    } catch (Throwable jjte000) {
     if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
       jjtreeCloseNodeScope(jjtn000);
     }
    }
  }

  final public void entity_instance() throws ParseException {
                          /*@bgen(jjtree) entity_instance */
                           ASTentity_instance jjtn000 = new ASTentity_instance(JJTENTITY_INSTANCE);
                           boolean jjtc000 = true;
                           jjtree.openNodeScope(jjtn000);
                           jjtreeOpenNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ENTITY_INSTANCE_NAME);
    jjtn000.jjtSetValue(t.image);
      jj_consume_token(EQ);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 55:
        scope();
        break;
      default:
        jj_la1[9] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAREN:
        subsuper_record();
        break;
      case KEYWORD:
        simple_record();
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(SEMICOLON);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
      jjtreeCloseNodeScope(jjtn000);
    }
    }
  }

  final public void scope() throws ParseException {
                /*@bgen(jjtree) scope */
  ASTscope jjtn000 = new ASTscope(JJTSCOPE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      jj_consume_token(55);
      entity_instance_list();
      jj_consume_token(56);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SLASH:
        export_list();
        break;
      default:
        jj_la1[11] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
      jjtreeCloseNodeScope(jjtn000);
    }
    }
  }

  final public void export_list() throws ParseException {
                      /*@bgen(jjtree) export_list */
  ASTexport_list jjtn000 = new ASTexport_list(JJTEXPORT_LIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      jj_consume_token(SLASH);
      jj_consume_token(ENTITY_INSTANCE_NAME);
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
          break label_5;
        }
        jj_consume_token(COMMA);
        jj_consume_token(ENTITY_INSTANCE_NAME);
      }
      jj_consume_token(SLASH);
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
      jjtreeCloseNodeScope(jjtn000);
    }
    }
  }

  final public void simple_record() throws ParseException {
                        /*@bgen(jjtree) simple_record */
                         ASTsimple_record jjtn000 = new ASTsimple_record(JJTSIMPLE_RECORD);
                         boolean jjtc000 = true;
                         jjtree.openNodeScope(jjtn000);
                         jjtreeOpenNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(KEYWORD);
    jjtn000.jjtSetValue(t.image);
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAREN:
      case DOLLAR:
      case STAR:
      case INTEGER:
      case KEYWORD:
      case REAL:
      case STRING:
      case ENTITY_INSTANCE_NAME:
      case ENUMERATION:
      case BINARY:
        parameter_list();
        break;
      default:
        jj_la1[13] = jj_gen;
        ;
      }
      jj_consume_token(RPAREN);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
      jjtreeCloseNodeScope(jjtn000);
    }
    }
  }

  final public void subsuper_record() throws ParseException {
                          /*@bgen(jjtree) subsuper_record */
  ASTsubsuper_record jjtn000 = new ASTsubsuper_record(JJTSUBSUPER_RECORD);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      jj_consume_token(LPAREN);
      simple_record_list();
      jj_consume_token(RPAREN);
    } catch (Throwable jjte000) {
     if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
       jjtreeCloseNodeScope(jjtn000);
     }
    }
  }

  final public void simple_record_list() throws ParseException {
                             /*@bgen(jjtree) simple_record_list */
  ASTsimple_record_list jjtn000 = new ASTsimple_record_list(JJTSIMPLE_RECORD_LIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      simple_record();
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case KEYWORD:
          ;
          break;
        default:
          jj_la1[14] = jj_gen;
          break label_6;
        }
        simple_record();
      }
    } catch (Throwable jjte000) {
     if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
       jjtreeCloseNodeScope(jjtn000);
     }
    }
  }

  final public ASTsyntax syntax() throws ParseException {
                      /*@bgen(jjtree) syntax */
  ASTsyntax jjtn000 = new ASTsyntax(JJTSYNTAX);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      exchange_file();
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
          {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
      jjtreeCloseNodeScope(jjtn000);
    }
    }
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public ClearTextReaderTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[15];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x400000,0x400000,0x746c0080,0x8000,0x746c0080,0x74240080,0x8000,0x746c0080,0x20000000,0x0,0x400080,0x100000,0x8000,0x746c0080,0x400000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x1,0x0,0x1,0x1,0x0,0x1,0x0,0x800000,0x0,0x0,0x0,0x1,0x0,};
   }

  /** Constructor with InputStream. */
  public ClearTextReader(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ClearTextReader(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ClearTextReaderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
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
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ClearTextReader(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ClearTextReaderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ClearTextReader(ClearTextReaderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ClearTextReaderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
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

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[57];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 15; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 57; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

          // end main

}