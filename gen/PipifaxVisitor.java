// Generated from C:/Users/Miriam/Desktop/GitHub/Compiler_construction_lecture\Pipifax.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PipifaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PipifaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(PipifaxParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PipifaxParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(PipifaxParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#pidouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPidouble(PipifaxParser.PidoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PipifaxParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PipifaxParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(PipifaxParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#typeORef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeORef(PipifaxParser.TypeORefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(PipifaxParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PipifaxParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PipifaxParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PipifaxParser.FunctionContext ctx);
}