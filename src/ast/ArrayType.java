package ast;

/** Represents [size] type */
public class ArrayType extends BaseArrayType {
	private int size;

	public ArrayType(Type base, int size) {
		super(base);
		this.size = size;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
