package com.xuewei.observer;

public class CurrentConditions {


    // 温度
    private float temperature;

    // 气压
    private float pressure;

    // 湿度
    private float humidity;

    public void update(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.display();
    }

    // 提示
    private void display() {
        System.out.println("*** Today mTemperature:" + temperature + "***");
        System.out.println("*** Today pressure:" + pressure + "***");
        System.out.println("*** Today humidity:" + humidity + "***");
    }
}
