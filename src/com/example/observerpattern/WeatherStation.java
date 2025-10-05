package com.example.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;

    public WeatherStation(){
        this.observers=new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(temperature, humidity);
        }
    }
    public void setMeasurements(float temperature, float humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        notifyObservers();
    }
}
