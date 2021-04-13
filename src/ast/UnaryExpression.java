package ast;

import java.util.Collection;
import java.util.Arrays;

/** Base class of all unary expression OP expr, where OP is - or ! */
public abstract class UnaryExpression extends Expression {
	protected Expression expr;

	public UnaryExpression(Expression expr) {
		this.expr = expr;
	}

	public Expression expression() {
		return this.expr;
	}

	public Collection<AST> children() {
		return Arrays.asList(expr);
	}
}
