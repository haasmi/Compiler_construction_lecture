package ast;

/** Represents -E */
public class NegExpr extends UnaryExpression {
	public NegExpr(Expression expr) {
		super(expr);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
