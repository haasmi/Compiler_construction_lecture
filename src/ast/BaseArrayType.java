package ast;

import java.util.Collection;
import java.util.Arrays;

/** Represents [] base_type or [NN] base_type */
public class BaseArrayType extends Type {
	protected Type base;

	public BaseArrayType(Type base) {
		this.base = base;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Collection<AST> children() {
		return Arrays.asList(base);
	}
}
