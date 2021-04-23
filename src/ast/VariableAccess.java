package ast;

import util.Register;

/** Represents a variable access, e.g. x */
public class VariableAccess extends LValue {
    private String name;

    private Variable variable;

    public VariableAccess(String name) {
        this.name = name;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    public String name() {
        return this.name;
    }

    public void setVariable(Variable v) {
        this.variable = v;
    }

    public Variable variable() {
        return this.variable;
    }

    public String accessCode(Register r) {
        return variable.accessCode(r);
    }
}
