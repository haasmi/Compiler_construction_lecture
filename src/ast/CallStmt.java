package ast;

import java.util.Collection;
import java.util.Arrays;

/** Represents a function call as statement, i.e. without a value */
public class CallStmt extends Statement {
	private CallExpr call;

	public CallStmt(CallExpr call) {
		this.call = call;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Collection<AST> children() {
		return Arrays.asList(call);
	}

	public CallExpr call() {
		return this.call;
	}
}
