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
public class JLMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IDENTIFIER=2, STRING=3, NUMBER=4, LITERAL=5, WITH_EXPRESSION=6, 
		DECLARE_STATEMENT=7, SET_STATEMENT=8, FUNCTION_SIGNATURE=9, FUNCTION_PARAMETER_LIST=10, 
		OPEN_BRACE=11, CLOSE_BRACE=12, COLON=13, SEMICOLON=14, ADDICTIVE_OPERATORS=15, 
		MULTIPLICATIVE_OPERATORS=16, LINE_COMMENT=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "IDENTIFIER", "STRING", "NUMBER", "LITERAL", "WITH_EXPRESSION", 
			"DECLARE_STATEMENT", "SET_STATEMENT", "FUNCTION_SIGNATURE", "FUNCTION_PARAMETER_LIST", 
			"OPEN_BRACE", "CLOSE_BRACE", "COLON", "SEMICOLON", "ADDICTIVE_OPERATORS", 
			"MULTIPLICATIVE_OPERATORS", "DOUBLE_QUOTE_CHAR", "SINGLE_QUOTE_CHAR", 
			"ESCAPE_SEQUENCE", "UNICODE_SEQUENCE", "SYMBOL", "HEX", "INT", "EXP", 
			"NEWLINE", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'using'", null, null, null, null, null, null, null, null, null, 
			"'{'", "'}'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "IDENTIFIER", "STRING", "NUMBER", "LITERAL", "WITH_EXPRESSION", 
			"DECLARE_STATEMENT", "SET_STATEMENT", "FUNCTION_SIGNATURE", "FUNCTION_PARAMETER_LIST", 
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


	public JLMLLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00fc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7"+
		"\3B\n\3\f\3\16\3E\13\3\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\3\4\7\4"+
		"Q\n\4\f\4\16\4T\13\4\3\4\5\4W\n\4\3\5\5\5Z\n\5\3\5\3\5\3\5\6\5_\n\5\r"+
		"\5\16\5`\5\5c\n\5\3\5\5\5f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6u\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0092"+
		"\n\t\f\t\16\t\u0095\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a0"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a8\n\13\f\13\16\13\u00ab\13"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\5\22\u00bb\n\22\3\23\3\23\5\23\u00bf\n\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u00cb\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\5\26\u00d4\n\26\3\27\3\27\3\30\3\30\3\30\7\30\u00db\n\30\f\30\16"+
		"\30\u00de\13\30\5\30\u00e0\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5\32"+
		"\u00e9\n\32\3\33\3\33\3\33\3\33\7\33\u00ef\n\33\f\33\16\33\u00f2\13\33"+
		"\3\33\3\33\3\34\6\34\u00f7\n\34\r\34\16\34\u00f8\3\34\3\34\2\2\35\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\23\67\24\3\2\21\4\2C\\c|\7\2/"+
		"\60\62;C\\aac|\3\2\62;\4\2--//\5\2\'\',,\61\61\6\2\f\f\17\17$$^^\6\2\f"+
		"\f\17\17))^^\f\2$$))\61\61^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^^ddhh"+
		"ppttvxzz\5\2\62;CHch\3\2\63;\4\2GGgg\5\2\f\f\17\17\u202a\u202b\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\2\u010d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5?\3\2"+
		"\2\2\7V\3\2\2\2\tY\3\2\2\2\13t\3\2\2\2\rv\3\2\2\2\17\177\3\2\2\2\21\u008a"+
		"\3\2\2\2\23\u009f\3\2\2\2\25\u00a1\3\2\2\2\27\u00ac\3\2\2\2\31\u00ae\3"+
		"\2\2\2\33\u00b0\3\2\2\2\35\u00b2\3\2\2\2\37\u00b4\3\2\2\2!\u00b6\3\2\2"+
		"\2#\u00ba\3\2\2\2%\u00be\3\2\2\2\'\u00c0\3\2\2\2)\u00cc\3\2\2\2+\u00d3"+
		"\3\2\2\2-\u00d5\3\2\2\2/\u00df\3\2\2\2\61\u00e1\3\2\2\2\63\u00e8\3\2\2"+
		"\2\65\u00ea\3\2\2\2\67\u00f6\3\2\2\29:\7w\2\2:;\7u\2\2;<\7k\2\2<=\7p\2"+
		"\2=>\7i\2\2>\4\3\2\2\2?C\t\2\2\2@B\t\3\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2"+
		"\2CD\3\2\2\2D\6\3\2\2\2EC\3\2\2\2FJ\7$\2\2GI\5#\22\2HG\3\2\2\2IL\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MW\7$\2\2NR\7)\2\2OQ\5%\23\2"+
		"PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UW\7)\2\2"+
		"VF\3\2\2\2VN\3\2\2\2W\b\3\2\2\2XZ\7/\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2"+
		"[b\5/\30\2\\^\7\60\2\2]_\t\4\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2"+
		"\2ac\3\2\2\2b\\\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\5\61\31\2ed\3\2\2\2ef\3"+
		"\2\2\2f\n\3\2\2\2gh\7v\2\2hi\7t\2\2ij\7w\2\2ju\7g\2\2kl\7h\2\2lm\7c\2"+
		"\2mn\7n\2\2no\7u\2\2ou\7g\2\2pq\7p\2\2qr\7w\2\2rs\7n\2\2su\7n\2\2tg\3"+
		"\2\2\2tk\3\2\2\2tp\3\2\2\2u\f\3\2\2\2vw\7y\2\2wx\7k\2\2xy\7v\2\2yz\7j"+
		"\2\2z{\3\2\2\2{|\7*\2\2|}\5\5\3\2}~\7+\2\2~\16\3\2\2\2\177\u0080\7f\2"+
		"\2\u0080\u0081\7g\2\2\u0081\u0082\7e\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\5\5\3\2\u0088\u0089\5\7\4\2\u0089\20\3\2\2\2\u008a\u008b\7u\2\2"+
		"\u008b\u008c\7g\2\2\u008c\u008d\7v\2\2\u008d\u008e\3\2\2\2\u008e\u0093"+
		"\5\5\3\2\u008f\u0090\7\60\2\2\u0090\u0092\5\5\3\2\u0091\u008f\3\2\2\2"+
		"\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\7\4\2\u0097\22\3\2\2\2\u0098"+
		"\u0099\7*\2\2\u0099\u00a0\7+\2\2\u009a\u009b\7*\2\2\u009b\u009c\5\25\13"+
		"\2\u009c\u009d\7+\2\2\u009d\u00a0\3\2\2\2\u009e\u00a0\5\7\4\2\u009f\u0098"+
		"\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\24\3\2\2\2\u00a1"+
		"\u00a2\5\5\3\2\u00a2\u00a9\5\7\4\2\u00a3\u00a4\7.\2\2\u00a4\u00a5\5\5"+
		"\3\2\u00a5\u00a6\5\7\4\2\u00a6\u00a8\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\26\3\2\2"+
		"\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7}\2\2\u00ad\30\3\2\2\2\u00ae\u00af"+
		"\7\177\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7<\2\2\u00b1\34\3\2\2\2\u00b2"+
		"\u00b3\7=\2\2\u00b3\36\3\2\2\2\u00b4\u00b5\t\5\2\2\u00b5 \3\2\2\2\u00b6"+
		"\u00b7\t\6\2\2\u00b7\"\3\2\2\2\u00b8\u00bb\n\7\2\2\u00b9\u00bb\5\'\24"+
		"\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb$\3\2\2\2\u00bc\u00bf"+
		"\n\b\2\2\u00bd\u00bf\5\'\24\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2"+
		"\u00bf&\3\2\2\2\u00c0\u00ca\7^\2\2\u00c1\u00cb\5\63\32\2\u00c2\u00cb\5"+
		")\25\2\u00c3\u00cb\t\t\2\2\u00c4\u00cb\n\n\2\2\u00c5\u00cb\7\62\2\2\u00c6"+
		"\u00c7\7z\2\2\u00c7\u00c8\5-\27\2\u00c8\u00c9\5-\27\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c3\3\2\2\2\u00ca"+
		"\u00c4\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb(\3\2\2\2"+
		"\u00cc\u00cd\7w\2\2\u00cd\u00ce\5-\27\2\u00ce\u00cf\5-\27\2\u00cf\u00d0"+
		"\5-\27\2\u00d0\u00d1\5-\27\2\u00d1*\3\2\2\2\u00d2\u00d4\t\5\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4,\3\2\2\2\u00d5\u00d6\t\13\2\2"+
		"\u00d6.\3\2\2\2\u00d7\u00e0\7\62\2\2\u00d8\u00dc\t\f\2\2\u00d9\u00db\t"+
		"\4\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00d7\3\2"+
		"\2\2\u00df\u00d8\3\2\2\2\u00e0\60\3\2\2\2\u00e1\u00e2\t\r\2\2\u00e2\u00e3"+
		"\5+\26\2\u00e3\u00e4\5/\30\2\u00e4\62\3\2\2\2\u00e5\u00e6\7\17\2\2\u00e6"+
		"\u00e9\7\f\2\2\u00e7\u00e9\t\16\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e7\3"+
		"\2\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\7\61\2\2\u00ec"+
		"\u00f0\3\2\2\2\u00ed\u00ef\n\17\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3"+
		"\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\b\33\2\2\u00f4\66\3\2\2\2\u00f5\u00f7\t\20"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b\34\3\2\u00fb8\3\2\2\2"+
		"\30\2CJRVY`bet\u0093\u009f\u00a9\u00ba\u00be\u00ca\u00d3\u00dc\u00df\u00e8"+
		"\u00f0\u00f8\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}