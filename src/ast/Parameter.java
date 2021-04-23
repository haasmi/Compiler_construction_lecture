package ast;

import util.Register;

/** Represents a parameter in a function definition */
public class Parameter extends Variable {
    public Parameter(String name, Type type) {
        super(name, type);
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    public String accessCode(Register target) {
        return "addiu "+target.register()+",%fp,"+offset;
    }
}
