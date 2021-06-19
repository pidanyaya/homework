public abstract class AbstractChatroom {
  public abstract void register(Member member);
  public abstract void senText(String from,String to,String message);
  public abstract void senImage(String from,String to,String image);

}
