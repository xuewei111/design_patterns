package com.xuewei.mediator.smarthouse;

public class ClientTest {

    public static void main(String[] args) {

        // 创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        // 创建Alarm 并加入到 ConcreteMediator 对象中的HashMap
        Alarm alarm = new Alarm(mediator,"alarm");

        // 创建了CoffeeMachine 对象,并 加入到 ConcreteMediator 对象中的HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,"coffeeMachine");

        // 创建了CoffeeMacCurtainshine 对象,并 加入到 ConcreteMediator 对象中的HashMap
        Curtains curtains = new Curtains(mediator,"curtains");

        // 创建了TV 对象,并 加入到 ConcreteMediator 对象中的HashMap
        TV tv = new TV(mediator,"TV");

        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.SendAlarm(1);

    }
}
