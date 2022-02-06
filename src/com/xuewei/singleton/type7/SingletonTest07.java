package com.xuewei.singleton.type7;

public class SingletonTest07 {

    public static void main(String[] args) {

    }
}

// 静态内部类完成， 推荐使用
class Singleton {
    private static Singleton singleton;

    //构造器私有化
    private Singleton() {}

    //写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}