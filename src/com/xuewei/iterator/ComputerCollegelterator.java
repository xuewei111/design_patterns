package com.xuewei.iterator;

import java.util.Iterator;

public class ComputerCollegelterator implements Iterator {

    /**
     * 这里我们需要Department,是以怎样的方式存放 => 数组
     */
    Department[] departments;
    // 遍历的位置
    int position = 0;

    public ComputerCollegelterator (Department[] departments){
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        return position < departments.length && departments[position] != null;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }
}
