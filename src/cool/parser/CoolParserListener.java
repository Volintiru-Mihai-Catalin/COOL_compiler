// Generated from C:/Users/Voli/Desktop/CPL/Tema1/src/cool/parser/CoolParser.g4 by ANTLR 4.13.1

    package cool.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code prog}
	 * labeled alternative in {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProg(CoolParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prog}
	 * labeled alternative in {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProg(CoolParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_declaration}
	 * labeled alternative in {@link CoolParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(CoolParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_declaration}
	 * labeled alternative in {@link CoolParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(CoolParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDef}
	 * labeled alternative in {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(CoolParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDef}
	 * labeled alternative in {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(CoolParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(CoolParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(CoolParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code form}
	 * labeled alternative in {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterForm(CoolParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by the {@code form}
	 * labeled alternative in {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitForm(CoolParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNew(CoolParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNew(CoolParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(CoolParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(CoolParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(CoolParser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(CoolParser.DispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(CoolParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(CoolParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(CoolParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(CoolParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_minus}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_minus(CoolParser.Unary_minusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_minus}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_minus(CoolParser.Unary_minusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realtional}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRealtional(CoolParser.RealtionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realtional}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRealtional(CoolParser.RealtionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile(CoolParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile(CoolParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_call}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(CoolParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_call}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(CoolParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CoolParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CoolParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(CoolParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(CoolParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(CoolParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(CoolParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(CoolParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(CoolParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelf(CoolParser.SelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelf(CoolParser.SelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLet(CoolParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLet(CoolParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CoolParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CoolParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(CoolParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(CoolParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase(CoolParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase(CoolParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CoolParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CoolParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#largs}.
	 * @param ctx the parse tree
	 */
	void enterLargs(CoolParser.LargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#largs}.
	 * @param ctx the parse tree
	 */
	void exitLargs(CoolParser.LargsContext ctx);
}