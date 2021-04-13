package ast;

/** Represents E <=> E */
public class StrcmpExpr extends BinaryExpression {
	public StrcmpExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
