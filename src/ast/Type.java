package ast;

public abstract class Type extends AST {
    public boolean isInteger() {
        return false;
    }

    public boolean isNumeric() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public boolean isIndexable() {
        return false;
    }

    public Type valueType() {
        return this;
    }

    public Type elementType() {
        throw new RuntimeException("Internal error: Attempting to access element type of a non-array.");
    }

    public boolean isCompatible(Type rhs) {
        return this == rhs || this.getClass() == rhs.getClass();
    }

    public abstract int size();
}
