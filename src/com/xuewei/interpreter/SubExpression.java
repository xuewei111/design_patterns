package com.xuewei.interpreter;

import java.util.Map;

public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 相减
     * @param integerMap
     * @return
     */
    @Override
    public int interpreter(Map<String, Integer> integerMap) {
        return super.left.interpreter(integerMap) - super.right.interpreter(integerMap);
    }
}
