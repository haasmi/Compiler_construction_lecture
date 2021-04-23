package util;

import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;

public class SymbolTable<T> {
	private Deque<Map<String, T>> symbolTable = new ArrayDeque<>();

	public void enter() {
		symbolTable.addFirst(new HashMap<String, T>());
	}

	public void leave() {
		symbolTable.removeFirst();
	}

	public T insert(String name, T e) {
		Map<String, T> scope = symbolTable.getFirst();
		T previous = scope.put(name, e);
		return previous;
	}

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
