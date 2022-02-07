package com.xuewei.factory.simplefactory.pizzastore.order;

public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }

}
