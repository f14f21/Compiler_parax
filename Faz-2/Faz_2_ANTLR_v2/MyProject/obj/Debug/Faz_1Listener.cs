//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from E:\Asp.net\Compiler_parax\Faz-2\Faz_2_ANTLR_v2\MyProject\Faz_1.g4 by ANTLR 4.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591

namespace MyProject {
using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="Faz_1Parser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.3")]
[System.CLSCompliant(false)]
public interface IFaz_1Listener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.define"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDefine([NotNull] Faz_1Parser.DefineContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.define"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDefine([NotNull] Faz_1Parser.DefineContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.assignstat"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssignstat([NotNull] Faz_1Parser.AssignstatContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.assignstat"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssignstat([NotNull] Faz_1Parser.AssignstatContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.term"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTerm([NotNull] Faz_1Parser.TermContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.term"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTerm([NotNull] Faz_1Parser.TermContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.forstat"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterForstat([NotNull] Faz_1Parser.ForstatContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.forstat"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitForstat([NotNull] Faz_1Parser.ForstatContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmt([NotNull] Faz_1Parser.StmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmt([NotNull] Faz_1Parser.StmtContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.whilestat"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhilestat([NotNull] Faz_1Parser.WhilestatContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.whilestat"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhilestat([NotNull] Faz_1Parser.WhilestatContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.elsepart"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElsepart([NotNull] Faz_1Parser.ElsepartContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.elsepart"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElsepart([NotNull] Faz_1Parser.ElsepartContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpr([NotNull] Faz_1Parser.ExprContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpr([NotNull] Faz_1Parser.ExprContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.ifstat"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIfstat([NotNull] Faz_1Parser.IfstatContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.ifstat"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIfstat([NotNull] Faz_1Parser.IfstatContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.restexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRestexpr([NotNull] Faz_1Parser.RestexprContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.restexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRestexpr([NotNull] Faz_1Parser.RestexprContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.script"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterScript([NotNull] Faz_1Parser.ScriptContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.script"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitScript([NotNull] Faz_1Parser.ScriptContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCond([NotNull] Faz_1Parser.CondContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCond([NotNull] Faz_1Parser.CondContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="Faz_1Parser.print"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrint([NotNull] Faz_1Parser.PrintContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="Faz_1Parser.print"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrint([NotNull] Faz_1Parser.PrintContext context);
}
} // namespace MyProject
