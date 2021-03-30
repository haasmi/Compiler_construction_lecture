// Generated from /home/tobi/coding/school/compilerwerkzeuge/Compiler_construction_lecture/Pipifax.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PipifaxParser}.
 */
public interface PipifaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(PipifaxParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(PipifaxParser.PrgContext ctx);
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
	 * Enter a parse tree produced by {@link PipifaxParser#typesKey}.
	 * @param ctx the parse tree
	 */
	void enterTypesKey(PipifaxParser.TypesKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#typesKey}.
	 * @param ctx the parse tree
	 */
	void exitTypesKey(PipifaxParser.TypesKeyContext ctx);
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
	 * Enter a parse tree produced by {@link PipifaxParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(PipifaxParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(PipifaxParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(PipifaxParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(PipifaxParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PipifaxParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PipifaxParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(PipifaxParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(PipifaxParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PipifaxParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PipifaxParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PipifaxParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PipifaxParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PipifaxParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PipifaxParser.StatementsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(PipifaxParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(PipifaxParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PipifaxParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PipifaxParser.ExprContext ctx);
}