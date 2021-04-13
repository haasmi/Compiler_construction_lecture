package ast;

public class StringType extends Type {
	private static StringType instance = new StringType();
	
	private StringType() {
	}

	public static StringType instance() {
		return instance;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
