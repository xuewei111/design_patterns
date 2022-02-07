package com.xuewei.factory.absfactory.pizzastore.order;

import com.xuewei.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.xuewei.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.xuewei.factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
