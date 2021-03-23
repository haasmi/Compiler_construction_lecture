// Generated from C:/Users/Miriam/Desktop/GitHub/Compiler_construction_lecture\Pipifax.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PipifaxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ARRAY=8, STRING=9, 
		DOUBLE=10, INT=11, ID=12, NEWLINE=13, ASCII=14, HASH=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ARRAY", "STRING", 
			"DOUBLE", "INT", "ID", "NEWLINE", "ASCII", "HASH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'*'", "'func'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ARRAY", "STRING", "DOUBLE", 
			"INT", "ID", "NEWLINE", "ASCII", "HASH"
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


	public PipifaxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pipifax.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\t\66"+
		"\n\t\f\t\16\t9\13\t\3\n\3\n\3\n\3\n\7\n?\n\n\f\n\16\nB\13\n\3\n\3\n\3"+
		"\13\5\13G\n\13\3\13\7\13J\n\13\f\13\16\13M\13\13\3\13\3\13\7\13Q\n\13"+
		"\f\13\16\13T\13\13\5\13V\n\13\3\13\3\13\5\13Z\n\13\3\13\3\13\7\13^\n\13"+
		"\f\13\16\13a\13\13\5\13c\n\13\3\f\5\ff\n\f\3\f\3\f\7\fj\n\f\f\f\16\fm"+
		"\13\f\3\r\3\r\7\rq\n\r\f\r\16\rt\13\r\3\16\6\16w\n\16\r\16\16\16x\3\17"+
		"\7\17|\n\17\f\17\16\17\177\13\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\16\3\2\63;"+
		"\3\2$$\3\2//\3\2\62;\3\2\60\60\4\2GGgg\4\2--//\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\4\2\f\f\17\17\t\2\"\"*+..\60\60\62=C\\c|\3\2%%\2\u008f\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2"+
		"\2\t*\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2\17\60\3\2\2\2\21\67\3\2\2\2\23:\3"+
		"\2\2\2\25F\3\2\2\2\27e\3\2\2\2\31n\3\2\2\2\33v\3\2\2\2\35}\3\2\2\2\37"+
		"\u0080\3\2\2\2!\"\7%\2\2\"\4\3\2\2\2#$\7,\2\2$\6\3\2\2\2%&\7h\2\2&\'\7"+
		"w\2\2\'(\7p\2\2()\7e\2\2)\b\3\2\2\2*+\7*\2\2+\n\3\2\2\2,-\7+\2\2-\f\3"+
		"\2\2\2./\7}\2\2/\16\3\2\2\2\60\61\7\177\2\2\61\20\3\2\2\2\62\63\7]\2\2"+
		"\63\64\t\2\2\2\64\66\7_\2\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\67"+
		"8\3\2\2\28\22\3\2\2\29\67\3\2\2\2:@\t\3\2\2;<\5\35\17\2<=\5\33\16\2=?"+
		"\3\2\2\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2C"+
		"D\t\3\2\2D\24\3\2\2\2EG\t\4\2\2FE\3\2\2\2FG\3\2\2\2GK\3\2\2\2HJ\t\5\2"+
		"\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LU\3\2\2\2MK\3\2\2\2NR\t\6\2"+
		"\2OQ\t\5\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2UN\3\2\2\2UV\3\2\2\2Vb\3\2\2\2WY\t\7\2\2XZ\t\b\2\2YX\3\2\2\2YZ\3\2\2"+
		"\2Z[\3\2\2\2[_\t\2\2\2\\^\t\5\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`c\3\2\2\2a_\3\2\2\2bW\3\2\2\2bc\3\2\2\2c\26\3\2\2\2df\t\4\2\2ed\3"+
		"\2\2\2ef\3\2\2\2fg\3\2\2\2gk\t\2\2\2hj\t\5\2\2ih\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2l\30\3\2\2\2mk\3\2\2\2nr\t\t\2\2oq\t\n\2\2po\3\2\2\2q"+
		"t\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\32\3\2\2\2tr\3\2\2\2uw\t\13\2\2vu\3\2\2"+
		"\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\34\3\2\2\2z|\t\f\2\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\36\3\2\2\2\177}\3\2\2\2\u0080\u0081\t\r"+
		"\2\2\u0081 \3\2\2\2\21\2\67@FKRUY_bekrx}\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}