package ast;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

/** Represents a function call function(arg0,arg1, ...) as expression returning a value */
public class CallExpr extends Expression {
	private String name;
	private List<Expression> arguments;

	private Function function;

	public CallExpr(String name, List<Expression> args) {
		this.name = name;
		this.arguments = args;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Collection<AST> children() {
		List<AST> children = new ArrayList<>();
		children.addAll(arguments);
		return children;
	}

	public String name() {
		return this.name;
	}

	public List<Expression> arguments() {
		return arguments;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	public Function function() {
		return this.function;
	}
}
