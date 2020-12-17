// Generated from b:\School\ExpressionalJson\Nml\grammar\Nml.g4 by ANTLR 4.8

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
public class NmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, UNARY_EXPRESSION=4, IDENTIFIER=5, VARIABLE=6, 
		STRING=7, NUMBER=8, LITERAL=9, LAMBDA_EXPRESSION=10, FUNCTION_SIGNATURE=11, 
		FUNCTION_PARAMETER_LIST=12, OPEN_BRACE=13, CLOSE_BRACE=14, COLON=15, SEMICOLON=16, 
		ADDICTIVE_OPERATORS=17, MULTIPLICATIVE_OPERATORS=18, WS=19;
	public static final int
		RULE_nml = 0, RULE_obj = 1, RULE_pair = 2, RULE_key = 3, RULE_value = 4, 
		RULE_arr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"nml", "obj", "pair", "key", "value", "arr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'['", "']'", null, null, null, null, null, null, null, 
			null, null, "'{'", "'}'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "UNARY_EXPRESSION", "IDENTIFIER", "VARIABLE", 
			"STRING", "NUMBER", "LITERAL", "LAMBDA_EXPRESSION", "FUNCTION_SIGNATURE", 
			"FUNCTION_PARAMETER_LIST", "OPEN_BRACE", "CLOSE_BRACE", "COLON", "SEMICOLON", 
			"ADDICTIVE_OPERATORS", "MULTIPLICATIVE_OPERATORS", "WS"
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
	public String getGrammarFileName() { return "Nml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NmlContext extends ParserRuleContext {
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public NmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nml; }
	}

	public final NmlContext nml() throws RecognitionException {
		NmlContext _localctx = new NmlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			obj();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(13);
				match(T__0);
				setState(14);
				obj();
				}
				}
				setState(19);
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
		public TerminalNode OPEN_BRACE() { return getToken(NmlParser.OPEN_BRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NmlParser.CLOSE_BRACE, 0); }
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
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(OPEN_BRACE);
				setState(21);
				pair();
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER || _la==STRING) {
					{
					{
					setState(22);
					pair();
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(OPEN_BRACE);
				setState(31);
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
		public TerminalNode COLON() { return getToken(NmlParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			key();
			setState(35);
			match(COLON);
			setState(36);
			value();
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
		public TerminalNode STRING() { return getToken(NmlParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NmlParser.IDENTIFIER, 0); }
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
			setState(38);
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
		public TerminalNode STRING() { return getToken(NmlParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(NmlParser.NUMBER, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(NmlParser.LITERAL, 0); }
		public TerminalNode VARIABLE() { return getToken(NmlParser.VARIABLE, 0); }
		public TerminalNode UNARY_EXPRESSION() { return getToken(NmlParser.UNARY_EXPRESSION, 0); }
		public TerminalNode LAMBDA_EXPRESSION() { return getToken(NmlParser.LAMBDA_EXPRESSION, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(NUMBER);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				obj();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				arr();
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				match(LITERAL);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				match(VARIABLE);
				}
				break;
			case UNARY_EXPRESSION:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				match(UNARY_EXPRESSION);
				}
				break;
			case LAMBDA_EXPRESSION:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				match(LAMBDA_EXPRESSION);
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

	public static class ArrContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arr);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__1);
				setState(51);
				value();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(52);
					match(T__0);
					setState(53);
					value();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(T__1);
				setState(62);
				match(T__2);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\3\3\3\3\3\3\3\5\3#\n\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3"+
		"\7\3\7\3\7\3\7\7\79\n\7\f\7\16\7<\13\7\3\7\3\7\3\7\3\7\5\7B\n\7\3\7\2"+
		"\2\b\2\4\6\b\n\f\2\3\4\2\7\7\t\t\2I\2\16\3\2\2\2\4\"\3\2\2\2\6$\3\2\2"+
		"\2\b(\3\2\2\2\n\62\3\2\2\2\fA\3\2\2\2\16\23\5\4\3\2\17\20\7\3\2\2\20\22"+
		"\5\4\3\2\21\17\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3"+
		"\3\2\2\2\25\23\3\2\2\2\26\27\7\17\2\2\27\33\5\6\4\2\30\32\5\6\4\2\31\30"+
		"\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33"+
		"\3\2\2\2\36\37\7\20\2\2\37#\3\2\2\2 !\7\17\2\2!#\7\20\2\2\"\26\3\2\2\2"+
		"\" \3\2\2\2#\5\3\2\2\2$%\5\b\5\2%&\7\21\2\2&\'\5\n\6\2\'\7\3\2\2\2()\t"+
		"\2\2\2)\t\3\2\2\2*\63\7\t\2\2+\63\7\n\2\2,\63\5\4\3\2-\63\5\f\7\2.\63"+
		"\7\13\2\2/\63\7\b\2\2\60\63\7\6\2\2\61\63\7\f\2\2\62*\3\2\2\2\62+\3\2"+
		"\2\2\62,\3\2\2\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62"+
		"\61\3\2\2\2\63\13\3\2\2\2\64\65\7\4\2\2\65:\5\n\6\2\66\67\7\3\2\2\679"+
		"\5\n\6\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2"+
		"=>\7\5\2\2>B\3\2\2\2?@\7\4\2\2@B\7\5\2\2A\64\3\2\2\2A?\3\2\2\2B\r\3\2"+
		"\2\2\b\23\33\"\62:A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}