public class CoffeeBar {
  public static void main(String[] args) {
    Drink oder = new Espressor();
    System.out.println("订单1的费用:"+oder.cost());
    System.out.println("订单1的描述:"+oder.getDes());
    oder = new Milk(oder);
    System.out.println("订单1+牛奶的费用:"+oder.cost());
    System.out.println("订单1+牛奶的描述:"+oder.getDes());
  }
}
