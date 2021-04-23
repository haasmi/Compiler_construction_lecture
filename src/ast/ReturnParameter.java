package ast;

import util.Register;

public class ReturnParameter extends Variable {
    public ReturnParameter(String name, Type type) {
        super(name, type);
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    public String accessCode(Register target) {
        return "addiu "+target.register()+",%fp,"+offset;
    }
}
