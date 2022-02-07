package com.xuewei.factory.simplefactory.pizzastore.order;

import com.xuewei.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    // 定义一个简单工厂对象
    private SimpleFactory simpleFactory;

    private Pizza pizza = null;

    // 构造器
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";//用户输入的

        this.simpleFactory = simpleFactory;// 设置简单工厂对象

        do {
            orderType = this.getType();
            pizza = this.simpleFactory.createPizza(orderType);

            // 输出pizza
            if(pizza != null){ //订购成功!
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
