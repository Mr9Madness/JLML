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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, IDENTIFIER=12, STRING=13, NUMBER=14, LITERAL=15, USABLE_TOKENS=16, 
		WITH_EXPRESSION=17, DECLARE_STATEMENT=18, SET_STATEMENT=19, PROPERTY_NAME=20, 
		OPEN_BRACE=21, CLOSE_BRACE=22, COLON=23, SEMICOLON=24, COMPARE_TOKENS=25, 
		ADDICTIVE_OPERATORS=26, MULTIPLICATIVE_OPERATORS=27, LINE_COMMENT=28, 
		WS=29;
	public static final int
		RULE_jlml = 0, RULE_headers = 1, RULE_element = 2, RULE_elementkey = 3, 
		RULE_pair = 4, RULE_key = 5, RULE_value = 6, RULE_math = 7, RULE_loop = 8, 
		RULE_with = 9, RULE_when = 10, RULE_whenthen = 11, RULE_concat = 12, RULE_list = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"jlml", "headers", "element", "elementkey", "pair", "key", "value", "math", 
			"loop", "with", "when", "whenthen", "concat", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'in'", "'using'", "'when'", "'if'", "'then'", "'else'", 
			"'$'", "'('", "','", "')'", null, null, null, null, null, null, null, 
			null, null, "'{'", "'}'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"IDENTIFIER", "STRING", "NUMBER", "LITERAL", "USABLE_TOKENS", "WITH_EXPRESSION", 
			"DECLARE_STATEMENT", "SET_STATEMENT", "PROPERTY_NAME", "OPEN_BRACE", 
			"CLOSE_BRACE", "COLON", "SEMICOLON", "COMPARE_TOKENS", "ADDICTIVE_OPERATORS", 
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE_STATEMENT || _la==SET_STATEMENT) {
				{
				{
				setState(28);
				headers();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				element();
				}
				}
				setState(37); 
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
			setState(39);
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
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(41);
				elementkey();
				}
			}

			setState(44);
			match(OPEN_BRACE);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(45);
					element();
					}
					break;
				case 2:
					{
					setState(46);
					pair();
					}
					break;
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==OPEN_BRACE );
			setState(51);
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
		public TerminalNode IDENTIFIER() { return getToken(JLMLParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(JLMLParser.COLON, 0); }
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(IDENTIFIER);
			setState(54);
			match(COLON);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(55);
				with();
				}
			}

			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(58);
				loop();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(61);
				when();
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
			setState(64);
			key();
			setState(65);
			match(COLON);
			setState(66);
			value(0);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(67);
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
			setState(70);
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
		public TerminalNode STRING() { return getToken(JLMLParser.STRING, 0); }
		public TerminalNode PROPERTY_NAME() { return getToken(JLMLParser.PROPERTY_NAME, 0); }
		public TerminalNode NUMBER() { return getToken(JLMLParser.NUMBER, 0); }
		public TerminalNode LITERAL() { return getToken(JLMLParser.LITERAL, 0); }
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(73);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(74);
				match(PROPERTY_NAME);
				}
				break;
			case 3:
				{
				setState(75);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(76);
				match(LITERAL);
				}
				break;
			case 5:
				{
				setState(77);
				concat();
				}
				break;
			case 6:
				{
				setState(78);
				list();
				}
				break;
			case 7:
				{
				setState(79);
				whenthen();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_value);
					setState(82);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(84); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(83);
							math();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(86); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDICTIVE_OPERATORS:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				((MathContext)_localctx).op = match(ADDICTIVE_OPERATORS);
				setState(94);
				value(0);
				}
				break;
			case MULTIPLICATIVE_OPERATORS:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((MathContext)_localctx).op = match(MULTIPLICATIVE_OPERATORS);
				setState(96);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JLMLParser.IDENTIFIER, 0); }
		public TerminalNode PROPERTY_NAME() { return getToken(JLMLParser.PROPERTY_NAME, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__0);
			setState(100);
			match(IDENTIFIER);
			setState(101);
			match(T__1);
			setState(102);
			match(PROPERTY_NAME);
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
		enterRule(_localctx, 18, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__2);
			setState(105);
			match(STRING);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_EXPRESSION) {
				{
				setState(106);
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
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			match(PROPERTY_NAME);
			setState(111);
			match(COMPARE_TOKENS);
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USABLE_TOKENS:
				{
				setState(112);
				match(USABLE_TOKENS);
				}
				break;
			case T__7:
			case T__8:
				{
				setState(113);
				concat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 22, RULE_whenthen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			match(PROPERTY_NAME);
			setState(118);
			match(COMPARE_TOKENS);
			setState(119);
			match(USABLE_TOKENS);
			setState(120);
			match(T__5);
			setState(121);
			value(0);
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(122);
				match(T__6);
				setState(123);
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

	public static class ConcatContext extends ParserRuleContext {
		public List<TerminalNode> USABLE_TOKENS() { return getTokens(JLMLParser.USABLE_TOKENS); }
		public TerminalNode USABLE_TOKENS(int i) {
			return getToken(JLMLParser.USABLE_TOKENS, i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_concat);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__7);
				setState(127);
				match(T__8);
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128);
					match(USABLE_TOKENS);
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(129);
						match(T__9);
						}
					}

					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==USABLE_TOKENS );
				setState(136);
				match(T__10);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__8);
				setState(138);
				match(T__10);
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
		enterRule(_localctx, 26, RULE_list);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__8);
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					match(USABLE_TOKENS);
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(143);
						match(T__9);
						}
					}

					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==USABLE_TOKENS );
				setState(150);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__8);
				setState(152);
				match(T__10);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u009e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\4\5\4-\n\4\3\4\3\4\3\4\6\4\62\n\4\r"+
		"\4\16\4\63\3\4\3\4\3\5\3\5\3\5\5\5;\n\5\3\5\5\5>\n\5\3\5\5\5A\n\5\3\6"+
		"\3\6\3\6\3\6\5\6G\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b"+
		"\3\b\3\b\6\bW\n\b\r\b\16\bX\7\b[\n\b\f\b\16\b^\13\b\3\t\3\t\3\t\3\t\5"+
		"\td\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13n\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\5\fu\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\177\n\r\3\16\3\16\3"+
		"\16\3\16\5\16\u0085\n\16\6\16\u0087\n\16\r\16\16\16\u0088\3\16\3\16\3"+
		"\16\5\16\u008e\n\16\3\17\3\17\3\17\5\17\u0093\n\17\6\17\u0095\n\17\r\17"+
		"\16\17\u0096\3\17\3\17\3\17\5\17\u009c\n\17\3\17\2\3\16\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\4\3\2\24\25\3\2\6\7\2\u00aa\2!\3\2\2\2\4)\3"+
		"\2\2\2\6,\3\2\2\2\b\67\3\2\2\2\nB\3\2\2\2\fH\3\2\2\2\16R\3\2\2\2\20c\3"+
		"\2\2\2\22e\3\2\2\2\24j\3\2\2\2\26o\3\2\2\2\30v\3\2\2\2\32\u008d\3\2\2"+
		"\2\34\u009b\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\""+
		"\3\2\2\2\"%\3\2\2\2#!\3\2\2\2$&\5\6\4\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2"+
		"\2\'(\3\2\2\2(\3\3\2\2\2)*\t\2\2\2*\5\3\2\2\2+-\5\b\5\2,+\3\2\2\2,-\3"+
		"\2\2\2-.\3\2\2\2.\61\7\27\2\2/\62\5\6\4\2\60\62\5\n\6\2\61/\3\2\2\2\61"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65"+
		"\66\7\30\2\2\66\7\3\2\2\2\678\7\16\2\28:\7\31\2\29;\5\24\13\2:9\3\2\2"+
		"\2:;\3\2\2\2;=\3\2\2\2<>\5\22\n\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\26"+
		"\f\2@?\3\2\2\2@A\3\2\2\2A\t\3\2\2\2BC\5\f\7\2CD\7\31\2\2DF\5\16\b\2EG"+
		"\7\32\2\2FE\3\2\2\2FG\3\2\2\2G\13\3\2\2\2HI\7\16\2\2I\r\3\2\2\2JK\b\b"+
		"\1\2KS\7\17\2\2LS\7\26\2\2MS\7\20\2\2NS\7\21\2\2OS\5\32\16\2PS\5\34\17"+
		"\2QS\5\30\r\2RJ\3\2\2\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2"+
		"\2\2RQ\3\2\2\2S\\\3\2\2\2TV\f\4\2\2UW\5\20\t\2VU\3\2\2\2WX\3\2\2\2XV\3"+
		"\2\2\2XY\3\2\2\2Y[\3\2\2\2ZT\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]"+
		"\17\3\2\2\2^\\\3\2\2\2_`\7\34\2\2`d\5\16\b\2ab\7\35\2\2bd\5\16\b\2c_\3"+
		"\2\2\2ca\3\2\2\2d\21\3\2\2\2ef\7\3\2\2fg\7\16\2\2gh\7\4\2\2hi\7\26\2\2"+
		"i\23\3\2\2\2jk\7\5\2\2km\7\17\2\2ln\7\23\2\2ml\3\2\2\2mn\3\2\2\2n\25\3"+
		"\2\2\2op\t\3\2\2pq\7\26\2\2qt\7\33\2\2ru\7\22\2\2su\5\32\16\2tr\3\2\2"+
		"\2ts\3\2\2\2u\27\3\2\2\2vw\t\3\2\2wx\7\26\2\2xy\7\33\2\2yz\7\22\2\2z{"+
		"\7\b\2\2{~\5\16\b\2|}\7\t\2\2}\177\5\16\b\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\31\3\2\2\2\u0080\u0081\7\n\2\2\u0081\u0086\7\13\2\2\u0082\u0084\7\22"+
		"\2\2\u0083\u0085\7\f\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0082\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\7\r\2\2\u008b"+
		"\u008c\7\13\2\2\u008c\u008e\7\r\2\2\u008d\u0080\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008e\33\3\2\2\2\u008f\u0094\7\13\2\2\u0090\u0092\7\22\2\2\u0091"+
		"\u0093\7\f\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0090\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009c\7\r\2\2\u0099\u009a\7\13"+
		"\2\2\u009a\u009c\7\r\2\2\u009b\u008f\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\35\3\2\2\2\30!\',\61\63:=@FRX\\cmt~\u0084\u0088\u008d\u0092\u0096\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}