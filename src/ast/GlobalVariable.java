package ast;

/** Represents a global variable */
public class GlobalVariable extends Variable {
	public GlobalVariable(String name, Type type) {
		super(name, type);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
