package ast;

/** Represents E % E */
public class ModExpr extends NumericExpression {
	public ModExpr(Expression l, Expression r) {
		super(l, r);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
