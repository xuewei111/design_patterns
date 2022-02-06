package com.xuewei.singleton.type1;

import java.security.Signature;

public class SingletonTest01 {

    public static void main(String[] args) {
        // 测试
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

//饿汉式(静态变量)
class Singleton{


    // 1.构造器私有化,外部能new
    private Singleton (){

    }

    // 2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    // 3.提供一个公有的静态方法,返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
