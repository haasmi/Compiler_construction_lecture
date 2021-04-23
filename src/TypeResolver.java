import ast.*;

import java.util.Iterator;

public class TypeResolver extends BaseVisitor<Type> {

    private Type visitNumericExpr(NumericExpression e) {
        Type ltype = e.left().accept(this);
        Type rtype = e.right().accept(this);
        if (!ltype.isNumeric() || !rtype.isNumeric() || !ltype.isCompatible(rtype)) {
            throw new SemanticError("Type mismatch");
        }
        e.setType(ltype);
        return e.getType();
    }

    private Type visitCompExpr(CompExpression e) {
        Type ltype = e.left().accept(this);
        Type rtype = e.right().accept(this);
        if (!ltype.isNumeric() || !rtype.isNumeric() || !ltype.isCompatible(rtype)) {
            throw new SemanticError("Type mismatch");
        }
        e.setType(IntegerType.instance());
        return e.getType();
    }

    private Type visitLogicalExpr(LogicalExpression e) {
        Type ltype = e.left().accept(this);
        Type rtype = e.right().accept(this);
        if (!ltype.isInteger() || !rtype.isInteger()) {
            throw new SemanticError("Type mismatch");
        }
        e.setType(IntegerType.instance());
        return e.getType();
    }

    public Type visit(AddExpr n) {
        return visitNumericExpr(n);
    }

    public Type visit(AndExpr n) {
        return visitLogicalExpr(n);
    }

    public Type visit(ArrayAccess n) {
        Type baseType = n.base().accept(this);
        if (!baseType.isIndexable()) {
            throw new SemanticError("Attempting to index a non-array.");
        }

        Type indexType = n.index().accept(this);
        if (!indexType.isInteger()) {
            throw new SemanticError("Array must be indexed with integer value.");
        }

        Type type = baseType.elementType();
        return type;
    }

    //~ public Type visit(ArrayType n) {}

    public Type visit(Assignment n) {
        Type ltype = n.lhs().accept(this);
        Type rtype = n.rhs().accept(this);
        if (!ltype.isCompatible(rtype)) {
            throw new SemanticError("Incompatible types in assignment.");
        }
        return null;
    }

    //~ public Type visit(BaseArrayType n) {}
    //~ public Type visit(Block n) {}

    public Type visit(CallExpr n) {
        Function f = n.function();
        if (f.parameters().size() != n.arguments().size()) {
            throw new SemanticError("Function " + f.name() + " is called with wrong number or arguments.");
        }

        Iterator<Parameter> pit = f.parameters().iterator();
        Iterator<Expression> ait = n.arguments().iterator();
        while (pit.hasNext() && ait.hasNext()) {
            Parameter p = pit.next();
            Expression a = ait.next();
            Type atype = a.accept(this);
            if (!p.type().isCompatible(atype)) {
                throw new SemanticError("Type mismatch.");
            }
        }
        n.setType(f.returnParameter().type());
        return n.getType();
    }

    //~ public Type visit(CallStmt n) {}

    public Type visit(DivExpr n) {
        return visitNumericExpr(n);
    }

    public Type visit(DoubleCastExpr n) {
        Type t = n.expression().accept(this);
        if (!t.isNumeric()) {
            throw new SemanticError("Cast of non-numeric value.");
        }
        n.setType(DoubleType.instance());
        return n.getType();
    }

    public Type visit(DoubleLiteral n) {
        n.setType(DoubleType.instance());
        return n.getType();
    }

    //~ public Type visit(DoubleType n) {}

    public Type visit(EqExpr n) {
        return visitCompExpr(n);
    }

    //~ public Type visit(Function n) {}
    //~ public Type visit(GlobalVariable n) {}

    public Type visit(GreaterEqExpr n) {
        return visitNumericExpr(n);
    }

    public Type visit(GreaterExpr n) {
        return visitCompExpr(n);
    }

    //~ public Type visit(IfStmt n) {}

    public Type visit(IntegerCastExpr n) {
        Type t = n.expression().accept(this);
        if (!t.isNumeric()) {
            throw new SemanticError("Cast of non-numeric value.");
        }
        n.setType(IntegerType.instance());
        return n.getType();
    }

    public Type visit(IntegerLiteral n) {
        n.setType(IntegerType.instance());
        return n.getType();
    }

    //~ public Type visit(IntegerType n) {}

    public Type visit(LessEqExpr n) {
        return visitCompExpr(n);
    }

    public Type visit(LessExpr n) {
        return visitCompExpr(n);
    }

    //~ public Type visit(LocalVariable n) {}
    //~ public Type visit(LocalVariableDeclaration n) {}

    public Type visit(LValueExpr n) {
        n.setType(n.lvalue().accept(this));
        return n.getType();
    }

    public Type visit(ModExpr n) {
        return visitNumericExpr(n);
    }

    public Type visit(MultExpr n) {
        return visitNumericExpr(n);
    }

    public Type visit(NegExpr n) {
        Type t = n.expression().accept(this);
        if (!t.isNumeric()) {
            throw new SemanticError("Type mismatch");
        }
        n.setType(t);
        return n.getType();
    }

    public Type visit(NotEqExpr n) {
        return visitCompExpr(n);
    }

    public Type visit(NotExpr n) {
        Type t = n.expression().accept(this);
        if (!t.isInteger()) {
            throw new SemanticError("Type mismatch");
        }
        n.setType(IntegerType.instance());
        return n.getType();
    }

    public Type visit(OrExpr n) {
        return visitLogicalExpr(n);
    }

    //~ public Type visit(Parameter n) {}
    //~ public Type visit(Program n) {}
    //~ public Type visit(ReferenceType n) {}
    //~ public Type visit(ReturnParameter n) {}

    public Type visit(StrcmpExpr n) {
        Type l = n.left().accept(this);
        Type r = n.right().accept(this);
        if (!l.isString() || ! r.isString()) {
            throw new SemanticError("Type mismatch.");
        }
        n.setType(IntegerType.instance());
        return n.getType();
    }

    public Type visit(StringLiteral n) {
        n.setType(StringType.instance());
        return n.getType();
    }

    //~ public Type visit(StringType n) {}

    public Type visit(SubExpr n) {
        return visitNumericExpr(n);
    }

    public Type visit(VariableAccess n) {
        Type t = n.variable().type().valueType();
        return t;
    }

    //~ public Type visit(VoidType n) {}
    //~ public Type visit(WhileStmt n) {}
}
