package com.xuewei.visitor;

public abstract class Person {

    /**
     * 提供一个方法m让访问者可以访问
     * @param action
     */
    public abstract void accept(Action action);
}
