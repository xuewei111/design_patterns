package com.xuewei.composite;

//  叶子节点
public class Department extends OrganizationComponent{

    public Department(String name, String des) {
        super(name, des);
    }

    //add , remove 就不用写了，因为他是叶子节点

    @Override
    protected void print() {
        System.out.println(super.getName());
    }
}
