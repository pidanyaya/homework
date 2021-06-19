public class Client {
  public static void main(String[] args) {
    HomeTheaterLight homeTheaterLight = new HomeTheaterLight();
    System.out.println("----------派对准备中------------");
    homeTheaterLight.ready();
    System.out.println("----------派对开始啦------------");
    homeTheaterLight.play();
    System.out.println("----------派对结束了------------");
    homeTheaterLight.end();
  }
}
