package ast;

/** Represents E / E */
public class DivExpr extends NumericExpression {
	public DivExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
