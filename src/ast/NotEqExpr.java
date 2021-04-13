package ast;

/** Represents E != E */
public class NotEqExpr extends CompExpression {
	public NotEqExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
