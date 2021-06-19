public class Client {
  public static void main(String[] args) {
    AbstractChatroom happyChat = new ChatGroup();

    Member member1,member2,member3,member4;
    member1 = new DiamondMember("张宇晖");
    member2 = new DiamondMember("何方");
    member3 = new DiamondMember("严灿");
    member4 = new CommmonMember("刘懿郎");

    happyChat.register(member1);
    happyChat.register(member2);
    happyChat.register(member3);
    happyChat.register(member4);

    member1.sendText("严灿","严灿？沙口!");
    member2.sendText("张宇晖","张宇晖？帅b!");
    member3.sendImage("刘懿郎","大咩");
    member4.sendImage("何方","大咩");
  }
}
