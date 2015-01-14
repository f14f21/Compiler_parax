// Generated from E:\Asp.net\Compiler_parax\Faz_1.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Faz_1Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, Relation=19, OpRep=20, Relop=21, ID=22, Letter=23, Num=24, 
		Comment=25, WS=26;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'while'", "'('", "'for'", "'print'", "'if'", 
		"'='", "'main'", "'void '", "';'", "'printf'", "'''", "'{'", "'char '", 
		"'else'", "'int '", "'}'", "Relation", "OpRep", "Relop", "ID", "Letter", 
		"Num", "Comment", "WS"
	};
	public static final int
		RULE_script = 0, RULE_stmt = 1, RULE_assignstat = 2, RULE_ifstat = 3, 
		RULE_elsepart = 4, RULE_cond = 5, RULE_expr = 6, RULE_term = 7, RULE_restexpr = 8, 
		RULE_whilestat = 9, RULE_define = 10, RULE_forstat = 11, RULE_print = 12;
	public static final String[] ruleNames = {
		"script", "stmt", "assignstat", "ifstat", "elsepart", "cond", "expr", 
		"term", "restexpr", "whilestat", "define", "forstat", "print"
	};

	@Override
	public String getGrammarFileName() { return "Faz_1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public Faz_1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(10);
			setState(27); match(9);
			setState(28); match(4);
			setState(29); match(1);
			setState(30); match(14);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << Relation) | (1L << Relop) | (1L << ID) | (1L << Num) | (1L << Comment))) != 0)) {
				{
				{
				setState(31); stmt();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37); match(18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ForstatContext forstat() {
			return getRuleContext(ForstatContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignstatContext assignstat() {
			return getRuleContext(AssignstatContext.class,0);
		}
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public TerminalNode Comment() { return getToken(Faz_1Parser.Comment, 0); }
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public WhilestatContext whilestat() {
			return getRuleContext(WhilestatContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(51);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39); ifstat();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); forstat();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41); whilestat();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42); assignstat();
				setState(43); match(11);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45); expr();
				setState(46); match(11);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48); define();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(49); print();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(50); match(Comment);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignstatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Faz_1Parser.ID, 0); }
		public AssignstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterAssignstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitAssignstat(this);
		}
	}

	public final AssignstatContext assignstat() throws RecognitionException {
		AssignstatContext _localctx = new AssignstatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(ID);
			setState(54); match(8);
			setState(55); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatContext extends ParserRuleContext {
		public ElsepartContext elsepart() {
			return getRuleContext(ElsepartContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterIfstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitIfstat(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(7);
			setState(58); match(4);
			setState(59); cond();
			setState(60); match(1);
			setState(75);
			switch (_input.LA(1)) {
			case 7:
				{
				setState(61); ifstat();
				}
				break;
			case 14:
				{
				setState(62); match(14);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << Relation) | (1L << Relop) | (1L << ID) | (1L << Num) | (1L << Comment))) != 0)) {
					{
					{
					setState(63); stmt();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69); match(18);
				setState(72);
				switch (_input.LA(1)) {
				case 16:
					{
					setState(70); elsepart();
					}
					break;
				case 4:
				case 13:
				case Relation:
				case Relop:
				case ID:
				case Num:
					{
					setState(71); expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 16:
				{
				setState(74); elsepart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsepartContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ElsepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsepart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterElsepart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitElsepart(this);
		}
	}

	public final ElsepartContext elsepart() throws RecognitionException {
		ElsepartContext _localctx = new ElsepartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elsepart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(16);
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(78); ifstat();
				}
				break;

			case 2:
				{
				setState(79); match(14);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << Relation) | (1L << Relop) | (1L << ID) | (1L << Num) | (1L << Comment))) != 0)) {
					{
					{
					setState(80); stmt();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86); match(18);
				}
				break;

			case 3:
				{
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(87); expr();
						}
						} 
					}
					setState(92);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Relation() { return getToken(Faz_1Parser.Relation, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); expr();
			setState(96); match(Relation);
			setState(97); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode OpRep() { return getToken(Faz_1Parser.OpRep, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RestexprContext restexpr() {
			return getRuleContext(RestexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); term();
				setState(100); restexpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); term();
				setState(103); match(OpRep);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105); term();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106); restexpr();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107); match(4);
				setState(108); expr();
				setState(109); match(1);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(111); match(13);
				setState(112); expr();
				setState(113); match(13);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(Faz_1Parser.Num, 0); }
		public TerminalNode ID() { return getToken(Faz_1Parser.ID, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Num) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestexprContext extends ParserRuleContext {
		public TerminalNode Relop() { return getToken(Faz_1Parser.Relop, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Relation() { return getToken(Faz_1Parser.Relation, 0); }
		public RestexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterRestexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitRestexpr(this);
		}
	}

	public final RestexprContext restexpr() throws RecognitionException {
		RestexprContext _localctx = new RestexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_restexpr);
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); match(Relop);
				setState(120); expr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(Relation);
				setState(122); expr();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); match(Relop);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestatContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public WhilestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterWhilestat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitWhilestat(this);
		}
	}

	public final WhilestatContext whilestat() throws RecognitionException {
		WhilestatContext _localctx = new WhilestatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whilestat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(3);
			setState(127); match(4);
			setState(128); cond();
			setState(129); match(1);
			setState(130); match(14);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << Relation) | (1L << Relop) | (1L << ID) | (1L << Num) | (1L << Comment))) != 0)) {
				{
				{
				setState(131); stmt();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137); match(18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Faz_1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Faz_1Parser.ID, i);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitDefine(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_define);
		try {
			int _alt;
			setState(159);
			switch (_input.LA(1)) {
			case 17:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); match(17);
				setState(140); match(ID);
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(141); match(2);
						setState(142); match(ID);
						}
						} 
					}
					setState(147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(148); match(11);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); match(15);
				setState(150); match(ID);
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(151); match(2);
						setState(152); match(ID);
						}
						} 
					}
					setState(157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(158); match(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForstatContext extends ParserRuleContext {
		public AssignstatContext assignstat(int i) {
			return getRuleContext(AssignstatContext.class,i);
		}
		public TerminalNode OpRep() { return getToken(Faz_1Parser.OpRep, 0); }
		public List<AssignstatContext> assignstat() {
			return getRuleContexts(AssignstatContext.class);
		}
		public TerminalNode ID() { return getToken(Faz_1Parser.ID, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterForstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitForstat(this);
		}
	}

	public final ForstatContext forstat() throws RecognitionException {
		ForstatContext _localctx = new ForstatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(5);
			setState(162); match(4);
			setState(163); assignstat();
			setState(164); match(11);
			setState(165); cond();
			setState(166); match(11);
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(167); match(ID);
				setState(168); match(OpRep);
				}
				break;

			case 2:
				{
				setState(169); match(OpRep);
				setState(170); match(ID);
				}
				break;

			case 3:
				{
				setState(171); assignstat();
				}
				break;
			}
			setState(174); match(1);
			setState(184);
			switch (_input.LA(1)) {
			case 14:
				{
				setState(175); match(14);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << Relation) | (1L << Relop) | (1L << ID) | (1L << Num) | (1L << Comment))) != 0)) {
					{
					{
					setState(176); stmt();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182); match(18);
				}
				break;
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 12:
			case 13:
			case 15:
			case 17:
			case Relation:
			case Relop:
			case ID:
			case Num:
			case Comment:
				{
				setState(183); stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Faz_1Parser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Faz_1Listener ) ((Faz_1Listener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==6 || _la==12) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(187); match(4);
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188); match(ID);
					}
					}
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;

			case 2:
				{
				setState(193); expr();
				}
				break;
			}
			setState(196); match(1);
			setState(197); match(11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\34\u00ca\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\7\2#\n\2\f\2\16"+
		"\2&\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\66"+
		"\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5C\n\5\f\5\16\5F\13"+
		"\5\3\5\3\5\3\5\5\5K\n\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6\7\6T\n\6\f\6\16\6"+
		"W\13\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\5\6`\n\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bv\n\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u0087\n\13\f\13\16\13\u008a\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0092"+
		"\n\f\f\f\16\f\u0095\13\f\3\f\3\f\3\f\3\f\3\f\7\f\u009c\n\f\f\f\16\f\u009f"+
		"\13\f\3\f\5\f\u00a2\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00af\n\r\3\r\3\r\3\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13\r\3\r\3\r\5\r"+
		"\u00bb\n\r\3\16\3\16\3\16\6\16\u00c0\n\16\r\16\16\16\u00c1\3\16\5\16\u00c5"+
		"\n\16\3\16\3\16\3\16\3\16\4\u0093\u009d\17\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\2\4\4\2\30\30\32\32\4\2\b\b\16\16\u00dd\2\34\3\2\2\2\4\65\3\2\2"+
		"\2\6\67\3\2\2\2\b;\3\2\2\2\nO\3\2\2\2\fa\3\2\2\2\16u\3\2\2\2\20w\3\2\2"+
		"\2\22~\3\2\2\2\24\u0080\3\2\2\2\26\u00a1\3\2\2\2\30\u00a3\3\2\2\2\32\u00bc"+
		"\3\2\2\2\34\35\7\f\2\2\35\36\7\13\2\2\36\37\7\6\2\2\37 \7\3\2\2 $\7\20"+
		"\2\2!#\5\4\3\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$"+
		"\3\2\2\2\'(\7\24\2\2(\3\3\2\2\2)\66\5\b\5\2*\66\5\30\r\2+\66\5\24\13\2"+
		",-\5\6\4\2-.\7\r\2\2.\66\3\2\2\2/\60\5\16\b\2\60\61\7\r\2\2\61\66\3\2"+
		"\2\2\62\66\5\26\f\2\63\66\5\32\16\2\64\66\7\33\2\2\65)\3\2\2\2\65*\3\2"+
		"\2\2\65+\3\2\2\2\65,\3\2\2\2\65/\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65"+
		"\64\3\2\2\2\66\5\3\2\2\2\678\7\30\2\289\7\n\2\29:\5\16\b\2:\7\3\2\2\2"+
		";<\7\t\2\2<=\7\6\2\2=>\5\f\7\2>M\7\3\2\2?N\5\b\5\2@D\7\20\2\2AC\5\4\3"+
		"\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GJ\7\24"+
		"\2\2HK\5\n\6\2IK\5\16\b\2JH\3\2\2\2JI\3\2\2\2KN\3\2\2\2LN\5\n\6\2M?\3"+
		"\2\2\2M@\3\2\2\2ML\3\2\2\2N\t\3\2\2\2O_\7\22\2\2P`\5\b\5\2QU\7\20\2\2"+
		"RT\5\4\3\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2"+
		"X`\7\24\2\2Y[\5\16\b\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2"+
		"\2\2^\\\3\2\2\2_P\3\2\2\2_Q\3\2\2\2_\\\3\2\2\2`\13\3\2\2\2ab\5\16\b\2"+
		"bc\7\25\2\2cd\5\16\b\2d\r\3\2\2\2ef\5\20\t\2fg\5\22\n\2gv\3\2\2\2hi\5"+
		"\20\t\2ij\7\26\2\2jv\3\2\2\2kv\5\20\t\2lv\5\22\n\2mn\7\6\2\2no\5\16\b"+
		"\2op\7\3\2\2pv\3\2\2\2qr\7\17\2\2rs\5\16\b\2st\7\17\2\2tv\3\2\2\2ue\3"+
		"\2\2\2uh\3\2\2\2uk\3\2\2\2ul\3\2\2\2um\3\2\2\2uq\3\2\2\2v\17\3\2\2\2w"+
		"x\t\2\2\2x\21\3\2\2\2yz\7\27\2\2z\177\5\16\b\2{|\7\25\2\2|\177\5\16\b"+
		"\2}\177\7\27\2\2~y\3\2\2\2~{\3\2\2\2~}\3\2\2\2\177\23\3\2\2\2\u0080\u0081"+
		"\7\5\2\2\u0081\u0082\7\6\2\2\u0082\u0083\5\f\7\2\u0083\u0084\7\3\2\2\u0084"+
		"\u0088\7\20\2\2\u0085\u0087\5\4\3\2\u0086\u0085\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7\24\2\2\u008c\25\3\2\2\2\u008d\u008e\7\23"+
		"\2\2\u008e\u0093\7\30\2\2\u008f\u0090\7\4\2\2\u0090\u0092\7\30\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u00a2\7\r\2\2\u0097"+
		"\u0098\7\21\2\2\u0098\u009d\7\30\2\2\u0099\u009a\7\4\2\2\u009a\u009c\7"+
		"\30\2\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7\r"+
		"\2\2\u00a1\u008d\3\2\2\2\u00a1\u0097\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a4"+
		"\7\7\2\2\u00a4\u00a5\7\6\2\2\u00a5\u00a6\5\6\4\2\u00a6\u00a7\7\r\2\2\u00a7"+
		"\u00a8\5\f\7\2\u00a8\u00ae\7\r\2\2\u00a9\u00aa\7\30\2\2\u00aa\u00af\7"+
		"\26\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00af\7\30\2\2\u00ad\u00af\5\6\4\2"+
		"\u00ae\u00a9\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00ba\7\3\2\2\u00b1\u00b5\7\20\2\2\u00b2\u00b4\5\4\3\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\7\24\2\2"+
		"\u00b9\u00bb\5\4\3\2\u00ba\u00b1\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\31"+
		"\3\2\2\2\u00bc\u00bd\t\3\2\2\u00bd\u00c4\7\6\2\2\u00be\u00c0\7\30\2\2"+
		"\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c5\5\16\b\2\u00c4\u00bf\3\2\2\2"+
		"\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8"+
		"\7\r\2\2\u00c8\33\3\2\2\2\25$\65DJMU\\_u~\u0088\u0093\u009d\u00a1\u00ae"+
		"\u00b5\u00ba\u00c1\u00c4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}