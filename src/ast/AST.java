package ast;

import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;

public abstract class AST {
	public abstract <T> T accept(Visitor<T> visitor);
	
	public Collection<AST> children() {
		return Collections.emptyList();
	}
}
