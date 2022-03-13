package com.xuewei.interpreter;

import java.util.Map;

public abstract class Expression {

    /**
     * a + b - c
     * 解释公式和值, key就是公式(表达式) 参数[a,b,c]，value就是具体值
     * @param integerMap
     * @return
     */
    public abstract int interpreter(Map<String,Integer> integerMap);
}
