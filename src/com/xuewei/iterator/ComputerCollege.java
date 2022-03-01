package com.xuewei.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{

    Department[] departments;
    // 保存当前数组的对象个数
    int numOfDepartmenty = 0;

    public ComputerCollege(){
        departments = new Department[5];
        this.addDepartment("java专业","java专业");
        this.addDepartment("PHP专业","PHP专业");
        this.addDepartment("大数据专业","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[numOfDepartmenty] = department;
        numOfDepartmenty += 1;
    }

    @Override
    public Iterator createrIterator() {
        return new ComputerCollegelterator(departments);
    }
}
