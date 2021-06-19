package Abstract;

public class HuaweiFactory implements IproductFactory{
  @Override
  public IphoneProduct iphoneProduct() {
    return new HuaweiPhone();
  }

  @Override
  public IrouterProduct irouterProduct() {
    return new HuaweiRouter();
  }
}
