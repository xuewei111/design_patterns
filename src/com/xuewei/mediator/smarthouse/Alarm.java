package com.xuewei.mediator.smarthouse;

public class Alarm extends Colleague{


    public Alarm(Mediator mediator,String name){
        super(mediator,name);
        // 在创建Alarm 同事对象时,将自己放入到ConcreteMediator 对象集合中
        mediator.Register(name,this);
    }

    public void SendAlarm(int stateChange){
        this.SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        // 调用的中介者对象的getMessage
        this.getMediator().GetMessage(stateChange,this.name);
    }
}
