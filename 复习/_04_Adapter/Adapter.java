public class Adapter implements NextToUsb{
  private Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void handleRequest() {
    adaptee.request();
  }
}
