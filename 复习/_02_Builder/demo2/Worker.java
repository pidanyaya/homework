package demo2;

public class Worker extends Builder{
  private Product product;
  public Worker() {
    this.product = new Product();
  }
  @Override
  Builder BuilderA(String msg) {
    product.setBuilderA(msg);
    return this;
  }

  @Override
  Builder BuilderB(String msg) {
    product.setBuilderB(msg);
    return this;
  }

  @Override
  Builder BuilderC(String msg) {
    product.setBuilderC(msg);
    return this;
  }

  @Override
  Builder BuilderD(String msg) {
    product.setBuilderD(msg);
    return this;
  }

  @Override
  Product getProduct() {
    return product;
  }
}
