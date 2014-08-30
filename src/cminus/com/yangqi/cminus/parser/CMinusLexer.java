// $ANTLR 3.5.1 ./com/yangqi/cminus/parser/CMinus.g 2013-11-23 14:51:09

package com.yangqi.cminus.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CMinusLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CMinusLexer() {} 
	public CMinusLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CMinusLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "./com/yangqi/cminus/parser/CMinus.g"; }

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:11:7: ( '*' )
			// ./com/yangqi/cminus/parser/CMinus.g:11:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:12:7: ( '+' )
			// ./com/yangqi/cminus/parser/CMinus.g:12:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:13:7: ( '-' )
			// ./com/yangqi/cminus/parser/CMinus.g:13:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:14:7: ( '/' )
			// ./com/yangqi/cminus/parser/CMinus.g:14:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:15:7: ( '=' )
			// ./com/yangqi/cminus/parser/CMinus.g:15:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:16:7: ( 'return' )
			// ./com/yangqi/cminus/parser/CMinus.g:16:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// ./com/yangqi/cminus/parser/CMinus.g:102:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// ./com/yangqi/cminus/parser/CMinus.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "ENDL"
	public final void mENDL() throws RecognitionException {
		try {
			// ./com/yangqi/cminus/parser/CMinus.g:103:15: ( '\\r\\n' | '\\n' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='\r') ) {
				alt1=1;
			}
			else if ( (LA1_0=='\n') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:103:17: '\\r\\n'
					{
					match("\r\n"); 

					}
					break;
				case 2 :
					// ./com/yangqi/cminus/parser/CMinus.g:103:26: '\\n'
					{
					match('\n'); 
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDL"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// ./com/yangqi/cminus/parser/CMinus.g:104:16: ( '0' .. '9' )
			// ./com/yangqi/cminus/parser/CMinus.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:106:6: ( 'int' | 'string' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='i') ) {
				alt2=1;
			}
			else if ( (LA2_0=='s') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:106:8: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// ./com/yangqi/cminus/parser/CMinus.g:106:16: 'string'
					{
					match("string"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:107:4: ( ( ' ' | '\\t' | '\\n' | '\\r\\n' )+ )
			// ./com/yangqi/cminus/parser/CMinus.g:107:6: ( ' ' | '\\t' | '\\n' | '\\r\\n' )+
			{
			// ./com/yangqi/cminus/parser/CMinus.g:107:6: ( ' ' | '\\t' | '\\n' | '\\r\\n' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=5;
				switch ( input.LA(1) ) {
				case ' ':
					{
					alt3=1;
					}
					break;
				case '\t':
					{
					alt3=2;
					}
					break;
				case '\n':
					{
					alt3=3;
					}
					break;
				case '\r':
					{
					alt3=4;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:107:7: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// ./com/yangqi/cminus/parser/CMinus.g:107:13: '\\t'
					{
					match('\t'); 
					}
					break;
				case 3 :
					// ./com/yangqi/cminus/parser/CMinus.g:107:20: '\\n'
					{
					match('\n'); 
					}
					break;
				case 4 :
					// ./com/yangqi/cminus/parser/CMinus.g:107:27: '\\r\\n'
					{
					match("\r\n"); 

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:108:9: ( '//' ( . )* ENDL )
			// ./com/yangqi/cminus/parser/CMinus.g:108:11: '//' ( . )* ENDL
			{
			match("//"); 

			// ./com/yangqi/cminus/parser/CMinus.g:108:16: ( . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\r') ) {
					int LA4_1 = input.LA(2);
					if ( (LA4_1=='\n') ) {
						alt4=2;
					}
					else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '\t')||(LA4_1 >= '\u000B' && LA4_1 <= '\uFFFF')) ) {
						alt4=1;
					}

				}
				else if ( (LA4_0=='\n') ) {
					alt4=2;
				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:108:16: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop4;
				}
			}

			mENDL(); 

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:109:4: ( ( LETTER | '_' ) ( LETTER | '_' | DIGIT )* )
			// ./com/yangqi/cminus/parser/CMinus.g:109:6: ( LETTER | '_' ) ( LETTER | '_' | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// ./com/yangqi/cminus/parser/CMinus.g:109:20: ( LETTER | '_' | DIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:110:7: ( ',' )
			// ./com/yangqi/cminus/parser/CMinus.g:110:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:111:6: ( ';' )
			// ./com/yangqi/cminus/parser/CMinus.g:111:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:112:8: ( '(' )
			// ./com/yangqi/cminus/parser/CMinus.g:112:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:113:8: ( ')' )
			// ./com/yangqi/cminus/parser/CMinus.g:113:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "OPEN_BRACE"
	public final void mOPEN_BRACE() throws RecognitionException {
		try {
			int _type = OPEN_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:114:12: ( '{' )
			// ./com/yangqi/cminus/parser/CMinus.g:114:14: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_BRACE"

	// $ANTLR start "CLOSE_BRACE"
	public final void mCLOSE_BRACE() throws RecognitionException {
		try {
			int _type = CLOSE_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:115:13: ( '}' )
			// ./com/yangqi/cminus/parser/CMinus.g:115:15: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_BRACE"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:116:16: ( '\"' (~ ( '\"' | '\\\\\"' ) )* '\"' )
			// ./com/yangqi/cminus/parser/CMinus.g:116:18: '\"' (~ ( '\"' | '\\\\\"' ) )* '\"'
			{
			match('\"'); 
			// ./com/yangqi/cminus/parser/CMinus.g:116:22: (~ ( '\"' | '\\\\\"' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:116:22: ~ ( '\"' | '\\\\\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./com/yangqi/cminus/parser/CMinus.g:119:5: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='0') ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= '1' && LA8_0 <= '9')) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// ./com/yangqi/cminus/parser/CMinus.g:119:7: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// ./com/yangqi/cminus/parser/CMinus.g:119:13: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// ./com/yangqi/cminus/parser/CMinus.g:119:24: ( DIGIT )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// ./com/yangqi/cminus/parser/CMinus.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	@Override
	public void mTokens() throws RecognitionException {
		// ./com/yangqi/cminus/parser/CMinus.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | TYPE | WS | COMMENT | ID | COMMA | SEMI | LPAREN | RPAREN | OPEN_BRACE | CLOSE_BRACE | STRING_LITERAL | INT )
		int alt9=18;
		switch ( input.LA(1) ) {
		case '*':
			{
			alt9=1;
			}
			break;
		case '+':
			{
			alt9=2;
			}
			break;
		case '-':
			{
			alt9=3;
			}
			break;
		case '/':
			{
			int LA9_4 = input.LA(2);
			if ( (LA9_4=='/') ) {
				alt9=9;
			}

			else {
				alt9=4;
			}

			}
			break;
		case '=':
			{
			alt9=5;
			}
			break;
		case 'r':
			{
			int LA9_6 = input.LA(2);
			if ( (LA9_6=='e') ) {
				int LA9_21 = input.LA(3);
				if ( (LA9_21=='t') ) {
					int LA9_24 = input.LA(4);
					if ( (LA9_24=='u') ) {
						int LA9_27 = input.LA(5);
						if ( (LA9_27=='r') ) {
							int LA9_30 = input.LA(6);
							if ( (LA9_30=='n') ) {
								int LA9_32 = input.LA(7);
								if ( ((LA9_32 >= '0' && LA9_32 <= '9')||(LA9_32 >= 'A' && LA9_32 <= 'Z')||LA9_32=='_'||(LA9_32 >= 'a' && LA9_32 <= 'z')) ) {
									alt9=10;
								}

								else {
									alt9=6;
								}

							}

							else {
								alt9=10;
							}

						}

						else {
							alt9=10;
						}

					}

					else {
						alt9=10;
					}

				}

				else {
					alt9=10;
				}

			}

			else {
				alt9=10;
			}

			}
			break;
		case 'i':
			{
			int LA9_7 = input.LA(2);
			if ( (LA9_7=='n') ) {
				int LA9_22 = input.LA(3);
				if ( (LA9_22=='t') ) {
					int LA9_25 = input.LA(4);
					if ( ((LA9_25 >= '0' && LA9_25 <= '9')||(LA9_25 >= 'A' && LA9_25 <= 'Z')||LA9_25=='_'||(LA9_25 >= 'a' && LA9_25 <= 'z')) ) {
						alt9=10;
					}

					else {
						alt9=7;
					}

				}

				else {
					alt9=10;
				}

			}

			else {
				alt9=10;
			}

			}
			break;
		case 's':
			{
			int LA9_8 = input.LA(2);
			if ( (LA9_8=='t') ) {
				int LA9_23 = input.LA(3);
				if ( (LA9_23=='r') ) {
					int LA9_26 = input.LA(4);
					if ( (LA9_26=='i') ) {
						int LA9_29 = input.LA(5);
						if ( (LA9_29=='n') ) {
							int LA9_31 = input.LA(6);
							if ( (LA9_31=='g') ) {
								int LA9_33 = input.LA(7);
								if ( ((LA9_33 >= '0' && LA9_33 <= '9')||(LA9_33 >= 'A' && LA9_33 <= 'Z')||LA9_33=='_'||(LA9_33 >= 'a' && LA9_33 <= 'z')) ) {
									alt9=10;
								}

								else {
									alt9=7;
								}

							}

							else {
								alt9=10;
							}

						}

						else {
							alt9=10;
						}

					}

					else {
						alt9=10;
					}

				}

				else {
					alt9=10;
				}

			}

			else {
				alt9=10;
			}

			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt9=8;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt9=10;
			}
			break;
		case ',':
			{
			alt9=11;
			}
			break;
		case ';':
			{
			alt9=12;
			}
			break;
		case '(':
			{
			alt9=13;
			}
			break;
		case ')':
			{
			alt9=14;
			}
			break;
		case '{':
			{
			alt9=15;
			}
			break;
		case '}':
			{
			alt9=16;
			}
			break;
		case '\"':
			{
			alt9=17;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt9=18;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 9, 0, input);
			throw nvae;
		}
		switch (alt9) {
			case 1 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:10: T__27
				{
				mT__27(); 

				}
				break;
			case 2 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:16: T__28
				{
				mT__28(); 

				}
				break;
			case 3 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:22: T__29
				{
				mT__29(); 

				}
				break;
			case 4 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:28: T__30
				{
				mT__30(); 

				}
				break;
			case 5 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:34: T__31
				{
				mT__31(); 

				}
				break;
			case 6 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:40: T__32
				{
				mT__32(); 

				}
				break;
			case 7 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:46: TYPE
				{
				mTYPE(); 

				}
				break;
			case 8 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:51: WS
				{
				mWS(); 

				}
				break;
			case 9 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:54: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 10 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:62: ID
				{
				mID(); 

				}
				break;
			case 11 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:65: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 12 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:71: SEMI
				{
				mSEMI(); 

				}
				break;
			case 13 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:76: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 14 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:83: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 15 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:90: OPEN_BRACE
				{
				mOPEN_BRACE(); 

				}
				break;
			case 16 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:101: CLOSE_BRACE
				{
				mCLOSE_BRACE(); 

				}
				break;
			case 17 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:113: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 18 :
				// ./com/yangqi/cminus/parser/CMinus.g:1:128: INT
				{
				mINT(); 

				}
				break;

		}
	}



}
