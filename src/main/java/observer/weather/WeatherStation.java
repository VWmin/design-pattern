package observer.weather;

import lombok.Data;
import lombok.EqualsAndHashCode;
import observer.BaseObservable;

@Data
@EqualsAndHashCode(callSuper = false)
public class WeatherStation extends BaseObservable {

    private Long temperature;

    public void tempChanged(){
        setChanged();
        notifyObservers();
    }

    public void setTemperature(Long temp){
        this.temperature = temp;
        tempChanged();
    }
}
