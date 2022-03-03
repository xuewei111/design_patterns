package com.xuewei.observer.improve;

public class BaiduSite implements Observer{

    // 温度,气压,湿度
    private float temperature;
    private float pressure;
    private float humidity;
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        this.display();
    }

    private void display() {
        System.out.println("百度");
        System.out.println("*** 百度Today mTemperature:" + temperature + "***");
        System.out.println("*** 百度Today pressure:" + pressure + "***");
        System.out.println("*** 百度Today humidity:" + humidity + "***");

    }
}
