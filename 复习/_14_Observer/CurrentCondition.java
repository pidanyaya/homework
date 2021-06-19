public class CurrentCondition implements Observer{
  public float temperature;
  public float pressure;
  public float humidity;

  public float getTemperature() {
    return temperature;
  }

  public void setTemperature(float temperature) {
    this.temperature = temperature;
  }

  public float getPressure() {
    return pressure;
  }

  public void setPressure(float pressure) {
    this.pressure = pressure;
  }

  public float getHumidity() {
    return humidity;
  }

  public void setHumidity(float humidity) {
    this.humidity = humidity;
  }

  @Override
  public void update(float temperature, float pressure, float humidity) {
    setTemperature(temperature);
    setPressure(pressure);
    setHumidity(humidity);
    display();
  }

  public void display() {
    System.out.println("=======今天的天气=======");
    System.out.println("天气预报->温度:"+getTemperature());
    System.out.println("天气预报->气压:"+getTemperature());
    System.out.println("天气预报->适度:"+getHumidity());
  }
}
