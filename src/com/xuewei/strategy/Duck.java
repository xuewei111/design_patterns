package com.xuewei.strategy;

public abstract class Duck {

    /**
     * 显示鸭子信息
     */
    public abstract void display();

    public void quack(){
        System.out.println("鸭子嘎嘎叫~~");
    }

    public void swin(){
        System.out.println("鸭子会游泳~~");
    }

    public void fly(){
        System.out.println("鸭子会飞翔~~");
    }
}
