package ast;

/** Represents a variable access, e.g. x */
public class VariableAccess extends LValue {
	private String name;

	public VariableAccess(String name) {
		this.name = name;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public String name() {
		return this.name;
	}
}
