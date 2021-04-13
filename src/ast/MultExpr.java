package ast;

/** Represents E * E */
public class MultExpr extends NumericExpression {
	public MultExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
