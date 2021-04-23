package ast;

public class BaseVisitor<T> implements Visitor<T> {
	
	protected T visitChildren(AST node) {
		T t = null;
		for (AST c : node.children()) {
			t = c.accept(this);
		}
		return t;
	}
	
	public T visit(AddExpr n) { T t = visitChildren(n); return t; }
	public T visit(AndExpr n) { T t = visitChildren(n); return t; }
	public T visit(ArrayAccess n) { T t = visitChildren(n); return t; }
	public T visit(ArrayType n) { T t = visitChildren(n); return t; }
	public T visit(Assignment n) { T t = visitChildren(n); return t; }
	public T visit(BaseArrayType n) { T t = visitChildren(n); return t; }
	public T visit(Block n) { T t = visitChildren(n); return t; }
	public T visit(CallExpr n) { T t = visitChildren(n); return t; }
	public T visit(CallStmt n) { T t = visitChildren(n); return t; }
	public T visit(DivExpr n) { T t = visitChildren(n); return t; }
	public T visit(DoubleCastExpr n) { T t = visitChildren(n); return t; }
	public T visit(DoubleLiteral n) { T t = visitChildren(n); return t; }
	public T visit(DoubleType n) { T t = visitChildren(n); return t; }
	public T visit(EqExpr n) { T t = visitChildren(n); return t; }
	public T visit(Function n) { T t = visitChildren(n); return t; }
	public T visit(GlobalVariable n) { T t = visitChildren(n); return t; }
	public T visit(GreaterEqExpr n) { T t = visitChildren(n); return t; }
	public T visit(GreaterExpr n) { T t = visitChildren(n); return t; }
	public T visit(IfStmt n) { T t = visitChildren(n); return t; }
	public T visit(IntegerCastExpr n) { T t = visitChildren(n); return t; }
	public T visit(IntegerLiteral n) { T t = visitChildren(n); return t; }
	public T visit(IntegerType n) { T t = visitChildren(n); return t; }
	public T visit(LessEqExpr n) { T t = visitChildren(n); return t; }
	public T visit(LessExpr n) { T t = visitChildren(n); return t; }
	public T visit(LocalVariable n) { T t = visitChildren(n); return t; }
	public T visit(LocalVariableDeclaration n) { T t = visitChildren(n); return t; }
	public T visit(LValueExpr n) { T t = visitChildren(n); return t; }
	public T visit(ModExpr n) { T t = visitChildren(n); return t; }
	public T visit(MultExpr n) { T t = visitChildren(n); return t; }
	public T visit(NegExpr n) { T t = visitChildren(n); return t; }
	public T visit(NotEqExpr n) { T t = visitChildren(n); return t; }
	public T visit(NotExpr n) { T t = visitChildren(n); return t; }
	public T visit(OrExpr n) { T t = visitChildren(n); return t; }
	public T visit(Parameter n) { T t = visitChildren(n); return t; }
	public T visit(Program n) { T t = visitChildren(n); return t; }
	public T visit(ReferenceType n) { T t = visitChildren(n); return t; }
	public T visit(ReturnParameter n) { T t = visitChildren(n); return t; }
	public T visit(StrcmpExpr n) { T t = visitChildren(n); return t; }
	public T visit(StringLiteral n) { T t = visitChildren(n); return t; }
	public T visit(StringType n) { T t = visitChildren(n); return t; }
	public T visit(SubExpr n) { T t = visitChildren(n); return t; }
	public T visit(VariableAccess n) { T t = visitChildren(n); return t; }
	public T visit(VoidType n) { T t = visitChildren(n); return t; }
	public T visit(WhileStmt n) { T t = visitChildren(n); return t; }
}
