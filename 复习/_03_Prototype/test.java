public class test {
  public static void main(String[] args) throws CloneNotSupportedException {
    Citation c1 = new Citation("小明","同学：在2016学年第一学期中表现优秀，被评为三好学生。","长江大学");
    c1.display();
    Citation c2 = c1.clone();
    c2.setName("小红");
    c2.display();

  }
}
