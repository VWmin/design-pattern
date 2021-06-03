package observer.weather;

public class Test {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Display current = new CurrentConditionsDisplay(station);
        station.setTemperature(13L);
        current.display();
    }
}




