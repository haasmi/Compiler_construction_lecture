package ast;

import java.util.Collection;
import java.util.Arrays;

/** Represents an if statement */
public class IfStmt extends Statement {
	private Expression cond;
	private Block then;
	private Block elze;

	public IfStmt(Expression cond, Block then, Block elze) {
		this.cond = cond;
		this.then = then;
		this.elze = elze;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Collection<AST> children() {
		return Arrays.asList(cond, then, elze);
	}

	public Expression condition() {
		return this.cond;
	}

	public Block then() {
		return this.then;
	}

	public Block elze() {
		return this.elze;
	}
}
