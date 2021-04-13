package ast;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/** Represents {...} */
public class Block extends AST implements Iterable<Statement> {
	private List<Statement> statements;

	public Block() {
		this.statements = Collections.emptyList();
	}

	public Block(List<Statement> statements) {
		this.statements = statements;
	}

	public Collection<AST> children() {
		List<AST> children = new ArrayList<>();
		children.addAll(statements);
		return children;
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Iterator<Statement> iterator() {
		return statements.iterator();
	}
}
