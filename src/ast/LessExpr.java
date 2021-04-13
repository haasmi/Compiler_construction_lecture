package ast;

/** Represents E < E */
public class LessExpr extends CompExpression {
	public LessExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
