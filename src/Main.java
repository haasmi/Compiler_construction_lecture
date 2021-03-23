import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import java.io.IOException;
import org.antlr.v4.runtime.RecognitionException;

class Main {
	public static void main(String[] args) {
		try {
			CharStream stream = CharStreams.fromFileName("C://Users/Miriam/Desktop/GitHub/Compiler_construction_lecture/src/input.tst");
			Lexer lexer = new ExprLexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ExprParser parser = new ExprParser(tokens);
			ExprParser.ProgContext ast = parser.prog();
			
			Calculator v = new Calculator();
            Integer result = ast.accept(v);
            System.out.println("Result = "+result);
		}
		catch (IOException e) {
			System.err.println("Cannot open input file: "+e);
		}
		catch (RecognitionException e) {
			System.err.println("Syntax error: "+e);
		}
		
	}
}
