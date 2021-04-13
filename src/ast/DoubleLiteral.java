package ast;

/** Represents a double value, e.g., 3.14 */
public class DoubleLiteral extends Expression {
	private double value;

	public DoubleLiteral(double value) {
		this.value = value;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public double value() {
		return this.value;
	}
}
