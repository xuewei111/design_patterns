package com.xuewei.mediator.smarthouse;

public class TV extends Colleague{
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange,this.name);
    }

    public void StartTv(){
        System.out.println("Its time to StartTv");
    }

    public void StopTv(){
        System.out.println("StopTv!");
    }
}
