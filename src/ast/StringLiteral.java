package ast;

/** Represents a string value, e.g., "hello world" */
public class StringLiteral extends Expression {
	private String value;

	public StringLiteral(String value) {
		this.value = value;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public String value() {
		return this.value;
	}
}
