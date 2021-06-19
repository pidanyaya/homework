public class Client {
  public static void main(String[] args) {
    Observer currentCondition = new CurrentCondition();
    Observer baiduSite = new BaiduSite();
    WeatherData weatherData = new WeatherData();
    weatherData.registerObserver(currentCondition);
    weatherData.registerObserver(baiduSite);
//    通知所有观察者
    weatherData.setData(20f,10f,10.5f);
  }
}
