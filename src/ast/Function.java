package ast;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/** Represents a function definition */
public class Function extends AST {
	private String name;
	private Type type;
	private List<Parameter> parameters;
	private Block body;

	public Function(String name, Type type, List<Parameter> parameters, Block body) {
		this.name = name;
		this.type = type;
		this.parameters = parameters;
		this.body = body;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
	
	public Collection<AST> children() {
		ArrayList<AST> children = new ArrayList<>();
		children.addAll(parameters);
		Collections.addAll(children, type, body);
		return children;
	}
	
	public String name() {
		return this.name;
	}
}
