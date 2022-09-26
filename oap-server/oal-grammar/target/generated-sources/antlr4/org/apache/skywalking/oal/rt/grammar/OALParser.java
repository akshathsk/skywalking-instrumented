// Generated from org/apache/skywalking/oal/rt/grammar/OALParser.g4 by ANTLR 4.9.2
package org.apache.skywalking.oal.rt.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OALParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FROM=1, FILTER=2, DISABLE=3, SRC_SERVICE=4, SRC_SERVICE_INSTANCE=5, SRC_ENDPOINT=6, 
		SRC_SERVICE_RELATION=7, SRC_SERVICE_INSTANCE_RELATION=8, SRC_ENDPOINT_RELATION=9, 
		SRC_SERVICE_INSTANCE_JVM_CPU=10, SRC_SERVICE_INSTANCE_JVM_MEMORY=11, SRC_SERVICE_INSTANCE_JVM_MEMORY_POOL=12, 
		SRC_SERVICE_INSTANCE_JVM_GC=13, SRC_SERVICE_INSTANCE_JVM_THREAD=14, SRC_SERVICE_INSTANCE_JVM_CLASS=15, 
		SRC_DATABASE_ACCESS=16, SRC_SERVICE_INSTANCE_CLR_CPU=17, SRC_SERVICE_INSTANCE_CLR_GC=18, 
		SRC_SERVICE_INSTANCE_CLR_THREAD=19, SRC_ENVOY_INSTANCE_METRIC=20, SRC_EVENT=21, 
		SRC_BROWSER_APP_PERF=22, SRC_BROWSER_APP_PAGE_PERF=23, SRC_BROWSER_APP_SINGLE_VERSION_PERF=24, 
		SRC_BROWSER_APP_TRAFFIC=25, SRC_BROWSER_APP_PAGE_TRAFFIC=26, SRC_BROWSER_APP_SINGLE_VERSION_TRAFFIC=27, 
		DOT=28, LR_BRACKET=29, RR_BRACKET=30, LS_BRACKET=31, RS_BRACKET=32, COMMA=33, 
		SEMI=34, EQUAL=35, DUALEQUALS=36, ALL=37, GREATER=38, LESS=39, GREATER_EQUAL=40, 
		LESS_EQUAL=41, NOT_EQUAL=42, LIKE=43, IN=44, CONTAIN=45, NOT_CONTAIN=46, 
		NULL_LITERAL=47, BOOL_LITERAL=48, NUMBER_LITERAL=49, CHAR_LITERAL=50, 
		STRING_LITERAL=51, DelimitedComment=52, LineComment=53, SPACE=54, IDENTIFIER=55, 
		STRING_TO_LONG=56, STRING_TO_LONG_SHORT=57, STRING_TO_INT=58, STRING_TO_INT_SHORT=59;
	public static final int
		RULE_root = 0, RULE_aggregationStatement = 1, RULE_disableStatement = 2, 
		RULE_metricStatement = 3, RULE_filterStatement = 4, RULE_filterExpression = 5, 
		RULE_source = 6, RULE_disableSource = 7, RULE_sourceAttributeStmt = 8, 
		RULE_sourceAttribute = 9, RULE_variable = 10, RULE_aggregateFunction = 11, 
		RULE_functionName = 12, RULE_funcParamExpression = 13, RULE_literalExpression = 14, 
		RULE_attributeExpression = 15, RULE_attributeExpressionSegment = 16, RULE_expression = 17, 
		RULE_containMatch = 18, RULE_notContainMatch = 19, RULE_booleanMatch = 20, 
		RULE_numberMatch = 21, RULE_stringMatch = 22, RULE_greaterMatch = 23, 
		RULE_lessMatch = 24, RULE_greaterEqualMatch = 25, RULE_lessEqualMatch = 26, 
		RULE_booleanNotEqualMatch = 27, RULE_notEqualMatch = 28, RULE_likeMatch = 29, 
		RULE_inMatch = 30, RULE_multiConditionValue = 31, RULE_conditionAttributeStmt = 32, 
		RULE_conditionAttribute = 33, RULE_mapAttribute = 34, RULE_booleanConditionValue = 35, 
		RULE_stringConditionValue = 36, RULE_enumConditionValue = 37, RULE_numberConditionValue = 38, 
		RULE_nullConditionValue = 39, RULE_sourceAttrCast = 40, RULE_expressionAttrCast = 41, 
		RULE_functionArgCast = 42, RULE_castStmt = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "aggregationStatement", "disableStatement", "metricStatement", 
			"filterStatement", "filterExpression", "source", "disableSource", "sourceAttributeStmt", 
			"sourceAttribute", "variable", "aggregateFunction", "functionName", "funcParamExpression", 
			"literalExpression", "attributeExpression", "attributeExpressionSegment", 
			"expression", "containMatch", "notContainMatch", "booleanMatch", "numberMatch", 
			"stringMatch", "greaterMatch", "lessMatch", "greaterEqualMatch", "lessEqualMatch", 
			"booleanNotEqualMatch", "notEqualMatch", "likeMatch", "inMatch", "multiConditionValue", 
			"conditionAttributeStmt", "conditionAttribute", "mapAttribute", "booleanConditionValue", 
			"stringConditionValue", "enumConditionValue", "numberConditionValue", 
			"nullConditionValue", "sourceAttrCast", "expressionAttrCast", "functionArgCast", 
			"castStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'from'", "'filter'", "'disable'", "'Service'", "'ServiceInstance'", 
			"'Endpoint'", "'ServiceRelation'", "'ServiceInstanceRelation'", "'EndpointRelation'", 
			"'ServiceInstanceJVMCPU'", "'ServiceInstanceJVMMemory'", "'ServiceInstanceJVMMemoryPool'", 
			"'ServiceInstanceJVMGC'", "'ServiceInstanceJVMThread'", "'ServiceInstanceJVMClass'", 
			"'DatabaseAccess'", "'ServiceInstanceCLRCPU'", "'ServiceInstanceCLRGC'", 
			"'ServiceInstanceCLRThread'", "'EnvoyInstanceMetric'", "'Event'", "'BrowserAppPerf'", 
			"'BrowserAppPagePerf'", "'BrowserAppSingleVersionPerf'", "'BrowserAppTraffic'", 
			"'BrowserAppPageTraffic'", "'BrowserAppSingleVersionTraffic'", "'.'", 
			"'('", "')'", "'['", "']'", "','", "';'", "'='", "'=='", "'*'", "'>'", 
			"'<'", "'>='", "'<='", "'!='", "'like'", "'in'", "'contain'", "'not contain'", 
			"'null'", null, null, null, null, null, null, null, null, "'(str->long)'", 
			"'(long)'", "'(str->int)'", "'(int)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FROM", "FILTER", "DISABLE", "SRC_SERVICE", "SRC_SERVICE_INSTANCE", 
			"SRC_ENDPOINT", "SRC_SERVICE_RELATION", "SRC_SERVICE_INSTANCE_RELATION", 
			"SRC_ENDPOINT_RELATION", "SRC_SERVICE_INSTANCE_JVM_CPU", "SRC_SERVICE_INSTANCE_JVM_MEMORY", 
			"SRC_SERVICE_INSTANCE_JVM_MEMORY_POOL", "SRC_SERVICE_INSTANCE_JVM_GC", 
			"SRC_SERVICE_INSTANCE_JVM_THREAD", "SRC_SERVICE_INSTANCE_JVM_CLASS", 
			"SRC_DATABASE_ACCESS", "SRC_SERVICE_INSTANCE_CLR_CPU", "SRC_SERVICE_INSTANCE_CLR_GC", 
			"SRC_SERVICE_INSTANCE_CLR_THREAD", "SRC_ENVOY_INSTANCE_METRIC", "SRC_EVENT", 
			"SRC_BROWSER_APP_PERF", "SRC_BROWSER_APP_PAGE_PERF", "SRC_BROWSER_APP_SINGLE_VERSION_PERF", 
			"SRC_BROWSER_APP_TRAFFIC", "SRC_BROWSER_APP_PAGE_TRAFFIC", "SRC_BROWSER_APP_SINGLE_VERSION_TRAFFIC", 
			"DOT", "LR_BRACKET", "RR_BRACKET", "LS_BRACKET", "RS_BRACKET", "COMMA", 
			"SEMI", "EQUAL", "DUALEQUALS", "ALL", "GREATER", "LESS", "GREATER_EQUAL", 
			"LESS_EQUAL", "NOT_EQUAL", "LIKE", "IN", "CONTAIN", "NOT_CONTAIN", "NULL_LITERAL", 
			"BOOL_LITERAL", "NUMBER_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "DelimitedComment", 
			"LineComment", "SPACE", "IDENTIFIER", "STRING_TO_LONG", "STRING_TO_LONG_SHORT", 
			"STRING_TO_INT", "STRING_TO_INT_SHORT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "OALParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OALParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public List<AggregationStatementContext> aggregationStatement() {
			return getRuleContexts(AggregationStatementContext.class);
		}
		public AggregationStatementContext aggregationStatement(int i) {
			return getRuleContext(AggregationStatementContext.class,i);
		}
		public List<DisableStatementContext> disableStatement() {
			return getRuleContexts(DisableStatementContext.class);
		}
		public DisableStatementContext disableStatement(int i) {
			return getRuleContext(DisableStatementContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISABLE || _la==IDENTIFIER) {
				{
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(88);
					aggregationStatement();
					}
					break;
				case DISABLE:
					{
					setState(89);
					disableStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AggregationStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(OALParser.EQUAL, 0); }
		public MetricStatementContext metricStatement() {
			return getRuleContext(MetricStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OALParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(OALParser.EOF, 0); }
		public List<TerminalNode> SPACE() { return getTokens(OALParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(OALParser.SPACE, i);
		}
		public TerminalNode DelimitedComment() { return getToken(OALParser.DelimitedComment, 0); }
		public TerminalNode LineComment() { return getToken(OALParser.LineComment, 0); }
		public AggregationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterAggregationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitAggregationStatement(this);
		}
	}

	public final AggregationStatementContext aggregationStatement() throws RecognitionException {
		AggregationStatementContext _localctx = new AggregationStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_aggregationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			variable();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(96);
				match(SPACE);
				}
			}

			setState(99);
			match(EQUAL);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(100);
				match(SPACE);
				}
			}

			setState(103);
			metricStatement();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DelimitedComment) {
				{
				setState(104);
				match(DelimitedComment);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LineComment) {
				{
				setState(107);
				match(LineComment);
				}
			}

			setState(110);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SEMI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DisableStatementContext extends ParserRuleContext {
		public TerminalNode DISABLE() { return getToken(OALParser.DISABLE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(OALParser.LR_BRACKET, 0); }
		public DisableSourceContext disableSource() {
			return getRuleContext(DisableSourceContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(OALParser.RR_BRACKET, 0); }
		public TerminalNode SEMI() { return getToken(OALParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(OALParser.EOF, 0); }
		public TerminalNode DelimitedComment() { return getToken(OALParser.DelimitedComment, 0); }
		public TerminalNode LineComment() { return getToken(OALParser.LineComment, 0); }
		public DisableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterDisableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitDisableStatement(this);
		}
	}

	public final DisableStatementContext disableStatement() throws RecognitionException {
		DisableStatementContext _localctx = new DisableStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_disableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(DISABLE);
			setState(113);
			match(LR_BRACKET);
			setState(114);
			disableSource();
			setState(115);
			match(RR_BRACKET);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DelimitedComment) {
				{
				setState(116);
				match(DelimitedComment);
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LineComment) {
				{
				setState(119);
				match(LineComment);
				}
			}

			setState(122);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SEMI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MetricStatementContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(OALParser.FROM, 0); }
		public TerminalNode LR_BRACKET() { return getToken(OALParser.LR_BRACKET, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(OALParser.RR_BRACKET, 0); }
		public TerminalNode DOT() { return getToken(OALParser.DOT, 0); }
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public SourceAttrCastContext sourceAttrCast() {
			return getRuleContext(SourceAttrCastContext.class,0);
		}
		public List<SourceAttributeStmtContext> sourceAttributeStmt() {
			return getRuleContexts(SourceAttributeStmtContext.class);
		}
		public SourceAttributeStmtContext sourceAttributeStmt(int i) {
			return getRuleContext(SourceAttributeStmtContext.class,i);
		}
		public List<FilterStatementContext> filterStatement() {
			return getRuleContexts(FilterStatementContext.class);
		}
		public FilterStatementContext filterStatement(int i) {
			return getRuleContext(FilterStatementContext.class,i);
		}
		public MetricStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metricStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterMetricStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitMetricStatement(this);
		}
	}

	public final MetricStatementContext metricStatement() throws RecognitionException {
		MetricStatementContext _localctx = new MetricStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_metricStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(FROM);
			setState(125);
			match(LR_BRACKET);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_TO_LONG) | (1L << STRING_TO_LONG_SHORT) | (1L << STRING_TO_INT) | (1L << STRING_TO_INT_SHORT))) != 0)) {
				{
				setState(126);
				sourceAttrCast();
				}
			}

			setState(129);
			source();
			{
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				sourceAttributeStmt();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			}
			setState(135);
			match(RR_BRACKET);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(137); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(136);
						filterStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(139); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(143);
			match(DOT);
			setState(144);
			aggregateFunction();
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

	public static class FilterStatementContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(OALParser.DOT, 0); }
		public TerminalNode FILTER() { return getToken(OALParser.FILTER, 0); }
		public TerminalNode LR_BRACKET() { return getToken(OALParser.LR_BRACKET, 0); }
		public FilterExpressionContext filterExpression() {
			return getRuleContext(FilterExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(OALParser.RR_BRACKET, 0); }
		public FilterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterFilterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitFilterStatement(this);
		}
	}

	public final FilterStatementContext filterStatement() throws RecognitionException {
		FilterStatementContext _localctx = new FilterStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_filterStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(DOT);
			setState(147);
			match(FILTER);
			setState(148);
			match(LR_BRACKET);
			setState(149);
			filterExpression();
			setState(150);
			match(RR_BRACKET);
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

	public static class FilterExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitFilterExpression(this);
		}
	}

	public final FilterExpressionContext filterExpression() throws RecognitionException {
		FilterExpressionContext _localctx = new FilterExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_filterExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			expression();
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

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode SRC_SERVICE() { return getToken(OALParser.SRC_SERVICE, 0); }
		public TerminalNode SRC_DATABASE_ACCESS() { return getToken(OALParser.SRC_DATABASE_ACCESS, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE() { return getToken(OALParser.SRC_SERVICE_INSTANCE, 0); }
		public TerminalNode SRC_ENDPOINT() { return getToken(OALParser.SRC_ENDPOINT, 0); }
		public TerminalNode SRC_SERVICE_RELATION() { return getToken(OALParser.SRC_SERVICE_RELATION, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_RELATION() { return getToken(OALParser.SRC_SERVICE_INSTANCE_RELATION, 0); }
		public TerminalNode SRC_ENDPOINT_RELATION() { return getToken(OALParser.SRC_ENDPOINT_RELATION, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_CLR_CPU() { return getToken(OALParser.SRC_SERVICE_INSTANCE_CLR_CPU, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_CLR_GC() { return getToken(OALParser.SRC_SERVICE_INSTANCE_CLR_GC, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_CLR_THREAD() { return getToken(OALParser.SRC_SERVICE_INSTANCE_CLR_THREAD, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_JVM_CPU() { return getToken(OALParser.SRC_SERVICE_INSTANCE_JVM_CPU, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_JVM_MEMORY() { return getToken(OALParser.SRC_SERVICE_INSTANCE_JVM_MEMORY, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_JVM_MEMORY_POOL() { return getToken(OALParser.SRC_SERVICE_INSTANCE_JVM_MEMORY_POOL, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_JVM_GC() { return getToken(OALParser.SRC_SERVICE_INSTANCE_JVM_GC, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_JVM_THREAD() { return getToken(OALParser.SRC_SERVICE_INSTANCE_JVM_THREAD, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_JVM_CLASS() { return getToken(OALParser.SRC_SERVICE_INSTANCE_JVM_CLASS, 0); }
		public TerminalNode SRC_ENVOY_INSTANCE_METRIC() { return getToken(OALParser.SRC_ENVOY_INSTANCE_METRIC, 0); }
		public TerminalNode SRC_BROWSER_APP_PERF() { return getToken(OALParser.SRC_BROWSER_APP_PERF, 0); }
		public TerminalNode SRC_BROWSER_APP_PAGE_PERF() { return getToken(OALParser.SRC_BROWSER_APP_PAGE_PERF, 0); }
		public TerminalNode SRC_BROWSER_APP_SINGLE_VERSION_PERF() { return getToken(OALParser.SRC_BROWSER_APP_SINGLE_VERSION_PERF, 0); }
		public TerminalNode SRC_BROWSER_APP_TRAFFIC() { return getToken(OALParser.SRC_BROWSER_APP_TRAFFIC, 0); }
		public TerminalNode SRC_BROWSER_APP_PAGE_TRAFFIC() { return getToken(OALParser.SRC_BROWSER_APP_PAGE_TRAFFIC, 0); }
		public TerminalNode SRC_BROWSER_APP_SINGLE_VERSION_TRAFFIC() { return getToken(OALParser.SRC_BROWSER_APP_SINGLE_VERSION_TRAFFIC, 0); }
		public TerminalNode SRC_EVENT() { return getToken(OALParser.SRC_EVENT, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitSource(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SRC_SERVICE) | (1L << SRC_SERVICE_INSTANCE) | (1L << SRC_ENDPOINT) | (1L << SRC_SERVICE_RELATION) | (1L << SRC_SERVICE_INSTANCE_RELATION) | (1L << SRC_ENDPOINT_RELATION) | (1L << SRC_SERVICE_INSTANCE_JVM_CPU) | (1L << SRC_SERVICE_INSTANCE_JVM_MEMORY) | (1L << SRC_SERVICE_INSTANCE_JVM_MEMORY_POOL) | (1L << SRC_SERVICE_INSTANCE_JVM_GC) | (1L << SRC_SERVICE_INSTANCE_JVM_THREAD) | (1L << SRC_SERVICE_INSTANCE_JVM_CLASS) | (1L << SRC_DATABASE_ACCESS) | (1L << SRC_SERVICE_INSTANCE_CLR_CPU) | (1L << SRC_SERVICE_INSTANCE_CLR_GC) | (1L << SRC_SERVICE_INSTANCE_CLR_THREAD) | (1L << SRC_ENVOY_INSTANCE_METRIC) | (1L << SRC_EVENT) | (1L << SRC_BROWSER_APP_PERF) | (1L << SRC_BROWSER_APP_PAGE_PERF) | (1L << SRC_BROWSER_APP_SINGLE_VERSION_PERF) | (1L << SRC_BROWSER_APP_TRAFFIC) | (1L << SRC_BROWSER_APP_PAGE_TRAFFIC) | (1L << SRC_BROWSER_APP_SINGLE_VERSION_TRAFFIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DisableSourceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public DisableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disableSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterDisableSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitDisableSource(this);
		}
	}

	public final DisableSourceContext disableSource() throws RecognitionException {
		DisableSourceContext _localctx = new DisableSourceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_disableSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IDENTIFIER);
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

	public static class SourceAttributeStmtContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(OALParser.DOT, 0); }
		public SourceAttributeContext sourceAttribute() {
			return getRuleContext(SourceAttributeContext.class,0);
		}
		public SourceAttributeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceAttributeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterSourceAttributeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitSourceAttributeStmt(this);
		}
	}

	public final SourceAttributeStmtContext sourceAttributeStmt() throws RecognitionException {
		SourceAttributeStmtContext _localctx = new SourceAttributeStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sourceAttributeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(DOT);
			setState(159);
			sourceAttribute();
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

	public static class SourceAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public TerminalNode ALL() { return getToken(OALParser.ALL, 0); }
		public MapAttributeContext mapAttribute() {
			return getRuleContext(MapAttributeContext.class,0);
		}
		public SourceAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterSourceAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitSourceAttribute(this);
		}
	}

	public final SourceAttributeContext sourceAttribute() throws RecognitionException {
		SourceAttributeContext _localctx = new SourceAttributeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sourceAttribute);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				mapAttribute();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IDENTIFIER);
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

	public static class AggregateFunctionContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(OALParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(OALParser.RR_BRACKET, 0); }
		public List<FuncParamExpressionContext> funcParamExpression() {
			return getRuleContexts(FuncParamExpressionContext.class);
		}
		public FuncParamExpressionContext funcParamExpression(int i) {
			return getRuleContext(FuncParamExpressionContext.class,i);
		}
		public List<LiteralExpressionContext> literalExpression() {
			return getRuleContexts(LiteralExpressionContext.class);
		}
		public LiteralExpressionContext literalExpression(int i) {
			return getRuleContext(LiteralExpressionContext.class,i);
		}
		public List<AttributeExpressionContext> attributeExpression() {
			return getRuleContexts(AttributeExpressionContext.class);
		}
		public AttributeExpressionContext attributeExpression(int i) {
			return getRuleContext(AttributeExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(OALParser.COMMA, 0); }
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitAggregateFunction(this);
		}
	}

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aggregateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			functionName();
			setState(169);
			match(LR_BRACKET);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << NUMBER_LITERAL) | (1L << STRING_LITERAL) | (1L << IDENTIFIER) | (1L << STRING_TO_LONG) | (1L << STRING_TO_LONG_SHORT) | (1L << STRING_TO_INT) | (1L << STRING_TO_INT_SHORT))) != 0)) {
				{
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(170);
					funcParamExpression();
					}
					break;
				case 2:
					{
					setState(171);
					literalExpression();
					}
					break;
				case 3:
					{
					setState(172);
					attributeExpression();
					}
					break;
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(175);
					match(COMMA);
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(176);
						funcParamExpression();
						}
						break;
					case 2:
						{
						setState(177);
						literalExpression();
						}
						break;
					case 3:
						{
						setState(178);
						attributeExpression();
						}
						break;
					}
					}
				}

				}
			}

			setState(185);
			match(RR_BRACKET);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IDENTIFIER);
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

	public static class FuncParamExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncParamExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParamExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterFuncParamExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitFuncParamExpression(this);
		}
	}

	public final FuncParamExpressionContext funcParamExpression() throws RecognitionException {
		FuncParamExpressionContext _localctx = new FuncParamExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcParamExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			expression();
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

	public static class LiteralExpressionContext extends ParserRuleContext {
		public TerminalNode BOOL_LITERAL() { return getToken(OALParser.BOOL_LITERAL, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(OALParser.NUMBER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(OALParser.STRING_LITERAL, 0); }
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitLiteralExpression(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << NUMBER_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AttributeExpressionContext extends ParserRuleContext {
		public List<AttributeExpressionSegmentContext> attributeExpressionSegment() {
			return getRuleContexts(AttributeExpressionSegmentContext.class);
		}
		public AttributeExpressionSegmentContext attributeExpressionSegment(int i) {
			return getRuleContext(AttributeExpressionSegmentContext.class,i);
		}
		public FunctionArgCastContext functionArgCast() {
			return getRuleContext(FunctionArgCastContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(OALParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OALParser.DOT, i);
		}
		public AttributeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterAttributeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitAttributeExpression(this);
		}
	}

	public final AttributeExpressionContext attributeExpression() throws RecognitionException {
		AttributeExpressionContext _localctx = new AttributeExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attributeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_TO_LONG) | (1L << STRING_TO_LONG_SHORT) | (1L << STRING_TO_INT) | (1L << STRING_TO_INT_SHORT))) != 0)) {
				{
				setState(193);
				functionArgCast();
				}
			}

			setState(196);
			attributeExpressionSegment();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(197);
				match(DOT);
				setState(198);
				attributeExpressionSegment();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AttributeExpressionSegmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public MapAttributeContext mapAttribute() {
			return getRuleContext(MapAttributeContext.class,0);
		}
		public AttributeExpressionSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeExpressionSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterAttributeExpressionSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitAttributeExpressionSegment(this);
		}
	}

	public final AttributeExpressionSegmentContext attributeExpressionSegment() throws RecognitionException {
		AttributeExpressionSegmentContext _localctx = new AttributeExpressionSegmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attributeExpressionSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(204);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(205);
				mapAttribute();
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanMatchContext booleanMatch() {
			return getRuleContext(BooleanMatchContext.class,0);
		}
		public NumberMatchContext numberMatch() {
			return getRuleContext(NumberMatchContext.class,0);
		}
		public StringMatchContext stringMatch() {
			return getRuleContext(StringMatchContext.class,0);
		}
		public GreaterMatchContext greaterMatch() {
			return getRuleContext(GreaterMatchContext.class,0);
		}
		public LessMatchContext lessMatch() {
			return getRuleContext(LessMatchContext.class,0);
		}
		public GreaterEqualMatchContext greaterEqualMatch() {
			return getRuleContext(GreaterEqualMatchContext.class,0);
		}
		public LessEqualMatchContext lessEqualMatch() {
			return getRuleContext(LessEqualMatchContext.class,0);
		}
		public NotEqualMatchContext notEqualMatch() {
			return getRuleContext(NotEqualMatchContext.class,0);
		}
		public BooleanNotEqualMatchContext booleanNotEqualMatch() {
			return getRuleContext(BooleanNotEqualMatchContext.class,0);
		}
		public LikeMatchContext likeMatch() {
			return getRuleContext(LikeMatchContext.class,0);
		}
		public InMatchContext inMatch() {
			return getRuleContext(InMatchContext.class,0);
		}
		public ContainMatchContext containMatch() {
			return getRuleContext(ContainMatchContext.class,0);
		}
		public NotContainMatchContext notContainMatch() {
			return getRuleContext(NotContainMatchContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				booleanMatch();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				numberMatch();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				stringMatch();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				greaterMatch();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				lessMatch();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				greaterEqualMatch();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				lessEqualMatch();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				notEqualMatch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(216);
				booleanNotEqualMatch();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(217);
				likeMatch();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(218);
				inMatch();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(219);
				containMatch();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(220);
				notContainMatch();
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

	public static class ContainMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode CONTAIN() { return getToken(OALParser.CONTAIN, 0); }
		public StringConditionValueContext stringConditionValue() {
			return getRuleContext(StringConditionValueContext.class,0);
		}
		public ContainMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterContainMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitContainMatch(this);
		}
	}

	public final ContainMatchContext containMatch() throws RecognitionException {
		ContainMatchContext _localctx = new ContainMatchContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_containMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			conditionAttributeStmt();
			setState(224);
			match(CONTAIN);
			setState(225);
			stringConditionValue();
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

	public static class NotContainMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode NOT_CONTAIN() { return getToken(OALParser.NOT_CONTAIN, 0); }
		public StringConditionValueContext stringConditionValue() {
			return getRuleContext(StringConditionValueContext.class,0);
		}
		public NotContainMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notContainMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterNotContainMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitNotContainMatch(this);
		}
	}

	public final NotContainMatchContext notContainMatch() throws RecognitionException {
		NotContainMatchContext _localctx = new NotContainMatchContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_notContainMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			conditionAttributeStmt();
			setState(228);
			match(NOT_CONTAIN);
			setState(229);
			stringConditionValue();
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

	public static class BooleanMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode DUALEQUALS() { return getToken(OALParser.DUALEQUALS, 0); }
		public BooleanConditionValueContext booleanConditionValue() {
			return getRuleContext(BooleanConditionValueContext.class,0);
		}
		public BooleanMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterBooleanMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitBooleanMatch(this);
		}
	}

	public final BooleanMatchContext booleanMatch() throws RecognitionException {
		BooleanMatchContext _localctx = new BooleanMatchContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			conditionAttributeStmt();
			setState(232);
			match(DUALEQUALS);
			setState(233);
			booleanConditionValue();
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

	public static class NumberMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode DUALEQUALS() { return getToken(OALParser.DUALEQUALS, 0); }
		public NumberConditionValueContext numberConditionValue() {
			return getRuleContext(NumberConditionValueContext.class,0);
		}
		public NumberMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterNumberMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitNumberMatch(this);
		}
	}

	public final NumberMatchContext numberMatch() throws RecognitionException {
		NumberMatchContext _localctx = new NumberMatchContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numberMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			conditionAttributeStmt();
			setState(236);
			match(DUALEQUALS);
			setState(237);
			numberConditionValue();
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

	public static class StringMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode DUALEQUALS() { return getToken(OALParser.DUALEQUALS, 0); }
		public StringConditionValueContext stringConditionValue() {
			return getRuleContext(StringConditionValueContext.class,0);
		}
		public EnumConditionValueContext enumConditionValue() {
			return getRuleContext(EnumConditionValueContext.class,0);
		}
		public NullConditionValueContext nullConditionValue() {
			return getRuleContext(NullConditionValueContext.class,0);
		}
		public StringMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterStringMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitStringMatch(this);
		}
	}

	public final StringMatchContext stringMatch() throws RecognitionException {
		StringMatchContext _localctx = new StringMatchContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stringMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			conditionAttributeStmt();
			setState(240);
			match(DUALEQUALS);
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(241);
				stringConditionValue();
				}
				break;
			case IDENTIFIER:
				{
				setState(242);
				enumConditionValue();
				}
				break;
			case NULL_LITERAL:
				{
				setState(243);
				nullConditionValue();
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

	public static class GreaterMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(OALParser.GREATER, 0); }
		public NumberConditionValueContext numberConditionValue() {
			return getRuleContext(NumberConditionValueContext.class,0);
		}
		public GreaterMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterGreaterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitGreaterMatch(this);
		}
	}

	public final GreaterMatchContext greaterMatch() throws RecognitionException {
		GreaterMatchContext _localctx = new GreaterMatchContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_greaterMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			conditionAttributeStmt();
			setState(247);
			match(GREATER);
			setState(248);
			numberConditionValue();
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

	public static class LessMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode LESS() { return getToken(OALParser.LESS, 0); }
		public NumberConditionValueContext numberConditionValue() {
			return getRuleContext(NumberConditionValueContext.class,0);
		}
		public LessMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterLessMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitLessMatch(this);
		}
	}

	public final LessMatchContext lessMatch() throws RecognitionException {
		LessMatchContext _localctx = new LessMatchContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lessMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			conditionAttributeStmt();
			setState(251);
			match(LESS);
			setState(252);
			numberConditionValue();
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

	public static class GreaterEqualMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode GREATER_EQUAL() { return getToken(OALParser.GREATER_EQUAL, 0); }
		public NumberConditionValueContext numberConditionValue() {
			return getRuleContext(NumberConditionValueContext.class,0);
		}
		public GreaterEqualMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterEqualMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterGreaterEqualMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitGreaterEqualMatch(this);
		}
	}

	public final GreaterEqualMatchContext greaterEqualMatch() throws RecognitionException {
		GreaterEqualMatchContext _localctx = new GreaterEqualMatchContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_greaterEqualMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			conditionAttributeStmt();
			setState(255);
			match(GREATER_EQUAL);
			setState(256);
			numberConditionValue();
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

	public static class LessEqualMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode LESS_EQUAL() { return getToken(OALParser.LESS_EQUAL, 0); }
		public NumberConditionValueContext numberConditionValue() {
			return getRuleContext(NumberConditionValueContext.class,0);
		}
		public LessEqualMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessEqualMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterLessEqualMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitLessEqualMatch(this);
		}
	}

	public final LessEqualMatchContext lessEqualMatch() throws RecognitionException {
		LessEqualMatchContext _localctx = new LessEqualMatchContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lessEqualMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			conditionAttributeStmt();
			setState(259);
			match(LESS_EQUAL);
			setState(260);
			numberConditionValue();
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

	public static class BooleanNotEqualMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(OALParser.NOT_EQUAL, 0); }
		public BooleanConditionValueContext booleanConditionValue() {
			return getRuleContext(BooleanConditionValueContext.class,0);
		}
		public BooleanNotEqualMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanNotEqualMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterBooleanNotEqualMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitBooleanNotEqualMatch(this);
		}
	}

	public final BooleanNotEqualMatchContext booleanNotEqualMatch() throws RecognitionException {
		BooleanNotEqualMatchContext _localctx = new BooleanNotEqualMatchContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleanNotEqualMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			conditionAttributeStmt();
			setState(263);
			match(NOT_EQUAL);
			setState(264);
			booleanConditionValue();
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

	public static class NotEqualMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(OALParser.NOT_EQUAL, 0); }
		public NumberConditionValueContext numberConditionValue() {
			return getRuleContext(NumberConditionValueContext.class,0);
		}
		public StringConditionValueContext stringConditionValue() {
			return getRuleContext(StringConditionValueContext.class,0);
		}
		public EnumConditionValueContext enumConditionValue() {
			return getRuleContext(EnumConditionValueContext.class,0);
		}
		public NullConditionValueContext nullConditionValue() {
			return getRuleContext(NullConditionValueContext.class,0);
		}
		public NotEqualMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqualMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterNotEqualMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitNotEqualMatch(this);
		}
	}

	public final NotEqualMatchContext notEqualMatch() throws RecognitionException {
		NotEqualMatchContext _localctx = new NotEqualMatchContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_notEqualMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			conditionAttributeStmt();
			setState(267);
			match(NOT_EQUAL);
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_LITERAL:
				{
				setState(268);
				numberConditionValue();
				}
				break;
			case STRING_LITERAL:
				{
				setState(269);
				stringConditionValue();
				}
				break;
			case IDENTIFIER:
				{
				setState(270);
				enumConditionValue();
				}
				break;
			case NULL_LITERAL:
				{
				setState(271);
				nullConditionValue();
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

	public static class LikeMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(OALParser.LIKE, 0); }
		public StringConditionValueContext stringConditionValue() {
			return getRuleContext(StringConditionValueContext.class,0);
		}
		public LikeMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterLikeMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitLikeMatch(this);
		}
	}

	public final LikeMatchContext likeMatch() throws RecognitionException {
		LikeMatchContext _localctx = new LikeMatchContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_likeMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			conditionAttributeStmt();
			setState(275);
			match(LIKE);
			setState(276);
			stringConditionValue();
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

	public static class InMatchContext extends ParserRuleContext {
		public ConditionAttributeStmtContext conditionAttributeStmt() {
			return getRuleContext(ConditionAttributeStmtContext.class,0);
		}
		public TerminalNode IN() { return getToken(OALParser.IN, 0); }
		public MultiConditionValueContext multiConditionValue() {
			return getRuleContext(MultiConditionValueContext.class,0);
		}
		public InMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterInMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitInMatch(this);
		}
	}

	public final InMatchContext inMatch() throws RecognitionException {
		InMatchContext _localctx = new InMatchContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			conditionAttributeStmt();
			setState(279);
			match(IN);
			setState(280);
			multiConditionValue();
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

	public static class MultiConditionValueContext extends ParserRuleContext {
		public TerminalNode LS_BRACKET() { return getToken(OALParser.LS_BRACKET, 0); }
		public TerminalNode RS_BRACKET() { return getToken(OALParser.RS_BRACKET, 0); }
		public List<NumberConditionValueContext> numberConditionValue() {
			return getRuleContexts(NumberConditionValueContext.class);
		}
		public NumberConditionValueContext numberConditionValue(int i) {
			return getRuleContext(NumberConditionValueContext.class,i);
		}
		public List<StringConditionValueContext> stringConditionValue() {
			return getRuleContexts(StringConditionValueContext.class);
		}
		public StringConditionValueContext stringConditionValue(int i) {
			return getRuleContext(StringConditionValueContext.class,i);
		}
		public List<EnumConditionValueContext> enumConditionValue() {
			return getRuleContexts(EnumConditionValueContext.class);
		}
		public EnumConditionValueContext enumConditionValue(int i) {
			return getRuleContext(EnumConditionValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OALParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OALParser.COMMA, i);
		}
		public MultiConditionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiConditionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterMultiConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitMultiConditionValue(this);
		}
	}

	public final MultiConditionValueContext multiConditionValue() throws RecognitionException {
		MultiConditionValueContext _localctx = new MultiConditionValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multiConditionValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(LS_BRACKET);
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_LITERAL:
				{
				setState(283);
				numberConditionValue();
				{
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(284);
					match(COMMA);
					setState(285);
					numberConditionValue();
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case STRING_LITERAL:
				{
				setState(291);
				stringConditionValue();
				{
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(292);
					match(COMMA);
					setState(293);
					stringConditionValue();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(299);
				enumConditionValue();
				{
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(300);
					match(COMMA);
					setState(301);
					enumConditionValue();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(309);
			match(RS_BRACKET);
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

	public static class ConditionAttributeStmtContext extends ParserRuleContext {
		public List<ConditionAttributeContext> conditionAttribute() {
			return getRuleContexts(ConditionAttributeContext.class);
		}
		public ConditionAttributeContext conditionAttribute(int i) {
			return getRuleContext(ConditionAttributeContext.class,i);
		}
		public ExpressionAttrCastContext expressionAttrCast() {
			return getRuleContext(ExpressionAttrCastContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(OALParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OALParser.DOT, i);
		}
		public ConditionAttributeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionAttributeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterConditionAttributeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitConditionAttributeStmt(this);
		}
	}

	public final ConditionAttributeStmtContext conditionAttributeStmt() throws RecognitionException {
		ConditionAttributeStmtContext _localctx = new ConditionAttributeStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditionAttributeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_TO_LONG) | (1L << STRING_TO_LONG_SHORT) | (1L << STRING_TO_INT) | (1L << STRING_TO_INT_SHORT))) != 0)) {
				{
				setState(311);
				expressionAttrCast();
				}
			}

			setState(314);
			conditionAttribute();
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(315);
				match(DOT);
				setState(316);
				conditionAttribute();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ConditionAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public MapAttributeContext mapAttribute() {
			return getRuleContext(MapAttributeContext.class,0);
		}
		public ConditionAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterConditionAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitConditionAttribute(this);
		}
	}

	public final ConditionAttributeContext conditionAttribute() throws RecognitionException {
		ConditionAttributeContext _localctx = new ConditionAttributeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(322);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(323);
				mapAttribute();
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

	public static class MapAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public TerminalNode LS_BRACKET() { return getToken(OALParser.LS_BRACKET, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(OALParser.STRING_LITERAL, 0); }
		public TerminalNode RS_BRACKET() { return getToken(OALParser.RS_BRACKET, 0); }
		public MapAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterMapAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitMapAttribute(this);
		}
	}

	public final MapAttributeContext mapAttribute() throws RecognitionException {
		MapAttributeContext _localctx = new MapAttributeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mapAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(IDENTIFIER);
			setState(327);
			match(LS_BRACKET);
			setState(328);
			match(STRING_LITERAL);
			setState(329);
			match(RS_BRACKET);
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

	public static class BooleanConditionValueContext extends ParserRuleContext {
		public TerminalNode BOOL_LITERAL() { return getToken(OALParser.BOOL_LITERAL, 0); }
		public BooleanConditionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConditionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterBooleanConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitBooleanConditionValue(this);
		}
	}

	public final BooleanConditionValueContext booleanConditionValue() throws RecognitionException {
		BooleanConditionValueContext _localctx = new BooleanConditionValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_booleanConditionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(BOOL_LITERAL);
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

	public static class StringConditionValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(OALParser.STRING_LITERAL, 0); }
		public StringConditionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConditionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterStringConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitStringConditionValue(this);
		}
	}

	public final StringConditionValueContext stringConditionValue() throws RecognitionException {
		StringConditionValueContext _localctx = new StringConditionValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stringConditionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(STRING_LITERAL);
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

	public static class EnumConditionValueContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(OALParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(OALParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(OALParser.DOT, 0); }
		public EnumConditionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConditionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterEnumConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitEnumConditionValue(this);
		}
	}

	public final EnumConditionValueContext enumConditionValue() throws RecognitionException {
		EnumConditionValueContext _localctx = new EnumConditionValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_enumConditionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(IDENTIFIER);
			setState(336);
			match(DOT);
			setState(337);
			match(IDENTIFIER);
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

	public static class NumberConditionValueContext extends ParserRuleContext {
		public TerminalNode NUMBER_LITERAL() { return getToken(OALParser.NUMBER_LITERAL, 0); }
		public NumberConditionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberConditionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterNumberConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitNumberConditionValue(this);
		}
	}

	public final NumberConditionValueContext numberConditionValue() throws RecognitionException {
		NumberConditionValueContext _localctx = new NumberConditionValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_numberConditionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(NUMBER_LITERAL);
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

	public static class NullConditionValueContext extends ParserRuleContext {
		public TerminalNode NULL_LITERAL() { return getToken(OALParser.NULL_LITERAL, 0); }
		public NullConditionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullConditionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterNullConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitNullConditionValue(this);
		}
	}

	public final NullConditionValueContext nullConditionValue() throws RecognitionException {
		NullConditionValueContext _localctx = new NullConditionValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_nullConditionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(NULL_LITERAL);
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

	public static class SourceAttrCastContext extends ParserRuleContext {
		public CastStmtContext castStmt() {
			return getRuleContext(CastStmtContext.class,0);
		}
		public SourceAttrCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceAttrCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterSourceAttrCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitSourceAttrCast(this);
		}
	}

	public final SourceAttrCastContext sourceAttrCast() throws RecognitionException {
		SourceAttrCastContext _localctx = new SourceAttrCastContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sourceAttrCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			castStmt();
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

	public static class ExpressionAttrCastContext extends ParserRuleContext {
		public CastStmtContext castStmt() {
			return getRuleContext(CastStmtContext.class,0);
		}
		public ExpressionAttrCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAttrCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterExpressionAttrCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitExpressionAttrCast(this);
		}
	}

	public final ExpressionAttrCastContext expressionAttrCast() throws RecognitionException {
		ExpressionAttrCastContext _localctx = new ExpressionAttrCastContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionAttrCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			castStmt();
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

	public static class FunctionArgCastContext extends ParserRuleContext {
		public CastStmtContext castStmt() {
			return getRuleContext(CastStmtContext.class,0);
		}
		public FunctionArgCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterFunctionArgCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitFunctionArgCast(this);
		}
	}

	public final FunctionArgCastContext functionArgCast() throws RecognitionException {
		FunctionArgCastContext _localctx = new FunctionArgCastContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionArgCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			castStmt();
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

	public static class CastStmtContext extends ParserRuleContext {
		public TerminalNode STRING_TO_LONG() { return getToken(OALParser.STRING_TO_LONG, 0); }
		public TerminalNode STRING_TO_LONG_SHORT() { return getToken(OALParser.STRING_TO_LONG_SHORT, 0); }
		public TerminalNode STRING_TO_INT() { return getToken(OALParser.STRING_TO_INT, 0); }
		public TerminalNode STRING_TO_INT_SHORT() { return getToken(OALParser.STRING_TO_INT_SHORT, 0); }
		public CastStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterCastStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitCastStmt(this);
		}
	}

	public final CastStmtContext castStmt() throws RecognitionException {
		CastStmtContext _localctx = new CastStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_castStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_TO_LONG) | (1L << STRING_TO_LONG_SHORT) | (1L << STRING_TO_INT) | (1L << STRING_TO_INT_SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0162\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\3\3\3\5\3d\n\3\3\3\3\3\5"+
		"\3h\n\3\3\3\3\3\5\3l\n\3\3\3\5\3o\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4"+
		"x\n\4\3\4\5\4{\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u0082\n\5\3\5\3\5\6\5\u0086"+
		"\n\5\r\5\16\5\u0087\3\5\3\5\6\5\u008c\n\5\r\5\16\5\u008d\5\5\u0090\n\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\5\13\u00a7\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u00b0"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\5\r\u00b8\n\r\5\r\u00ba\n\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\5\21\u00c5\n\21\3\21\3\21\3\21\7\21"+
		"\u00ca\n\21\f\21\16\21\u00cd\13\21\3\22\3\22\5\22\u00d1\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e0\n\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u00f7\n\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0113\n\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\7!\u0121\n!\f!\16!\u0124\13!\3!\3!\3!\7"+
		"!\u0129\n!\f!\16!\u012c\13!\3!\3!\3!\7!\u0131\n!\f!\16!\u0134\13!\5!\u0136"+
		"\n!\3!\3!\3\"\5\"\u013b\n\"\3\"\3\"\3\"\7\"\u0140\n\"\f\"\16\"\u0143\13"+
		"\"\3#\3#\5#\u0147\n#\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3("+
		"\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\6\3\3$$\3\2\6\35\4\2\62"+
		"\63\65\65\3\2:=\2\u0165\2^\3\2\2\2\4a\3\2\2\2\6r\3\2\2\2\b~\3\2\2\2\n"+
		"\u0094\3\2\2\2\f\u009a\3\2\2\2\16\u009c\3\2\2\2\20\u009e\3\2\2\2\22\u00a0"+
		"\3\2\2\2\24\u00a6\3\2\2\2\26\u00a8\3\2\2\2\30\u00aa\3\2\2\2\32\u00bd\3"+
		"\2\2\2\34\u00bf\3\2\2\2\36\u00c1\3\2\2\2 \u00c4\3\2\2\2\"\u00d0\3\2\2"+
		"\2$\u00df\3\2\2\2&\u00e1\3\2\2\2(\u00e5\3\2\2\2*\u00e9\3\2\2\2,\u00ed"+
		"\3\2\2\2.\u00f1\3\2\2\2\60\u00f8\3\2\2\2\62\u00fc\3\2\2\2\64\u0100\3\2"+
		"\2\2\66\u0104\3\2\2\28\u0108\3\2\2\2:\u010c\3\2\2\2<\u0114\3\2\2\2>\u0118"+
		"\3\2\2\2@\u011c\3\2\2\2B\u013a\3\2\2\2D\u0146\3\2\2\2F\u0148\3\2\2\2H"+
		"\u014d\3\2\2\2J\u014f\3\2\2\2L\u0151\3\2\2\2N\u0155\3\2\2\2P\u0157\3\2"+
		"\2\2R\u0159\3\2\2\2T\u015b\3\2\2\2V\u015d\3\2\2\2X\u015f\3\2\2\2Z]\5\4"+
		"\3\2[]\5\6\4\2\\Z\3\2\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\3"+
		"\3\2\2\2`^\3\2\2\2ac\5\26\f\2bd\78\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2e"+
		"g\7%\2\2fh\78\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\5\b\5\2jl\7\66\2\2k"+
		"j\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\7\67\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2"+
		"pq\t\2\2\2q\5\3\2\2\2rs\7\5\2\2st\7\37\2\2tu\5\20\t\2uw\7 \2\2vx\7\66"+
		"\2\2wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2y{\7\67\2\2zy\3\2\2\2z{\3\2\2\2{|\3"+
		"\2\2\2|}\t\2\2\2}\7\3\2\2\2~\177\7\3\2\2\177\u0081\7\37\2\2\u0080\u0082"+
		"\5R*\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0085\5\16\b\2\u0084\u0086\5\22\n\2\u0085\u0084\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008f\7 \2\2\u008a\u008c\5\n\6\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008b\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\36"+
		"\2\2\u0092\u0093\5\30\r\2\u0093\t\3\2\2\2\u0094\u0095\7\36\2\2\u0095\u0096"+
		"\7\4\2\2\u0096\u0097\7\37\2\2\u0097\u0098\5\f\7\2\u0098\u0099\7 \2\2\u0099"+
		"\13\3\2\2\2\u009a\u009b\5$\23\2\u009b\r\3\2\2\2\u009c\u009d\t\3\2\2\u009d"+
		"\17\3\2\2\2\u009e\u009f\79\2\2\u009f\21\3\2\2\2\u00a0\u00a1\7\36\2\2\u00a1"+
		"\u00a2\5\24\13\2\u00a2\23\3\2\2\2\u00a3\u00a7\79\2\2\u00a4\u00a7\7\'\2"+
		"\2\u00a5\u00a7\5F$\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\25\3\2\2\2\u00a8\u00a9\79\2\2\u00a9\27\3\2\2\2\u00aa\u00ab"+
		"\5\32\16\2\u00ab\u00b9\7\37\2\2\u00ac\u00b0\5\34\17\2\u00ad\u00b0\5\36"+
		"\20\2\u00ae\u00b0\5 \21\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b7\3\2\2\2\u00b1\u00b5\7#\2\2\u00b2\u00b6\5\34"+
		"\17\2\u00b3\u00b6\5\36\20\2\u00b4\u00b6\5 \21\2\u00b5\u00b2\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b1\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7 \2\2\u00bc\31\3\2\2\2"+
		"\u00bd\u00be\79\2\2\u00be\33\3\2\2\2\u00bf\u00c0\5$\23\2\u00c0\35\3\2"+
		"\2\2\u00c1\u00c2\t\4\2\2\u00c2\37\3\2\2\2\u00c3\u00c5\5V,\2\u00c4\u00c3"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cb\5\"\22\2"+
		"\u00c7\u00c8\7\36\2\2\u00c8\u00ca\5\"\22\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc!\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d1\79\2\2\u00cf\u00d1\5F$\2\u00d0\u00ce\3\2\2"+
		"\2\u00d0\u00cf\3\2\2\2\u00d1#\3\2\2\2\u00d2\u00e0\5*\26\2\u00d3\u00e0"+
		"\5,\27\2\u00d4\u00e0\5.\30\2\u00d5\u00e0\5\60\31\2\u00d6\u00e0\5\62\32"+
		"\2\u00d7\u00e0\5\64\33\2\u00d8\u00e0\5\66\34\2\u00d9\u00e0\5:\36\2\u00da"+
		"\u00e0\58\35\2\u00db\u00e0\5<\37\2\u00dc\u00e0\5> \2\u00dd\u00e0\5&\24"+
		"\2\u00de\u00e0\5(\25\2\u00df\u00d2\3\2\2\2\u00df\u00d3\3\2\2\2\u00df\u00d4"+
		"\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d7\3\2\2\2\u00df"+
		"\u00d8\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2"+
		"\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"%\3\2\2\2\u00e1\u00e2\5B\"\2\u00e2\u00e3\7/\2\2\u00e3\u00e4\5J&\2\u00e4"+
		"\'\3\2\2\2\u00e5\u00e6\5B\"\2\u00e6\u00e7\7\60\2\2\u00e7\u00e8\5J&\2\u00e8"+
		")\3\2\2\2\u00e9\u00ea\5B\"\2\u00ea\u00eb\7&\2\2\u00eb\u00ec\5H%\2\u00ec"+
		"+\3\2\2\2\u00ed\u00ee\5B\"\2\u00ee\u00ef\7&\2\2\u00ef\u00f0\5N(\2\u00f0"+
		"-\3\2\2\2\u00f1\u00f2\5B\"\2\u00f2\u00f6\7&\2\2\u00f3\u00f7\5J&\2\u00f4"+
		"\u00f7\5L\'\2\u00f5\u00f7\5P)\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2"+
		"\2\u00f6\u00f5\3\2\2\2\u00f7/\3\2\2\2\u00f8\u00f9\5B\"\2\u00f9\u00fa\7"+
		"(\2\2\u00fa\u00fb\5N(\2\u00fb\61\3\2\2\2\u00fc\u00fd\5B\"\2\u00fd\u00fe"+
		"\7)\2\2\u00fe\u00ff\5N(\2\u00ff\63\3\2\2\2\u0100\u0101\5B\"\2\u0101\u0102"+
		"\7*\2\2\u0102\u0103\5N(\2\u0103\65\3\2\2\2\u0104\u0105\5B\"\2\u0105\u0106"+
		"\7+\2\2\u0106\u0107\5N(\2\u0107\67\3\2\2\2\u0108\u0109\5B\"\2\u0109\u010a"+
		"\7,\2\2\u010a\u010b\5H%\2\u010b9\3\2\2\2\u010c\u010d\5B\"\2\u010d\u0112"+
		"\7,\2\2\u010e\u0113\5N(\2\u010f\u0113\5J&\2\u0110\u0113\5L\'\2\u0111\u0113"+
		"\5P)\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0111\3\2\2\2\u0113;\3\2\2\2\u0114\u0115\5B\"\2\u0115\u0116\7-\2\2\u0116"+
		"\u0117\5J&\2\u0117=\3\2\2\2\u0118\u0119\5B\"\2\u0119\u011a\7.\2\2\u011a"+
		"\u011b\5@!\2\u011b?\3\2\2\2\u011c\u0135\7!\2\2\u011d\u0122\5N(\2\u011e"+
		"\u011f\7#\2\2\u011f\u0121\5N(\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2"+
		"\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0136\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0125\u012a\5J&\2\u0126\u0127\7#\2\2\u0127\u0129\5J&\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u0136\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0132\5L\'\2\u012e"+
		"\u012f\7#\2\2\u012f\u0131\5L\'\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2"+
		"\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u011d\3\2\2\2\u0135\u0125\3\2\2\2\u0135\u012d\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\7\"\2\2\u0138A\3\2\2\2\u0139\u013b\5T+\2\u013a"+
		"\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0141\5D"+
		"#\2\u013d\u013e\7\36\2\2\u013e\u0140\5D#\2\u013f\u013d\3\2\2\2\u0140\u0143"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142C\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0147\79\2\2\u0145\u0147\5F$\2\u0146\u0144\3\2\2"+
		"\2\u0146\u0145\3\2\2\2\u0147E\3\2\2\2\u0148\u0149\79\2\2\u0149\u014a\7"+
		"!\2\2\u014a\u014b\7\65\2\2\u014b\u014c\7\"\2\2\u014cG\3\2\2\2\u014d\u014e"+
		"\7\62\2\2\u014eI\3\2\2\2\u014f\u0150\7\65\2\2\u0150K\3\2\2\2\u0151\u0152"+
		"\79\2\2\u0152\u0153\7\36\2\2\u0153\u0154\79\2\2\u0154M\3\2\2\2\u0155\u0156"+
		"\7\63\2\2\u0156O\3\2\2\2\u0157\u0158\7\61\2\2\u0158Q\3\2\2\2\u0159\u015a"+
		"\5X-\2\u015aS\3\2\2\2\u015b\u015c\5X-\2\u015cU\3\2\2\2\u015d\u015e\5X"+
		"-\2\u015eW\3\2\2\2\u015f\u0160\t\5\2\2\u0160Y\3\2\2\2 \\^cgknwz\u0081"+
		"\u0087\u008d\u008f\u00a6\u00af\u00b5\u00b7\u00b9\u00c4\u00cb\u00d0\u00df"+
		"\u00f6\u0112\u0122\u012a\u0132\u0135\u013a\u0141\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}