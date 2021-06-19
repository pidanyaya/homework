package Abstract;

public class XiaomiPhone implements IphoneProduct{
  @Override
  public void star() {
    System.out.println("开启小米手机");
  }

  @Override
  public void shutoff() {
    System.out.println("关闭小米手机");
  }

  @Override
  public void callup() {
    System.out.println("小米手机打电话");
  }

  @Override
  public void sendSMS() {
    System.out.println("小米手机发信息");
  }
}
