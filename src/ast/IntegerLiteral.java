package ast;

/** Represents an integer value, e.g., 42 */
public class IntegerLiteral extends Expression {
	private int value;

	public IntegerLiteral(int value) {
		this.value = value;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public int value() {
		return this.value;
	}
}
