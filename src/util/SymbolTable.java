package util;

import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;

class SymbolTable<T> {
	private Deque<Map<String, T>> symbolTable = new ArrayDeque<>();

	public SymbolTable() {
		enter();
	}

	/** Enter a new scope */
	public void enter() {
		symbolTable.addFirst(new HashMap<String, T>());
	}

	/** Leave most recently entered scope */
	public void leave() {
		symbolTable.removeFirst();
	}

	/** Insert an identifier into the most recently entered scope
	 * @return the value associated with the name in the current scope or
	 * null if name is not yet defined.
	 */
	public T insert(String name, T e) {
		Map<String, T> scope = symbolTable.getFirst();
		T previous = scope.put(name, e);
		return previous;
	}

	/** Look up an identifier by traversing the scopes
	 * @return the value associated with the name or null
	 */
	public T lookup(String name) {
		for (Map<String, T> scope : symbolTable) {
			T e = scope.get(name);
			if (e != null) {
				return e;
			}
		}
		return null;
	}
}
