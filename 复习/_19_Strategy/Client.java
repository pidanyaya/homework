public class Client {
  public static void main(String[] args) {
    int arr[] = {1,4,6,2,5,3,7,10,9};
    int result[];
    ArrayHandler arrayHandler = new ArrayHandler();
    Sort sort;
    sort = new BubbleSort();

    arrayHandler.setSortObj(sort);
    result = arrayHandler.sort(arr);
    for (int i = 0;i<result.length;i++) {
      System.out.println(result[i] + ",");
    }
  }
}
