package ast;

/** Represents E OP E, where OP is any kind of comparison operation */
public abstract class CompExpression extends NumericExpression {
	public CompExpression(Expression l, Expression r) {
		super(l, r);
	}
}
