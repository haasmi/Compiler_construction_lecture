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

    public boolean isCompatible(Type rhs) {
        if (rhs instanceof ArrayType) {
            ArrayType rtype = (ArrayType) rhs;
            return this.size == rtype.size && base.isCompatible(rtype.base);
        }
        return false;
    }

    public int size() {
        return size * base.size();
    }
}
