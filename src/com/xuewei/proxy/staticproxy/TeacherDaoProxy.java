package com.xuewei.proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao{
    /**
     * 目标对象,通过接口来聚合
     */
    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao){
        this.iTeacherDao = iTeacherDao;
    }


    @Override
    public void teach() {
        System.out.println("开始代理  完成某些操作。。。。。 ");
        iTeacherDao.teach();
        System.out.println("提交。。。。。");
    }
}
