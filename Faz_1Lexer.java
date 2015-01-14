// Generated from E:\Asp.net\Compiler_parax\Faz_1.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Faz_1Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, Relation=19, OpRep=20, Relop=21, ID=22, Letter=23, Num=24, 
		Comment=25, WS=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'while'", "'('", "'for'", "'print'", "'if'", "'='", "'main'", 
		"'void '", "';'", "'printf'", "'''", "'{'", "'char '", "'else'", "'int '", 
		"'}'", "Relation", "OpRep", "Relop", "ID", "Letter", "Num", "Comment", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "Relation", "OpRep", "Relop", "ID", "Letter", "Num", "Comment", 
		"WS"
	};


	public Faz_1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Faz_1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 25: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\34\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0088\n\24\3\25\3\25\3\25\3\25"+
		"\5\25\u008e\n\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0096\n\27\f\27\16"+
		"\27\u0099\13\27\3\30\5\30\u009c\n\30\3\31\6\31\u009f\n\31\r\31\16\31\u00a0"+
		"\3\32\3\32\3\32\3\32\7\32\u00a7\n\32\f\32\16\32\u00aa\13\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u00b1\n\32\f\32\16\32\u00b4\13\32\3\32\3\32\5\32"+
		"\u00b8\n\32\3\33\6\33\u00bb\n\33\r\33\16\33\u00bc\3\33\3\33\4\u00a8\u00b2"+
		"\34\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1"+
		"+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\2\3\2\5\5\2,-//\61\61\4\2C\\"+
		"c|\5\2\13\f\17\17\"\"\u00ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3"+
		"\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rG\3\2\2\2\17"+
		"M\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25W\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2"+
		"\33f\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!p\3\2\2\2#u\3\2\2\2%z\3\2\2\2\'\u0087"+
		"\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2/\u009b\3\2\2\2\61"+
		"\u009e\3\2\2\2\63\u00b7\3\2\2\2\65\u00ba\3\2\2\2\678\7+\2\28\4\3\2\2\2"+
		"9:\7.\2\2:\6\3\2\2\2;<\7y\2\2<=\7j\2\2=>\7k\2\2>?\7n\2\2?@\7g\2\2@\b\3"+
		"\2\2\2AB\7*\2\2B\n\3\2\2\2CD\7h\2\2DE\7q\2\2EF\7t\2\2F\f\3\2\2\2GH\7r"+
		"\2\2HI\7t\2\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2L\16\3\2\2\2MN\7k\2\2NO\7h\2\2"+
		"O\20\3\2\2\2PQ\7?\2\2Q\22\3\2\2\2RS\7o\2\2ST\7c\2\2TU\7k\2\2UV\7p\2\2"+
		"V\24\3\2\2\2WX\7x\2\2XY\7q\2\2YZ\7k\2\2Z[\7f\2\2[\\\7\"\2\2\\\26\3\2\2"+
		"\2]^\7=\2\2^\30\3\2\2\2_`\7r\2\2`a\7t\2\2ab\7k\2\2bc\7p\2\2cd\7v\2\2d"+
		"e\7h\2\2e\32\3\2\2\2fg\7)\2\2g\34\3\2\2\2hi\7}\2\2i\36\3\2\2\2jk\7e\2"+
		"\2kl\7j\2\2lm\7c\2\2mn\7t\2\2no\7\"\2\2o \3\2\2\2pq\7g\2\2qr\7n\2\2rs"+
		"\7u\2\2st\7g\2\2t\"\3\2\2\2uv\7k\2\2vw\7p\2\2wx\7v\2\2xy\7\"\2\2y$\3\2"+
		"\2\2z{\7\177\2\2{&\3\2\2\2|\u0088\7>\2\2}~\7>\2\2~\u0088\7?\2\2\177\u0088"+
		"\7@\2\2\u0080\u0081\7@\2\2\u0081\u0088\7?\2\2\u0082\u0083\7?\2\2\u0083"+
		"\u0088\7?\2\2\u0084\u0085\7#\2\2\u0085\u0088\7?\2\2\u0086\u0088\7\'\2"+
		"\2\u0087|\3\2\2\2\u0087}\3\2\2\2\u0087\177\3\2\2\2\u0087\u0080\3\2\2\2"+
		"\u0087\u0082\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0086\3\2\2\2\u0088(\3"+
		"\2\2\2\u0089\u008a\7-\2\2\u008a\u008e\7-\2\2\u008b\u008c\7/\2\2\u008c"+
		"\u008e\7/\2\2\u008d\u0089\3\2\2\2\u008d\u008b\3\2\2\2\u008e*\3\2\2\2\u008f"+
		"\u0090\t\2\2\2\u0090,\3\2\2\2\u0091\u0097\5/\30\2\u0092\u0096\5/\30\2"+
		"\u0093\u0096\5\61\31\2\u0094\u0096\7a\2\2\u0095\u0092\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098.\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\t\3\2\2"+
		"\u009b\u009a\3\2\2\2\u009c\60\3\2\2\2\u009d\u009f\4\62;\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\62\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\7\61\2\2\u00a4\u00a8\3\2"+
		"\2\2\u00a5\u00a7\13\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00b8\7\f\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae\7,\2\2\u00ae"+
		"\u00b2\3\2\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\u00b8\7\61\2\2\u00b7\u00a2\3\2"+
		"\2\2\u00b7\u00ac\3\2\2\2\u00b8\64\3\2\2\2\u00b9\u00bb\t\4\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\b\33\2\2\u00bf\66\3\2\2\2\r\2\u0087\u008d\u0095"+
		"\u0097\u009b\u00a0\u00a8\u00b2\u00b7\u00bc";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}