// Generated from b:\School\JLML\JLML\grammar\JLML.g4 by ANTLR 4.8
 #pragma warning disable 3021 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JLMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IDENTIFIER=2, STRING=3, NUMBER=4, LITERAL=5, WITH_EXPRESSION=6, 
		DECLARE_STATEMENT=7, SET_STATEMENT=8, FUNCTION_SIGNATURE=9, FUNCTION_PARAMETER_LIST=10, 
		OPEN_BRACE=11, CLOSE_BRACE=12, COLON=13, SEMICOLON=14, ADDICTIVE_OPERATORS=15, 
		MULTIPLICATIVE_OPERATORS=16, LINE_COMMENT=17, WS=18;
	public static final int
		RULE_jlml = 0, RULE_obj = 1, RULE_pair = 2, RULE_key = 3, RULE_value = 4, 
		RULE_math = 5, RULE_with = 6, RULE_headers = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"jlml", "obj", "pair", "key", "value", "math", "with", "headers"
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

	@Override
	public String getGrammarFileName() { return "JLML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JLMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JlmlContext extends ParserRuleContext {
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public HeadersContext headers() {
			return getRuleContext(HeadersContext.class,0);
		}
		public JlmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jlml; }
	}

	public final JlmlContext jlml() throws RecognitionException {
		JlmlContext _localctx = new JlmlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jlml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE_STATEMENT || _la==SET_STATEMENT) {
				{
				setState(16);
				headers();
				}
			}

			setState(19);
			obj();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACE) {
				{
				{
				setState(20);
				obj();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(JLMLParser.OPEN_BRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(JLMLParser.CLOSE_BRACE, 0); }
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		int _la;
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(OPEN_BRACE);
				setState(27);
				pair();
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING) | (1L << OPEN_BRACE))) != 0)) {
					{
					{
					setState(28);
					pair();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(OPEN_BRACE);
				setState(37);
				match(CLOSE_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JLMLParser.COLON, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(JLMLParser.SEMICOLON, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pair);
		int _la;
		try {
			int _alt;
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				key();
				setState(41);
				match(COLON);
				setState(43); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(42);
						value(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(45); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(47);
					match(SEMICOLON);
					}
				}

				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				obj();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JLMLParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JLMLParser.IDENTIFIER, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JLMLParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(JLMLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JLMLParser.NUMBER, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(JLMLParser.LITERAL, 0); }
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_value, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(56);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				{
				setState(57);
				match(STRING);
				}
				break;
			case NUMBER:
				{
				setState(58);
				match(NUMBER);
				}
				break;
			case OPEN_BRACE:
				{
				setState(59);
				obj();
				}
				break;
			case LITERAL:
				{
				setState(60);
				match(LITERAL);
				}
				break;
			case T__0:
				{
				setState(61);
				with();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_value);
					setState(64);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(66); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(65);
							math();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(68); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MathContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ADDICTIVE_OPERATORS() { return getToken(JLMLParser.ADDICTIVE_OPERATORS, 0); }
		public TerminalNode MULTIPLICATIVE_OPERATORS() { return getToken(JLMLParser.MULTIPLICATIVE_OPERATORS, 0); }
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==ADDICTIVE_OPERATORS || _la==MULTIPLICATIVE_OPERATORS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			value(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JLMLParser.STRING, 0); }
		public TerminalNode WITH_EXPRESSION() { return getToken(JLMLParser.WITH_EXPRESSION, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_with);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			match(STRING);
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(80);
				match(WITH_EXPRESSION);
				}
				break;
			}
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(83);
				obj();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadersContext extends ParserRuleContext {
		public TerminalNode DECLARE_STATEMENT() { return getToken(JLMLParser.DECLARE_STATEMENT, 0); }
		public TerminalNode SET_STATEMENT() { return getToken(JLMLParser.SET_STATEMENT, 0); }
		public HeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headers; }
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_headers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==DECLARE_STATEMENT || _la==SET_STATEMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return value_sempred((ValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\5\2\24\n\2\3\2"+
		"\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3"+
		"\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\6\4.\n\4\r\4\16\4/\3\4\5\4\63\n\4"+
		"\3\4\5\4\66\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\6\3\6\6"+
		"\6E\n\6\r\6\16\6F\7\6I\n\6\f\6\16\6L\13\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b"+
		"T\n\b\3\b\5\bW\n\b\3\t\3\t\3\t\2\3\n\n\2\4\6\b\n\f\16\20\2\5\3\2\4\5\3"+
		"\2\21\22\3\2\t\n\2b\2\23\3\2\2\2\4(\3\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2"+
		"\n@\3\2\2\2\fM\3\2\2\2\16P\3\2\2\2\20X\3\2\2\2\22\24\5\20\t\2\23\22\3"+
		"\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\31\5\4\3\2\26\30\5\4\3\2\27\26\3"+
		"\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3"+
		"\2\2\2\34\35\7\r\2\2\35!\5\6\4\2\36 \5\6\4\2\37\36\3\2\2\2 #\3\2\2\2!"+
		"\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\16\2\2%)\3\2\2\2&\'\7"+
		"\r\2\2\')\7\16\2\2(\34\3\2\2\2(&\3\2\2\2)\5\3\2\2\2*+\5\b\5\2+-\7\17\2"+
		"\2,.\5\n\6\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61"+
		"\63\7\20\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2\64\66\5\4\3\2\65"+
		"*\3\2\2\2\65\64\3\2\2\2\66\7\3\2\2\2\678\t\2\2\28\t\3\2\2\29:\b\6\1\2"+
		":A\7\4\2\2;A\7\5\2\2<A\7\6\2\2=A\5\4\3\2>A\7\7\2\2?A\5\16\b\2@9\3\2\2"+
		"\2@;\3\2\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2AJ\3\2\2\2BD\f\4\2"+
		"\2CE\5\f\7\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HB\3\2\2"+
		"\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LJ\3\2\2\2MN\t\3\2\2NO\5\n"+
		"\6\2O\r\3\2\2\2PQ\7\3\2\2QS\7\5\2\2RT\7\b\2\2SR\3\2\2\2ST\3\2\2\2TV\3"+
		"\2\2\2UW\5\4\3\2VU\3\2\2\2VW\3\2\2\2W\17\3\2\2\2XY\t\4\2\2Y\21\3\2\2\2"+
		"\16\23\31!(/\62\65@FJSV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}