package Method;

public class WulingFactory implements CarFactory{
  @Override
  public Car getCar() {
    return new Wuling();
  }
}
