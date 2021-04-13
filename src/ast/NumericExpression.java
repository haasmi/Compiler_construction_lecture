package ast;

/** Represents A OP B, where A and B must be numeric values */
public abstract class NumericExpression extends BinaryExpression {
	public NumericExpression(Expression l, Expression r) {
		super(l, r);
	}
}
