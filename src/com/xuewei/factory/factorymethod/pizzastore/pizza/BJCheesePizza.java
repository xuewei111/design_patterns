package com.xuewei.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的奶酪披萨");
        System.out.println("北京的奶酪pizza 准备材料!");
    }
}
