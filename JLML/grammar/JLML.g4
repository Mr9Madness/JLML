/** Taken from "The Definitive ANTLR 4 Reference" by Terence Parr */

// Derived from http://json.org
grammar JLML;

@header { #pragma warning disable 3021 }

// Parser
jlml: headers? obj obj*;

obj		: OPEN_BRACE pair (pair)* CLOSE_BRACE | OPEN_BRACE CLOSE_BRACE;
pair	: key COLON value+ SEMICOLON? | obj;
key		: STRING | IDENTIFIER;
value	: IDENTIFIER
		| STRING
		| NUMBER
		| obj
		// | arr
		| LITERAL
		| value math+
		// | LAMBDA_EXPRESSION
		| with;
math	: (ADDICTIVE_OPERATORS | MULTIPLICATIVE_OPERATORS) value;
with	: 'using' STRING WITH_EXPRESSION? obj?;
headers	: DECLARE_STATEMENT | SET_STATEMENT;

// arr		: '[' value (',' value)* ']' | '[' ']';

// Lexer

IDENTIFIER	: [a-zA-Z] ([a-zA-Z0-9._-])*;
STRING		: '"' DOUBLE_QUOTE_CHAR* '"' | '\'' SINGLE_QUOTE_CHAR* '\'';
NUMBER		: '-'? INT ('.' [0-9]+)? EXP?;
LITERAL		: 'true' | 'false' | 'null';

WITH_EXPRESSION		: 'with' '(' IDENTIFIER ')';
DECLARE_STATEMENT	: 'declare' IDENTIFIER STRING;
SET_STATEMENT		: 'set' IDENTIFIER ('.' IDENTIFIER)* STRING;

// LAMBDA_EXPRESSION	: FUNCTION_SIGNATURE '=>' '{' '}' | FUNCTION_SIGNATURE '=>' STRING;

FUNCTION_SIGNATURE	: '(' ')' | '(' FUNCTION_PARAMETER_LIST ')' | STRING;
FUNCTION_PARAMETER_LIST:	IDENTIFIER STRING ( ',' IDENTIFIER STRING)*;

// Lexer characters
OPEN_BRACE					: '{';
CLOSE_BRACE					: '}';
COLON						: ':';
SEMICOLON					: ';';
ADDICTIVE_OPERATORS			: '+' | '-';
MULTIPLICATIVE_OPERATORS	: '*' | '/' | '%';

// Lexer fragments
fragment DOUBLE_QUOTE_CHAR: ~["\\\r\n] | ESCAPE_SEQUENCE;
fragment SINGLE_QUOTE_CHAR: ~['\\\r\n] | ESCAPE_SEQUENCE;

fragment ESCAPE_SEQUENCE: '\\' ( NEWLINE
	| UNICODE_SEQUENCE			// \u1234
	| ['"\\/bfnrtv]				// single escape char
	| ~['"\\bfnrtv0-9xu\r\n]	// non escape char
	| '0'						// \0
	| 'x' HEX HEX				// \x3a
	);

fragment UNICODE_SEQUENCE: 'u' HEX HEX HEX HEX;

fragment SYMBOL		: ('+' | '-')?;
fragment HEX		: [0-9a-fA-F];
fragment INT		: '0' | [1-9] [0-9]*;
fragment EXP		: [Ee] SYMBOL INT;
fragment NEWLINE	: '\r\n' | [\r\n\u2028\u2029];

LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);
WS: [ \t\n\r] + -> skip;