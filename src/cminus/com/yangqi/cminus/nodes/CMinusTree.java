// $ANTLR 3.5.1 ./com/yangqi/cminus/nodes/CMinusTree.g 2013-11-23 14:51:08

package com.yangqi.cminus.nodes;
import com.yangqi.cminus.parser.*;

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class CMinusTree extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public CMinusTree(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public CMinusTree(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CMinusTree.tokenNames; }
	@Override public String getGrammarFileName() { return "./com/yangqi/cminus/nodes/CMinusTree.g"; }


	public static class program_return extends TreeRuleReturnScope {
		public CMinusProgram rv;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// ./com/yangqi/cminus/nodes/CMinusTree.g:19:1: program returns [CMinusProgram rv] : ^( PROGRAM declarations functions ) ;
	public final CMinusTree.program_return program() throws RecognitionException {
		CMinusTree.program_return retval = new CMinusTree.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree PROGRAM1=null;
		TreeRuleReturnScope declarations2 =null;
		TreeRuleReturnScope functions3 =null;

		CommonTree PROGRAM1_tree=null;

		try {
			// ./com/yangqi/cminus/nodes/CMinusTree.g:20:5: ( ^( PROGRAM declarations functions ) )
			// ./com/yangqi/cminus/nodes/CMinusTree.g:20:7: ^( PROGRAM declarations functions )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			PROGRAM1=(CommonTree)match(input,PROGRAM,FOLLOW_PROGRAM_in_program88); 
			PROGRAM1_tree = (CommonTree)adaptor.dupNode(PROGRAM1);


			root_1 = (CommonTree)adaptor.becomeRoot(PROGRAM1_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_declarations_in_program90);
			declarations2=declarations();
			state._fsp--;

			adaptor.addChild(root_1, declarations2.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_functions_in_program92);
			functions3=functions();
			state._fsp--;

			adaptor.addChild(root_1, functions3.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.rv = new CMinusProgram((declarations2!=null?((CMinusTree.declarations_return)declarations2).rv:null), (functions3!=null?((CMinusTree.functions_return)functions3).rv:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declarations_return extends TreeRuleReturnScope {
		public ArrayList<CMinusDeclaration> rv;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarations"
	// ./com/yangqi/cminus/nodes/CMinusTree.g:24:1: declarations returns [ArrayList<CMinusDeclaration> rv] : ^( DECLS ( declaration )* ) ;
	public final CMinusTree.declarations_return declarations() throws RecognitionException {
		CMinusTree.declarations_return retval = new CMinusTree.declarations_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DECLS4=null;
		TreeRuleReturnScope declaration5 =null;

		CommonTree DECLS4_tree=null;

		 retval.rv = new ArrayList<CMinusDeclaration>(); 
		try {
			// ./com/yangqi/cminus/nodes/CMinusTree.g:26:5: ( ^( DECLS ( declaration )* ) )
			// ./com/yangqi/cminus/nodes/CMinusTree.g:26:7: ^( DECLS ( declaration )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DECLS4=(CommonTree)match(input,DECLS,FOLLOW_DECLS_in_declarations136); 
			DECLS4_tree = (CommonTree)adaptor.dupNode(DECLS4);


			root_1 = (CommonTree)adaptor.becomeRoot(DECLS4_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./com/yangqi/cminus/nodes/CMinusTree.g:26:15: ( declaration )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==DEF) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// ./com/yangqi/cminus/nodes/CMinusTree.g:26:16: declaration
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_declaration_in_declarations139);
						declaration5=declaration();
						state._fsp--;

						adaptor.addChild(root_1, declaration5.getTree());

						 retval.rv.add((declaration5!=null?((CMinusTree.declaration_return)declaration5).rv:null)); 
						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarations"


	public static class declaration_return extends TreeRuleReturnScope {
		public CMinusDeclaration rv;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// ./com/yangqi/cminus/nodes/CMinusTree.g:29:1: declaration returns [CMinusDeclaration rv] : ^( DEF type= TYPE id= ID ) ;
	public final CMinusTree.declaration_return declaration() throws RecognitionException {
		CMinusTree.declaration_return retval = new CMinusTree.declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree type=null;
		CommonTree id=null;
		CommonTree DEF6=null;

		CommonTree type_tree=null;
		CommonTree id_tree=null;
		CommonTree DEF6_tree=null;

		try {
			// ./com/yangqi/cminus/nodes/CMinusTree.g:30:5: ( ^( DEF type= TYPE id= ID ) )
			// ./com/yangqi/cminus/nodes/CMinusTree.g:30:7: ^( DEF type= TYPE id= ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DEF6=(CommonTree)match(input,DEF,FOLLOW_DEF_in_declaration167); 
			DEF6_tree = (CommonTree)adaptor.dupNode(DEF6);


			root_1 = (CommonTree)adaptor.becomeRoot(DEF6_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			type=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_declaration171); 
			type_tree = (CommonTree)adaptor.dupNode(type);


			adaptor.addChild(root_1, type_tree);

			_last = (CommonTree)input.LT(1);
			id=(CommonTree)match(input,ID,FOLLOW_ID_in_declaration175); 
			id_tree = (CommonTree)adaptor.dupNode(id);


			adaptor.addChild(root_1, id_tree);

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.rv = new CMinusDeclaration((type!=null?type.getText():null), (id!=null?id.getText():null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class functions_return extends TreeRuleReturnScope {
		public ArrayList<CMinusFunction> rv;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "functions"
	// ./com/yangqi/cminus/nodes/CMinusTree.g:33:1: functions returns [ArrayList<CMinusFunction> rv] : ^( FUNCS ( function )* ) ;
	public final CMinusTree.functions_return functions() throws RecognitionException {
		CMinusTree.functions_return retval = new CMinusTree.functions_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree FUNCS7=null;
		TreeRuleReturnScope function8 =null;

		CommonTree FUNCS7_tree=null;

		 retval.rv = new ArrayList<CMinusFunction>(); 
		try {
			// ./com/yangqi/cminus/nodes/CMinusTree.g:35:5: ( ^( FUNCS ( function )* ) )
			// ./com/yangqi/cminus/nodes/CMinusTree.g:35:7: ^( FUNCS ( function )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			FUNCS7=(CommonTree)match(input,FUNCS,FOLLOW_FUNCS_in_functions213); 
			FUNCS7_tree = (CommonTree)adaptor.dupNode(FUNCS7);


			root_1 = (CommonTree)adaptor.becomeRoot(FUNCS7_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./com/yangqi/cminus/nodes/CMinusTree.g:35:15: ( function )*
				loop2:
				while (true) {
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==DEFUN) ) {
						alt2=1;
					}

					switch (alt2) {
					case 1 :
						// ./com/yangqi/cminus/nodes/CMinusTree.g:35:16: function
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_function_in_functions216);
						function8=function();
						state._fsp--;

						adaptor.addChild(root_1, function8.getTree());

						 retval.rv.add((function8!=null?((CMinusTree.function_return)function8).rv:null)); 
						}
						break;

					default :
						break loop2;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functions"


	public static class function_return extends TreeRuleReturnScope {
		public CMinusFunction rv;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function"
	// ./com/yangqi/cminus/nodes/CMinusTree.g:38:1: function returns [CMinusFunction rv] : ^( DEFUN type= TYPE id= ID params declarations stmts ) ;
	public final CMinusTree.function_return function() throws RecognitionException {
		CMinusTree.function_return retval = new CMinusTree.function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree type=null;
		CommonTree id=null;
		CommonTree DEFUN9=null;
		TreeRuleReturnScope params10 =null;
		TreeRuleReturnScope declarations11 =null;
		TreeRuleReturnScope stmts12 =null;

		CommonTree type_tree=null;
		CommonTree id_tree=null;
		CommonTree DEFUN9_tree=null;

		try {
			// ./com/yangqi/cminus/nodes/CMinusTree.g:39:5: ( ^( DEFUN type= TYPE id= ID params declarations stmts ) )
			// ./com/yangqi/cminus/nodes/CMinusTree.g:39:7: ^( DEFUN type= TYPE id= ID params declarations stmts )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DEFUN9=(CommonTree)match(input,DEFUN,FOLLOW_DEFUN_in_function247); 
			DEFUN9_tree = (CommonTree)adaptor.dupNode(DEFUN9);


			root_1 = (CommonTree)adaptor.becomeRoot(DEFUN9_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			type=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_function251); 
			type_tree = (CommonTree)adaptor.dupNode(type);


			adaptor.addChild(root_1, type_tree);

			_last = (CommonTree)input.LT(1);
			id=(CommonTree)match(input,ID,FOLLOW_ID_in_function255); 
			id_tree = (CommonTree)adaptor.dupNode(id);


			adaptor.addChild(root_1, id_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_params_in_function257);
			params10=params();
			state._fsp--;

			adaptor.addChild(root_1, params10.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_declarations_in_function259);
			declarations11=declarations();
			state._fsp--;

			adaptor.addChild(root_1, declarations11.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stmts_in_function261);
			stmts12=stmts();
			state._fsp--;

			adaptor.addChild(root_1, stmts12.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.rv = new CMinusFunction((type!=null?type.getText():null), (id!=null?id.getText():null), (params10!=null?((CMinusTree.params_return)params10).rv:null), (declarations11!=null?((CMinusTree.declarations_return)declarations11).rv:null), (stmts12!=null?((CMinusTree.stmts_return)stmts12).rv:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class params_return extends TreeRuleReturnScope {
		public HashMap<String, String> rv;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "params"
	// ./com/yangqi/cminus/nodes/CMinusTree.g:43:1: params returns [HashMap<String, String> rv] : ^( PARAMS ( param )* ) ;
	public final CMinusTree.params_return params() throws RecognitionException {
		CMinusTree.params_return retval = new CMinusTree.params_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree PARAMS13=null;
		TreeRuleReturnScope param14 =null;

		CommonTree PARAMS13_tree=null;

		 retval.rv = new HashMap<String, String>(); 
		try {
			// ./com/yangqi/cminus/nodes/CMinusTree.g:45:5: ( ^( PARAMS ( param )* ) )
			// ./com/yangqi/cminus/nodes/CMinusTree.g:45:7: ^( PARAMS ( param )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			PARAMS13=(CommonTree)match(input,PARAMS,FOLLOW_PARAMS_in_params305); 
			PARAMS13_tree = (CommonTree)adaptor.dupNode(PARAMS13);


			root_1 = (CommonTree)adaptor.becomeRoot(PARAMS13_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./com/yangqi/cminus/nodes/CMinusTree.g:45:16: ( param )*
				loop3:
				while (true) {
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==TYPE) ) {
						alt3=1;
					}

					switch (alt3) {
					case 1 :
						// ./com/yangqi/cminus/nodes/CMinusTree.g:45:17: param
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_param_in_params308);
						param14=param();
						state._fsp--;

						adaptor.addChild(root_1, param14.getTree());

						 retval.rv.put((param14!=null?((CMinusTree.param_return)param14).id:null), (param14!=null?((CMinusTree.param_return)param14).type:null)); 
						}
						break;

					default :
						break loop3;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "params"


	public static class param_return extends TreeRuleReturnScope {
		public String type;
		public String id;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "param"
	// ./com/yangqi/cminus/nodes/CMinusTree.g:48:1: param returns [String type, String id] : ^(t= TYPE i= ID ) ;
	public final CMinusTree.param_return param() throws RecognitionException {
		CMinusTree.param_return retval = new CMinusTree.param_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree t=null;
		CommonTree i=null;

		CommonTree t_tree=null;
		CommonTree i_tree=null;

		try {
			// ./com/yangqi/cminus/nodes/CMinusTree.g:49:5: ( ^(t= TYPE i= ID ) )
			// ./com/yangqi/cminus/nodes/CMinusTree.g:49:7: ^(t= TYPE i= ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_param341); 
			t_tree = (CommonTree)adaptor.dupNode(t);


			root_1 = (CommonTree)adaptor.becomeRoot(t_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			i=(CommonTree)match(input,ID,FOLLOW_ID_in_param345); 
			i_tree = (CommonTree)adaptor.dupNode(i);


			adaptor.addChild(root_1, i_tree);

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.type = (t!=null?t.getText():null); retval.id = (i!=null?i.getText():null); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param"


	public static class stmts_return extends TreeRuleReturnScope {
		public ArrayList<IEvaluator> rv;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stmts"
	// ./com/yangqi/cminus/nodes/CMinusTree.g:52:1: stmts returns [ArrayList<IEvaluator> rv] : ( stmt )* ;
	public final CMinusTree.stmts_return stmts() throws RecognitionException {
		CMinusTree.stmts_return retval = new CMinusTree.stmts_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope stmt15 =null;


		 retval.rv = new ArrayList<IEvaluator>(); 
		try {
			// ./com/yangqi/cminus/nodes/CMinusTree.g:54:5: ( ( stmt )* )
			// ./com/yangqi/cminus/nodes/CMinusTree.g:54:7: ( stmt )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// ./com/yangqi/cminus/nodes/CMinusTree.g:54:7: ( stmt )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CALL||(LA4_0 >= ID && LA4_0 <= INT)||LA4_0==NEGATE||LA4_0==STRING_LITERAL||LA4_0==28||(LA4_0 >= 31 && LA4_0 <= 32)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ./com/yangqi/cminus/nodes/CMinusTree.g:54:8: stmt
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_stmt_in_stmts383);
					stmt15=stmt();
					state._fsp--;

					adaptor.addChild(root_0, stmt15.getTree());

					 retval.rv.add((stmt15!=null?((CMinusTree.stmt_return)stmt15).rv:null)); 
					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stmts"


	public static class stmt_return extends TreeRuleReturnScope {
		public IEvaluator rv;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stmt"
	// ./com/yangqi/cminus/nodes/CMinusTree.g:57:1: stmt returns [IEvaluator rv] : ( ^( '=' id= ID expr ) | ^( 'return' expr ) | expr );
	public final CMinusTree.stmt_return stmt() throws RecognitionException {
		CMinusTree.stmt_return retval = new CMinusTree.stmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;
		CommonTree char_literal16=null;
		CommonTree string_literal18=null;
		TreeRuleReturnScope expr17 =null;
		TreeRuleReturnScope expr19 =null;
		TreeRuleReturnScope expr20 =null;

		CommonTree id_tree=null;
		CommonTree char_literal16_tree=null;
		CommonTree string_literal18_tree=null;

		try {
			// ./com/yangqi/cminus/nodes/CMinusTree.g:58:5: ( ^( '=' id= ID expr ) | ^( 'return' expr ) | expr )
			int alt5=3;
			switch ( input.LA(1) ) {
			case 31:
				{
				alt5=1;
				}
				break;
			case 32:
				{
				alt5=2;
				}
				break;
			case CALL:
			case ID:
			case INT:
			case NEGATE:
			case STRING_LITERAL:
			case 28:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// ./com/yangqi/cminus/nodes/CMinusTree.g:58:7: ^( '=' id= ID expr )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal16=(CommonTree)match(input,31,FOLLOW_31_in_stmt413); 
					char_literal16_tree = (CommonTree)adaptor.dupNode(char_literal16);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal16_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					id=(CommonTree)match(input,ID,FOLLOW_ID_in_stmt417); 
					id_tree = (CommonTree)adaptor.dupNode(id);


					adaptor.addChild(root_1, id_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_stmt419);
					expr17=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr17.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.rv = new CMinusAssignment((id!=null?id.getText():null), (expr17!=null?((CMinusTree.expr_return)expr17).rv:null)); 
					}
					break;
				case 2 :
					// ./com/yangqi/cminus/nodes/CMinusTree.g:59:7: ^( 'return' expr )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal18=(CommonTree)match(input,32,FOLLOW_32_in_stmt431); 
					string_literal18_tree = (CommonTree)adaptor.dupNode(string_literal18);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal18_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_stmt433);
					expr19=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr19.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.rv = new CMinusReturn((expr19!=null?((CMinusTree.expr_return)expr19).rv:null)); 
					}
					break;
				case 3 :
					// ./com/yangqi/cminus/nodes/CMinusTree.g:60:7: expr
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_stmt444);
					expr20=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr20.getTree());

					 retval.rv = (expr20!=null?((CMinusTree.expr_return)expr20).rv:null); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stmt"


	public static class expr_return extends TreeRuleReturnScope {
		public IEvaluator rv;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// ./com/yangqi/cminus/nodes/CMinusTree.g:63:1: expr returns [IEvaluator rv] : ( ^( '+' lhs= expr rhs= expr ) | ^( CALL ID (e= expr )* ) | ^( NEGATE e= expr ) | INT | STRING_LITERAL | ID );
	public final CMinusTree.expr_return expr() throws RecognitionException {
		CMinusTree.expr_return retval = new CMinusTree.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree char_literal21=null;
		CommonTree CALL22=null;
		CommonTree ID23=null;
		CommonTree NEGATE24=null;
		CommonTree INT25=null;
		CommonTree STRING_LITERAL26=null;
		CommonTree ID27=null;
		TreeRuleReturnScope lhs =null;
		TreeRuleReturnScope rhs =null;
		TreeRuleReturnScope e =null;

		CommonTree char_literal21_tree=null;
		CommonTree CALL22_tree=null;
		CommonTree ID23_tree=null;
		CommonTree NEGATE24_tree=null;
		CommonTree INT25_tree=null;
		CommonTree STRING_LITERAL26_tree=null;
		CommonTree ID27_tree=null;

		 ArrayList<IEvaluator> callParams = new ArrayList<IEvaluator>(); 
		try {
			// ./com/yangqi/cminus/nodes/CMinusTree.g:65:5: ( ^( '+' lhs= expr rhs= expr ) | ^( CALL ID (e= expr )* ) | ^( NEGATE e= expr ) | INT | STRING_LITERAL | ID )
			int alt7=6;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt7=1;
				}
				break;
			case CALL:
				{
				alt7=2;
				}
				break;
			case NEGATE:
				{
				alt7=3;
				}
				break;
			case INT:
				{
				alt7=4;
				}
				break;
			case STRING_LITERAL:
				{
				alt7=5;
				}
				break;
			case ID:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ./com/yangqi/cminus/nodes/CMinusTree.g:65:7: ^( '+' lhs= expr rhs= expr )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal21=(CommonTree)match(input,28,FOLLOW_28_in_expr481); 
					char_literal21_tree = (CommonTree)adaptor.dupNode(char_literal21);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal21_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr485);
					lhs=expr();
					state._fsp--;

					adaptor.addChild(root_1, lhs.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr489);
					rhs=expr();
					state._fsp--;

					adaptor.addChild(root_1, rhs.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.rv = new CMinusAddition((lhs!=null?((CMinusTree.expr_return)lhs).rv:null), (rhs!=null?((CMinusTree.expr_return)rhs).rv:null)); 
					}
					break;
				case 2 :
					// ./com/yangqi/cminus/nodes/CMinusTree.g:66:7: ^( CALL ID (e= expr )* )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					CALL22=(CommonTree)match(input,CALL,FOLLOW_CALL_in_expr501); 
					CALL22_tree = (CommonTree)adaptor.dupNode(CALL22);


					root_1 = (CommonTree)adaptor.becomeRoot(CALL22_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID23=(CommonTree)match(input,ID,FOLLOW_ID_in_expr503); 
					ID23_tree = (CommonTree)adaptor.dupNode(ID23);


					adaptor.addChild(root_1, ID23_tree);

					// ./com/yangqi/cminus/nodes/CMinusTree.g:66:17: (e= expr )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==CALL||(LA6_0 >= ID && LA6_0 <= INT)||LA6_0==NEGATE||LA6_0==STRING_LITERAL||LA6_0==28) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// ./com/yangqi/cminus/nodes/CMinusTree.g:66:18: e= expr
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr508);
							e=expr();
							state._fsp--;

							adaptor.addChild(root_1, e.getTree());

							 callParams.add((e!=null?((CMinusTree.expr_return)e).rv:null)); 
							}
							break;

						default :
							break loop6;
						}
					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.rv = new CMinusFunctionCall((ID23!=null?ID23.getText():null), callParams); 
					}
					break;
				case 3 :
					// ./com/yangqi/cminus/nodes/CMinusTree.g:68:7: ^( NEGATE e= expr )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NEGATE24=(CommonTree)match(input,NEGATE,FOLLOW_NEGATE_in_expr534); 
					NEGATE24_tree = (CommonTree)adaptor.dupNode(NEGATE24);


					root_1 = (CommonTree)adaptor.becomeRoot(NEGATE24_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr538);
					e=expr();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.rv = new CMinusNegation((e!=null?((CMinusTree.expr_return)e).rv:null)); 
					}
					break;
				case 4 :
					// ./com/yangqi/cminus/nodes/CMinusTree.g:69:7: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INT25=(CommonTree)match(input,INT,FOLLOW_INT_in_expr549); 
					INT25_tree = (CommonTree)adaptor.dupNode(INT25);


					adaptor.addChild(root_0, INT25_tree);

					 retval.rv = new CMinusConstant(Integer.parseInt((INT25!=null?INT25.getText():null))); 
					}
					break;
				case 5 :
					// ./com/yangqi/cminus/nodes/CMinusTree.g:70:7: STRING_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					STRING_LITERAL26=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_expr559); 
					STRING_LITERAL26_tree = (CommonTree)adaptor.dupNode(STRING_LITERAL26);


					adaptor.addChild(root_0, STRING_LITERAL26_tree);

					 retval.rv = new CMinusConstant((STRING_LITERAL26!=null?STRING_LITERAL26.getText():null)); 
					}
					break;
				case 6 :
					// ./com/yangqi/cminus/nodes/CMinusTree.g:71:7: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					ID27=(CommonTree)match(input,ID,FOLLOW_ID_in_expr569); 
					ID27_tree = (CommonTree)adaptor.dupNode(ID27);


					adaptor.addChild(root_0, ID27_tree);

					 retval.rv = new CMinusVariable((ID27!=null?ID27.getText():null)); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program88 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declarations_in_program90 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_functions_in_program92 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLS_in_declarations136 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_declarations139 = new BitSet(new long[]{0x0000000000000208L});
	public static final BitSet FOLLOW_DEF_in_declaration167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_declaration171 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_declaration175 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCS_in_functions213 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_function_in_functions216 = new BitSet(new long[]{0x0000000000000408L});
	public static final BitSet FOLLOW_DEFUN_in_function247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_function251 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_function255 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_params_in_function257 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_declarations_in_function259 = new BitSet(new long[]{0x000000019104C018L});
	public static final BitSet FOLLOW_stmts_in_function261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMS_in_params305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_param_in_params308 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_TYPE_in_param341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_param345 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_stmt_in_stmts383 = new BitSet(new long[]{0x000000019104C012L});
	public static final BitSet FOLLOW_31_in_stmt413 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_stmt417 = new BitSet(new long[]{0x000000001104C010L});
	public static final BitSet FOLLOW_expr_in_stmt419 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_32_in_stmt431 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_stmt433 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_stmt444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_expr481 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr485 = new BitSet(new long[]{0x000000001104C010L});
	public static final BitSet FOLLOW_expr_in_expr489 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALL_in_expr501 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr503 = new BitSet(new long[]{0x000000001104C018L});
	public static final BitSet FOLLOW_expr_in_expr508 = new BitSet(new long[]{0x000000001104C018L});
	public static final BitSet FOLLOW_NEGATE_in_expr534 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr538 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_expr549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_expr559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr569 = new BitSet(new long[]{0x0000000000000002L});
}
