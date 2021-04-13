package ast;

/** Represents (int) expr */
public class IntegerCastExpr extends UnaryExpression {
	public IntegerCastExpr(Expression expr) {
		super(expr);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
