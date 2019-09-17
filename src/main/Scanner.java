// Generated from C:/Users/vitor/Downloads/TrabalhoCompiladores-master/src/antlr\Scanner.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABSTRACT", "EXTENDS", "INT", "PROTECTED", "THIS", "BOOLEAN", "FALSE", 
			"NEW", "PUBLIC", "TRUE", "CHAR", "IMPORT", "NULL", "RETURN", "VOID", 
			"CLASS", "IF", "PACKAGE", "STATIC", "WHILE", "ELSE", "INSTANCEOF", "PRIVATE", 
			"SUPER", "ATRIBUICAO", "IGUALDADE", "OpMaior", "INCREMENTO", "AND", "OR", 
			"OpMenorIgual", "OpNegacao", "SUBITRACAO", "DECREMENTO", "ADICAO", "OpSomaAtribuicao", 
			"MULTIPLICACAO", "Virgula", "Ponto", "AC", "AbreChave", "AP", "FP", "FechaChave", 
			"FC", "PontVirgula", "ID", "Int", "StringLiteral", "NEWLINE", "WS", "COMMENT"
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


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0169\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%"+
		"\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\5\60\u013b\n\60\3\60\7\60\u013e\n\60\f\60\16\60\u0141\13\60\3\61\3"+
		"\61\3\61\5\61\u0146\n\61\3\62\3\62\7\62\u014a\n\62\f\62\16\62\u014d\13"+
		"\62\3\62\3\62\3\63\5\63\u0152\n\63\3\63\3\63\3\63\3\63\3\64\6\64\u0159"+
		"\n\64\r\64\16\64\u015a\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0163\n\65\f"+
		"\65\16\65\u0166\13\65\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66\3\2\7\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2"+
		"$$^^\4\2\13\13\"\"\3\2\f\f\2\u016e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\3k\3\2\2\2\5t\3\2\2\2\7|\3\2\2\2\t\u0080\3\2\2\2\13\u008a"+
		"\3\2\2\2\r\u008f\3\2\2\2\17\u0097\3\2\2\2\21\u009d\3\2\2\2\23\u00a1\3"+
		"\2\2\2\25\u00a8\3\2\2\2\27\u00ad\3\2\2\2\31\u00b2\3\2\2\2\33\u00b9\3\2"+
		"\2\2\35\u00be\3\2\2\2\37\u00c5\3\2\2\2!\u00ca\3\2\2\2#\u00d0\3\2\2\2%"+
		"\u00d3\3\2\2\2\'\u00db\3\2\2\2)\u00e2\3\2\2\2+\u00e8\3\2\2\2-\u00ed\3"+
		"\2\2\2/\u00f8\3\2\2\2\61\u0100\3\2\2\2\63\u0106\3\2\2\2\65\u0108\3\2\2"+
		"\2\67\u010b\3\2\2\29\u010d\3\2\2\2;\u0110\3\2\2\2=\u0113\3\2\2\2?\u0116"+
		"\3\2\2\2A\u0119\3\2\2\2C\u011b\3\2\2\2E\u011d\3\2\2\2G\u0120\3\2\2\2I"+
		"\u0122\3\2\2\2K\u0125\3\2\2\2M\u0127\3\2\2\2O\u0129\3\2\2\2Q\u012b\3\2"+
		"\2\2S\u012d\3\2\2\2U\u012f\3\2\2\2W\u0131\3\2\2\2Y\u0133\3\2\2\2[\u0135"+
		"\3\2\2\2]\u0137\3\2\2\2_\u013a\3\2\2\2a\u0145\3\2\2\2c\u0147\3\2\2\2e"+
		"\u0151\3\2\2\2g\u0158\3\2\2\2i\u015e\3\2\2\2kl\7c\2\2lm\7d\2\2mn\7u\2"+
		"\2no\7v\2\2op\7t\2\2pq\7c\2\2qr\7e\2\2rs\7v\2\2s\4\3\2\2\2tu\7g\2\2uv"+
		"\7z\2\2vw\7v\2\2wx\7g\2\2xy\7p\2\2yz\7f\2\2z{\7u\2\2{\6\3\2\2\2|}\7k\2"+
		"\2}~\7p\2\2~\177\7v\2\2\177\b\3\2\2\2\u0080\u0081\7r\2\2\u0081\u0082\7"+
		"t\2\2\u0082\u0083\7q\2\2\u0083\u0084\7v\2\2\u0084\u0085\7g\2\2\u0085\u0086"+
		"\7e\2\2\u0086\u0087\7v\2\2\u0087\u0088\7g\2\2\u0088\u0089\7f\2\2\u0089"+
		"\n\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c\7j\2\2\u008c\u008d\7k\2\2\u008d"+
		"\u008e\7u\2\2\u008e\f\3\2\2\2\u008f\u0090\7d\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7q\2\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094\u0095\7c\2\2"+
		"\u0095\u0096\7p\2\2\u0096\16\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7"+
		"c\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c\20"+
		"\3\2\2\2\u009d\u009e\7p\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7y\2\2\u00a0"+
		"\22\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7d\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7e\2\2\u00a7\24\3\2\2\2\u00a8"+
		"\u00a9\7v\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac\26\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7"+
		"c\2\2\u00b0\u00b1\7t\2\2\u00b1\30\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4"+
		"\7o\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7"+
		"\u00b8\7v\2\2\u00b8\32\3\2\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7w\2\2\u00bb"+
		"\u00bc\7n\2\2\u00bc\u00bd\7n\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7t\2\2"+
		"\u00c3\u00c4\7p\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7\7"+
		"q\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7f\2\2\u00c9 \3\2\2\2\u00ca\u00cb"+
		"\7e\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7u\2\2\u00ce"+
		"\u00cf\7u\2\2\u00cf\"\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7h\2\2\u00d2"+
		"$\3\2\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7e\2\2\u00d6"+
		"\u00d7\7m\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7i\2\2\u00d9\u00da\7g\2\2"+
		"\u00da&\3\2\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7c\2"+
		"\2\u00de\u00df\7v\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7e\2\2\u00e1(\3\2"+
		"\2\2\u00e2\u00e3\7y\2\2\u00e3\u00e4\7j\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6"+
		"\7n\2\2\u00e6\u00e7\7g\2\2\u00e7*\3\2\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea"+
		"\7n\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7g\2\2\u00ec,\3\2\2\2\u00ed\u00ee"+
		"\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7v\2\2\u00f1"+
		"\u00f2\7c\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7g\2\2"+
		"\u00f5\u00f6\7q\2\2\u00f6\u00f7\7h\2\2\u00f7.\3\2\2\2\u00f8\u00f9\7r\2"+
		"\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7x\2\2\u00fc\u00fd"+
		"\7c\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7g\2\2\u00ff\60\3\2\2\2\u0100\u0101"+
		"\7u\2\2\u0101\u0102\7w\2\2\u0102\u0103\7r\2\2\u0103\u0104\7g\2\2\u0104"+
		"\u0105\7t\2\2\u0105\62\3\2\2\2\u0106\u0107\7?\2\2\u0107\64\3\2\2\2\u0108"+
		"\u0109\7?\2\2\u0109\u010a\7?\2\2\u010a\66\3\2\2\2\u010b\u010c\7@\2\2\u010c"+
		"8\3\2\2\2\u010d\u010e\7-\2\2\u010e\u010f\7-\2\2\u010f:\3\2\2\2\u0110\u0111"+
		"\7(\2\2\u0111\u0112\7(\2\2\u0112<\3\2\2\2\u0113\u0114\7~\2\2\u0114\u0115"+
		"\7~\2\2\u0115>\3\2\2\2\u0116\u0117\7>\2\2\u0117\u0118\7?\2\2\u0118@\3"+
		"\2\2\2\u0119\u011a\7#\2\2\u011aB\3\2\2\2\u011b\u011c\7/\2\2\u011cD\3\2"+
		"\2\2\u011d\u011e\7/\2\2\u011e\u011f\7/\2\2\u011fF\3\2\2\2\u0120\u0121"+
		"\7-\2\2\u0121H\3\2\2\2\u0122\u0123\7-\2\2\u0123\u0124\7?\2\2\u0124J\3"+
		"\2\2\2\u0125\u0126\7,\2\2\u0126L\3\2\2\2\u0127\u0128\7.\2\2\u0128N\3\2"+
		"\2\2\u0129\u012a\7\60\2\2\u012aP\3\2\2\2\u012b\u012c\7]\2\2\u012cR\3\2"+
		"\2\2\u012d\u012e\7}\2\2\u012eT\3\2\2\2\u012f\u0130\7*\2\2\u0130V\3\2\2"+
		"\2\u0131\u0132\7+\2\2\u0132X\3\2\2\2\u0133\u0134\7\177\2\2\u0134Z\3\2"+
		"\2\2\u0135\u0136\7_\2\2\u0136\\\3\2\2\2\u0137\u0138\7=\2\2\u0138^\3\2"+
		"\2\2\u0139\u013b\t\2\2\2\u013a\u0139\3\2\2\2\u013b\u013f\3\2\2\2\u013c"+
		"\u013e\t\3\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140`\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0146"+
		"\7\62\2\2\u0143\u0144\4\63;\2\u0144\u0146\4\62;\2\u0145\u0142\3\2\2\2"+
		"\u0145\u0143\3\2\2\2\u0146b\3\2\2\2\u0147\u014b\7$\2\2\u0148\u014a\n\4"+
		"\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7$"+
		"\2\2\u014fd\3\2\2\2\u0150\u0152\7\17\2\2\u0151\u0150\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\f\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\b\63\2\2\u0156f\3\2\2\2\u0157\u0159\t\5\2\2\u0158\u0157\3\2\2\2"+
		"\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015d\b\64\2\2\u015dh\3\2\2\2\u015e\u015f\7\61\2\2\u015f"+
		"\u0160\7\61\2\2\u0160\u0164\3\2\2\2\u0161\u0163\n\6\2\2\u0162\u0161\3"+
		"\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\b\65\2\2\u0168j\3\2\2\2"+
		"\13\2\u013a\u013d\u013f\u0145\u014b\u0151\u015a\u0164\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}