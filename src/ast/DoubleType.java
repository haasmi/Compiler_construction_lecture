package ast;

public class DoubleType extends Type {
	private static DoubleType instance = new DoubleType();
	
	private DoubleType() {
	}

	public static DoubleType instance() {
		return instance;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
