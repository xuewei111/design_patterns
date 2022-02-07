package com.xuewei.factory.factorymethod.pizzastore.pizza;

public class BJPepperPizza extends Pizza{

    @Override
    public void prepare() {
        setName("北京的胡椒披萨");
        System.out.println("北京的胡椒pizza 准备材料!");
    }
}
