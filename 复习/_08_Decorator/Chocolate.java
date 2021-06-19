public class Chocolate extends Decorator{

  public Chocolate(Drink drink) {
    super(drink);
    setDes("巧克力");
    setPrice(0.5f);
  }
}
