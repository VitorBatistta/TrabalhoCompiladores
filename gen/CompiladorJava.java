// Generated from /home/vitor/IdeaProjects/TrabalhoCompiladores/src/main/CompiladorJava.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompiladorJava extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRIVATE=1, PROTECTED=2, PUBLIC=3, ABSTRACT=4, CLASS=5, EXTENDS=6, FINAL=7, 
		IMPLEMENTS=8, INTERFACE=9, NATIVE=10, NEW=11, STATIC=12, SYNCHRONIZED=13, 
		TRANSIENT=14, VOLATILE=15, BREAK=16, CASE=17, CONTINUE=18, DEFAULT=19, 
		DO=20, ELSE=21, FOR=22, IF=23, INSTANCEOF=24, RETURN=25, SWITCH=26, WHILE=27, 
		CATCH=28, FINALLY=29, THROW=30, THROWS=31, TRY=32, IMPORT=33, PACKAGE=34, 
		BOOLEAN=35, BYTE=36, CHAR=37, DOUBLE=38, FLOAT=39, INT=40, LONG=41, SHORT=42, 
		SUPER=43, VOID=44, CONST=45, GOTO=46, TRUE=47, FALSE=48, NULL=49, ID=50, 
		ADICAO=51, SUBITRACAO=52, MULTIPLICACAO=53, DIVISAO=54, RESTO=55, IGUALDADE=56, 
		DIFERENÇA=57, MAIOR=58, MENOR=59, MaiorIgual=60, MenorIgual=61, AND=62, 
		OR=63, MultiAtribuicao=64, DivAtribuicao=65, RestoAtribuicao=66, SomaAtribuicao=67, 
		SubAtribuicao=68, ANDAtribuicao=69, XORAtribuicao=70, ORAtribuicao=71, 
		Incremento=72, Decremento=73, AP=74, FP=75, AbreChave=76, FechaChave=77, 
		AC=78, FC=79, Ponto=80, Virgula=81, PontVirgula=82, DoisPonto=83, Interrogacao=84, 
		DIGITOS=85;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRIVATE", "PROTECTED", "PUBLIC", "ABSTRACT", "CLASS", "EXTENDS", "FINAL", 
			"IMPLEMENTS", "INTERFACE", "NATIVE", "NEW", "STATIC", "SYNCHRONIZED", 
			"TRANSIENT", "VOLATILE", "BREAK", "CASE", "CONTINUE", "DEFAULT", "DO", 
			"ELSE", "FOR", "IF", "INSTANCEOF", "RETURN", "SWITCH", "WHILE", "CATCH", 
			"FINALLY", "THROW", "THROWS", "TRY", "IMPORT", "PACKAGE", "BOOLEAN", 
			"BYTE", "CHAR", "DOUBLE", "FLOAT", "INT", "LONG", "SHORT", "SUPER", "VOID", 
			"CONST", "GOTO", "TRUE", "FALSE", "NULL", "ID", "ADICAO", "SUBITRACAO", 
			"MULTIPLICACAO", "DIVISAO", "RESTO", "IGUALDADE", "DIFERENÇA", "MAIOR", 
			"MENOR", "MaiorIgual", "MenorIgual", "AND", "OR", "MultiAtribuicao", 
			"DivAtribuicao", "RestoAtribuicao", "SomaAtribuicao", "SubAtribuicao", 
			"ANDAtribuicao", "XORAtribuicao", "ORAtribuicao", "Incremento", "Decremento", 
			"AP", "FP", "AbreChave", "FechaChave", "AC", "FC", "Ponto", "Virgula", 
			"PontVirgula", "DoisPonto", "Interrogacao", "DIGITOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'private'", "'protected'", "'public'", "'abstract'", "'class'", 
			"'extends'", "'final'", "'implements'", "'interface'", "'native'", "'new'", 
			"'static'", "'synchronized'", "'transient'", "'volatile'", "'break'", 
			"'case'", "'continue'", "'default'", "'do'", "'else'", "'for'", "'if'", 
			"'instanceof'", "'return'", "'switch'", "'while'", "'carch'", "'finally'", 
			"'throw'", "'throws'", "'try'", "'import'", "'package'", "'boolean'", 
			"'byte'", "'char'", "'double'", "'float'", "'int'", "'long'", "'short'", 
			"'super'", "'void'", "'const'", "'goto'", "'true'", "'false'", "'null'", 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'&='", "'^='", "'|='", "'++'", "'--'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'.'", "','", "';'", "':'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRIVATE", "PROTECTED", "PUBLIC", "ABSTRACT", "CLASS", "EXTENDS", 
			"FINAL", "IMPLEMENTS", "INTERFACE", "NATIVE", "NEW", "STATIC", "SYNCHRONIZED", 
			"TRANSIENT", "VOLATILE", "BREAK", "CASE", "CONTINUE", "DEFAULT", "DO", 
			"ELSE", "FOR", "IF", "INSTANCEOF", "RETURN", "SWITCH", "WHILE", "CATCH", 
			"FINALLY", "THROW", "THROWS", "TRY", "IMPORT", "PACKAGE", "BOOLEAN", 
			"BYTE", "CHAR", "DOUBLE", "FLOAT", "INT", "LONG", "SHORT", "SUPER", "VOID", 
			"CONST", "GOTO", "TRUE", "FALSE", "NULL", "ID", "ADICAO", "SUBITRACAO", 
			"MULTIPLICACAO", "DIVISAO", "RESTO", "IGUALDADE", "DIFEREN\u0007A", "MAIOR", 
			"MENOR", "MaiorIgual", "MenorIgual", "AND", "OR", "MultiAtribuicao", 
			"DivAtribuicao", "RestoAtribuicao", "SomaAtribuicao", "SubAtribuicao", 
			"ANDAtribuicao", "XORAtribuicao", "ORAtribuicao", "Incremento", "Decremento", 
			"AP", "FP", "AbreChave", "FechaChave", "AC", "FC", "Ponto", "Virgula", 
			"PontVirgula", "DoisPonto", "Interrogacao", "DIGITOS"
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


	public CompiladorJava(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CompiladorJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2W\u0255\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\5\63\u01f8\n\63\3\63\7\63\u01fb\n\63\f\63\16\63\u01fe\13\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3"+
		"D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3L\3"+
		"L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\2\2W\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\u00abW\3\2\4\6\2&&C\\aac|\7\2&&\62;C\\aac|\2\u0255"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\3\u00ad\3\2\2\2\5\u00b5\3\2\2\2\7\u00bf\3\2\2"+
		"\2\t\u00c6\3\2\2\2\13\u00cf\3\2\2\2\r\u00d5\3\2\2\2\17\u00dd\3\2\2\2\21"+
		"\u00e3\3\2\2\2\23\u00ee\3\2\2\2\25\u00f8\3\2\2\2\27\u00ff\3\2\2\2\31\u0103"+
		"\3\2\2\2\33\u010a\3\2\2\2\35\u0117\3\2\2\2\37\u0121\3\2\2\2!\u012a\3\2"+
		"\2\2#\u0130\3\2\2\2%\u0135\3\2\2\2\'\u013e\3\2\2\2)\u0146\3\2\2\2+\u0149"+
		"\3\2\2\2-\u014e\3\2\2\2/\u0152\3\2\2\2\61\u0155\3\2\2\2\63\u0160\3\2\2"+
		"\2\65\u0167\3\2\2\2\67\u016e\3\2\2\29\u0174\3\2\2\2;\u017a\3\2\2\2=\u0182"+
		"\3\2\2\2?\u0188\3\2\2\2A\u018f\3\2\2\2C\u0193\3\2\2\2E\u019a\3\2\2\2G"+
		"\u01a2\3\2\2\2I\u01aa\3\2\2\2K\u01af\3\2\2\2M\u01b4\3\2\2\2O\u01bb\3\2"+
		"\2\2Q\u01c1\3\2\2\2S\u01c5\3\2\2\2U\u01ca\3\2\2\2W\u01d0\3\2\2\2Y\u01d6"+
		"\3\2\2\2[\u01db\3\2\2\2]\u01e1\3\2\2\2_\u01e6\3\2\2\2a\u01eb\3\2\2\2c"+
		"\u01f1\3\2\2\2e\u01f7\3\2\2\2g\u01ff\3\2\2\2i\u0201\3\2\2\2k\u0203\3\2"+
		"\2\2m\u0205\3\2\2\2o\u0207\3\2\2\2q\u0209\3\2\2\2s\u020c\3\2\2\2u\u020f"+
		"\3\2\2\2w\u0211\3\2\2\2y\u0213\3\2\2\2{\u0216\3\2\2\2}\u0219\3\2\2\2\177"+
		"\u021c\3\2\2\2\u0081\u021f\3\2\2\2\u0083\u0222\3\2\2\2\u0085\u0225\3\2"+
		"\2\2\u0087\u0228\3\2\2\2\u0089\u022b\3\2\2\2\u008b\u022e\3\2\2\2\u008d"+
		"\u0231\3\2\2\2\u008f\u0234\3\2\2\2\u0091\u0237\3\2\2\2\u0093\u023a\3\2"+
		"\2\2\u0095\u023d\3\2\2\2\u0097\u023f\3\2\2\2\u0099\u0241\3\2\2\2\u009b"+
		"\u0243\3\2\2\2\u009d\u0245\3\2\2\2\u009f\u0247\3\2\2\2\u00a1\u0249\3\2"+
		"\2\2\u00a3\u024b\3\2\2\2\u00a5\u024d\3\2\2\2\u00a7\u024f\3\2\2\2\u00a9"+
		"\u0251\3\2\2\2\u00ab\u0253\3\2\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7t\2"+
		"\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\u00b4\7g\2\2\u00b4\4\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7"+
		"\7t\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7e\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7f\2\2"+
		"\u00be\6\3\2\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7d"+
		"\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7e\2\2\u00c5\b"+
		"\3\2\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9\7u\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7e\2\2"+
		"\u00cd\u00ce\7v\2\2\u00ce\n\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7n"+
		"\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7u\2\2\u00d4\f"+
		"\3\2\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7z\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\7g\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7f\2\2\u00db\u00dc\7u\2\2"+
		"\u00dc\16\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7"+
		"p\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7n\2\2\u00e2\20\3\2\2\2\u00e3\u00e4"+
		"\7k\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7n\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7p\2\2"+
		"\u00eb\u00ec\7v\2\2\u00ec\u00ed\7u\2\2\u00ed\22\3\2\2\2\u00ee\u00ef\7"+
		"k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3"+
		"\7t\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7e\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\24\3\2\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7c\2\2\u00fa"+
		"\u00fb\7v\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7x\2\2\u00fd\u00fe\7g\2\2"+
		"\u00fe\26\3\2\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7g\2\2\u0101\u0102\7"+
		"y\2\2\u0102\30\3\2\2\2\u0103\u0104\7u\2\2\u0104\u0105\7v\2\2\u0105\u0106"+
		"\7c\2\2\u0106\u0107\7v\2\2\u0107\u0108\7k\2\2\u0108\u0109\7e\2\2\u0109"+
		"\32\3\2\2\2\u010a\u010b\7u\2\2\u010b\u010c\7{\2\2\u010c\u010d\7p\2\2\u010d"+
		"\u010e\7e\2\2\u010e\u010f\7j\2\2\u010f\u0110\7t\2\2\u0110\u0111\7q\2\2"+
		"\u0111\u0112\7p\2\2\u0112\u0113\7k\2\2\u0113\u0114\7|\2\2\u0114\u0115"+
		"\7g\2\2\u0115\u0116\7f\2\2\u0116\34\3\2\2\2\u0117\u0118\7v\2\2\u0118\u0119"+
		"\7t\2\2\u0119\u011a\7c\2\2\u011a\u011b\7p\2\2\u011b\u011c\7u\2\2\u011c"+
		"\u011d\7k\2\2\u011d\u011e\7g\2\2\u011e\u011f\7p\2\2\u011f\u0120\7v\2\2"+
		"\u0120\36\3\2\2\2\u0121\u0122\7x\2\2\u0122\u0123\7q\2\2\u0123\u0124\7"+
		"n\2\2\u0124\u0125\7c\2\2\u0125\u0126\7v\2\2\u0126\u0127\7k\2\2\u0127\u0128"+
		"\7n\2\2\u0128\u0129\7g\2\2\u0129 \3\2\2\2\u012a\u012b\7d\2\2\u012b\u012c"+
		"\7t\2\2\u012c\u012d\7g\2\2\u012d\u012e\7c\2\2\u012e\u012f\7m\2\2\u012f"+
		"\"\3\2\2\2\u0130\u0131\7e\2\2\u0131\u0132\7c\2\2\u0132\u0133\7u\2\2\u0133"+
		"\u0134\7g\2\2\u0134$\3\2\2\2\u0135\u0136\7e\2\2\u0136\u0137\7q\2\2\u0137"+
		"\u0138\7p\2\2\u0138\u0139\7v\2\2\u0139\u013a\7k\2\2\u013a\u013b\7p\2\2"+
		"\u013b\u013c\7w\2\2\u013c\u013d\7g\2\2\u013d&\3\2\2\2\u013e\u013f\7f\2"+
		"\2\u013f\u0140\7g\2\2\u0140\u0141\7h\2\2\u0141\u0142\7c\2\2\u0142\u0143"+
		"\7w\2\2\u0143\u0144\7n\2\2\u0144\u0145\7v\2\2\u0145(\3\2\2\2\u0146\u0147"+
		"\7f\2\2\u0147\u0148\7q\2\2\u0148*\3\2\2\2\u0149\u014a\7g\2\2\u014a\u014b"+
		"\7n\2\2\u014b\u014c\7u\2\2\u014c\u014d\7g\2\2\u014d,\3\2\2\2\u014e\u014f"+
		"\7h\2\2\u014f\u0150\7q\2\2\u0150\u0151\7t\2\2\u0151.\3\2\2\2\u0152\u0153"+
		"\7k\2\2\u0153\u0154\7h\2\2\u0154\60\3\2\2\2\u0155\u0156\7k\2\2\u0156\u0157"+
		"\7p\2\2\u0157\u0158\7u\2\2\u0158\u0159\7v\2\2\u0159\u015a\7c\2\2\u015a"+
		"\u015b\7p\2\2\u015b\u015c\7e\2\2\u015c\u015d\7g\2\2\u015d\u015e\7q\2\2"+
		"\u015e\u015f\7h\2\2\u015f\62\3\2\2\2\u0160\u0161\7t\2\2\u0161\u0162\7"+
		"g\2\2\u0162\u0163\7v\2\2\u0163\u0164\7w\2\2\u0164\u0165\7t\2\2\u0165\u0166"+
		"\7p\2\2\u0166\64\3\2\2\2\u0167\u0168\7u\2\2\u0168\u0169\7y\2\2\u0169\u016a"+
		"\7k\2\2\u016a\u016b\7v\2\2\u016b\u016c\7e\2\2\u016c\u016d\7j\2\2\u016d"+
		"\66\3\2\2\2\u016e\u016f\7y\2\2\u016f\u0170\7j\2\2\u0170\u0171\7k\2\2\u0171"+
		"\u0172\7n\2\2\u0172\u0173\7g\2\2\u01738\3\2\2\2\u0174\u0175\7e\2\2\u0175"+
		"\u0176\7c\2\2\u0176\u0177\7t\2\2\u0177\u0178\7e\2\2\u0178\u0179\7j\2\2"+
		"\u0179:\3\2\2\2\u017a\u017b\7h\2\2\u017b\u017c\7k\2\2\u017c\u017d\7p\2"+
		"\2\u017d\u017e\7c\2\2\u017e\u017f\7n\2\2\u017f\u0180\7n\2\2\u0180\u0181"+
		"\7{\2\2\u0181<\3\2\2\2\u0182\u0183\7v\2\2\u0183\u0184\7j\2\2\u0184\u0185"+
		"\7t\2\2\u0185\u0186\7q\2\2\u0186\u0187\7y\2\2\u0187>\3\2\2\2\u0188\u0189"+
		"\7v\2\2\u0189\u018a\7j\2\2\u018a\u018b\7t\2\2\u018b\u018c\7q\2\2\u018c"+
		"\u018d\7y\2\2\u018d\u018e\7u\2\2\u018e@\3\2\2\2\u018f\u0190\7v\2\2\u0190"+
		"\u0191\7t\2\2\u0191\u0192\7{\2\2\u0192B\3\2\2\2\u0193\u0194\7k\2\2\u0194"+
		"\u0195\7o\2\2\u0195\u0196\7r\2\2\u0196\u0197\7q\2\2\u0197\u0198\7t\2\2"+
		"\u0198\u0199\7v\2\2\u0199D\3\2\2\2\u019a\u019b\7r\2\2\u019b\u019c\7c\2"+
		"\2\u019c\u019d\7e\2\2\u019d\u019e\7m\2\2\u019e\u019f\7c\2\2\u019f\u01a0"+
		"\7i\2\2\u01a0\u01a1\7g\2\2\u01a1F\3\2\2\2\u01a2\u01a3\7d\2\2\u01a3\u01a4"+
		"\7q\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7n\2\2\u01a6\u01a7\7g\2\2\u01a7"+
		"\u01a8\7c\2\2\u01a8\u01a9\7p\2\2\u01a9H\3\2\2\2\u01aa\u01ab\7d\2\2\u01ab"+
		"\u01ac\7{\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae\7g\2\2\u01aeJ\3\2\2\2\u01af"+
		"\u01b0\7e\2\2\u01b0\u01b1\7j\2\2\u01b1\u01b2\7c\2\2\u01b2\u01b3\7t\2\2"+
		"\u01b3L\3\2\2\2\u01b4\u01b5\7f\2\2\u01b5\u01b6\7q\2\2\u01b6\u01b7\7w\2"+
		"\2\u01b7\u01b8\7d\2\2\u01b8\u01b9\7n\2\2\u01b9\u01ba\7g\2\2\u01baN\3\2"+
		"\2\2\u01bb\u01bc\7h\2\2\u01bc\u01bd\7n\2\2\u01bd\u01be\7q\2\2\u01be\u01bf"+
		"\7c\2\2\u01bf\u01c0\7v\2\2\u01c0P\3\2\2\2\u01c1\u01c2\7k\2\2\u01c2\u01c3"+
		"\7p\2\2\u01c3\u01c4\7v\2\2\u01c4R\3\2\2\2\u01c5\u01c6\7n\2\2\u01c6\u01c7"+
		"\7q\2\2\u01c7\u01c8\7p\2\2\u01c8\u01c9\7i\2\2\u01c9T\3\2\2\2\u01ca\u01cb"+
		"\7u\2\2\u01cb\u01cc\7j\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\7t\2\2\u01ce"+
		"\u01cf\7v\2\2\u01cfV\3\2\2\2\u01d0\u01d1\7u\2\2\u01d1\u01d2\7w\2\2\u01d2"+
		"\u01d3\7r\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7t\2\2\u01d5X\3\2\2\2\u01d6"+
		"\u01d7\7x\2\2\u01d7\u01d8\7q\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da\7f\2\2"+
		"\u01daZ\3\2\2\2\u01db\u01dc\7e\2\2\u01dc\u01dd\7q\2\2\u01dd\u01de\7p\2"+
		"\2\u01de\u01df\7u\2\2\u01df\u01e0\7v\2\2\u01e0\\\3\2\2\2\u01e1\u01e2\7"+
		"i\2\2\u01e2\u01e3\7q\2\2\u01e3\u01e4\7v\2\2\u01e4\u01e5\7q\2\2\u01e5^"+
		"\3\2\2\2\u01e6\u01e7\7v\2\2\u01e7\u01e8\7t\2\2\u01e8\u01e9\7w\2\2\u01e9"+
		"\u01ea\7g\2\2\u01ea`\3\2\2\2\u01eb\u01ec\7h\2\2\u01ec\u01ed\7c\2\2\u01ed"+
		"\u01ee\7n\2\2\u01ee\u01ef\7u\2\2\u01ef\u01f0\7g\2\2\u01f0b\3\2\2\2\u01f1"+
		"\u01f2\7p\2\2\u01f2\u01f3\7w\2\2\u01f3\u01f4\7n\2\2\u01f4\u01f5\7n\2\2"+
		"\u01f5d\3\2\2\2\u01f6\u01f8\t\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fc\3"+
		"\2\2\2\u01f9\u01fb\t\3\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fdf\3\2\2\2\u01fe\u01fc\3\2\2\2"+
		"\u01ff\u0200\7-\2\2\u0200h\3\2\2\2\u0201\u0202\7/\2\2\u0202j\3\2\2\2\u0203"+
		"\u0204\7,\2\2\u0204l\3\2\2\2\u0205\u0206\7\61\2\2\u0206n\3\2\2\2\u0207"+
		"\u0208\7\'\2\2\u0208p\3\2\2\2\u0209\u020a\7?\2\2\u020a\u020b\7?\2\2\u020b"+
		"r\3\2\2\2\u020c\u020d\7#\2\2\u020d\u020e\7?\2\2\u020et\3\2\2\2\u020f\u0210"+
		"\7@\2\2\u0210v\3\2\2\2\u0211\u0212\7>\2\2\u0212x\3\2\2\2\u0213\u0214\7"+
		"@\2\2\u0214\u0215\7?\2\2\u0215z\3\2\2\2\u0216\u0217\7>\2\2\u0217\u0218"+
		"\7?\2\2\u0218|\3\2\2\2\u0219\u021a\7(\2\2\u021a\u021b\7(\2\2\u021b~\3"+
		"\2\2\2\u021c\u021d\7~\2\2\u021d\u021e\7~\2\2\u021e\u0080\3\2\2\2\u021f"+
		"\u0220\7,\2\2\u0220\u0221\7?\2\2\u0221\u0082\3\2\2\2\u0222\u0223\7\61"+
		"\2\2\u0223\u0224\7?\2\2\u0224\u0084\3\2\2\2\u0225\u0226\7\'\2\2\u0226"+
		"\u0227\7?\2\2\u0227\u0086\3\2\2\2\u0228\u0229\7-\2\2\u0229\u022a\7?\2"+
		"\2\u022a\u0088\3\2\2\2\u022b\u022c\7/\2\2\u022c\u022d\7?\2\2\u022d\u008a"+
		"\3\2\2\2\u022e\u022f\7(\2\2\u022f\u0230\7?\2\2\u0230\u008c\3\2\2\2\u0231"+
		"\u0232\7`\2\2\u0232\u0233\7?\2\2\u0233\u008e\3\2\2\2\u0234\u0235\7~\2"+
		"\2\u0235\u0236\7?\2\2\u0236\u0090\3\2\2\2\u0237\u0238\7-\2\2\u0238\u0239"+
		"\7-\2\2\u0239\u0092\3\2\2\2\u023a\u023b\7/\2\2\u023b\u023c\7/\2\2\u023c"+
		"\u0094\3\2\2\2\u023d\u023e\7*\2\2\u023e\u0096\3\2\2\2\u023f\u0240\7+\2"+
		"\2\u0240\u0098\3\2\2\2\u0241\u0242\7}\2\2\u0242\u009a\3\2\2\2\u0243\u0244"+
		"\7\177\2\2\u0244\u009c\3\2\2\2\u0245\u0246\7]\2\2\u0246\u009e\3\2\2\2"+
		"\u0247\u0248\7_\2\2\u0248\u00a0\3\2\2\2\u0249\u024a\7\60\2\2\u024a\u00a2"+
		"\3\2\2\2\u024b\u024c\7.\2\2\u024c\u00a4\3\2\2\2\u024d\u024e\7=\2\2\u024e"+
		"\u00a6\3\2\2\2\u024f\u0250\7<\2\2\u0250\u00a8\3\2\2\2\u0251\u0252\7A\2"+
		"\2\u0252\u00aa\3\2\2\2\u0253\u0254\4\62;\2\u0254\u00ac\3\2\2\2\6\2\u01f7"+
		"\u01fa\u01fc\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}