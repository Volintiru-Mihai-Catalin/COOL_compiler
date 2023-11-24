package cool.compiler;

import org.antlr.v4.runtime.Token;

import java.sql.Types;
import java.util.List;

public abstract class ASTNode {
    Token token;

    ASTNode(Token token) {
        this.token = token;
    }

    Token getToken() {
        return token;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return null;
    }
}

abstract class Expression extends ASTNode {
    Expression(Token token) {
        super(token);
    }
}

class Id extends Expression {
    Id(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Int extends Expression {
    Int(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Bool extends Expression {
    Bool(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Self extends Expression {
    Self(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Str extends Expression {
    Str(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class New extends Expression {
    Type type;

    New(Type type, Token token) {
        super(token);
        this.type = type;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class IsVoid extends Expression {
    Expression body;

    IsVoid(Expression body, Token token) {
        super(token);
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Paren extends Expression {
    Expression body;

    Paren(Expression body, Token token) {
        super(token);
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Assign extends Expression {
    Id name;
    Expression asg;

    Assign(Id name, Expression asg, Token token) {
        super(token);
        this.name = name;
        this.asg = asg;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Relational extends Expression {
    Expression left;
    Expression right;

    Relational(Expression left, Expression right, Token op) {
        super(op);
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class PlusMinus extends Expression {
    Expression left;
    Expression right;

    PlusMinus(Expression left, Expression right, Token op) {
        super(op);
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class MultDiv extends Expression {
    Expression left;
    Expression right;

    MultDiv(Expression left, Expression right, Token op) {
        super(op);
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class UnaryMinus extends Expression {
    Expression body;

    UnaryMinus(Expression body, Token token) {
        super(token);
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Not extends Expression {
    Expression body;

    Not(Expression body, Token token) {
        super(token);
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class If extends Expression {
    Expression cond;
    Expression th;
    Expression el;

    If(Expression cond, Expression th, Expression el, Token token) {
        super(token);
        this.cond = cond;
        this.el = el;
        this.th = th;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class While extends Expression {
    Expression cond;
    Expression body;

    While(Expression cond, Expression body, Token token) {
        super(token);
        this.cond = cond;
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Case extends Expression {
    Expression cond;
    List<Id> names;
    List<Type> types;
    List<Expression> branches;

    Case(Expression cond, List<Id> names, List<Type> types, List<Expression> branches, Token token) {
        super(token);
        this.cond = cond;
        this.names = names;
        this.types = types;
        this.branches = branches;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Let extends Expression {
    List<LetArgs> args;
    Expression body;

    Let(List<LetArgs>args, Expression body, Token token) {
        super(token);
        this.args = args;
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class LetArgs extends ASTNode {
    Id name;
    Type type;
    Expression asg;

    LetArgs(Id name, Type type, Expression asg, Token token) {
        super(token);
        this.name = name;
        this.type = type;
        this.asg = asg;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Block extends Expression {
    List<Expression> body;

    Block(List<Expression> body, Token token) {
        super(token);
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Call extends Expression {
    List<Expression> params;

    Call(List<Expression> params, Token name) {
        super(name);
        this.params = params;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Disp extends Expression {
    Expression disp;
    Type sup;
    List<Expression> params;

    Disp(Expression disp, Type sup, List<Expression> params, Token token) {
        super(token);
        this.disp = disp;
        this.sup = sup;
        this.params = params;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

abstract class Feature extends ASTNode {

    Feature(Token token) {
        super(token);
    }
}

class Type extends ASTNode {
    Type(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Formal extends ASTNode {
    Id name;
    Type type;
    Formal(Type type, Id name, Token token) {
        super(token);
        this.type = type;
        this.name = name;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class VarDef extends Feature {
    Type type;
    Id name;
    Expression init;

    VarDef(Type type, Id name, Expression init, Token token) {
        super(token);
        this.type = type;
        this.name = name;
        this.init = init;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class FuncDef extends Feature {
    Type type;
    Id name;
    List<Formal> formals;
    Expression body;

    FuncDef(Type type, Id name, List<Formal> formals, Expression body, Token token) {
        super(token);
        this.type = type;
        this.name = name;
        this.formals = formals;
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Class extends ASTNode {
    Type type;
    Type inheritance;
    List<Feature> features;

    Class(Type type, Type inheritance, List<Feature> features, Token token) {
        super(token);
        this.type = type;
        this.inheritance = inheritance;
        this.features = features;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Program extends ASTNode {
    List<Class> classes;

    Program(List<Class> classes, Token token) {
        super(token);
        this.classes = classes;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
