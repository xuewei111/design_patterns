package com.xuewei.factory.factorymethod.pizzastore.order;

import com.xuewei.factory.factorymethod.pizzastore.pizza.*;

public class LDOrderPizza extends OrderPizza{

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
