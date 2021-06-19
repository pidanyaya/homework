package demo1;

public class Director {
  public Product bulid(Builder builder){
    builder.BuilderA();
    builder.BuilderB();
    builder.BuilderC();
    builder.BuilderD();
    return builder.getProduct();
  }
}
