public class UserInfoDTO {
  private String account;
  private String password;
  private String tellNo;

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getTellNo() {
    return tellNo;
  }

  public void setTellNo(String tellNo) {
    this.tellNo = tellNo;
  }

  public Memento saveMemento() {
    return new Memento(account,password,tellNo);
  }

  public void restoreMemento(Memento memento) {
    this.account = memento.getAccount();
    this.password = memento.getPassword();
    this.tellNo = memento.getTelNo();
  }

  public void show() {
    System.out.println("Account:"+this.account);
    System.out.println("Password:"+this.password);
    System.out.println("TelNo:"+this.tellNo);
  }
}
