//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from E:\Asp.net\Compiler_parax\Faz-2\Faz_2_ANTLR_v2\MyProject\c.g4 by ANTLR 4.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591

namespace MyProject {

	using System;
	using System.Collections;

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="cParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.3")]
[System.CLSCompliant(false)]
public interface IcListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="cParser.atom"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAtom([NotNull] cParser.AtomContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="cParser.atom"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAtom([NotNull] cParser.AtomContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="cParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProg([NotNull] cParser.ProgContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="cParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProg([NotNull] cParser.ProgContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="cParser.texpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTexpr([NotNull] cParser.TexprContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="cParser.texpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTexpr([NotNull] cParser.TexprContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="cParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpr([NotNull] cParser.ExprContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="cParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpr([NotNull] cParser.ExprContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="cParser.stat"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStat([NotNull] cParser.StatContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="cParser.stat"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStat([NotNull] cParser.StatContext context);
}
} // namespace MyProject
