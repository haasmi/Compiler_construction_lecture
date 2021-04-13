package ast;

/** Represents A OP B, where A and B must be integer */
public abstract class LogicalExpression extends BinaryExpression {
	public LogicalExpression(Expression l, Expression r) {
		super(l, r);
	}
}
