package com.xuewei.observer;

public class WeatherData {

    // 温度
    private float temperature;

    // 气压
    private float pressure;

    // 湿度
    private float humidity;

    // 维护的通知者
    private CurrentConditions currentConditions;


    public WeatherData(CurrentConditions currentConditions){
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){
        // 调用 接入方的 update
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }

    // 当数据有更新时,就调用 setData
    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        // 调用dataChange, 将最新的信息 推送给 接入方 currentConditions
        this.dataChange();
    }
}
