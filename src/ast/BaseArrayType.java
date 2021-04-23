package ast;

import java.util.Collection;
import java.util.Arrays;

/** Represents [] base_type or [NN] base_type */
public class BaseArrayType extends Type {
    protected Type base;

    public BaseArrayType(Type base) {
        this.base = base;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    public Collection<AST> children() {
        return Arrays.asList(base);
    }

    public Type elementType() {
        return base;
    }

    public boolean isIndexable() {
        return true;
    }

    public boolean isCompatible(Type rhs) {
        if (rhs instanceof BaseArrayType) {
            BaseArrayType r = (BaseArrayType) rhs;
            return base.isCompatible(r.base);
        }
        return false;
    }

    public int size() {
        throw new RuntimeException("Internal error - cannot calculate size of unsized array");
    }
}
