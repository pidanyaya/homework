package demo1;

public class Test {
  public static void main(String[] args) {
    Director director = new Director();
    Product product = director.bulid(new Worker());
    System.out.println(product.toString());

  }
}
