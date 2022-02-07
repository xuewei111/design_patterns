package com.xuewei.factory.absfactory.pizzastore.order;

import com.xuewei.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory absFactory;

    // 构造器
    public OrderPizza(AbsFactory absFactory){
        this.setFactory(absFactory);
    }

    private void setFactory(AbsFactory absFactory){
        Pizza pizza = null;
        String orderType = ""; //用户输入

        this.absFactory = absFactory;

        do {
            orderType = this.getType();

            pizza = absFactory.createPizza(orderType);
            if(pizza != null){ //订购成功!
                pizza.prepare();
                pizza.Process();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        }while (true);
    }

    // 写一个方法,可以获取到客户希望订购的披萨种类
    private String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza 种类:");

        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
