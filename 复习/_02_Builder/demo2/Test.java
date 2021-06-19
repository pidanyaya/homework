package demo2;

public class Test {
  public static void main(String[] args) {
//    工作人员
    Worker worker = new Worker();
//    worker.BuilderA("全家桶");
//    链式编程
    Product product = worker.BuilderA("全家桶").BuilderB("雪碧").
        getProduct();
    System.out.println(product.toString());
  }
}
