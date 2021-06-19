public class Client {
  public static void main(String[] args) {
    UserInfoDTO user = new UserInfoDTO();
    Caretaker c = new Caretaker();

    user.setAccount("章鱼灰");
    user.setPassword("123456");
    user.setTellNo("12345678");
    System.out.println("状态一:");
    user.show();
    c.setMemento(user.saveMemento());
    System.out.println("==========================");
    user.setPassword("1111111111111");
    user.setTellNo("123789123");
    System.out.println("状态二:");
    user.show();
    System.out.println("===========================");

    user.restoreMemento(c.getMemento());
    System.out.println("回到状态一:");
    user.show();
    System.out.println("============================");
  }
}
