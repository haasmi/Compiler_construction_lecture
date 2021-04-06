grammar Pfx;

program
  : ( variable | function )*
  ;

variable
  : 'var' ID type
  ;

type
  : INT						# intType
  | DOUBLE					# dblType
  | STRING					# strType
  | '[' INT_LIT ']' type	# arrayType
  ;

function
  : 'func' ID '(' (parameter (',' parameter)*)? ')' type? block
  ;

parameter
  : ID ptype
  ;

ptype
  : type				# basicPType
  | '*' type			# refPType
  | '*' '[' ']' type	# refArrayPType
  ;

block
  : '{' statement* '}'
  ;

statement
  : localVariable
  | ifStmt
  | whileStmt
  | assignment
  | callStmt
  ;

localVariable
  : 'var' ID type
  ;

ifStmt
  : 'if' expr block ('else' block)?
  ;

whileStmt
  : 'while' expr block
  ;

assignment
  : lvalue '=' expr
  ;

callStmt
  : call
  ;

lvalue
  : ID						# idLValue
  | lvalue '[' expr ']'		# arrayLValue
  ;
  
expr
  : expr ('*' | '/' | '%') expr									# multExpr
  | expr ('+' | '-') expr										# addExpr
  | expr ('<' | '<=' | '>' | '>=' | '==' | '!=' | '<=>') expr	# compExpr
  | expr '&&' expr												# andExpr
  | expr '||' expr												# orExpr
  | ('-' | '!') expr											# unaryExpr
  | '(' INT ')' expr											# intCast
  | '(' DOUBLE ')' expr											# doubleCast
  | '(' expr ')'												# bracketExpr
  | call														# callExpr
  | lvalue														# lValueExpr
  | INT_LIT														# intExpr
  | DBL_LIT														# dblExpr
  | STR_LIT														# strExpr
  ;

call
  : ID '(' ( expr (',' expr)* )? ')'
  ;


///////////////////// SCANNER ////////////////////////////

fragment
L          : [A-Za-z_];
fragment
D0         : [0-9];
fragment
D1         : [1-9];
fragment
I          : D1 D0* | '0';
fragment
EXP        : [eE] [+-]? I;

INT        : 'int';
DOUBLE     : 'double';
STRING     : 'string';

DBL_LIT    : INT_LIT '.' D0+ EXP? | INT_LIT EXP;
INT_LIT    : I;
ID         : L (L|D0)*;
STR_LIT    : '"' (~'"')* '"';

WS        : [ \t\r\n]+ -> skip;
COMMENT   : '#' ~[\n]* '\n' -> skip;
