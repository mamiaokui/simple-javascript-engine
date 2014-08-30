// $ANTLR 3.5.1 Lang.g 2013-10-26 10:19:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int DECL=4;
	public static final int FLOATTYPE=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int INTTYPE=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LangLexer() {} 
	public LangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Lang.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lang.g:2:7: ( ';' )
			// Lang.g:2:9: ';'
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
	// $ANTLR end "T__10"

	// $ANTLR start "INTTYPE"
	public final void mINTTYPE() throws RecognitionException {
		try {
			int _type = INTTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lang.g:17:9: ( 'integer' )
			// Lang.g:17:11: 'integer'
			{
			match("integer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTTYPE"

	// $ANTLR start "FLOATTYPE"
	public final void mFLOATTYPE() throws RecognitionException {
		try {
			int _type = FLOATTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lang.g:18:11: ( 'float' )
			// Lang.g:18:13: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATTYPE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lang.g:19:4: ( ( 'a' .. 'z' )+ )
			// Lang.g:19:6: ( 'a' .. 'z' )+
			{
			// Lang.g:19:6: ( 'a' .. 'z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Lang.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lang.g:20:5: ( ( '0' .. '9' )+ )
			// Lang.g:20:7: ( '0' .. '9' )+
			{
			// Lang.g:20:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Lang.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lang.g:21:4: ( ( ' ' | '\\n' ) )
			// Lang.g:21:6: ( ' ' | '\\n' )
			{
			if ( input.LA(1)=='\n'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// Lang.g:1:8: ( T__10 | INTTYPE | FLOATTYPE | ID | INT | WS )
		int alt3=6;
		switch ( input.LA(1) ) {
		case ';':
			{
			alt3=1;
			}
			break;
		case 'i':
			{
			int LA3_2 = input.LA(2);
			if ( (LA3_2=='n') ) {
				int LA3_7 = input.LA(3);
				if ( (LA3_7=='t') ) {
					int LA3_9 = input.LA(4);
					if ( (LA3_9=='e') ) {
						int LA3_11 = input.LA(5);
						if ( (LA3_11=='g') ) {
							int LA3_13 = input.LA(6);
							if ( (LA3_13=='e') ) {
								int LA3_15 = input.LA(7);
								if ( (LA3_15=='r') ) {
									int LA3_17 = input.LA(8);
									if ( ((LA3_17 >= 'a' && LA3_17 <= 'z')) ) {
										alt3=4;
									}

									else {
										alt3=2;
									}

								}

								else {
									alt3=4;
								}

							}

							else {
								alt3=4;
							}

						}

						else {
							alt3=4;
						}

					}

					else {
						alt3=4;
					}

				}

				else {
					alt3=4;
				}

			}

			else {
				alt3=4;
			}

			}
			break;
		case 'f':
			{
			int LA3_3 = input.LA(2);
			if ( (LA3_3=='l') ) {
				int LA3_8 = input.LA(3);
				if ( (LA3_8=='o') ) {
					int LA3_10 = input.LA(4);
					if ( (LA3_10=='a') ) {
						int LA3_12 = input.LA(5);
						if ( (LA3_12=='t') ) {
							int LA3_14 = input.LA(6);
							if ( ((LA3_14 >= 'a' && LA3_14 <= 'z')) ) {
								alt3=4;
							}

							else {
								alt3=3;
							}

						}

						else {
							alt3=4;
						}

					}

					else {
						alt3=4;
					}

				}

				else {
					alt3=4;
				}

			}

			else {
				alt3=4;
			}

			}
			break;
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
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
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt3=4;
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
			alt3=5;
			}
			break;
		case '\n':
		case ' ':
			{
			alt3=6;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// Lang.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// Lang.g:1:16: INTTYPE
				{
				mINTTYPE(); 

				}
				break;
			case 3 :
				// Lang.g:1:24: FLOATTYPE
				{
				mFLOATTYPE(); 

				}
				break;
			case 4 :
				// Lang.g:1:34: ID
				{
				mID(); 

				}
				break;
			case 5 :
				// Lang.g:1:37: INT
				{
				mINT(); 

				}
				break;
			case 6 :
				// Lang.g:1:41: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
