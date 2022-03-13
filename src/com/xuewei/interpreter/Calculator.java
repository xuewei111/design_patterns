package com.xuewei.interpreter;


import java.util.Map;
import java.util.Stack;

public class Calculator {


    /**
     * 定义表达式
     */
    private Expression expression;

    public Calculator(String expStr){  //expStr = a+ b
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();

        // 表达式拆分承字符数组
        char[] charArray = expStr.toCharArray(); // [a,+,b]

        Expression left = null;
        Expression right = null;

        // 遍历我们的字符数组,即遍历 [a, + ,b]
        // 针对不同的情况,做处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    // 从stach取出left => "a"
                    left = stack.pop();
                    // 取出右表达式 "b"
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    // 然后根据得到的left 和 right 构建 AddExpression 加入到stach
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    // 如果是一个var 就创建要给ValExpression 对象,并push到stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //当遍历完整个 charArray 数组后,stack 就得到最后Expression
        this.expression = stack.pop();
    }

    public int run (Map<String,Integer> integerMap) {
        // 最后将表达式 a+b 和 var = {a=10,b=20}
        // 然后传递给expression 的 interpreter 进行解释执行
        return this.expression.interpreter(integerMap);
    }


}
