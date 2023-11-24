lexer grammar CoolLexer;

tokens { ERROR } 

@header{
    package cool.lexer;	
}

@members{
    int contor = 0;
    boolean e = false;
    private void raiseError(String msg) {
        contor = 0;
        setText(msg);
        setType(ERROR);
    }
}

// Class keywords
CLASS : 'class';
INHERITS : 'inherits';
NEW : 'new';
SELF : 'self';

// Instruction IF keywords
IF : 'if';
THEN : 'then';
ELSE : 'else';
FI : 'fi';

// Instruction LET keywords
LET : 'let';
IN : 'in';

// Instruction CASE keywords
CASE : 'case';
OF : 'of';
BRANCH : '=>';
ESAC : 'esac';

// Instruction WHILE keywords
WHILE : 'while';
LOOP : 'loop';
POOL : 'pool';

// Negation keywords
NOT : 'not';

// Boolean keywords
BOOL : ('true' | 'false');
ISVOID : 'isvoid';

// Operators
PLUS : '+';
MINUS : '-';
UNARY_MINUS : '~';
DIV : '/';
MULT : '*';
EQUAL : '=';
LT : '<';
LE : '<=';
ASSIGN : '<-';

// Types
CLASIC_TYPES : ('Object' | 'IO' | 'Int' | 'String' | 'Bool' | 'SELF_TYPE');

// Dispatches
CLASIC_DISPATCH : '.';
SUPER_DISPATCH : '@';

// Others
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
COMMA : ',';
SEMI : ';';
COLON : ':';

// We go on to more complex rules
fragment DIGIT : [0-9];
INT : DIGIT+;

fragment LETTER : [a-zA-Z];

fragment NEW_LINE : '\r'? '\n';
LINE_COMM : '--' .*? (NEW_LINE | EOF) -> skip;
//BLOCK_COMMENT : '(*'
//                (
//                    BLOCK_COMMENT
//                    | '*)' { raiseError("Unmatched *)"); }
//                    | .
//                )*?
//                (')*' | EOF { raiseError("EOF in comment"); });

UNMATCHED_STAR : '*)' { raiseError("Unmatched *)"); };
COMM : '(*'
       (
            COMM
            | .
       )*?
       '*)' -> skip;
COMM_EOF
    : '(*' (COMM | ~([*)]).)*?
       EOF { raiseError("EOF in comment"); };


// SPECIAL CHARACTERS
fragment ESCAPED_CHAR : ('\\b' | '\\t' | '\\n' | '\\f' | '\\\\' | '\\\\n');
fragment NULL_CHAR : '\u0000';
fragment BACKSLASH : '\\';
fragment ESCAPED_NEWLINE : '\\\r\n';
fragment UNESCAPED_NEWLINE : '\r\n';
STRING : '"'
         (
            (
                ESCAPED_CHAR { contor++; }
                | ESCAPED_NEWLINE
                | BACKSLASH
                | NULL_CHAR {
                                raiseError("String contains null character");
                                e = true;
                            }
                | . { contor++; }
            )
         )*?
         (
            '"' {
                    if (contor > 1024) {
                        raiseError("String constant too long");
                        e = true;
                    }
                    if (!e) {
                        String formatedStr = getText().substring(1, getText().length() - 1);
                        char[] str = formatedStr.toCharArray();

                        StringBuilder finalStr = new StringBuilder();

                        for(int i = 0; i < str.length; i++) {
                            if (str[i] != '\\') {
                                finalStr.append(str[i]);
                            } else {
                                if (str[i + 1] == 'b') {
                                    finalStr.append('\b');
                                } else if (str[i + 1] == 't') {
                                    finalStr.append('\t');
                                } else if (str[i + 1] == 'n') {
                                    finalStr.append('\n');
                                } else if (str[i + 1] == 'f') {
                                    finalStr.append('\f');
                                } else if (str[i + 1] == '\\') {
                                    finalStr.append('\\');
                                } else {
                                    finalStr.append(str[i + 1]);
                                }
                                i++;
                            }
                        }

                        setText(finalStr.toString());
                    }
                }
            | UNESCAPED_NEWLINE { raiseError("Unterminated string constant"); }
            | EOF { raiseError("EOF in string constant"); }
         );

ID : (LETTER | '_')(LETTER | '_' | DIGIT)*;

WS
    :   [ \n\f\r\t]+ -> skip
    ;

INVALID: . { raiseError("Invalid character: " + getText()); };