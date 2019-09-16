// Generated from /home/vitor/Área de Trabalho/trabalhoComp/TrabalhoCompiladores/src/main/CompiladorJava.g4 by ANTLR 4.7.2
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
		ABSTRACT=1, EXTENDS=2, INT=3, PROTECTED=4, THIS=5, BOOLEAN=6, FALSE=7, 
		NEW=8, PUBLIC=9, TRUE=10, CHAR=11, IMPORT=12, NULL=13, RETURN=14, VOID=15, 
		CLASS=16, IF=17, PACKAGE=18, STATIC=19, WHILE=20, ELSE=21, INSTANCEOF=22, 
		PRIVATE=23, SUPER=24, ATRIBUICAO=25, IGUALDADE=26, OpMaior=27, INCREMENTO=28, 
		ADN=29, OpMenorIgual=30, OpNegacao=31, SUBITRACAO=32, DECREMENTO=33, ADICAO=34, 
		OpSomaAtribuicao=35, MULTIPLICACAO=36, Virgula=37, Ponto=38, AC=39, AbreChave=40, 
		AP=41, FP=42, FechaChave=43, FC=44, PontVirgula=45, ID=46, Int=47;
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
			"SUPER", "ATRIBUICAO", "IGUALDADE", "OpMaior", "INCREMENTO", "ADN", "OpMenorIgual", 
			"OpNegacao", "SUBITRACAO", "DECREMENTO", "ADICAO", "OpSomaAtribuicao", 
			"MULTIPLICACAO", "Virgula", "Ponto", "AC", "AbreChave", "AP", "FP", "FechaChave", 
			"FC", "PontVirgula", "ID", "Int"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'extends'", "'int'", "'protected'", "'this'", "'boolean'", 
			"'false'", "'new'", "'public'", "'true'", "'char'", "'import'", "'null'", 
			"'return'", "'void'", "'class'", "'if'", "'package'", "'static'", "'while'", 
			"'else'", "'instanceof'", "'private'", "'super'", "'='", "'=='", "'>'", 
			"'++'", "'&&'", "'<='", "'!'", "'-'", "'--'", "'+'", "'+='", "'*'", "','", 
			"'.'", "'['", "'{'", "'('", "')'", "'}'", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "EXTENDS", "INT", "PROTECTED", "THIS", "BOOLEAN", "FALSE", 
			"NEW", "PUBLIC", "TRUE", "CHAR", "IMPORT", "NULL", "RETURN", "VOID", 
			"CLASS", "IF", "PACKAGE", "STATIC", "WHILE", "ELSE", "INSTANCEOF", "PRIVATE", 
			"SUPER", "ATRIBUICAO", "IGUALDADE", "OpMaior", "INCREMENTO", "ADN", "OpMenorIgual", 
			"OpNegacao", "SUBITRACAO", "DECREMENTO", "ADICAO", "OpSomaAtribuicao", 
			"MULTIPLICACAO", "Virgula", "Ponto", "AC", "AbreChave", "AP", "FP", "FechaChave", 
			"FC", "PontVirgula", "ID", "Int"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0149\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,"+
		"\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0136\n/\3/\7/\u0139\n/\f/"+
		"\16/\u013c\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u0148\n\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\4\4"+
		"\2&&aa\7\2&&\62;C\\aac|\2\u014c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5j\3\2\2\2\7r\3\2\2\2\tv\3\2\2\2"+
		"\13\u0080\3\2\2\2\r\u0085\3\2\2\2\17\u008d\3\2\2\2\21\u0093\3\2\2\2\23"+
		"\u0097\3\2\2\2\25\u009e\3\2\2\2\27\u00a3\3\2\2\2\31\u00a8\3\2\2\2\33\u00af"+
		"\3\2\2\2\35\u00b4\3\2\2\2\37\u00bb\3\2\2\2!\u00c0\3\2\2\2#\u00c6\3\2\2"+
		"\2%\u00c9\3\2\2\2\'\u00d1\3\2\2\2)\u00d8\3\2\2\2+\u00de\3\2\2\2-\u00e3"+
		"\3\2\2\2/\u00ee\3\2\2\2\61\u00f6\3\2\2\2\63\u00fc\3\2\2\2\65\u00fe\3\2"+
		"\2\2\67\u0101\3\2\2\29\u0103\3\2\2\2;\u0106\3\2\2\2=\u0109\3\2\2\2?\u010c"+
		"\3\2\2\2A\u010e\3\2\2\2C\u0110\3\2\2\2E\u0113\3\2\2\2G\u0115\3\2\2\2I"+
		"\u0118\3\2\2\2K\u011a\3\2\2\2M\u011c\3\2\2\2O\u011e\3\2\2\2Q\u0120\3\2"+
		"\2\2S\u0122\3\2\2\2U\u0124\3\2\2\2W\u0126\3\2\2\2Y\u0128\3\2\2\2[\u012a"+
		"\3\2\2\2]\u0135\3\2\2\2_\u0147\3\2\2\2ab\7c\2\2bc\7d\2\2cd\7u\2\2de\7"+
		"v\2\2ef\7t\2\2fg\7c\2\2gh\7e\2\2hi\7v\2\2i\4\3\2\2\2jk\7g\2\2kl\7z\2\2"+
		"lm\7v\2\2mn\7g\2\2no\7p\2\2op\7f\2\2pq\7u\2\2q\6\3\2\2\2rs\7k\2\2st\7"+
		"p\2\2tu\7v\2\2u\b\3\2\2\2vw\7r\2\2wx\7t\2\2xy\7q\2\2yz\7v\2\2z{\7g\2\2"+
		"{|\7e\2\2|}\7v\2\2}~\7g\2\2~\177\7f\2\2\177\n\3\2\2\2\u0080\u0081\7v\2"+
		"\2\u0081\u0082\7j\2\2\u0082\u0083\7k\2\2\u0083\u0084\7u\2\2\u0084\f\3"+
		"\2\2\2\u0085\u0086\7d\2\2\u0086\u0087\7q\2\2\u0087\u0088\7q\2\2\u0088"+
		"\u0089\7n\2\2\u0089\u008a\7g\2\2\u008a\u008b\7c\2\2\u008b\u008c\7p\2\2"+
		"\u008c\16\3\2\2\2\u008d\u008e\7h\2\2\u008e\u008f\7c\2\2\u008f\u0090\7"+
		"n\2\2\u0090\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092\20\3\2\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7g\2\2\u0095\u0096\7y\2\2\u0096\22\3\2\2\2\u0097\u0098"+
		"\7r\2\2\u0098\u0099\7w\2\2\u0099\u009a\7d\2\2\u009a\u009b\7n\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7e\2\2\u009d\24\3\2\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7g\2\2\u00a2\26\3\2\2\2\u00a3"+
		"\u00a4\7e\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7t\2\2"+
		"\u00a7\30\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ab\7"+
		"r\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7v\2\2\u00ae\32"+
		"\3\2\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7n\2\2\u00b3\34\3\2\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7p\2\2"+
		"\u00ba\36\3\2\2\2\u00bb\u00bc\7x\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7"+
		"k\2\2\u00be\u00bf\7f\2\2\u00bf \3\2\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2"+
		"\7n\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7u\2\2\u00c5"+
		"\"\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7h\2\2\u00c8$\3\2\2\2\u00c9"+
		"\u00ca\7r\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7m\2\2"+
		"\u00cd\u00ce\7c\2\2\u00ce\u00cf\7i\2\2\u00cf\u00d0\7g\2\2\u00d0&\3\2\2"+
		"\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5"+
		"\7v\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7e\2\2\u00d7(\3\2\2\2\u00d8\u00d9"+
		"\7y\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7n\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd*\3\2\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7n\2\2\u00e0"+
		"\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7k\2\2\u00e4"+
		"\u00e5\7p\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7c\2\2"+
		"\u00e8\u00e9\7p\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec"+
		"\7q\2\2\u00ec\u00ed\7h\2\2\u00ed.\3\2\2\2\u00ee\u00ef\7r\2\2\u00ef\u00f0"+
		"\7t\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7c\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4\u00f5\7g\2\2\u00f5\60\3\2\2\2\u00f6\u00f7\7u\2\2\u00f7"+
		"\u00f8\7w\2\2\u00f8\u00f9\7r\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7t\2\2"+
		"\u00fb\62\3\2\2\2\u00fc\u00fd\7?\2\2\u00fd\64\3\2\2\2\u00fe\u00ff\7?\2"+
		"\2\u00ff\u0100\7?\2\2\u0100\66\3\2\2\2\u0101\u0102\7@\2\2\u01028\3\2\2"+
		"\2\u0103\u0104\7-\2\2\u0104\u0105\7-\2\2\u0105:\3\2\2\2\u0106\u0107\7"+
		"(\2\2\u0107\u0108\7(\2\2\u0108<\3\2\2\2\u0109\u010a\7>\2\2\u010a\u010b"+
		"\7?\2\2\u010b>\3\2\2\2\u010c\u010d\7#\2\2\u010d@\3\2\2\2\u010e\u010f\7"+
		"/\2\2\u010fB\3\2\2\2\u0110\u0111\7/\2\2\u0111\u0112\7/\2\2\u0112D\3\2"+
		"\2\2\u0113\u0114\7-\2\2\u0114F\3\2\2\2\u0115\u0116\7-\2\2\u0116\u0117"+
		"\7?\2\2\u0117H\3\2\2\2\u0118\u0119\7,\2\2\u0119J\3\2\2\2\u011a\u011b\7"+
		".\2\2\u011bL\3\2\2\2\u011c\u011d\7\60\2\2\u011dN\3\2\2\2\u011e\u011f\7"+
		"]\2\2\u011fP\3\2\2\2\u0120\u0121\7}\2\2\u0121R\3\2\2\2\u0122\u0123\7*"+
		"\2\2\u0123T\3\2\2\2\u0124\u0125\7+\2\2\u0125V\3\2\2\2\u0126\u0127\7\177"+
		"\2\2\u0127X\3\2\2\2\u0128\u0129\7_\2\2\u0129Z\3\2\2\2\u012a\u012b\7=\2"+
		"\2\u012b\\\3\2\2\2\u012c\u012d\7c\2\2\u012d\u012e\7\60\2\2\u012e\u012f"+
		"\7\60\2\2\u012f\u0136\7|\2\2\u0130\u0131\7C\2\2\u0131\u0132\7\60\2\2\u0132"+
		"\u0133\7\60\2\2\u0133\u0136\7\\\2\2\u0134\u0136\t\2\2\2\u0135\u012c\3"+
		"\2\2\2\u0135\u0130\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u013a\3\2\2\2\u0137"+
		"\u0139\t\3\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b^\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0148"+
		"\7\62\2\2\u013e\u013f\7\63\2\2\u013f\u0140\7\60\2\2\u0140\u0141\7\60\2"+
		"\2\u0141\u0142\7;\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\62\2\2\u0144\u0145"+
		"\7\60\2\2\u0145\u0146\7\60\2\2\u0146\u0148\7;\2\2\u0147\u013d\3\2\2\2"+
		"\u0147\u013e\3\2\2\2\u0148`\3\2\2\2\7\2\u0135\u0138\u013a\u0147\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}