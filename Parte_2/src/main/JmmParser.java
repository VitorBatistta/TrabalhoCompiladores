// Generated from /home/william/IdeaProjects/TrabalhoCompiladores/src/antlr/JmmParser.g4 by ANTLR 4.7.2
package main;
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
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
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
			setState(91);
			typeDeclaration();
			setState(92);
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
			setState(94);
			match(ID);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					match(Ponto);
					setState(96);
					match(ID);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << PRIVATE))) != 0)) {
				{
				setState(102);
				modifiers();
				}
			}

			setState(105);
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
			setState(107);
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
			setState(109);
			match(CLASS);
			setState(110);
			match(ID);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(111);
				match(EXTENDS);
				setState(112);
				qualifiedIdentifier();
				}
			}

			setState(115);
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
		public List<MemberDeclContext> memberDecl() {
			return getRuleContexts(MemberDeclContext.class);
		}
		public MemberDeclContext memberDecl(int i) {
			return getRuleContext(MemberDeclContext.class,i);
		}
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
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
			setState(117);
			match(AbreChave);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << INT) | (1L << PROTECTED) | (1L << BOOLEAN) | (1L << PUBLIC) | (1L << CHAR) | (1L << VOID) | (1L << STATIC) | (1L << PRIVATE) | (1L << ID))) != 0)) {
				{
				{
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << PRIVATE))) != 0)) {
					{
					setState(118);
					modifiers();
					}
				}

				setState(121);
				memberDecl();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(ID);
				setState(130);
				formalParameters();
				setState(131);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(133);
					match(VOID);
					}
					break;
				case INT:
				case BOOLEAN:
				case CHAR:
				case ID:
					{
					setState(134);
					type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137);
				match(ID);
				setState(138);
				formalParameters();
				setState(141);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AbreChave:
					{
					setState(139);
					block();
					}
					break;
				case PontVirgula:
					{
					setState(140);
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
				setState(143);
				type();
				setState(144);
				variableDeclarators();
				setState(145);
				match(PontVirgula);
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
			setState(149);
			match(AbreChave);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << THIS) | (1L << BOOLEAN) | (1L << FALSE) | (1L << NEW) | (1L << TRUE) | (1L << CHAR) | (1L << NULL) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << SUPER) | (1L << INCREMENTO) | (1L << OpNegacao) | (1L << DECREMENTO) | (1L << AbreChave) | (1L << AP) | (1L << PontVirgula) | (1L << ID) | (1L << Int) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(150);
				blockStatement();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
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
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AbreChave:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(IF);
				setState(164);
				parExpression();
				setState(165);
				statement();
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(166);
					match(ELSE);
					setState(167);
					statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(WHILE);
				setState(171);
				parExpression();
				setState(172);
				statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(RETURN);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << FALSE) | (1L << NEW) | (1L << TRUE) | (1L << NULL) | (1L << SUPER) | (1L << INCREMENTO) | (1L << OpNegacao) | (1L << DECREMENTO) | (1L << AP) | (1L << ID) | (1L << Int) | (1L << StringLiteral))) != 0)) {
					{
					setState(175);
					expression();
					}
				}

				setState(178);
				match(PontVirgula);
				}
				break;
			case PontVirgula:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
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
				setState(180);
				statementExpression();
				setState(181);
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
			setState(185);
			match(AP);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << CHAR) | (1L << ID))) != 0)) {
				{
				setState(186);
				formalParameter();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Virgula) {
					{
					{
					setState(187);
					match(Virgula);
					setState(188);
					formalParameter();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(196);
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
			setState(198);
			type();
			setState(199);
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
			setState(201);
			match(AP);
			setState(202);
			expression();
			setState(203);
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
			setState(205);
			type();
			setState(206);
			variableDeclarators();
			setState(207);
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
			setState(209);
			variableDeclarator();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Virgula) {
				{
				{
				setState(210);
				match(Virgula);
				setState(211);
				variableDeclarator();
				}
				}
				setState(216);
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
			setState(217);
			match(ID);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIBUICAO) {
				{
				setState(218);
				match(ATRIBUICAO);
				setState(219);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(JmmParser.ID, 0); }
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				expression();
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
			setState(228);
			match(AbreChave);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << FALSE) | (1L << NEW) | (1L << TRUE) | (1L << NULL) | (1L << SUPER) | (1L << INCREMENTO) | (1L << OpNegacao) | (1L << DECREMENTO) | (1L << AbreChave) | (1L << AP) | (1L << ID) | (1L << Int) | (1L << StringLiteral))) != 0)) {
				{
				setState(229);
				variableInitializer();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Virgula) {
					{
					{
					setState(230);
					match(Virgula);
					setState(231);
					variableInitializer();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(239);
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
			setState(241);
			match(AP);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << FALSE) | (1L << NEW) | (1L << TRUE) | (1L << NULL) | (1L << SUPER) | (1L << INCREMENTO) | (1L << OpNegacao) | (1L << DECREMENTO) | (1L << AP) | (1L << ID) | (1L << Int) | (1L << StringLiteral))) != 0)) {
				{
				setState(242);
				expression();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Virgula) {
					{
					{
					setState(243);
					match(Virgula);
					setState(244);
					expression();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(252);
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
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
			setState(258);
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
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOLEAN:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				basicType();
				setState(261);
				match(AC);
				setState(262);
				match(FC);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AC) {
					{
					setState(263);
					match(AC);
					setState(264);
					match(FC);
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				qualifiedIdentifier();
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AC) {
					{
					setState(268);
					match(AC);
					setState(269);
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
			setState(274);
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
			setState(276);
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
			setState(278);
			conditionalAndExpression();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIBUICAO || _la==OpSomaAtribuicao) {
				{
				setState(279);
				_la = _input.LA(1);
				if ( !(_la==ATRIBUICAO || _la==OpSomaAtribuicao) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(280);
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
			setState(283);
			equalityExpression();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(284);
				match(AND);
				setState(285);
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
			setState(288);
			relationalExpression();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUALDADE) {
				{
				setState(289);
				match(IGUALDADE);
				setState(290);
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
			setState(293);
			additiveExpression();
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpMaior:
			case OpMenorIgual:
				{
				setState(294);
				_la = _input.LA(1);
				if ( !(_la==OpMaior || _la==OpMenorIgual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(295);
				additiveExpression();
				}
				break;
			case INSTANCEOF:
				{
				setState(296);
				match(INSTANCEOF);
				setState(297);
				referenceType();
				}
				break;
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
			setState(300);
			multiplicativeExpression();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBITRACAO || _la==ADICAO) {
				{
				setState(301);
				_la = _input.LA(1);
				if ( !(_la==SUBITRACAO || _la==ADICAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(302);
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
			setState(305);
			unaryExpression();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICACAO) {
				{
				setState(306);
				match(MULTIPLICACAO);
				setState(307);
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
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(INCREMENTO);
				setState(311);
				unaryExpression();
				}
				break;
			case DECREMENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(DECREMENTO);
				setState(313);
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
				setState(314);
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(OpNegacao);
				setState(318);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(AP);
				setState(320);
				basicType();
				setState(321);
				match(FP);
				setState(322);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(AP);
				setState(325);
				referenceType();
				setState(326);
				match(FP);
				setState(327);
				simpleUnaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
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
			setState(332);
			primary();
			{
			setState(333);
			selector();
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREMENTO || _la==DECREMENTO) {
				{
				setState(334);
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
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ponto:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(Ponto);
				setState(338);
				qualifiedIdentifier();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AP) {
					{
					setState(339);
					arguments();
					}
				}

				}
				break;
			case AC:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(AC);
				setState(343);
				expression();
				setState(344);
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
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(THIS);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AP) {
					{
					setState(350);
					arguments();
					}
				}

				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				match(SUPER);
				setState(360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AP:
					{
					setState(354);
					arguments();
					}
					break;
				case Ponto:
					{
					setState(355);
					match(Ponto);
					setState(356);
					match(ID);
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AP) {
						{
						setState(357);
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
				setState(362);
				literal();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(NEW);
				setState(364);
				creator();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				qualifiedIdentifier();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AP) {
					{
					setState(366);
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
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOLEAN:
			case CHAR:
				{
				setState(371);
				basicType();
				}
				break;
			case ID:
				{
				setState(372);
				qualifiedIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(375);
				arguments();
				}
				break;
			case 2:
				{
				setState(376);
				match(AC);
				setState(377);
				match(FC);
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(378);
					match(AC);
					setState(379);
					match(FC);
					}
					break;
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AbreChave) {
					{
					setState(382);
					arrayInitializer();
					}
				}

				}
				break;
			case 3:
				{
				setState(385);
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
			setState(388);
			match(AC);
			setState(389);
			expression();
			setState(390);
			match(FC);
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(391);
				match(AC);
				setState(392);
				expression();
				setState(393);
				match(FC);
				}
				break;
			}
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(397);
				match(AC);
				setState(398);
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
			setState(401);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0196\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\5\2S\n\2\3"+
		"\2\3\2\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3d\n"+
		"\3\f\3\16\3g\13\3\3\4\5\4j\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6t\n"+
		"\6\3\6\3\6\3\7\3\7\5\7z\n\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u008a\n\b\3\b\3\b\3\b\3\b\5\b\u0090\n\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0096\n\b\3\t\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\3"+
		"\t\3\t\3\n\3\n\5\n\u00a3\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ab"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b3\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00ba\n\13\3\f\3\f\3\f\3\f\7\f\u00c0\n\f\f\f\16\f\u00c3\13"+
		"\f\5\f\u00c5\n\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\7\20\u00d7\n\20\f\20\16\20\u00da\13\20\3\21\3\21"+
		"\3\21\5\21\u00df\n\21\3\22\3\22\3\22\3\22\5\22\u00e5\n\22\3\23\3\23\3"+
		"\23\3\23\7\23\u00eb\n\23\f\23\16\23\u00ee\13\23\5\23\u00f0\n\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\7\24\u00f8\n\24\f\24\16\24\u00fb\13\24\5\24\u00fd"+
		"\n\24\3\24\3\24\3\25\3\25\5\25\u0103\n\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u010c\n\27\3\27\3\27\3\27\5\27\u0111\n\27\5\27\u0113\n\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u011c\n\32\3\33\3\33\3\33\5\33"+
		"\u0121\n\33\3\34\3\34\3\34\5\34\u0126\n\34\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u012d\n\35\3\36\3\36\3\36\5\36\u0132\n\36\3\37\3\37\3\37\5\37\u0137"+
		"\n\37\3 \3 \3 \3 \3 \5 \u013e\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\5!\u014d\n!\3\"\3\"\3\"\5\"\u0152\n\"\3#\3#\3#\5#\u0157\n#\3#\3#\3#"+
		"\3#\5#\u015d\n#\3$\3$\3$\5$\u0162\n$\3$\3$\3$\3$\3$\5$\u0169\n$\5$\u016b"+
		"\n$\3$\3$\3$\3$\3$\5$\u0172\n$\5$\u0174\n$\3%\3%\5%\u0178\n%\3%\3%\3%"+
		"\3%\3%\5%\u017f\n%\3%\5%\u0182\n%\3%\5%\u0185\n%\3&\3&\3&\3&\3&\3&\3&"+
		"\5&\u018e\n&\3&\3&\5&\u0192\n&\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\t\7\2\3\3\6\6\13\13"+
		"\25\25\31\31\5\2\5\5\b\b\r\r\4\2\33\33&&\4\2\35\35!!\4\2##%%\4\2\36\36"+
		"$$\6\2\t\t\f\f\17\17\62\63\2\u01b1\2R\3\2\2\2\4`\3\2\2\2\6i\3\2\2\2\b"+
		"m\3\2\2\2\no\3\2\2\2\fw\3\2\2\2\16\u0095\3\2\2\2\20\u0097\3\2\2\2\22\u00a2"+
		"\3\2\2\2\24\u00b9\3\2\2\2\26\u00bb\3\2\2\2\30\u00c8\3\2\2\2\32\u00cb\3"+
		"\2\2\2\34\u00cf\3\2\2\2\36\u00d3\3\2\2\2 \u00db\3\2\2\2\"\u00e4\3\2\2"+
		"\2$\u00e6\3\2\2\2&\u00f3\3\2\2\2(\u0102\3\2\2\2*\u0104\3\2\2\2,\u0112"+
		"\3\2\2\2.\u0114\3\2\2\2\60\u0116\3\2\2\2\62\u0118\3\2\2\2\64\u011d\3\2"+
		"\2\2\66\u0122\3\2\2\28\u0127\3\2\2\2:\u012e\3\2\2\2<\u0133\3\2\2\2>\u013d"+
		"\3\2\2\2@\u014c\3\2\2\2B\u014e\3\2\2\2D\u015c\3\2\2\2F\u0173\3\2\2\2H"+
		"\u0177\3\2\2\2J\u0186\3\2\2\2L\u0193\3\2\2\2NO\7\24\2\2OP\5\4\3\2PQ\7"+
		"\60\2\2QS\3\2\2\2RN\3\2\2\2RS\3\2\2\2SZ\3\2\2\2TU\7\16\2\2UV\5\4\3\2V"+
		"W\7\60\2\2WY\3\2\2\2XT\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2"+
		"\2\\Z\3\2\2\2]^\5\6\4\2^_\7\2\2\3_\3\3\2\2\2`e\7\61\2\2ab\7)\2\2bd\7\61"+
		"\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\5\3\2\2\2ge\3\2\2\2hj\5"+
		"\b\5\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\5\n\6\2l\7\3\2\2\2mn\t\2\2\2n\t"+
		"\3\2\2\2op\7\22\2\2ps\7\61\2\2qr\7\4\2\2rt\5\4\3\2sq\3\2\2\2st\3\2\2\2"+
		"tu\3\2\2\2uv\5\f\7\2v\13\3\2\2\2w~\7+\2\2xz\5\b\5\2yx\3\2\2\2yz\3\2\2"+
		"\2z{\3\2\2\2{}\5\16\b\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7.\2\2\u0082\r\3\2\2\2"+
		"\u0083\u0084\7\61\2\2\u0084\u0085\5\26\f\2\u0085\u0086\5\20\t\2\u0086"+
		"\u0096\3\2\2\2\u0087\u008a\7\21\2\2\u0088\u008a\5(\25\2\u0089\u0087\3"+
		"\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\61\2\2\u008c"+
		"\u008f\5\26\f\2\u008d\u0090\5\20\t\2\u008e\u0090\7\60\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0096\3\2\2\2\u0091\u0092\5(\25\2\u0092"+
		"\u0093\5\36\20\2\u0093\u0094\7\60\2\2\u0094\u0096\3\2\2\2\u0095\u0083"+
		"\3\2\2\2\u0095\u0089\3\2\2\2\u0095\u0091\3\2\2\2\u0096\17\3\2\2\2\u0097"+
		"\u009b\7+\2\2\u0098\u009a\5\22\n\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\7.\2\2\u009f\21\3\2\2\2\u00a0\u00a3\5\34\17"+
		"\2\u00a1\u00a3\5\24\13\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\23\3\2\2\2\u00a4\u00ba\5\20\t\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7\5\32"+
		"\16\2\u00a7\u00aa\5\24\13\2\u00a8\u00a9\7\27\2\2\u00a9\u00ab\5\24\13\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ba\3\2\2\2\u00ac\u00ad"+
		"\7\26\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00af\5\24\13\2\u00af\u00ba\3\2"+
		"\2\2\u00b0\u00b2\7\20\2\2\u00b1\u00b3\5\60\31\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00ba\7\60\2\2\u00b5\u00ba\7"+
		"\60\2\2\u00b6\u00b7\5.\30\2\u00b7\u00b8\7\60\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00a4\3\2\2\2\u00b9\u00a5\3\2\2\2\u00b9\u00ac\3\2\2\2\u00b9\u00b0\3\2"+
		"\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\25\3\2\2\2\u00bb\u00c4"+
		"\7,\2\2\u00bc\u00c1\5\30\r\2\u00bd\u00be\7(\2\2\u00be\u00c0\5\30\r\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7\27\3\2\2\2"+
		"\u00c8\u00c9\5(\25\2\u00c9\u00ca\7\61\2\2\u00ca\31\3\2\2\2\u00cb\u00cc"+
		"\7,\2\2\u00cc\u00cd\5\60\31\2\u00cd\u00ce\7-\2\2\u00ce\33\3\2\2\2\u00cf"+
		"\u00d0\5(\25\2\u00d0\u00d1\5\36\20\2\u00d1\u00d2\7\60\2\2\u00d2\35\3\2"+
		"\2\2\u00d3\u00d8\5 \21\2\u00d4\u00d5\7(\2\2\u00d5\u00d7\5 \21\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\37\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00de\7\61\2\2\u00dc\u00dd"+
		"\7\33\2\2\u00dd\u00df\5\"\22\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2"+
		"\u00df!\3\2\2\2\u00e0\u00e5\5L\'\2\u00e1\u00e5\7\61\2\2\u00e2\u00e5\5"+
		"$\23\2\u00e3\u00e5\5\60\31\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5#\3\2\2\2\u00e6\u00ef\7+\2\2\u00e7"+
		"\u00ec\5\"\22\2\u00e8\u00e9\7(\2\2\u00e9\u00eb\5\"\22\2\u00ea\u00e8\3"+
		"\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7.\2\2\u00f2%\3\2\2\2\u00f3\u00fc"+
		"\7,\2\2\u00f4\u00f9\5\60\31\2\u00f5\u00f6\7(\2\2\u00f6\u00f8\5\60\31\2"+
		"\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7-\2\2\u00ff\'\3\2\2\2"+
		"\u0100\u0103\5,\27\2\u0101\u0103\5*\26\2\u0102\u0100\3\2\2\2\u0102\u0101"+
		"\3\2\2\2\u0103)\3\2\2\2\u0104\u0105\t\3\2\2\u0105+\3\2\2\2\u0106\u0107"+
		"\5*\26\2\u0107\u0108\7*\2\2\u0108\u010b\7/\2\2\u0109\u010a\7*\2\2\u010a"+
		"\u010c\7/\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0113\3\2"+
		"\2\2\u010d\u0110\5\4\3\2\u010e\u010f\7*\2\2\u010f\u0111\7/\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0106\3\2\2\2\u0112"+
		"\u010d\3\2\2\2\u0113-\3\2\2\2\u0114\u0115\5\60\31\2\u0115/\3\2\2\2\u0116"+
		"\u0117\5\62\32\2\u0117\61\3\2\2\2\u0118\u011b\5\64\33\2\u0119\u011a\t"+
		"\4\2\2\u011a\u011c\5\62\32\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\63\3\2\2\2\u011d\u0120\5\66\34\2\u011e\u011f\7\37\2\2\u011f\u0121\5\66"+
		"\34\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\65\3\2\2\2\u0122\u0125"+
		"\58\35\2\u0123\u0124\7\34\2\2\u0124\u0126\58\35\2\u0125\u0123\3\2\2\2"+
		"\u0125\u0126\3\2\2\2\u0126\67\3\2\2\2\u0127\u012c\5:\36\2\u0128\u0129"+
		"\t\5\2\2\u0129\u012d\5:\36\2\u012a\u012b\7\30\2\2\u012b\u012d\5,\27\2"+
		"\u012c\u0128\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d9\3"+
		"\2\2\2\u012e\u0131\5<\37\2\u012f\u0130\t\6\2\2\u0130\u0132\5<\37\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132;\3\2\2\2\u0133\u0136\5> \2\u0134"+
		"\u0135\7\'\2\2\u0135\u0137\5> \2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2"+
		"\2\u0137=\3\2\2\2\u0138\u0139\7\36\2\2\u0139\u013e\5> \2\u013a\u013b\7"+
		"$\2\2\u013b\u013e\5> \2\u013c\u013e\5@!\2\u013d\u0138\3\2\2\2\u013d\u013a"+
		"\3\2\2\2\u013d\u013c\3\2\2\2\u013e?\3\2\2\2\u013f\u0140\7\"\2\2\u0140"+
		"\u014d\5> \2\u0141\u0142\7,\2\2\u0142\u0143\5*\26\2\u0143\u0144\7-\2\2"+
		"\u0144\u0145\5> \2\u0145\u014d\3\2\2\2\u0146\u0147\7,\2\2\u0147\u0148"+
		"\5,\27\2\u0148\u0149\7-\2\2\u0149\u014a\5@!\2\u014a\u014d\3\2\2\2\u014b"+
		"\u014d\5B\"\2\u014c\u013f\3\2\2\2\u014c\u0141\3\2\2\2\u014c\u0146\3\2"+
		"\2\2\u014c\u014b\3\2\2\2\u014dA\3\2\2\2\u014e\u014f\5F$\2\u014f\u0151"+
		"\5D#\2\u0150\u0152\t\7\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"C\3\2\2\2\u0153\u0154\7)\2\2\u0154\u0156\5\4\3\2\u0155\u0157\5&\24\2\u0156"+
		"\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015d\3\2\2\2\u0158\u0159\7*"+
		"\2\2\u0159\u015a\5\60\31\2\u015a\u015b\7/\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u0153\3\2\2\2\u015c\u0158\3\2\2\2\u015dE\3\2\2\2\u015e\u0174\5\32\16"+
		"\2\u015f\u0161\7\7\2\2\u0160\u0162\5&\24\2\u0161\u0160\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0174\3\2\2\2\u0163\u016a\7\32\2\2\u0164\u016b\5&\24\2"+
		"\u0165\u0166\7)\2\2\u0166\u0168\7\61\2\2\u0167\u0169\5&\24\2\u0168\u0167"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0164\3\2\2\2\u016a"+
		"\u0165\3\2\2\2\u016b\u0174\3\2\2\2\u016c\u0174\5L\'\2\u016d\u016e\7\n"+
		"\2\2\u016e\u0174\5H%\2\u016f\u0171\5\4\3\2\u0170\u0172\5&\24\2\u0171\u0170"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u015e\3\2\2\2\u0173"+
		"\u015f\3\2\2\2\u0173\u0163\3\2\2\2\u0173\u016c\3\2\2\2\u0173\u016d\3\2"+
		"\2\2\u0173\u016f\3\2\2\2\u0174G\3\2\2\2\u0175\u0178\5*\26\2\u0176\u0178"+
		"\5\4\3\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178\u0184\3\2\2\2\u0179"+
		"\u0185\5&\24\2\u017a\u017b\7*\2\2\u017b\u017e\7/\2\2\u017c\u017d\7*\2"+
		"\2\u017d\u017f\7/\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181"+
		"\3\2\2\2\u0180\u0182\5$\23\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0185\5J&\2\u0184\u0179\3\2\2\2\u0184\u017a\3\2\2"+
		"\2\u0184\u0183\3\2\2\2\u0185I\3\2\2\2\u0186\u0187\7*\2\2\u0187\u0188\5"+
		"\60\31\2\u0188\u018d\7/\2\2\u0189\u018a\7*\2\2\u018a\u018b\5\60\31\2\u018b"+
		"\u018c\7/\2\2\u018c\u018e\3\2\2\2\u018d\u0189\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u0191\3\2\2\2\u018f\u0190\7*\2\2\u0190\u0192\7/\2\2\u0191\u018f"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192K\3\2\2\2\u0193\u0194\t\b\2\2\u0194"+
		"M\3\2\2\2\64RZeisy~\u0089\u008f\u0095\u009b\u00a2\u00aa\u00b2\u00b9\u00c1"+
		"\u00c4\u00d8\u00de\u00e4\u00ec\u00ef\u00f9\u00fc\u0102\u010b\u0110\u0112"+
		"\u011b\u0120\u0125\u012c\u0131\u0136\u013d\u014c\u0151\u0156\u015c\u0161"+
		"\u0168\u016a\u0171\u0173\u0177\u017e\u0181\u0184\u018d\u0191";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}