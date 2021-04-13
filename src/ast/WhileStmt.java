package ast;

import java.util.Collection;
import java.util.Arrays;

/** Represents a while statement */
public class WhileStmt extends Statement {
	private Expression cond;
	private Block body;

	public WhileStmt(Expression cond, Block body) {
		this.cond = cond;
		this.body = body;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Collection<AST> children() {
		return Arrays.asList(cond, body);
	}

	public Expression condition() {
		return this.cond;
	}

	public Block body() {
		return this.body;
	}
}
