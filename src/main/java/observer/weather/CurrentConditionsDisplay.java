package observer.weather;

import observer.Observer;

public class CurrentConditionsDisplay implements Observer, Display {
    private WeatherStation weatherStation;
    private Long temperature;

    public CurrentConditionsDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    public CurrentConditionsDisplay(){

    }

    @Override
    public void update(Object arg) {
        if(weatherStation == null) return;
        this.temperature = weatherStation.getTemperature();
        display();
    }

    @Override
    public void display() {
        System.out.println("now, the temperature is " + temperature);
    }

    public void register(){
        weatherStation.registerObserver(this);
    }

    public void disregister(){
        weatherStation.removeObserver(this);
    }

}
