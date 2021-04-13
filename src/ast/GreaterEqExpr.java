package ast;

/** Represents E >= E */
public class GreaterEqExpr extends CompExpression {
	public GreaterEqExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
