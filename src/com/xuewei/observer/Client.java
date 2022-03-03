package com.xuewei.observer;

public class Client {
    public static void main(String[] args) {
        // 创建WeatherData 并将 接入方 currentConditions 传递到 WeatherData 中
        WeatherData weatherData = new WeatherData(new CurrentConditions());

        // 更新天气情况
        weatherData.setData(30,150,40);

        System.out.println("---------------------天气情况变化-----------------------");

        // 天气情况变化
        weatherData.setData(40,160,20);
    }
}
