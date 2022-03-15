package com.xuewei.strategy;

public class PekingDuck extends Duck{
    @Override
    public void display() {
        System.out.println("北京鸭");
    }

    //因为北京鸭不能飞翔,重写fly

    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔");
    }
}
