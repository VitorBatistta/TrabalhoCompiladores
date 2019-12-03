parser grammar Parser;

compilationUnit : ('package' qualifiedIdentifier ';')?
                  ('import' qualifiedIdentifier ';')*
                  (typeDeclaration)* EOF
                ;

qualifiedIdentifier : ID ('.' ID)*
                    ;

typeDeclaration : modifiers classDeclaration
                ;

modifiers : 'public'
          | 'protected'
          | 'private'
          | 'static'
          | 'abstract'
          ;

classDeclaration : 'class' ID ('extends' qualifiedIdentifier)? classBody
                 ;

classBody : '{' (modifiers memberDecl)* '}'
          ;

memberDecl : ID formalParameters block
           | ('void' | type) ID formalParameters (block | ';')
           | type variableDeclarators
           ;

block : '{' (blockStatement)* '}'
      ;

blockStatement : localVariableDeclarationStatement
               | statement
               ;

statement : block
          | ID ':' statement
          | 'if' parExpression statement ('else' statement)?
          | 'while' parExpression statement
          | 'return' (expression)? ';'
          | ';'
          | statementExpression ';'
          ;

formalParameters : '(' (formalParameter (',' formalParameter)*)? ')'
                 ;

formalParameter : type ID
                ;

parExpression : '(' expression ')'
              ;

localVariableDeclarationStatement : 'type' variableDeclarators ';'
                                  ;

variableDeclarators : variableDeclarator (',' variableDeclarator)*
                    ;

variableDeclarator : ID ('=' variableInitializer)?;

variableInitializer : arrayInitializer
                    | expression
                    ;

arrayInitializer : '{' (variableInitializer (',' variableInitializer)*)? '}'
                 ;

arguments : '(' (expression (',' expression)*) ')'
          ;

type : referenceType
     | basicType
     ;

basicType : 'boolean'
          | 'char'
          | 'int'
          ;

referenceType : basicType '[' ']' ('[' ']')?
              | qualifiedIdentifier ('[' ']')?
              ;

statementExpression : expression
                    ;

expression : assignmentExpression
           ;

assignmentExpression : conditionalAndExpression (('=' | '+=') assignmentExpression)?
                     ;

conditionalAndExpression : equalityExpression ('&&' equalityExpression)?
                         ;

equalityExpression : relationalExpression ('==' relationalExpression)?
                   ;

relationalExpression : additiveExpression (('>' | '<=') additiveExpression | 'instanceof' referenceType)?
                     ;

additiveExpression : multiplicativeExpression (('+' | '-') multiplicativeExpression)?
                   ;

multiplicativeExpression : unaryExpression ('*' unaryExpression)?
                         ;

unaryExpression : '++' unaryExpression
                | '-' unaryExpression
                | simpleUnaryExpression
                ;

simpleUnaryExpression : '!' unaryExpression
                      | '(' basicType ')' unaryExpression
                      | '(' referenceType ')' simpleUnaryExpression
                      | postfixExpression
                      ;

postfixExpression : primary (selector) ('--')?
                  ;

selector : '.' qualifiedIdentifier (arguments)?
         | '[' expression ']'
         ;

primary : parExpression
        | 'this' (arguments)?
        | 'super' (arguments | '.' ID (arguments)?)
        | literal
        | 'new' creator
        | qualifiedIdentifier (arguments)?
        ;

creator : (basicType | qualifiedIdentifier)
          ( arguments | '[' ']' ('[' ']')? (arrayInitializer)? | newArrayDeclarator )
        ;

newArrayDeclarator : '[' expression ']' ('[' expression ']')? ('[' ']')?
                   ;

literal : Int | StringLiteral | 'true' | 'false' | 'null'
        ;
