package com.xuewei.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new CurrentConditions());

        weatherData.setData(30,150,40);

        System.out.println("---------------------天气情况变化-----------------------");
        weatherData.setData(40,160,20);
    }
}
