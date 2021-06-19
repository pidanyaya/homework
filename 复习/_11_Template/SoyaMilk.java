public abstract class SoyaMilk {
  final void make(){
    select();
    addCondiments();
    soak();
    beat();
  }

  public void select() {
    System.out.println("第一步:选择好新鲜的黄豆...");
  }

  public abstract void addCondiments();

  public void soak(){
    System.out.println("第三步:黄豆和配料开始浸泡，需要3小时...");
  }

  public void beat() {
    System.out.println("第四步:将黄豆和配料放入豆浆机中打碎...");
  }
}
