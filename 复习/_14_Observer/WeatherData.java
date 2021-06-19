import java.util.ArrayList;

public class WeatherData extends Subject{
  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void notifyObservers() {
    for (int i = 0;i < observers.size();i++) {
      observers.get(i).update(temperature,pressure,humidity);
    }
  }

  public void setData(float temperature,float pressure,float humidity) {
    this.temperature = temperature;
    this.pressure = pressure;
    this.humidity = humidity;
    notifyObservers();
  }
}
