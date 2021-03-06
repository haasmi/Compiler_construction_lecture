package ast;

import util.Register;

/** Represents a a declaration of a local variable */
public class LocalVariable extends Variable {
    public LocalVariable(String name, Type type) {
        super(name, type);
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    public String accessCode(Register target) {
        return "addiu "+target.register()+",%fp,"+offset;
    }
}
