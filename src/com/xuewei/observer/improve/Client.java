package com.xuewei.observer.improve;

public class Client {

    public static void main(String[] args) {

        // 创建一个WeatherData(观察者)
        WeatherData weatherData= new WeatherData();

        // 接入方(通知)
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();


        // 注册大屏weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        // 测试
        System.out.println("通知各个注册的接入方");
        weatherData.setData(10f,100f,30.3f);


        weatherData.removeObserver(currentConditions);
        System.out.println("通知各个注册的接入方");
        weatherData.setData(10f,100f,30.3f);
    }
}
