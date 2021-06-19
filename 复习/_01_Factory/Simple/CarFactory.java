package Simple;

public class CarFactory {
  public static Car getCar(String car) {
    if (car.equals("五菱")) {
      return new Wuling();
    }else if (car.equals("大众")) {
      return new Dazhong();
    }
    return null;
  }
}
