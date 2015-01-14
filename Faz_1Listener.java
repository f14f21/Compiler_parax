// Generated from E:\Asp.net\Compiler_parax\Faz_1.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Faz_1Parser}.
 */
public interface Faz_1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(@NotNull Faz_1Parser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(@NotNull Faz_1Parser.DefineContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#assignstat}.
	 * @param ctx the parse tree
	 */
	void enterAssignstat(@NotNull Faz_1Parser.AssignstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#assignstat}.
	 * @param ctx the parse tree
	 */
	void exitAssignstat(@NotNull Faz_1Parser.AssignstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull Faz_1Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull Faz_1Parser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#forstat}.
	 * @param ctx the parse tree
	 */
	void enterForstat(@NotNull Faz_1Parser.ForstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#forstat}.
	 * @param ctx the parse tree
	 */
	void exitForstat(@NotNull Faz_1Parser.ForstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull Faz_1Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull Faz_1Parser.StmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#whilestat}.
	 * @param ctx the parse tree
	 */
	void enterWhilestat(@NotNull Faz_1Parser.WhilestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#whilestat}.
	 * @param ctx the parse tree
	 */
	void exitWhilestat(@NotNull Faz_1Parser.WhilestatContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#elsepart}.
	 * @param ctx the parse tree
	 */
	void enterElsepart(@NotNull Faz_1Parser.ElsepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#elsepart}.
	 * @param ctx the parse tree
	 */
	void exitElsepart(@NotNull Faz_1Parser.ElsepartContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull Faz_1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull Faz_1Parser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(@NotNull Faz_1Parser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(@NotNull Faz_1Parser.IfstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#restexpr}.
	 * @param ctx the parse tree
	 */
	void enterRestexpr(@NotNull Faz_1Parser.RestexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#restexpr}.
	 * @param ctx the parse tree
	 */
	void exitRestexpr(@NotNull Faz_1Parser.RestexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(@NotNull Faz_1Parser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(@NotNull Faz_1Parser.ScriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(@NotNull Faz_1Parser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(@NotNull Faz_1Parser.CondContext ctx);

	/**
	 * Enter a parse tree produced by {@link Faz_1Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull Faz_1Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Faz_1Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull Faz_1Parser.PrintContext ctx);
}