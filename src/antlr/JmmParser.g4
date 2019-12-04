parser grammar JmmParser;

options { tokenVocab=Scanner; }

compilationUnit : (PACKAGE qualifiedIdentifier PontVirgula)?
                  (IMPORT qualifiedIdentifier PontVirgula)*
                  typeDeclaration EOF
                ;

qualifiedIdentifier : ID ('.' ID)*
                    ;

typeDeclaration : (modifiers)? classDeclaration
                ;

modifiers : PUBLIC
          | PROTECTED
          | PRIVATE
          | STATIC
          | ABSTRACT
          ;

classDeclaration : CLASS ID (EXTENDS qualifiedIdentifier)? classBody
                 ;

classBody : AbreChave ((modifiers)? memberDecl)* FechaChave
          ;

memberDecl : ID formalParameters block
           | (VOID | type) ID formalParameters (block | PontVirgula)
           | type variableDeclarators PontVirgula // nao ok
           ;

block : AbreChave (blockStatement)* FechaChave
      ;

blockStatement : localVariableDeclarationStatement
               | statement
               ;

statement : block
          | IF parExpression statement (ELSE statement)?
          | WHILE parExpression statement
          | RETURN (expression)? PontVirgula
          | PontVirgula
          | statementExpression PontVirgula
          ;

formalParameters : AP (formalParameter (Virgula formalParameter)*)? FP
                 ;

formalParameter : type ID
                ;

parExpression : AP expression FP
              ;

localVariableDeclarationStatement : type variableDeclarators PontVirgula
                                  ;

variableDeclarators : variableDeclarator (Virgula variableDeclarator)*
                    ;

variableDeclarator : ID (ATRIBUICAO variableInitializer)?;

variableInitializer : literal
                    | ID
                    | arrayInitializer
                    | expression
                    ;

arrayInitializer : AbreChave (variableInitializer (Virgula variableInitializer)*)? FechaChave
                 ;

arguments : AP (expression (Virgula expression)*)? FP
          ;

type : referenceType
     | basicType
     ;

basicType : BOOLEAN
          | CHAR
          | INT
          ;

referenceType : basicType AC FC (AC FC)?
              | qualifiedIdentifier (AC FC)?
              ;

statementExpression : expression
                    ;

expression : assignmentExpression
           ;

assignmentExpression : conditionalAndExpression ((ATRIBUICAO | OpSomaAtribuicao) assignmentExpression)?
                     ;

conditionalAndExpression : equalityExpression (AND equalityExpression)?
                         ;

equalityExpression : relationalExpression (IGUALDADE relationalExpression)?
                   ;

relationalExpression : additiveExpression ((OpMaior | OpMenorIgual) additiveExpression | INSTANCEOF referenceType)?
                     ;

additiveExpression : multiplicativeExpression ((ADICAO | SUBITRACAO) multiplicativeExpression)?
                   ;

multiplicativeExpression : unaryExpression (MULTIPLICACAO unaryExpression)?
                         ;

unaryExpression : INCREMENTO unaryExpression
                | DECREMENTO unaryExpression
                | simpleUnaryExpression
                ;

simpleUnaryExpression : OpNegacao unaryExpression
                      | AP basicType FP unaryExpression
                      | AP referenceType FP simpleUnaryExpression
                      | postfixExpression
                      ;

postfixExpression : primary (selector) (INCREMENTO | DECREMENTO)?
                  ;

selector : Ponto qualifiedIdentifier (arguments)?
         | AC expression FC
         ;

primary : parExpression
        | THIS (arguments)?
        | SUPER (arguments | Ponto ID (arguments)?)
        | literal
        | NEW creator
        | qualifiedIdentifier (arguments)?
        ;

creator : (basicType | qualifiedIdentifier)
          ( arguments | AC FC (AC FC)? (arrayInitializer)? | newArrayDeclarator )
        ;

newArrayDeclarator : AC expression FC (AC expression FC)? (AC FC)?
                   ;

literal : Int | StringLiteral | TRUE | FALSE | NULL
        ;
