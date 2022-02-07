package com.xuewei.factory.absfactory.pizzastore.order;

import com.xuewei.factory.absfactory.pizzastore.pizza.*;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
