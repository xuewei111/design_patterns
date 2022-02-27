package com.xuewei.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构，管理很多人（Man , Woman）
 * @author mi
 */
public class ObjectStructure {

    /**
     * 维护了一个集合
     */
    private List<Person> personList = new LinkedList<>();

    /**
     * 增加到list
     * @param p
     */
    public void attach(Person p){
        personList.add(p);
    }

    /**
     * 移除
     * @param p
     */
    public void detach(Person p) {
        personList.remove(p);
    }


    public void display(Action action) {
        for (Person person : personList) {
            person.accept(action);
        }
    }

}
