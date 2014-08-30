// $ANTLR 3.5.1 Lang.g 2013-10-26 10:19:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class LangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECL", "FLOATTYPE", "ID", "INT", 
		"INTTYPE", "WS", "';'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int DECL=4;
	public static final int FLOATTYPE=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int INTTYPE=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return LangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Lang.g"; }


	public static class start_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "start"
	// Lang.g:9:1: start : ( decl )+ ;
	public final LangParser.start_return start() throws RecognitionException {
		LangParser.start_return retval = new LangParser.start_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope decl1 =null;


		try {
			// Lang.g:9:7: ( ( decl )+ )
			// Lang.g:9:9: ( decl )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// Lang.g:9:9: ( decl )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FLOATTYPE||LA1_0==INTTYPE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Lang.g:9:9: decl
					{
					pushFollow(FOLLOW_decl_in_start33);
					decl1=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl1.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "start"


	public static class decl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// Lang.g:11:1: decl : type ID ';' -> ^( DECL type ID ) ;
	public final LangParser.decl_return decl() throws RecognitionException {
		LangParser.decl_return retval = new LangParser.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID3=null;
		Token char_literal4=null;
		ParserRuleReturnScope type2 =null;

		CommonTree ID3_tree=null;
		CommonTree char_literal4_tree=null;
		RewriteRuleTokenStream stream_10=new RewriteRuleTokenStream(adaptor,"token 10");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Lang.g:11:6: ( type ID ';' -> ^( DECL type ID ) )
			// Lang.g:11:8: type ID ';'
			{
			pushFollow(FOLLOW_type_in_decl42);
			type2=type();
			state._fsp--;

			stream_type.add(type2.getTree());
			ID3=(Token)match(input,ID,FOLLOW_ID_in_decl44);  
			stream_ID.add(ID3);

			char_literal4=(Token)match(input,10,FOLLOW_10_in_decl46);  
			stream_10.add(char_literal4);

			// AST REWRITE
			// elements: ID, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 11:20: -> ^( DECL type ID )
			{
				// Lang.g:11:23: ^( DECL type ID )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECL, "DECL"), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Lang.g:13:1: type : ( INTTYPE | FLOATTYPE );
	public final LangParser.type_return type() throws RecognitionException {
		LangParser.type_return retval = new LangParser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set5=null;

		CommonTree set5_tree=null;

		try {
			// Lang.g:13:6: ( INTTYPE | FLOATTYPE )
			// Lang.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set5=input.LT(1);
			if ( input.LA(1)==FLOATTYPE||input.LA(1)==INTTYPE ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set5));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_decl_in_start33 = new BitSet(new long[]{0x0000000000000122L});
	public static final BitSet FOLLOW_type_in_decl42 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_decl44 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_decl46 = new BitSet(new long[]{0x0000000000000002L});
}
