package Simple;

import Method.DazhongFactory;
import Method.WulingFactory;

public class Consumer {
  public static void main(String[] args) {
    Car car1 = CarFactory.getCar("五菱");
    Car car2 = CarFactory.getCar("大众");
    car1.name();
    car2.name();
  }
}
