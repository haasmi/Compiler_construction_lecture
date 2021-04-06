import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;

class SymbolTable<T> {
	private Deque<Map<String, T>> symbolTable = new ArrayDeque<>();

	public SymbolTable(Map<String, T> globals) {
		symbolTable.addFirst(globals);
	}

	public void enter() {
		symbolTable.addFirst(new HashMap<String, T>());
	}

	public void leave() {
		symbolTable.removeFirst();
	}

	public void insert(String name, T e) throws SemanticError {
		Map<String, T> scope = symbolTable.getFirst();
		T previous = scope.put(name, e);
		if (previous != null) {
			throw new SemanticError(name + " is defined more than once.");
		}
	}

	public T lookup(String name) throws SemanticError {
		for (Map<String, T> scope : symbolTable) {
			T e = scope.get(name);
			if (e != null) {
				return e;
			}
		}
		throw new SemanticError(name + " is not defined.");
	}
}
