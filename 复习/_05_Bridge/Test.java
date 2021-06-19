public class Test {
  public static void main(String[] args) {
    Computer desktop = new Desktop(new Apple());
    desktop.info();
    Computer laptop = new Laptop(new Lenovo());
    laptop.info();
  }
}
