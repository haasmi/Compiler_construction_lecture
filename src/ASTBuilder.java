import ast.*;
import java.util.List;
import java.util.ArrayList;

public class ASTBuilder extends PfxBaseVisitor<AST> {

	public AST visitProgram(PfxParser.ProgramContext ctx) {
		List<GlobalVariable> globalVariables = new ArrayList<>();
		for (PfxParser.VariableContext c : ctx.variable()) {
			GlobalVariable g = (GlobalVariable) c.accept(this);
			globalVariables.add(g);
		}

		List<Function> functions = new ArrayList<>();
		for (PfxParser.FunctionContext c : ctx.function()) {
			Function f = (Function) c.accept(this);
			functions.add(f);
		}

		Program program = new Program(globalVariables, functions);
		return program;
	}

	public AST visitVariable(PfxParser.VariableContext ctx) {
		Type t = (Type) ctx.type().accept(this);
		GlobalVariable g = new GlobalVariable(ctx.ID().getText(), t);
		return g;
	}

	public AST visitIntType(PfxParser.IntTypeContext ctx) {
		return IntegerType.instance();
	}

	public AST visitDblType(PfxParser.DblTypeContext ctx) {
		return DoubleType.instance();
	}

	public AST visitStrType(PfxParser.StrTypeContext ctx) {
		return StringType.instance();
	}

	public AST visitArrayType(PfxParser.ArrayTypeContext ctx) {
		int size = Integer.parseInt(ctx.INT_LIT().getText());
		Type t = (Type) ctx.type().accept(this);
		return new ArrayType(t, size);
	}

	public AST visitFunction(PfxParser.FunctionContext ctx) {
		String name = ctx.ID().getText();

		Type t = VoidType.instance();
		if (ctx.type() != null) {
			t = (Type) ctx.type().accept(this);
		}

		List<Parameter> parameters = new ArrayList<>();
		for (PfxParser.ParameterContext c : ctx.parameter()) {
			Parameter p = (Parameter) c.accept(this);
			parameters.add(p);
		}

		Block block = (Block) ctx.block().accept(this);
		
		Function f = new Function(name, t, parameters, block);
		
		return f;
	}

	public AST visitParameter(PfxParser.ParameterContext ctx) {
		String name = ctx.ID().getText();
		Type t = (Type) ctx.ptype().accept(this);
		return new Parameter(name, t);
	}

	public AST visitRefPType(PfxParser.RefPTypeContext ctx) {
		Type t = (Type) ctx.type().accept(this);
		return new ReferenceType(t);
	}

	public AST visitRefArrayPType(PfxParser.RefArrayPTypeContext ctx) {
		Type t = (Type) ctx.type().accept(this);
		return new ReferenceType(new BaseArrayType(t));
	}

	public AST visitBlock(PfxParser.BlockContext ctx) {
		List<Statement> statements = new ArrayList<>();
		for (PfxParser.StatementContext c : ctx.statement()) {
			Statement stmt = (Statement) c.accept(this);
			statements.add(stmt);
		}
		return new Block(statements);
	}

	public AST visitLocalVariable(PfxParser.LocalVariableContext ctx) {
		String name = ctx.ID().getText();
		Type type = (Type) ctx.type().accept(this);
		LocalVariable local = new LocalVariable(name, type);
		return new LocalVariableDeclaration(local);
	}

	public AST visitIfStmt(PfxParser.IfStmtContext ctx) {
		Expression cond = (Expression) ctx.expr().accept(this);
		Block then = (Block) ctx.block(0).accept(this);

		Block elze;
		if (ctx.block(1) != null) {
			elze = (Block) ctx.block(1).accept(this);
		}
		else {
			elze = new Block();
		}
		
		return new IfStmt(cond, then, elze);
	}

	public AST visitWhileStmt(PfxParser.WhileStmtContext ctx) {
		Expression cond = (Expression) ctx.expr().accept(this);
		Block body = (Block) ctx.block().accept(this);
		return new WhileStmt(cond, body);
	}

	public AST visitAssignment(PfxParser.AssignmentContext ctx) {
		LValue l = (LValue) ctx.lvalue().accept(this);
		Expression e = (Expression) ctx.expr().accept(this);
		return new Assignment(l, e);
	}

	public AST visitCallStmt(PfxParser.CallStmtContext ctx) {
		CallExpr call = (CallExpr) ctx.call().accept(this);
		return new CallStmt(call);
	}

	public AST visitIdLValue(PfxParser.IdLValueContext ctx) {
		String name = ctx.ID().getText();
		return new VariableAccess(name);
	}

