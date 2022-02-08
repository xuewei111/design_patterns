package com.xuewei.prototype.deepclone;

public class Client {

    public static void main(String[] args) {
        DeepProtoType p = new DeepProtoType();
        p.setName("宋江");
        p.setDeepCloneableTarget(new DeepCloneableTarget("大B", "二B"));

        //方式1 完成深拷贝

//		DeepProtoType p2 = (DeepProtoType) p.clone();
//
//		System.out.println("p.name=" + p.getName() + "p.deepCloneableTarget=" + p.getDeepCloneableTarget().hashCode());
//		System.out.println("p2.name=" + p.getName() + "p2.deepCloneableTarget=" + p2.getDeepCloneableTarget().hashCode());

        //方式2 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();

        System.out.println("p.name=" + p.getName() + "p.deepCloneableTarget=" + p.getDeepCloneableTarget().hashCode());
        System.out.println("p2.name=" + p.getName() + "p2.deepCloneableTarget=" + p2.getDeepCloneableTarget().hashCode());
    }
}
