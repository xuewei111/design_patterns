package com.xuewei.factory.factorymethod.pizzastore.order;

public class PizzaStore {

    public static void main(String[] args) {
        // 创建北京口味的各种Pizza
        new BJOrderPizza();

        // 创建伦敦口味的各种披萨
        new LDOrderPizza();
    }
}
