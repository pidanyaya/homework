public class Saler extends Visitor{
  @Override
  public void visit(Apple apple) {
    System.out.println("收营员"+name+"给苹果过秤，然后计算其价格。");
  }

  @Override
  public void visit(Book book) {
    System.out.println("收营员"+name+"计算书的价格。");
  }
}
