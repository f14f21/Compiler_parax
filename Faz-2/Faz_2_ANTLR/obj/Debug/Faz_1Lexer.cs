//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from E:\Asp.net\Compiler_parax\Faz-2\Faz_2_ANTLR\Faz_1.g4 by ANTLR 4.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591

namespace Faz_2_ANTLR {
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.3")]
[System.CLSCompliant(false)]
public partial class Faz_1Lexer : Lexer {
	public const int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, Relation=19, OpRep=20, Relop=21, ID=22, Letter=23, Num=24, 
		Comment=25, WS=26;
	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static readonly string[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "Relation", "OpRep", "Relop", "ID", "Letter", "Num", "Comment", 
		"WS"
	};


	public Faz_1Lexer(ICharStream input)
		: base(input)
	{
		_interp = new LexerATNSimulator(this,_ATN);
	}

	public override string GrammarFileName { get { return "Faz_1.g4"; } }

	public override string[] TokenNames { get { return tokenNames; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return _serializedATN; } }

	public override void Action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 25 : WS_action(_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: Skip(); break;
		}
	}

	public static readonly string _serializedATN =
		"\x3\xAF6F\x8320\x479D\xB75C\x4880\x1605\x191C\xAB37\x2\x1C\xC0\b\x1\x4"+
		"\x2\t\x2\x4\x3\t\x3\x4\x4\t\x4\x4\x5\t\x5\x4\x6\t\x6\x4\a\t\a\x4\b\t\b"+
		"\x4\t\t\t\x4\n\t\n\x4\v\t\v\x4\f\t\f\x4\r\t\r\x4\xE\t\xE\x4\xF\t\xF\x4"+
		"\x10\t\x10\x4\x11\t\x11\x4\x12\t\x12\x4\x13\t\x13\x4\x14\t\x14\x4\x15"+
		"\t\x15\x4\x16\t\x16\x4\x17\t\x17\x4\x18\t\x18\x4\x19\t\x19\x4\x1A\t\x1A"+
		"\x4\x1B\t\x1B\x3\x2\x3\x2\x3\x3\x3\x3\x3\x4\x3\x4\x3\x4\x3\x4\x3\x4\x3"+
		"\x4\x3\x5\x3\x5\x3\x6\x3\x6\x3\x6\x3\x6\x3\a\x3\a\x3\a\x3\a\x3\a\x3\a"+
		"\x3\b\x3\b\x3\b\x3\t\x3\t\x3\n\x3\n\x3\n\x3\n\x3\n\x3\v\x3\v\x3\v\x3\v"+
		"\x3\v\x3\v\x3\f\x3\f\x3\r\x3\r\x3\r\x3\r\x3\r\x3\r\x3\r\x3\xE\x3\xE\x3"+
		"\xF\x3\xF\x3\x10\x3\x10\x3\x10\x3\x10\x3\x10\x3\x10\x3\x11\x3\x11\x3\x11"+
		"\x3\x11\x3\x11\x3\x12\x3\x12\x3\x12\x3\x12\x3\x12\x3\x13\x3\x13\x3\x14"+
		"\x3\x14\x3\x14\x3\x14\x3\x14\x3\x14\x3\x14\x3\x14\x3\x14\x3\x14\x3\x14"+
		"\x5\x14\x88\n\x14\x3\x15\x3\x15\x3\x15\x3\x15\x5\x15\x8E\n\x15\x3\x16"+
		"\x3\x16\x3\x17\x3\x17\x3\x17\x3\x17\a\x17\x96\n\x17\f\x17\xE\x17\x99\v"+
		"\x17\x3\x18\x5\x18\x9C\n\x18\x3\x19\x6\x19\x9F\n\x19\r\x19\xE\x19\xA0"+
		"\x3\x1A\x3\x1A\x3\x1A\x3\x1A\a\x1A\xA7\n\x1A\f\x1A\xE\x1A\xAA\v\x1A\x3"+
		"\x1A\x3\x1A\x3\x1A\x3\x1A\x3\x1A\a\x1A\xB1\n\x1A\f\x1A\xE\x1A\xB4\v\x1A"+
		"\x3\x1A\x3\x1A\x5\x1A\xB8\n\x1A\x3\x1B\x6\x1B\xBB\n\x1B\r\x1B\xE\x1B\xBC"+
		"\x3\x1B\x3\x1B\x4\xA8\xB2\x2\x2\x1C\x3\x2\x3\x5\x2\x4\a\x2\x5\t\x2\x6"+
		"\v\x2\a\r\x2\b\xF\x2\t\x11\x2\n\x13\x2\v\x15\x2\f\x17\x2\r\x19\x2\xE\x1B"+
		"\x2\xF\x1D\x2\x10\x1F\x2\x11!\x2\x12#\x2\x13%\x2\x14\'\x2\x15)\x2\x16"+
		"+\x2\x17-\x2\x18/\x2\x19\x31\x2\x1A\x33\x2\x1B\x35\x2\x1C\x3\x2\x5\x5"+
		"\x2,-//\x31\x31\x4\x2\x43\\\x63|\x5\x2\v\f\xF\xF\"\"\xCE\x2\x3\x3\x2\x2"+
		"\x2\x2\x5\x3\x2\x2\x2\x2\a\x3\x2\x2\x2\x2\t\x3\x2\x2\x2\x2\v\x3\x2\x2"+
		"\x2\x2\r\x3\x2\x2\x2\x2\xF\x3\x2\x2\x2\x2\x11\x3\x2\x2\x2\x2\x13\x3\x2"+
		"\x2\x2\x2\x15\x3\x2\x2\x2\x2\x17\x3\x2\x2\x2\x2\x19\x3\x2\x2\x2\x2\x1B"+
		"\x3\x2\x2\x2\x2\x1D\x3\x2\x2\x2\x2\x1F\x3\x2\x2\x2\x2!\x3\x2\x2\x2\x2"+
		"#\x3\x2\x2\x2\x2%\x3\x2\x2\x2\x2\'\x3\x2\x2\x2\x2)\x3\x2\x2\x2\x2+\x3"+
		"\x2\x2\x2\x2-\x3\x2\x2\x2\x2/\x3\x2\x2\x2\x2\x31\x3\x2\x2\x2\x2\x33\x3"+
		"\x2\x2\x2\x2\x35\x3\x2\x2\x2\x3\x37\x3\x2\x2\x2\x5\x39\x3\x2\x2\x2\a;"+
		"\x3\x2\x2\x2\t\x41\x3\x2\x2\x2\v\x43\x3\x2\x2\x2\rG\x3\x2\x2\x2\xFM\x3"+
		"\x2\x2\x2\x11P\x3\x2\x2\x2\x13R\x3\x2\x2\x2\x15W\x3\x2\x2\x2\x17]\x3\x2"+
		"\x2\x2\x19_\x3\x2\x2\x2\x1B\x66\x3\x2\x2\x2\x1Dh\x3\x2\x2\x2\x1Fj\x3\x2"+
		"\x2\x2!p\x3\x2\x2\x2#u\x3\x2\x2\x2%z\x3\x2\x2\x2\'\x87\x3\x2\x2\x2)\x8D"+
		"\x3\x2\x2\x2+\x8F\x3\x2\x2\x2-\x91\x3\x2\x2\x2/\x9B\x3\x2\x2\x2\x31\x9E"+
		"\x3\x2\x2\x2\x33\xB7\x3\x2\x2\x2\x35\xBA\x3\x2\x2\x2\x37\x38\a+\x2\x2"+
		"\x38\x4\x3\x2\x2\x2\x39:\a.\x2\x2:\x6\x3\x2\x2\x2;<\ay\x2\x2<=\aj\x2\x2"+
		"=>\ak\x2\x2>?\an\x2\x2?@\ag\x2\x2@\b\x3\x2\x2\x2\x41\x42\a*\x2\x2\x42"+
		"\n\x3\x2\x2\x2\x43\x44\ah\x2\x2\x44\x45\aq\x2\x2\x45\x46\at\x2\x2\x46"+
		"\f\x3\x2\x2\x2GH\ar\x2\x2HI\at\x2\x2IJ\ak\x2\x2JK\ap\x2\x2KL\av\x2\x2"+
		"L\xE\x3\x2\x2\x2MN\ak\x2\x2NO\ah\x2\x2O\x10\x3\x2\x2\x2PQ\a?\x2\x2Q\x12"+
		"\x3\x2\x2\x2RS\ao\x2\x2ST\a\x63\x2\x2TU\ak\x2\x2UV\ap\x2\x2V\x14\x3\x2"+
		"\x2\x2WX\ax\x2\x2XY\aq\x2\x2YZ\ak\x2\x2Z[\a\x66\x2\x2[\\\a\"\x2\x2\\\x16"+
		"\x3\x2\x2\x2]^\a=\x2\x2^\x18\x3\x2\x2\x2_`\ar\x2\x2`\x61\at\x2\x2\x61"+
		"\x62\ak\x2\x2\x62\x63\ap\x2\x2\x63\x64\av\x2\x2\x64\x65\ah\x2\x2\x65\x1A"+
		"\x3\x2\x2\x2\x66g\a)\x2\x2g\x1C\x3\x2\x2\x2hi\a}\x2\x2i\x1E\x3\x2\x2\x2"+
		"jk\a\x65\x2\x2kl\aj\x2\x2lm\a\x63\x2\x2mn\at\x2\x2no\a\"\x2\x2o \x3\x2"+
		"\x2\x2pq\ag\x2\x2qr\an\x2\x2rs\au\x2\x2st\ag\x2\x2t\"\x3\x2\x2\x2uv\a"+
		"k\x2\x2vw\ap\x2\x2wx\av\x2\x2xy\a\"\x2\x2y$\x3\x2\x2\x2z{\a\x7F\x2\x2"+
		"{&\x3\x2\x2\x2|\x88\a>\x2\x2}~\a>\x2\x2~\x88\a?\x2\x2\x7F\x88\a@\x2\x2"+
		"\x80\x81\a@\x2\x2\x81\x88\a?\x2\x2\x82\x83\a?\x2\x2\x83\x88\a?\x2\x2\x84"+
		"\x85\a#\x2\x2\x85\x88\a?\x2\x2\x86\x88\a\'\x2\x2\x87|\x3\x2\x2\x2\x87"+
		"}\x3\x2\x2\x2\x87\x7F\x3\x2\x2\x2\x87\x80\x3\x2\x2\x2\x87\x82\x3\x2\x2"+
		"\x2\x87\x84\x3\x2\x2\x2\x87\x86\x3\x2\x2\x2\x88(\x3\x2\x2\x2\x89\x8A\a"+
		"-\x2\x2\x8A\x8E\a-\x2\x2\x8B\x8C\a/\x2\x2\x8C\x8E\a/\x2\x2\x8D\x89\x3"+
		"\x2\x2\x2\x8D\x8B\x3\x2\x2\x2\x8E*\x3\x2\x2\x2\x8F\x90\t\x2\x2\x2\x90"+
		",\x3\x2\x2\x2\x91\x97\x5/\x18\x2\x92\x96\x5/\x18\x2\x93\x96\x5\x31\x19"+
		"\x2\x94\x96\a\x61\x2\x2\x95\x92\x3\x2\x2\x2\x95\x93\x3\x2\x2\x2\x95\x94"+
		"\x3\x2\x2\x2\x96\x99\x3\x2\x2\x2\x97\x95\x3\x2\x2\x2\x97\x98\x3\x2\x2"+
		"\x2\x98.\x3\x2\x2\x2\x99\x97\x3\x2\x2\x2\x9A\x9C\t\x3\x2\x2\x9B\x9A\x3"+
		"\x2\x2\x2\x9C\x30\x3\x2\x2\x2\x9D\x9F\x4\x32;\x2\x9E\x9D\x3\x2\x2\x2\x9F"+
		"\xA0\x3\x2\x2\x2\xA0\x9E\x3\x2\x2\x2\xA0\xA1\x3\x2\x2\x2\xA1\x32\x3\x2"+
		"\x2\x2\xA2\xA3\a\x31\x2\x2\xA3\xA4\a\x31\x2\x2\xA4\xA8\x3\x2\x2\x2\xA5"+
		"\xA7\v\x2\x2\x2\xA6\xA5\x3\x2\x2\x2\xA7\xAA\x3\x2\x2\x2\xA8\xA9\x3\x2"+
		"\x2\x2\xA8\xA6\x3\x2\x2\x2\xA9\xAB\x3\x2\x2\x2\xAA\xA8\x3\x2\x2\x2\xAB"+
		"\xB8\a\f\x2\x2\xAC\xAD\a\x31\x2\x2\xAD\xAE\a,\x2\x2\xAE\xB2\x3\x2\x2\x2"+
		"\xAF\xB1\v\x2\x2\x2\xB0\xAF\x3\x2\x2\x2\xB1\xB4\x3\x2\x2\x2\xB2\xB3\x3"+
		"\x2\x2\x2\xB2\xB0\x3\x2\x2\x2\xB3\xB5\x3\x2\x2\x2\xB4\xB2\x3\x2\x2\x2"+
		"\xB5\xB6\a,\x2\x2\xB6\xB8\a\x31\x2\x2\xB7\xA2\x3\x2\x2\x2\xB7\xAC\x3\x2"+
		"\x2\x2\xB8\x34\x3\x2\x2\x2\xB9\xBB\t\x4\x2\x2\xBA\xB9\x3\x2\x2\x2\xBB"+
		"\xBC\x3\x2\x2\x2\xBC\xBA\x3\x2\x2\x2\xBC\xBD\x3\x2\x2\x2\xBD\xBE\x3\x2"+
		"\x2\x2\xBE\xBF\b\x1B\x2\x2\xBF\x36\x3\x2\x2\x2\r\x2\x87\x8D\x95\x97\x9B"+
		"\xA0\xA8\xB2\xB7\xBC\x3\x3\x1B\x2";
	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN.ToCharArray());
}
} // namespace Faz_2_ANTLR