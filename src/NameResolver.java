import ast.*;
import util.SymbolTable;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class NameResolver extends BaseVisitor<Void> {
    private Map<String, Function> functions = new HashMap<>();
    private SymbolTable<Variable> symbols = new SymbolTable<>();
    private Function theFunction;

    //~ public Void visit(AddExpr n) {}
    //~ public Void visit(AndExpr n) {}
    //~ public Void visit(ArrayAccess n) {}
    //~ public Void visit(ArrayType n) {}
    //~ public Void visit(Assignment n) {}
    //~ public Void visit(BaseArrayType n) {}

    public Void visit(Block n) {
        symbols.enter();
        visitChildren(n);
        symbols.leave();
        return null;
    }

    public Void visit(CallExpr n) {
        Function function = this.functions.get(n.name());
        if (function == null) {
            throw new SemanticError("Function " + n.name() + " is not defined.");
        }
        n.setFunction(function);
        visitChildren(n);
        return null;
    }

    //~ public Void visit(CallStmt n) {}
    //~ public Void visit(DivExpr n) {}
    //~ public Void visit(DoubleCastExpr n) {}
    //~ public Void visit(DoubleLiteral n) {}
    //~ public Void visit(DoubleType n) {}
    //~ public Void visit(EqExpr n) {}

    public Void visit(Function n) {
        theFunction = n;
        symbols.enter();
        visitChildren(n);
        symbols.leave();
        theFunction = null;
        return null;
    }

    public Void visit(GlobalVariable n) {
        Variable o = symbols.insert(n.name(), n);
        if (o != null) {
            throw new SemanticError("Global variable " + n.name() + " is defined more than once.");
        }
        return null;
    }

    //~ public Void visit(GreaterEqExpr n) {}
    //~ public Void visit(GreaterExpr n) {}
    //~ public Void visit(IfStmt n) {}
    //~ public Void visit(IntegerCastExpr n) {}
    //~ public Void visit(IntegerLiteral n) {}
    //~ public Void visit(IntegerType n) {}
    //~ public Void visit(LessEqExpr n) {}
    //~ public Void visit(LessExpr n) {}

    public Void visit(LocalVariable n) {
        Variable o = symbols.insert(n.name(), n);
        if (o != null) {
            throw new SemanticError("Local variable " + n.name() + " is declared more than once.");
        }
        theFunction.addLocal(n);
        return null;
    }

    //~ public Void visit(LocalVariableDeclaration n) {}
    //~ public Void visit(LValueExpr n) {}
    //~ public Void visit(ModExpr n) {}
    //~ public Void visit(MultExpr n) {}
    //~ public Void visit(NegExpr n) {}
    //~ public Void visit(NotEqExpr n) {}
    //~ public Void visit(NotExpr n) {}
    //~ public Void visit(OrExpr n) {}

    public Void visit(Parameter n) {
        Variable o = symbols.insert(n.name(), n);
        if (o != null) {
            throw new SemanticError("Parameter " + n.name() + " is declared more than once.");
        }
        return null;
    }

    public Void visit(Program n) {
        symbols.enter();

        for (Variable v : n.globals()) {
            v.accept(this);
        }

        for (Function f : n.functions()) {
            Function p = functions.put(f.name(), f);
            if (p != null) {
                throw new SemanticError("Function " + f.name() + " is defined more than once.");
            }
        }

        for (Function f : n.functions()) {
            f.accept(this);
        }

        symbols.leave();
        return null;
    }

    //~ public Void visit(ReferenceType n) {}

    public Void visit(ReturnParameter n) {
        Variable o = symbols.insert(n.name(), n);
        if (o != null) {
            throw new SemanticError("Return parameter name of function " + n.name() + " clashes with a parameter name.");
        }
        return null;
    }

    //~ public Void visit(StrcmpExpr n) {}
    //~ public Void visit(StringLiteral n) {}
    //~ public Void visit(StringType n) {}
    //~ public Void visit(SubExpr n) {}

    public Void visit(VariableAccess n) {
        Variable v = symbols.lookup(n.name());
        if (v == null) {
            throw new SemanticError("Variable " + n.name() + " is not defined.");
        }
        n.setVariable(v);
        return null;
    }

    //~ public Void visit(VoidType n) {}
    //~ public Void visit(WhileStmt n) {}
}
