import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom{
  private Hashtable members = new Hashtable();
  @Override
  public void register(Member member) {
    if (!members.contains(member)) {
      members.put(member.getName(),member);
      member.setAbstractChatroom(this);
    }
  }

  @Override
  public void senText(String from, String to, String message) {
    Member member = (Member) members.get(to);
    String newMessage = message;
    newMessage = message.replace("日","*");
    member.receiveText(from,newMessage);
  }

  @Override
  public void senImage(String from, String to, String image) {
    Member member = (Member) members.get(to);
    if (image.length()>5) {
      System.out.println("图片太大无法发送！");
    }
    else {
      member.receiveImage(from,image);
    }
  }
}
