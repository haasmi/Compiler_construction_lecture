package ast;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/** Represents a function definition */
public class Function extends AST {
    private String name;
    private ReturnParameter ret;
    private List<Parameter> parameters;
    private List<LocalVariable> locals = new ArrayList<>();
    private Block body;

    private int frameSize;

    public Function(String name, Type type, List<Parameter> parameters, Block body) {
        this.name = name;
        this.ret = new ReturnParameter(name, type);
        this.parameters = parameters;
        this.body = body;
        this.frameSize = 8;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    public Collection<AST> children() {
        ArrayList<AST> children = new ArrayList<>();
        children.addAll(parameters);
        Collections.addAll(children, ret, body);
        return children;
    }

    public String name() {
        return this.name;
    }

    public List<Parameter> parameters() {
        return this.parameters;
    }

    public ReturnParameter returnParameter() {
        return this.ret;
    }

    public void addLocal(LocalVariable local) {
        locals.add(local);
    }

    public Block body() {
        return this.body;
    }

    public List<Statement> statements() {
        return body.statements();
    }

    public void incrementFrameSize(int size) {
        this.frameSize += size;
    }

    public int frameSize() {
        return this.frameSize;
    }

    public void adjustParameterOffsets() {
        int offset;

        offset = frameSize;
        ret.setOffset(offset);

        for (Parameter p : parameters) {
            offset = frameSize + p.offset();
            p.setOffset(offset);
        }

        for (LocalVariable l : locals) {
            offset = frameSize - 8 - l.offset();
            l.setOffset(offset);
        }
    }
}
