package com.xuewei.decorator;

public class Chocolate extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");

        /**
         * 调味品 的价格
         */
        setPrice(3.0f);
    }
}
