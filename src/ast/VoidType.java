package ast;

/** Type of a function without a return type */
public class VoidType extends Type {
	private static VoidType instance = new VoidType();
	
	private VoidType() {
	}

	public static VoidType instance() {
		return instance;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
