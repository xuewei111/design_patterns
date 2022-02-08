package com.xuewei.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Cloneable, Serializable {

    private String name; //String 属性
    private DeepCloneableTarget deepCloneableTarget; //引用类型

    //深拷贝 - 方式 1 使用clone 方法
    @Override
    protected Object clone()  {
        DeepProtoType deepProtoType = null;

        try {
            //这里完成对基本数据类型(属性)和String的克隆
            deepProtoType = (DeepProtoType) super.clone();
            //对引用类型的属性，进行单独处理
            deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepProtoType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    //深拷贝 - 方式2 通过对象的序列化实现 (推荐)
    public DeepProtoType deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出

            // 反序列号
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            DeepProtoType copyObj = (DeepProtoType) ois.readObject();

            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                // TODO: handle exception
                System.out.println(e2.getMessage());
            }
        }
    }
}
