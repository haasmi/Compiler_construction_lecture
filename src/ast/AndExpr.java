package ast;

/** Represents E && E */
public class AndExpr extends LogicalExpression {
	public AndExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
