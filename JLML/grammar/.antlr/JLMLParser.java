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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, IDENTIFIER=8, 
		STRING=9, NUMBER=10, LITERAL=11, USABLE_TOKENS=12, WITH_EXPRESSION=13, 
		DECLARE_STATEMENT=14, SET_STATEMENT=15, PROPERTY_NAME=16, OPEN_BRACE=17, 
		CLOSE_BRACE=18, COLON=19, SEMICOLON=20, COMPARE_TOKENS=21, ADDICTIVE_OPERATORS=22, 
		MULTIPLICATIVE_OPERATORS=23, LINE_COMMENT=24, WS=25;
	public static final int
		RULE_jlml = 0, RULE_headers = 1, RULE_element = 2, RULE_elementkey = 3, 
		RULE_pair = 4, RULE_key = 5, RULE_value = 6, RULE_math = 7, RULE_with = 8, 
		RULE_when = 9, RULE_whenthen = 10, RULE_list = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"jlml", "headers", "element", "elementkey", "pair", "key", "value", "math", 
			"with", "when", "whenthen", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'using'", "'when'", "'then'", "'else'", "'('", "','", "')'", null, 
			null, null, null, null, null, null, null, null, "'{'", "'}'", "':'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "IDENTIFIER", "STRING", 
			"NUMBER", "LITERAL", "USABLE_TOKENS", "WITH_EXPRESSION", "DECLARE_STATEMENT", 
			"SET_STATEMENT", "PROPERTY_NAME", "OPEN_BRACE", "CLOSE_BRACE", "COLON", 
			"SEMICOLON", "COMPARE_TOKENS", "ADDICTIVE_OPERATORS", "MULTIPLICATIVE_OPERATORS", 
			"LINE_COMMENT", "WS"
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
		public List<HeadersContext> headers() {
			return getRuleContexts(HeadersContext.class);
		}
		public HeadersContext headers(int i) {
			return getRuleContext(HeadersContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE_STATEMENT || _la==SET_STATEMENT) {
				{
				{
				setState(24);
				headers();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				element();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==OPEN_BRACE );
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
		enterRule(_localctx, 2, RULE_headers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(JLMLParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(JLMLParser.CLOSE_BRACE, 0); }
		public ElementkeyContext elementkey() {
			return getRuleContext(ElementkeyContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(37);
				elementkey();
				}
			}

			setState(40);
			match(OPEN_BRACE);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(41);
					element();
					}
					break;
				case 2:
					{
					setState(42);
					pair();
					}
					break;
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==OPEN_BRACE );
			setState(47);
			match(CLOSE_BRACE);
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

	public static class ElementkeyContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JLMLParser.COLON, 0); }
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public ElementkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementkey; }
	}

	public final ElementkeyContext elementkey() throws RecognitionException {
		ElementkeyContext _localctx = new ElementkeyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elementkey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			key();
			setState(50);
			match(COLON);
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(51);
				with();
				}
				break;
			case T__1:
				{
				setState(52);
				when();
				}
				break;
			case OPEN_BRACE:
				break;
			default:
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

	public static class PairContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JLMLParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JLMLParser.SEMICOLON, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			key();
			setState(56);
			match(COLON);
			setState(57);
			value(0);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(58);
				match(SEMICOLON);
				}
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JLMLParser.IDENTIFIER, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IDENTIFIER);
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
		public TerminalNode LITERAL() { return getToken(JLMLParser.LITERAL, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public WhenthenContext whenthen() {
			return getRuleContext(WhenthenContext.class,0);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_value, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(64);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				{
				setState(65);
				match(STRING);
				}
				break;
			case NUMBER:
				{
				setState(66);
				match(NUMBER);
				}
				break;
			case LITERAL:
				{
				setState(67);
				match(LITERAL);
				}
				break;
			case T__4:
				{
				setState(68);
				list();
				}
				break;
			case T__1:
				{
				setState(69);
				whenthen();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
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
					setState(72);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(74); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(73);
							math();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(76); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(82);
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
		public Token op;
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
		enterRule(_localctx, 14, RULE_math);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDICTIVE_OPERATORS:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((MathContext)_localctx).op = match(ADDICTIVE_OPERATORS);
				setState(84);
				value(0);
				}
				break;
			case MULTIPLICATIVE_OPERATORS:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((MathContext)_localctx).op = match(MULTIPLICATIVE_OPERATORS);
				setState(86);
				value(0);
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

	public static class WithContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JLMLParser.STRING, 0); }
		public TerminalNode WITH_EXPRESSION() { return getToken(JLMLParser.WITH_EXPRESSION, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__0);
			setState(90);
			match(STRING);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_EXPRESSION) {
				{
				setState(91);
				match(WITH_EXPRESSION);
				}
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

	public static class WhenContext extends ParserRuleContext {
		public TerminalNode PROPERTY_NAME() { return getToken(JLMLParser.PROPERTY_NAME, 0); }
		public TerminalNode COMPARE_TOKENS() { return getToken(JLMLParser.COMPARE_TOKENS, 0); }
		public TerminalNode USABLE_TOKENS() { return getToken(JLMLParser.USABLE_TOKENS, 0); }
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_when);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__1);
			setState(95);
			match(PROPERTY_NAME);
			setState(96);
			match(COMPARE_TOKENS);
			setState(97);
			match(USABLE_TOKENS);
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

	public static class WhenthenContext extends ParserRuleContext {
		public TerminalNode PROPERTY_NAME() { return getToken(JLMLParser.PROPERTY_NAME, 0); }
		public TerminalNode COMPARE_TOKENS() { return getToken(JLMLParser.COMPARE_TOKENS, 0); }
		public TerminalNode USABLE_TOKENS() { return getToken(JLMLParser.USABLE_TOKENS, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public WhenthenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenthen; }
	}

	public final WhenthenContext whenthen() throws RecognitionException {
		WhenthenContext _localctx = new WhenthenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whenthen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__1);
			setState(100);
			match(PROPERTY_NAME);
			setState(101);
			match(COMPARE_TOKENS);
			setState(102);
			match(USABLE_TOKENS);
			setState(103);
			match(T__2);
			setState(104);
			value(0);
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(105);
				match(T__3);
				setState(106);
				value(0);
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

	public static class ListContext extends ParserRuleContext {
		public List<TerminalNode> USABLE_TOKENS() { return getTokens(JLMLParser.USABLE_TOKENS); }
		public TerminalNode USABLE_TOKENS(int i) {
			return getToken(JLMLParser.USABLE_TOKENS, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__4);
				setState(110);
				match(USABLE_TOKENS);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(111);
					match(T__5);
					setState(112);
					match(USABLE_TOKENS);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__4);
				setState(120);
				match(T__6);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33~\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\6\2\"\n\2\r\2\16\2"+
		"#\3\3\3\3\3\4\5\4)\n\4\3\4\3\4\3\4\6\4.\n\4\r\4\16\4/\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\5\6>\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bI\n\b\3\b\3\b\6\bM\n\b\r\b\16\bN\7\bQ\n\b\f\b\16\bT\13\b\3"+
		"\t\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fn\n\f\3\r\3\r\3\r\3\r\7\rt\n\r\f\r"+
		"\16\rw\13\r\3\r\3\r\3\r\5\r|\n\r\3\r\2\3\16\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\3\3\2\20\21\2\u0085\2\35\3\2\2\2\4%\3\2\2\2\6(\3\2\2\2\b\63\3"+
		"\2\2\2\n9\3\2\2\2\f?\3\2\2\2\16H\3\2\2\2\20Y\3\2\2\2\22[\3\2\2\2\24`\3"+
		"\2\2\2\26e\3\2\2\2\30{\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2"+
		"\2\35\33\3\2\2\2\35\36\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2 \"\5\6\4\2! "+
		"\3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%&\t\2\2\2&\5\3\2\2"+
		"\2\')\5\b\5\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*-\7\23\2\2+.\5\6\4\2,.\5"+
		"\n\6\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2"+
		"\2\61\62\7\24\2\2\62\7\3\2\2\2\63\64\5\f\7\2\64\67\7\25\2\2\658\5\22\n"+
		"\2\668\5\24\13\2\67\65\3\2\2\2\67\66\3\2\2\2\678\3\2\2\28\t\3\2\2\29:"+
		"\5\f\7\2:;\7\25\2\2;=\5\16\b\2<>\7\26\2\2=<\3\2\2\2=>\3\2\2\2>\13\3\2"+
		"\2\2?@\7\n\2\2@\r\3\2\2\2AB\b\b\1\2BI\7\n\2\2CI\7\13\2\2DI\7\f\2\2EI\7"+
		"\r\2\2FI\5\30\r\2GI\5\26\f\2HA\3\2\2\2HC\3\2\2\2HD\3\2\2\2HE\3\2\2\2H"+
		"F\3\2\2\2HG\3\2\2\2IR\3\2\2\2JL\f\4\2\2KM\5\20\t\2LK\3\2\2\2MN\3\2\2\2"+
		"NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PJ\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2"+
		"S\17\3\2\2\2TR\3\2\2\2UV\7\30\2\2VZ\5\16\b\2WX\7\31\2\2XZ\5\16\b\2YU\3"+
		"\2\2\2YW\3\2\2\2Z\21\3\2\2\2[\\\7\3\2\2\\^\7\13\2\2]_\7\17\2\2^]\3\2\2"+
		"\2^_\3\2\2\2_\23\3\2\2\2`a\7\4\2\2ab\7\22\2\2bc\7\27\2\2cd\7\16\2\2d\25"+
		"\3\2\2\2ef\7\4\2\2fg\7\22\2\2gh\7\27\2\2hi\7\16\2\2ij\7\5\2\2jm\5\16\b"+
		"\2kl\7\6\2\2ln\5\16\b\2mk\3\2\2\2mn\3\2\2\2n\27\3\2\2\2op\7\7\2\2pu\7"+
		"\16\2\2qr\7\b\2\2rt\7\16\2\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v"+
		"x\3\2\2\2wu\3\2\2\2x|\7\t\2\2yz\7\7\2\2z|\7\t\2\2{o\3\2\2\2{y\3\2\2\2"+
		"|\31\3\2\2\2\21\35#(-/\67=HNRY^mu{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}