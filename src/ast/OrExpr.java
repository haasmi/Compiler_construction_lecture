package ast;

/** Represents E || E */
public class OrExpr extends LogicalExpression {
	public OrExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
