package Abstract;

public class HuaweiRouter implements IrouterProduct{
  @Override
  public void star() {
    System.out.println("开启华为路由器");
  }

  @Override
  public void shutoff() {
    System.out.println("关闭华为路由器");
  }

  @Override
  public void openWifi() {
    System.out.println("打开华为路由器wifi");
  }
}
