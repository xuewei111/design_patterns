package com.xuewei.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author mi
 */
public class InfoColleageIterator implements Iterator {

    /**
     * 信息工程学院是以List方式存放系
     */
    List<Department> departmentList;
    // 索引
    int index = -1;

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }


    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() -1){
            return false;
        }
        index += 1;
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
