package com.xuewei.composite;

public abstract class OrganizationComponent {

    /**
     * 名字
     */
    private String name;

    /**
     * 说明
     */
    private String des;

    protected void add(OrganizationComponent organizationComponent){

        // 默认实现
        throw new UnsupportedOperationException();
    }


    protected void remove(OrganizationComponent organizationComponent){
        // 默认实现

        throw new UnsupportedOperationException();
    }

    public OrganizationComponent (String name,String des){
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    /**
     * 方法print,做成抽象类,子类都需要实现
     */
    protected abstract void print();
}
