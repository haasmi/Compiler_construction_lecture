package ast;

import java.util.Collection;
import java.util.Arrays;

/** Represents a local variable declaration as a statement */
public class LocalVariableDeclaration extends Statement {
	private LocalVariable local;
	
	public LocalVariableDeclaration(LocalVariable local) {
		this.local = local;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Collection<AST> children() {
		return Arrays.asList(local);
	}

	public LocalVariable variable() {
		return this.local;
	}
}
