public class TheaterLight {
  private static TheaterLight instance = new TheaterLight();

  public static TheaterLight getInstance() {
    return instance;
  }

  public void on() {
    System.out.println("灯光开启...");
  }

  public void off() {
    System.out.println("灯光关闭...");
  }
}
