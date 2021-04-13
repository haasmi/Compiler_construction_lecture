package ast;

/** Represents E <= E */
public class LessEqExpr extends CompExpression {
	public LessEqExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
