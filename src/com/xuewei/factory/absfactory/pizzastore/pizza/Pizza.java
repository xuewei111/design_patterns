package com.xuewei.factory.absfactory.pizzastore.pizza;

// 将Pizza 做成接口
public abstract class Pizza {
    protected String name = null; //名字

    // 准备原材料,不同的披萨不一样,因此,我们做成抽象
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking!");
    }

    public void cut (){
        System.out.println(name + "cutting!");
    }

    public void box (){
        System.out.println(name + "boxing!");
    }


    public void Process(){
        this.bake();
        this.cut();
        this.box();
    }

    public void setName(String name){
        this.name = name;
    }
}
