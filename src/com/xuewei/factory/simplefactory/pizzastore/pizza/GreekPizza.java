package com.xuewei.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备材料!");
    }
}
