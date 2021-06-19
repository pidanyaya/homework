public class Client {
  public static void main(String[] args) {
    University university = new University("长江大学","cjdxyyds！");

    College computerCollege = new College("计算机学院","计算机学院yyds");
    College inforengineeCollege = new College("信息工程学院","信息工程学院yyds");

    computerCollege.add(new Department("软件工程","软件工程yyds！"));
    computerCollege.add(new Department("计算机科学与技术","计算机科学与技术yyds！"));
    computerCollege.add(new Department("网络工程","网络工程yyds！"));

    inforengineeCollege.add(new Department("信息与技术","信息与技术yyds！"));

    university.add(computerCollege);
    university.add(inforengineeCollege);

    university.print();

  }
}
