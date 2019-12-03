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

classDeclaration : 'class' ID (extends qualifiedIdentifier)? classBody
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
          | <identifier> ':' statement
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

arguments : ( [expression {, expression}] );

type : referenceType | basicType;

basicType : boolean | char | int;

referenceType : basicType [ ] {[ ]};
                | qualifiedIdentifier {[ ]};

statementExpression : expression // but must have side-effect, eg i++;

expression : assignmentExpression;

assignmentExpression : conditionalAndExpression // must be a valid lhs;
                        [(= | +=) assignmentExpression];

conditionalAndExpression : equalityExpression // level 10;
                            {&& equalityExpression};

equalityExpression : relationalExpression // level 6;
                        {== relationalExpression};

relationalExpression : additiveExpression // level 5;
                        [(> | <=) additiveExpression | instanceof referenceType];

additiveExpression : multiplicativeExpression // level 3;
                        {(+ | -) multiplicativeExpression};

multiplicativeExpression : unaryExpression // level 2;
                            {* unaryExpression};

unaryExpression : ++ unaryExpression // level 1;
                    | - unaryExpression;
                    | simpleUnaryExpression;

simpleUnaryExpression : ! unaryExpression;
                        | ( basicType ) unaryExpression //cast;
                        | ( referenceType ) simpleUnaryExpression // cast;
                        | postfixExpression;

postfixExpression : primary {selector} {--};

selector : . qualifiedIdentifier [arguments];
            | [ expression ];

primary : parExpression;
            | this [arguments];
            | super (arguments | . <identifier> [arguments]);
            | literal;
            | new creator;
            | qualifiedIdentifier [arguments];

creator : (basicType | qualifiedIdentifier);
            ( arguments;
            | [ ] {[ ]} [arrayInitializer];
            | newArrayDeclarator );

newArrayDeclarator : [ expression ] {[ expression ]} {[ ]};

literal : <int_literal> | <char_literal> | <string_literal> | true | false | null;
