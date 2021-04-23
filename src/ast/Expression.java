package ast;

public abstract class Expression extends AST {
    private Type type;

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }
}
