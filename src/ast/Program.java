package ast;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

/** Represents a complete program */
public class Program extends AST {
	private List<GlobalVariable> globals;
	private List<Function> functions;
	
	public Program(List<GlobalVariable> globals, List<Function> functions) {
		this.globals = globals;
		this.functions = functions;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Collection<AST> children() {
		ArrayList<AST> children = new ArrayList<>();
		children.addAll(globals);
		children.addAll(functions);
		return children;
	}
}
