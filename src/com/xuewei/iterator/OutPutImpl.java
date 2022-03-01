package com.xuewei.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    // 学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList){
        this.collegeList = collegeList;
    }

    /**
     * 遍历所有学院,然后调用printDepartment 输出各个学院的系
     */
    public void printCollege(){

        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            // 取出一个学院
            College college = iterator.next();
            System.out.println("=== "+college.getName() +"=====" );
            this.printDepartment(college.createrIterator());
        }
    }

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
