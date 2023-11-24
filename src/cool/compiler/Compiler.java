package cool.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import cool.lexer.*;
import cool.parser.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Compiler {
    // Annotates class nodes with the names of files where they are defined.
    public static ParseTreeProperty<String> fileNames = new ParseTreeProperty<>();

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("No file(s) given");
            return;
        }

        CoolLexer lexer = null;
        CommonTokenStream tokenStream = null;
        CoolParser parser = null;
        ParserRuleContext globalTree = null;

        // True if any lexical or syntax errors occur.
        boolean lexicalSyntaxErrors = false;

        // Parse each input file and build one big parse tree out of
        // individual parse trees.
        for (var fileName : args) {
            var input = CharStreams.fromFileName(fileName);

            // Lexer
            if (lexer == null)
                lexer = new CoolLexer(input);
            else
                lexer.setInputStream(input);

            // Token stream
            if (tokenStream == null)
                tokenStream = new CommonTokenStream(lexer);
            else
                tokenStream.setTokenSource(lexer);


//            // Test lexer only.
//            tokenStream.fill();
//            List<Token> tokens = tokenStream.getTokens();
//            tokens.stream().forEach(token -> {
//                var text = token.getText();
//                var name = CoolLexer.VOCABULARY.getSymbolicName(token.getType());
//
//                System.out.println(text + " : " + name);
//                //System.out.println(token);
//            });


            // Parser
            if (parser == null)
                parser = new CoolParser(tokenStream);
            else
                parser.setTokenStream(tokenStream);

            // Customized error listener, for including file names in error
            // messages.
            var errorListener = new BaseErrorListener() {
                public boolean errors = false;

                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    String newMsg = "\"" + new File(fileName).getName() + "\", line " +
                            line + ":" + (charPositionInLine + 1) + ", ";

                    Token token = (Token)offendingSymbol;
                    if (token.getType() == CoolLexer.ERROR)
                        newMsg += "Lexical error: " + token.getText();
                    else
                        newMsg += "Syntax error: " + msg;

                    System.err.println(newMsg);
                    errors = true;
                }
            };

            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            // Actual parsing
            var tree = parser.program();
            if (globalTree == null)
                globalTree = tree;
            else
                // Add the current parse tree's children to the global tree.
                for (int i = 0; i < tree.getChildCount(); i++)
                    globalTree.addAnyChild(tree.getChild(i));

            // Annotate class nodes with file names, to be used later
            // in semantic error messages.
            for (int i = 0; i < tree.getChildCount(); i++) {
                var child = tree.getChild(i);
                // The only ParserRuleContext children of the program node
                // are class nodes.
                if (child instanceof ParserRuleContext)
                    fileNames.put(child, fileName);
            }

            // Record any lexical or syntax errors.
            lexicalSyntaxErrors |= errorListener.errors;
        }

        // Stop before semantic analysis phase, in case errors occurred.
        if (lexicalSyntaxErrors) {
            System.err.println("Compilation halted");
            return;
        }

        // TODO Print tree
        var astConstructorVisitor = new CoolParserBaseVisitor<ASTNode>() {
            @Override
            public ASTNode visitInt(CoolParser.IntContext ctx) {
                return new Int(ctx.INT().getSymbol());
            }

            @Override
            public ASTNode visitId(CoolParser.IdContext ctx) {
                return new Id(ctx.ID().getSymbol());
            }

            @Override
            public ASTNode visitBool(CoolParser.BoolContext ctx) {
                return new Bool(ctx.BOOL().getSymbol());
            }

            @Override
            public ASTNode visitSelf(CoolParser.SelfContext ctx) {
                return new Self(ctx.SELF().getSymbol());
            }

            @Override
            public ASTNode visitString(CoolParser.StringContext ctx) {
                return new Str(ctx.STRING().getSymbol());
            }

            @Override
            public ASTNode visitIf(CoolParser.IfContext ctx) {
                return new If((Expression) visit(ctx.cond),
                        (Expression) visit(ctx.th),
                        (Expression) visit(ctx.el),
                        ctx.start);
            }

            @Override
            public ASTNode visitMultDiv(CoolParser.MultDivContext ctx) {
                return new MultDiv((Expression) visit(ctx.left),
                        (Expression) visit(ctx.right),
                        ctx.op);
            }

            @Override
            public ASTNode visitPlusMinus(CoolParser.PlusMinusContext ctx) {
                return new PlusMinus((Expression) visit(ctx.left),
                        (Expression) visit(ctx.right),
                        ctx.op);
            }

            @Override
            public ASTNode visitRealtional(CoolParser.RealtionalContext ctx) {
                return new Relational((Expression) visit(ctx.left),
                        (Expression) visit(ctx.right),
                        ctx.op);
            }

            @Override
            public ASTNode visitUnary_minus(CoolParser.Unary_minusContext ctx) {
                return new UnaryMinus((Expression) visit(ctx.body),
                        ctx.start);
            }

            @Override
            public ASTNode visitAssign(CoolParser.AssignContext ctx) {
                return new Assign(new Id(ctx.name),
                        (Expression) visit(ctx.asg),
                        ctx.ASSIGN().getSymbol());
            }

            @Override
            public ASTNode visitIsvoid(CoolParser.IsvoidContext ctx) {
                return new IsVoid((Expression) visit(ctx.body),
                        ctx.ISVOID().getSymbol());
            }

            @Override
            public ASTNode visitNot(CoolParser.NotContext ctx) {
                return new Not((Expression) visit(ctx.body),
                        ctx.NOT().getSymbol());
            }

            @Override
            public ASTNode visitNew(CoolParser.NewContext ctx) {
                return new New(new Type(ctx.type),
                        ctx.NEW().getSymbol());
            }

            @Override
            public ASTNode visitWhile(CoolParser.WhileContext ctx) {
                return new While((Expression) visit(ctx.cond),
                        (Expression) visit(ctx.body),
                        ctx.WHILE().getSymbol());
            }

            @Override
            public ASTNode visitParen(CoolParser.ParenContext ctx) {
                return new Paren((Expression) visit(ctx.body),
                        null);
            }

            @Override
            public ASTNode visitBlock(CoolParser.BlockContext ctx) {
                List<Expression> exprs = new ArrayList<Expression>();
                for (var ex : ctx.body) {
                    exprs.add((Expression) visit(ex));
                }

                return new Block(exprs, null);
            }

            @Override
            public ASTNode visitCase(CoolParser.CaseContext ctx) {
                List<Id> names = new ArrayList<Id>();
                List<Type> types = new ArrayList<>();
                List<Expression> exprs = new ArrayList<Expression>();

                for (var name : ctx.names) {
                    names.add(new Id(name));
                }

                for (var type : ctx.types) {
                    types.add(new Type(type));
                }

                for (var expr : ctx.branches) {
                    exprs.add((Expression) visit(expr));
                }

                return new Case((Expression) visit(ctx.cond),
                        names,
                        types,
                        exprs,
                        ctx.CASE().getSymbol());
            }

            @Override
            public ASTNode visitFunc_call(CoolParser.Func_callContext ctx) {
                List<Expression> params = new ArrayList<>();

                for (var param : ctx.params) {
                    params.add((Expression) visit(param));
                }

                return new Call(params, ctx.name);
            }

            @Override
            public ASTNode visitDispatch(CoolParser.DispatchContext ctx) {
                List<Expression> params = new ArrayList<>();

                for (var param : ctx.params) {
                    params.add((Expression) visit(param));
                }

                return new Disp((Expression) visit(ctx.disp),
                        new Type(ctx.sup),
                        params,
                        ctx.name);
            }

            @Override
            public ASTNode visitLet(CoolParser.LetContext ctx) {
                List<LetArgs> args = new ArrayList<>();

                for (var arg : ctx.args) {
                    args.add((LetArgs) visit(arg));
                }

                return new Let(args,
                        (Expression) visit(ctx.body),
                        null);
            }

            @Override
            public ASTNode visitLargs(CoolParser.LargsContext ctx) {
                if (ctx.asg != null) {
                    return new LetArgs(new Id(ctx.name),
                            new Type(ctx.type),
                            (Expression) visit(ctx.asg),
                            null);
                } else {
                    return new LetArgs(new Id(ctx.name),
                            new Type(ctx.type),
                            null,
                            null);
                }
            }

            @Override
            public ASTNode visitVarDef(CoolParser.VarDefContext ctx) {
                if (ctx.init != null) {
                    return new VarDef(new Type(ctx.type),
                            new Id(ctx.name),
                            (Expression) visit(ctx.init),
                            ctx.start);
                } else {
                    return new VarDef(new Type(ctx.type),
                            new Id(ctx.name),
                            null,
                            ctx.start);
                }
            }

            @Override
            public ASTNode visitFuncDef(CoolParser.FuncDefContext ctx) {
                List<Formal> formals = new ArrayList<>();
                for(var formal : ctx.formals) {
                    formals.add((Formal) visit(formal));
                }

                return new FuncDef(new Type(ctx.type),
                        new Id(ctx.name),
                        formals,
                        (Expression) visit(ctx.body),
                        ctx.start);
            }

            @Override
            public ASTNode visitForm(CoolParser.FormContext ctx) {
                return new Formal(new Type(ctx.type), new Id(ctx.name), ctx.start);
            }

            @Override
            public ASTNode visitClass_declaration(CoolParser.Class_declarationContext ctx) {
                List<Feature> features = new ArrayList<>();

                for (var feature : ctx.features) {
                    features.add((Feature) visit(feature));
                }

                return new Class(new Type(ctx.type),
                        new Type(ctx.inheritance),
                        features,
                        ctx.start);
            }

            @Override
            public ASTNode visitProg(CoolParser.ProgContext ctx) {
                List<Class> classes = new ArrayList<>();
                for (var clas : ctx.classes) {
                    classes.add((Class) visit(clas));
                }

                return new Program(classes, ctx.start);
            }
        };
        var ast = astConstructorVisitor.visit(globalTree);
        var printVisitor = new ASTVisitor<Void>() {
            int indent;

            void printIndent(String str) {
                for (int i = 0; i < indent; i++)
                    System.out.print("  ");
                System.out.println(str);
            }

            @Override
            public Void visit(Id id) {
                printIndent(id.token.getText());
                return null;
            }

            @Override
            public Void visit(Int intt) {
                printIndent(intt.token.getText());
                return null;
            }

            @Override
            public Void visit(Str str) {
                printIndent(str.token.getText());
                return null;
            }

            @Override
            public Void visit(Bool bool) {
                printIndent(bool.token.getText());
                return null;
            }

            @Override
            public Void visit(Self self) {
                printIndent("self");
                return null;
            }

            @Override
            public Void visit(IsVoid isVoid) {
                printIndent("isvoid");
                indent++;
                isVoid.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(New neww) {
                printIndent("new");
                indent++;
                neww.type.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Type type) {
                printIndent(type.token.getText());
                return null;
            }

            @Override
            public Void visit(Not not) {
                printIndent("not");
                indent++;
                not.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Assign assign) {
                printIndent("<-");
                indent++;
                assign.name.accept(this);
                assign.asg.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(PlusMinus plusMinus) {
                printIndent(plusMinus.token.getText());
                indent++;
                plusMinus.left.accept(this);
                plusMinus.right.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(MultDiv multDiv) {
                printIndent(multDiv.token.getText());
                indent++;
                multDiv.left.accept(this);
                multDiv.right.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Relational relational) {
                printIndent(relational.token.getText());
                indent++;
                relational.left.accept(this);
                relational.right.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(UnaryMinus unaryMinus) {
                printIndent(unaryMinus.token.getText());
                indent++;
                unaryMinus.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(If iff) {
                printIndent("if");
                indent++;
                iff.cond.accept(this);
                iff.th.accept(this);
                iff.el.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Paren paren) {
                paren.body.accept(this);
                return null;
            }

            @Override
            public Void visit(Call call) {
                printIndent("implicit dispatch");
                indent++;
                printIndent(call.token.getText());
                for (Expression e : call.params) {
                    e.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(While whilee) {
                printIndent("while");
                indent++;
                whilee.cond.accept(this);
                whilee.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Block block) {
                printIndent("block");
                indent++;
                for (Expression e : block.body) {
                    e.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Case casee) {
                printIndent("case");
                indent++;
                casee.cond.accept(this);
                for (int i = 0; i < casee.names.size(); i++) {
                    printIndent("case branch");
                    indent++;
                    casee.names.get(i).accept(this);
                    casee.types.get(i).accept(this);
                    casee.branches.get(i).accept(this);
                    indent--;
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Let let) {
                printIndent("let");
                indent++;
                for (var letArg : let.args) {
                    letArg.accept(this);
                }
                let.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(LetArgs letArgs) {
                printIndent("local");
                indent++;
                letArgs.name.accept(this);
                letArgs.type.accept(this);
                if (letArgs.asg != null) {
                    letArgs.asg.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Formal formal) {
                printIndent("formal");
                indent++;
                formal.name.accept(this);
                formal.type.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Disp disp) {
                printIndent(".");
                indent++;
                disp.disp.accept(this);
                if(disp.sup.token != null) {
                    disp.sup.accept(this);
                }
                printIndent(disp.token.getText());
                for (Expression e : disp.params) {
                    e.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(VarDef varDef) {
                printIndent("attribute");
                indent++;
                varDef.name.accept(this);
                varDef.type.accept(this);
                if (varDef.init != null) {
                    varDef.init.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(FuncDef funcDef) {
                printIndent("method");
                indent++;
                funcDef.name.accept(this);
                for (Formal f : funcDef.formals) {
                    f.accept(this);
                }
                funcDef.type.accept(this);
                funcDef.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Class clas) {
                printIndent("class");
                indent++;
                clas.type.accept(this);
                if (clas.inheritance.token != null) {
                    clas.inheritance.accept(this);
                }
                for (Feature f : clas.features) {
                    f.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Program program) {
                printIndent("program");
                indent++;
                for (Class c : program.classes) {
                    c.accept(this);
                }
                indent--;
                return null;
            }
        };
        ast.accept(printVisitor);
    }
}
