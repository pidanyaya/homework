package Abstract;

public class XiaomiFactory implements IproductFactory{
  @Override
  public IphoneProduct iphoneProduct() {
    return new XiaomiPhone();
  }

  @Override
  public IrouterProduct irouterProduct() {
    return new XiaomiRouter();
  }
}
