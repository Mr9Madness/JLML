// Generated from b:\School\JLML\JLML\grammar\JLML.g4 by ANTLR 4.8

#pragma warning disable 3021

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTIFIER=7, STRING=8, 
		NUMBER=9, LITERAL=10, LAMBDA_EXPRESSION=11, FUNCTION_SIGNATURE=12, FUNCTION_PARAMETER_LIST=13, 
		OPEN_BRACE=14, CLOSE_BRACE=15, COLON=16, SEMICOLON=17, ADDICTIVE_OPERATORS=18, 
		MULTIPLICATIVE_OPERATORS=19, LINE_COMMENT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "IDENTIFIER", "STRING", 
			"NUMBER", "LITERAL", "LAMBDA_EXPRESSION", "FUNCTION_SIGNATURE", "FUNCTION_PARAMETER_LIST", 
			"OPEN_BRACE", "CLOSE_BRACE", "COLON", "SEMICOLON", "ADDICTIVE_OPERATORS", 
			"MULTIPLICATIVE_OPERATORS", "DOUBLE_QUOTE_CHAR", "SINGLE_QUOTE_CHAR", 
			"ESCAPE_SEQUENCE", "UNICODE_SEQUENCE", "SYMBOL", "HEX", "INT", "EXP", 
			"NEWLINE", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'with'", "'('", "')'", "'['", "']'", null, null, null, 
			null, null, null, null, "'{'", "'}'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IDENTIFIER", "STRING", "NUMBER", 
			"LITERAL", "LAMBDA_EXPRESSION", "FUNCTION_SIGNATURE", "FUNCTION_PARAMETER_LIST", 
			"OPEN_BRACE", "CLOSE_BRACE", "COLON", "SEMICOLON", "ADDICTIVE_OPERATORS", 
			"MULTIPLICATIVE_OPERATORS", "LINE_COMMENT", "WS"
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


	public NmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JLML.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00f8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\bQ"+
		"\n\b\f\b\16\bT\13\b\3\t\3\t\7\tX\n\t\f\t\16\t[\13\t\3\t\3\t\3\t\7\t`\n"+
		"\t\f\t\16\tc\13\t\3\t\5\tf\n\t\3\n\5\ni\n\n\3\n\3\n\3\n\6\nn\n\n\r\n\16"+
		"\no\5\nr\n\n\3\n\5\nu\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0084\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0093\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009c"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a4\n\16\f\16\16\16\u00a7\13"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\5\25\u00b7\n\25\3\26\3\26\5\26\u00bb\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00c7\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\5\31\u00d0\n\31\3\32\3\32\3\33\3\33\3\33\7\33\u00d7\n\33\f\33\16"+
		"\33\u00da\13\33\5\33\u00dc\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\5\35"+
		"\u00e5\n\35\3\36\3\36\3\36\3\36\7\36\u00eb\n\36\f\36\16\36\u00ee\13\36"+
		"\3\36\3\36\3\37\6\37\u00f3\n\37\r\37\16\37\u00f4\3\37\3\37\2\2 \3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\26=\27\3\2\21\4"+
		"\2C\\c|\7\2/\60\62;C\\aac|\3\2\62;\4\2--//\5\2\'\',,\61\61\6\2\f\f\17"+
		"\17$$^^\6\2\f\f\17\17))^^\f\2$$))\61\61^^ddhhppttvvxx\16\2\f\f\17\17$"+
		"$))\62;^^ddhhppttvxzz\5\2\62;CHch\3\2\63;\4\2GGgg\5\2\f\f\17\17\u202a"+
		"\u202b\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0109\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7F\3\2\2\2\tH\3\2\2"+
		"\2\13J\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21e\3\2\2\2\23h\3\2\2\2\25\u0083"+
		"\3\2\2\2\27\u0092\3\2\2\2\31\u009b\3\2\2\2\33\u009d\3\2\2\2\35\u00a8\3"+
		"\2\2\2\37\u00aa\3\2\2\2!\u00ac\3\2\2\2#\u00ae\3\2\2\2%\u00b0\3\2\2\2\'"+
		"\u00b2\3\2\2\2)\u00b6\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3\2\2\2/\u00c8\3\2"+
		"\2\2\61\u00cf\3\2\2\2\63\u00d1\3\2\2\2\65\u00db\3\2\2\2\67\u00dd\3\2\2"+
		"\29\u00e4\3\2\2\2;\u00e6\3\2\2\2=\u00f2\3\2\2\2?@\7.\2\2@\4\3\2\2\2AB"+
		"\7y\2\2BC\7k\2\2CD\7v\2\2DE\7j\2\2E\6\3\2\2\2FG\7*\2\2G\b\3\2\2\2HI\7"+
		"+\2\2I\n\3\2\2\2JK\7]\2\2K\f\3\2\2\2LM\7_\2\2M\16\3\2\2\2NR\t\2\2\2OQ"+
		"\t\3\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\20\3\2\2\2TR\3\2\2\2"+
		"UY\7$\2\2VX\5)\25\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2"+
		"[Y\3\2\2\2\\f\7$\2\2]a\7)\2\2^`\5+\26\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2df\7)\2\2eU\3\2\2\2e]\3\2\2\2f\22\3\2\2"+
		"\2gi\7/\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jq\5\65\33\2km\7\60\2\2ln\t\4"+
		"\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qk\3\2\2\2qr\3\2"+
		"\2\2rt\3\2\2\2su\5\67\34\2ts\3\2\2\2tu\3\2\2\2u\24\3\2\2\2vw\7v\2\2wx"+
		"\7t\2\2xy\7w\2\2y\u0084\7g\2\2z{\7h\2\2{|\7c\2\2|}\7n\2\2}~\7u\2\2~\u0084"+
		"\7g\2\2\177\u0080\7p\2\2\u0080\u0081\7w\2\2\u0081\u0082\7n\2\2\u0082\u0084"+
		"\7n\2\2\u0083v\3\2\2\2\u0083z\3\2\2\2\u0083\177\3\2\2\2\u0084\26\3\2\2"+
		"\2\u0085\u0086\5\31\r\2\u0086\u0087\7?\2\2\u0087\u0088\7@\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\7}\2\2\u008a\u008b\7\177\2\2\u008b\u0093\3\2\2\2"+
		"\u008c\u008d\5\31\r\2\u008d\u008e\7?\2\2\u008e\u008f\7@\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\5\21\t\2\u0091\u0093\3\2\2\2\u0092\u0085\3\2\2\2"+
		"\u0092\u008c\3\2\2\2\u0093\30\3\2\2\2\u0094\u0095\7*\2\2\u0095\u009c\7"+
		"+\2\2\u0096\u0097\7*\2\2\u0097\u0098\5\33\16\2\u0098\u0099\7+\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u009c\5\21\t\2\u009b\u0094\3\2\2\2\u009b\u0096\3"+
		"\2\2\2\u009b\u009a\3\2\2\2\u009c\32\3\2\2\2\u009d\u009e\5\17\b\2\u009e"+
		"\u00a5\5\21\t\2\u009f\u00a0\7.\2\2\u00a0\u00a1\5\17\b\2\u00a1\u00a2\5"+
		"\21\t\2\u00a2\u00a4\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\34\3\2\2\2\u00a7\u00a5\3\2\2"+
		"\2\u00a8\u00a9\7}\2\2\u00a9\36\3\2\2\2\u00aa\u00ab\7\177\2\2\u00ab \3"+
		"\2\2\2\u00ac\u00ad\7<\2\2\u00ad\"\3\2\2\2\u00ae\u00af\7=\2\2\u00af$\3"+
		"\2\2\2\u00b0\u00b1\t\5\2\2\u00b1&\3\2\2\2\u00b2\u00b3\t\6\2\2\u00b3(\3"+
		"\2\2\2\u00b4\u00b7\n\7\2\2\u00b5\u00b7\5-\27\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7*\3\2\2\2\u00b8\u00bb\n\b\2\2\u00b9\u00bb\5-\27\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb,\3\2\2\2\u00bc\u00c6\7"+
		"^\2\2\u00bd\u00c7\59\35\2\u00be\u00c7\5/\30\2\u00bf\u00c7\t\t\2\2\u00c0"+
		"\u00c7\n\n\2\2\u00c1\u00c7\7\62\2\2\u00c2\u00c3\7z\2\2\u00c3\u00c4\5\63"+
		"\32\2\u00c4\u00c5\5\63\32\2\u00c5\u00c7\3\2\2\2\u00c6\u00bd\3\2\2\2\u00c6"+
		"\u00be\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3\2"+
		"\2\2\u00c6\u00c2\3\2\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca"+
		"\5\63\32\2\u00ca\u00cb\5\63\32\2\u00cb\u00cc\5\63\32\2\u00cc\u00cd\5\63"+
		"\32\2\u00cd\60\3\2\2\2\u00ce\u00d0\t\5\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\62\3\2\2\2\u00d1\u00d2\t\13\2\2\u00d2\64\3\2\2\2\u00d3"+
		"\u00dc\7\62\2\2\u00d4\u00d8\t\f\2\2\u00d5\u00d7\t\4\2\2\u00d6\u00d5\3"+
		"\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2"+
		"\2\2\u00dc\66\3\2\2\2\u00dd\u00de\t\r\2\2\u00de\u00df\5\61\31\2\u00df"+
		"\u00e0\5\65\33\2\u00e08\3\2\2\2\u00e1\u00e2\7\17\2\2\u00e2\u00e5\7\f\2"+
		"\2\u00e3\u00e5\t\16\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		":\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00ec\3\2\2"+
		"\2\u00e9\u00eb\n\17\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00f0\b\36\2\2\u00f0<\3\2\2\2\u00f1\u00f3\t\20\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\b\37\3\2\u00f7>\3\2\2\2\30\2RYaehoqt\u0083"+
		"\u0092\u009b\u00a5\u00b6\u00ba\u00c6\u00cf\u00d8\u00db\u00e4\u00ec\u00f4"+
		"\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}