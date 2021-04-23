package ast;

import java.util.Collection;
import java.util.Arrays;

/** Represents the type * base_type */
public class ReferenceType extends Type {
    private Type base;

    public ReferenceType(Type base) {
        this.base = base;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    public Collection<AST> children() {
        return Arrays.asList(base);
    }

    public boolean isInteger() {
        return valueType().isInteger();
    }

    public boolean isNumeric() {
        return valueType().isNumeric();
    }

    public boolean isString() {
        return valueType().isString();
    }

    public boolean isIndexable() {
        return base.isIndexable();
    }

    public Type valueType() {
        return base;
    }

    public Type elementType() {
        return base.elementType();
    }

    public boolean isCompatible(Type rhs) {
        return valueType().isCompatible(rhs);
    }

    public int size() {
        return 4;
    }
}
