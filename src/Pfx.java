import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import java.io.IOException;
import org.antlr.v4.runtime.RecognitionException;

import ast.AST;

public class Pfx {
    public static void main(String[] args) {
        try {
            CharStream stream = CharStreams.fromFileName(args[0]);
            Lexer lexer = new PfxLexer(stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PfxParser parser = new PfxParser(tokens);
            PfxParser.ProgramContext program = parser.program();

            ASTBuilder v = new ASTBuilder();
            AST ast = program.accept(v);

            NameResolver nameResolver = new NameResolver();
            ast.accept(nameResolver);

            TypeResolver typeResolver = new TypeResolver();
            ast.accept(typeResolver);

            Allocator allocator = new Allocator();
            ast.accept(allocator);

            CodeGenerator codegen = new CodeGenerator();
            ast.accept(codegen);
        }
        catch (IOException e) {
            System.err.println("Cannot open input file: " + e);
        }
        catch (RecognitionException e) {
            System.err.println(e);
        }
        catch (SemanticError e) {
            System.err.println(e);
        }
    }
}

