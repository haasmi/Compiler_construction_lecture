package ast;

import java.util.Collection;
import java.util.Arrays;

/** Represents lvalue = expr */
public class Assignment extends Statement {
	private LValue lvalue;
	private Expression expr;

	public Assignment(LValue lvalue, Expression expr) {
		this.lvalue = lvalue;
		this.expr = expr;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Collection<AST> children() {
		return Arrays.asList(lvalue, expr);
	}

	public LValue lhs() {
		return this.lvalue;
	}

	public Expression rhs() {
		return this.expr;
	}
}
