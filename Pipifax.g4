grammar Pipifax;
prg : expr+;
identifier : ID;
integer : '-'? INT;
pidouble : '-'? DOUBLE;
string : STRING;
array : ARRAY integer | pidouble | string;
reference : '*' typeORef;
typeORef : integer | pidouble | string | array;
types : integer | pidouble | string | array | reference;
typesKey : 'int' | 'double' | 'string' | ('[' INT  ']') typesKey;
parameters : identifier types;
vardef : 'var' identifier typesKey ( '=' types)?;
funcCall : identifier '(' types? (',' types)* ')';
assignment : identifier '=' (funcCall | types);
var : identifier | types;
condition : expr;
ifStatement : 'if' condition '{' statements+ '}' ('else' '{' statements+ '}')?;
whileStatement : 'while' condition '{' statements+ '}';
statements : vardef | funcCall | assignment | ifStatement | whileStatement;
body : '{' statements+ '}';
function : 'func' identifier '(' parameters? ')' typesKey? body;
operator: '+' | '-' | '^' | '/' | '<' | '<=' | '>' | '>=' | '==' | '!=' | '&&' | '||' | '!' | '<=>';
expr
    : expr ('*' | '/' | '%') expr
    | expr ('+' | '-') expr
    | expr ('<' | '<=' | '>' | '>=' | '==' | '!=' | '<=>') expr
    | expr '&&' expr
    | expr '||' expr
    | ('-' | '!') expr
    | expr operator expr
    | funcCall
    | function
    | vardef
    | assignment
    | function
    ;


COMMENT: [#] .* [\n] -> skip;
ARRAY : ('['[1-9]']')*;
STRING : ["] (~["])* ["];
DOUBLE : [0-9]*([.][0-9]*)?([Ee][+-]?[1-9][0-9]*)?;
INT : [1-9][0-9]*;
ID : [_a-zA-Z][a-zA-Z0-9_]*;
WHITE : [ \t\r\n]+ -> skip;
HASH : [#];