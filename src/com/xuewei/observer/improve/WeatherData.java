package com.xuewei.observer.improve;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temperatrue;

    private float pressure;

    private float humidity;

    /**
     * 观察者集合
     */
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    /**
     * 遍历所有的观察者,并通知
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this.temperatrue,this.pressure,this.humidity);
        }
    }

    /**
     * 当数据更新时,通知接入方
     * @param temperatrue
     * @param pressure
     * @param humidity
     */
    public void setData(float temperatrue,float pressure,float humidity){
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;

        this.notifyObservers();
    }
}
