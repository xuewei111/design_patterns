package com.xuewei.iterator;

import java.util.Iterator;

public interface College {

    String getName();

    /**
     * 增加系的方法
     * @param name
     * @param desc
     */
    void addDepartment(String name,String desc);

    /**
     * 返回一个迭代器,遍历
     * @return
     */
    Iterator createrIterator();
}
