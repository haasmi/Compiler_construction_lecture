package ast;

import java.util.Collection;
import java.util.Arrays;

/** /** Represents E OP E, where OP is any binary operations, such as +, -, *, ... */
public abstract class BinaryExpression extends Expression {
	protected Expression left;
	protected Expression right;

	public BinaryExpression(Expression l, Expression r) {
		this.left = l;
		this.right = r;
	}

	public Collection<AST> children() {
		return Arrays.asList(left, right);
	}

	public Expression left() {
		return left;
	}

	public Expression right() {
		return right;
	}
}
