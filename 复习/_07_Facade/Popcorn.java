public class Popcorn {
  private static Popcorn instance = new Popcorn();

  public static Popcorn getInstance() {
    return instance;
  }

  public void on() {
    System.out.println("爆米花机开启...");
  }

  public void off() {
    System.out.println("爆米花机关闭...");
  }

  public void pop() {
    System.out.println("开始爆米花...");
  }

  public void pause() {
    System.out.println("爆米花机暂停...");
  }

}
