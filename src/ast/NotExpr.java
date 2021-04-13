package ast;

/** Represents !E */
public class NotExpr extends UnaryExpression {
	public NotExpr(Expression expr) {
		super(expr);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
