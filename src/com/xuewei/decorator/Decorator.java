package com.xuewei.decorator;

public class Decorator extends Drink{
    private Drink obj;

    public Decorator (Drink obj){
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice 自己的价格
        return super.getPrice() + obj.getPrice();
    }

    @Override
    public String getDes() {
        return des + " " + getPrice() + " && " + obj.getDes();
    }
}
