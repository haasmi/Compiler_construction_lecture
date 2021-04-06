import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import java.io.IOException;
import org.antlr.v4.runtime.RecognitionException;

public class Pfx {
	public static void main(String[] args) {
		try {
			CharStream stream = CharStreams.fromFileName(args[0]);
			Lexer lexer = new PfxLexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			PfxParser parser = new PfxParser(tokens);
			PfxParser.ProgramContext program = parser.program();
		}
		catch (IOException e) {
			System.err.println("Cannot open input file: " + e);
		}
		catch (RecognitionException e) {
			System.err.println(e);
		}
		//~ catch (SemanticError e) {
			//~ System.err.println(e);
		//~ }
	}
}

