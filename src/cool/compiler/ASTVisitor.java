package cool.compiler;

import cool.compiler.*;

public interface ASTVisitor<T> {

    T visit(Id id);
    T visit(Int intt);
    T visit(Bool bool);
    T visit(Self self);
    T visit(Str str);
    T visit(New neww);
    T visit(IsVoid isVoid);
    T visit(Paren paren);
    T visit(Assign assign);
    T visit(Relational relational);
    T visit(PlusMinus plusMinus);
    T visit(MultDiv multDiv);
    T visit(UnaryMinus unaryMinus);
    T visit(Not not);
    T visit(If iff);
    T visit(While whilee);
    T visit(Case casee);
    T visit(Let let);
    T visit(Block block);
    T visit(Call call);
    T visit(Disp disp);
    T visit(Type type);
    T visit(Formal formal);
    T visit(VarDef varDef);
    T visit(FuncDef funcDef);
    T visit(Class clas);
    T visit(Program program);
    T visit(LetArgs letArgs);
}
