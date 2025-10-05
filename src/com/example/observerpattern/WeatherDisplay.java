package com.example.observerpattern;

public class WeatherDisplay implements Observer{
    private float temperature;
    private float humidity;
    @Override
    public void update(float temperature, float humidity) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
    public void display(){
        System.out.println("Current conditions: "+ temperature + " C degrees and "+ humidity+ "% humdidity") ;
    }
}
