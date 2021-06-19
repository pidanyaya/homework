public class Citation implements Cloneable{
  private String name;
  private String info;
  private String college;


  public Citation(String name, String info, String college) {
    this.name = name;
    this.info = info;
    this.college = college;
    System.out.println("奖状创建成功！");
  }

  public void display() {
    System.out.println(name + info + college);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Citation clone () throws CloneNotSupportedException {
    System.out.println("奖状克隆成功！");
    return (Citation) super.clone();
  }

}
