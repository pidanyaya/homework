public class Decorator extends Drink{
  private Drink drink;

  public Decorator(Drink drink) {
    this.drink = drink;
  }

  @Override
  public String getDes() {
    return super.getDes() + super.getPrice() +"元 && "+ drink.getDes() + drink.getPrice()+"元";
  }

  @Override
  public float cost() {
    return drink.getPrice() + super.getPrice();
  }
}
