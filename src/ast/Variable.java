package ast;

import java.util.Collection;
import java.util.Arrays;
import util.Register;

/** Base class for variable declarations (global, local, parameter, return value) */
public abstract class Variable extends AST {
    private String name;
    private Type type;

    public Variable(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Collection<AST> children() {
        return Arrays.asList(type);
    }

    public String name() {
        return this.name;
    }

    public Type type() {
        return this.type;
    }

    protected int offset;

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int offset() {
        return this.offset;
    }

    public abstract String accessCode(Register target);
}
