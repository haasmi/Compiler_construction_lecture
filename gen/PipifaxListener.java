// Generated from C:/Users/Miriam/Desktop/GitHub/Compiler_construction_lecture\Pipifax.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PipifaxParser}.
 */
public interface PipifaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(PipifaxParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(PipifaxParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PipifaxParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PipifaxParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(PipifaxParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(PipifaxParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#pidouble}.
	 * @param ctx the parse tree
	 */
	void enterPidouble(PipifaxParser.PidoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#pidouble}.
	 * @param ctx the parse tree
	 */
	void exitPidouble(PipifaxParser.PidoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PipifaxParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PipifaxParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PipifaxParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PipifaxParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(PipifaxParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(PipifaxParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#typeORef}.
	 * @param ctx the parse tree
	 */
	void enterTypeORef(PipifaxParser.TypeORefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#typeORef}.
	 * @param ctx the parse tree
	 */
	void exitTypeORef(PipifaxParser.TypeORefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(PipifaxParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(PipifaxParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PipifaxParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PipifaxParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PipifaxParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PipifaxParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PipifaxParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PipifaxParser.FunctionContext ctx);
}