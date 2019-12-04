// Generated from /home/william/IdeaProjects/TrabalhoCompiladores/src/antlr/JmmParser.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, EXTENDS=2, INT=3, PROTECTED=4, THIS=5, BOOLEAN=6, FALSE=7, 
		NEW=8, PUBLIC=9, TRUE=10, CHAR=11, IMPORT=12, NULL=13, RETURN=14, VOID=15, 
		CLASS=16, IF=17, PACKAGE=18, STATIC=19, WHILE=20, ELSE=21, INSTANCEOF=22, 
		PRIVATE=23, SUPER=24, ATRIBUICAO=25, IGUALDADE=26, OpMaior=27, INCREMENTO=28, 
		AND=29, OR=30, OpMenorIgual=31, OpNegacao=32, SUBITRACAO=33, DECREMENTO=34, 
		ADICAO=35, OpSomaAtribuicao=36, MULTIPLICACAO=37, Virgula=38, Ponto=39, 
		AC=40, AbreChave=41, AP=42, FP=43, FechaChave=44, FC=45, PontVirgula=46, 
		ID=47, Int=48, StringLiteral=49, NEWLINE=50, WS=51, COMMENT=52;
	public static final int
		RULE_compilationUnit = 0, RULE_qualifiedIdentifier = 1, RULE_typeDeclaration = 2, 
		RULE_modifiers = 3, RULE_classDeclaration = 4, RULE_classBody = 5, RULE_memberDecl = 6, 
		RULE_block = 7, RULE_blockStatement = 8, RULE_statement = 9, RULE_formalParameters = 10, 
		RULE_formalParameter = 11, RULE_parExpression = 12, RULE_localVariableDeclarationStatement = 13, 
		RULE_variableDeclarators = 14, RULE_variableDeclarator = 15, RULE_variableInitializer = 16, 
		RULE_arrayInitializer = 17, RULE_arguments = 18, RULE_type = 19, RULE_basicType = 20, 
		RULE_referenceType = 21, RULE_statementExpression = 22, RULE_expression = 23, 
		RULE_assignmentExpression = 24, RULE_conditionalAndExpression = 25, RULE_equalityExpression = 26, 
		RULE_relationalExpression = 27, RULE_additiveExpression = 28, RULE_multiplicativeExpression = 29, 
		RULE_unaryExpression = 30, RULE_simpleUnaryExpression = 31, RULE_postfixExpression = 32, 
		RULE_selector = 33, RULE_primary = 34, RULE_creator = 35, RULE_newArrayDeclarator = 36, 
		RULE_literal = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "qualifiedIdentifier", "typeDeclaration", "modifiers", 
			"classDeclaration", "classBody", "memberDecl", "block", "blockStatement", 
			"statement", "formalParameters", "formalParameter", "parExpression", 
			"localVariableDeclarationStatement", "variableDeclarators", "variableDeclarator", 
			"variableInitializer", "arrayInitializer", "arguments", "type", "basicType", 
			"referenceType", "statementExpression", "expression", "assignmentExpression", 
			"conditionalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"simpleUnaryExpression", "postfixExpression", "selector", "primary", 
			"creator", "newArrayDeclarator", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'extends'", "'int'", "'protected'", "'this'", "'boolean'", 
			"'false'", "'new'", "'public'", "'true'", "'char'", "'import'", "'null'", 
			"'return'", "'void'", "'class'", "'if'", "'package'", "'static'", "'while'", 
			"'else'", "'instanceof'", "'private'", "'super'", "'='", "'=='", "'>'", 
			"'++'", "'&&'", "'||'", "'<='", "'!'", "'-'", "'--'", "'+'", "'+='", 
			"'*'", "','", "'.'", "'['", "'{'", "'('", "')'", "'}'", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "EXTENDS", "INT", "PROTECTED", "THIS", "BOOLEAN", "FALSE", 
			"NEW", "PUBLIC", "TRUE", "CHAR", "IMPORT", "NULL", "RETURN", "VOID", 
			"CLASS", "IF", "PACKAGE", "STATIC", "WHILE", "ELSE", "INSTANCEOF", "PRIVATE", 
			"SUPER", "ATRIBUICAO", "IGUALDADE", "OpMaior", "INCREMENTO", "AND", "OR", 
			"OpMenorIgual", "OpNegacao", "SUBITRACAO", "DECREMENTO", "ADICAO", "OpSomaAtribuicao", 
			"MULTIPLICACAO", "Virgula", "Ponto", "AC", "AbreChave", "AP", "FP", "FechaChave", 
			"FC", "PontVirgula", "ID", "Int", "StringLiteral", "NEWLINE", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "JmmParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JmmParser.EOF, 0); }
		public TerminalNode PACKAGE() { return getToken(JmmParser.PACKAGE, 0); }
		public List<QualifiedIdentifierContext> qualifiedIdentifier() {
			return getRuleContexts(QualifiedIdentifierContext.class);
		}
		public QualifiedIdentifierContext qualifiedIdentifier(int i) {
			return getRuleContext(QualifiedIdentifierContext.class,i);
		}
		public List<TerminalNode> PontVirgula() { return getTokens(JmmParser.PontVirgula); }
		public TerminalNode PontVirgula(int i) {
			return getToken(JmmParser.PontVirgula, i);
		}
		public List<TerminalNode> IMPORT() { return getTokens(JmmParser.IMPORT); }
		public TerminalNode IMPORT(int i) {
			return getToken(JmmParser.IMPORT, i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(76);
				match(PACKAGE);
				setState(77);
				qualifiedIdentifier();
				setState(78);
				match(PontVirgula);
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(82);
				match(IMPORT);
				setState(83);
				qualifiedIdentifier();
				setState(84);
				match(PontVirgula);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << PRIVATE))) != 0)) {
				{
				{
				setState(91);
				typeDeclaration();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(EOF);
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

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JmmParser.ID, i);
		}
		public List<TerminalNode> Ponto() { return getTokens(JmmParser.Ponto); }
		public TerminalNode Ponto(int i) {
			return getToken(JmmParser.Ponto, i);
		}
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterQualifiedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitQualifiedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitQualifiedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					match(Ponto);
					setState(101);
					match(ID);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			modifiers();
			setState(108);
			classDeclaration();
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

	public static class ModifiersContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JmmParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JmmParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JmmParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JmmParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JmmParser.ABSTRACT, 0); }
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << PRIVATE))) != 0)) ) {
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JmmParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(JmmParser.ID, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JmmParser.EXTENDS, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(CLASS);
			setState(113);
			match(ID);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(114);
				match(EXTENDS);
				setState(115);
				qualifiedIdentifier();
				}
			}

			setState(118);
			classBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode AbreChave() { return getToken(JmmParser.AbreChave, 0); }
		public TerminalNode FechaChave() { return getToken(JmmParser.FechaChave, 0); }
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public List<MemberDeclContext> memberDecl() {
			return getRuleContexts(MemberDeclContext.class);
		}
		public MemberDeclContext memberDecl(int i) {
			return getRuleContext(MemberDeclContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(AbreChave);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << PRIVATE))) != 0)) {
				{
				{
				setState(121);
				modifiers();
				setState(122);
				memberDecl();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(FechaChave);
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

	public static class MemberDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JmmParser.ID, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JmmParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PontVirgula() { return getToken(JmmParser.PontVirgula, 0); }
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitMemberDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_memberDecl);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(ID);
				setState(132);
				formalParameters();
				setState(133);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(135);
					match(VOID);
					}
					break;
				case INT:
				case BOOLEAN:
				case CHAR:
				case ID:
					{
					setState(136);
					type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139);
				match(ID);
				setState(140);
				formalParameters();
				setState(143);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AbreChave:
					{
					setState(141);
					block();
					}
					break;
				case PontVirgula:
					{
					setState(142);
					match(PontVirgula);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				type();
				setState(146);
				variableDeclarators();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode AbreChave() { return getToken(JmmParser.AbreChave, 0); }
		public TerminalNode FechaChave() { return getToken(JmmParser.FechaChave, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(AbreChave);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << THIS) | (1L << BOOLEAN) | (1L << FALSE) | (1L << NEW) | (1L << TRUE) | (1L << CHAR) | (1L << NULL) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << SUPER) | (1L << INCREMENTO) | (1L << OpNegacao) | (1L << DECREMENTO) | (1L << AbreChave) | (1L << AP) | (1L << PontVirgula) | (1L << ID) | (1L << Int) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(151);
				blockStatement();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(FechaChave);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockStatement);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				statement();
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(JmmParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JmmParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(JmmParser.WHILE, 0); }
		public TerminalNode RETURN() { return getToken(JmmParser.RETURN, 0); }
		public TerminalNode PontVirgula() { return getToken(JmmParser.PontVirgula, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AbreChave:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(IF);
				setState(165);
				parExpression();
				setState(166);
				statement();
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(167);
					match(ELSE);
					setState(168);
					statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(WHILE);
				setState(172);
				parExpression();
				setState(173);
				statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				match(RETURN);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << FALSE) | (1L << NEW) | (1L << TRUE) | (1L << NULL) | (1L << SUPER) | (1L << INCREMENTO) | (1L << OpNegacao) | (1L << DECREMENTO) | (1L << AP) | (1L << ID) | (1L << Int) | (1L << StringLiteral))) != 0)) {
					{
					setState(176);
					expression();
					}
				}

				setState(179);
				match(PontVirgula);
				}
				break;
			case PontVirgula:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				match(PontVirgula);
				}
				break;
			case THIS:
			case FALSE:
			case NEW:
			case TRUE:
			case NULL:
			case SUPER:
			case INCREMENTO:
			case OpNegacao:
			case DECREMENTO:
			case AP:
			case ID:
			case Int:
			case StringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				statementExpression();
				setState(182);
				match(PontVirgula);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(JmmParser.AP, 0); }
		public TerminalNode FP() { return getToken(JmmParser.FP, 0); }
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> Virgula() { return getTokens(JmmParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(JmmParser.Virgula, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(AP);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << CHAR) | (1L << ID))) != 0)) {
				{
				setState(187);
				formalParameter();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Virgula) {
					{
					{
					setState(188);
					match(Virgula);
					setState(189);
					formalParameter();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(197);
			match(FP);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JmmParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			type();
			setState(200);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(JmmParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JmmParser.FP, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(AP);
			setState(203);
			expression();
			setState(204);
			match(FP);
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode PontVirgula() { return getToken(JmmParser.PontVirgula, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			type();
			setState(207);
			variableDeclarators();
			setState(208);
			match(PontVirgula);
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> Virgula() { return getTokens(JmmParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(JmmParser.Virgula, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			variableDeclarator();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Virgula) {
				{
				{
				setState(211);
				match(Virgula);
				setState(212);
				variableDeclarator();
				}
				}
				setState(217);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JmmParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(JmmParser.ATRIBUICAO, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ID);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIBUICAO) {
				{
				setState(219);
				match(ATRIBUICAO);
				setState(220);
				variableInitializer();
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableInitializer);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AbreChave:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				arrayInitializer();
				}
				break;
			case THIS:
			case FALSE:
			case NEW:
			case TRUE:
			case NULL:
			case SUPER:
			case INCREMENTO:
			case OpNegacao:
			case DECREMENTO:
			case AP:
			case ID:
			case Int:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				expression();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode AbreChave() { return getToken(JmmParser.AbreChave, 0); }
		public TerminalNode FechaChave() { return getToken(JmmParser.FechaChave, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> Virgula() { return getTokens(JmmParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(JmmParser.Virgula, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(AbreChave);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << FALSE) | (1L << NEW) | (1L << TRUE) | (1L << NULL) | (1L << SUPER) | (1L << INCREMENTO) | (1L << OpNegacao) | (1L << DECREMENTO) | (1L << AbreChave) | (1L << AP) | (1L << ID) | (1L << Int) | (1L << StringLiteral))) != 0)) {
				{
				setState(228);
				variableInitializer();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Virgula) {
					{
					{
					setState(229);
					match(Virgula);
					setState(230);
					variableInitializer();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(238);
			match(FechaChave);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(JmmParser.AP, 0); }
		public TerminalNode FP() { return getToken(JmmParser.FP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Virgula() { return getTokens(JmmParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(JmmParser.Virgula, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(AP);
			{
			setState(241);
			expression();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Virgula) {
				{
				{
				setState(242);
				match(Virgula);
				setState(243);
				expression();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(249);
			match(FP);
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

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				basicType();
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

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JmmParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JmmParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(JmmParser.INT, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << CHAR))) != 0)) ) {
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public List<TerminalNode> AC() { return getTokens(JmmParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(JmmParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(JmmParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(JmmParser.FC, i);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_referenceType);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOLEAN:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				basicType();
				setState(258);
				match(AC);
				setState(259);
				match(FC);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AC) {
					{
					setState(260);
					match(AC);
					setState(261);
					match(FC);
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				qualifiedIdentifier();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AC) {
					{
					setState(265);
					match(AC);
					setState(266);
					match(FC);
					}
				}

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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			assignmentExpression();
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(JmmParser.ATRIBUICAO, 0); }
		public TerminalNode OpSomaAtribuicao() { return getToken(JmmParser.OpSomaAtribuicao, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			conditionalAndExpression();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIBUICAO || _la==OpSomaAtribuicao) {
				{
				setState(276);
				_la = _input.LA(1);
				if ( !(_la==ATRIBUICAO || _la==OpSomaAtribuicao) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(277);
				assignmentExpression();
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(JmmParser.AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			equalityExpression();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(281);
				match(AND);
				setState(282);
				equalityExpression();
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public TerminalNode IGUALDADE() { return getToken(JmmParser.IGUALDADE, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			relationalExpression();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUALDADE) {
				{
				setState(286);
				match(IGUALDADE);
				setState(287);
				relationalExpression();
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode INSTANCEOF() { return getToken(JmmParser.INSTANCEOF, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode OpMaior() { return getToken(JmmParser.OpMaior, 0); }
		public TerminalNode OpMenorIgual() { return getToken(JmmParser.OpMenorIgual, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			additiveExpression();
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpMaior:
			case OpMenorIgual:
				{
				setState(291);
				_la = _input.LA(1);
				if ( !(_la==OpMaior || _la==OpMenorIgual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(292);
				additiveExpression();
				}
				break;
			case INSTANCEOF:
				{
				setState(293);
				match(INSTANCEOF);
				setState(294);
				referenceType();
				}
				break;
			case ABSTRACT:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case PRIVATE:
			case ATRIBUICAO:
			case IGUALDADE:
			case AND:
			case OpSomaAtribuicao:
			case Virgula:
			case FP:
			case FechaChave:
			case FC:
			case PontVirgula:
				break;
			default:
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public TerminalNode ADICAO() { return getToken(JmmParser.ADICAO, 0); }
		public TerminalNode SUBITRACAO() { return getToken(JmmParser.SUBITRACAO, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			multiplicativeExpression();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBITRACAO || _la==ADICAO) {
				{
				setState(298);
				_la = _input.LA(1);
				if ( !(_la==SUBITRACAO || _la==ADICAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(299);
				multiplicativeExpression();
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public TerminalNode MULTIPLICACAO() { return getToken(JmmParser.MULTIPLICACAO, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			unaryExpression();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICACAO) {
				{
				setState(303);
				match(MULTIPLICACAO);
				setState(304);
				unaryExpression();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode INCREMENTO() { return getToken(JmmParser.INCREMENTO, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DECREMENTO() { return getToken(JmmParser.DECREMENTO, 0); }
		public SimpleUnaryExpressionContext simpleUnaryExpression() {
			return getRuleContext(SimpleUnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unaryExpression);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(INCREMENTO);
				setState(308);
				unaryExpression();
				}
				break;
			case DECREMENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(DECREMENTO);
				setState(310);
				unaryExpression();
				}
				break;
			case THIS:
			case FALSE:
			case NEW:
			case TRUE:
			case NULL:
			case SUPER:
			case OpNegacao:
			case AP:
			case ID:
			case Int:
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				simpleUnaryExpression();
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

	public static class SimpleUnaryExpressionContext extends ParserRuleContext {
		public TerminalNode OpNegacao() { return getToken(JmmParser.OpNegacao, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode AP() { return getToken(JmmParser.AP, 0); }
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode FP() { return getToken(JmmParser.FP, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public SimpleUnaryExpressionContext simpleUnaryExpression() {
			return getRuleContext(SimpleUnaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public SimpleUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterSimpleUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitSimpleUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitSimpleUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleUnaryExpressionContext simpleUnaryExpression() throws RecognitionException {
		SimpleUnaryExpressionContext _localctx = new SimpleUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simpleUnaryExpression);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(OpNegacao);
				setState(315);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(AP);
				setState(317);
				basicType();
				setState(318);
				match(FP);
				setState(319);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(AP);
				setState(322);
				referenceType();
				setState(323);
				match(FP);
				setState(324);
				simpleUnaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				postfixExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode INCREMENTO() { return getToken(JmmParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(JmmParser.DECREMENTO, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			primary();
			{
			setState(330);
			selector();
			}
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREMENTO || _la==DECREMENTO) {
				{
				setState(331);
				_la = _input.LA(1);
				if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode Ponto() { return getToken(JmmParser.Ponto, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode AC() { return getToken(JmmParser.AC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FC() { return getToken(JmmParser.FC, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_selector);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ponto:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(Ponto);
				setState(335);
				qualifiedIdentifier();
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AP) {
					{
					setState(336);
					arguments();
					}
				}

				}
				break;
			case AC:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(AC);
				setState(340);
				expression();
				setState(341);
				match(FC);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JmmParser.THIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JmmParser.SUPER, 0); }
		public TerminalNode Ponto() { return getToken(JmmParser.Ponto, 0); }
		public TerminalNode ID() { return getToken(JmmParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JmmParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primary);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(THIS);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AP) {
					{
					setState(347);
					arguments();
					}
				}

				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				match(SUPER);
				setState(357);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AP:
					{
					setState(351);
					arguments();
					}
					break;
				case Ponto:
					{
					setState(352);
					match(Ponto);
					setState(353);
					match(ID);
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AP) {
						{
						setState(354);
						arguments();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case FALSE:
			case TRUE:
			case NULL:
			case Int:
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				literal();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				match(NEW);
				setState(361);
				creator();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				qualifiedIdentifier();
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AP) {
					{
					setState(363);
					arguments();
					}
				}

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

	public static class CreatorContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> AC() { return getTokens(JmmParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(JmmParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(JmmParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(JmmParser.FC, i);
		}
		public NewArrayDeclaratorContext newArrayDeclarator() {
			return getRuleContext(NewArrayDeclaratorContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_creator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOLEAN:
			case CHAR:
				{
				setState(368);
				basicType();
				}
				break;
			case ID:
				{
				setState(369);
				qualifiedIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(372);
				arguments();
				}
				break;
			case 2:
				{
				setState(373);
				match(AC);
				setState(374);
				match(FC);
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(375);
					match(AC);
					setState(376);
					match(FC);
					}
					break;
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AbreChave) {
					{
					setState(379);
					arrayInitializer();
					}
				}

				}
				break;
			case 3:
				{
				setState(382);
				newArrayDeclarator();
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

	public static class NewArrayDeclaratorContext extends ParserRuleContext {
		public List<TerminalNode> AC() { return getTokens(JmmParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(JmmParser.AC, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> FC() { return getTokens(JmmParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(JmmParser.FC, i);
		}
		public NewArrayDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newArrayDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterNewArrayDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitNewArrayDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitNewArrayDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewArrayDeclaratorContext newArrayDeclarator() throws RecognitionException {
		NewArrayDeclaratorContext _localctx = new NewArrayDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_newArrayDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(AC);
			setState(386);
			expression();
			setState(387);
			match(FC);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(388);
				match(AC);
				setState(389);
				expression();
				setState(390);
				match(FC);
				}
				break;
			}
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(394);
				match(AC);
				setState(395);
				match(FC);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(JmmParser.Int, 0); }
		public TerminalNode StringLiteral() { return getToken(JmmParser.StringLiteral, 0); }
		public TerminalNode TRUE() { return getToken(JmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JmmParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JmmParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << TRUE) | (1L << NULL) | (1L << Int) | (1L << StringLiteral))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0193\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\5\2S\n\2\3"+
		"\2\3\2\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\7\3i\n\3\f\3\16\3l\13\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\5\6w\n\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\3\b\3\b\5\b\u0092"+
		"\n\b\3\b\3\b\3\b\5\b\u0097\n\b\3\t\3\t\7\t\u009b\n\t\f\t\16\t\u009e\13"+
		"\t\3\t\3\t\3\n\3\n\5\n\u00a4\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ac"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b4\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00bb\n\13\3\f\3\f\3\f\3\f\7\f\u00c1\n\f\f\f\16\f\u00c4\13"+
		"\f\5\f\u00c6\n\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\7\20\u00d8\n\20\f\20\16\20\u00db\13\20\3\21\3\21"+
		"\3\21\5\21\u00e0\n\21\3\22\3\22\5\22\u00e4\n\22\3\23\3\23\3\23\3\23\7"+
		"\23\u00ea\n\23\f\23\16\23\u00ed\13\23\5\23\u00ef\n\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\7\24\u00f7\n\24\f\24\16\24\u00fa\13\24\3\24\3\24\3\25\3"+
		"\25\5\25\u0100\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u0109\n\27"+
		"\3\27\3\27\3\27\5\27\u010e\n\27\5\27\u0110\n\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\32\5\32\u0119\n\32\3\33\3\33\3\33\5\33\u011e\n\33\3\34\3\34"+
		"\3\34\5\34\u0123\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u012a\n\35\3\36\3"+
		"\36\3\36\5\36\u012f\n\36\3\37\3\37\3\37\5\37\u0134\n\37\3 \3 \3 \3 \3"+
		" \5 \u013b\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u014a\n!\3\"\3"+
		"\"\3\"\5\"\u014f\n\"\3#\3#\3#\5#\u0154\n#\3#\3#\3#\3#\5#\u015a\n#\3$\3"+
		"$\3$\5$\u015f\n$\3$\3$\3$\3$\3$\5$\u0166\n$\5$\u0168\n$\3$\3$\3$\3$\3"+
		"$\5$\u016f\n$\5$\u0171\n$\3%\3%\5%\u0175\n%\3%\3%\3%\3%\3%\5%\u017c\n"+
		"%\3%\5%\u017f\n%\3%\5%\u0182\n%\3&\3&\3&\3&\3&\3&\3&\5&\u018b\n&\3&\3"+
		"&\5&\u018f\n&\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJL\2\t\7\2\3\3\6\6\13\13\25\25\31\31\5\2"+
		"\5\5\b\b\r\r\4\2\33\33&&\4\2\35\35!!\4\2##%%\4\2\36\36$$\6\2\t\t\f\f\17"+
		"\17\62\63\2\u01aa\2R\3\2\2\2\4e\3\2\2\2\6m\3\2\2\2\bp\3\2\2\2\nr\3\2\2"+
		"\2\fz\3\2\2\2\16\u0096\3\2\2\2\20\u0098\3\2\2\2\22\u00a3\3\2\2\2\24\u00ba"+
		"\3\2\2\2\26\u00bc\3\2\2\2\30\u00c9\3\2\2\2\32\u00cc\3\2\2\2\34\u00d0\3"+
		"\2\2\2\36\u00d4\3\2\2\2 \u00dc\3\2\2\2\"\u00e3\3\2\2\2$\u00e5\3\2\2\2"+
		"&\u00f2\3\2\2\2(\u00ff\3\2\2\2*\u0101\3\2\2\2,\u010f\3\2\2\2.\u0111\3"+
		"\2\2\2\60\u0113\3\2\2\2\62\u0115\3\2\2\2\64\u011a\3\2\2\2\66\u011f\3\2"+
		"\2\28\u0124\3\2\2\2:\u012b\3\2\2\2<\u0130\3\2\2\2>\u013a\3\2\2\2@\u0149"+
		"\3\2\2\2B\u014b\3\2\2\2D\u0159\3\2\2\2F\u0170\3\2\2\2H\u0174\3\2\2\2J"+
		"\u0183\3\2\2\2L\u0190\3\2\2\2NO\7\24\2\2OP\5\4\3\2PQ\7\60\2\2QS\3\2\2"+
		"\2RN\3\2\2\2RS\3\2\2\2SZ\3\2\2\2TU\7\16\2\2UV\5\4\3\2VW\7\60\2\2WY\3\2"+
		"\2\2XT\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[`\3\2\2\2\\Z\3\2\2\2]_\5"+
		"\6\4\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7"+
		"\2\2\3d\3\3\2\2\2ej\7\61\2\2fg\7)\2\2gi\7\61\2\2hf\3\2\2\2il\3\2\2\2j"+
		"h\3\2\2\2jk\3\2\2\2k\5\3\2\2\2lj\3\2\2\2mn\5\b\5\2no\5\n\6\2o\7\3\2\2"+
		"\2pq\t\2\2\2q\t\3\2\2\2rs\7\22\2\2sv\7\61\2\2tu\7\4\2\2uw\5\4\3\2vt\3"+
		"\2\2\2vw\3\2\2\2wx\3\2\2\2xy\5\f\7\2y\13\3\2\2\2z\u0080\7+\2\2{|\5\b\5"+
		"\2|}\5\16\b\2}\177\3\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084"+
		"\7.\2\2\u0084\r\3\2\2\2\u0085\u0086\7\61\2\2\u0086\u0087\5\26\f\2\u0087"+
		"\u0088\5\20\t\2\u0088\u0097\3\2\2\2\u0089\u008c\7\21\2\2\u008a\u008c\5"+
		"(\25\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\7\61\2\2\u008e\u0091\5\26\f\2\u008f\u0092\5\20\t\2\u0090\u0092"+
		"\7\60\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0097\3\2\2\2"+
		"\u0093\u0094\5(\25\2\u0094\u0095\5\36\20\2\u0095\u0097\3\2\2\2\u0096\u0085"+
		"\3\2\2\2\u0096\u008b\3\2\2\2\u0096\u0093\3\2\2\2\u0097\17\3\2\2\2\u0098"+
		"\u009c\7+\2\2\u0099\u009b\5\22\n\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\7.\2\2\u00a0\21\3\2\2\2\u00a1\u00a4\5\34\17"+
		"\2\u00a2\u00a4\5\24\13\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\23\3\2\2\2\u00a5\u00bb\5\20\t\2\u00a6\u00a7\7\23\2\2\u00a7\u00a8\5\32"+
		"\16\2\u00a8\u00ab\5\24\13\2\u00a9\u00aa\7\27\2\2\u00aa\u00ac\5\24\13\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00bb\3\2\2\2\u00ad\u00ae"+
		"\7\26\2\2\u00ae\u00af\5\32\16\2\u00af\u00b0\5\24\13\2\u00b0\u00bb\3\2"+
		"\2\2\u00b1\u00b3\7\20\2\2\u00b2\u00b4\5\60\31\2\u00b3\u00b2\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00bb\7\60\2\2\u00b6\u00bb\7"+
		"\60\2\2\u00b7\u00b8\5.\30\2\u00b8\u00b9\7\60\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00a5\3\2\2\2\u00ba\u00a6\3\2\2\2\u00ba\u00ad\3\2\2\2\u00ba\u00b1\3\2"+
		"\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\25\3\2\2\2\u00bc\u00c5"+
		"\7,\2\2\u00bd\u00c2\5\30\r\2\u00be\u00bf\7(\2\2\u00bf\u00c1\5\30\r\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8\27\3\2\2\2"+
		"\u00c9\u00ca\5(\25\2\u00ca\u00cb\7\61\2\2\u00cb\31\3\2\2\2\u00cc\u00cd"+
		"\7,\2\2\u00cd\u00ce\5\60\31\2\u00ce\u00cf\7-\2\2\u00cf\33\3\2\2\2\u00d0"+
		"\u00d1\5(\25\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\7\60\2\2\u00d3\35\3\2"+
		"\2\2\u00d4\u00d9\5 \21\2\u00d5\u00d6\7(\2\2\u00d6\u00d8\5 \21\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\37\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00df\7\61\2\2\u00dd\u00de"+
		"\7\33\2\2\u00de\u00e0\5\"\22\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2"+
		"\u00e0!\3\2\2\2\u00e1\u00e4\5$\23\2\u00e2\u00e4\5\60\31\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4#\3\2\2\2\u00e5\u00ee\7+\2\2\u00e6\u00eb"+
		"\5\"\22\2\u00e7\u00e8\7(\2\2\u00e8\u00ea\5\"\22\2\u00e9\u00e7\3\2\2\2"+
		"\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\7.\2\2\u00f1%\3\2\2\2\u00f2\u00f3\7,\2\2\u00f3"+
		"\u00f8\5\60\31\2\u00f4\u00f5\7(\2\2\u00f5\u00f7\5\60\31\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7-\2\2\u00fc\'\3\2\2\2"+
		"\u00fd\u0100\5,\27\2\u00fe\u0100\5*\26\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe"+
		"\3\2\2\2\u0100)\3\2\2\2\u0101\u0102\t\3\2\2\u0102+\3\2\2\2\u0103\u0104"+
		"\5*\26\2\u0104\u0105\7*\2\2\u0105\u0108\7/\2\2\u0106\u0107\7*\2\2\u0107"+
		"\u0109\7/\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0110\3\2"+
		"\2\2\u010a\u010d\5\4\3\2\u010b\u010c\7*\2\2\u010c\u010e\7/\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0103\3\2\2\2\u010f"+
		"\u010a\3\2\2\2\u0110-\3\2\2\2\u0111\u0112\5\60\31\2\u0112/\3\2\2\2\u0113"+
		"\u0114\5\62\32\2\u0114\61\3\2\2\2\u0115\u0118\5\64\33\2\u0116\u0117\t"+
		"\4\2\2\u0117\u0119\5\62\32\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\63\3\2\2\2\u011a\u011d\5\66\34\2\u011b\u011c\7\37\2\2\u011c\u011e\5\66"+
		"\34\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\65\3\2\2\2\u011f\u0122"+
		"\58\35\2\u0120\u0121\7\34\2\2\u0121\u0123\58\35\2\u0122\u0120\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\67\3\2\2\2\u0124\u0129\5:\36\2\u0125\u0126"+
		"\t\5\2\2\u0126\u012a\5:\36\2\u0127\u0128\7\30\2\2\u0128\u012a\5,\27\2"+
		"\u0129\u0125\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a9\3"+
		"\2\2\2\u012b\u012e\5<\37\2\u012c\u012d\t\6\2\2\u012d\u012f\5<\37\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f;\3\2\2\2\u0130\u0133\5> \2\u0131"+
		"\u0132\7\'\2\2\u0132\u0134\5> \2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2"+
		"\2\u0134=\3\2\2\2\u0135\u0136\7\36\2\2\u0136\u013b\5> \2\u0137\u0138\7"+
		"$\2\2\u0138\u013b\5> \2\u0139\u013b\5@!\2\u013a\u0135\3\2\2\2\u013a\u0137"+
		"\3\2\2\2\u013a\u0139\3\2\2\2\u013b?\3\2\2\2\u013c\u013d\7\"\2\2\u013d"+
		"\u014a\5> \2\u013e\u013f\7,\2\2\u013f\u0140\5*\26\2\u0140\u0141\7-\2\2"+
		"\u0141\u0142\5> \2\u0142\u014a\3\2\2\2\u0143\u0144\7,\2\2\u0144\u0145"+
		"\5,\27\2\u0145\u0146\7-\2\2\u0146\u0147\5@!\2\u0147\u014a\3\2\2\2\u0148"+
		"\u014a\5B\"\2\u0149\u013c\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u0143\3\2"+
		"\2\2\u0149\u0148\3\2\2\2\u014aA\3\2\2\2\u014b\u014c\5F$\2\u014c\u014e"+
		"\5D#\2\u014d\u014f\t\7\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"C\3\2\2\2\u0150\u0151\7)\2\2\u0151\u0153\5\4\3\2\u0152\u0154\5&\24\2\u0153"+
		"\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u015a\3\2\2\2\u0155\u0156\7*"+
		"\2\2\u0156\u0157\5\60\31\2\u0157\u0158\7/\2\2\u0158\u015a\3\2\2\2\u0159"+
		"\u0150\3\2\2\2\u0159\u0155\3\2\2\2\u015aE\3\2\2\2\u015b\u0171\5\32\16"+
		"\2\u015c\u015e\7\7\2\2\u015d\u015f\5&\24\2\u015e\u015d\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0171\3\2\2\2\u0160\u0167\7\32\2\2\u0161\u0168\5&\24\2"+
		"\u0162\u0163\7)\2\2\u0163\u0165\7\61\2\2\u0164\u0166\5&\24\2\u0165\u0164"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0161\3\2\2\2\u0167"+
		"\u0162\3\2\2\2\u0168\u0171\3\2\2\2\u0169\u0171\5L\'\2\u016a\u016b\7\n"+
		"\2\2\u016b\u0171\5H%\2\u016c\u016e\5\4\3\2\u016d\u016f\5&\24\2\u016e\u016d"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u015b\3\2\2\2\u0170"+
		"\u015c\3\2\2\2\u0170\u0160\3\2\2\2\u0170\u0169\3\2\2\2\u0170\u016a\3\2"+
		"\2\2\u0170\u016c\3\2\2\2\u0171G\3\2\2\2\u0172\u0175\5*\26\2\u0173\u0175"+
		"\5\4\3\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175\u0181\3\2\2\2\u0176"+
		"\u0182\5&\24\2\u0177\u0178\7*\2\2\u0178\u017b\7/\2\2\u0179\u017a\7*\2"+
		"\2\u017a\u017c\7/\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e"+
		"\3\2\2\2\u017d\u017f\5$\23\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u0182\5J&\2\u0181\u0176\3\2\2\2\u0181\u0177\3\2\2"+
		"\2\u0181\u0180\3\2\2\2\u0182I\3\2\2\2\u0183\u0184\7*\2\2\u0184\u0185\5"+
		"\60\31\2\u0185\u018a\7/\2\2\u0186\u0187\7*\2\2\u0187\u0188\5\60\31\2\u0188"+
		"\u0189\7/\2\2\u0189\u018b\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018e\3\2\2\2\u018c\u018d\7*\2\2\u018d\u018f\7/\2\2\u018e\u018c"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018fK\3\2\2\2\u0190\u0191\t\b\2\2\u0191"+
		"M\3\2\2\2\62RZ`jv\u0080\u008b\u0091\u0096\u009c\u00a3\u00ab\u00b3\u00ba"+
		"\u00c2\u00c5\u00d9\u00df\u00e3\u00eb\u00ee\u00f8\u00ff\u0108\u010d\u010f"+
		"\u0118\u011d\u0122\u0129\u012e\u0133\u013a\u0149\u014e\u0153\u0159\u015e"+
		"\u0165\u0167\u016e\u0170\u0174\u017b\u017e\u0181\u018a\u018e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}