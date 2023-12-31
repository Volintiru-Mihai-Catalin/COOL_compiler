// Generated from C:/Users/Voli/Desktop/CPL/Tema1/src/cool/lexer/CoolLexer.g4 by ANTLR 4.13.1

    package cool.lexer;	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, CLASS=2, INHERITS=3, NEW=4, SELF=5, IF=6, THEN=7, ELSE=8, FI=9, 
		LET=10, IN=11, CASE=12, OF=13, BRANCH=14, ESAC=15, WHILE=16, LOOP=17, 
		POOL=18, NOT=19, BOOL=20, ISVOID=21, PLUS=22, MINUS=23, UNARY_MINUS=24, 
		DIV=25, MULT=26, EQUAL=27, LT=28, LE=29, ASSIGN=30, CLASIC_TYPES=31, CLASIC_DISPATCH=32, 
		SUPER_DISPATCH=33, LPAREN=34, RPAREN=35, LBRACE=36, RBRACE=37, COMMA=38, 
		SEMI=39, COLON=40, INT=41, LINE_COMM=42, UNMATCHED_STAR=43, COMM=44, COMM_EOF=45, 
		STRING=46, ID=47, WS=48, INVALID=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "INHERITS", "NEW", "SELF", "IF", "THEN", "ELSE", "FI", "LET", 
			"IN", "CASE", "OF", "BRANCH", "ESAC", "WHILE", "LOOP", "POOL", "NOT", 
			"BOOL", "ISVOID", "PLUS", "MINUS", "UNARY_MINUS", "DIV", "MULT", "EQUAL", 
			"LT", "LE", "ASSIGN", "CLASIC_TYPES", "CLASIC_DISPATCH", "SUPER_DISPATCH", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "SEMI", "COLON", "DIGIT", 
			"INT", "LETTER", "NEW_LINE", "LINE_COMM", "UNMATCHED_STAR", "COMM", "COMM_EOF", 
			"ESCAPED_CHAR", "NULL_CHAR", "BACKSLASH", "ESCAPED_NEWLINE", "UNESCAPED_NEWLINE", 
			"STRING", "ID", "WS", "INVALID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'class'", "'inherits'", "'new'", "'self'", "'if'", "'then'", 
			"'else'", "'fi'", "'let'", "'in'", "'case'", "'of'", "'=>'", "'esac'", 
			"'while'", "'loop'", "'pool'", "'not'", null, "'isvoid'", "'+'", "'-'", 
			"'~'", "'/'", "'*'", "'='", "'<'", "'<='", "'<-'", null, "'.'", "'@'", 
			"'('", "')'", "'{'", "'}'", "','", "';'", "':'", null, null, "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "CLASS", "INHERITS", "NEW", "SELF", "IF", "THEN", "ELSE", 
			"FI", "LET", "IN", "CASE", "OF", "BRANCH", "ESAC", "WHILE", "LOOP", "POOL", 
			"NOT", "BOOL", "ISVOID", "PLUS", "MINUS", "UNARY_MINUS", "DIV", "MULT", 
			"EQUAL", "LT", "LE", "ASSIGN", "CLASIC_TYPES", "CLASIC_DISPATCH", "SUPER_DISPATCH", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "SEMI", "COLON", "INT", 
			"LINE_COMM", "UNMATCHED_STAR", "COMM", "COMM_EOF", "STRING", "ID", "WS", 
			"INVALID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    int contor = 0;
	    boolean e = false;
	    private void raiseError(String msg) {
	        contor = 0;
	        setText(msg);
	        setType(ERROR);
	    }


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 44:
			UNMATCHED_STAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			COMM_EOF_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			INVALID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void UNMATCHED_STAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 raiseError("Unmatched *)"); 
			break;
		}
	}
	private void COMM_EOF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 raiseError("EOF in comment"); 
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 contor++; 
			break;
		case 3:

			                                raiseError("String contains null character");
			                                e = true;
			                            
			break;
		case 4:
			 contor++; 
			break;
		case 5:

			                    if (contor > 1024) {
			                        raiseError("String constant too long");
			                        e = true;
			                    }
			                    if (!e) {
			                        String formatedStr = getText().substring(1, getText().length() - 1);
			                        char[] str = formatedStr.toCharArray();

			                        StringBuilder finalStr = new StringBuilder();

			                        for(int i = 0; i < str.length; i++) {
			                            if (str[i] != '\\') {
			                                finalStr.append(str[i]);
			                            } else {
			                                if (str[i + 1] == 'b') {
			                                    finalStr.append('\b');
			                                } else if (str[i + 1] == 't') {
			                                    finalStr.append('\t');
			                                } else if (str[i + 1] == 'n') {
			                                    finalStr.append('\n');
			                                } else if (str[i + 1] == 'f') {
			                                    finalStr.append('\f');
			                                } else if (str[i + 1] == '\\') {
			                                    finalStr.append('\\');
			                                } else {
			                                    finalStr.append(str[i + 1]);
			                                }
			                                i++;
			                            }
			                        }

			                        setText(finalStr.toString());
			                    }
			                
			break;
		case 6:
			 raiseError("Unterminated string constant"); 
			break;
		case 7:
			 raiseError("EOF in string constant"); 
			break;
		}
	}
	private void INVALID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			 raiseError("Invalid character: " + getText()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u00001\u01a6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ce\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0109\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001(\u0004(\u0120\b(\u000b(\f(\u0121\u0001)\u0001)\u0001"+
		"*\u0003*\u0127\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0005+\u012f"+
		"\b+\n+\f+\u0132\t+\u0001+\u0001+\u0003+\u0136\b+\u0001+\u0001+\u0001,"+
		"\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0005"+
		"-\u0144\b-\n-\f-\u0147\t-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0005.\u0154\b.\n.\f.\u0157\t.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u0169\b/\u00010\u00010\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u0181"+
		"\b4\u00054\u0183\b4\n4\f4\u0186\t4\u00014\u00014\u00014\u00014\u00014"+
		"\u00014\u00014\u00034\u018f\b4\u00015\u00015\u00035\u0193\b5\u00015\u0001"+
		"5\u00015\u00055\u0198\b5\n5\f5\u019b\t5\u00016\u00046\u019e\b6\u000b6"+
		"\f6\u019f\u00016\u00016\u00017\u00017\u00017\u0004\u0130\u0145\u0155\u0184"+
		"\u00008\u0001\u0002\u0003\u0003\u0005\u0004\u0007\u0005\t\u0006\u000b"+
		"\u0007\r\b\u000f\t\u0011\n\u0013\u000b\u0015\f\u0017\r\u0019\u000e\u001b"+
		"\u000f\u001d\u0010\u001f\u0011!\u0012#\u0013%\u0014\'\u0015)\u0016+\u0017"+
		"-\u0018/\u00191\u001a3\u001b5\u001c7\u001d9\u001e;\u001f= ?!A\"C#E$G%"+
		"I&K\'M(O\u0000Q)S\u0000U\u0000W*Y+[,]-_\u0000a\u0000c\u0000e\u0000g\u0000"+
		"i.k/m0o1\u0001\u0000\u0004\u0001\u000009\u0002\u0000AZaz\u0001\u0000)"+
		"*\u0003\u0000\t\n\f\r  \u01bc\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000"+
		"\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]"+
		"\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000"+
		"\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000"+
		"\u0001q\u0001\u0000\u0000\u0000\u0003w\u0001\u0000\u0000\u0000\u0005\u0080"+
		"\u0001\u0000\u0000\u0000\u0007\u0084\u0001\u0000\u0000\u0000\t\u0089\u0001"+
		"\u0000\u0000\u0000\u000b\u008c\u0001\u0000\u0000\u0000\r\u0091\u0001\u0000"+
		"\u0000\u0000\u000f\u0096\u0001\u0000\u0000\u0000\u0011\u0099\u0001\u0000"+
		"\u0000\u0000\u0013\u009d\u0001\u0000\u0000\u0000\u0015\u00a0\u0001\u0000"+
		"\u0000\u0000\u0017\u00a5\u0001\u0000\u0000\u0000\u0019\u00a8\u0001\u0000"+
		"\u0000\u0000\u001b\u00ab\u0001\u0000\u0000\u0000\u001d\u00b0\u0001\u0000"+
		"\u0000\u0000\u001f\u00b6\u0001\u0000\u0000\u0000!\u00bb\u0001\u0000\u0000"+
		"\u0000#\u00c0\u0001\u0000\u0000\u0000%\u00cd\u0001\u0000\u0000\u0000\'"+
		"\u00cf\u0001\u0000\u0000\u0000)\u00d6\u0001\u0000\u0000\u0000+\u00d8\u0001"+
		"\u0000\u0000\u0000-\u00da\u0001\u0000\u0000\u0000/\u00dc\u0001\u0000\u0000"+
		"\u00001\u00de\u0001\u0000\u0000\u00003\u00e0\u0001\u0000\u0000\u00005"+
		"\u00e2\u0001\u0000\u0000\u00007\u00e4\u0001\u0000\u0000\u00009\u00e7\u0001"+
		"\u0000\u0000\u0000;\u0108\u0001\u0000\u0000\u0000=\u010a\u0001\u0000\u0000"+
		"\u0000?\u010c\u0001\u0000\u0000\u0000A\u010e\u0001\u0000\u0000\u0000C"+
		"\u0110\u0001\u0000\u0000\u0000E\u0112\u0001\u0000\u0000\u0000G\u0114\u0001"+
		"\u0000\u0000\u0000I\u0116\u0001\u0000\u0000\u0000K\u0118\u0001\u0000\u0000"+
		"\u0000M\u011a\u0001\u0000\u0000\u0000O\u011c\u0001\u0000\u0000\u0000Q"+
		"\u011f\u0001\u0000\u0000\u0000S\u0123\u0001\u0000\u0000\u0000U\u0126\u0001"+
		"\u0000\u0000\u0000W\u012a\u0001\u0000\u0000\u0000Y\u0139\u0001\u0000\u0000"+
		"\u0000[\u013e\u0001\u0000\u0000\u0000]\u014d\u0001\u0000\u0000\u0000_"+
		"\u0168\u0001\u0000\u0000\u0000a\u016a\u0001\u0000\u0000\u0000c\u016c\u0001"+
		"\u0000\u0000\u0000e\u016e\u0001\u0000\u0000\u0000g\u0172\u0001\u0000\u0000"+
		"\u0000i\u0175\u0001\u0000\u0000\u0000k\u0192\u0001\u0000\u0000\u0000m"+
		"\u019d\u0001\u0000\u0000\u0000o\u01a3\u0001\u0000\u0000\u0000qr\u0005"+
		"c\u0000\u0000rs\u0005l\u0000\u0000st\u0005a\u0000\u0000tu\u0005s\u0000"+
		"\u0000uv\u0005s\u0000\u0000v\u0002\u0001\u0000\u0000\u0000wx\u0005i\u0000"+
		"\u0000xy\u0005n\u0000\u0000yz\u0005h\u0000\u0000z{\u0005e\u0000\u0000"+
		"{|\u0005r\u0000\u0000|}\u0005i\u0000\u0000}~\u0005t\u0000\u0000~\u007f"+
		"\u0005s\u0000\u0000\u007f\u0004\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"n\u0000\u0000\u0081\u0082\u0005e\u0000\u0000\u0082\u0083\u0005w\u0000"+
		"\u0000\u0083\u0006\u0001\u0000\u0000\u0000\u0084\u0085\u0005s\u0000\u0000"+
		"\u0085\u0086\u0005e\u0000\u0000\u0086\u0087\u0005l\u0000\u0000\u0087\u0088"+
		"\u0005f\u0000\u0000\u0088\b\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"i\u0000\u0000\u008a\u008b\u0005f\u0000\u0000\u008b\n\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005t\u0000\u0000\u008d\u008e\u0005h\u0000\u0000\u008e"+
		"\u008f\u0005e\u0000\u0000\u008f\u0090\u0005n\u0000\u0000\u0090\f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005e\u0000\u0000\u0092\u0093\u0005l\u0000"+
		"\u0000\u0093\u0094\u0005s\u0000\u0000\u0094\u0095\u0005e\u0000\u0000\u0095"+
		"\u000e\u0001\u0000\u0000\u0000\u0096\u0097\u0005f\u0000\u0000\u0097\u0098"+
		"\u0005i\u0000\u0000\u0098\u0010\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"l\u0000\u0000\u009a\u009b\u0005e\u0000\u0000\u009b\u009c\u0005t\u0000"+
		"\u0000\u009c\u0012\u0001\u0000\u0000\u0000\u009d\u009e\u0005i\u0000\u0000"+
		"\u009e\u009f\u0005n\u0000\u0000\u009f\u0014\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005c\u0000\u0000\u00a1\u00a2\u0005a\u0000\u0000\u00a2\u00a3\u0005"+
		"s\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4\u0016\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005o\u0000\u0000\u00a6\u00a7\u0005f\u0000\u0000\u00a7"+
		"\u0018\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005=\u0000\u0000\u00a9\u00aa"+
		"\u0005>\u0000\u0000\u00aa\u001a\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"e\u0000\u0000\u00ac\u00ad\u0005s\u0000\u0000\u00ad\u00ae\u0005a\u0000"+
		"\u0000\u00ae\u00af\u0005c\u0000\u0000\u00af\u001c\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005w\u0000\u0000\u00b1\u00b2\u0005h\u0000\u0000\u00b2\u00b3"+
		"\u0005i\u0000\u0000\u00b3\u00b4\u0005l\u0000\u0000\u00b4\u00b5\u0005e"+
		"\u0000\u0000\u00b5\u001e\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005l\u0000"+
		"\u0000\u00b7\u00b8\u0005o\u0000\u0000\u00b8\u00b9\u0005o\u0000\u0000\u00b9"+
		"\u00ba\u0005p\u0000\u0000\u00ba \u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"p\u0000\u0000\u00bc\u00bd\u0005o\u0000\u0000\u00bd\u00be\u0005o\u0000"+
		"\u0000\u00be\u00bf\u0005l\u0000\u0000\u00bf\"\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0005n\u0000\u0000\u00c1\u00c2\u0005o\u0000\u0000\u00c2\u00c3"+
		"\u0005t\u0000\u0000\u00c3$\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005t"+
		"\u0000\u0000\u00c5\u00c6\u0005r\u0000\u0000\u00c6\u00c7\u0005u\u0000\u0000"+
		"\u00c7\u00ce\u0005e\u0000\u0000\u00c8\u00c9\u0005f\u0000\u0000\u00c9\u00ca"+
		"\u0005a\u0000\u0000\u00ca\u00cb\u0005l\u0000\u0000\u00cb\u00cc\u0005s"+
		"\u0000\u0000\u00cc\u00ce\u0005e\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000"+
		"\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000\u00ce&\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0005i\u0000\u0000\u00d0\u00d1\u0005s\u0000\u0000\u00d1\u00d2"+
		"\u0005v\u0000\u0000\u00d2\u00d3\u0005o\u0000\u0000\u00d3\u00d4\u0005i"+
		"\u0000\u0000\u00d4\u00d5\u0005d\u0000\u0000\u00d5(\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005+\u0000\u0000\u00d7*\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005-\u0000\u0000\u00d9,\u0001\u0000\u0000\u0000\u00da\u00db\u0005~"+
		"\u0000\u0000\u00db.\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005/\u0000\u0000"+
		"\u00dd0\u0001\u0000\u0000\u0000\u00de\u00df\u0005*\u0000\u0000\u00df2"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005=\u0000\u0000\u00e14\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005<\u0000\u0000\u00e36\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0005<\u0000\u0000\u00e5\u00e6\u0005=\u0000\u0000\u00e68"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005<\u0000\u0000\u00e8\u00e9\u0005"+
		"-\u0000\u0000\u00e9:\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005O\u0000"+
		"\u0000\u00eb\u00ec\u0005b\u0000\u0000\u00ec\u00ed\u0005j\u0000\u0000\u00ed"+
		"\u00ee\u0005e\u0000\u0000\u00ee\u00ef\u0005c\u0000\u0000\u00ef\u0109\u0005"+
		"t\u0000\u0000\u00f0\u00f1\u0005I\u0000\u0000\u00f1\u0109\u0005O\u0000"+
		"\u0000\u00f2\u00f3\u0005I\u0000\u0000\u00f3\u00f4\u0005n\u0000\u0000\u00f4"+
		"\u0109\u0005t\u0000\u0000\u00f5\u00f6\u0005S\u0000\u0000\u00f6\u00f7\u0005"+
		"t\u0000\u0000\u00f7\u00f8\u0005r\u0000\u0000\u00f8\u00f9\u0005i\u0000"+
		"\u0000\u00f9\u00fa\u0005n\u0000\u0000\u00fa\u0109\u0005g\u0000\u0000\u00fb"+
		"\u00fc\u0005B\u0000\u0000\u00fc\u00fd\u0005o\u0000\u0000\u00fd\u00fe\u0005"+
		"o\u0000\u0000\u00fe\u0109\u0005l\u0000\u0000\u00ff\u0100\u0005S\u0000"+
		"\u0000\u0100\u0101\u0005E\u0000\u0000\u0101\u0102\u0005L\u0000\u0000\u0102"+
		"\u0103\u0005F\u0000\u0000\u0103\u0104\u0005_\u0000\u0000\u0104\u0105\u0005"+
		"T\u0000\u0000\u0105\u0106\u0005Y\u0000\u0000\u0106\u0107\u0005P\u0000"+
		"\u0000\u0107\u0109\u0005E\u0000\u0000\u0108\u00ea\u0001\u0000\u0000\u0000"+
		"\u0108\u00f0\u0001\u0000\u0000\u0000\u0108\u00f2\u0001\u0000\u0000\u0000"+
		"\u0108\u00f5\u0001\u0000\u0000\u0000\u0108\u00fb\u0001\u0000\u0000\u0000"+
		"\u0108\u00ff\u0001\u0000\u0000\u0000\u0109<\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005.\u0000\u0000\u010b>\u0001\u0000\u0000\u0000\u010c\u010d\u0005"+
		"@\u0000\u0000\u010d@\u0001\u0000\u0000\u0000\u010e\u010f\u0005(\u0000"+
		"\u0000\u010fB\u0001\u0000\u0000\u0000\u0110\u0111\u0005)\u0000\u0000\u0111"+
		"D\u0001\u0000\u0000\u0000\u0112\u0113\u0005{\u0000\u0000\u0113F\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0005}\u0000\u0000\u0115H\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005,\u0000\u0000\u0117J\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0005;\u0000\u0000\u0119L\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		":\u0000\u0000\u011bN\u0001\u0000\u0000\u0000\u011c\u011d\u0007\u0000\u0000"+
		"\u0000\u011dP\u0001\u0000\u0000\u0000\u011e\u0120\u0003O\'\u0000\u011f"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"R\u0001\u0000\u0000\u0000\u0123\u0124\u0007\u0001\u0000\u0000\u0124T\u0001"+
		"\u0000\u0000\u0000\u0125\u0127\u0005\r\u0000\u0000\u0126\u0125\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0005\n\u0000\u0000\u0129V\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005-\u0000\u0000\u012b\u012c\u0005-\u0000\u0000\u012c"+
		"\u0130\u0001\u0000\u0000\u0000\u012d\u012f\t\u0000\u0000\u0000\u012e\u012d"+
		"\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u0131"+
		"\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0135"+
		"\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0136"+
		"\u0003U*\u0000\u0134\u0136\u0005\u0000\u0000\u0001\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0006+\u0000\u0000\u0138X\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0005*\u0000\u0000\u013a\u013b\u0005)\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0006,\u0001\u0000\u013dZ\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0005(\u0000\u0000\u013f\u0140\u0005*\u0000\u0000"+
		"\u0140\u0145\u0001\u0000\u0000\u0000\u0141\u0144\u0003[-\u0000\u0142\u0144"+
		"\t\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0142\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0148\u0001"+
		"\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u0005"+
		"*\u0000\u0000\u0149\u014a\u0005)\u0000\u0000\u014a\u014b\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0006-\u0000\u0000\u014c\\\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0005(\u0000\u0000\u014e\u014f\u0005*\u0000\u0000\u014f\u0155"+
		"\u0001\u0000\u0000\u0000\u0150\u0154\u0003[-\u0000\u0151\u0152\b\u0002"+
		"\u0000\u0000\u0152\u0154\t\u0000\u0000\u0000\u0153\u0150\u0001\u0000\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0005\u0000\u0000\u0001\u0159\u015a\u0006.\u0002\u0000"+
		"\u015a^\u0001\u0000\u0000\u0000\u015b\u015c\u0005\\\u0000\u0000\u015c"+
		"\u0169\u0005b\u0000\u0000\u015d\u015e\u0005\\\u0000\u0000\u015e\u0169"+
		"\u0005t\u0000\u0000\u015f\u0160\u0005\\\u0000\u0000\u0160\u0169\u0005"+
		"n\u0000\u0000\u0161\u0162\u0005\\\u0000\u0000\u0162\u0169\u0005f\u0000"+
		"\u0000\u0163\u0164\u0005\\\u0000\u0000\u0164\u0169\u0005\\\u0000\u0000"+
		"\u0165\u0166\u0005\\\u0000\u0000\u0166\u0167\u0005\\\u0000\u0000\u0167"+
		"\u0169\u0005n\u0000\u0000\u0168\u015b\u0001\u0000\u0000\u0000\u0168\u015d"+
		"\u0001\u0000\u0000\u0000\u0168\u015f\u0001\u0000\u0000\u0000\u0168\u0161"+
		"\u0001\u0000\u0000\u0000\u0168\u0163\u0001\u0000\u0000\u0000\u0168\u0165"+
		"\u0001\u0000\u0000\u0000\u0169`\u0001\u0000\u0000\u0000\u016a\u016b\u0005"+
		"\u0000\u0000\u0000\u016bb\u0001\u0000\u0000\u0000\u016c\u016d\u0005\\"+
		"\u0000\u0000\u016dd\u0001\u0000\u0000\u0000\u016e\u016f\u0005\\\u0000"+
		"\u0000\u016f\u0170\u0005\r\u0000\u0000\u0170\u0171\u0005\n\u0000\u0000"+
		"\u0171f\u0001\u0000\u0000\u0000\u0172\u0173\u0005\r\u0000\u0000\u0173"+
		"\u0174\u0005\n\u0000\u0000\u0174h\u0001\u0000\u0000\u0000\u0175\u0184"+
		"\u0005\"\u0000\u0000\u0176\u0177\u0003_/\u0000\u0177\u0178\u00064\u0003"+
		"\u0000\u0178\u0181\u0001\u0000\u0000\u0000\u0179\u0181\u0003e2\u0000\u017a"+
		"\u0181\u0003c1\u0000\u017b\u017c\u0003a0\u0000\u017c\u017d\u00064\u0004"+
		"\u0000\u017d\u0181\u0001\u0000\u0000\u0000\u017e\u017f\t\u0000\u0000\u0000"+
		"\u017f\u0181\u00064\u0005\u0000\u0180\u0176\u0001\u0000\u0000\u0000\u0180"+
		"\u0179\u0001\u0000\u0000\u0000\u0180\u017a\u0001\u0000\u0000\u0000\u0180"+
		"\u017b\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181"+
		"\u0183\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183"+
		"\u0186\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0184"+
		"\u0182\u0001\u0000\u0000\u0000\u0185\u018e\u0001\u0000\u0000\u0000\u0186"+
		"\u0184\u0001\u0000\u0000\u0000\u0187\u0188\u0005\"\u0000\u0000\u0188\u018f"+
		"\u00064\u0006\u0000\u0189\u018a\u0003g3\u0000\u018a\u018b\u00064\u0007"+
		"\u0000\u018b\u018f\u0001\u0000\u0000\u0000\u018c\u018d\u0005\u0000\u0000"+
		"\u0001\u018d\u018f\u00064\b\u0000\u018e\u0187\u0001\u0000\u0000\u0000"+
		"\u018e\u0189\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000"+
		"\u018fj\u0001\u0000\u0000\u0000\u0190\u0193\u0003S)\u0000\u0191\u0193"+
		"\u0005_\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0191\u0001"+
		"\u0000\u0000\u0000\u0193\u0199\u0001\u0000\u0000\u0000\u0194\u0198\u0003"+
		"S)\u0000\u0195\u0198\u0005_\u0000\u0000\u0196\u0198\u0003O\'\u0000\u0197"+
		"\u0194\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197"+
		"\u0196\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199"+
		"\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a"+
		"l\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019e"+
		"\u0007\u0003\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u00066\u0000\u0000\u01a2n\u0001\u0000\u0000\u0000\u01a3\u01a4\t\u0000"+
		"\u0000\u0000\u01a4\u01a5\u00067\t\u0000\u01a5p\u0001\u0000\u0000\u0000"+
		"\u0013\u0000\u00cd\u0108\u0121\u0126\u0130\u0135\u0143\u0145\u0153\u0155"+
		"\u0168\u0180\u0184\u018e\u0192\u0197\u0199\u019f\n\u0006\u0000\u0000\u0001"+
		",\u0000\u0001.\u0001\u00014\u0002\u00014\u0003\u00014\u0004\u00014\u0005"+
		"\u00014\u0006\u00014\u0007\u00017\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}