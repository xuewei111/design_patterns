package com.xuewei.factory.factorymethod.pizzastore.order;

import com.xuewei.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.xuewei.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.xuewei.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
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
