package com.xuewei.factory.factorymethod.pizzastore.order;

import com.xuewei.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    // 定义一个抽象的方法,createPizza,让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    // 构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType; //订购披萨的类型
        do {
            orderType = this.getType();
            pizza = this.createPizza(orderType);
            // 输出pizza
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
