package ast;

/** Represents (double) expr */
public class DoubleCastExpr extends UnaryExpression {
	public DoubleCastExpr(Expression expr) {
		super(expr);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
