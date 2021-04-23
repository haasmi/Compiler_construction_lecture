package ast;

import util.Register;

/** Represents a global variable */
public class GlobalVariable extends Variable {
    public GlobalVariable(String name, Type type) {
        super(name, type);
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    public String accessCode(Register target) {
        return "ldi "+target.register()+","+offset;
    }
}
