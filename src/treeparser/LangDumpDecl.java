// $ANTLR 3.5.1 LangDumpDecl.g 2013-10-26 10:19:24

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LangDumpDecl extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public LangDumpDecl(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public LangDumpDecl(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return LangDumpDecl.tokenNames; }
	@Override public String getGrammarFileName() { return "LangDumpDecl.g"; }



	// $ANTLR start "start"
	// LangDumpDecl.g:7:1: start : ( decl )+ ;
	public final void start() throws RecognitionException {
		try {
			// LangDumpDecl.g:7:6: ( ( decl )+ )
			// LangDumpDecl.g:7:8: ( decl )+
			{
			// LangDumpDecl.g:7:8: ( decl )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DECL) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// LangDumpDecl.g:7:8: decl
					{
					pushFollow(FOLLOW_decl_in_start35);
					decl();
					state._fsp--;

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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"



	// $ANTLR start "decl"
	// LangDumpDecl.g:9:1: decl : ^( DECL type declarator ) ;
	public final void decl() throws RecognitionException {
		TreeRuleReturnScope declarator1 =null;

		try {
			// LangDumpDecl.g:9:6: ( ^( DECL type declarator ) )
			// LangDumpDecl.g:9:8: ^( DECL type declarator )
			{
			match(input,DECL,FOLLOW_DECL_in_decl46); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_decl48);
			type();
			state._fsp--;

			pushFollow(FOLLOW_declarator_in_decl50);
			declarator1=declarator();
			state._fsp--;

			match(input, Token.UP, null); 

			System.out.println("int "+(declarator1!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(declarator1.start),input.getTreeAdaptor().getTokenStopIndex(declarator1.start))):null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decl"



	// $ANTLR start "type"
	// LangDumpDecl.g:13:1: type : ( INTTYPE | FLOATTYPE );
	public final void type() throws RecognitionException {
		try {
			// LangDumpDecl.g:13:6: ( INTTYPE | FLOATTYPE )
			// LangDumpDecl.g:
			{
			if ( input.LA(1)==FLOATTYPE||input.LA(1)==INTTYPE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"


	public static class declarator_return extends TreeRuleReturnScope {
	};


	// $ANTLR start "declarator"
	// LangDumpDecl.g:17:1: declarator : ID ;
	public final LangDumpDecl.declarator_return declarator() throws RecognitionException {
		LangDumpDecl.declarator_return retval = new LangDumpDecl.declarator_return();
		retval.start = input.LT(1);

		try {
			// LangDumpDecl.g:18:6: ( ID )
			// LangDumpDecl.g:18:8: ID
			{
			match(input,ID,FOLLOW_ID_in_declarator103); 
			}

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
	// $ANTLR end "declarator"

	// Delegated rules



	public static final BitSet FOLLOW_decl_in_start35 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_DECL_in_decl46 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_decl48 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_declarator_in_decl50 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_declarator103 = new BitSet(new long[]{0x0000000000000002L});
}
