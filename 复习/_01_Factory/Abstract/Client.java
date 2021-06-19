package Abstract;

public class Client {
  public static void main(String[] args) {
    System.out.println("===================华为产品=================");
    HuaweiFactory huaweiFactory = new HuaweiFactory();
    IphoneProduct huaweiPhone= huaweiFactory.iphoneProduct();
    huaweiPhone.star();
    huaweiPhone.callup();
    huaweiPhone.sendSMS();
    System.out.println("===================小米产品=================");
    XiaomiFactory xiaomiFactory = new XiaomiFactory();
    IphoneProduct xiaomiPhone = xiaomiFactory.iphoneProduct();
    IrouterProduct xiaomiRouter = xiaomiFactory.irouterProduct();
    xiaomiPhone.star();
    xiaomiRouter.star();
  }
}
