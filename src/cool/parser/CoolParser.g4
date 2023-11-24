parser grammar CoolParser;

options {
    tokenVocab = CoolLexer;
}

@header{
    package cool.parser;
}

program
    :   (classes+=class SEMI)+ EOF                                                                                                                          # prog
    ;

class
    :   CLASS type=(CLASIC_TYPES | ID) (INHERITS inheritance=(CLASIC_TYPES | ID))? LBRACE (features+=feature SEMI)* RBRACE                                  # class_declaration
    ;

feature
    :   name=ID LPAREN (formals+=formal (COMMA formals+=formal)?)? RPAREN COLON type=(CLASIC_TYPES | ID) LBRACE body=expr RBRACE                            # funcDef
    |   name=ID COLON type=(CLASIC_TYPES | ID) (ASSIGN init=expr)?                                                                                          # varDef
    ;

formal
    :   name=ID COLON type=(CLASIC_TYPES | ID)                                                                                                              # form
    ;

expr
    :   name=ID LPAREN (params+=expr (COMMA params+=expr)*)? RPAREN                                                                                         # func_call
    |   disp=expr (SUPER_DISPATCH sup=(CLASIC_TYPES | ID))? CLASIC_DISPATCH name=ID LPAREN (params+=expr (COMMA params+=expr)*)? RPAREN                     # dispatch
    |   LBRACE (body+=expr SEMI)+ RBRACE                                                                                                                    # block
    |   LET args+=largs (COMMA args+=largs)* IN body=expr    # let
    |   CASE cond=expr OF (names+=ID COLON types+=(CLASIC_TYPES | ID) BRANCH branches+=expr SEMI)+ ESAC                                                     # case
    |   WHILE cond=expr LOOP body=expr POOL                                                                                                                 # while
    |   IF cond=expr THEN th=expr ELSE el=expr FI                                                                                                           # if
    |   UNARY_MINUS body=expr                                                                                                                               # unary_minus
    |   left=expr op=(MULT | DIV) right=expr                                                                                                                # multDiv
    |   left=expr op=(PLUS | MINUS) right=expr                                                                                                              # plusMinus
    |   left=expr op=(LT | LE | EQUAL) right=expr                                                                                                           # realtional
    |   NOT body=expr                                                                                                                                       # not
    |   name=ID ASSIGN asg=expr                                                                                                                             # assign
    |   LPAREN body=expr RPAREN                                                                                                                             # paren
    |   ISVOID body=expr                                                                                                                                    # isvoid
    |   NEW type=(CLASIC_TYPES | ID)                                                                                                                        # new
    |   ID                                                                                                                                                  # id
    |   INT                                                                                                                                                 # int
    |   STRING                                                                                                                                              # string
    |   BOOL                                                                                                                                                # bool
    |   SELF                                                                                                                                                # self
    ;

largs
    : name=ID COLON type=(CLASIC_TYPES | ID) (ASSIGN asg=expr)?
    ;