	public AST visitArrayLValue(PfxParser.ArrayLValueContext ctx) {
		LValue base = (LValue) ctx.lvalue().accept(this);
		Expression index = (Expression) ctx.expr().accept(this);
		return new ArrayAccess(base, index);
	}

	public AST visitStrExpr(PfxParser.StrExprContext ctx) {
		String s = ctx.STR_LIT().getText();
		String value = s.substring(1, s.length() - 1);
		return new StringLiteral(value);
	}

	public AST visitIntExpr(PfxParser.IntExprContext ctx) {
		String s = ctx.INT_LIT().getText();
		int value = Integer.parseInt(s);
		return new IntegerLiteral(value);
	}

	public AST visitBracketExpr(PfxParser.BracketExprContext ctx) {
		return ctx.expr(). accept(this);
	}

	public AST visitOrExpr(PfxParser.OrExprContext ctx) {
		Expression l = (Expression) ctx.expr(0).accept(this);
		Expression r = (Expression) ctx.expr(1).accept(this);
		return new OrExpr(l, r);
	}

	public AST visitIntCast(PfxParser.IntCastContext ctx) {
		Expression e = (Expression) ctx.expr().accept(this);
		return new IntegerCastExpr(e);
	}

	public AST visitMultExpr(PfxParser.MultExprContext ctx) {
		Expression l = (Expression) ctx.expr(0).accept(this);
		Expression r = (Expression) ctx.expr(1).accept(this);
		String op = ctx.getChild(1).getText();
		switch (op) {
		case "*":
			return new MultExpr(l, r);
			
		case "/":
			return new DivExpr(l, r);
			
		case "%":
			return new ModExpr(l, r);
			
		default:
			throw new SemanticError("Illegal operator " + op);
		}
	}

	public AST visitUnaryExpr(PfxParser.UnaryExprContext ctx) {
		Expression e = (Expression) ctx.expr().accept(this);
		String op = ctx.getChild(0).getText();
		switch (op) {
		case "-":
			return new NegExpr(e);
			
		case "!":
			return new NotExpr(e);
			
		default:
			throw new SemanticError("Illegal operator " + op);
		}
	}

	public AST visitDoubleCast(PfxParser.DoubleCastContext ctx) {
		Expression e = (Expression) ctx.expr().accept(this);
		return new DoubleCastExpr(e);
	}

	public AST visitAddExpr(PfxParser.AddExprContext ctx) {
		Expression l = (Expression) ctx.expr(0).accept(this);
		Expression r = (Expression) ctx.expr(1).accept(this);
		String op = ctx.getChild(1).getText();
		switch (op) {
		case "+":
			return new AddExpr(l, r);
			
		case "-":
			return new SubExpr(l, r);
			
		default:
			throw new SemanticError("Illegal operator " + op);
		}
	}

	public AST visitCompExpr(PfxParser.CompExprContext ctx) {
		Expression l = (Expression) ctx.expr(0).accept(this);
		Expression r = (Expression) ctx.expr(1).accept(this);
		String op = ctx.getChild(1).getText();
		switch (op) {
		case "<":
			return new LessExpr(l, r);
			
		case "<=":
			return new LessEqExpr(l, r);

		case ">":
			return new GreaterExpr(l, r);
			
		case ">=":
			return new GreaterEqExpr(l, r);
			
		case "==":
			return new EqExpr(l, r);
			
		case "!=":
			return new NotEqExpr(l, r);
			
		case "<=>":
			return new StrcmpExpr(l, r);
			
		default:
			throw new SemanticError("Illegal operator " + op);
		}
	}

	public AST visitLValueExpr(PfxParser.LValueExprContext ctx) {
		LValue lvalue = (LValue) ctx.lvalue().accept(this);
		return new LValueExpr(lvalue);
	}

	public AST visitDblExpr(PfxParser.DblExprContext ctx) {
		String s = ctx.DBL_LIT().getText();
		double value = Double.parseDouble(s);
		return new DoubleLiteral(value);
	}

	public AST visitAndExpr(PfxParser.AndExprContext ctx) {
		Expression l = (Expression) ctx.expr(0).accept(this);
		Expression r = (Expression) ctx.expr(1).accept(this);
		return new AndExpr(l, r);
	}

	public AST visitCall(PfxParser.CallContext ctx) {
		String name = ctx.ID().getText();
		List<Expression> args = new ArrayList<>();
		for (PfxParser.ExprContext c : ctx.expr()) {
			Expression e = (Expression) c.accept(this);
			args.add(e);
		}
		return new CallExpr(name, args);
		
	}
}
