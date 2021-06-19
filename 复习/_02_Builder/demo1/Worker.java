package demo1;

public class Worker extends Builder{
  private Product product;

  public Worker(){
    product = new Product();
  }

  @Override
  void BuilderA() {
    product.setBuildA("地基");
    System.out.println("铺地基...");
  }

  @Override
  void BuilderB() {
    product.setBuildB("钢筋水泥");
    System.out.println("装钢筋水泥...");
  }

  @Override
  void BuilderC() {
    product.setBuildC("铺电线");
    System.out.println("铺电线...");
  }

  @Override
  void BuilderD() {
    product.setBuildD("粉刷");
    System.out.println("粉刷...");
  }

  @Override
  Product getProduct() {
    return product;
  }
}
