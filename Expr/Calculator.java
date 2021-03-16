class Calculator extends ExprBaseVisitor<Integer> {
    @Override
    public Integer visitProg(ExprParser.ProgContext ctxt) {
        for (ExprParser.ExprContext c : ctxt.expr()) {
            Integer result = c.accept(this);
            System.out.println("Result = "+result);
        }
        return null;
    }
    
    @Override
    public Integer visitMultExpr(ExprParser.MultExprContext ctxt) {
        return ctxt.expr(0).accept(this) * ctxt.expr(1).accept(this);
    }
    
    @Override
    public Integer visitDivExpr(ExprParser.DivExprContext ctxt) {
        return ctxt.expr(0).accept(this) / ctxt.expr(1).accept(this);
    }
    
    @Override
    public Integer visitAddExpr(ExprParser.AddExprContext ctxt) {
        return ctxt.expr(0).accept(this) + ctxt.expr(1).accept(this);
    }
    
    @Override
    public Integer visitSubExpr(ExprParser.SubExprContext ctxt) {
        return ctxt.expr(0).accept(this) - ctxt.expr(1).accept(this);
    }
    
    @Override
    public Integer visitIntExpr(ExprParser.IntExprContext ctxt) {
        return Integer.valueOf(ctxt.INT().getText());
    }
    
    @Override
    public Integer visitBracketExpr(ExprParser.BracketExprContext ctxt) {
        return ctxt.expr().accept(this);
    }
}
