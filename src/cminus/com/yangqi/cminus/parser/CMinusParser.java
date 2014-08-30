// $ANTLR 3.5.1 ./com/yangqi/cminus/parser/CMinus.g 2013-11-23 14:51:09

package com.yangqi.cminus.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CMinusParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "CLOSE_BRACE", "COMMA", 
		"COMMENT", "DECLS", "DEF", "DEFUN", "DIGIT", "ENDL", "FUNCS", "ID", "INT", 
		"LETTER", "LPAREN", "NEGATE", "OPEN_BRACE", "PARAMS", "PROGRAM", "RPAREN", 
		"SEMI", "STRING_LITERAL", "TYPE", "WS", "'*'", "'+'", "'-'", "'/'", "'='", 
		"'return'"
	};
	public static final int EOF=-1;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int CALL=4;
	public static final int CLOSE_BRACE=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int DECLS=8;
	public static final int DEF=9;
	public static final int DEFUN=10;
	public static final int DIGIT=11;
	public static final int ENDL=12;
	public static final int FUNCS=13;
	public static final int ID=14;
	public static final int INT=15;
	public static final int LETTER=16;
	public static final int LPAREN=17;
	public static final int NEGATE=18;
	public static final int OPEN_BRACE=19;
	public static final int PARAMS=20;
	public static final int PROGRAM=21;
	public static final int RPAREN=22;
	public static final int SEMI=23;
	public static final int STRING_LITERAL=24;
	public static final int TYPE=25;
	public static final int WS=26;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CMinusParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CMinusParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CMinusParser.tokenNames; }
	@Override public String getGrammarFileName() { return "./com/yangqi/cminus/parser/CMinus.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// ./com/yangqi/cminus/parser/CMinus.g:31:1: program : ( declaration )* ( function )* EOF -> ^( PROGRAM ^( DECLS ( declaration )* ) ^( FUNCS ( function )* ) ) ;
	public final CMinusParser.program_return program() throws RecognitionException {
		CMinusParser.program_return retval = new CMinusParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope declaration1 =null;
		ParserRuleReturnScope function2 =null;

		Object EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:32:5: ( ( declaration )* ( function )* EOF -> ^( PROGRAM ^( DECLS ( declaration )* ) ^( FUNCS ( function )* ) ) )
			// ./com/yangqi/cminus/parser/CMinus.g:32:7: ( declaration )* ( function )* EOF
			{
			// ./com/yangqi/cminus/parser/CMinus.g:32:7: ( declaration )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==TYPE) ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1==ID) ) {
						int LA1_3 = input.LA(3);
						if ( (LA1_3==SEMI) ) {
							alt1=1;
						}

					}

				}

				switch (alt1) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:32:7: declaration
					{
					pushFollow(FOLLOW_declaration_in_program119);
					declaration1=declaration();
					state._fsp--;

					stream_declaration.add(declaration1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// ./com/yangqi/cminus/parser/CMinus.g:33:7: ( function )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==TYPE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:33:7: function
					{
					pushFollow(FOLLOW_function_in_program128);
					function2=function();
					state._fsp--;

					stream_function.add(function2.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program137);  
			stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: function, declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 35:5: -> ^( PROGRAM ^( DECLS ( declaration )* ) ^( FUNCS ( function )* ) )
			{
				// ./com/yangqi/cminus/parser/CMinus.g:35:8: ^( PROGRAM ^( DECLS ( declaration )* ) ^( FUNCS ( function )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// ./com/yangqi/cminus/parser/CMinus.g:35:18: ^( DECLS ( declaration )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLS, "DECLS"), root_2);
				// ./com/yangqi/cminus/parser/CMinus.g:35:26: ( declaration )*
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_2, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				adaptor.addChild(root_1, root_2);
				}

				// ./com/yangqi/cminus/parser/CMinus.g:35:40: ^( FUNCS ( function )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCS, "FUNCS"), root_2);
				// ./com/yangqi/cminus/parser/CMinus.g:35:48: ( function )*
				while ( stream_function.hasNext() ) {
					adaptor.addChild(root_2, stream_function.nextTree());
				}
				stream_function.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// ./com/yangqi/cminus/parser/CMinus.g:38:1: declaration : TYPE ID ';' -> ^( DEF TYPE ID ) ;
	public final CMinusParser.declaration_return declaration() throws RecognitionException {
		CMinusParser.declaration_return retval = new CMinusParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPE4=null;
		Token ID5=null;
		Token char_literal6=null;

		Object TYPE4_tree=null;
		Object ID5_tree=null;
		Object char_literal6_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:39:5: ( TYPE ID ';' -> ^( DEF TYPE ID ) )
			// ./com/yangqi/cminus/parser/CMinus.g:39:7: TYPE ID ';'
			{
			TYPE4=(Token)match(input,TYPE,FOLLOW_TYPE_in_declaration182);  
			stream_TYPE.add(TYPE4);

			ID5=(Token)match(input,ID,FOLLOW_ID_in_declaration184);  
			stream_ID.add(ID5);

			char_literal6=(Token)match(input,SEMI,FOLLOW_SEMI_in_declaration186);  
			stream_SEMI.add(char_literal6);

			// AST REWRITE
			// elements: ID, TYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 39:19: -> ^( DEF TYPE ID )
			{
				// ./com/yangqi/cminus/parser/CMinus.g:39:22: ^( DEF TYPE ID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEF, "DEF"), root_1);
				adaptor.addChild(root_1, stream_TYPE.nextNode());
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// ./com/yangqi/cminus/parser/CMinus.g:42:1: function : TYPE ID LPAREN ( paramList )? RPAREN OPEN_BRACE ( declaration )* ( stmt )* CLOSE_BRACE -> ^( DEFUN TYPE ID ^( PARAMS ( paramList )? ) ^( DECLS ( declaration )* ) ( stmt )* ) ;
	public final CMinusParser.function_return function() throws RecognitionException {
		CMinusParser.function_return retval = new CMinusParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPE7=null;
		Token ID8=null;
		Token LPAREN9=null;
		Token RPAREN11=null;
		Token OPEN_BRACE12=null;
		Token CLOSE_BRACE15=null;
		ParserRuleReturnScope paramList10 =null;
		ParserRuleReturnScope declaration13 =null;
		ParserRuleReturnScope stmt14 =null;

		Object TYPE7_tree=null;
		Object ID8_tree=null;
		Object LPAREN9_tree=null;
		Object RPAREN11_tree=null;
		Object OPEN_BRACE12_tree=null;
		Object CLOSE_BRACE15_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
		RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
		RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:43:5: ( TYPE ID LPAREN ( paramList )? RPAREN OPEN_BRACE ( declaration )* ( stmt )* CLOSE_BRACE -> ^( DEFUN TYPE ID ^( PARAMS ( paramList )? ) ^( DECLS ( declaration )* ) ( stmt )* ) )
			// ./com/yangqi/cminus/parser/CMinus.g:43:7: TYPE ID LPAREN ( paramList )? RPAREN OPEN_BRACE ( declaration )* ( stmt )* CLOSE_BRACE
			{
			TYPE7=(Token)match(input,TYPE,FOLLOW_TYPE_in_function217);  
			stream_TYPE.add(TYPE7);

			ID8=(Token)match(input,ID,FOLLOW_ID_in_function219);  
			stream_ID.add(ID8);

			LPAREN9=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function221);  
			stream_LPAREN.add(LPAREN9);

			// ./com/yangqi/cminus/parser/CMinus.g:43:22: ( paramList )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==TYPE) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:43:22: paramList
					{
					pushFollow(FOLLOW_paramList_in_function223);
					paramList10=paramList();
					state._fsp--;

					stream_paramList.add(paramList10.getTree());
					}
					break;

			}

			RPAREN11=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function226);  
			stream_RPAREN.add(RPAREN11);

			OPEN_BRACE12=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_function234);  
			stream_OPEN_BRACE.add(OPEN_BRACE12);

			// ./com/yangqi/cminus/parser/CMinus.g:45:7: ( declaration )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==TYPE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:45:7: declaration
					{
					pushFollow(FOLLOW_declaration_in_function242);
					declaration13=declaration();
					state._fsp--;

					stream_declaration.add(declaration13.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			// ./com/yangqi/cminus/parser/CMinus.g:46:7: ( stmt )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= ID && LA5_0 <= INT)||LA5_0==LPAREN||LA5_0==STRING_LITERAL||LA5_0==29||LA5_0==32) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:46:7: stmt
					{
					pushFollow(FOLLOW_stmt_in_function251);
					stmt14=stmt();
					state._fsp--;

					stream_stmt.add(stmt14.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			CLOSE_BRACE15=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_function260);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE15);

			// AST REWRITE
			// elements: paramList, declaration, ID, stmt, TYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 48:5: -> ^( DEFUN TYPE ID ^( PARAMS ( paramList )? ) ^( DECLS ( declaration )* ) ( stmt )* )
			{
				// ./com/yangqi/cminus/parser/CMinus.g:48:8: ^( DEFUN TYPE ID ^( PARAMS ( paramList )? ) ^( DECLS ( declaration )* ) ( stmt )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFUN, "DEFUN"), root_1);
				adaptor.addChild(root_1, stream_TYPE.nextNode());
				adaptor.addChild(root_1, stream_ID.nextNode());
				// ./com/yangqi/cminus/parser/CMinus.g:48:24: ^( PARAMS ( paramList )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
				// ./com/yangqi/cminus/parser/CMinus.g:48:33: ( paramList )?
				if ( stream_paramList.hasNext() ) {
					adaptor.addChild(root_2, stream_paramList.nextTree());
				}
				stream_paramList.reset();

				adaptor.addChild(root_1, root_2);
				}

				// ./com/yangqi/cminus/parser/CMinus.g:48:45: ^( DECLS ( declaration )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLS, "DECLS"), root_2);
				// ./com/yangqi/cminus/parser/CMinus.g:48:53: ( declaration )*
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_2, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				adaptor.addChild(root_1, root_2);
				}

				// ./com/yangqi/cminus/parser/CMinus.g:48:67: ( stmt )*
				while ( stream_stmt.hasNext() ) {
					adaptor.addChild(root_1, stream_stmt.nextTree());
				}
				stream_stmt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class stmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stmt"
	// ./com/yangqi/cminus/parser/CMinus.g:51:1: stmt : ( assignmentStmt | returnStmt | expression SEMI !);
	public final CMinusParser.stmt_return stmt() throws RecognitionException {
		CMinusParser.stmt_return retval = new CMinusParser.stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMI19=null;
		ParserRuleReturnScope assignmentStmt16 =null;
		ParserRuleReturnScope returnStmt17 =null;
		ParserRuleReturnScope expression18 =null;

		Object SEMI19_tree=null;

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:52:5: ( assignmentStmt | returnStmt | expression SEMI !)
			int alt6=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA6_1 = input.LA(2);
				if ( (LA6_1==31) ) {
					alt6=1;
				}
				else if ( (LA6_1==LPAREN||LA6_1==SEMI||(LA6_1 >= 27 && LA6_1 <= 30)) ) {
					alt6=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 32:
				{
				alt6=2;
				}
				break;
			case INT:
			case LPAREN:
			case STRING_LITERAL:
			case 29:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:52:7: assignmentStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignmentStmt_in_stmt309);
					assignmentStmt16=assignmentStmt();
					state._fsp--;

					adaptor.addChild(root_0, assignmentStmt16.getTree());

					}
					break;
				case 2 :
					// ./com/yangqi/cminus/parser/CMinus.g:53:7: returnStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_returnStmt_in_stmt317);
					returnStmt17=returnStmt();
					state._fsp--;

					adaptor.addChild(root_0, returnStmt17.getTree());

					}
					break;
				case 3 :
					// ./com/yangqi/cminus/parser/CMinus.g:54:7: expression SEMI !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_stmt325);
					expression18=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression18.getTree());

					SEMI19=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmt327); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stmt"


	public static class assignmentStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmentStmt"
	// ./com/yangqi/cminus/parser/CMinus.g:57:1: assignmentStmt : ID '=' ^ expression SEMI !;
	public final CMinusParser.assignmentStmt_return assignmentStmt() throws RecognitionException {
		CMinusParser.assignmentStmt_return retval = new CMinusParser.assignmentStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID20=null;
		Token char_literal21=null;
		Token SEMI23=null;
		ParserRuleReturnScope expression22 =null;

		Object ID20_tree=null;
		Object char_literal21_tree=null;
		Object SEMI23_tree=null;

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:58:5: ( ID '=' ^ expression SEMI !)
			// ./com/yangqi/cminus/parser/CMinus.g:58:7: ID '=' ^ expression SEMI !
			{
			root_0 = (Object)adaptor.nil();


			ID20=(Token)match(input,ID,FOLLOW_ID_in_assignmentStmt349); 
			ID20_tree = (Object)adaptor.create(ID20);
			adaptor.addChild(root_0, ID20_tree);

			char_literal21=(Token)match(input,31,FOLLOW_31_in_assignmentStmt351); 
			char_literal21_tree = (Object)adaptor.create(char_literal21);
			root_0 = (Object)adaptor.becomeRoot(char_literal21_tree, root_0);

			pushFollow(FOLLOW_expression_in_assignmentStmt354);
			expression22=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression22.getTree());

			SEMI23=(Token)match(input,SEMI,FOLLOW_SEMI_in_assignmentStmt356); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignmentStmt"


	public static class returnStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "returnStmt"
	// ./com/yangqi/cminus/parser/CMinus.g:61:1: returnStmt : 'return' ^ expression SEMI !;
	public final CMinusParser.returnStmt_return returnStmt() throws RecognitionException {
		CMinusParser.returnStmt_return retval = new CMinusParser.returnStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal24=null;
		Token SEMI26=null;
		ParserRuleReturnScope expression25 =null;

		Object string_literal24_tree=null;
		Object SEMI26_tree=null;

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:62:5: ( 'return' ^ expression SEMI !)
			// ./com/yangqi/cminus/parser/CMinus.g:62:7: 'return' ^ expression SEMI !
			{
			root_0 = (Object)adaptor.nil();


			string_literal24=(Token)match(input,32,FOLLOW_32_in_returnStmt378); 
			string_literal24_tree = (Object)adaptor.create(string_literal24);
			root_0 = (Object)adaptor.becomeRoot(string_literal24_tree, root_0);

			pushFollow(FOLLOW_expression_in_returnStmt381);
			expression25=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression25.getTree());

			SEMI26=(Token)match(input,SEMI,FOLLOW_SEMI_in_returnStmt383); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "returnStmt"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// ./com/yangqi/cminus/parser/CMinus.g:65:1: expression : addSubExpr ;
	public final CMinusParser.expression_return expression() throws RecognitionException {
		CMinusParser.expression_return retval = new CMinusParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope addSubExpr27 =null;


		try {
			// ./com/yangqi/cminus/parser/CMinus.g:66:5: ( addSubExpr )
			// ./com/yangqi/cminus/parser/CMinus.g:66:7: addSubExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addSubExpr_in_expression405);
			addSubExpr27=addSubExpr();
			state._fsp--;

			adaptor.addChild(root_0, addSubExpr27.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// ./com/yangqi/cminus/parser/CMinus.g:69:1: functionCall : ID LPAREN ( callList )? RPAREN -> ^( CALL ID ( callList )? ) ;
	public final CMinusParser.functionCall_return functionCall() throws RecognitionException {
		CMinusParser.functionCall_return retval = new CMinusParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID28=null;
		Token LPAREN29=null;
		Token RPAREN31=null;
		ParserRuleReturnScope callList30 =null;

		Object ID28_tree=null;
		Object LPAREN29_tree=null;
		Object RPAREN31_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_callList=new RewriteRuleSubtreeStream(adaptor,"rule callList");

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:70:5: ( ID LPAREN ( callList )? RPAREN -> ^( CALL ID ( callList )? ) )
			// ./com/yangqi/cminus/parser/CMinus.g:70:7: ID LPAREN ( callList )? RPAREN
			{
			ID28=(Token)match(input,ID,FOLLOW_ID_in_functionCall426);  
			stream_ID.add(ID28);

			LPAREN29=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionCall428);  
			stream_LPAREN.add(LPAREN29);

			// ./com/yangqi/cminus/parser/CMinus.g:70:17: ( callList )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= ID && LA7_0 <= INT)||LA7_0==LPAREN||LA7_0==STRING_LITERAL||LA7_0==29) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:70:17: callList
					{
					pushFollow(FOLLOW_callList_in_functionCall430);
					callList30=callList();
					state._fsp--;

					stream_callList.add(callList30.getTree());
					}
					break;

			}

			RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionCall433);  
			stream_RPAREN.add(RPAREN31);

			// AST REWRITE
			// elements: callList, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 70:34: -> ^( CALL ID ( callList )? )
			{
				// ./com/yangqi/cminus/parser/CMinus.g:70:37: ^( CALL ID ( callList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// ./com/yangqi/cminus/parser/CMinus.g:70:47: ( callList )?
				if ( stream_callList.hasNext() ) {
					adaptor.addChild(root_1, stream_callList.nextTree());
				}
				stream_callList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// ./com/yangqi/cminus/parser/CMinus.g:73:1: term : ( INT | STRING_LITERAL | functionCall | LPAREN ! expression RPAREN !| ID );
	public final CMinusParser.term_return term() throws RecognitionException {
		CMinusParser.term_return retval = new CMinusParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT32=null;
		Token STRING_LITERAL33=null;
		Token LPAREN35=null;
		Token RPAREN37=null;
		Token ID38=null;
		ParserRuleReturnScope functionCall34 =null;
		ParserRuleReturnScope expression36 =null;

		Object INT32_tree=null;
		Object STRING_LITERAL33_tree=null;
		Object LPAREN35_tree=null;
		Object RPAREN37_tree=null;
		Object ID38_tree=null;

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:74:5: ( INT | STRING_LITERAL | functionCall | LPAREN ! expression RPAREN !| ID )
			int alt8=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt8=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt8=2;
				}
				break;
			case ID:
				{
				int LA8_3 = input.LA(2);
				if ( (LA8_3==LPAREN) ) {
					alt8=3;
				}
				else if ( (LA8_3==COMMA||(LA8_3 >= RPAREN && LA8_3 <= SEMI)||(LA8_3 >= 27 && LA8_3 <= 30)) ) {
					alt8=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LPAREN:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:74:7: INT
					{
					root_0 = (Object)adaptor.nil();


					INT32=(Token)match(input,INT,FOLLOW_INT_in_term465); 
					INT32_tree = (Object)adaptor.create(INT32);
					adaptor.addChild(root_0, INT32_tree);

					}
					break;
				case 2 :
					// ./com/yangqi/cminus/parser/CMinus.g:75:7: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL33=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_term473); 
					STRING_LITERAL33_tree = (Object)adaptor.create(STRING_LITERAL33);
					adaptor.addChild(root_0, STRING_LITERAL33_tree);

					}
					break;
				case 3 :
					// ./com/yangqi/cminus/parser/CMinus.g:76:7: functionCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_term481);
					functionCall34=functionCall();
					state._fsp--;

					adaptor.addChild(root_0, functionCall34.getTree());

					}
					break;
				case 4 :
					// ./com/yangqi/cminus/parser/CMinus.g:77:7: LPAREN ! expression RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN35=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_term489); 
					pushFollow(FOLLOW_expression_in_term492);
					expression36=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression36.getTree());

					RPAREN37=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_term494); 
					}
					break;
				case 5 :
					// ./com/yangqi/cminus/parser/CMinus.g:78:7: ID
					{
					root_0 = (Object)adaptor.nil();


					ID38=(Token)match(input,ID,FOLLOW_ID_in_term503); 
					ID38_tree = (Object)adaptor.create(ID38);
					adaptor.addChild(root_0, ID38_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class negationExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "negationExpr"
	// ./com/yangqi/cminus/parser/CMinus.g:81:1: negationExpr : ( '-' term -> ^( NEGATE term ) | term );
	public final CMinusParser.negationExpr_return negationExpr() throws RecognitionException {
		CMinusParser.negationExpr_return retval = new CMinusParser.negationExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal39=null;
		ParserRuleReturnScope term40 =null;
		ParserRuleReturnScope term41 =null;

		Object char_literal39_tree=null;
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:82:5: ( '-' term -> ^( NEGATE term ) | term )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==29) ) {
				alt9=1;
			}
			else if ( ((LA9_0 >= ID && LA9_0 <= INT)||LA9_0==LPAREN||LA9_0==STRING_LITERAL) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:82:7: '-' term
					{
					char_literal39=(Token)match(input,29,FOLLOW_29_in_negationExpr524);  
					stream_29.add(char_literal39);

					pushFollow(FOLLOW_term_in_negationExpr526);
					term40=term();
					state._fsp--;

					stream_term.add(term40.getTree());
					// AST REWRITE
					// elements: term
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 82:16: -> ^( NEGATE term )
					{
						// ./com/yangqi/cminus/parser/CMinus.g:82:19: ^( NEGATE term )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEGATE, "NEGATE"), root_1);
						adaptor.addChild(root_1, stream_term.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// ./com/yangqi/cminus/parser/CMinus.g:83:7: term
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_term_in_negationExpr542);
					term41=term();
					state._fsp--;

					adaptor.addChild(root_0, term41.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "negationExpr"


	public static class multDivExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multDivExpr"
	// ./com/yangqi/cminus/parser/CMinus.g:86:1: multDivExpr : negationExpr ( ( '*' | '/' ) ^ negationExpr )? ;
	public final CMinusParser.multDivExpr_return multDivExpr() throws RecognitionException {
		CMinusParser.multDivExpr_return retval = new CMinusParser.multDivExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set43=null;
		ParserRuleReturnScope negationExpr42 =null;
		ParserRuleReturnScope negationExpr44 =null;

		Object set43_tree=null;

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:87:5: ( negationExpr ( ( '*' | '/' ) ^ negationExpr )? )
			// ./com/yangqi/cminus/parser/CMinus.g:87:7: negationExpr ( ( '*' | '/' ) ^ negationExpr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_negationExpr_in_multDivExpr563);
			negationExpr42=negationExpr();
			state._fsp--;

			adaptor.addChild(root_0, negationExpr42.getTree());

			// ./com/yangqi/cminus/parser/CMinus.g:87:20: ( ( '*' | '/' ) ^ negationExpr )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==27||LA10_0==30) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:87:21: ( '*' | '/' ) ^ negationExpr
					{
					set43=input.LT(1);
					set43=input.LT(1);
					if ( input.LA(1)==27||input.LA(1)==30 ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set43), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_negationExpr_in_multDivExpr573);
					negationExpr44=negationExpr();
					state._fsp--;

					adaptor.addChild(root_0, negationExpr44.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multDivExpr"


	public static class addSubExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addSubExpr"
	// ./com/yangqi/cminus/parser/CMinus.g:90:1: addSubExpr : multDivExpr ( ( '+' | '-' ) ^ multDivExpr )? ;
	public final CMinusParser.addSubExpr_return addSubExpr() throws RecognitionException {
		CMinusParser.addSubExpr_return retval = new CMinusParser.addSubExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set46=null;
		ParserRuleReturnScope multDivExpr45 =null;
		ParserRuleReturnScope multDivExpr47 =null;

		Object set46_tree=null;

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:91:5: ( multDivExpr ( ( '+' | '-' ) ^ multDivExpr )? )
			// ./com/yangqi/cminus/parser/CMinus.g:91:7: multDivExpr ( ( '+' | '-' ) ^ multDivExpr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multDivExpr_in_addSubExpr592);
			multDivExpr45=multDivExpr();
			state._fsp--;

			adaptor.addChild(root_0, multDivExpr45.getTree());

			// ./com/yangqi/cminus/parser/CMinus.g:91:19: ( ( '+' | '-' ) ^ multDivExpr )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( ((LA11_0 >= 28 && LA11_0 <= 29)) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:91:20: ( '+' | '-' ) ^ multDivExpr
					{
					set46=input.LT(1);
					set46=input.LT(1);
					if ( (input.LA(1) >= 28 && input.LA(1) <= 29) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set46), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multDivExpr_in_addSubExpr602);
					multDivExpr47=multDivExpr();
					state._fsp--;

					adaptor.addChild(root_0, multDivExpr47.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addSubExpr"


	public static class paramList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramList"
	// ./com/yangqi/cminus/parser/CMinus.g:94:1: paramList : TYPE ID ( COMMA TYPE ID )* -> ( ^( TYPE ID ) )+ ;
	public final CMinusParser.paramList_return paramList() throws RecognitionException {
		CMinusParser.paramList_return retval = new CMinusParser.paramList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPE48=null;
		Token ID49=null;
		Token COMMA50=null;
		Token TYPE51=null;
		Token ID52=null;

		Object TYPE48_tree=null;
		Object ID49_tree=null;
		Object COMMA50_tree=null;
		Object TYPE51_tree=null;
		Object ID52_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:95:5: ( TYPE ID ( COMMA TYPE ID )* -> ( ^( TYPE ID ) )+ )
			// ./com/yangqi/cminus/parser/CMinus.g:95:7: TYPE ID ( COMMA TYPE ID )*
			{
			TYPE48=(Token)match(input,TYPE,FOLLOW_TYPE_in_paramList625);  
			stream_TYPE.add(TYPE48);

			ID49=(Token)match(input,ID,FOLLOW_ID_in_paramList627);  
			stream_ID.add(ID49);

			// ./com/yangqi/cminus/parser/CMinus.g:95:15: ( COMMA TYPE ID )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:95:16: COMMA TYPE ID
					{
					COMMA50=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList630);  
					stream_COMMA.add(COMMA50);

					TYPE51=(Token)match(input,TYPE,FOLLOW_TYPE_in_paramList632);  
					stream_TYPE.add(TYPE51);

					ID52=(Token)match(input,ID,FOLLOW_ID_in_paramList634);  
					stream_ID.add(ID52);

					}
					break;

				default :
					break loop12;
				}
			}

			// AST REWRITE
			// elements: ID, TYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 95:32: -> ( ^( TYPE ID ) )+
			{
				if ( !(stream_ID.hasNext()||stream_TYPE.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_ID.hasNext()||stream_TYPE.hasNext() ) {
					// ./com/yangqi/cminus/parser/CMinus.g:95:35: ^( TYPE ID )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);
					adaptor.addChild(root_1, stream_ID.nextNode());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_ID.reset();
				stream_TYPE.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramList"


	public static class callList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callList"
	// ./com/yangqi/cminus/parser/CMinus.g:98:1: callList : expression ( COMMA expression )* -> ( expression )+ ;
	public final CMinusParser.callList_return callList() throws RecognitionException {
		CMinusParser.callList_return retval = new CMinusParser.callList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA54=null;
		ParserRuleReturnScope expression53 =null;
		ParserRuleReturnScope expression55 =null;

		Object COMMA54_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// ./com/yangqi/cminus/parser/CMinus.g:99:5: ( expression ( COMMA expression )* -> ( expression )+ )
			// ./com/yangqi/cminus/parser/CMinus.g:99:7: expression ( COMMA expression )*
			{
			pushFollow(FOLLOW_expression_in_callList662);
			expression53=expression();
			state._fsp--;

			stream_expression.add(expression53.getTree());
			// ./com/yangqi/cminus/parser/CMinus.g:99:18: ( COMMA expression )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:99:19: COMMA expression
					{
					COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_callList665);  
					stream_COMMA.add(COMMA54);

					pushFollow(FOLLOW_expression_in_callList667);
					expression55=expression();
					state._fsp--;

					stream_expression.add(expression55.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 99:38: -> ( expression )+
			{
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_0, stream_expression.nextTree());
				}
				stream_expression.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "callList"

	// Delegated rules



	public static final BitSet FOLLOW_declaration_in_program119 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_function_in_program128 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_EOF_in_program137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_declaration182 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_declaration184 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_SEMI_in_declaration186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_function217 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_function219 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LPAREN_in_function221 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_paramList_in_function223 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_RPAREN_in_function226 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_function234 = new BitSet(new long[]{0x000000012302C020L});
	public static final BitSet FOLLOW_declaration_in_function242 = new BitSet(new long[]{0x000000012302C020L});
	public static final BitSet FOLLOW_stmt_in_function251 = new BitSet(new long[]{0x000000012102C020L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_function260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentStmt_in_stmt309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStmt_in_stmt317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_stmt325 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_SEMI_in_stmt327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignmentStmt349 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_assignmentStmt351 = new BitSet(new long[]{0x000000002102C000L});
	public static final BitSet FOLLOW_expression_in_assignmentStmt354 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_SEMI_in_assignmentStmt356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_returnStmt378 = new BitSet(new long[]{0x000000002102C000L});
	public static final BitSet FOLLOW_expression_in_returnStmt381 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_SEMI_in_returnStmt383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addSubExpr_in_expression405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_functionCall426 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LPAREN_in_functionCall428 = new BitSet(new long[]{0x000000002142C000L});
	public static final BitSet FOLLOW_callList_in_functionCall430 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_RPAREN_in_functionCall433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_term465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_term473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_term481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_term489 = new BitSet(new long[]{0x000000002102C000L});
	public static final BitSet FOLLOW_expression_in_term492 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_RPAREN_in_term494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_term503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_negationExpr524 = new BitSet(new long[]{0x000000000102C000L});
	public static final BitSet FOLLOW_term_in_negationExpr526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_negationExpr542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_negationExpr_in_multDivExpr563 = new BitSet(new long[]{0x0000000048000002L});
	public static final BitSet FOLLOW_set_in_multDivExpr566 = new BitSet(new long[]{0x000000002102C000L});
	public static final BitSet FOLLOW_negationExpr_in_multDivExpr573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multDivExpr_in_addSubExpr592 = new BitSet(new long[]{0x0000000030000002L});
	public static final BitSet FOLLOW_set_in_addSubExpr595 = new BitSet(new long[]{0x000000002102C000L});
	public static final BitSet FOLLOW_multDivExpr_in_addSubExpr602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_paramList625 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_paramList627 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_paramList630 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_TYPE_in_paramList632 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_paramList634 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_expression_in_callList662 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_callList665 = new BitSet(new long[]{0x000000002102C000L});
	public static final BitSet FOLLOW_expression_in_callList667 = new BitSet(new long[]{0x0000000000000042L});
}
