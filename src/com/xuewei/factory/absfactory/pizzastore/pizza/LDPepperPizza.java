package com.xuewei.factory.absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的胡椒披萨");
        System.out.println("伦敦的胡椒pizza 准备材料!");
    }
}
