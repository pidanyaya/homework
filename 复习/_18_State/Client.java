public class Client {
  public static void main(String[] args) {
    ForcumAccount account = new ForcumAccount("章鱼灰");
    account.writeNote(20);
    System.out.println("===============================");
    account.downloadFile(20);
    System.out.println("===============================");
    account.replyNote(100);
    System.out.println("===============================");
    account.writeNote(40);
    System.out.println("===============================");
    account.downloadFile(80);
    System.out.println("===============================");
    account.downloadFile(150);
    System.out.println("===============================");
    account.writeNote(1000);
    System.out.println("===============================");
    account.downloadFile(80);
    System.out.println("===============================");
  }
}
