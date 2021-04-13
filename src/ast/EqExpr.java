package ast;

/** Represents E == E */
public class EqExpr extends CompExpression {
	public EqExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
