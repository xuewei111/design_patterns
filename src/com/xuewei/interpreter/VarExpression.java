package com.xuewei.interpreter;

import java.util.Map;

public class VarExpression extends Expression{
    private String key; // key = a,key = b,key = c

    public VarExpression(String key){
        this.key = key;
    }

    /**
     * integerMap 就是{a=10,b=20}
     * interpreter 根据 变量名称,返回对应值
     * @param integerMap
     * @return
     */
    @Override
    public int interpreter(Map<String, Integer> integerMap) {
        return integerMap.get(this.key);
    }
}
