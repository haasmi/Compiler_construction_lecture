package ast;

import java.util.Collection;
import java.util.Arrays;

/** Represents base[index]  */
public class ArrayAccess extends LValue {
	private LValue base;
	private Expression index;

	public ArrayAccess(LValue base, Expression index) {
		this.base = base;
		this.index = index;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Collection<AST> children() {
		return Arrays.asList(base, index);
	}

	public LValue base() {
		return this.base;
	}

	public Expression index() {
		return this.index;
	}
}
