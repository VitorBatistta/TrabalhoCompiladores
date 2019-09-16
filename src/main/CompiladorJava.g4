lexer grammar CompiladorJava;

//Palavras reservadas

ABSTRACT:'abstract';
EXTENDS: 'extends';
INT: 'int';
PROTECTED: 'protected';
THIS:'this';
BOOLEAN: 'boolean';
FALSE: 'false';
NEW: 'new';
PUBLIC: 'public';
TRUE: 'true';
CHAR: 'char';
IMPORT: 'import';
NULL: 'null';
RETURN: 'return';
VOID: 'void';
CLASS: 'class';
IF: 'if';
PACKAGE: 'package';
STATIC: 'static';
WHILE: 'while';
ELSE: 'else';
INSTANCEOF: 'instanceof';
PRIVATE: 'private';
SUPER: 'super';

//Operadores

ATRIBUICAO: '=';
IGUALDADE: '==';
OpMaior: '>';
INCREMENTO: '++';
ADN: '&&';
OpMenorIgual: '<=';
OpNegacao: '!';
SUBITRACAO: '-';
DECREMENTO: '--';
ADICAO: '+';
OpSomaAtribuicao: '+=';
MULTIPLICACAO: '*';

//Separadores

Virgula: ',';
Ponto: '.';
AC: '[';
AbreChave: '{';
AP: '(';
FP: ')';
FechaChave: '}';
FC: ']';
PontVirgula: ';';


//Identificadores
ID: (('a..z') | ('A..Z') | '_' | '$') (('a'..'z') | ('A'..'Z') | ('0'..'9') | '_' | '$')*;

Int: '0' | ('1..9')('0..9');
