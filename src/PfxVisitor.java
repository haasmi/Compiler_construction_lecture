// Generated from src\Pfx.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PfxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PfxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PfxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PfxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PfxParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PfxParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(PfxParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dblType}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDblType(PfxParser.DblTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strType}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrType(PfxParser.StrTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PfxParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PfxParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PfxParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PfxParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PfxParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicPType}
	 * labeled alternative in {@link PfxParser#ptype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicPType(PfxParser.BasicPTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refPType}
	 * labeled alternative in {@link PfxParser#ptype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefPType(PfxParser.RefPTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refArrayPType}
	 * labeled alternative in {@link PfxParser#ptype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefArrayPType(PfxParser.RefArrayPTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PfxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PfxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PfxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PfxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PfxParser#localVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariable(PfxParser.LocalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PfxParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(PfxParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PfxParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(PfxParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PfxParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PfxParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PfxParser#callStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(PfxParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idLValue}
	 * labeled alternative in {@link PfxParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdLValue(PfxParser.IdLValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLValue}
	 * labeled alternative in {@link PfxParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLValue(PfxParser.ArrayLValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExpr(PfxParser.StrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(PfxParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpr(PfxParser.BracketExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(PfxParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intCast}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntCast(PfxParser.IntCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(PfxParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(PfxParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleCast}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleCast(PfxParser.DoubleCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(PfxParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(PfxParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lValueExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValueExpr(PfxParser.LValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(PfxParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dblExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDblExpr(PfxParser.DblExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link PfxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(PfxParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PfxParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(PfxParser.CallContext ctx);
}