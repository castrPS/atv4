grammar ig;
@header{
	package main;
}

goal: mainClass ( classDeclaration )* EOF;

mainClass : 'class' IDENTIFIER '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}' '}';

classDeclaration: 'class' IDENTIFIER ('extends' IDENTIFIER)? '{' ( varDeclaration )* ( methodDeclaration )* '}';

varDeclaration: type IDENTIFIER ';';

methodDeclaration: 'public' type IDENTIFIER '(' ( type IDENTIFIER ( ',' type IDENTIFIER )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}';

type: 'int' '[' ']'
	| 'boolean'
	| 'int'
	| IDENTIFIER;
	
statement: '{' ( statement )* '}'
	| 'if' '(' expression ')' statement 'else' statement
	| 'while' '(' expression ')' statement
	| 'System.out.println' '(' expression ')' ';'
	| IDENTIFIER '=' expression ';'
	| IDENTIFIER '[' expression ']' '=' expression ';';
	
expression: expression ( '&&' | '<' | '+' | '-' | '*' ) expression
	| expression '[' expression ']'
	| expression '.' 'length'
	| expression '.' IDENTIFIER '(' ( expression ( ',' expression )* )? ')'
	| INTEGER
	| 'true'
	| 'false'
	| IDENTIFIER
	| 'this'
	| 'new' 'int' '[' expression ']'
	| 'new' IDENTIFIER '(' ')'
	| '!' expression
	| '(' expression ')';
	
	
IDENTIFIER: [a-z_A-Z][a-z_A-Z0-9]*;

INTEGER: [1-9][0-9]* | '0';

WS:         [ \t\r\n]+ -> skip;
COMMENT_TEXT:   '/*' .*? '*/' -> skip;
COMMENT_LINE:   '//' ~[\r\n]* -> skip;