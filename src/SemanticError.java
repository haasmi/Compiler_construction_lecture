class SemanticError extends RuntimeException {
	private int line;

	public SemanticError(String msg) {
		super(msg);
		this.line = -1;
	}
	
	public SemanticError(int line, String msg) {
		super(msg);
		this.line = line;
	}

	public String toString() {
		if (line >= 0) {
			return "Line " + line + ": " + super.toString();
		}
		else {
			return super.toString();
		}
	}
}
