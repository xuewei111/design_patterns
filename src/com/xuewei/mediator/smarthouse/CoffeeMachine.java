package com.xuewei.mediator.smarthouse;

public class CoffeeMachine extends Colleague{

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange,this.name);
    }

    public void StartCoffee(){
        System.out.println("Its time to startcoffee");
    }

    public void FinishCoffee(){
        System.out.println("After 5 minutes");
        System.out.println("Coffee is ok");
        this.SendMessage(0);
    }
}
