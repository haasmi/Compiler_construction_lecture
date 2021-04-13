package ast;

public class IntegerType extends Type {
	private static IntegerType instance = new IntegerType();
	
	private IntegerType() {
	}

	public static IntegerType instance() {
		return instance;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
