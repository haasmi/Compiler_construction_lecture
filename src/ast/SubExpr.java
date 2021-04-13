package ast;

/** Represents E - E */
public class SubExpr extends NumericExpression {
	public SubExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
