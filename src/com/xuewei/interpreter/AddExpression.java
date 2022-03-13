package com.xuewei.interpreter;

import java.util.Map;

/**
 * 加分解释器
 */
public class AddExpression extends SymbolExpression {


    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }


    /**
     * 处理相加
     * integerMap 仍然是 {a=10, b=20}
     * @param integerMap
     * @return
     */
    @Override
    public int interpreter(Map<String, Integer> integerMap) {
        return super.left.interpreter(integerMap) + super.right.interpreter(integerMap);
    }
}
