package Abstract;

public class XiaomiRouter implements IrouterProduct{
  @Override
  public void star() {
    System.out.println("开启小米路由器");
  }

  @Override
  public void shutoff() {
    System.out.println("关闭小米路由器");
  }

  @Override
  public void openWifi() {
    System.out.println("打开小米路由器wifi");
  }
}
