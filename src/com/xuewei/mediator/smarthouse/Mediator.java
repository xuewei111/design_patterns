package com.xuewei.mediator.smarthouse;

public abstract class Mediator {

    /**
     * 将给中介者对象,加入到集合中
     * @param colleagueName
     * @param colleague
     */
    public abstract void Register(String colleagueName,Colleague colleague);

    /**
     * 接收消息,具体的同事对象发出
     * @param stateChange
     * @param colleagueName
     */
    public abstract void GetMessage(int stateChange,String colleagueName);

    public abstract void SendMessage();
}
