package com.xuewei.factory.absfactory.pizzastore.order;

public class PizzStore {

    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
