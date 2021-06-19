public class CommmonMember extends Member{
  public CommmonMember(String name) {
    super(name);
  }

  @Override
  public void sendText(String to, String message) {
    System.out.println("普通会员发送信息:");
    abstractChatroom.senText(name,to,message);
  }

  @Override
  public void sendImage(String to, String image) {
    System.out.println("普通会员无法发送图片！");
  }
}
