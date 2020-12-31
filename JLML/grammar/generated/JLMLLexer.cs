//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from JLML.g4 by ANTLR 4.9

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace JLML.Generated {
 #pragma warning disable 3021 
using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9")]
[System.CLSCompliant(false)]
public partial class JLMLLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, IDENTIFIER=12, STRING=13, NUMBER=14, LITERAL=15, USABLE_TOKENS=16, 
		WITH_EXPRESSION=17, DECLARE_STATEMENT=18, SET_STATEMENT=19, PROPERTY_NAME=20, 
		OPEN_BRACE=21, CLOSE_BRACE=22, COLON=23, SEMICOLON=24, COMPARE_TOKENS=25, 
		ADDICTIVE_OPERATORS=26, MULTIPLICATIVE_OPERATORS=27, LINE_COMMENT=28, 
		WS=29;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "IDENTIFIER", "STRING", "NUMBER", "LITERAL", "USABLE_TOKENS", 
		"WITH_EXPRESSION", "DECLARE_STATEMENT", "SET_STATEMENT", "PROPERTY_NAME", 
		"OPEN_BRACE", "CLOSE_BRACE", "COLON", "SEMICOLON", "COMPARE_TOKENS", "ADDICTIVE_OPERATORS", 
		"MULTIPLICATIVE_OPERATORS", "DOUBLE_QUOTE_CHAR", "SINGLE_QUOTE_CHAR", 
		"ESCAPE_SEQUENCE", "UNICODE_SEQUENCE", "SYMBOL", "HEX", "INT", "EXP", 
		"NEWLINE", "LINE_COMMENT", "WS"
	};


	public JLMLLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public JLMLLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'for'", "'in'", "'using'", "'when'", "'if'", "'then'", "'else'", 
		"'$'", "'('", "','", "')'", null, null, null, null, null, null, null, 
		null, null, "'{'", "'}'", "':'", "';'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IDENTIFIER", "STRING", "NUMBER", "LITERAL", "USABLE_TOKENS", "WITH_EXPRESSION", 
		"DECLARE_STATEMENT", "SET_STATEMENT", "PROPERTY_NAME", "OPEN_BRACE", "CLOSE_BRACE", 
		"COLON", "SEMICOLON", "COMPARE_TOKENS", "ADDICTIVE_OPERATORS", "MULTIPLICATIVE_OPERATORS", 
		"LINE_COMMENT", "WS"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "JLML.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static JLMLLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '\x1F', '\x129', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x4', '$', '\t', '$', '\x4', '%', '\t', '%', '\x4', '&', 
		'\t', '&', '\x4', '\'', '\t', '\'', '\x3', '\x2', '\x3', '\x2', '\x3', 
		'\x2', '\x3', '\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', 
		'\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', 
		'\x4', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', 
		'\x5', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\a', '\x3', '\a', 
		'\x3', '\a', '\x3', '\a', '\x3', '\a', '\x3', '\b', '\x3', '\b', '\x3', 
		'\b', '\x3', '\b', '\x3', '\b', '\x3', '\t', '\x3', '\t', '\x3', '\n', 
		'\x3', '\n', '\x3', '\v', '\x3', '\v', '\x3', '\f', '\x3', '\f', '\x3', 
		'\r', '\x3', '\r', '\a', '\r', 'y', '\n', '\r', '\f', '\r', '\xE', '\r', 
		'|', '\v', '\r', '\x3', '\xE', '\x3', '\xE', '\a', '\xE', '\x80', '\n', 
		'\xE', '\f', '\xE', '\xE', '\xE', '\x83', '\v', '\xE', '\x3', '\xE', '\x3', 
		'\xE', '\x3', '\xE', '\a', '\xE', '\x88', '\n', '\xE', '\f', '\xE', '\xE', 
		'\xE', '\x8B', '\v', '\xE', '\x3', '\xE', '\x5', '\xE', '\x8E', '\n', 
		'\xE', '\x3', '\xF', '\x5', '\xF', '\x91', '\n', '\xF', '\x3', '\xF', 
		'\x3', '\xF', '\x3', '\xF', '\x6', '\xF', '\x96', '\n', '\xF', '\r', '\xF', 
		'\xE', '\xF', '\x97', '\x5', '\xF', '\x9A', '\n', '\xF', '\x3', '\xF', 
		'\x5', '\xF', '\x9D', '\n', '\xF', '\x3', '\x10', '\x3', '\x10', '\x3', 
		'\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', 
		'\x10', '\x3', '\x10', '\x5', '\x10', '\xA8', '\n', '\x10', '\x3', '\x11', 
		'\x3', '\x11', '\x3', '\x11', '\x3', '\x11', '\x5', '\x11', '\xAE', '\n', 
		'\x11', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', 
		'\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', 
		'\x13', '\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', 
		'\x13', '\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', 
		'\x13', '\x3', '\x14', '\x3', '\x14', '\x3', '\x14', '\x3', '\x14', '\x3', 
		'\x14', '\x3', '\x14', '\x3', '\x14', '\x3', '\x15', '\x3', '\x15', '\x3', 
		'\x15', '\a', '\x15', '\xCE', '\n', '\x15', '\f', '\x15', '\xE', '\x15', 
		'\xD1', '\v', '\x15', '\x3', '\x16', '\x3', '\x16', '\x3', '\x17', '\x3', 
		'\x17', '\x3', '\x18', '\x3', '\x18', '\x3', '\x19', '\x3', '\x19', '\x3', 
		'\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x5', 
		'\x1A', '\xE0', '\n', '\x1A', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1C', 
		'\x3', '\x1C', '\x3', '\x1D', '\x3', '\x1D', '\x5', '\x1D', '\xE8', '\n', 
		'\x1D', '\x3', '\x1E', '\x3', '\x1E', '\x5', '\x1E', '\xEC', '\n', '\x1E', 
		'\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', 
		'\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', 
		'\x5', '\x1F', '\xF8', '\n', '\x1F', '\x3', ' ', '\x3', ' ', '\x3', ' ', 
		'\x3', ' ', '\x3', ' ', '\x3', ' ', '\x3', '!', '\x5', '!', '\x101', '\n', 
		'!', '\x3', '\"', '\x3', '\"', '\x3', '#', '\x3', '#', '\x3', '#', '\a', 
		'#', '\x108', '\n', '#', '\f', '#', '\xE', '#', '\x10B', '\v', '#', '\x5', 
		'#', '\x10D', '\n', '#', '\x3', '$', '\x3', '$', '\x3', '$', '\x3', '$', 
		'\x3', '%', '\x3', '%', '\x3', '%', '\x5', '%', '\x116', '\n', '%', '\x3', 
		'&', '\x3', '&', '\x3', '&', '\x3', '&', '\a', '&', '\x11C', '\n', '&', 
		'\f', '&', '\xE', '&', '\x11F', '\v', '&', '\x3', '&', '\x3', '&', '\x3', 
		'\'', '\x6', '\'', '\x124', '\n', '\'', '\r', '\'', '\xE', '\'', '\x125', 
		'\x3', '\'', '\x3', '\'', '\x2', '\x2', '(', '\x3', '\x3', '\x5', '\x4', 
		'\a', '\x5', '\t', '\x6', '\v', '\a', '\r', '\b', '\xF', '\t', '\x11', 
		'\n', '\x13', '\v', '\x15', '\f', '\x17', '\r', '\x19', '\xE', '\x1B', 
		'\xF', '\x1D', '\x10', '\x1F', '\x11', '!', '\x12', '#', '\x13', '%', 
		'\x14', '\'', '\x15', ')', '\x16', '+', '\x17', '-', '\x18', '/', '\x19', 
		'\x31', '\x1A', '\x33', '\x1B', '\x35', '\x1C', '\x37', '\x1D', '\x39', 
		'\x2', ';', '\x2', '=', '\x2', '?', '\x2', '\x41', '\x2', '\x43', '\x2', 
		'\x45', '\x2', 'G', '\x2', 'I', '\x2', 'K', '\x1E', 'M', '\x1F', '\x3', 
		'\x2', '\x12', '\x4', '\x2', '\x43', '\\', '\x63', '|', '\a', '\x2', '/', 
		'/', '\x32', ';', '\x43', '\\', '\x61', '\x61', '\x63', '|', '\x3', '\x2', 
		'\x32', ';', '\x4', '\x2', '>', '>', '@', '@', '\x4', '\x2', '-', '-', 
		'/', '/', '\x5', '\x2', '\'', '\'', ',', ',', '\x31', '\x31', '\x6', '\x2', 
		'\f', '\f', '\xF', '\xF', '$', '$', '^', '^', '\x6', '\x2', '\f', '\f', 
		'\xF', '\xF', ')', ')', '^', '^', '\f', '\x2', '$', '$', ')', ')', '\x31', 
		'\x31', '^', '^', '\x64', '\x64', 'h', 'h', 'p', 'p', 't', 't', 'v', 'v', 
		'x', 'x', '\xE', '\x2', '\f', '\f', '\xF', '\xF', '$', '$', ')', ')', 
		'\x32', ';', '^', '^', '\x64', '\x64', 'h', 'h', 'p', 'p', 't', 't', 'v', 
		'x', 'z', 'z', '\x5', '\x2', '\x32', ';', '\x43', 'H', '\x63', 'h', '\x3', 
		'\x2', '\x33', ';', '\x4', '\x2', 'G', 'G', 'g', 'g', '\x5', '\x2', '\f', 
		'\f', '\xF', '\xF', '\x202A', '\x202B', '\x4', '\x2', '\f', '\f', '\xF', 
		'\xF', '\x5', '\x2', '\v', '\f', '\xF', '\xF', '\"', '\"', '\x2', '\x13B', 
		'\x2', '\x3', '\x3', '\x2', '\x2', '\x2', '\x2', '\x5', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', '\r', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x11', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x1B', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', '!', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '#', '\x3', '\x2', '\x2', '\x2', '\x2', '%', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\'', '\x3', '\x2', '\x2', '\x2', '\x2', 
		')', '\x3', '\x2', '\x2', '\x2', '\x2', '+', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '-', '\x3', '\x2', '\x2', '\x2', '\x2', '/', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x31', '\x3', '\x2', '\x2', '\x2', '\x2', '\x33', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x35', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x37', '\x3', '\x2', '\x2', '\x2', '\x2', 'K', '\x3', '\x2', '\x2', '\x2', 
		'\x2', 'M', '\x3', '\x2', '\x2', '\x2', '\x3', 'O', '\x3', '\x2', '\x2', 
		'\x2', '\x5', 'S', '\x3', '\x2', '\x2', '\x2', '\a', 'V', '\x3', '\x2', 
		'\x2', '\x2', '\t', '\\', '\x3', '\x2', '\x2', '\x2', '\v', '\x61', '\x3', 
		'\x2', '\x2', '\x2', '\r', '\x64', '\x3', '\x2', '\x2', '\x2', '\xF', 
		'i', '\x3', '\x2', '\x2', '\x2', '\x11', 'n', '\x3', '\x2', '\x2', '\x2', 
		'\x13', 'p', '\x3', '\x2', '\x2', '\x2', '\x15', 'r', '\x3', '\x2', '\x2', 
		'\x2', '\x17', 't', '\x3', '\x2', '\x2', '\x2', '\x19', 'v', '\x3', '\x2', 
		'\x2', '\x2', '\x1B', '\x8D', '\x3', '\x2', '\x2', '\x2', '\x1D', '\x90', 
		'\x3', '\x2', '\x2', '\x2', '\x1F', '\xA7', '\x3', '\x2', '\x2', '\x2', 
		'!', '\xAD', '\x3', '\x2', '\x2', '\x2', '#', '\xAF', '\x3', '\x2', '\x2', 
		'\x2', '%', '\xB8', '\x3', '\x2', '\x2', '\x2', '\'', '\xC3', '\x3', '\x2', 
		'\x2', '\x2', ')', '\xCA', '\x3', '\x2', '\x2', '\x2', '+', '\xD2', '\x3', 
		'\x2', '\x2', '\x2', '-', '\xD4', '\x3', '\x2', '\x2', '\x2', '/', '\xD6', 
		'\x3', '\x2', '\x2', '\x2', '\x31', '\xD8', '\x3', '\x2', '\x2', '\x2', 
		'\x33', '\xDF', '\x3', '\x2', '\x2', '\x2', '\x35', '\xE1', '\x3', '\x2', 
		'\x2', '\x2', '\x37', '\xE3', '\x3', '\x2', '\x2', '\x2', '\x39', '\xE7', 
		'\x3', '\x2', '\x2', '\x2', ';', '\xEB', '\x3', '\x2', '\x2', '\x2', '=', 
		'\xED', '\x3', '\x2', '\x2', '\x2', '?', '\xF9', '\x3', '\x2', '\x2', 
		'\x2', '\x41', '\x100', '\x3', '\x2', '\x2', '\x2', '\x43', '\x102', '\x3', 
		'\x2', '\x2', '\x2', '\x45', '\x10C', '\x3', '\x2', '\x2', '\x2', 'G', 
		'\x10E', '\x3', '\x2', '\x2', '\x2', 'I', '\x115', '\x3', '\x2', '\x2', 
		'\x2', 'K', '\x117', '\x3', '\x2', '\x2', '\x2', 'M', '\x123', '\x3', 
		'\x2', '\x2', '\x2', 'O', 'P', '\a', 'h', '\x2', '\x2', 'P', 'Q', '\a', 
		'q', '\x2', '\x2', 'Q', 'R', '\a', 't', '\x2', '\x2', 'R', '\x4', '\x3', 
		'\x2', '\x2', '\x2', 'S', 'T', '\a', 'k', '\x2', '\x2', 'T', 'U', '\a', 
		'p', '\x2', '\x2', 'U', '\x6', '\x3', '\x2', '\x2', '\x2', 'V', 'W', '\a', 
		'w', '\x2', '\x2', 'W', 'X', '\a', 'u', '\x2', '\x2', 'X', 'Y', '\a', 
		'k', '\x2', '\x2', 'Y', 'Z', '\a', 'p', '\x2', '\x2', 'Z', '[', '\a', 
		'i', '\x2', '\x2', '[', '\b', '\x3', '\x2', '\x2', '\x2', '\\', ']', '\a', 
		'y', '\x2', '\x2', ']', '^', '\a', 'j', '\x2', '\x2', '^', '_', '\a', 
		'g', '\x2', '\x2', '_', '`', '\a', 'p', '\x2', '\x2', '`', '\n', '\x3', 
		'\x2', '\x2', '\x2', '\x61', '\x62', '\a', 'k', '\x2', '\x2', '\x62', 
		'\x63', '\a', 'h', '\x2', '\x2', '\x63', '\f', '\x3', '\x2', '\x2', '\x2', 
		'\x64', '\x65', '\a', 'v', '\x2', '\x2', '\x65', '\x66', '\a', 'j', '\x2', 
		'\x2', '\x66', 'g', '\a', 'g', '\x2', '\x2', 'g', 'h', '\a', 'p', '\x2', 
		'\x2', 'h', '\xE', '\x3', '\x2', '\x2', '\x2', 'i', 'j', '\a', 'g', '\x2', 
		'\x2', 'j', 'k', '\a', 'n', '\x2', '\x2', 'k', 'l', '\a', 'u', '\x2', 
		'\x2', 'l', 'm', '\a', 'g', '\x2', '\x2', 'm', '\x10', '\x3', '\x2', '\x2', 
		'\x2', 'n', 'o', '\a', '&', '\x2', '\x2', 'o', '\x12', '\x3', '\x2', '\x2', 
		'\x2', 'p', 'q', '\a', '*', '\x2', '\x2', 'q', '\x14', '\x3', '\x2', '\x2', 
		'\x2', 'r', 's', '\a', '.', '\x2', '\x2', 's', '\x16', '\x3', '\x2', '\x2', 
		'\x2', 't', 'u', '\a', '+', '\x2', '\x2', 'u', '\x18', '\x3', '\x2', '\x2', 
		'\x2', 'v', 'z', '\t', '\x2', '\x2', '\x2', 'w', 'y', '\t', '\x3', '\x2', 
		'\x2', 'x', 'w', '\x3', '\x2', '\x2', '\x2', 'y', '|', '\x3', '\x2', '\x2', 
		'\x2', 'z', 'x', '\x3', '\x2', '\x2', '\x2', 'z', '{', '\x3', '\x2', '\x2', 
		'\x2', '{', '\x1A', '\x3', '\x2', '\x2', '\x2', '|', 'z', '\x3', '\x2', 
		'\x2', '\x2', '}', '\x81', '\a', '$', '\x2', '\x2', '~', '\x80', '\x5', 
		'\x39', '\x1D', '\x2', '\x7F', '~', '\x3', '\x2', '\x2', '\x2', '\x80', 
		'\x83', '\x3', '\x2', '\x2', '\x2', '\x81', '\x7F', '\x3', '\x2', '\x2', 
		'\x2', '\x81', '\x82', '\x3', '\x2', '\x2', '\x2', '\x82', '\x84', '\x3', 
		'\x2', '\x2', '\x2', '\x83', '\x81', '\x3', '\x2', '\x2', '\x2', '\x84', 
		'\x8E', '\a', '$', '\x2', '\x2', '\x85', '\x89', '\a', ')', '\x2', '\x2', 
		'\x86', '\x88', '\x5', ';', '\x1E', '\x2', '\x87', '\x86', '\x3', '\x2', 
		'\x2', '\x2', '\x88', '\x8B', '\x3', '\x2', '\x2', '\x2', '\x89', '\x87', 
		'\x3', '\x2', '\x2', '\x2', '\x89', '\x8A', '\x3', '\x2', '\x2', '\x2', 
		'\x8A', '\x8C', '\x3', '\x2', '\x2', '\x2', '\x8B', '\x89', '\x3', '\x2', 
		'\x2', '\x2', '\x8C', '\x8E', '\a', ')', '\x2', '\x2', '\x8D', '}', '\x3', 
		'\x2', '\x2', '\x2', '\x8D', '\x85', '\x3', '\x2', '\x2', '\x2', '\x8E', 
		'\x1C', '\x3', '\x2', '\x2', '\x2', '\x8F', '\x91', '\a', '/', '\x2', 
		'\x2', '\x90', '\x8F', '\x3', '\x2', '\x2', '\x2', '\x90', '\x91', '\x3', 
		'\x2', '\x2', '\x2', '\x91', '\x92', '\x3', '\x2', '\x2', '\x2', '\x92', 
		'\x99', '\x5', '\x45', '#', '\x2', '\x93', '\x95', '\a', '\x30', '\x2', 
		'\x2', '\x94', '\x96', '\t', '\x4', '\x2', '\x2', '\x95', '\x94', '\x3', 
		'\x2', '\x2', '\x2', '\x96', '\x97', '\x3', '\x2', '\x2', '\x2', '\x97', 
		'\x95', '\x3', '\x2', '\x2', '\x2', '\x97', '\x98', '\x3', '\x2', '\x2', 
		'\x2', '\x98', '\x9A', '\x3', '\x2', '\x2', '\x2', '\x99', '\x93', '\x3', 
		'\x2', '\x2', '\x2', '\x99', '\x9A', '\x3', '\x2', '\x2', '\x2', '\x9A', 
		'\x9C', '\x3', '\x2', '\x2', '\x2', '\x9B', '\x9D', '\x5', 'G', '$', '\x2', 
		'\x9C', '\x9B', '\x3', '\x2', '\x2', '\x2', '\x9C', '\x9D', '\x3', '\x2', 
		'\x2', '\x2', '\x9D', '\x1E', '\x3', '\x2', '\x2', '\x2', '\x9E', '\x9F', 
		'\a', 'v', '\x2', '\x2', '\x9F', '\xA0', '\a', 't', '\x2', '\x2', '\xA0', 
		'\xA1', '\a', 'w', '\x2', '\x2', '\xA1', '\xA8', '\a', 'g', '\x2', '\x2', 
		'\xA2', '\xA3', '\a', 'h', '\x2', '\x2', '\xA3', '\xA4', '\a', '\x63', 
		'\x2', '\x2', '\xA4', '\xA5', '\a', 'n', '\x2', '\x2', '\xA5', '\xA6', 
		'\a', 'u', '\x2', '\x2', '\xA6', '\xA8', '\a', 'g', '\x2', '\x2', '\xA7', 
		'\x9E', '\x3', '\x2', '\x2', '\x2', '\xA7', '\xA2', '\x3', '\x2', '\x2', 
		'\x2', '\xA8', ' ', '\x3', '\x2', '\x2', '\x2', '\xA9', '\xAE', '\x5', 
		'\x19', '\r', '\x2', '\xAA', '\xAE', '\x5', '\x1B', '\xE', '\x2', '\xAB', 
		'\xAE', '\x5', '\x1D', '\xF', '\x2', '\xAC', '\xAE', '\x5', '\x1F', '\x10', 
		'\x2', '\xAD', '\xA9', '\x3', '\x2', '\x2', '\x2', '\xAD', '\xAA', '\x3', 
		'\x2', '\x2', '\x2', '\xAD', '\xAB', '\x3', '\x2', '\x2', '\x2', '\xAD', 
		'\xAC', '\x3', '\x2', '\x2', '\x2', '\xAE', '\"', '\x3', '\x2', '\x2', 
		'\x2', '\xAF', '\xB0', '\a', 'y', '\x2', '\x2', '\xB0', '\xB1', '\a', 
		'k', '\x2', '\x2', '\xB1', '\xB2', '\a', 'v', '\x2', '\x2', '\xB2', '\xB3', 
		'\a', 'j', '\x2', '\x2', '\xB3', '\xB4', '\x3', '\x2', '\x2', '\x2', '\xB4', 
		'\xB5', '\a', '*', '\x2', '\x2', '\xB5', '\xB6', '\x5', '\x19', '\r', 
		'\x2', '\xB6', '\xB7', '\a', '+', '\x2', '\x2', '\xB7', '$', '\x3', '\x2', 
		'\x2', '\x2', '\xB8', '\xB9', '\a', '\x66', '\x2', '\x2', '\xB9', '\xBA', 
		'\a', 'g', '\x2', '\x2', '\xBA', '\xBB', '\a', '\x65', '\x2', '\x2', '\xBB', 
		'\xBC', '\a', 'n', '\x2', '\x2', '\xBC', '\xBD', '\a', '\x63', '\x2', 
		'\x2', '\xBD', '\xBE', '\a', 't', '\x2', '\x2', '\xBE', '\xBF', '\a', 
		'g', '\x2', '\x2', '\xBF', '\xC0', '\x3', '\x2', '\x2', '\x2', '\xC0', 
		'\xC1', '\x5', '\x19', '\r', '\x2', '\xC1', '\xC2', '\x5', '\x1B', '\xE', 
		'\x2', '\xC2', '&', '\x3', '\x2', '\x2', '\x2', '\xC3', '\xC4', '\a', 
		'u', '\x2', '\x2', '\xC4', '\xC5', '\a', 'g', '\x2', '\x2', '\xC5', '\xC6', 
		'\a', 'v', '\x2', '\x2', '\xC6', '\xC7', '\x3', '\x2', '\x2', '\x2', '\xC7', 
		'\xC8', '\x5', ')', '\x15', '\x2', '\xC8', '\xC9', '\x5', '\x1B', '\xE', 
		'\x2', '\xC9', '(', '\x3', '\x2', '\x2', '\x2', '\xCA', '\xCF', '\x5', 
		'\x19', '\r', '\x2', '\xCB', '\xCC', '\a', '\x30', '\x2', '\x2', '\xCC', 
		'\xCE', '\x5', '\x19', '\r', '\x2', '\xCD', '\xCB', '\x3', '\x2', '\x2', 
		'\x2', '\xCE', '\xD1', '\x3', '\x2', '\x2', '\x2', '\xCF', '\xCD', '\x3', 
		'\x2', '\x2', '\x2', '\xCF', '\xD0', '\x3', '\x2', '\x2', '\x2', '\xD0', 
		'*', '\x3', '\x2', '\x2', '\x2', '\xD1', '\xCF', '\x3', '\x2', '\x2', 
		'\x2', '\xD2', '\xD3', '\a', '}', '\x2', '\x2', '\xD3', ',', '\x3', '\x2', 
		'\x2', '\x2', '\xD4', '\xD5', '\a', '\x7F', '\x2', '\x2', '\xD5', '.', 
		'\x3', '\x2', '\x2', '\x2', '\xD6', '\xD7', '\a', '<', '\x2', '\x2', '\xD7', 
		'\x30', '\x3', '\x2', '\x2', '\x2', '\xD8', '\xD9', '\a', '=', '\x2', 
		'\x2', '\xD9', '\x32', '\x3', '\x2', '\x2', '\x2', '\xDA', '\xE0', '\t', 
		'\x5', '\x2', '\x2', '\xDB', '\xDC', '\a', '>', '\x2', '\x2', '\xDC', 
		'\xE0', '\a', '?', '\x2', '\x2', '\xDD', '\xDE', '\a', '@', '\x2', '\x2', 
		'\xDE', '\xE0', '\a', '?', '\x2', '\x2', '\xDF', '\xDA', '\x3', '\x2', 
		'\x2', '\x2', '\xDF', '\xDB', '\x3', '\x2', '\x2', '\x2', '\xDF', '\xDD', 
		'\x3', '\x2', '\x2', '\x2', '\xE0', '\x34', '\x3', '\x2', '\x2', '\x2', 
		'\xE1', '\xE2', '\t', '\x6', '\x2', '\x2', '\xE2', '\x36', '\x3', '\x2', 
		'\x2', '\x2', '\xE3', '\xE4', '\t', '\a', '\x2', '\x2', '\xE4', '\x38', 
		'\x3', '\x2', '\x2', '\x2', '\xE5', '\xE8', '\n', '\b', '\x2', '\x2', 
		'\xE6', '\xE8', '\x5', '=', '\x1F', '\x2', '\xE7', '\xE5', '\x3', '\x2', 
		'\x2', '\x2', '\xE7', '\xE6', '\x3', '\x2', '\x2', '\x2', '\xE8', ':', 
		'\x3', '\x2', '\x2', '\x2', '\xE9', '\xEC', '\n', '\t', '\x2', '\x2', 
		'\xEA', '\xEC', '\x5', '=', '\x1F', '\x2', '\xEB', '\xE9', '\x3', '\x2', 
		'\x2', '\x2', '\xEB', '\xEA', '\x3', '\x2', '\x2', '\x2', '\xEC', '<', 
		'\x3', '\x2', '\x2', '\x2', '\xED', '\xF7', '\a', '^', '\x2', '\x2', '\xEE', 
		'\xF8', '\x5', 'I', '%', '\x2', '\xEF', '\xF8', '\x5', '?', ' ', '\x2', 
		'\xF0', '\xF8', '\t', '\n', '\x2', '\x2', '\xF1', '\xF8', '\n', '\v', 
		'\x2', '\x2', '\xF2', '\xF8', '\a', '\x32', '\x2', '\x2', '\xF3', '\xF4', 
		'\a', 'z', '\x2', '\x2', '\xF4', '\xF5', '\x5', '\x43', '\"', '\x2', '\xF5', 
		'\xF6', '\x5', '\x43', '\"', '\x2', '\xF6', '\xF8', '\x3', '\x2', '\x2', 
		'\x2', '\xF7', '\xEE', '\x3', '\x2', '\x2', '\x2', '\xF7', '\xEF', '\x3', 
		'\x2', '\x2', '\x2', '\xF7', '\xF0', '\x3', '\x2', '\x2', '\x2', '\xF7', 
		'\xF1', '\x3', '\x2', '\x2', '\x2', '\xF7', '\xF2', '\x3', '\x2', '\x2', 
		'\x2', '\xF7', '\xF3', '\x3', '\x2', '\x2', '\x2', '\xF8', '>', '\x3', 
		'\x2', '\x2', '\x2', '\xF9', '\xFA', '\a', 'w', '\x2', '\x2', '\xFA', 
		'\xFB', '\x5', '\x43', '\"', '\x2', '\xFB', '\xFC', '\x5', '\x43', '\"', 
		'\x2', '\xFC', '\xFD', '\x5', '\x43', '\"', '\x2', '\xFD', '\xFE', '\x5', 
		'\x43', '\"', '\x2', '\xFE', '@', '\x3', '\x2', '\x2', '\x2', '\xFF', 
		'\x101', '\t', '\x6', '\x2', '\x2', '\x100', '\xFF', '\x3', '\x2', '\x2', 
		'\x2', '\x100', '\x101', '\x3', '\x2', '\x2', '\x2', '\x101', '\x42', 
		'\x3', '\x2', '\x2', '\x2', '\x102', '\x103', '\t', '\f', '\x2', '\x2', 
		'\x103', '\x44', '\x3', '\x2', '\x2', '\x2', '\x104', '\x10D', '\a', '\x32', 
		'\x2', '\x2', '\x105', '\x109', '\t', '\r', '\x2', '\x2', '\x106', '\x108', 
		'\t', '\x4', '\x2', '\x2', '\x107', '\x106', '\x3', '\x2', '\x2', '\x2', 
		'\x108', '\x10B', '\x3', '\x2', '\x2', '\x2', '\x109', '\x107', '\x3', 
		'\x2', '\x2', '\x2', '\x109', '\x10A', '\x3', '\x2', '\x2', '\x2', '\x10A', 
		'\x10D', '\x3', '\x2', '\x2', '\x2', '\x10B', '\x109', '\x3', '\x2', '\x2', 
		'\x2', '\x10C', '\x104', '\x3', '\x2', '\x2', '\x2', '\x10C', '\x105', 
		'\x3', '\x2', '\x2', '\x2', '\x10D', '\x46', '\x3', '\x2', '\x2', '\x2', 
		'\x10E', '\x10F', '\t', '\xE', '\x2', '\x2', '\x10F', '\x110', '\x5', 
		'\x41', '!', '\x2', '\x110', '\x111', '\x5', '\x45', '#', '\x2', '\x111', 
		'H', '\x3', '\x2', '\x2', '\x2', '\x112', '\x113', '\a', '\xF', '\x2', 
		'\x2', '\x113', '\x116', '\a', '\f', '\x2', '\x2', '\x114', '\x116', '\t', 
		'\xF', '\x2', '\x2', '\x115', '\x112', '\x3', '\x2', '\x2', '\x2', '\x115', 
		'\x114', '\x3', '\x2', '\x2', '\x2', '\x116', 'J', '\x3', '\x2', '\x2', 
		'\x2', '\x117', '\x118', '\a', '\x31', '\x2', '\x2', '\x118', '\x119', 
		'\a', '\x31', '\x2', '\x2', '\x119', '\x11D', '\x3', '\x2', '\x2', '\x2', 
		'\x11A', '\x11C', '\n', '\x10', '\x2', '\x2', '\x11B', '\x11A', '\x3', 
		'\x2', '\x2', '\x2', '\x11C', '\x11F', '\x3', '\x2', '\x2', '\x2', '\x11D', 
		'\x11B', '\x3', '\x2', '\x2', '\x2', '\x11D', '\x11E', '\x3', '\x2', '\x2', 
		'\x2', '\x11E', '\x120', '\x3', '\x2', '\x2', '\x2', '\x11F', '\x11D', 
		'\x3', '\x2', '\x2', '\x2', '\x120', '\x121', '\b', '&', '\x2', '\x2', 
		'\x121', 'L', '\x3', '\x2', '\x2', '\x2', '\x122', '\x124', '\t', '\x11', 
		'\x2', '\x2', '\x123', '\x122', '\x3', '\x2', '\x2', '\x2', '\x124', '\x125', 
		'\x3', '\x2', '\x2', '\x2', '\x125', '\x123', '\x3', '\x2', '\x2', '\x2', 
		'\x125', '\x126', '\x3', '\x2', '\x2', '\x2', '\x126', '\x127', '\x3', 
		'\x2', '\x2', '\x2', '\x127', '\x128', '\b', '\'', '\x3', '\x2', '\x128', 
		'N', '\x3', '\x2', '\x2', '\x2', '\x18', '\x2', 'z', '\x81', '\x89', '\x8D', 
		'\x90', '\x97', '\x99', '\x9C', '\xA7', '\xAD', '\xCF', '\xDF', '\xE7', 
		'\xEB', '\xF7', '\x100', '\x109', '\x10C', '\x115', '\x11D', '\x125', 
		'\x4', '\x2', '\x3', '\x2', '\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
} // namespace JLML.Generated
