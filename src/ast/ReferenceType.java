package ast;

import java.util.Collection;
import java.util.Arrays;

/** Represents the type * base_type */
public class ReferenceType extends Type {
	private Type base;

	public ReferenceType(Type base) {
		this.base = base;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Collection<AST> children() {
		return Arrays.asList(base);
	}
}
