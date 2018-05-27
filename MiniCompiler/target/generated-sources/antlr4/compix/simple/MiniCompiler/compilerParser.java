// Generated from compix\simple\MiniCompiler\compiler.g4 by ANTLR 4.5.1
package compix.simple.MiniCompiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, STRING=2, PROGRAM=3, PRINTLN=4, PRINTE=5, IF=6, FORI=7, INT=8, 
		CHAR=9, BOOL=10, SUM=11, LLAVE_AP=12, LLAVE_END=13, RES=14, MULT=15, DIV=16, 
		MOD=17, POT=18, OR=19, AND=20, DIF=21, IGUALD=22, MAYQ=23, MENQ=24, MAYOQ=25, 
		MENOQ=26, INCRE=27, DECRE=28, TRUE_COND=29, FALSE_COND=30, ASSIGN=31, 
		COM=32, SEMICOLON=33, PAR_AP=34, PAR_CI=35, COR_AP=36, COR_CI=37, COMILLA=38, 
		ID=39, WORDS=40, ENTERO=41, FLOAT=42, WS=43;
	public static final int
		RULE_programa = 0, RULE_val = 1, RULE_mostrar_text = 2, RULE_mostrar = 3, 
		RULE_operacion = 4, RULE_declarar = 5, RULE_declarar_string = 6, RULE_def_var = 7, 
		RULE_declare = 8, RULE_declarar_int = 9, RULE_dato = 10, RULE_dobles = 11, 
		RULE_exp = 12, RULE_aritmetico = 13, RULE_operador = 14, RULE_caden = 15, 
		RULE_value = 16, RULE_texto = 17;
	public static final String[] ruleNames = {
		"programa", "val", "mostrar_text", "mostrar", "operacion", "declarar", 
		"declarar_string", "def_var", "declare", "declarar_int", "dato", "dobles", 
		"exp", "aritmetico", "operador", "caden", "value", "texto"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'CADENA'", "'begin'", "'show'", "'show_in'", "'cond_way'", 
		"'flash'", "'uch'", "'leo'", "'two_face'", "'+'", null, null, "'-'", "'*'", 
		"'/'", "'%'", "'^'", "'||'", "'&&'", "'!='", "'=='", "'>'", "'<'", "'>='", 
		"'<='", "'++'", "'--'", "'spidy'", "'venom'", "'='", "','", "';'", "'('", 
		"')'", null, null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "STRING", "PROGRAM", "PRINTLN", "PRINTE", "IF", "FORI", "INT", 
		"CHAR", "BOOL", "SUM", "LLAVE_AP", "LLAVE_END", "RES", "MULT", "DIV", 
		"MOD", "POT", "OR", "AND", "DIF", "IGUALD", "MAYQ", "MENQ", "MAYOQ", "MENOQ", 
		"INCRE", "DECRE", "TRUE_COND", "FALSE_COND", "ASSIGN", "COM", "SEMICOLON", 
		"PAR_AP", "PAR_CI", "COR_AP", "COR_CI", "COMILLA", "ID", "WORDS", "ENTERO", 
		"FLOAT", "WS"
	};
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
	public String getGrammarFileName() { return "compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public Def_varContext def_var() {
			return getRuleContext(Def_varContext.class,0);
		}
		public Mostrar_textContext mostrar_text() {
			return getRuleContext(Mostrar_textContext.class,0);
		}
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				def_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				mostrar_text();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				declarar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				operacion();
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compilerParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(compilerParser.ENTERO, 0); }
		public TerminalNode TRUE_COND() { return getToken(compilerParser.TRUE_COND, 0); }
		public TerminalNode FALSE_COND() { return getToken(compilerParser.FALSE_COND, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE_COND) | (1L << FALSE_COND) | (1L << ID) | (1L << ENTERO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Mostrar_textContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(compilerParser.PROGRAM, 0); }
		public TerminalNode PAR_AP() { return getToken(compilerParser.PAR_AP, 0); }
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(compilerParser.SEMICOLON, 0); }
		public TerminalNode PAR_CI() { return getToken(compilerParser.PAR_CI, 0); }
		public Mostrar_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterMostrar_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitMostrar_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitMostrar_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mostrar_textContext mostrar_text() throws RecognitionException {
		Mostrar_textContext _localctx = new Mostrar_textContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mostrar_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(PROGRAM);
			setState(45);
			match(PAR_AP);
			setState(46);
			mostrar();
			setState(47);
			match(SEMICOLON);
			setState(48);
			match(PAR_CI);
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

	public static class MostrarContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(compilerParser.PRINTLN, 0); }
		public TerminalNode PAR_AP() { return getToken(compilerParser.PAR_AP, 0); }
		public List<TerminalNode> COMILLA() { return getTokens(compilerParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(compilerParser.COMILLA, i);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode PAR_CI() { return getToken(compilerParser.PAR_CI, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(PRINTLN);
			setState(51);
			match(PAR_AP);
			setState(52);
			match(COMILLA);
			setState(53);
			texto();
			setState(54);
			match(COMILLA);
			setState(55);
			match(PAR_CI);
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

	public static class OperacionContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(compilerParser.PROGRAM, 0); }
		public TerminalNode PAR_AP() { return getToken(compilerParser.PAR_AP, 0); }
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public AritmeticoContext aritmetico() {
			return getRuleContext(AritmeticoContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(compilerParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(compilerParser.SEMICOLON, 0); }
		public TerminalNode PAR_CI() { return getToken(compilerParser.PAR_CI, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(PROGRAM);
			setState(58);
			match(PAR_AP);
			setState(59);
			val();
			setState(60);
			aritmetico();
			setState(61);
			val();
			setState(62);
			match(ASSIGN);
			setState(63);
			val();
			setState(64);
			match(SEMICOLON);
			setState(65);
			match(PAR_CI);
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

	public static class DeclararContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(compilerParser.PROGRAM, 0); }
		public TerminalNode PAR_AP() { return getToken(compilerParser.PAR_AP, 0); }
		public TerminalNode SEMICOLON() { return getToken(compilerParser.SEMICOLON, 0); }
		public TerminalNode PAR_CI() { return getToken(compilerParser.PAR_CI, 0); }
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclarar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclarar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclarar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(PROGRAM);
			setState(68);
			match(PAR_AP);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << ID) | (1L << ENTERO) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(69);
				declare();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(SEMICOLON);
			setState(76);
			match(PAR_CI);
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

	public static class Declarar_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(compilerParser.STRING, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(compilerParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(compilerParser.ID, 0); }
		public Declarar_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclarar_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclarar_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclarar_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_stringContext declarar_string() throws RecognitionException {
		Declarar_stringContext _localctx = new Declarar_stringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarar_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(STRING);
			setState(79);
			val();
			setState(80);
			match(ASSIGN);
			setState(81);
			match(ID);
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

	public static class Def_varContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(compilerParser.STRING, 0); }
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(compilerParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(compilerParser.SEMICOLON, 0); }
		public Def_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDef_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDef_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDef_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_varContext def_var() throws RecognitionException {
		Def_varContext _localctx = new Def_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_def_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(STRING);
			setState(84);
			val();
			setState(85);
			match(ASSIGN);
			setState(86);
			val();
			setState(87);
			match(SEMICOLON);
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

	public static class DeclareContext extends ParserRuleContext {
		public Declarar_stringContext declarar_string() {
			return getRuleContext(Declarar_stringContext.class,0);
		}
		public Declarar_intContext declarar_int() {
			return getRuleContext(Declarar_intContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declare);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				declarar_string();
				}
				break;
			case INT:
			case ID:
			case ENTERO:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				declarar_int();
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

	public static class Declarar_intContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(compilerParser.ASSIGN, 0); }
		public TerminalNode ENTERO() { return getToken(compilerParser.ENTERO, 0); }
		public Declarar_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDeclarar_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDeclarar_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDeclarar_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_intContext declarar_int() throws RecognitionException {
		Declarar_intContext _localctx = new Declarar_intContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarar_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			exp();
			setState(94);
			val();
			setState(95);
			match(ASSIGN);
			setState(96);
			match(ENTERO);
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

	public static class DatoContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(compilerParser.FLOAT, 0); }
		public TerminalNode ENTERO() { return getToken(compilerParser.ENTERO, 0); }
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DoblesContext extends ParserRuleContext {
		public TerminalNode DECRE() { return getToken(compilerParser.DECRE, 0); }
		public TerminalNode INCRE() { return getToken(compilerParser.INCRE, 0); }
		public DoblesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dobles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterDobles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitDobles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitDobles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoblesContext dobles() throws RecognitionException {
		DoblesContext _localctx = new DoblesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dobles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==INCRE || _la==DECRE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(compilerParser.FLOAT, 0); }
		public TerminalNode ENTERO() { return getToken(compilerParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(compilerParser.ID, 0); }
		public TerminalNode INT() { return getToken(compilerParser.INT, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << ENTERO) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AritmeticoContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(compilerParser.SUM, 0); }
		public TerminalNode RES() { return getToken(compilerParser.RES, 0); }
		public TerminalNode MULT() { return getToken(compilerParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(compilerParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(compilerParser.MOD, 0); }
		public TerminalNode POT() { return getToken(compilerParser.POT, 0); }
		public AritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitAritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitAritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritmeticoContext aritmetico() throws RecognitionException {
		AritmeticoContext _localctx = new AritmeticoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << RES) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << POT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(compilerParser.OR, 0); }
		public TerminalNode AND() { return getToken(compilerParser.AND, 0); }
		public TerminalNode DIF() { return getToken(compilerParser.DIF, 0); }
		public TerminalNode IGUALD() { return getToken(compilerParser.IGUALD, 0); }
		public TerminalNode MAYQ() { return getToken(compilerParser.MAYQ, 0); }
		public TerminalNode MENQ() { return getToken(compilerParser.MENQ, 0); }
		public TerminalNode MAYOQ() { return getToken(compilerParser.MAYOQ, 0); }
		public TerminalNode MENOQ() { return getToken(compilerParser.MENOQ, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << DIF) | (1L << IGUALD) | (1L << MAYQ) | (1L << MENQ) | (1L << MAYOQ) | (1L << MENOQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CadenContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compilerParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(compilerParser.ENTERO, 0); }
		public CadenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterCaden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitCaden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitCaden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenContext caden() throws RecognitionException {
		CadenContext _localctx = new CadenContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_caden);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==ENTERO) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TRUE_COND() { return getToken(compilerParser.TRUE_COND, 0); }
		public TerminalNode FALSE_COND() { return getToken(compilerParser.FALSE_COND, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==TRUE_COND || _la==FALSE_COND) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TextoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compilerParser.ID, 0); }
		public TerminalNode INT() { return getToken(compilerParser.INT, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerListener ) ((compilerListener)listener).exitTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerVisitor ) return ((compilerVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_texto);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				val();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-x\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t"+
		"\23\3\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\7\7I\n\7\f\7\16\7L\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\5\n^\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23v"+
		"\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\n\5\2\37"+
		" ))++\3\2+,\3\2\35\36\5\2\n\n))+,\4\2\r\r\20\24\3\2\25\34\4\2))++\3\2"+
		"\37 l\2*\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b\64\3\2\2\2\n;\3\2\2\2\fE\3\2"+
		"\2\2\16P\3\2\2\2\20U\3\2\2\2\22]\3\2\2\2\24_\3\2\2\2\26d\3\2\2\2\30f\3"+
		"\2\2\2\32h\3\2\2\2\34j\3\2\2\2\36l\3\2\2\2 n\3\2\2\2\"p\3\2\2\2$u\3\2"+
		"\2\2&+\5\20\t\2\'+\5\6\4\2(+\5\f\7\2)+\5\n\6\2*&\3\2\2\2*\'\3\2\2\2*("+
		"\3\2\2\2*)\3\2\2\2+\3\3\2\2\2,-\t\2\2\2-\5\3\2\2\2./\7\5\2\2/\60\7$\2"+
		"\2\60\61\5\b\5\2\61\62\7#\2\2\62\63\7%\2\2\63\7\3\2\2\2\64\65\7\6\2\2"+
		"\65\66\7$\2\2\66\67\7(\2\2\678\5$\23\289\7(\2\29:\7%\2\2:\t\3\2\2\2;<"+
		"\7\5\2\2<=\7$\2\2=>\5\4\3\2>?\5\34\17\2?@\5\4\3\2@A\7!\2\2AB\5\4\3\2B"+
		"C\7#\2\2CD\7%\2\2D\13\3\2\2\2EF\7\5\2\2FJ\7$\2\2GI\5\22\n\2HG\3\2\2\2"+
		"IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7#\2\2NO\7%\2\2O"+
		"\r\3\2\2\2PQ\7\4\2\2QR\5\4\3\2RS\7!\2\2ST\7)\2\2T\17\3\2\2\2UV\7\4\2\2"+
		"VW\5\4\3\2WX\7!\2\2XY\5\4\3\2YZ\7#\2\2Z\21\3\2\2\2[^\5\16\b\2\\^\5\24"+
		"\13\2][\3\2\2\2]\\\3\2\2\2^\23\3\2\2\2_`\5\32\16\2`a\5\4\3\2ab\7!\2\2"+
		"bc\7+\2\2c\25\3\2\2\2de\t\3\2\2e\27\3\2\2\2fg\t\4\2\2g\31\3\2\2\2hi\t"+
		"\5\2\2i\33\3\2\2\2jk\t\6\2\2k\35\3\2\2\2lm\t\7\2\2m\37\3\2\2\2no\t\b\2"+
		"\2o!\3\2\2\2pq\t\t\2\2q#\3\2\2\2rv\7)\2\2sv\7\n\2\2tv\5\4\3\2ur\3\2\2"+
		"\2us\3\2\2\2ut\3\2\2\2v%\3\2\2\2\6*J]u";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}