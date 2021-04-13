package ast;

import java.util.Collection;
import java.util.Arrays;

/** Represents an lvalue as expression, e.g., x or x[45] */
public class LValueExpr extends Expression {
	private LValue lvalue;

	public LValueExpr(LValue lvalue) {
		this.lvalue = lvalue;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Collection<AST> children() {
		return Arrays.asList(lvalue);
	}

	public LValue lvalue() {
		return this.lvalue;
	}
}
