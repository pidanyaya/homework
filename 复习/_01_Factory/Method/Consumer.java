package Method;

public class Consumer {
  public static void main(String[] args) {
    Car car1 = new DazhongFactory().getCar();
    Car car2 = new WulingFactory().getCar();
    car1.name();
    car2.name();
  }
}
