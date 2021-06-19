public class DiamondMember extends Member{
  public DiamondMember(String name) {
    super(name);
  }

  @Override
  public void sendText(String to, String message) {
    System.out.println("钻石会员发送信息:");
    abstractChatroom.senText(name,to,message);
  }

  @Override
  public void sendImage(String to, String image) {
    System.out.println("钻石会员发送图片:");
    abstractChatroom.senImage(name,to,image);
  }
}
