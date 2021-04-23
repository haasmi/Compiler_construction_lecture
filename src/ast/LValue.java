package ast;

public abstract class LValue extends AST {
    private Type type;

    public void setType(Type type) {
        this.type = type;
    }

    public Type type() {
        return this.type;
    }
}
