package com.xuewei.flyweight;

// 具体的网站
public class ConcreateWebSite extends WebSite{

    /**
     * 共享的部分,内部状态(网站的发布形式,类型)
     */
    private String type = "";

    public ConcreateWebSite (String type){
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }
}
