/** Taken from "The Definitive ANTLR 4 Reference" by Terence Parr */

// Derived from http://json.org
grammar JLML;

@header { #pragma warning disable 3021 }

// Parser
jlml: headers* element+;

headers	: DECLARE_STATEMENT | SET_STATEMENT;

element		: elementkey? OPEN_BRACE (element | pair)+ CLOSE_BRACE;
elementkey	: key COLON (with | when)?;

pair		: key COLON value SEMICOLON?;
key			: IDENTIFIER;
value		: IDENTIFIER
			| STRING
			| NUMBER
			| LITERAL
			| list
			| value math+
			| whenthen;

math		: op=ADDICTIVE_OPERATORS value
			| op=MULTIPLICATIVE_OPERATORS value;
with		: 'using' STRING WITH_EXPRESSION?;
when		: 'when' PROPERTY_NAME COMPARE_TOKENS USABLE_TOKENS;
whenthen	: 'when' PROPERTY_NAME COMPARE_TOKENS USABLE_TOKENS 'then' value ('else' value)?;

list		: '(' USABLE_TOKENS (',' USABLE_TOKENS)* ')' | '(' ')';

// Lexer

IDENTIFIER			: [a-zA-Z] ([a-zA-Z0-9._-])*;
STRING				: '"' DOUBLE_QUOTE_CHAR* '"' | '\'' SINGLE_QUOTE_CHAR* '\'';
NUMBER				: '-'? INT ('.' [0-9]+)? EXP?;
LITERAL				: 'true' | 'false' | 'null';

USABLE_TOKENS		: IDENTIFIER | STRING | NUMBER | LITERAL;

WITH_EXPRESSION		: 'with' '(' IDENTIFIER ')';
DECLARE_STATEMENT	: 'declare' IDENTIFIER STRING;
SET_STATEMENT		: 'set' PROPERTY_NAME STRING;

PROPERTY_NAME		: IDENTIFIER ('.' IDENTIFIER)*;

// LAMBDA_EXPRESSION	: FUNCTION_SIGNATURE '=>' '{' '}' | FUNCTION_SIGNATURE '=>' STRING;

// Lexer characters
OPEN_BRACE					: '{';
CLOSE_BRACE					: '}';
COLON						: ':';
SEMICOLON					: ';';
COMPARE_TOKENS				: '<' | '>' | '<=' | '>=';
ADDICTIVE_OPERATORS			: '+' | '-';
MULTIPLICATIVE_OPERATORS	: '*' | '/' | '%';

// Lexer fragments
fragment DOUBLE_QUOTE_CHAR	: ~["\\\r\n] | ESCAPE_SEQUENCE;
fragment SINGLE_QUOTE_CHAR	: ~['\\\r\n] | ESCAPE_SEQUENCE;

fragment ESCAPE_SEQUENCE	: '\\' ( NEWLINE
							| UNICODE_SEQUENCE			// \u1234
							| ['"\\/bfnrtv]				// single escape char
							| ~['"\\bfnrtv0-9xu\r\n]	// non escape char
							| '0'						// \0
							| 'x' HEX HEX				// \x3a
							);

fragment UNICODE_SEQUENCE	: 'u' HEX HEX HEX HEX;

fragment SYMBOL				: ('+' | '-')?;
fragment HEX				: [0-9a-fA-F];
fragment INT				: '0' | [1-9] [0-9]*;
fragment EXP				: [Ee] SYMBOL INT;
fragment NEWLINE			: '\r\n' | [\r\n\u2028\u2029];


LINE_COMMENT	: '//' ~[\r\n]* -> channel(HIDDEN);
WS				: [ \t\n\r] + -> skip;