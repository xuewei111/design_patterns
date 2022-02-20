package com.xuewei.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 网站工厂类,根据需要返回一个网站
 */
public class WebSiteFactory {

    private Map<String,WebSite> pool = new HashMap<>();

    /**
     * 根据网站的类型,返回一个网站,如果没有则创建一个网站,并放入到池中,并返回
     * @param type
     * @return
     */
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreateWebSite(type));
        }

        return pool.get(type);
    }

    /**
     * 获取网站分类的总数 (池中有多少个网站类型)
     * @return
     */
    public int getWebSiteCount(){
        return pool.size();
    }
}
